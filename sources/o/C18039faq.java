package o;

import com.okinc.business.defi.api.bean.ChartType;
import com.okinc.business.defi.biz.constant.KLineState;
import com.okinc.business.defi.wallet.home.datasource.KLinePrefsDataSource$selectedChartTypeFlow$1;
import com.okinc.business.defi.wallet.home.datasource.KLinePrefsDataSource$selectedChartTypeFlow$2;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.faq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18039faq {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public java.util.List<ChartType> AEQbTJ;
    public final android.content.Context EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChartType> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.util.List<ChartType> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    public C18039faq(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = context;
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = yDY.AhwBna();
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Integer num = SPUtils.getInt(EZpvd(str), KLineState.Collapsed.ordinal(), "wallet_kline_prefs");
        return num != null && num.intValue() == KLineState.Expanded.ordinal();
    }

    public final void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.commit(EZpvd(str), java.lang.Integer.valueOf((z ? KLineState.Expanded : KLineState.Collapsed).ordinal()), "wallet_kline_prefs");
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return "wallet_kline_state_" + str;
    }

    public final int OLrzqt() {
        java.lang.Integer num = SPUtils.getInt("kline_chart_type_id", 0, "wallet_kline_prefs");
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final void OLrzqt(int i) {
        SPUtils.put("kline_chart_type_id", java.lang.Integer.valueOf(i), "wallet_kline_prefs");
    }

    public final Flow<java.lang.Integer> copydefault() {
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(FlowKt.onStart(FlowKt.callbackFlow(new KLinePrefsDataSource$selectedChartTypeFlow$1(this, null)), new KLinePrefsDataSource$selectedChartTypeFlow$2(this, null))), this.copydefault);
    }

    public final java.lang.String KWHzl() {
        java.lang.String string = SPUtils.getString("kline_chart_type_name", "", "wallet_kline_prefs");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("kline_chart_type_name", str, "wallet_kline_prefs");
    }

    /* JADX INFO: renamed from: o.faq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.faq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C18039faq getInstance$default(StateListAnimator stateListAnimator, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return stateListAnimator.KWHzl(context);
        }

        public final C18039faq KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).DbNXlk();
        }
    }
}
