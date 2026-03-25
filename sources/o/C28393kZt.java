package o;

import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28393kZt {
    public static final C28393kZt AEQbTJ = new C28393kZt();

    private C28393kZt() {
    }

    public final DexMultiTokenInfoBean OLrzqt(@NotNull AGP agp) {
        Intrinsics.checkNotNullParameter(agp, "");
        long jFIwbmz = agp.fIwbmz();
        java.lang.String strDjBIcL = agp.djBIcL();
        java.lang.String strAhwBna = agp.AhwBna();
        java.lang.String strSSMYrx = agp.sSMYrx();
        java.lang.String strAxsJAY = agp.AxsJAY();
        java.lang.String strQKVWgx = agp.QKVWgx();
        java.lang.String strAuCTelauCTel = agp.AuCTelauCTel();
        java.lang.String strZuBGHE = agp.zuBGHE();
        java.lang.String strDbNXlk = agp.DbNXlk();
        int iGHZMYf = agp.gHZMYf();
        java.lang.String strValueOf = agp.valueOf();
        java.lang.String strGEmmrt = agp.gEmmrt();
        java.lang.String strAwvSrB = agp.AwvSrB();
        java.lang.String strFetchVPNInfo = agp.fetchVPNInfo();
        java.lang.String strEjfBZ = agp.ejfBZ();
        java.lang.String strAuCTel = agp.AuCTel();
        java.lang.String strDTwDnp = agp.DTwDnp();
        java.lang.String strQOLQEE = agp.QOLQEE();
        java.lang.String strEZpvd = agp.EZpvd();
        java.lang.String strWlaJM = agp.wlaJM();
        double dOLrzqt = agp.OLrzqt();
        java.lang.String strZLjUOn = agp.zLjUOn();
        java.lang.String strCopydefault = agp.copydefault();
        java.lang.String strAEQbTJ = agp.AEQbTJ();
        java.lang.String str = agp.UeEOUB() != 0 ? "1" : "0";
        java.lang.String str2 = agp.RJOkX() != 0 ? "1" : "0";
        int iQbewEr = agp.QbewEr();
        java.lang.String str3 = agp.QVAiDq() != 0 ? "1" : "0";
        int iQUSxYX = agp.QUSxYX();
        java.lang.String str4 = agp.QfsBiF() != 0 ? "1" : "0";
        int iDNCPSb = agp.dNCPSb();
        int iOcIXYQ = agp.OcIXYQ();
        int iRcXXUw = agp.RcXXUw();
        int iAKErDB = agp.aKErDB();
        boolean zAkhnZx = agp.AkhnZx();
        java.lang.String strUzCIH = agp.uzCIH();
        java.lang.String strAYXKKw = agp.AYXKKw();
        java.lang.String newProxyInstance = agp.getNewProxyInstance();
        int iORxRYg = agp.ORxRYg();
        java.lang.String strIsConnected = agp.isConnected();
        java.lang.String strAubY = agp.AubY();
        return new DexMultiTokenInfoBean(java.lang.String.valueOf(jFIwbmz), strDjBIcL, strAhwBna, strSSMYrx, strAxsJAY, strQKVWgx, strAuCTelauCTel, strZuBGHE, strDbNXlk, java.lang.String.valueOf(iGHZMYf), str, strEZpvd, strZLjUOn, dOLrzqt, false, str3, strWlaJM, (java.lang.String) null, false, iQbewEr, strValueOf, java.lang.Integer.valueOf(iAKErDB), agp.hDKMBd(), agp.getFieldNames(), iDNCPSb, strGEmmrt, iQUSxYX, newProxyInstance, strAYXKKw, str2, strQOLQEE, strIsConnected, iRcXXUw, iOcIXYQ, iORxRYg, strAwvSrB, strFetchVPNInfo, strDTwDnp, strAEQbTJ, strCopydefault, str4, zAkhnZx, (java.lang.String) null, strAubY, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strAuCTel, (java.util.List) null, strUzCIH, (java.lang.String) null, strEjfBZ, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, 409600, 131462144, (DefaultConstructorMarker) null);
    }

    public final java.util.List<ChainTokensData> copydefault(@NotNull java.util.List<C4150AzS> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C4150AzS c4150AzS : list) {
            java.lang.String strOLrzqt = c4150AzS.OLrzqt();
            java.lang.String strAEQbTJ = c4150AzS.AEQbTJ();
            boolean zKWHzl = c4150AzS.KWHzl();
            java.lang.String strCopydefault = c4150AzS.copydefault();
            java.util.List<AGP> listAYXKKw = c4150AzS.AYXKKw();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
            java.util.Iterator<T> it = listAYXKKw.iterator();
            while (it.hasNext()) {
                arrayList2.add(AEQbTJ.OLrzqt((AGP) it.next()));
            }
            arrayList.add(new ChainTokensData(strOLrzqt, strAEQbTJ, zKWHzl, strCopydefault, arrayList2));
        }
        return arrayList;
    }
}
