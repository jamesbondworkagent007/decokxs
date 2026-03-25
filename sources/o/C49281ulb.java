package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49281ulb {
    public static final C49281ulb OLrzqt = new C49281ulb();

    private C49281ulb() {
    }

    public static /* synthetic */ void copyToClipboard$default(C49281ulb c49281ulb, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "okex.clip";
        }
        c49281ulb.copydefault(str, str2);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object systemService = C32979mnm.EZpvd.OLrzqt().getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(str2, str));
    }
}
