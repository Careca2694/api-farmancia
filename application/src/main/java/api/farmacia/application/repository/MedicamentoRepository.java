package api.farmacia.application.repository;

import api.farmacia.application.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

    @Override
    List<Medicamento> findAll();

    List<Medicamento>findByNome(String nome);
    List<Medicamento> findByDescricao(String descricao);



}
