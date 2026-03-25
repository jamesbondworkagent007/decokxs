package o;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.ShareData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xth, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55955xth implements InterfaceC54501xKt<StrategyDetailsResponse, ShareData> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.xth$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xth.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(java.lang.String str) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.invokespecialhlXVux);
            xMR xmr = xMR.copydefault;
            if (str == null) {
                str = "";
            }
            return C56390yDp.OLrzqt(strAYXKKw, xmr.copydefault(str));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ShareData KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = Companion.copydefault(strategyDetailsResponse.getCycle());
        return new ShareData(strategyDetailsResponse.isHistory() ? C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityCallbackStubProxy) : C33070mpX.AYXKKw(C55688xof.Application.IconCompatParcelizer), strategyDetailsResponse.isHistory() ? strategyDetailsResponse.getPnlRatio() : strategyDetailsResponse.getArbApy(), null, strategyDetailsResponse.isHistory() ? strategyDetailsResponse.getTotalPnl() : "", null, pairCopydefault.component1(), pairCopydefault.component2(), null, null, null, null, null, null, null, null, 32660, null);
    }
}
