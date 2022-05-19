package com.lancesoft.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lancesoft.entity.Slot;
@Repository
public interface SlotRepo extends JpaRepository<Slot,Integer> {

}
