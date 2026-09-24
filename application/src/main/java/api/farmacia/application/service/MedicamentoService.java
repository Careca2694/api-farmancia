package api.farmacia.application.service;

import api.farmacia.application.exception.NotFound;
import api.farmacia.application.model.Medicamento;
import api.farmacia.application.repository.MedicamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return medicamentoRepository.findByNome(nomeMedicamento);
    }

    public List<Medicamento>listarMedicamentoPorDescricao(String descricaoMedicamento){
        return  medicamentoRepository.findByDescricao(descricaoMedicamento);
    }

    public List<Medicamento>listarTodosMedicamentos(){
        return medicamentoRepository.findAll();
    }
}