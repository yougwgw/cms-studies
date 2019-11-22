package com.briup.cms.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Customer implements Serializable {
    @Id
    private int id;
    private String name;
    private double money;
}
