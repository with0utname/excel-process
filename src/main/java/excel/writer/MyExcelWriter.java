package excel.writer;

import com.alibaba.excel.EasyExcel;
import utils.GenericsUtils;

import java.util.List;

/**
 * @Author tututyl
 * @Date 2021-12-17
 */
public class MyExcelWriter {

    public static <T> void write(Class T, List<T> obj, String path) {
        String fileName = path + System.currentTimeMillis() + ".xlsx";
        // 这里直接写多个table的案例了，如果只有一个 也可以直一行代码搞定，参照其他案例
        // 这里 需要指定写用哪个class去写
//        ExcelWriter excelWriter = EasyExcel.write(fileName, DemoData.class).build();
        // 把sheet设置为不需要头 不然会输出sheet的头 这样看起来第一个table 就有2个头了
//        WriteSheet writeSheet = EasyExcel.writerSheet("模板").needHead(Boolean.FALSE).build();
        // 这里必须指定需要头，table 会继承sheet的配置，sheet配置了不需要，table 默认也是不需要
//        for (int i = 0; i < obj.size(); i++) {
//            WriteTable writeTable0 = EasyExcel.writerTable(i).needHead(Boolean.TRUE).build();
        EasyExcel.write(fileName, T).sheet().doWrite(obj);
//        }
        // 千万别忘记finish 会帮忙关闭流
//        excelWriter.finish();
    }
}
