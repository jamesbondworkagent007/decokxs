package o;

import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.bot.InvestBean;
import com.okinc.unify_trade.biz.bot.PreInvestDetail;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import com.okinc.unify_trade.bot.data.SmartInvestData;
import com.okinc.unify_trade.bot.data.SmartInvestDetail;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53191wgo implements InterfaceC54501xKt<java.util.List<? extends PreInvestDetail>, SmartInvestDetail> {
    public java.lang.String EZpvd = "";
    public java.util.List<SelectCoinData> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.util.List<SelectCoinData> list) {
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ SmartInvestDetail KWHzl(java.util.List<? extends PreInvestDetail> list) {
        return OLrzqt((java.util.List<PreInvestDetail>) list);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SmartInvestDetail OLrzqt(@NotNull java.util.List<PreInvestDetail> list) {
        java.lang.String strAddS$default;
        java.lang.String safeString$default;
        C54536xML c54536xMLKWHzl;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLKWHzl2;
        C54536xML c54536xMLFetchVPNInfo2;
        java.lang.String safeString$default2;
        java.lang.String str;
        java.lang.String safeString$default3;
        C54536xML c54536xMLFetchVPNInfo3;
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.lang.String sizeDig;
        C54536xML c54536xMLFetchVPNInfo4;
        java.lang.String safeString$default4;
        java.lang.String strValueOf;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<InvestBean> capitalList = ((PreInvestDetail) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getCapitalList();
        java.lang.String quoteCcy = ((PreInvestDetail) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getQuoteCcy();
        if (quoteCcy == null) {
            quoteCcy = "";
        }
        java.lang.String tradeQuoteCcy = ((PreInvestDetail) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getTradeQuoteCcy();
        if (tradeQuoteCcy != null) {
            quoteCcy = tradeQuoteCcy;
        }
        java.lang.Object obj = null;
        if (capitalList != null) {
            strAddS$default = "0";
            for (InvestBean investBean : capitalList) {
                java.lang.String ccy = investBean.getCcy();
                java.lang.String str3 = ccy == null ? "" : ccy;
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
                java.lang.String str4 = (interfaceC54581xNrCopydefault == null || (strValueOf = interfaceC54581xNrCopydefault.valueOf(str3)) == null) ? "" : strValueOf;
                InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
                if (interfaceC54581xNrCopydefault2 == null) {
                    str = "";
                } else {
                    java.lang.String capitalSz = investBean.getCapitalSz();
                    if (capitalSz == null) {
                        capitalSz = "";
                    }
                    C54536xML c54536xMLKWHzl3 = interfaceC54581xNrCopydefault2.KWHzl(quoteCcy, capitalSz);
                    if (c54536xMLKWHzl3 != null && (c54536xMLFetchVPNInfo4 = c54536xMLKWHzl3.fetchVPNInfo()) != null && (safeString$default4 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo4, false, 1, obj)) != null) {
                        str = safeString$default4;
                    }
                }
                java.lang.String str5 = str;
                java.lang.String str6 = str4;
                java.lang.String str7 = str3;
                strAddS$default = C33129mqd.addS$default(strAddS$default, investBean.getQuoteSz(), null, null, null, 14, null);
                C54536xML c54536xML = new C54536xML();
                java.lang.String baseSz = investBean.getBaseSz();
                java.lang.String str8 = baseSz == null ? "" : baseSz;
                InterfaceC54581xNr interfaceC54581xNrCopydefault3 = c54589xNz.copydefault();
                java.lang.String safeString$default5 = C54536xML.toSafeString$default(C54536xML.setNumber$default(c54536xML, str8, (interfaceC54581xNrCopydefault3 == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault3.AhwBna(str7)) == null || (sizeDig = tradeCoinInfoAhwBna.getSizeDig()) == null) ? "" : sizeDig, str7, null, 8, null).fetchVPNInfo(), false, 1, null);
                InterfaceC54581xNr interfaceC54581xNrCopydefault4 = c54589xNz.copydefault();
                if (interfaceC54581xNrCopydefault4 == null) {
                    safeString$default3 = "";
                } else {
                    java.lang.String quoteSz = investBean.getQuoteSz();
                    if (quoteSz == null) {
                        quoteSz = "";
                    }
                    C54536xML c54536xMLKWHzl4 = interfaceC54581xNrCopydefault4.KWHzl(quoteCcy, quoteSz);
                    if (c54536xMLKWHzl4 == null || (c54536xMLFetchVPNInfo3 = c54536xMLKWHzl4.fetchVPNInfo()) == null || (safeString$default3 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo3, false, 1, null)) == null) {
                    }
                }
                arrayList.add(new SmartInvestData(str6, str7, str5, safeString$default5 + " + " + safeString$default3));
                obj = null;
            }
        } else {
            strAddS$default = "0";
        }
        C54589xNz c54589xNz2 = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault5 = c54589xNz2.copydefault();
        if (interfaceC54581xNrCopydefault5 != null && (c54536xMLKWHzl2 = interfaceC54581xNrCopydefault5.KWHzl(quoteCcy, this.EZpvd)) != null && (c54536xMLFetchVPNInfo2 = c54536xMLKWHzl2.fetchVPNInfo()) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null)) != null) {
            str2 = safeString$default2;
        }
        this.EZpvd = str2;
        if (C33129mqd.OLrzqt(strAddS$default, "0")) {
            safeString$default = "-- " + quoteCcy;
        } else {
            InterfaceC54581xNr interfaceC54581xNrCopydefault6 = c54589xNz2.copydefault();
            if (interfaceC54581xNrCopydefault6 == null || (c54536xMLKWHzl = interfaceC54581xNrCopydefault6.KWHzl(quoteCcy, strAddS$default)) == null || (c54536xMLFetchVPNInfo = c54536xMLKWHzl.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
                safeString$default = "-- " + quoteCcy;
            }
        }
        return new SmartInvestDetail(this.EZpvd, safeString$default, arrayList);
    }
}
