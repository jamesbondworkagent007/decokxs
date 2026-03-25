package o;

import com.okinc.business.market.common.constants.RiskControlLevel;
import com.okinc.business.market.data.model.holdings.HoldingData;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28433kag {
    @yCM
    public C28433kag() {
    }

    public final HoldingAsset EZpvd(@NotNull final HoldingData holdingData) {
        Intrinsics.checkNotNullParameter(holdingData, "");
        java.lang.String strAEQbTJ = holdingData.AEQbTJ();
        java.lang.String strCopydefault = holdingData.copydefault();
        java.lang.String strIwGUEr = holdingData.iwGUEr();
        java.lang.String newProxyInstance = holdingData.getNewProxyInstance();
        java.lang.String strUzCIH = holdingData.uzCIH();
        java.lang.String strEjfBZ = holdingData.ejfBZ();
        java.lang.String strEZpvd = holdingData.EZpvd();
        java.lang.String strOLrzqt = holdingData.OLrzqt();
        java.lang.String strKWHzl = holdingData.KWHzl();
        java.lang.String strDjBIcL = holdingData.djBIcL();
        java.lang.String strAhwBna = holdingData.AhwBna();
        java.lang.String strValueOf = holdingData.valueOf();
        boolean zAYXKKw = holdingData.AYXKKw();
        boolean zGEmmrt = holdingData.gEmmrt();
        java.lang.String strAkhnZx = holdingData.AkhnZx();
        boolean zIsConnected = holdingData.isConnected();
        boolean zFetchVPNInfo = holdingData.fetchVPNInfo();
        java.lang.String strDbNXlk = holdingData.DbNXlk();
        java.lang.String strValues = holdingData.values();
        java.lang.String strFARcdN = holdingData.fARcdN();
        RiskControlLevel riskControlLevelCopydefault = RiskControlLevel.Companion.copydefault(holdingData.fIwbmz());
        java.lang.Boolean boolFJNWhG = holdingData.fJNWhG();
        boolean zBooleanValue = boolFJNWhG != null ? boolFJNWhG.booleanValue() : false;
        java.lang.String strKWHzl2 = C31256lqb.KWHzl(holdingData.AuCTel(), (Function0<java.lang.String>) new Function0() { // from class: o.kaj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28433kag.copydefault(holdingData);
            }
        });
        java.lang.String fieldNames = holdingData.getFieldNames();
        java.lang.String strHDKMBd = holdingData.hDKMBd();
        java.lang.String strZsXlph = holdingData.zsXlph();
        java.lang.String strAuCTelauCTel = holdingData.AuCTelauCTel();
        java.lang.String strWlaJM = holdingData.wlaJM();
        java.lang.String strZLjUOn = holdingData.zLjUOn();
        java.lang.Boolean boolAubY = holdingData.AubY();
        return new HoldingAsset(strAEQbTJ, strCopydefault, strIwGUEr, newProxyInstance, strUzCIH, strEjfBZ, strEZpvd, strOLrzqt, strKWHzl, strDjBIcL, strAhwBna, strValueOf, zAYXKKw, zGEmmrt, strAkhnZx, zIsConnected, zFetchVPNInfo, zBooleanValue, strDbNXlk, strValues, strFARcdN, riskControlLevelCopydefault, strKWHzl2, fieldNames, strHDKMBd, strZsXlph, strAuCTelauCTel, strWlaJM, strZLjUOn, false, boolAubY != null ? boolAubY.booleanValue() : false, 536870912, null);
    }

    public static final java.lang.String copydefault(HoldingData holdingData) {
        return holdingData.EZpvd();
    }
}
