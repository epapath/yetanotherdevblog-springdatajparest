package epapath.yetanotherdevblog.com.repository;

import epapath.yetanotherdevblog.com.model.Singer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by epapathanasiou on 12/4/14.
 */

@RestResource(path = "singers", rel = "singers")
public interface SingerRepository extends PagingAndSortingRepository<Singer,Long> {
}
