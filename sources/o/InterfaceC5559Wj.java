package o;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: renamed from: o.Wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC5559Wj {

    /* JADX INFO: renamed from: o.Wj$ActionBar */
    public static abstract class ActionBar implements InterfaceC5559Wj {
        @Override // o.InterfaceC5559Wj
        public AbstractC5548Vy<?> findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
            return null;
        }

        @Override // o.InterfaceC5559Wj
        public AbstractC5548Vy<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
            return null;
        }

        @Override // o.InterfaceC5559Wj
        public AbstractC5548Vy<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
            return null;
        }

        @Override // o.InterfaceC5559Wj
        public AbstractC5548Vy<?> findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
            return null;
        }

        @Override // o.InterfaceC5559Wj
        public AbstractC5548Vy<?> findEnumDeserializer(java.lang.Class<?> cls, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
            return null;
        }

        @Override // o.InterfaceC5559Wj
        public AbstractC5548Vy<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, VC vc, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
            return null;
        }

        @Override // o.InterfaceC5559Wj
        public AbstractC5548Vy<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, VC vc, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
            return null;
        }

        @Override // o.InterfaceC5559Wj
        public AbstractC5548Vy<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
            return null;
        }

        @Override // o.InterfaceC5559Wj
        public AbstractC5548Vy<?> findTreeNodeDeserializer(java.lang.Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
            return null;
        }
    }

    AbstractC5548Vy<?> findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException;

    AbstractC5548Vy<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    AbstractC5548Vy<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException;

    AbstractC5548Vy<?> findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException;

    AbstractC5548Vy<?> findEnumDeserializer(java.lang.Class<?> cls, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;

    AbstractC5548Vy<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, VC vc, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException;

    AbstractC5548Vy<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, VC vc, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException;

    AbstractC5548Vy<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException;

    AbstractC5548Vy<?> findTreeNodeDeserializer(java.lang.Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException;
}
