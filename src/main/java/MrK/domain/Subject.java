package MrK.domain;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

/**
 * Created by User on 2015/05/17.
 */

@Entity
public class Subject implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String code;

    private Subject(){

    }

    public Subject(Builder builder){
        this.id = builder.id;
        this.code = builder.code;
        this.name = builder.name;

    }

    public static class Builder{
        private Long id;
        private String name;
        private String code;


        public Builder(String code){
            this.code = code;
        }
        public Builder id(Long value){
           this.id = value;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder copy(Subject value){
            this.id = value.id;
            this.code = value.code;
            this.name = value.name;
            return this;
        }

        public Subject build(){
            return new Subject(this);
        }
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }





}
