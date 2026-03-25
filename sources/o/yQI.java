package o;

import kotlin.jvm.internal.Intrinsics;
import o.yQN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQI extends yQH implements InterfaceC56835yUb {
    public final java.lang.reflect.Method OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Ljava/lang/reflect/Member; */
    @Override // o.yQH
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public java.lang.reflect.Method copydefault() {
        return this.OLrzqt;
    }

    public yQI(@NotNull java.lang.reflect.Method method) {
        Intrinsics.checkNotNullParameter(method, "");
        this.OLrzqt = method;
    }

    @Override // o.InterfaceC56835yUb
    public java.util.List<InterfaceC56844yUk> AhwBna() {
        java.lang.reflect.Type[] genericParameterTypes = copydefault().getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
        java.lang.annotation.Annotation[][] parameterAnnotations = copydefault().getParameterAnnotations();
        Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "");
        return copydefault(genericParameterTypes, parameterAnnotations, copydefault().isVarArgs());
    }

    /* JADX DEBUG: Method merged with bridge method: valueOf()Lo/yUf; */
    @Override // o.InterfaceC56835yUb
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public yQN valueOf() {
        yQN.StateListAnimator stateListAnimator = yQN.AYXKKw;
        java.lang.reflect.Type genericReturnType = copydefault().getGenericReturnType();
        Intrinsics.checkNotNullExpressionValue(genericReturnType, "");
        return stateListAnimator.EZpvd(genericReturnType);
    }

    @Override // o.InterfaceC56835yUb
    public yTN OLrzqt() {
        java.lang.Object defaultValue = copydefault().getDefaultValue();
        if (defaultValue != null) {
            return AbstractC56740yQo.OLrzqt.copydefault(defaultValue, null);
        }
        return null;
    }

    @Override // o.InterfaceC56847yUn
    public java.util.List<yQP> getNewProxyInstance() {
        java.lang.reflect.TypeVariable<java.lang.reflect.Method>[] typeParameters = copydefault().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable<java.lang.reflect.Method> typeVariable : typeParameters) {
            arrayList.add(new yQP(typeVariable));
        }
        return arrayList;
    }

    @Override // o.InterfaceC56835yUb
    public boolean djBIcL() {
        return OLrzqt() != null;
    }
}
