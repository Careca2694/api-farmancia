package api.farmacia.application.controller;

import api.farmacia.application.model.Medicamento;
import api.farmacia.application.service.MedicamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    private final MedicamentoService medicamentoService;

    public MedicamentoController(MedicamentoService medicamentoService){
        this.medicamentoService = medicamentoService;
    }

    @PostMapping
    public ResponseEntity<Medicamento> adicionarMedicamento(@RequestBody Medicamento medicamento){
        Medicamento medicamento1 = medicamentoService.adicionarMedicamento(medicamento);
        return ResponseEntity.ok().body(medicamento1);
    }

}
