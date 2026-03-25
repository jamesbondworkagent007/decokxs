package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;
import o.AbstractC5549Vz;
import o.InterfaceC5556Wg;
import o.VC;

/* JADX INFO: loaded from: classes21.dex */
public class SimpleKeyDeserializers implements InterfaceC5556Wg, Serializable {
    private static final long serialVersionUID = 1;
    protected HashMap<ClassKey, VC> _classMappings = null;

    public SimpleKeyDeserializers addDeserializer(Class<?> cls, VC vc) {
        if (this._classMappings == null) {
            this._classMappings = new HashMap<>();
        }
        this._classMappings.put(new ClassKey(cls), vc);
        return this;
    }

    @Override // o.InterfaceC5556Wg
    public VC findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) {
        HashMap<ClassKey, VC> map = this._classMappings;
        if (map == null) {
            return null;
        }
        return map.get(new ClassKey(javaType.getRawClass()));
    }
}
