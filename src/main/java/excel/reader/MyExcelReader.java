package excel.reader;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author tututyl
 * @Date 2022-01-19
 */
public class MyExcelReader {
    public static <T> List<T> read(Class T, String... path) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < path.length; i++) {
            // 写法1：JDK8+ ,不用额外写一个DemoDataListener
            // since: 3.0.0-beta1
//        String fileName = "E:\\work\\readQC\\src\\main\\resources\\readFile.xls";
            // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
            // 这里每次会读取3000条数据 然后返回过来 直接调用使用数据就行
            //                log.info("读取到一条数据{}", JSON.toJSONString(demoData));
            EasyExcel.read(path[i], T, new PageReadListener<T>(list::addAll)).sheet().doRead();
        }
        return list;
    }

    public static <T> List<T> read(Class T, List<String> path) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < path.size(); i++) {
            EasyExcel.read(path.get(i), T, new PageReadListener<T>(list::addAll)).sheet().doRead();
        }
        return list;
    }
}
