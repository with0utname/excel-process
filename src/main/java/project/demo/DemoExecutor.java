package project.demo;

import excel.reader.MyExcelReader;
import excel.writer.MyExcelWriter;
import project.demo.pojo.DemoData;

import java.util.ArrayList;
import java.util.List;

import static enums.ProjectNameEnum.Demo;

/**
 * @Author tututyl
 * @Date 2022-03-14
 */
public class DemoExecutor {
    public static void main(String[] args) {
        List<DemoData> data = MyExcelReader.read(DemoData.class, Demo.getProjectPath() + "demoRead.xlsx");
        data.forEach(System.out::println);
        MyExcelWriter.write(DemoData.class, data, Demo.getProjectPath());
    }
}
