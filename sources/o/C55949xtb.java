package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DcaTradeListResponse;
import com.okinc.unify_trade.bot.data.DcaDetailsData;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55949xtb implements InterfaceC54501xKt<java.util.List<? extends DcaTradeListResponse>, java.util.List<? extends DcaDetailsData>> {
    public final java.lang.String AEQbTJ;
    public final BizInstrument EZpvd;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55949xtb() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C55949xtb(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        this.EZpvd = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:25) call: o.xtb.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C55949xtb(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.util.List<DcaDetailsData> KWHzl(@NotNull java.util.List<DcaTradeListResponse> list) {
        java.lang.String strAEQbTJ;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMS xmsGEmmrt;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DcaTradeListResponse dcaTradeListResponse : list) {
            BizInstrument bizInstrument = this.EZpvd;
            if (bizInstrument == null || (strAEQbTJ = bizInstrument.getInstFamily()) == null) {
                strAEQbTJ = xUW.KWHzl.AEQbTJ(this.OLrzqt);
            }
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            java.lang.String strKWHzl = (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(this.AEQbTJ)) == null || (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(strAEQbTJ)) == null) ? null : xmsGEmmrt.KWHzl();
            java.lang.String upperCase = TaskDescription.AEQbTJ(this.OLrzqt).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (strKWHzl == null || strKWHzl.length() == 0) {
                strKWHzl = upperCase;
            }
            java.lang.String tradeQuoteCcy = dcaTradeListResponse.getTradeQuoteCcy();
            java.lang.String investmentCcy = dcaTradeListResponse.getInvestmentCcy();
            if (tradeQuoteCcy == null || tradeQuoteCcy.length() == 0) {
                tradeQuoteCcy = investmentCcy;
            }
            if (tradeQuoteCcy != null && tradeQuoteCcy.length() != 0) {
                strKWHzl = tradeQuoteCcy;
            }
            java.lang.String str = "--";
            java.lang.String str2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) dcaTradeListResponse.getCycleId()) ? "--" : ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + xMR.copydefault.copydefault(dcaTradeListResponse.getCycleId());
            java.lang.String simpleDateTime$default = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) dcaTradeListResponse.getStartTime()) ? "--" : pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(dcaTradeListResponse.getStartTime())), null, 1, null);
            java.lang.String botPnl$default = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) dcaTradeListResponse.getQuoteProfit()) ? "--" : C56033xvF.getBotPnl$default(this.OLrzqt, this.AEQbTJ, dcaTradeListResponse.getQuoteProfit(), null, false, true, null, false, strKWHzl, null, null, 1752, null);
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) dcaTradeListResponse.getQuoteProfit()) && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) dcaTradeListResponse.getInvestmentAmt())) {
                BigDecimal bigDecimalDivide = C33129mqd.copydefault(dcaTradeListResponse.getQuoteProfit()).multiply(C33129mqd.copydefault("100")).divide(C33129mqd.copydefault(dcaTradeListResponse.getInvestmentAmt()), MathContext.DECIMAL64);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
                str = "(" + pTB.formatICUPercent$default(bigDecimalDivide, null, null, DisplaySign.EXCEPT_ZERO, null, null, 27, null) + ")";
            }
            arrayList.add(new DcaDetailsData(dcaTradeListResponse.getCycleId(), str2, strKWHzl, simpleDateTime$default, botPnl$default, str, C56033xvF.getTradeDefaultColor$default(dcaTradeListResponse.getQuoteProfit(), 0, 2, null), dcaTradeListResponse.getCurrentCycle(), false, null, null, false, 3840, null));
        }
        return arrayList;
    }
}
