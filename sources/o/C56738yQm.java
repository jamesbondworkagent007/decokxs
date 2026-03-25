package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56738yQm {
    public static final C56738yQm OLrzqt = new C56738yQm();

    private C56738yQm() {
    }

    public final java.lang.String copydefault(@NotNull java.lang.reflect.Method method) {
        Intrinsics.checkNotNullParameter(method, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        java.util.Iterator itEZpvd = yHX.EZpvd(method.getParameterTypes());
        while (itEZpvd.hasNext()) {
            java.lang.Class cls = (java.lang.Class) itEZpvd.next();
            Intrinsics.copydefault(cls);
            sb.append(C56743yQr.KWHzl((java.lang.Class<?>) cls));
        }
        sb.append(")");
        java.lang.Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "");
        sb.append(C56743yQr.KWHzl(returnType));
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.reflect.Constructor<?> constructor) {
        Intrinsics.checkNotNullParameter(constructor, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        java.util.Iterator itEZpvd = yHX.EZpvd(constructor.getParameterTypes());
        while (itEZpvd.hasNext()) {
            java.lang.Class cls = (java.lang.Class) itEZpvd.next();
            Intrinsics.copydefault(cls);
            sb.append(C56743yQr.KWHzl((java.lang.Class<?>) cls));
        }
        sb.append(")V");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String copydefault(@NotNull java.lang.reflect.Field field) {
        Intrinsics.checkNotNullParameter(field, "");
        java.lang.Class<?> type = field.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        return C56743yQr.KWHzl(type);
    }
}
