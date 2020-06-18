package com.Dumindu.SchoolManagement.Model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Student{
    @Id
    @GeneratedValue
    private Integer SId;
    @NonNull
    private String fName;
    @NonNull
    private String lName;
    @NonNull
    private String address;
    @OneToMany(targetEntity = coNo.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "sp_fk", referencedColumnName = "sId")
    private List<coNo> no;

    public Integer getSId() {
        return SId;
    }

    public void setSId(Integer SId) {
        this.SId = SId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<coNo> getNo() {
        return no;
    }

    public void setNo(List<coNo> no) {
        this.no = no;
    }
}
