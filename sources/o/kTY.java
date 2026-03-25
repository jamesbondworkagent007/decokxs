package o;

import androidx.camera.video.AudioStats;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dexlogic.bean.ChainInfoVO;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.TagExtraData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kTY {
    public static final DefiChainInfo EZpvd(@NotNull AGK agk) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List listAhwBna;
        java.util.List listAhwBna2;
        Intrinsics.checkNotNullParameter(agk, "");
        java.lang.String strGEmmrt = agk.KWHzl().gEmmrt();
        java.lang.String strAEQbTJ = agk.KWHzl().AEQbTJ();
        java.lang.String strCopydefault = agk.KWHzl().copydefault();
        java.lang.String strEZpvd = agk.KWHzl().EZpvd();
        java.lang.String strOLrzqt = agk.OLrzqt();
        java.lang.String str3 = strOLrzqt == null ? "0" : strOLrzqt;
        java.lang.String strAYXKKw = agk.KWHzl().AYXKKw();
        java.lang.String strAuCTel = agk.AuCTel();
        java.lang.String strAwvSrB = agk.AwvSrB();
        java.lang.String strDjBIcL = agk.KWHzl().djBIcL();
        java.lang.String strCopydefault2 = agk.copydefault();
        java.lang.String strDbNXlk = agk.DbNXlk();
        java.lang.String strZsXlph = agk.zsXlph();
        java.lang.String strValues = agk.KWHzl().values();
        java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(agk.ejfBZ());
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        java.lang.Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(agk.fIwbmz());
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        C4154AzW c4154AzWOLrzqt = agk.KWHzl().OLrzqt();
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVOOLrzqt = c4154AzWOLrzqt != null ? OLrzqt(c4154AzWOLrzqt) : null;
        java.lang.String strKWHzl = agk.KWHzl().KWHzl();
        java.util.List<java.lang.Long> listAEQbTJ = agk.AEQbTJ();
        if (listAEQbTJ == null) {
            str = "0";
            str2 = strAuCTel;
            listAhwBna = yDY.AhwBna();
        } else {
            str = "0";
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf((int) ((java.lang.Number) it.next()).longValue()));
                strAuCTel = strAuCTel;
            }
            str2 = strAuCTel;
            listAhwBna = arrayList;
        }
        java.util.List<C4136AzE> listEZpvd = agk.EZpvd();
        if (listEZpvd == null) {
            listAhwBna2 = yDY.AhwBna();
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            java.util.Iterator<T> it2 = listEZpvd.iterator();
            while (it2.hasNext()) {
                arrayList2.add(EZpvd((C4136AzE) it2.next()));
            }
            listAhwBna2 = arrayList2;
        }
        long jAYXKKw = agk.AYXKKw();
        java.lang.String strFIwbmz = agk.KWHzl().fIwbmz();
        long fieldNames = agk.KWHzl().getFieldNames();
        int iHDKMBd = (int) agk.KWHzl().hDKMBd();
        java.lang.String str4 = agk.gHZMYf() ? "1" : str;
        long jWlaJM = agk.wlaJM();
        java.lang.String str5 = agk.getNewProxyInstance() ? "1" : str;
        java.lang.String strAkhnZx = agk.AkhnZx();
        boolean newProxyInstance = agk.KWHzl().getNewProxyInstance();
        boolean zIwGUEr = agk.KWHzl().iwGUEr();
        boolean zAxsJAY = agk.AxsJAY();
        java.lang.String str6 = agk.KWHzl().AuCTel() ? "1" : str;
        boolean zIsConnected = agk.KWHzl().isConnected();
        java.lang.String strDbNXlk2 = agk.KWHzl().DbNXlk();
        boolean zIwGUEr2 = agk.iwGUEr();
        boolean zHDKMBd = agk.hDKMBd();
        boolean zFARcdN = agk.KWHzl().fARcdN();
        java.lang.String strFetchVPNInfo = agk.KWHzl().fetchVPNInfo();
        java.lang.String strAhwBna = agk.KWHzl().AhwBna();
        boolean zEjfBZ = agk.KWHzl().ejfBZ();
        long jAkhnZx = agk.KWHzl().AkhnZx();
        java.lang.String strFJNWhG = agk.fJNWhG();
        boolean zFJNWhG = agk.KWHzl().fJNWhG();
        boolean zValueOf = agk.KWHzl().valueOf();
        return new DefiChainInfo(strGEmmrt, strAEQbTJ, strCopydefault, strEZpvd, str3, strAYXKKw, 0, str2, strAwvSrB, strDjBIcL, strCopydefault2, strDbNXlk, strZsXlph, strValues, iIntValue, iIntValue2, dexDefaultFromToTokenShowVOOLrzqt, strKWHzl, listAhwBna, listAhwBna2, java.lang.String.valueOf(jAYXKKw), strFIwbmz, java.lang.String.valueOf(fieldNames), iHDKMBd, str4, java.lang.String.valueOf(jWlaJM), str5, strAkhnZx, (java.lang.String) null, newProxyInstance ? 1 : 0, zIwGUEr ? 1 : 0, zAxsJAY ? 1 : 0, str6, zIsConnected, strDbNXlk2, (java.lang.String) null, (java.lang.String) null, zIwGUEr2, zFARcdN, zHDKMBd, strFetchVPNInfo, strAhwBna, zEjfBZ, java.lang.String.valueOf(jAkhnZx), strFJNWhG, zFJNWhG, false, false, false, false, false, false, (java.lang.String) null, zValueOf, 268435520, 2080792, (DefaultConstructorMarker) null);
    }

    public static final DefiChainInfo KWHzl(@NotNull C4132AzA c4132AzA) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List listAhwBna;
        java.util.List listAhwBna2;
        Intrinsics.checkNotNullParameter(c4132AzA, "");
        java.lang.String strGEmmrt = c4132AzA.AEQbTJ().gEmmrt();
        java.lang.String strAEQbTJ = c4132AzA.AEQbTJ().AEQbTJ();
        java.lang.String strCopydefault = c4132AzA.AEQbTJ().copydefault();
        java.lang.String strEZpvd = c4132AzA.AEQbTJ().EZpvd();
        long jEZpvd = c4132AzA.EZpvd();
        java.lang.String strAYXKKw = c4132AzA.AEQbTJ().AYXKKw();
        java.lang.String strFJNWhG = c4132AzA.fJNWhG();
        java.lang.String strIwGUEr = c4132AzA.iwGUEr();
        java.lang.String strDjBIcL = c4132AzA.AEQbTJ().djBIcL();
        java.lang.String strOLrzqt = c4132AzA.OLrzqt();
        java.lang.String strDbNXlk = c4132AzA.DbNXlk();
        java.lang.String strFIwbmz = c4132AzA.fIwbmz();
        java.lang.String strValues = c4132AzA.AEQbTJ().values();
        java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(c4132AzA.values());
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        java.lang.Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(c4132AzA.fARcdN());
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        C4154AzW c4154AzWOLrzqt = c4132AzA.AEQbTJ().OLrzqt();
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVOOLrzqt = c4154AzWOLrzqt != null ? OLrzqt(c4154AzWOLrzqt) : null;
        java.lang.String strKWHzl = c4132AzA.AEQbTJ().KWHzl();
        java.util.List<java.lang.Long> listKWHzl = c4132AzA.KWHzl();
        if (listKWHzl == null) {
            str = strFJNWhG;
            str2 = strFIwbmz;
            listAhwBna = yDY.AhwBna();
        } else {
            str2 = strFIwbmz;
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                listAhwBna.add(java.lang.Integer.valueOf((int) ((java.lang.Number) it.next()).longValue()));
                strFJNWhG = strFJNWhG;
            }
            str = strFJNWhG;
        }
        java.util.List<C4136AzE> listCopydefault = c4132AzA.copydefault();
        if (listCopydefault == null) {
            listAhwBna2 = yDY.AhwBna();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            java.util.Iterator<T> it2 = listCopydefault.iterator();
            while (it2.hasNext()) {
                arrayList.add(EZpvd((C4136AzE) it2.next()));
            }
            listAhwBna2 = arrayList;
        }
        long jGEmmrt = c4132AzA.gEmmrt();
        java.lang.String strFIwbmz2 = c4132AzA.AEQbTJ().fIwbmz();
        long fieldNames = c4132AzA.AEQbTJ().getFieldNames();
        int iHDKMBd = (int) c4132AzA.AEQbTJ().hDKMBd();
        java.lang.String str3 = c4132AzA.getNewProxyInstance() ? "1" : "0";
        long jEjfBZ = c4132AzA.ejfBZ();
        java.lang.String str4 = c4132AzA.AuCTel() ? "1" : "0";
        java.lang.String strValueOf = c4132AzA.valueOf();
        boolean newProxyInstance = c4132AzA.AEQbTJ().getNewProxyInstance();
        boolean zIwGUEr = c4132AzA.AEQbTJ().iwGUEr();
        java.lang.String str5 = c4132AzA.AEQbTJ().AuCTel() ? "1" : "0";
        boolean zIsConnected = c4132AzA.AEQbTJ().isConnected();
        java.lang.String strDbNXlk2 = c4132AzA.AEQbTJ().DbNXlk();
        boolean zFARcdN = c4132AzA.AEQbTJ().fARcdN();
        java.lang.String strFetchVPNInfo = c4132AzA.AEQbTJ().fetchVPNInfo();
        java.lang.String strAhwBna = c4132AzA.AEQbTJ().AhwBna();
        boolean zEjfBZ = c4132AzA.AEQbTJ().ejfBZ();
        long jAkhnZx = c4132AzA.AEQbTJ().AkhnZx();
        boolean zFJNWhG = c4132AzA.AEQbTJ().fJNWhG();
        boolean zValueOf = c4132AzA.AEQbTJ().valueOf();
        return new DefiChainInfo(strGEmmrt, strAEQbTJ, strCopydefault, strEZpvd, java.lang.String.valueOf(jEZpvd), strAYXKKw, 0, str, strIwGUEr, strDjBIcL, strOLrzqt, strDbNXlk, str2, strValues, iIntValue, iIntValue2, dexDefaultFromToTokenShowVOOLrzqt, strKWHzl, listAhwBna, listAhwBna2, java.lang.String.valueOf(jGEmmrt), strFIwbmz2, java.lang.String.valueOf(fieldNames), iHDKMBd, str3, java.lang.String.valueOf(jEjfBZ), str4, strValueOf, (java.lang.String) null, newProxyInstance ? 1 : 0, zIwGUEr ? 1 : 0, 0, str5, zIsConnected, strDbNXlk2, (java.lang.String) null, (java.lang.String) null, false, zFARcdN, false, strFetchVPNInfo, strAhwBna, zEjfBZ, java.lang.String.valueOf(jAkhnZx), (java.lang.String) null, zFJNWhG, false, false, false, false, false, false, (java.lang.String) null, zValueOf, -1879048128, 2085048, (DefaultConstructorMarker) null);
    }

    public static final DefiChainInfo KWHzl(@NotNull AGE age) {
        Intrinsics.checkNotNullParameter(age, "");
        java.lang.String strGEmmrt = age.OLrzqt().gEmmrt();
        java.lang.String strAEQbTJ = age.OLrzqt().AEQbTJ();
        java.lang.String strCopydefault = age.OLrzqt().copydefault();
        java.lang.String strEZpvd = age.OLrzqt().EZpvd();
        long jEZpvd = age.EZpvd();
        java.lang.String strAYXKKw = age.OLrzqt().AYXKKw();
        java.lang.String strDjBIcL = age.OLrzqt().djBIcL();
        java.lang.String strValues = age.OLrzqt().values();
        C4154AzW c4154AzWOLrzqt = age.OLrzqt().OLrzqt();
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVOOLrzqt = c4154AzWOLrzqt != null ? OLrzqt(c4154AzWOLrzqt) : null;
        java.lang.String strKWHzl = age.OLrzqt().KWHzl();
        java.lang.String strFIwbmz = age.OLrzqt().fIwbmz();
        long fieldNames = age.OLrzqt().getFieldNames();
        int iHDKMBd = (int) age.OLrzqt().hDKMBd();
        boolean newProxyInstance = age.OLrzqt().getNewProxyInstance();
        boolean zIwGUEr = age.OLrzqt().iwGUEr();
        java.lang.String str = age.OLrzqt().AuCTel() ? "1" : "0";
        boolean zIsConnected = age.OLrzqt().isConnected();
        java.lang.String strDbNXlk = age.OLrzqt().DbNXlk();
        boolean zFARcdN = age.OLrzqt().fARcdN();
        java.lang.String strFetchVPNInfo = age.OLrzqt().fetchVPNInfo();
        java.lang.String strAhwBna = age.OLrzqt().AhwBna();
        boolean zEjfBZ = age.OLrzqt().ejfBZ();
        long jAkhnZx = age.OLrzqt().AkhnZx();
        boolean zFJNWhG = age.OLrzqt().fJNWhG();
        boolean zIsConnected2 = age.isConnected();
        boolean zFetchVPNInfo = age.fetchVPNInfo();
        boolean zEjfBZ2 = age.ejfBZ();
        boolean zAYXKKw = age.AYXKKw();
        boolean zValueOf = age.valueOf();
        boolean zUzCIH = age.uzCIH();
        long jAhwBna = age.AhwBna();
        return new DefiChainInfo(strGEmmrt, strAEQbTJ, strCopydefault, strEZpvd, java.lang.String.valueOf(jEZpvd), strAYXKKw, 0, (java.lang.String) null, (java.lang.String) null, strDjBIcL, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strValues, 0, 0, dexDefaultFromToTokenShowVOOLrzqt, strKWHzl, (java.util.List) null, (java.util.List) null, (java.lang.String) null, strFIwbmz, java.lang.String.valueOf(fieldNames), iHDKMBd, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, newProxyInstance ? 1 : 0, zIwGUEr ? 1 : 0, 0, str, zIsConnected, strDbNXlk, (java.lang.String) null, (java.lang.String) null, false, zFARcdN, false, strFetchVPNInfo, strAhwBna, zEjfBZ, java.lang.String.valueOf(jAkhnZx), (java.lang.String) null, zFJNWhG, zIsConnected2, zFetchVPNInfo, zEjfBZ2, zAYXKKw, zValueOf, zUzCIH, java.lang.String.valueOf(jAhwBna), age.OLrzqt().valueOf(), -1625498176, 4280, (DefaultConstructorMarker) null);
    }

    public static final ChainInfoVO EZpvd(C4136AzE c4136AzE) {
        java.lang.String strEZpvd = c4136AzE.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        return new ChainInfoVO(strEZpvd, c4136AzE.OLrzqt(), c4136AzE.KWHzl(), c4136AzE.AYXKKw() ? 1 : 0);
    }

    public static final DexDefaultFromToTokenShowVO OLrzqt(C4154AzW c4154AzW) {
        ABI abiOLrzqt = c4154AzW.OLrzqt();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = abiOLrzqt != null ? EZpvd(abiOLrzqt) : null;
        ABI abiKWHzl = c4154AzW.KWHzl();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd2 = abiKWHzl != null ? EZpvd(abiKWHzl) : null;
        ABI abiCopydefault = c4154AzW.copydefault();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd3 = abiCopydefault != null ? EZpvd(abiCopydefault) : null;
        ABI abiEZpvd = c4154AzW.EZpvd();
        return new DexDefaultFromToTokenShowVO(dexMultiTokenInfoBeanEZpvd, dexMultiTokenInfoBeanEZpvd2, dexMultiTokenInfoBeanEZpvd3, abiEZpvd != null ? EZpvd(abiEZpvd) : null, (DexMultiTokenInfoBean) null, 16, (DefaultConstructorMarker) null);
    }

    public static final DexMultiTokenInfoBean EZpvd(ABI abi) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i;
        java.lang.String str5;
        java.util.List listAhwBna;
        java.util.ArrayList arrayList;
        java.lang.String string;
        java.lang.Integer intOrNull;
        java.lang.Integer intOrNull2;
        long jAuCTel = abi.AuCTel();
        java.lang.String strEZpvd = abi.EZpvd();
        java.lang.String strAhwBna = abi.AhwBna();
        java.lang.String str6 = strAhwBna == null ? "" : strAhwBna;
        java.lang.String strQOLQEE = abi.QOLQEE();
        java.lang.String strSSMYrx = abi.sSMYrx();
        java.lang.String strQKVWgx = abi.QKVWgx();
        java.lang.String strZuBGHE = abi.zuBGHE();
        java.lang.String strAxsJAY = abi.AxsJAY();
        java.lang.String strFetchVPNInfo = abi.fetchVPNInfo();
        java.lang.String str7 = strFetchVPNInfo == null ? "" : strFetchVPNInfo;
        long jIsConnected = abi.isConnected();
        java.lang.String strUeEOUB = abi.UeEOUB();
        java.lang.String strValues = abi.values();
        if (strValues == null) {
            strValues = "";
        }
        java.lang.String str8 = strValues.length() == 0 ? "0.00" : strValues;
        long jAKErDB = abi.aKErDB();
        java.lang.String strOLrzqt = abi.OLrzqt();
        java.lang.String str9 = strOLrzqt.length() == 0 ? "0.00" : strOLrzqt;
        java.lang.String strWlaJM = abi.wlaJM();
        if (strWlaJM == null) {
            strWlaJM = "";
        }
        if (strWlaJM.length() == 0) {
            str2 = "";
            str = "0.00";
        } else {
            str = strWlaJM;
            str2 = "";
        }
        int iDjSkpj = (int) abi.djSkpj();
        java.lang.String strDjBIcL = abi.djBIcL();
        java.lang.String str10 = strDjBIcL == null ? str2 : strDjBIcL;
        java.lang.Long lFFgQHt = abi.fFgQHt();
        int iLongValue = lFFgQHt != null ? (int) lFFgQHt.longValue() : 0;
        java.lang.String strAEQbTJ = abi.AEQbTJ();
        java.lang.String str11 = strAEQbTJ == null ? str2 : strAEQbTJ;
        java.lang.Long lDNCPSb = abi.dNCPSb();
        int iLongValue2 = lDNCPSb != null ? (int) lDNCPSb.longValue() : 0;
        java.lang.String strZLjUOn = abi.zLjUOn();
        java.lang.String str12 = strZLjUOn == null ? str2 : strZLjUOn;
        java.lang.String strKWHzl = abi.KWHzl();
        java.lang.String str13 = strKWHzl == null ? str2 : strKWHzl;
        long jQfsBiF = abi.QfsBiF();
        java.lang.Long lOcIXYQ = abi.OcIXYQ();
        java.lang.String string2 = lOcIXYQ != null ? lOcIXYQ.toString() : null;
        java.lang.String str14 = string2 == null ? str2 : string2;
        java.lang.String strGEmmrt = abi.gEmmrt();
        if (strGEmmrt == null) {
            strGEmmrt = str2;
        }
        if (strGEmmrt.length() == 0) {
            str4 = strEZpvd;
            str3 = "0";
        } else {
            str3 = strGEmmrt;
            str4 = strEZpvd;
        }
        int iDxcTrN = (int) abi.dxcTrN();
        java.lang.String strQVAiDq = abi.QVAiDq();
        int iIntValue = (strQVAiDq == null || (intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(strQVAiDq)) == null) ? 1 : intOrNull2.intValue();
        java.lang.String strORxRYg = abi.ORxRYg();
        int iIntValue2 = (strORxRYg == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(strORxRYg)) == null) ? 0 : intOrNull.intValue();
        java.lang.String strUzCIH = abi.uzCIH();
        java.lang.String str15 = strUzCIH == null ? str2 : strUzCIH;
        java.lang.String strValueOf = abi.valueOf();
        java.lang.String str16 = strValueOf == null ? str2 : strValueOf;
        java.lang.String strQbewEr = abi.QbewEr();
        java.lang.String str17 = strQbewEr == null ? str2 : strQbewEr;
        java.lang.Long lRcXXUw = abi.RcXXUw();
        java.lang.String string3 = lRcXXUw != null ? lRcXXUw.toString() : null;
        java.lang.String str18 = string3 == null ? str2 : string3;
        boolean zDbNXlk = abi.DbNXlk();
        java.lang.String strAYXKKw = abi.AYXKKw();
        java.lang.Long lAuCTelauCTel = abi.AuCTelauCTel();
        java.lang.String string4 = lAuCTelauCTel != null ? lAuCTelauCTel.toString() : null;
        java.lang.String strHDKMBd = abi.hDKMBd();
        java.lang.String strCopydefault = abi.copydefault();
        java.lang.String strQUSxYX = abi.QUSxYX();
        java.lang.String strRJOkX = abi.RJOkX();
        java.lang.String strEjfBZ = abi.ejfBZ();
        java.lang.String strFJNWhG = abi.fJNWhG();
        java.lang.String str19 = strFJNWhG == null ? str2 : strFJNWhG;
        java.lang.String fieldNames = abi.getFieldNames();
        if (fieldNames == null) {
            fieldNames = str2;
        }
        java.lang.String str20 = fieldNames.length() == 0 ? "0" : fieldNames;
        java.lang.String strFARcdN = abi.fARcdN();
        java.lang.Long lFIwbmz = abi.fIwbmz();
        java.lang.String str21 = (lFIwbmz == null || (string = lFIwbmz.toString()) == null) ? "0" : string;
        java.util.List<java.lang.Long> listGHZMYf = abi.gHZMYf();
        if (listGHZMYf == null) {
            i = iDxcTrN;
            str5 = strUeEOUB;
            listAhwBna = yDY.AhwBna();
        } else {
            i = iDxcTrN;
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(listGHZMYf, 10));
            java.util.Iterator<T> it = listGHZMYf.iterator();
            while (it.hasNext()) {
                listAhwBna.add(java.lang.Integer.valueOf((int) ((java.lang.Number) it.next()).longValue()));
                strUeEOUB = strUeEOUB;
            }
            str5 = strUeEOUB;
        }
        java.util.List list = listAhwBna;
        java.util.List<AGM> listAwvSrB = abi.AwvSrB();
        if (listAwvSrB != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAwvSrB, 10));
            java.util.Iterator<T> it2 = listAwvSrB.iterator();
            while (it2.hasNext()) {
                arrayList.add(AEQbTJ((AGM) it2.next()));
            }
        } else {
            arrayList = null;
        }
        return new DexMultiTokenInfoBean(java.lang.String.valueOf(jAuCTel), str4, str6, strQOLQEE, strSSMYrx, strQKVWgx, strZuBGHE, strAxsJAY, str7, java.lang.String.valueOf(jIsConnected), str5, (java.lang.String) null, str8, AudioStats.AUDIO_AMPLITUDE_NONE, false, java.lang.String.valueOf(jAKErDB), str9, str, false, iDjSkpj, str10, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, iLongValue, str11, iLongValue2, str12, str13, java.lang.String.valueOf(jQfsBiF), str14, str3, i, iIntValue, iIntValue2, str15, str16, str17, (java.lang.String) null, (java.lang.String) null, str18, zDbNXlk, strAYXKKw, string4, strHDKMBd, strCopydefault, strQUSxYX, strRJOkX, strEjfBZ, str19, arrayList == null ? yDY.AhwBna() : arrayList, str20, (java.lang.String) null, strFARcdN, (java.lang.String) null, str21, (java.lang.String) null, list, (TokenInfoForApp) null, 14968832, 89129152, (DefaultConstructorMarker) null);
    }

    public static final CompactTagData AEQbTJ(AGM agm) {
        StringBooleanType stringBooleanType;
        TagExtraData tagExtraData;
        java.lang.String strAEQbTJ = agm.AEQbTJ();
        if (agm.KWHzl() == 1) {
            stringBooleanType = StringBooleanType.TRUE;
        } else {
            stringBooleanType = StringBooleanType.FALSE;
        }
        ABK abkCopydefault = agm.copydefault();
        if (abkCopydefault == null || (tagExtraData = AEQbTJ(abkCopydefault)) == null) {
            tagExtraData = new TagExtraData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (StringBooleanType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
        }
        return new CompactTagData(strAEQbTJ, stringBooleanType, tagExtraData);
    }

    public static final TagExtraData AEQbTJ(ABK abk) {
        java.lang.String strDjBIcL = abk.djBIcL();
        java.lang.String str = strDjBIcL == null ? "" : strDjBIcL;
        java.lang.String strOLrzqt = abk.OLrzqt();
        java.lang.String str2 = strOLrzqt == null ? "" : strOLrzqt;
        java.lang.String strEZpvd = abk.EZpvd();
        java.lang.String str3 = strEZpvd == null ? "" : strEZpvd;
        java.lang.String strAEQbTJ = abk.AEQbTJ();
        java.lang.String str4 = strAEQbTJ == null ? "" : strAEQbTJ;
        java.lang.String strValueOf = abk.valueOf();
        java.lang.String str5 = strValueOf == null ? "" : strValueOf;
        java.lang.String strAYXKKw = abk.AYXKKw();
        StringBooleanType stringBooleanType = StringBooleanType.TRUE;
        return new TagExtraData(str, str2, str3, str4, str5, Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) stringBooleanType.getValue()) ? stringBooleanType : StringBooleanType.FALSE, abk.KWHzl(), (java.lang.String) null, (java.lang.String) null, MLKEMEngine.KyberPolyBytes, (DefaultConstructorMarker) null);
    }
}
