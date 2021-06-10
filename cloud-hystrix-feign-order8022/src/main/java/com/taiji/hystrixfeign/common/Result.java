package com.taiji.hystrixfeign.common;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lmz
 * @date 2019/3/26
 * @Maill
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    /**
     * 业务表示代码
     */
    private Integer code;
    /**
     * 业务提示信息
     */
    private String msg;

    /**
     * 业务操作返回结果
     */
    private T content;

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }


}
