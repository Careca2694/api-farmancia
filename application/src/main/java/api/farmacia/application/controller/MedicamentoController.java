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

    @GetMapping
    public ResponseEntity<List<Medicamento>>listarMedicamentoPorPrimeiroNome(@RequestParam String nomeMedicamento){
        List<Medicamento> listaMedicamentos = medicamentoService.listarMedicamentoPorPrimeiroNome(nomeMedicamento);
        return ResponseEntity.ok().body(listaMedicamentos);
    }

    @GetMapping
    public ResponseEntity<List<Medicamento>>listarMedicamentoPorUltimoNome(@RequestParam String nomeMedicamento){
        List<Medicamento> listaMedicamentos = medicamentoService.listarMedicamentoPorUltimoNome(nomeMedicamento);
        return ResponseEntity.ok().body(listaMedicamentos);
    }

    @PostMapping
    public ResponseEntity<Medicamento> adicionarMedicamento(@RequestBody Medicamento medicamento){
        Medicamento medicamento1 = medicamentoService.adicionarMedicamento(medicamento);
        return ResponseEntity.ok().body(medicamento1);
    }

}
