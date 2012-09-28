package org.socraticgrid.icd9wikiextractor.freebase.dao;
// Generated Sep 23, 2010 3:53:17 PM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Sections generated by hbm2java
 */
@Entity
@Table(name="sections"
    ,schema="public"
)
public class Sections  implements java.io.Serializable {


     private long id;
     private Long parentId;
     private short ordinal;
     private int articleWpid;
     private String name;
     private Serializable xml;

    public Sections() {
    }

	
    public Sections(long id, short ordinal, int articleWpid, String name) {
        this.id = id;
        this.ordinal = ordinal;
        this.articleWpid = articleWpid;
        this.name = name;
    }
    public Sections(long id, Long parentId, short ordinal, int articleWpid, String name, Serializable xml) {
       this.id = id;
       this.parentId = parentId;
       this.ordinal = ordinal;
       this.articleWpid = articleWpid;
       this.name = name;
       this.xml = xml;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name="parent_id")
    public Long getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
    
    @Column(name="ordinal", nullable=false)
    public short getOrdinal() {
        return this.ordinal;
    }
    
    public void setOrdinal(short ordinal) {
        this.ordinal = ordinal;
    }
    
    @Column(name="article_wpid", nullable=false)
    public int getArticleWpid() {
        return this.articleWpid;
    }
    
    public void setArticleWpid(int articleWpid) {
        this.articleWpid = articleWpid;
    }
    
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="xml")
    public Serializable getXml() {
        return this.xml;
    }
    
    public void setXml(Serializable xml) {
        this.xml = xml;
    }




}

