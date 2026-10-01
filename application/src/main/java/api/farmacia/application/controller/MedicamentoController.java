package api.farmacia.application.controller;

import api.farmacia.application.model.Medicamento;
import api.farmacia.application.service.MedicamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    private final MedicamentoService medicamentoService;

    public MedicamentoController(MedicamentoService medicamentoService){
        this.medicamentoService = medicamentoService;
    }

    @GetMapping("/listarPorNome")
    public ResponseEntity<List<Medicamento>>listarMedicamentoPorNome(@RequestParam String nome){
        List<Medicamento> listaMedicamentos = medicamentoService.listarMedicamentoPorNome(nome);
        return ResponseEntity.ok().body(listaMedicamentos);
    }

    @GetMapping("/listarPorDescricao")
    public ResponseEntity<List<Medicamento>>listarMedicamentoPorDescricao(@RequestParam String descricao){
        List<Medicamento> listaMedicamentos = medicamentoService.listarMedicamentoPorDescricao(descricao);
        return ResponseEntity.ok().body(listaMedicamentos);
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<Medicamento>> listarTodosMedicamentos(){

        List<Medicamento> listar = medicamentoService.listarTodosMedicamentos();

        return ResponseEntity.accepted().body(listar);
    }

    @GetMapping("/buscarPorId/{id}")
    public ResponseEntity<Optional<Medicamento>> listarPorId(@PathVariable Long id){
        Optional<Medicamento> listarMedicamento = medicamentoService.BuscarMedicamentoPorId(id);
        return ResponseEntity.ok().body(listarMedicamento);
    }

    @PostMapping("/adicionar")
    public ResponseEntity<Medicamento> adicionarMedicamento(@RequestBody Medicamento medicamento){
        Medicamento medicamento1 = medicamentoService.adicionarMedicamento(medicamento);
        return ResponseEntity.ok().body(medicamento1);
    }

    @DeleteMapping("/deletar")
    public ResponseEntity<Void> deletarMedicamento(@RequestParam String nome){
        medicamentoService.deleteMedicamento(nome);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Medicamento> atualizarMedicamento(@PathVariable Long id,@RequestBody Medicamento medicamento){
        return ResponseEntity.ok().body(medicamentoService.atualizarMedicamento(id,medicamento));
    }



}
