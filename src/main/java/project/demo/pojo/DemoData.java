package project.demo.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Author tututyl
 * @Date 2022-03-15
 */
@Data
public class DemoData {
    @ExcelProperty(value = "会员号")
    private String code;
    @ExcelProperty(value = "晴川注册时间")
    private String qcStartTime;
    @ExcelProperty(value = "晴川积分")
    private Integer qcScore;
    @ExcelProperty(value = "晴川总积分")
    private Integer qcPureScore;
    @ExcelProperty(value = "晴川流水积分")
    private Integer qcCountScore;

    @ExcelProperty(value = "有赞客户姓名")
    private String yzName;
    @ExcelProperty(value = "有赞客户昵称")
    private String yzNickname;
    @ExcelProperty(value = "有赞权益卡")
    private String yzCardType;
    @ExcelProperty(value = "有赞积分")
    private Integer yzScore;
    @ExcelProperty(value = "有赞来源方式")
    private String yzComeFrom;
    @ExcelProperty(value = "有赞注册时间")
    private String yzStartTime;
    @ExcelProperty(value = "有赞成为会员时间")
    private String yzMemberTime;


    @ExcelProperty(value = "是否晴川用户")
    private String isQcMember;
    @ExcelProperty(value = "是否有赞用户")
    private String isYzMember;
    @ExcelProperty(value = "晴川出现次数")
    private Integer qcShowTime;
    @ExcelProperty(value = "有赞出现次数")
    private Integer yzShowTime;

    @ExcelProperty(value = "是否在同步程序同步过")
    private String isSyn;

    @ExcelProperty(value = "是否解冻")
    private String isUnfroze;
}
