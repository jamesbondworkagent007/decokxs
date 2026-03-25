package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import o.InterfaceC5580Xe;

/* JADX INFO: renamed from: o.Xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5578Xc {
    public static InterfaceC5580Xe EZpvd(java.lang.reflect.Method method, JavaType javaType, TypeFactory typeFactory, InterfaceC5580Xe interfaceC5580Xe) {
        TypeBindings typeBindingsAEQbTJ = AEQbTJ(method, javaType, interfaceC5580Xe);
        return typeBindingsAEQbTJ == null ? interfaceC5580Xe : new InterfaceC5580Xe.Application(typeFactory, typeBindingsAEQbTJ);
    }

    public static TypeBindings AEQbTJ(java.lang.reflect.Method method, JavaType javaType, InterfaceC5580Xe interfaceC5580Xe) {
        JavaType boundType;
        java.lang.reflect.TypeVariable<?> typeVariableCopydefault;
        java.lang.reflect.TypeVariable<java.lang.reflect.Method>[] typeParameters = method.getTypeParameters();
        if (typeParameters.length == 0 || javaType.getBindings().isEmpty()) {
            return null;
        }
        java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
        if (!(genericReturnType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
        if (!Objects.equals(javaType.getRawClass(), parameterizedType.getRawType())) {
            return null;
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(typeParameters.length);
        for (int i = 0; i < actualTypeArguments.length; i++) {
            java.lang.reflect.TypeVariable<?> typeVariableCopydefault2 = copydefault(actualTypeArguments[i]);
            if (typeVariableCopydefault2 != null) {
                java.lang.String name = typeVariableCopydefault2.getName();
                if (name == null || (boundType = javaType.getBindings().getBoundType(i)) == null || (typeVariableCopydefault = copydefault(typeParameters, name)) == null) {
                    return null;
                }
                if (EZpvd(interfaceC5580Xe, boundType, typeVariableCopydefault.getBounds())) {
                    int iIndexOf = arrayList.indexOf(name);
                    if (iIndexOf != -1) {
                        JavaType javaType2 = (JavaType) arrayList2.get(iIndexOf);
                        if (boundType.equals(javaType2)) {
                            continue;
                        } else {
                            boolean zIsTypeOrSubTypeOf = javaType2.isTypeOrSubTypeOf(boundType.getRawClass());
                            boolean zIsTypeOrSubTypeOf2 = boundType.isTypeOrSubTypeOf(javaType2.getRawClass());
                            if (!zIsTypeOrSubTypeOf && !zIsTypeOrSubTypeOf2) {
                                return null;
                            }
                            if ((zIsTypeOrSubTypeOf ^ zIsTypeOrSubTypeOf2) && zIsTypeOrSubTypeOf2) {
                                arrayList2.set(iIndexOf, boundType);
                            }
                        }
                    } else {
                        arrayList.add(name);
                        arrayList2.add(boundType);
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return TypeBindings.create(arrayList, arrayList2);
    }

    public static java.lang.reflect.TypeVariable<?> copydefault(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.TypeVariable) {
            return (java.lang.reflect.TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return copydefault(upperBounds[0]);
            }
        }
        return null;
    }

    public static ParameterizedType AEQbTJ(java.lang.reflect.Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return AEQbTJ(upperBounds[0]);
            }
        }
        return null;
    }

    public static boolean EZpvd(InterfaceC5580Xe interfaceC5580Xe, JavaType javaType, java.lang.reflect.Type[] typeArr) {
        for (java.lang.reflect.Type type : typeArr) {
            if (!OLrzqt(interfaceC5580Xe, javaType, type)) {
                return false;
            }
        }
        return true;
    }

    public static boolean OLrzqt(InterfaceC5580Xe interfaceC5580Xe, JavaType javaType, java.lang.reflect.Type type) {
        if (!javaType.isTypeOrSubTypeOf(interfaceC5580Xe.copydefault(type).getRawClass())) {
            return false;
        }
        ParameterizedType parameterizedTypeAEQbTJ = AEQbTJ(type);
        if (parameterizedTypeAEQbTJ == null || !Objects.equals(javaType.getRawClass(), parameterizedTypeAEQbTJ.getRawType())) {
            return true;
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedTypeAEQbTJ.getActualTypeArguments();
        TypeBindings bindings = javaType.getBindings();
        if (bindings.size() != actualTypeArguments.length) {
            return false;
        }
        for (int i = 0; i < bindings.size(); i++) {
            if (!OLrzqt(interfaceC5580Xe, bindings.getBoundType(i), actualTypeArguments[i])) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.reflect.TypeVariable<?> copydefault(java.lang.reflect.TypeVariable<?>[] typeVariableArr, java.lang.String str) {
        if (typeVariableArr == null || str == null) {
            return null;
        }
        for (java.lang.reflect.TypeVariable<?> typeVariable : typeVariableArr) {
            if (str.equals(typeVariable.getName())) {
                return typeVariable;
            }
        }
        return null;
    }
}
