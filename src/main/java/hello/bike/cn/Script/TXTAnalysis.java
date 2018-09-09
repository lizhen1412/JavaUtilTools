package hello.bike.cn.Script;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: JavaUtilTools
 * @description:
 * @author: Mr.LI
 * @create: 2018-09-09 23:07
 **/

public class TXTAnalysis {
    public static void main(String[] args) throws IOException {
        try {
        //定义文件路径
        File file = new File("/workspace/ptest/param/userinfo_160w_5wPerTable.txt");
        //创建了一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联
        BufferedReader bf = new BufferedReader(new FileReader(file));
        String str;
        //遍历数组
        List<String> lists = new ArrayList<>();
        //将文件循环读取每一行
        while ((str = bf.readLine()) != null) {
            lists.add(str);
        }
        //        将内容随机打乱
        Collections.shuffle(lists);
        //循环遍历打印结果

        File writename = new File("/workspace/ptest/param/test.txt");
        // 相对路径，如果没有则要建立一个新的output。txt文
        writename.createNewFile();
        BufferedWriter out = new BufferedWriter(new FileWriter(writename));

        for (int i = 0; i < lists.size(); i++) {
//            System.out.println(lists.get(i));
            //另一种写法
//        lists.stream().map(s1 -> s1 + "\t").forEach(System.out::println);
            //创建写入文件
            out.write(lists.get(i)+"\n");
        }
        out.flush();
        out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
