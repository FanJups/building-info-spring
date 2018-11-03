package com.builder.demo.repostitory;


import com.builder.demo.model.Floor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloorRepository extends PagingAndSortingRepository<Floor, Long> {
}