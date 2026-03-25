package o;

import com.okinc.market.ext.UpDownColor;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGQ implements InterfaceC49405unt<BizInstrument, C39994qFk> {
    public final InterfaceC54577xNn KWHzl;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qGP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(qGQ.OLrzqt());
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qGO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(qGQ.AEQbTJ(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qGR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(qGQ.copydefault());
        }
    });

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public qGQ(InterfaceC54577xNn interfaceC54577xNn) {
        this.KWHzl = interfaceC54577xNn;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)Ljava/lang/Object; */
    public C39994qFk copydefault(@NotNull BizInstrument bizInstrument) {
        return (C39994qFk) InterfaceC49405unt.Activity.EZpvd(this, bizInstrument);
    }

    public final boolean djBIcL() {
        return ((java.lang.Boolean) this.EZpvd.getValue()).booleanValue();
    }

    public static final boolean OLrzqt() {
        return C55608xnE.EZpvd();
    }

    public final boolean AhwBna() {
        return ((java.lang.Boolean) this.OLrzqt.getValue()).booleanValue();
    }

    public static final boolean AEQbTJ(qGQ qgq) {
        InterfaceC54577xNn interfaceC54577xNn = qgq.KWHzl;
        return interfaceC54577xNn != null && interfaceC54577xNn.EZpvd();
    }

    public final boolean gEmmrt() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean copydefault() {
        return C55608xnE.OLrzqt();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C39994qFk AEQbTJ(@NotNull BizInstrument bizInstrument) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.String titleByIdAndType$default;
        boolean z4;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        java.lang.String tradeSymbol = bizInstrument.getTradeSymbol();
        java.lang.String strOLrzqt = C55687xoe.AEQbTJ.OLrzqt(tradeSymbol);
        if (bizInstrument instanceof SwapInstrument) {
            if (((SwapInstrument) bizInstrument).isPreMarketPair() && Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "FUTURES")) {
                titleByIdAndType$default = C40381qTt.copydefault.copydefault(bizInstrument.getInstId());
                if (titleByIdAndType$default == null) {
                    titleByIdAndType$default = bizInstrument.getInstId();
                }
            } else {
                titleByIdAndType$default = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, false, 12, null);
            }
            z4 = true;
        } else if (bizInstrument instanceof FutureInstrument) {
            if (((FutureInstrument) bizInstrument).isPreMarketPair()) {
                titleByIdAndType$default = C40381qTt.copydefault.copydefault(bizInstrument.getInstId());
                if (titleByIdAndType$default == null) {
                    titleByIdAndType$default = bizInstrument.getInstId();
                }
            } else {
                titleByIdAndType$default = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, bizInstrument.getInstId(), bizInstrument.getInstType(), false, false, false, 28, null);
            }
            z4 = false;
        } else {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) bizInstrument.getDisplayQuoteSymbol())) {
                str = " / " + bizInstrument.getDisplayQuoteSymbol();
            } else {
                str = "";
            }
            boolean z5 = bizInstrument instanceof SpotInstrument;
            SpotInstrument spotInstrument = z5 ? (SpotInstrument) bizInstrument : null;
            java.lang.String level = spotInstrument != null ? spotInstrument.getLevel() : null;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) level)) {
                level = null;
            }
            if (level == null) {
                SpotInstrument spotInstrument2 = z5 ? (SpotInstrument) bizInstrument : null;
                coinLever = spotInstrument2 != null ? spotInstrument2.getCoinLever() : null;
                level = coinLever == null ? "" : coinLever;
            }
            boolean z6 = !gEmmrt() && djBIcL() && C33129mqd.OLrzqt((java.lang.CharSequence) level);
            str2 = level + "x";
            str3 = tradeSymbol;
            z = false;
            z2 = z6;
            z3 = true;
            coinLever = str;
            return new C39994qFk(null, null, bizInstrument, 0, true, str3, true, coinLever != null ? "" : coinLever, z3, strOLrzqt, true, str2 != null ? "" : str2, z2, z, false, true, "--", true, "--", UpDownColor.NEUTRAL, true, false, !AhwBna(), null, false, null, 0.0f, 125829120, null);
        }
        str3 = titleByIdAndType$default;
        z = z4;
        z3 = false;
        z2 = false;
        str2 = null;
        return new C39994qFk(null, null, bizInstrument, 0, true, str3, true, coinLever != null ? "" : coinLever, z3, strOLrzqt, true, str2 != null ? "" : str2, z2, z, false, true, "--", true, "--", UpDownColor.NEUTRAL, true, false, !AhwBna(), null, false, null, 0.0f, 125829120, null);
    }
}
