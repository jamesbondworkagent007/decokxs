package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cHf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C11249cHf {
    public static final C11249cHf EZpvd = new C11249cHf();

    private C11249cHf() {
    }

    public final java.util.List<java.lang.String> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
    }

    public final java.lang.String KWHzl(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, ",", 0, null, null, 58, null);
    }
}
