package epapath.yetanotherdevblog.com.model;

import javax.persistence.*;

/**
 * Created by epapathanasiou on 12/4/14.
 */
@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String title;

    @Column
    private Long numberOfSongs;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "signer_id")
    private Singer singer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(Long numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }
}
