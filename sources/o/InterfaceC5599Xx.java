package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import o.InterfaceC5599Xx;

/* JADX INFO: renamed from: o.Xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC5599Xx<T extends InterfaceC5599Xx<T>> {
    AbstractC5597Xv buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, java.util.Collection<NamedType> collection);

    AbstractC5601Xz buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, java.util.Collection<NamedType> collection);

    T defaultImpl(java.lang.Class<?> cls);

    java.lang.Class<?> getDefaultImpl();

    T inclusion(JsonTypeInfo.As as);

    T init(JsonTypeInfo.Id id, XB xb);

    T typeIdVisibility(boolean z);

    T typeProperty(java.lang.String str);

    default T withDefaultImpl(java.lang.Class<?> cls) {
        return (T) defaultImpl(cls);
    }
}
