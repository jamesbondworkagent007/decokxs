package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class kNT {
    public static final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "metaX/nft", false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "wallet/nft", false, 2, (java.lang.Object) null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "web3/nft", false, 2, (java.lang.Object) null);
    }
}
