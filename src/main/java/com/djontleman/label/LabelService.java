package com.djontleman.label;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class LabelService {

    private LabelDAO labelDAO;

    @Autowired
    public LabelService(@Qualifier("postgresLabel") LabelDAO labelDAO) {
        this.labelDAO = labelDAO;
    }

    // || ====================== Create/POST ====================== ||

    public int postLabel(Label label) {
        return labelDAO.postLabel(label);
    }

    // || ====================== Read/GET ====================== ||

    public List<Label> getAllLabels() {
        return labelDAO.getAllLabels();
    }

    public Optional<Label> getLabelById(int id) {
        return labelDAO.getLabelById(id);
    }

    // || ====================== Update/PUT/PATCH ====================== ||

    public int putLabel(int id, Label label) {
        return labelDAO.putLabel(id, label);
    }

    // || ====================== Delete/DELETE ====================== ||

    public int deleteLabel(int id) {
        return labelDAO.deleteLabel(id);
    }
}
