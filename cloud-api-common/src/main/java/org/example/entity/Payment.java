package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: Payment
 * Description:
 * date: 2022/9/23 0023 10:36
 *
 * @author: 田江涛
 * @version:
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
