package o;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.ShareData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55927xtF implements InterfaceC54501xKt<StrategyDetailsResponse, ShareData> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.xtF$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xtF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.lang.String EZpvd(boolean z) {
            if (z) {
                return C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityCallbackStubProxy);
            }
            return C33070mpX.AYXKKw(C55688xof.Application.onReceiveResult);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // o.InterfaceC54501xKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShareData KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String totalApy;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        java.lang.String strEZpvd = Companion.EZpvd(strategyDetailsResponse.isHistory());
        if (!strategyDetailsResponse.isHistory()) {
            totalApy = strategyDetailsResponse.getTotalApy();
            if (totalApy == null) {
                str = "";
            }
            return new ShareData(strEZpvd, str, null, strategyDetailsResponse.isHistory() ? strategyDetailsResponse.getTotalPnl() : "", null, null, null, null, null, null, null, null, null, null, null, 32756, null);
        }
        totalApy = strategyDetailsResponse.getPnlRatio();
        str = totalApy;
        return new ShareData(strEZpvd, str, null, strategyDetailsResponse.isHistory() ? strategyDetailsResponse.getTotalPnl() : "", null, null, null, null, null, null, null, null, null, null, null, 32756, null);
    }
}
