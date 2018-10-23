package hello.bike.cn.Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Lambert
 * @Date: 2018/10/23 下午10:16
 * @Description: 时间差计算
 */
public class TimeDifference {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        /**
         * 时间格式
         */
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        /**
         * 定义时间
         */
        Date d1 = ft.parse("2018-10-24 13:31:40");
        System.out.println("当前时间时间戳为：" + date.getTime());
        /**
         * 计算相差时间-当前时间=相差时间
         */
        long diff = d1.getTime() - date.getTime();

        long days = diff / (1000 * 60 * 60 * 24);
//        System.out.println(days);
        long hours = (diff - days * (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long minutes = (diff - days * (1000 * 60 * 60 * 24) - hours * (1000 * 60 * 60)) / (1000 * 60);
        System.out.println("" + days + "天" + hours + "小时" + minutes + "分");
    }
}
