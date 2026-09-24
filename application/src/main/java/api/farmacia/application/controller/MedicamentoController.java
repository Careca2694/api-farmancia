package api.farmacia.application.controller;

import api.farmacia.application.model.Medicamento;
import api.farmacia.application.service.MedicamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/adicionar")
    public ResponseEntity<Medicamento> adicionarMedicamento(@RequestBody Medicamento medicamento){
        Medicamento medicamento1 = medicamentoService.adicionarMedicamento(medicamento);
        return ResponseEntity.ok().body(medicamento1);
    }

}
