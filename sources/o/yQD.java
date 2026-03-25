package o;

import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQD extends yQH implements yTZ {
    public final java.lang.reflect.Constructor<?> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Ljava/lang/reflect/Member; */
    @Override // o.yQH
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.reflect.Constructor<?> copydefault() {
        return this.KWHzl;
    }

    public yQD(@NotNull java.lang.reflect.Constructor<?> constructor) {
        Intrinsics.checkNotNullParameter(constructor, "");
        this.KWHzl = constructor;
    }

    @Override // o.yTZ
    public java.util.List<InterfaceC56844yUk> AhwBna() {
        java.lang.reflect.Type[] genericParameterTypes = copydefault().getGenericParameterTypes();
        Intrinsics.copydefault(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return yDY.AhwBna();
        }
        java.lang.Class<?> declaringClass = copydefault().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (java.lang.reflect.Type[]) yDT.copydefault(genericParameterTypes, 1, genericParameterTypes.length);
        }
        java.lang.annotation.Annotation[][] parameterAnnotations = copydefault().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new java.lang.IllegalStateException("Illegal generic signature: " + copydefault());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            Intrinsics.copydefault(parameterAnnotations);
            parameterAnnotations = (java.lang.annotation.Annotation[][]) yDT.copydefault(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        Intrinsics.copydefault(genericParameterTypes);
        Intrinsics.copydefault(parameterAnnotations);
        return copydefault(genericParameterTypes, parameterAnnotations, copydefault().isVarArgs());
    }

    @Override // o.InterfaceC56847yUn
    public java.util.List<yQP> getNewProxyInstance() {
        java.lang.reflect.TypeVariable<java.lang.reflect.Constructor<?>>[] typeParameters = copydefault().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable<java.lang.reflect.Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new yQP(typeVariable));
        }
        return arrayList;
    }
}
