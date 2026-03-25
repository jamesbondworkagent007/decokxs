package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kKx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27992kKx {
    public static final C27992kKx copydefault = new C27992kKx();

    private C27992kKx() {
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "https://static.okx.com/cdn/mobile/resources/images/trading_market/android/okmarket/" + str;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C43386roM.EZpvd.EZpvd() + "/cdn/mobile/resources/lottie/trading_market/" + str;
    }
}
