package com.newCloud.activity.po;
// default package



/**
 * ActTestTable entity. @author MyEclipse Persistence Tools
 */

public class ActTestTable  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String sex;


    // Constructors

    /** default constructor */
    public ActTestTable() {
    }

    
    /** full constructor */
    public ActTestTable(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
   








}