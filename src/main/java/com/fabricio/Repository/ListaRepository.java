package com.fabricio.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabricio.model.Lista;

@Repository
public interface ListaRepository extends JpaRepository<Lista, Long> {

}