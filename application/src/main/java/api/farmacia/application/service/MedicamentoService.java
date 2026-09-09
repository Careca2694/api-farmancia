package api.farmacia.application.service;

import api.farmacia.application.model.Medicamento;
import api.farmacia.application.repository.MedicamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService {

    private final MedicamentoRepository medicamentoRepository;

    public MedicamentoService(MedicamentoRepository medicamentoRepository){
         this.medicamentoRepository = medicamentoRepository;
    }

    public Medicamento adicionarMedicamento(Medicamento medicamento){
        return medicamentoRepository.save(medicamento);
    }

    public List<Medicamento> listarMedicamentoPorNome(String nomeMedicamento){
        return medicamentoRepository.listarPorPrimeiroNome(nomeMedicamento);
    }

    public List<Medicamento>listarPorUltimoNome(String nomeMedicamento){
        return  medicamentoRepository.listarPorUltimoNome(nomeMedicamento);
    }
}