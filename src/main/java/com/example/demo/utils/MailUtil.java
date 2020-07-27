package com.example.demo.utils;



import com.example.demo.model.SendBiMailUserEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName MailUtil
 * @Author 夏俭琼
 * @Date 2020/7/20 16:13
 **/
@Component
public class MailUtil {

    public  StringBuilder getTableStart(String head[]) {

        StringBuilder table = new StringBuilder();
        table.append("    <html>");
        table.append("     <head>");
        table.append("     <meta charset=\"utf-8\">");
        table.append("      <title> 物料调拨邮件: </title>");
        table.append("     </head>");
        table.append("    ");
        table.append("     <body>");
        table.append("    <table  width=\"400\" border=\"1\">  ");
        table.append("       <tr>  ");
        for (int i = 0; i < head.length; i++) {
            table.append("          <th>" + head[i] + "</th>  ");
        }
        table.append("       </tr>  ");
        return table;
    }


    public  StringBuilder getTableEnd(StringBuilder table) {
        table.append("    </table> ");
        table.append("     </body>");
        table.append("    </html>");
        return table;

    }

//    public  void main(String[] args) {
//        List<SendBiMailUserEntity> mailList = new ArrayList<>(5);
//        String head[] = {"物料名称", "码洋","调出仓位","调入仓位","调拨数量"};
//        SendBiMailUserEntity employee = new SendBiMailUserEntity();
//        employee.setMaterialname("00.003.0045");
//        employee.setDbfqty("43");
//        employee.setDrstockloc("99");
//        employee.setFixedprice("43.45");
//        employee.setDcstockloc("100;230B84");
//        mailList.add(employee);
//        employee.setMaterialname("00.003.0456");
//        employee.setDbfqty("45");
//        employee.setDrstockloc("99");
//        employee.setFixedprice("69.45");
//        employee.setDcstockloc("234A008");
//        employee.setDbfqty("12233");
//        mailList.add(employee);
//if (mailList!=null){
//    StringBuilder tableStart = MailUtil.getTableStart(head);
//    for (int i = 0; i < mailList.size(); i++) {
//        String tr = "<tr class=\"odd\">";
//        if (i % 2 == 1) {
//            tr = "<tr class=\"even\">";
//        }
//        tableStart.append("     " + tr + "    ");
//        tableStart.append("         <td>" + mailList.get(i).getMaterialname()+ "</td>  ");
//        tableStart.append("         <td>" + mailList.get(i).getFixedprice() + "</td>  ");
//        tableStart.append("         <td>" + mailList.get(i).getDcstockloc() + "</td>  ");
//        tableStart.append("         <td>" + mailList.get(i).getDrstockloc() + "</td>  ");
//        tableStart.append("         <td>" + mailList.get(i).getDbfqty() + "</td>  ");
//        tableStart.append("       </tr>  ");
//    }
//    StringBuilder table = MailUtil.getTableEnd(tableStart);
//    String html = table.toString();
//    System.out.println(html);
//}

//    }

}

