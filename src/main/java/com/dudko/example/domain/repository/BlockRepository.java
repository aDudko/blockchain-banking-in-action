package com.dudko.example.domain.repository;

import com.dudko.example.domain.entity.blockchain.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends JpaRepository<Block, Long> {

    Block findTopByOrderByIdDesc();

}
