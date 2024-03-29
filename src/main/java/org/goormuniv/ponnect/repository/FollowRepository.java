package org.goormuniv.ponnect.repository;

import com.amazonaws.services.ec2.model.FpgaDeviceInfo;
import org.goormuniv.ponnect.domain.Follow;
import org.goormuniv.ponnect.domain.Member;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FollowRepository  extends JpaRepository<Follow, Long> {
    //List<Follow> findAllByFollowing(Member following);
    Boolean existsByFollowingIdAndFollowedId(Long following, Long followed);

    List<Follow> findAll(Specification<Follow> spec);

    Follow findByFollowingIdAndFollowedId(Long following, Long followed);
}
