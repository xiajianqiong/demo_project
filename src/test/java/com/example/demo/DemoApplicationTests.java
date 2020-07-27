package com.example.demo;

import com.example.demo.model.SendBiMailUserEntity;
import com.example.demo.utils.MailUtil;
import com.example.demo.utils.SendEmailUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private MailUtil mailUtil;
  @Autowired
    private SendEmailUtil sendEmailUtil;

    @Test
    void contextLoads() {
        List<SendBiMailUserEntity> mailList = new ArrayList<>(5);
        String head[] = {"物料名称", "码洋", "调出仓位", "调入仓位", "调拨数量"};
        SendBiMailUserEntity employee = new SendBiMailUserEntity();
        employee.setMaterialname("00.003.0045");
        employee.setDbfqty("43");
        employee.setDrstockloc("99");
        employee.setFixedprice("43.45");
        employee.setDcstockloc("100;230B84");
        mailList.add(employee);
        String str = ""+"。";
        if (mailList != null) {
            StringBuilder tableStart = mailUtil.getTableStart(head);
            for (int i = 0; i < mailList.size(); i++) {
                str = mailList.get(i).getDcstockloc() + ";";
                String tr = "<tr class=\"odd\">";
                if (i % 2 == 1) {
                    tr = "<tr class=\"even\">";
                }
                tableStart.append("     " + tr + "    ");
                tableStart.append("         <td>" + mailList.get(i).getMaterialname() + "</td>  ");
                tableStart.append("         <td>" + mailList.get(i).getFixedprice() + "</td>  ");
                tableStart.append("         <td>" + str + "</td>  ");
                tableStart.append("         <td>" + mailList.get(i).getDrstockloc() + "</td>  ");
                tableStart.append("         <td>" + mailList.get(i).getDbfqty() + "</td>  ");
                tableStart.append("       </tr>  ");
            }
            StringBuilder table = mailUtil.getTableEnd(tableStart);
            String html = table.toString();
            sendEmailUtil.sendMail("2147269047@qq.com",html);
        }
    }
}
