package o;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;

/* JADX INFO: loaded from: classes21.dex */
public abstract class WX {

    public interface TaskDescription {
        TaskDescription copy();

        java.lang.Class<?> findMixInClassFor(java.lang.Class<?> cls);
    }

    public abstract WX copy();

    public abstract AbstractC5549Vz forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, TaskDescription taskDescription);

    public abstract AbstractC5549Vz forCreation(DeserializationConfig deserializationConfig, JavaType javaType, TaskDescription taskDescription);

    public abstract AbstractC5549Vz forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, TaskDescription taskDescription);

    @java.lang.Deprecated
    public abstract AbstractC5549Vz forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, TaskDescription taskDescription);

    public abstract AbstractC5549Vz forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, TaskDescription taskDescription, AbstractC5549Vz abstractC5549Vz);

    public abstract AbstractC5549Vz forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, TaskDescription taskDescription);

    public abstract AbstractC5549Vz forSerialization(SerializationConfig serializationConfig, JavaType javaType, TaskDescription taskDescription);
}
