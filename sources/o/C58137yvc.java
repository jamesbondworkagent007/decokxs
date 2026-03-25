package o;

import java.lang.reflect.ParameterizedType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58137yvc {
    public static final java.lang.Class<?> copydefault(@NotNull java.lang.reflect.Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        java.lang.Class<?> clsAEQbTJ = C58144yvj.AEQbTJ(type);
        Intrinsics.checkNotNullExpressionValue(clsAEQbTJ, "");
        return clsAEQbTJ;
    }

    public static final boolean KWHzl(@NotNull java.lang.reflect.Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        return C58144yvj.EZpvd(type);
    }

    public static final java.lang.reflect.Type KWHzl(@NotNull ParameterizedType parameterizedType, int i) {
        Intrinsics.checkNotNullParameter(parameterizedType, "");
        java.lang.reflect.Type typeKWHzl = C58144yvj.KWHzl(i, parameterizedType);
        Intrinsics.checkNotNullExpressionValue(typeKWHzl, "");
        return typeKWHzl;
    }
}
