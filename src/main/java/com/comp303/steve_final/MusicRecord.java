package com.comp303.steve_final;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class MusicRecord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int musicRecord;
    private String musicRecordTitle;
    private String singerName;
    private String companyReleased;
    private Date    c;
    private String language;
    private Float price;




}
