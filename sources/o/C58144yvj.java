package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.yvj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58144yvj {
    public static final java.lang.reflect.Type[] AEQbTJ = new java.lang.reflect.Type[0];

    private C58144yvj() {
    }

    public static java.lang.Class<?> AEQbTJ(java.lang.reflect.Type type) {
        KWHzl(type, "type == null");
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        if (type instanceof ParameterizedType) {
            java.lang.reflect.Type rawType = ((ParameterizedType) type).getRawType();
            if (!(rawType instanceof java.lang.Class)) {
                throw new java.lang.IllegalArgumentException();
            }
            return (java.lang.Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return java.lang.reflect.Array.newInstance(AEQbTJ(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof java.lang.reflect.TypeVariable) {
            return java.lang.Object.class;
        }
        if (type instanceof WildcardType) {
            return AEQbTJ(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new java.lang.IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static <T> T KWHzl(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static java.lang.reflect.Type KWHzl(int i, ParameterizedType parameterizedType) {
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new java.lang.IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        java.lang.reflect.Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    public static boolean EZpvd(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (java.lang.reflect.Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (EZpvd(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return EZpvd(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof java.lang.reflect.TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? AbstractJsonLexerKt.NULL : type.getClass().getName()));
    }
}
