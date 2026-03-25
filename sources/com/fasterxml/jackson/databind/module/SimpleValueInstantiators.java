package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;
import o.AbstractC5549Vz;
import o.InterfaceC5562Wm;

/* JADX INFO: loaded from: classes21.dex */
public class SimpleValueInstantiators extends InterfaceC5562Wm.StateListAnimator implements Serializable {
    private static final long serialVersionUID = -8929386427526115130L;
    protected HashMap<ClassKey, ValueInstantiator> _classMappings = new HashMap<>();

    public SimpleValueInstantiators addValueInstantiator(Class<?> cls, ValueInstantiator valueInstantiator) {
        this._classMappings.put(new ClassKey(cls), valueInstantiator);
        return this;
    }

    @Override // o.InterfaceC5562Wm.StateListAnimator, o.InterfaceC5562Wm
    public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, ValueInstantiator valueInstantiator) {
        ValueInstantiator valueInstantiator2 = this._classMappings.get(new ClassKey(abstractC5549Vz.DbNXlk()));
        return valueInstantiator2 == null ? valueInstantiator : valueInstantiator2;
    }
}
