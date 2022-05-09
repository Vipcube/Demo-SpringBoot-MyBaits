package org.vipcube.spring.boot.mybatis.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @TableName log
 */
@TableName(value ="log")
@Data
public class Log implements Serializable {
    /**
     *
     */
    //@TableId(type = IdType.AUTO)
    private Integer id;

    /**
     *
     */
    private Integer userId;

    /**
     *
     */
    private String action;

    /**
     *
     */
    @TableField( fill = FieldFill.INSERT )
    private LocalDateTime createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
