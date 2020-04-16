package com.ponking.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ponking
 * @ClassName Payment
 * @date 2020/4/15--20:53
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private long id;
    private String serial;
}
