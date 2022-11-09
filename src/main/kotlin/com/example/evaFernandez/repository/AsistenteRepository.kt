package com.example.evaFernandez.repository

import com.example.evaFernandez.model.Asistente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface AsistenteRepository:JpaRepository<Asistente, Long?> {

}