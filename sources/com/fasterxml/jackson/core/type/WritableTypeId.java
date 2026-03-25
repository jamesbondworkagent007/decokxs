package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

/* JADX INFO: loaded from: classes21.dex */
public class WritableTypeId {
    public Class<?> AEQbTJ;
    public Object EZpvd;
    public Inclusion KWHzl;
    public Object OLrzqt;
    public String copydefault;
    public JsonToken gEmmrt;
    public boolean valueOf;

    public enum Inclusion {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean requiresObjectContext() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public WritableTypeId() {
    }

    public WritableTypeId(Object obj, JsonToken jsonToken) {
        this(obj, jsonToken, null);
    }

    public WritableTypeId(Object obj, JsonToken jsonToken, Object obj2) {
        this.OLrzqt = obj;
        this.EZpvd = obj2;
        this.gEmmrt = jsonToken;
    }
}
