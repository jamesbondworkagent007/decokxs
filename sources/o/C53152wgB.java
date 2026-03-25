package o;

import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C53201wgy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53152wgB implements InterfaceC54501xKt<C53201wgy.Application, SpotDcaAddOrderPresenter.Fragment> {
    public C55887xsS AEQbTJ;
    public Function1<? super java.lang.String, java.lang.String> EZpvd;
    public yHT<? super java.lang.Boolean, ? super java.lang.String, ? super TickersData, ? super StrategyConfigInfo, java.lang.String> KWHzl;
    public TacticsData OLrzqt;
    public SpotInstrument copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(TacticsData tacticsData, SpotInstrument spotInstrument, C55887xsS c55887xsS, @NotNull Function1<? super java.lang.String, java.lang.String> function1, @NotNull yHT<? super java.lang.Boolean, ? super java.lang.String, ? super TickersData, ? super StrategyConfigInfo, java.lang.String> yht) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(yht, "");
        this.OLrzqt = tacticsData;
        this.copydefault = spotInstrument;
        this.AEQbTJ = c55887xsS;
        this.EZpvd = function1;
        this.KWHzl = yht;
    }

    @yCM
    public C53152wgB() {
    }

    public static final java.lang.String OLrzqt(C53152wgB c53152wgB, java.lang.String str) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        C55887xsS c55887xsS = c53152wgB.AEQbTJ;
        java.lang.String safeString$default = null;
        if (c55887xsS != null) {
            C54571xNh c54571xNhEZpvd = c55887xsS.EZpvd(str, true, c55887xsS != null ? c55887xsS.AEQbTJ("spot_dca") : null);
            if (c54571xNhEZpvd != null && (c54536xMLAYXKKw = c54571xNhEZpvd.AYXKKw(str)) != null && (c54536xMLCopydefault = c54536xMLAYXKKw.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
            }
        }
        return safeString$default == null ? "" : safeString$default;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SpotDcaAddOrderPresenter.Fragment KWHzl(@NotNull C53201wgy.Application application) {
        int iAhwBna;
        java.lang.String strInvoke;
        Intrinsics.checkNotNullParameter(application, "");
        BigDecimal bigDecimalAdd = C33129mqd.EZpvd(application.KWHzl().getAcctAvail()).add(C33129mqd.EZpvd(application.copydefault().getQuoteMax()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(bigDecimalAdd);
        C54799xVt c54799xVt = C54799xVt.AEQbTJ;
        TacticsData tacticsData = this.OLrzqt;
        java.lang.String instId = tacticsData != null ? tacticsData.getInstId() : null;
        TacticsData tacticsData2 = this.OLrzqt;
        java.lang.String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(c54799xVt, instId, tacticsData2 != null ? tacticsData2.getInstType() : null, false, false, 12, null);
        C55887xsS c55887xsS = this.AEQbTJ;
        java.lang.String strCopydefault = c55887xsS != null ? c55887xsS.copydefault("spot_dca") : null;
        java.lang.String str = strCopydefault == null ? "" : strCopydefault;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            iAhwBna = 8;
        } else {
            TacticsData tacticsData3 = this.OLrzqt;
            java.lang.String instType = tacticsData3 != null ? tacticsData3.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                SpotInstrument spotInstrument = this.copydefault;
                java.lang.String instFamily = spotInstrument != null ? spotInstrument.getInstFamily() : null;
                if (instFamily == null) {
                    instFamily = "";
                }
                java.lang.String strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(instFamily);
                if (strFIwbmz != null) {
                    iAhwBna = C33129mqd.AhwBna(strFIwbmz);
                }
            }
        }
        int i = iAhwBna;
        Function1<? super java.lang.String, java.lang.String> function1 = this.EZpvd;
        java.lang.String strInvoke2 = function1 != null ? function1.invoke(application.OLrzqt().getLast()) : null;
        java.lang.String str2 = strInvoke2 == null ? "" : strInvoke2;
        java.lang.String acctAvail = application.KWHzl().getAcctAvail();
        if (acctAvail == null) {
            acctAvail = "";
        }
        java.lang.String strOLrzqt = OLrzqt(this, acctAvail);
        java.lang.String acctAvail2 = application.KWHzl().getAcctAvail();
        if (acctAvail2 == null) {
            acctAvail2 = "";
        }
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairEZpvd = uLP.EZpvd(strOLrzqt, acctAvail2);
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairEZpvd2 = uLP.EZpvd(OLrzqt(this, application.copydefault().getQuoteMax()), application.copydefault().getQuoteMax());
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairEZpvd3 = uLP.EZpvd(OLrzqt(this, strGEmmrt), strGEmmrt);
        yHT<? super java.lang.Boolean, ? super java.lang.String, ? super TickersData, ? super StrategyConfigInfo, java.lang.String> yht = this.KWHzl;
        if (yht != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            Function1<? super java.lang.String, java.lang.String> function12 = this.EZpvd;
            java.lang.String strInvoke3 = function12 != null ? function12.invoke(application.OLrzqt().getLast()) : null;
            if (strInvoke3 == null) {
                strInvoke3 = "";
            }
            strInvoke = yht.invoke(bool, strInvoke3, application.OLrzqt(), application.AEQbTJ());
        } else {
            strInvoke = null;
        }
        java.lang.String str3 = strInvoke == null ? "" : strInvoke;
        C55887xsS c55887xsS2 = this.AEQbTJ;
        java.lang.String strAYXKKw = c55887xsS2 != null ? c55887xsS2.AYXKKw() : null;
        return new SpotDcaAddOrderPresenter.Fragment(titleByIdAndType$default, str, i, str2, false, pairEZpvd, pairEZpvd2, pairEZpvd3, str3, null, null, null, null, null, strAYXKKw == null ? "" : strAYXKKw, 15872, null);
    }
}
