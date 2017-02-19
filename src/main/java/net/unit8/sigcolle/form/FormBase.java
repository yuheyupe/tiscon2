package net.unit8.sigcolle.form;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import kotowari.data.Validatable;

/**
 * @author kawasima
 */
public abstract class FormBase implements Serializable, Validatable {
    private Map<String, Object> extensions = new HashMap<>();

    @Override
    public Object getExtension(String name) {
        return extensions.get(name);
    }

    @Override
    public void setExtension(String name, Object extension) {
        extensions.put(name, extension);
    }
}
