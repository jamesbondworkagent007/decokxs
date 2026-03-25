package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VQ {
    public ObjectIdGenerator<?> AEQbTJ(MapperConfig<?> mapperConfig, WM wm, java.lang.Class<?> cls) {
        return null;
    }

    public abstract InterfaceC5599Xx<?> AYXKKw(MapperConfig<?> mapperConfig, WM wm, java.lang.Class<?> cls);

    public InterfaceC5500Ud EZpvd(MapperConfig<?> mapperConfig, WM wm, java.lang.Class<?> cls) {
        return null;
    }

    public abstract AbstractC5548Vy<?> EZpvd(DeserializationConfig deserializationConfig, WM wm, java.lang.Class<?> cls);

    public PropertyNamingStrategy KWHzl(MapperConfig<?> mapperConfig, WM wm, java.lang.Class<?> cls) {
        return null;
    }

    public abstract VC OLrzqt(DeserializationConfig deserializationConfig, WM wm, java.lang.Class<?> cls);

    public abstract XB OLrzqt(MapperConfig<?> mapperConfig, WM wm, java.lang.Class<?> cls);

    public VirtualBeanPropertyWriter copydefault(MapperConfig<?> mapperConfig, java.lang.Class<?> cls) {
        return null;
    }

    public java.lang.Object copydefault(SerializationConfig serializationConfig, WT wt, java.lang.Class<?> cls) {
        return null;
    }

    public abstract VD<?> copydefault(SerializationConfig serializationConfig, WM wm, java.lang.Class<?> cls);

    public InterfaceC5621Yt<?, ?> copydefault(MapperConfig<?> mapperConfig, WM wm, java.lang.Class<?> cls) {
        return null;
    }

    public ValueInstantiator djBIcL(MapperConfig<?> mapperConfig, WM wm, java.lang.Class<?> cls) {
        return null;
    }
}
