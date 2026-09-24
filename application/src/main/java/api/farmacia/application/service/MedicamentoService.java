package api.farmacia.application.service;

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

    public List<Medicamento> listarMedicamentoPorPrimeiroNome(String nomeMedicamento){
        return medicamentoRepository.findByPrimeiroNome(nomeMedicamento);
    }

    public List<Medicamento>listarMedicamentoPorUltimoNome(String nomeMedicamento){
        return  medicamentoRepository.findByPorUltimoNome(nomeMedicamento);
    }

    public Optional<Medicamento>procurarPorId(Long id){
        return medicamentoRepository.findById(id);
    }

    public List<Medicamento>listarTodosMedicamentos(){
        return medicamentoRepository.findAll();
    }
}