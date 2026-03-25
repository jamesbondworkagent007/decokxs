package o;

import com.okinc.components.track.ABTestManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.jxZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27563jxZ {
    public static final C27563jxZ OLrzqt = new C27563jxZ();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jye
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C27563jxZ.OLrzqt());
        }
    });
    public static final int AEQbTJ = 8;

    public final boolean AYXKKw() {
        return true;
    }

    public final boolean KWHzl() {
        return true;
    }

    private C27563jxZ() {
    }

    public final boolean copydefault() {
        return ((java.lang.Boolean) copydefault.getValue()).booleanValue();
    }

    public static final boolean OLrzqt() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "market_discover_mul_period", null, 2, null), (java.lang.Object) "treatment");
    }

    public final boolean fetchVPNInfo() {
        return C33216msK.KWHzl.KWHzl();
    }

    public final boolean EZpvd() {
        pUU.KWHzl("MarketAbTest", "isHitBoost: true");
        return true;
    }

    public final boolean valueOf() {
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "market_rust_cedefi_rank", null, 2, null);
        pUU.KWHzl("MarketAbTest", "isHomeDexRankingMobile40Enable: value: " + value$default);
        return Intrinsics.EZpvd((java.lang.Object) value$default, (java.lang.Object) "treatment");
    }

    public final boolean djBIcL() {
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "market_new_listing_banner", null, 2, null);
        pUU.KWHzl("MarketAbTest", "isShowNewListingBanner: " + value$default);
        return Intrinsics.EZpvd((java.lang.Object) value$default, (java.lang.Object) "treatment");
    }

    public final boolean AhwBna() {
        pUU.KWHzl("MarketAbTest", "isShowPeriodFilterForRank: " + copydefault());
        return copydefault();
    }

    public final boolean gEmmrt() {
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "market_new_tokens_state_display", null, 2, null);
        pUU.KWHzl("MarketAbTest", "isMarketNewTokensStateDisplay: " + value$default);
        return Intrinsics.EZpvd((java.lang.Object) value$default, (java.lang.Object) "treatment");
    }

    public final boolean DbNXlk() {
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "app-indicator-alert", null, 2, null);
        pUU.KWHzl("MarketAbTest", "isSupportIndicatorAlert: " + value$default);
        return Intrinsics.EZpvd((java.lang.Object) value$default, (java.lang.Object) "treatment");
    }
}
