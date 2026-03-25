package o;

/* JADX INFO: renamed from: o.Vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5531Vh {
    public abstract AbstractC5531Vh containedType(int i);

    public abstract int containedTypeCount();

    public abstract java.lang.String containedTypeName(int i);

    public abstract AbstractC5531Vh getContentType();

    public abstract AbstractC5531Vh getKeyType();

    @java.lang.Deprecated
    public java.lang.Class<?> getParameterSource() {
        return null;
    }

    public abstract java.lang.Class<?> getRawClass();

    public abstract AbstractC5531Vh getReferencedType();

    public abstract boolean hasGenericTypes();

    public abstract boolean hasRawClass(java.lang.Class<?> cls);

    public abstract boolean isAbstract();

    public abstract boolean isArrayType();

    public abstract boolean isCollectionLikeType();

    public abstract boolean isConcrete();

    public abstract boolean isContainerType();

    public abstract boolean isEnumType();

    public abstract boolean isFinal();

    public abstract boolean isInterface();

    public abstract boolean isMapLikeType();

    public abstract boolean isPrimitive();

    public abstract boolean isThrowable();

    public abstract java.lang.String toCanonical();

    public boolean isReferenceType() {
        return getReferencedType() != null;
    }
}
