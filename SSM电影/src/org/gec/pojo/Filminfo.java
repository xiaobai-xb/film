package org.gec.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

public class Filminfo implements Serializable {
    private Integer filmid;

    private String filmname;

    private Integer typeid;

    @Size(min=1,max = 30,message = "{filmadd.actor.error}")
    private String actor;

    @Size(min=1,max = 30,message = "{filmadd.director.error}")
    private String director;

    private Double ticketprice;
    private Double smallprice;
    private Double bigprice;

    private String pic;

    private Filmtype filmtype;

    public Filmtype getFilmtype() {
        return filmtype;
    }

    public void setFilmtype(Filmtype filmtype) {
        this.filmtype = filmtype;
    }

    public Integer getFilmid() {
        return filmid;
    }

    public void setFilmid(Integer filmid) {
        this.filmid = filmid;
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname == null ? null : filmname.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public Double getTicketprice() {
        return ticketprice;
    }


    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    @Override
    public String toString() {
        return "Filminfo{" +
                "filmid=" + filmid +
                ", filmname='" + filmname + '\'' +
                ", typeid=" + typeid +
                ", actor='" + actor + '\'' +
                ", director='" + director + '\'' +
                ", ticketprice=" + ticketprice +
                ", pic='" + pic + '\'' +
                ", filmtype=" + filmtype +
                '}';
    }

    public void setTicketprice(Double ticketprice) {
        this.ticketprice = ticketprice;
    }

    public Double getSmallprice() {
        return smallprice;
    }

    public void setSmallprice(Double smallprice) {
        this.smallprice = smallprice;
    }

    public Double getBigprice() {
        return bigprice;
    }

    public void setBigprice(Double bigprice) {
        this.bigprice = bigprice;
    }
}