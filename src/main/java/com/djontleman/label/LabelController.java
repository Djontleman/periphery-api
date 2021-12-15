package com.djontleman.label;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/labels")
public class LabelController {

    private LabelService labelService;

    @Autowired
    public LabelController(LabelService labelService) {
        this.labelService = labelService;
    }

    // || ====================== Create/POST ====================== ||

    @PostMapping
    public void postLabel(@RequestBody Label label) {
        labelService.postLabel(label);
    }

    // || ====================== Read/GET ====================== ||

    @GetMapping
    public List<Label> getAllLabels() {
        return labelService.getAllLabels();
    }

    @GetMapping("{id}")
    public Optional<Label> getLabelById(@PathVariable int id) {
        return labelService.getLabelById(id);
    }

    // || ====================== Update/PUT/PATCH ====================== ||

    @PutMapping("{id}")
    public void putLabel(@PathVariable int id, @RequestBody Label label) {
        labelService.putLabel(id, label);
    }

    // || ====================== Delete/DELETE ====================== ||

    @DeleteMapping("{id}")
    public void deleteLabel(@PathVariable int id) {
        labelService.deleteLabel(id);
    }
}
