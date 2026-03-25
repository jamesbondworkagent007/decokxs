package o;

import com.okinc.kline.library.layout.ChartArea;
import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: loaded from: classes8.dex */
public class oWH extends oWJ {
    public final java.lang.String AEQbTJ = "ChartView";

    @Override // o.oWJ
    public oWK AEQbTJ() {
        return new oWG();
    }

    @Override // o.oWJ
    public void KWHzl(java.lang.String str) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        AEQbTJ(str);
        oWJ.EZpvd(str, c36246oUrCopydefault.KWHzl(str).getSideIndicatorNames());
        EZpvd(str, c36246oUrCopydefault.KWHzl(str).getTimelineScale());
    }

    public void AEQbTJ(java.lang.String str) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        oVX ovx = (oVX) c36246oUrCopydefault.values().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (ovx == null) {
            return;
        }
        java.lang.String str2 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE;
        java.lang.String str3 = str2 + "Range";
        oVW ovw = new oVW(str2);
        ovw.KWHzl(java.lang.Boolean.TRUE);
        c36246oUrCopydefault.values().put(str2, ovw);
        ovx.EZpvd(ovw);
        ChartArea chartArea = new ChartArea(str3);
        c36246oUrCopydefault.values().put(str3, chartArea);
        ovx.EZpvd(chartArea);
        oUM oum = new oUM(str2 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        c36246oUrCopydefault.iwGUEr().AkhnZx().put(oum.AEQbTJ(), oum);
        oWB owb = new oWB(str2);
        owb.AEQbTJ("PRICE");
        c36246oUrCopydefault.iwGUEr().QVAiDq().put(owb.AEQbTJ(), owb);
        owb.OLrzqt(AbstractC36302oWt.copydefault(14.0f));
        owb.KWHzl(AbstractC36302oWt.copydefault(14.0f));
        C36283oWa c36283oWa = new C36283oWa(str2 + ".b");
        c36246oUrCopydefault.copydefault.put(c36283oWa.AEQbTJ(), c36283oWa);
        C36299oWq c36299oWq = new C36299oWq(str2 + ".g");
        c36246oUrCopydefault.copydefault.put(c36299oWq.AEQbTJ(), c36299oWq);
        C36303oWu c36303oWu = new C36303oWu(str2 + ".mask");
        c36246oUrCopydefault.copydefault.put(c36303oWu.AEQbTJ(), c36303oWu);
        C36293oWk c36293oWk = new C36293oWk(str2 + ".dl");
        c36246oUrCopydefault.copydefault.put(c36293oWk.AEQbTJ(), c36293oWk);
        C36287oWe c36287oWe = new C36287oWe(str2 + ".m");
        c36246oUrCopydefault.copydefault.put(c36287oWe.AEQbTJ(), c36287oWe);
        C36300oWr c36300oWr = new C36300oWr(str2 + ".i");
        c36246oUrCopydefault.copydefault.put(c36300oWr.AEQbTJ(), c36300oWr);
        C36286oWd c36286oWd = new C36286oWd(str2 + ".d");
        c36246oUrCopydefault.copydefault.put(c36286oWd.AEQbTJ(), c36286oWd);
        oWA owa = new oWA(str2 + ".t");
        c36246oUrCopydefault.copydefault.put(owa.AEQbTJ(), owa);
        C36290oWh c36290oWh = new C36290oWh(str2 + ".ylb");
        c36246oUrCopydefault.copydefault.put(c36290oWh.AEQbTJ(), c36290oWh);
        C36294oWl c36294oWl = new C36294oWl(str2 + ".et");
        c36246oUrCopydefault.copydefault.put(c36294oWl.AEQbTJ(), c36294oWl);
        C36298oWp c36298oWp = new C36298oWp(str2 + ".fk");
        c36246oUrCopydefault.copydefault.put(c36298oWp.AEQbTJ(), c36298oWp);
        C36291oWi c36291oWi = new C36291oWi(str2 + ".de");
        c36246oUrCopydefault.copydefault.put(c36291oWi.AEQbTJ(), c36291oWi);
        C36285oWc c36285oWc = new C36285oWc(str2 + ".bo");
        c36246oUrCopydefault.copydefault.put(c36285oWc.AEQbTJ(), c36285oWc);
        C36306oWx c36306oWx = new C36306oWx(str2 + ".qop");
        c36246oUrCopydefault.copydefault.put(c36306oWx.AEQbTJ(), c36306oWx);
        C36288oWf c36288oWf = new C36288oWf(str2 + ".bpl");
        c36246oUrCopydefault.copydefault.put(c36288oWf.AEQbTJ(), c36288oWf);
        c36246oUrCopydefault.KWHzl(str, c36246oUrCopydefault.KWHzl(str).getMainIndicatorNames());
        oVY ovy = new oVY(str3 + ".b");
        c36246oUrCopydefault.copydefault.put(ovy.AEQbTJ(), ovy);
        C36305oWw c36305oWw = new C36305oWw(str3 + ".m");
        c36246oUrCopydefault.copydefault.put(c36305oWw.AEQbTJ(), c36305oWw);
        c36305oWw.KWHzl(true);
        oWJ.copydefault(str, "VOLUME");
    }

    public void EZpvd(java.lang.String str, int i) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        oVX ovx = (oVX) c36246oUrCopydefault.values().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (ovx == null) {
            pUU.copydefault("ChartView", "createTimelineComps: tableLayout = null");
            return;
        }
        java.lang.String str2 = str + JwtUtilsKt.JWT_DELIMITER + "t";
        ChartArea chartArea = new ChartArea(str2);
        c36246oUrCopydefault.values().put(str2, chartArea);
        ovx.AEQbTJ(chartArea);
        oWN own = new oWN(str);
        if (i >= 0) {
            own.AEQbTJ(i);
        }
        c36246oUrCopydefault.DCJXGO().put(own.AEQbTJ(), own);
        java.lang.String str3 = str + JwtUtilsKt.JWT_DELIMITER + "t";
        oVZ ovz = new oVZ(str3 + ".b");
        c36246oUrCopydefault.copydefault.put(ovz.AEQbTJ(), ovz);
        C36307oWy c36307oWy = new C36307oWy(str3 + ".m");
        c36246oUrCopydefault.copydefault.put(c36307oWy.AEQbTJ(), c36307oWy);
        oWE owe = new oWE(str3 + ".t");
        c36246oUrCopydefault.copydefault.put(owe.AEQbTJ(), owe);
        C36292oWj c36292oWj = new C36292oWj(str3 + ".xlb");
        c36246oUrCopydefault.copydefault.put(c36292oWj.AEQbTJ(), c36292oWj);
        C36303oWu c36303oWu = new C36303oWu(str3 + ".mask");
        c36246oUrCopydefault.copydefault.put(c36303oWu.AEQbTJ(), c36303oWu);
    }
}
