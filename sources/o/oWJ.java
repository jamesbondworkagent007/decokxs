package o;

import com.okinc.kline.library.layout.ChartArea;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import o.oUC;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oWJ {
    public static oUC.TaskDescription EZpvd = new oUC.TaskDescription() { // from class: o.oWJ.3
        @Override // o.oUC.TaskDescription
        public void OLrzqt(java.lang.Object obj, java.lang.Object obj2) {
            ChartArea chartArea = (ChartArea) obj;
            int[] iArr = (int[]) obj2;
            C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
            java.lang.String strAEQbTJ = chartArea.AEQbTJ();
            AbstractC36302oWt abstractC36302oWt = c36246oUrCopydefault.copydefault.get(strAEQbTJ + ".m");
            if (abstractC36302oWt instanceof C36307oWy) {
                chartArea.copydefault(iArr[0], ((C36307oWy) abstractC36302oWt).AhwBna());
            }
        }
    };
    public static int copydefault = 4;

    public abstract oWK AEQbTJ();

    public abstract void KWHzl(java.lang.String str);

    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        c36246oUrCopydefault.djBIcL(str, str2);
        c36246oUrCopydefault.DbNXlk();
        oVS ovs = new oVS(str + ".root");
        c36246oUrCopydefault.iwGUEr().values().put(ovs.AEQbTJ(), ovs);
        c36246oUrCopydefault.values().put(ovs.AEQbTJ(), ovs);
        oVX ovx = new oVX(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        ovx.OLrzqt(ChartArea.DockStyle.Fill);
        c36246oUrCopydefault.values().put(ovx.AEQbTJ(), ovx);
        ovs.EZpvd(ovx);
        KWHzl(str);
        c36246oUrCopydefault.zLjUOn().getThemes().put(str, AEQbTJ());
        pUU.KWHzl("ChartView", "loadTemplate themes = " + c36246oUrCopydefault.zLjUOn().getThemes());
        c36246oUrCopydefault.AhwBna(str);
        c36246oUrCopydefault.copydefault(str, (java.util.List<? extends oUO>) null);
    }

    public static void EZpvd(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        while (it.hasNext()) {
            KWHzl(str, it.next());
        }
    }

    public static void KWHzl(java.lang.String str, java.lang.String str2) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        oVX ovx = (oVX) c36246oUrCopydefault.values().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (ovx == null) {
            return;
        }
        java.lang.String str3 = str + ".indic" + str2;
        java.lang.String str4 = str3 + "Range";
        oVU ovu = new oVU(str3);
        ovu.KWHzl(java.lang.Boolean.TRUE);
        c36246oUrCopydefault.values().put(str3, ovu);
        ovx.EZpvd(ovu);
        ChartArea chartArea = new ChartArea(str4);
        c36246oUrCopydefault.values().put(str4, chartArea);
        ovx.EZpvd(chartArea);
        oUK ouk = new oUK(str3 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        c36246oUrCopydefault.iwGUEr().AkhnZx().put(ouk.AEQbTJ(), ouk);
        oUK ouk2 = new oUK(str3 + JwtUtilsKt.JWT_DELIMITER + "lt");
        c36246oUrCopydefault.iwGUEr().AkhnZx().put(ouk2.AEQbTJ(), ouk2);
        if (!c36246oUrCopydefault.AEQbTJ(str3, str2, false)) {
            c36246oUrCopydefault.AEQbTJ(str3, java.lang.Boolean.FALSE);
            return;
        }
        if (!c36246oUrCopydefault.valueOf(str3, str2)) {
            c36246oUrCopydefault.valueOf(str3);
            return;
        }
        C36283oWa c36283oWa = new C36283oWa(str3 + ".b");
        c36246oUrCopydefault.copydefault.put(c36283oWa.AEQbTJ(), c36283oWa);
        C36299oWq c36299oWq = new C36299oWq(str3 + ".g");
        c36246oUrCopydefault.copydefault.put(c36299oWq.AEQbTJ(), c36299oWq);
        C36295oWm c36295oWm = new C36295oWm(str3 + ".s");
        c36246oUrCopydefault.copydefault.put(c36295oWm.AEQbTJ(), c36295oWm);
        new C36295oWm(str3 + ".lt");
        C36296oWn c36296oWn = new C36296oWn(str3 + ".i");
        c36246oUrCopydefault.copydefault.put(c36296oWn.AEQbTJ(), c36296oWn);
        C36308oWz c36308oWz = new C36308oWz(str3 + ".t");
        c36246oUrCopydefault.copydefault.put(c36308oWz.AEQbTJ(), c36308oWz);
        C36303oWu c36303oWu = new C36303oWu(str3 + ".mask");
        c36246oUrCopydefault.copydefault.put(c36303oWu.AEQbTJ(), c36303oWu);
        oVY ovy = new oVY(str4 + ".b");
        c36246oUrCopydefault.copydefault.put(ovy.AEQbTJ(), ovy);
        C36305oWw c36305oWw = new C36305oWw(str4 + ".m");
        c36246oUrCopydefault.copydefault.put(c36305oWw.AEQbTJ(), c36305oWw);
    }

    public static void copydefault(java.lang.String str, java.lang.String str2) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        oVX ovx = (oVX) c36246oUrCopydefault.values().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (ovx == null) {
            return;
        }
        java.lang.String str3 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE + str2;
        java.lang.String str4 = str3 + "Range";
        oVU ovu = new oVU(str3);
        ovu.KWHzl(java.lang.Boolean.TRUE);
        c36246oUrCopydefault.values().put(str3, ovu);
        ovx.EZpvd(ovu);
        ChartArea chartArea = new ChartArea(str4);
        c36246oUrCopydefault.values().put(str4, chartArea);
        ovx.EZpvd(chartArea);
        oUK ouk = new oUK(str3 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        c36246oUrCopydefault.iwGUEr().AkhnZx().put(ouk.AEQbTJ(), ouk);
        oUK ouk2 = new oUK(str3 + JwtUtilsKt.JWT_DELIMITER + "lt");
        c36246oUrCopydefault.iwGUEr().AkhnZx().put(ouk2.AEQbTJ(), ouk2);
        if (!c36246oUrCopydefault.AEQbTJ(str3, str2, true)) {
            c36246oUrCopydefault.AEQbTJ(str3, java.lang.Boolean.FALSE);
            return;
        }
        if (!c36246oUrCopydefault.valueOf(str3, str2)) {
            c36246oUrCopydefault.valueOf(str3);
            return;
        }
        C36295oWm c36295oWm = new C36295oWm(str3 + ".s");
        c36246oUrCopydefault.copydefault.put(c36295oWm.AEQbTJ(), c36295oWm);
        C36305oWw c36305oWw = new C36305oWw(str4 + ".m");
        c36246oUrCopydefault.copydefault.put(c36305oWw.AEQbTJ(), c36305oWw);
    }
}
