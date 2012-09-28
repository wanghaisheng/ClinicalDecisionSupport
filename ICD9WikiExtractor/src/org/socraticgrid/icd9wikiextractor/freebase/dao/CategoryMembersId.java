package org.socraticgrid.icd9wikiextractor.freebase.dao;
// Generated Aug 9, 2010 4:30:55 PM by Hibernate Tools 3.2.1.GA



/**
 * CategoryMembersId generated by hbm2java
 */
public class CategoryMembersId  implements java.io.Serializable {


     private int articleWpid;
     private String categoryName;

    public CategoryMembersId() {
    }

    public CategoryMembersId(int articleWpid, String categoryName) {
       this.articleWpid = articleWpid;
       this.categoryName = categoryName;
    }
   
    public int getArticleWpid() {
        return this.articleWpid;
    }
    
    public void setArticleWpid(int articleWpid) {
        this.articleWpid = articleWpid;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CategoryMembersId) ) return false;
		 CategoryMembersId castOther = ( CategoryMembersId ) other; 
         
		 return (this.getArticleWpid()==castOther.getArticleWpid())
 && ( (this.getCategoryName()==castOther.getCategoryName()) || ( this.getCategoryName()!=null && castOther.getCategoryName()!=null && this.getCategoryName().equals(castOther.getCategoryName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getArticleWpid();
         result = 37 * result + ( getCategoryName() == null ? 0 : this.getCategoryName().hashCode() );
         return result;
   }   


}

