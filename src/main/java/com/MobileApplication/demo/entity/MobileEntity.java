package com.MobileApplication.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@Entity
@Table(name="Mobile")
public class MobileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long modelNo;
    private String mblName;
    private long mblPrice;


}
