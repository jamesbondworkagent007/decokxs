package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14754drS {
    public static final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "metaX/dapp", false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "wallet/dapp", false, 2, (java.lang.Object) null);
    }
}
