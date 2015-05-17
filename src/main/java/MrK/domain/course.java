package MrK.domain;

import javax.persistence.*;
import java.util.List;
import java.io.Serializable;

/**
 * Created by User on 2015/05/17.
 */

@Entity
public class course implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(unique=true)
    private String code;
    private int offering;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
    private List<Subject> subjects;

    private course(){
    }

    public course(Builder builder){
        id = builder.id;
        name=builder.name;
        code=builder.code;
        offering = builder.offering;
        subjects = builder.subjects;

    }
    public Long getID(){
        return id;

    }

    public int getOffering(){
        return offering;
    }

    public String getName(){
        return name;
    }

    public String getCode(){
        return code;
    }

    public List<Subject> getSubjects(){
        return subjects;
    }

    public static class Builder{
        private String name;
        private String code;
        private int offering;
        private Long id;
        private List<Subject> subjects;

        public Builder(String code){
            this.code = code;
        }

        public Builder offering(int value){
            this.offering = value;
            return this;
        }

        public Builder subjects(List<Subject> value){
            this.subjects=value;
            return this;
        }

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder copy(course value){
            this.name = value.getName();
            this.code = value.getCode();
            this.offering = value.getOffering();
            this.id = value.getID();
            this.subjects = value.getSubjects();
            return this;
        }
        public course build(){
            return new course(this);
        }
    }




}
