package com.example.evaFernandez.service

import com.example.evaFernandez.model.Asistente
import com.example.evaFernandez.repository.AsistenteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class AsistenteService {
    @Autowired
    lateinit var asistenteRepository: AsistenteRepository
    fun save (asistente:Asistente): Asistente{
        return asistenteRepository.save(asistente)
    }
    fun list ():List<Asistente>{
        return asistenteRepository.findAll()
    }
}