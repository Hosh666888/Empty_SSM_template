package pro.goforit.Entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2023/2/27 8:36
 * @desc:
 **/
@Data
public class Phrase implements Serializable {
    private static final long serialVersionUID = -357167851190863728L;

    private Integer id;

    private String word;

    private String chinese;

    private Date updateTime;

    private String updater;

}
