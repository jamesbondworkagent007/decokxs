package o;

import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22825hmf {
    public static final C22825hmf OLrzqt = new C22825hmf();

    private C22825hmf() {
    }

    public final SwapState OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (z) {
            boolean zEZpvd = EZpvd(str, str2, true);
            boolean zEZpvd2 = EZpvd(str, str2);
            if (zEZpvd || zEZpvd2) {
                return SwapState.SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP;
            }
        } else if (KWHzl(str, str2, str3)) {
            return SwapState.BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP;
        }
        return SwapState.INIT_SUCCESS;
    }

    public final boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C22380heK.OLrzqt.copydefault(str).EZpvd(z).OLrzqt(str2);
    }

    public final boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C22380heK.OLrzqt.copydefault(str).fetchVPNInfo().AEQbTJ(str2);
    }

    public final boolean KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C22380heK.OLrzqt.copydefault(str).OLrzqt().EZpvd(str2, str3);
    }

    public final boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return EZpvd(str, str2, true) || C22380heK.OLrzqt.copydefault(str).fetchVPNInfo().AEQbTJ(str2);
    }

    public final boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return !EZpvd(str, str2, true);
    }

    public final boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return (EZpvd(str, str2, false) || EZpvd(str, str3, false)) ? false : true;
    }
}
