package com.fpt.it17326.nhom5.domainmodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * AowVN_Nyaruko
 **/

@Entity
@Table (name = "Pin")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pin {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private String id;
    
    @Column (name = "MaPin")
    private String maPin;

    @Column (name = "TenPin")
    private String tenPin;

    @Column (name = "CreatedAt")
    private Date createdAt;

    @Column (name = "Deleted")
    private Boolean deleted;

    @Column (name = "UpdatedAt")
    private Date updatedAt;
}

