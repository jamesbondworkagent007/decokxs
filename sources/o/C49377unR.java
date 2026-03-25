package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49377unR {
    public static final C49377unR KWHzl = new C49377unR();
    public static final java.lang.String AEQbTJ = "Search";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return AEQbTJ;
    }

    private C49377unR() {
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AEQbTJ) ? "search_activity" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "GoToTradeKLine") ? "trade_kline" : str;
    }
}
