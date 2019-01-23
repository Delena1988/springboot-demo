package cn.joinhealth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Person
 *
 * @author jlin
 * @date 2018/8/20 17:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    private static final long serialVersionUID = -3134184719655303026L;
    private String id;
    private String name;
    private String age;
}
