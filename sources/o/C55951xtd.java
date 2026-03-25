package o;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.ShareData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55951xtd implements InterfaceC54501xKt<StrategyDetailsResponse, ShareData> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.xtd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xtd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(java.lang.String str) {
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.RlQdEF), (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || StringsKt__StringNumberConversionsKt.toIntOrNull(str) == null) ? null : xMR.copydefault.copydefault(str));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ShareData KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd = Companion.EZpvd(strategyDetailsResponse.getCompletedCycles());
        return new ShareData(null, strategyDetailsResponse.getPnlRatio(), null, strategyDetailsResponse.getTotalPnl(), null, pairEZpvd.component1(), pairEZpvd.component2(), null, null, null, null, null, null, null, null, 32661, null);
    }
}
