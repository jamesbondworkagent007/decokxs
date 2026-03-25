package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VD<T> implements InterfaceC5586Xk {

    public static abstract class ActionBar extends VD<java.lang.Object> {
    }

    public VD<?> getDelegatee() {
        return null;
    }

    public java.lang.Class<T> handledType() {
        return null;
    }

    public boolean isEmpty(VI vi, T t) {
        return t == null;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public abstract void serialize(T t, JsonGenerator jsonGenerator, VI vi) throws java.io.IOException;

    public VD<T> unwrappingSerializer(NameTransformer nameTransformer) {
        return this;
    }

    public boolean usesObjectId() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.VD<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public VD<?> withFilterId(java.lang.Object obj) {
        return this;
    }

    public VD<T> replaceDelegatee(VD<?> vd) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.VI */
    /* JADX WARN: Multi-variable type inference failed */
    public void serializeWithType(T t, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws java.io.IOException {
        java.lang.Class clsHandledType = handledType();
        if (clsHandledType == null) {
            clsHandledType = t.getClass();
        }
        vi.reportBadDefinition((java.lang.Class<?>) clsHandledType, java.lang.String.format("Type id handling not implemented for type %s (by serializer of type %s)", clsHandledType.getName(), getClass().getName()));
    }

    @java.lang.Deprecated
    public boolean isEmpty(T t) {
        return isEmpty(null, t);
    }

    public java.util.Iterator<PropertyWriter> properties() {
        return C5619Yr.KWHzl();
    }

    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        interfaceC5584Xi.EZpvd(javaType);
    }
}
