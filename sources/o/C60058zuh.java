package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zuh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60058zuh {
    public static final C60055zue AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C60055zue(str);
    }

    public static final <E extends java.lang.Enum<E>> InterfaceC59997ztZ OLrzqt(@NotNull java.lang.Enum<E> r1) {
        Intrinsics.checkNotNullParameter(r1, "");
        return copydefault(r1);
    }

    public static final C60055zue EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C60055zue(str);
    }

    public static final <E extends java.lang.Enum<E>> InterfaceC59997ztZ copydefault(@NotNull java.lang.Enum<E> r1) {
        Intrinsics.checkNotNullParameter(r1, "");
        java.lang.String lowerCase = r1.toString().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return new C60055zue(lowerCase);
    }
}
