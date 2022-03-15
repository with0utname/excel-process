package enums;

import lombok.Data;

/**
 * @Author tututyl
 * @Date 2022-03-15
 */
public enum ProjectNameEnum {
    //用于配置项目路径
    Demo("demo");


    private final String projectPath;

    ProjectNameEnum(String projectName) {
        String path = System.getProperty("user.dir") + "\\src\\main\\resources\\";
        this.projectPath = path + projectName + "\\";
    }

    public String getProjectPath() {
        return projectPath;
    }
}
