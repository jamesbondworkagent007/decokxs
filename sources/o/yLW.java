package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class yLW {
    public static final java.lang.String AEQbTJ(java.lang.reflect.Method method) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(method.getName());
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
        sb.append(yDV.joinToString$default(parameterTypes, "", "(", ")", 0, (java.lang.CharSequence) null, C56618yMa.EZpvd, 24, (java.lang.Object) null));
        java.lang.Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "");
        sb.append(C56743yQr.KWHzl(returnType));
        return sb.toString();
    }

    public static final java.lang.CharSequence OLrzqt(java.lang.Class cls) {
        Intrinsics.copydefault(cls);
        return C56743yQr.KWHzl((java.lang.Class<?>) cls);
    }
}
