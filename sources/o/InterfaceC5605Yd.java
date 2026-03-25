package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* JADX INFO: renamed from: o.Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC5605Yd {
    VD<?> findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd);

    VD<?> findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd);

    VD<?> findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd);

    VD<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, AbstractC5549Vz abstractC5549Vz, VD<java.lang.Object> vd, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd2);

    VD<?> findMapSerializer(SerializationConfig serializationConfig, MapType mapType, AbstractC5549Vz abstractC5549Vz, VD<java.lang.Object> vd, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd2);

    VD<?> findReferenceSerializer(SerializationConfig serializationConfig, ReferenceType referenceType, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd);

    VD<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC5549Vz abstractC5549Vz);

    /* JADX INFO: renamed from: o.Yd$StateListAnimator */
    public static class StateListAnimator implements InterfaceC5605Yd {
        @Override // o.InterfaceC5605Yd
        public VD<?> findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd) {
            return null;
        }

        @Override // o.InterfaceC5605Yd
        public VD<?> findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd) {
            return null;
        }

        @Override // o.InterfaceC5605Yd
        public VD<?> findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd) {
            return null;
        }

        @Override // o.InterfaceC5605Yd
        public VD<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, AbstractC5549Vz abstractC5549Vz, VD<java.lang.Object> vd, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd2) {
            return null;
        }

        @Override // o.InterfaceC5605Yd
        public VD<?> findMapSerializer(SerializationConfig serializationConfig, MapType mapType, AbstractC5549Vz abstractC5549Vz, VD<java.lang.Object> vd, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd2) {
            return null;
        }

        @Override // o.InterfaceC5605Yd
        public VD<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC5549Vz abstractC5549Vz) {
            return null;
        }

        @Override // o.InterfaceC5605Yd
        public VD<?> findReferenceSerializer(SerializationConfig serializationConfig, ReferenceType referenceType, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz, VD<java.lang.Object> vd) {
            return findSerializer(serializationConfig, referenceType, abstractC5549Vz);
        }
    }
}
