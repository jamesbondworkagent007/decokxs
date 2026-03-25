package o;

import com.donkingliang.groupedadapter.BuildConfig;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.xMJ;

/* JADX INFO: renamed from: o.wth, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53873wth implements InterfaceC54501xKt<StrategyConfigInfo, java.lang.String> {
    public xMJ.Application OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C53873wth() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(xMJ.Application application) {
        this.OLrzqt = application;
    }

    public C53873wth(xMJ.Application application) {
        this.OLrzqt = application;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.xMJ$Application:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.xMJ$Application) : (r1v0 o.xMJ$Application))
 A[MD:(o.xMJ$Application):void (m)] (LINE:26) call: o.wth.<init>(o.xMJ$Application):void type: THIS */
    public /* synthetic */ C53873wth(xMJ.Application application, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : application);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.String KWHzl(StrategyConfigInfo strategyConfigInfo) {
        java.lang.String instId;
        xMS xmsGEmmrt;
        java.lang.String strAhwBna;
        java.lang.String minQuoteThold;
        java.lang.String minAmtBuffer;
        java.lang.String minAmtBuffer2;
        java.lang.String strAYXKKw;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        java.lang.String str = "";
        if (strategyConfigInfo == null || (instId = strategyConfigInfo.getInstId()) == null) {
            instId = "";
        }
        C55887xsS c55887xsS = new C55887xsS("SPOT", instId);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(c55887xsS.djBIcL())) == null) {
            xmsGEmmrt = null;
        } else {
            BizInstrument bizInstrumentAhwBna = c55887xsS.AhwBna();
            if (bizInstrumentAhwBna == null || (instFamily = bizInstrumentAhwBna.getInstFamily()) == null) {
                instFamily = "";
            }
            xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
        }
        if (xmsGEmmrt != null) {
            xMJ.Application application = this.OLrzqt;
            if (application != null && (strAYXKKw = application.AYXKKw()) != null) {
                str = strAYXKKw;
            }
            strAhwBna = xmsGEmmrt.AhwBna(str);
        } else {
            strAhwBna = null;
        }
        java.lang.String minQuoteThold2 = strategyConfigInfo != null ? strategyConfigInfo.getMinQuoteThold() : null;
        if (minQuoteThold2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) minQuoteThold2)) {
            minQuoteThold = "2";
        } else {
            minQuoteThold = strategyConfigInfo != null ? strategyConfigInfo.getMinQuoteThold() : null;
        }
        java.lang.String strDbNXlk = c55887xsS.DbNXlk();
        if (Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) "USDT") || Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) "USDC")) {
            BizInstrument bizInstrumentAhwBna2 = c55887xsS.AhwBna();
            double dAEQbTJ = C33129mqd.AEQbTJ(C33129mqd.mulS$default(C33129mqd.mulS$default(bizInstrumentAhwBna2 != null ? bizInstrumentAhwBna2.getMinSize() : null, strAhwBna, null, null, null, 14, null), (strategyConfigInfo == null || (minAmtBuffer = strategyConfigInfo.getMinAmtBuffer()) == null) ? BuildConfig.VERSION_NAME : minAmtBuffer, null, null, null, 14, null));
            double dAEQbTJ2 = C33129mqd.AEQbTJ(minQuoteThold);
            BizInstrument bizInstrumentAhwBna3 = c55887xsS.AhwBna();
            return C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(dAEQbTJ, java.lang.Math.max(dAEQbTJ2, C33129mqd.AEQbTJ(bizInstrumentAhwBna3 != null ? bizInstrumentAhwBna3.getTickerSize() : null)))));
        }
        BizInstrument bizInstrumentAhwBna4 = c55887xsS.AhwBna();
        double dAEQbTJ3 = C33129mqd.AEQbTJ(C33129mqd.mulS$default(C33129mqd.mulS$default(bizInstrumentAhwBna4 != null ? bizInstrumentAhwBna4.getMinSize() : null, strAhwBna, null, null, null, 14, null), (strategyConfigInfo == null || (minAmtBuffer2 = strategyConfigInfo.getMinAmtBuffer()) == null) ? BuildConfig.VERSION_NAME : minAmtBuffer2, null, null, null, 14, null));
        BizInstrument bizInstrumentAhwBna5 = c55887xsS.AhwBna();
        return C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(dAEQbTJ3, C33129mqd.AEQbTJ(bizInstrumentAhwBna5 != null ? bizInstrumentAhwBna5.getTickerSize() : null))));
    }
}
