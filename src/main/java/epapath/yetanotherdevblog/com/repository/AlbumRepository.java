package epapath.yetanotherdevblog.com.repository;

import epapath.yetanotherdevblog.com.model.Album;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by epapathanasiou on 12/4/14.
 */

@RestResource(rel = "albums", path = "albums")
public interface AlbumRepository extends PagingAndSortingRepository<Album, Long> {
}
