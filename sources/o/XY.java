package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;

/* JADX INFO: loaded from: classes21.dex */
public abstract class XY {
    @java.lang.Deprecated
    public abstract VD<java.lang.Object> createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, VD<java.lang.Object> vd) throws JsonMappingException;

    public abstract VD<java.lang.Object> createSerializer(VI vi, JavaType javaType) throws JsonMappingException;

    public abstract AbstractC5601Xz createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract XY withAdditionalKeySerializers(InterfaceC5605Yd interfaceC5605Yd);

    public abstract XY withAdditionalSerializers(InterfaceC5605Yd interfaceC5605Yd);

    public abstract XY withSerializerModifier(XR xr);

    public VD<java.lang.Object> createKeySerializer(VI vi, JavaType javaType, VD<java.lang.Object> vd) throws JsonMappingException {
        return createKeySerializer(vi.getConfig(), javaType, vd);
    }
}
