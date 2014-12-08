package epapath.yetanotherdevblog.com.model;
import javax.persistence.*;
import java.util.List;
import java.util.Set;


/**
 * Created by epapathanasiou on 12/4/14.
 */
@Entity
public class Singer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @OneToMany(mappedBy = "singer")
    private Set<Album> albums;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }
}
