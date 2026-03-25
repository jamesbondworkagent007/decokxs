package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;
import o.AbstractC5548Vy;
import o.InterfaceC5555Wf;

/* JADX INFO: loaded from: classes21.dex */
public class NullsAsEmptyProvider implements InterfaceC5555Wf, Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC5548Vy<?> _deserializer;

    public NullsAsEmptyProvider(AbstractC5548Vy<?> abstractC5548Vy) {
        this._deserializer = abstractC5548Vy;
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // o.InterfaceC5555Wf
    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getEmptyValue(deserializationContext);
    }
}
