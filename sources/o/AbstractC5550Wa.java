package o;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: renamed from: o.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5550Wa {
    protected static final InterfaceC5559Wj[] NO_DESERIALIZERS = new InterfaceC5559Wj[0];

    public abstract AbstractC5548Vy<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    public abstract AbstractC5548Vy<java.lang.Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    public abstract AbstractC5548Vy<java.lang.Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz, java.lang.Class<?> cls) throws JsonMappingException;

    public abstract AbstractC5548Vy<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    public abstract AbstractC5548Vy<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    public abstract AbstractC5548Vy<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    public abstract VC createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException;

    public abstract AbstractC5548Vy<?> createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    public abstract AbstractC5548Vy<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    public abstract AbstractC5548Vy<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    public abstract AbstractC5548Vy<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    public abstract AbstractC5597Xv findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    public abstract boolean hasExplicitDeserializerFor(DeserializationConfig deserializationConfig, java.lang.Class<?> cls);

    public abstract JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract AbstractC5550Wa withAbstractTypeResolver(AbstractC5547Vx abstractC5547Vx);

    public abstract AbstractC5550Wa withAdditionalDeserializers(InterfaceC5559Wj interfaceC5559Wj);

    public abstract AbstractC5550Wa withAdditionalKeyDeserializers(InterfaceC5556Wg interfaceC5556Wg);

    public abstract AbstractC5550Wa withDeserializerModifier(VX vx);

    public abstract AbstractC5550Wa withValueInstantiators(InterfaceC5562Wm interfaceC5562Wm);
}
