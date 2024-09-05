package com.sist.jobgem.repository;

import com.sist.jobgem.entity.HireKind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface HireKindRepository extends JpaRepository<HireKind, Integer> {
    List<HireKind> findByIdIn(List<Integer> hkIdx);
}
