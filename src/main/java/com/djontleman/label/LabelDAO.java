package com.djontleman.label;

import java.util.List;
import java.util.Optional;

public interface LabelDAO {

    // || ====================== Create/POST ====================== ||

    public int postLabel(Label label);

    // || ====================== Read/GET ====================== ||

    public List<Label> getAllLabels();
    public Optional<Label> getLabelById(int id);
    public List<Label> getLabelsByAlbumId(int id);

    // || ====================== Update/PUT/PATCH ====================== ||

    public int putLabel(int id, Label label);

    // || ====================== Delete/DELETE ====================== ||

    public int deleteLabel(int id);
}
