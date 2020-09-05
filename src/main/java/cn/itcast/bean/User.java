package cn.itcast.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

/**
 * DESCRIPTION:
 * STEPS:
 * SUMMARY:
 */
@Data
@Entity//标识当前类为SpringDataJPA的实体类，会和数据库中的表相对应
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "username")
    public String username;
    public String password;
    public String nickname;
}
