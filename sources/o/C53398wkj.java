package o;

import androidx.core.os.BundleKt;
import com.okinc.biz.TradeType;
import com.okinc.tradingbot.impl.order.strategy.twap.base.TwapTradePresenter;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.TwapReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wkj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53398wkj extends AbstractC53400wkl {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wkh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53398wkj.KWHzl(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.wkj$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.BUY_OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.SELL_CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX INFO: renamed from: o.wkj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wkj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C53398wkj OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C53398wkj c53398wkj = new C53398wkj();
            c53398wkj.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_inst_type", str)));
            return c53398wkj;
        }
    }

    private final java.lang.String zsXlph() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String KWHzl(C53398wkj c53398wkj) {
        android.os.Bundle arguments = c53398wkj.getArguments();
        return C33129mqd.gEmmrt(arguments != null ? arguments.getString("bot_inst_type") : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC53400wkl, o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        ((AbstractC48432uRe) gGvvIC()).AEQbTJ.setOnAmtPercentCallback(new Function2() { // from class: o.wkf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53398wkj.EZpvd(this.OLrzqt, (C47988uAv) obj, (java.lang.Float) obj2);
            }
        });
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C53398wkj c53398wkj, C47988uAv c47988uAv, java.lang.Float f) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (f != null && c47988uAv.zLjUOn()) {
            if (Intrinsics.EZpvd((java.lang.Object) c53398wkj.zsXlph(), (java.lang.Object) "MARGIN")) {
                strAEQbTJ = c53398wkj.copydefault(c53398wkj.copydefault(), java.lang.Float.valueOf(c47988uAv.fJNWhG()));
            } else {
                strAEQbTJ = c53398wkj.AEQbTJ(c53398wkj.copydefault(), java.lang.Float.valueOf(c47988uAv.fJNWhG()));
            }
            ((AbstractC48432uRe) c53398wkj.gGvvIC()).AEQbTJ.setAmtPercentContent(c47988uAv, strAEQbTJ, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.Float f) {
        java.lang.String maxSize;
        java.lang.String strGEmmrt;
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default;
        xOV xovAhwBna;
        TradeType tradeType = C49861uwY.Companion.copydefault().get();
        int i = tradeType == null ? -1 : StateListAnimator.EZpvd[tradeType.ordinal()];
        if (i == 1 ? maxAvailableResp == null || (maxSize = maxAvailableResp.getMaxSize()) == null : i != 2 || ((xovAhwBna = C56059xvf.EZpvd.AhwBna()) == null || !xovAhwBna.OLrzqt() || !((TwapTradePresenter) dxcTrN()).fvQaOB().fARcdN() ? maxAvailableResp == null || (maxSize = maxAvailableResp.getAvailable()) == null : maxAvailableResp == null || (maxSize = maxAvailableResp.getMaxSize()) == null)) {
            maxSize = "";
        }
        C54796xVq c54796xVq = C54796xVq.AEQbTJ;
        if (f == null || (strGEmmrt = C33129mqd.gEmmrt(f)) == null) {
            strGEmmrt = "";
        }
        java.lang.String strCopydefault = c54796xVq.copydefault(strGEmmrt, maxSize);
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(((TwapTradePresenter) dxcTrN()).fvQaOB(), null, false, 3, null);
        return (c54571xNhCreateAmtConvert$default == null || (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(strCopydefault)) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) == null) ? "" : safeString$default;
    }

    @Override // o.AbstractC53400wkl
    public void OLrzqt(@NotNull java.lang.String str, @NotNull TwapReq twapReq, @NotNull Function1<? super TwapReq, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(twapReq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(twapReq);
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (Intrinsics.EZpvd((java.lang.Object) zsXlph(), (java.lang.Object) "MARGIN")) {
            C56028xvA.registerBotFragmentTrack$default(this, "MarginTwapFragment", new kotlin.Pair[0], null, 8, null);
        } else {
            C56028xvA.registerBotFragmentTrack$default(this, "SpotTwapFragment", new kotlin.Pair[0], null, 8, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String copydefault(MaxAvailableResp maxAvailableResp, java.lang.Float f) {
        java.lang.String maxSize;
        java.lang.String strGEmmrt;
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default;
        TradeType tradeType = C49861uwY.Companion.copydefault().get();
        int i = tradeType == null ? -1 : StateListAnimator.EZpvd[tradeType.ordinal()];
        if (i == 1 ? maxAvailableResp == null || (maxSize = maxAvailableResp.getMaxSize()) == null : i != 2 || maxAvailableResp == null || (maxSize = maxAvailableResp.getMaxSize()) == null) {
            maxSize = "";
        }
        C54796xVq c54796xVq = C54796xVq.AEQbTJ;
        if (f == null || (strGEmmrt = C33129mqd.gEmmrt(f)) == null) {
            strGEmmrt = "";
        }
        java.lang.String strCopydefault = c54796xVq.copydefault(strGEmmrt, maxSize);
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(((TwapTradePresenter) dxcTrN()).fvQaOB(), null, false, 3, null);
        return (c54571xNhCreateAmtConvert$default == null || (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(strCopydefault)) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) == null) ? "" : safeString$default;
    }
}
