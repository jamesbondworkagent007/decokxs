package o;

import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EstimateTime;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EvmSignInfoGasPrice;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C12792ctf;
import o.C9215bRQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bTG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9311bTG extends AbstractC9346bTp {
    public java.lang.String AuCTel;
    public java.lang.String ejfBZ;
    public java.lang.String fARcdN;
    public java.lang.String fIwbmz;
    public final InterfaceC8931bLy fJNWhG;
    public final InterfaceC56387yDm hDKMBd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AwvSrB() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8931bLy gHZMYf() {
        return this.fJNWhG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9311bTG(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC8931bLy interfaceC8931bLy) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC8931bLy, "");
        this.fJNWhG = interfaceC8931bLy;
        this.hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.bTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C9311bTG.AubY();
            }
        });
    }

    private final C12792ctf AuCTel() {
        return (C12792ctf) this.hDKMBd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C12792ctf AubY() {
        return new C12792ctf();
    }

    public final java.lang.String zuBGHE() {
        return C33129mqd.OLrzqt((java.lang.CharSequence) this.AuCTel) ? this.AuCTel : "1";
    }

    @Override // o.AbstractC8485bDc
    public void AEQbTJ(int i) {
        OLrzqt((java.lang.String) null);
        KWHzl((java.lang.String) null);
        copydefault((java.lang.String) null);
        EZpvd((java.lang.String) null);
        KWHzl(4);
    }

    @Override // o.AbstractC9346bTp
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        super.AEQbTJ(str, str2, z, z2);
        copydefault(str);
        EZpvd(str2);
        OLrzqt(4);
        KWHzl(4);
    }

    @Override // o.AbstractC9346bTp
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        super.OLrzqt(str, str2, str3, z, z2);
        OLrzqt(str);
        KWHzl(str2);
        copydefault(C54862xYb.convertToString$default(C54862xYb.KWHzl(str, str2), false, null, null, 7, null));
        EZpvd(str3);
        OLrzqt(4);
        KWHzl(4);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        this.ejfBZ = str;
        this.AuCTel = str2;
        KWHzl(4);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(I)Lo/bDi; */
    @Override // o.AbstractC8485bDc
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public C9215bRQ EZpvd(int i) {
        return calFeeItemInfo$default(this, i, false, null, null, null, null, 62, null);
    }

    @Override // o.AbstractC8426bCW
    public java.util.List<C9215bRQ> OLrzqt() {
        return yDY.gEmmrt(EZpvd(31), EZpvd(32), EZpvd(33), EZpvd(4));
    }

    @Override // o.AbstractC9346bTp
    public C9215bRQ copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return calFeeItemInfo$default(this, 4, true, str, null, null, str2, 24, null);
    }

    @Override // o.AbstractC9346bTp
    public C9215bRQ AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return OLrzqt(4, true, C54862xYb.convertToString$default(C54862xYb.KWHzl(str, str2), false, null, null, 7, null), str, str2, str3);
    }

    public static /* synthetic */ C9215bRQ calFeeItemInfo$default(C9311bTG c9311bTG, int i, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calFeeItemInfo");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c9311bTG.OLrzqt(i, z, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4);
    }

    public final C9215bRQ OLrzqt(int i, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws CoinMetaError {
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        java.lang.String strFJNWhG;
        int i2;
        java.lang.String strAYXKKw;
        java.lang.String strValueOf;
        java.lang.String strAkhnZx;
        java.lang.String strAhwBna;
        java.lang.String strGEmmrt;
        java.lang.String strDjBIcL;
        java.lang.String strDbNXlk = str4;
        if (z) {
            strOLrzqt = OLrzqt(str == null ? "" : str, strDbNXlk);
            strOLrzqt2 = strOLrzqt;
        } else {
            strOLrzqt = OLrzqt(gEmmrt(i), djBIcL(i));
            strOLrzqt2 = OLrzqt(AhwBna(i), DbNXlk(i));
        }
        if (z) {
            i2 = i;
            strFJNWhG = str;
        } else {
            strFJNWhG = fJNWhG();
            i2 = i;
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = OLrzqt(i2, strFJNWhG);
        C10854bwM c10854bwMAYXKKw = AYXKKw();
        java.lang.String first = pairOLrzqt.getFirst();
        java.lang.String second = pairOLrzqt.getSecond();
        boolean zHDKMBd = this.fJNWhG.hDKMBd();
        if (z) {
            strAYXKKw = str2 == null ? "" : str2;
        } else {
            strAYXKKw = AYXKKw(i);
        }
        if (z) {
            strValueOf = str2 == null ? "" : str2;
        } else {
            strValueOf = valueOf(i);
        }
        if (z) {
            strAkhnZx = str3 == null ? "" : str3;
        } else {
            strAkhnZx = AkhnZx(i);
        }
        if (z) {
            strAhwBna = str == null ? "" : str;
        } else {
            strAhwBna = AhwBna(i);
        }
        if (z) {
            strGEmmrt = str == null ? "" : str;
        } else {
            strGEmmrt = gEmmrt(i);
        }
        java.lang.String suggestBaseFee = this.fJNWhG.isConnected().getSuggestBaseFee();
        java.lang.String str5 = suggestBaseFee == null ? "" : suggestBaseFee;
        java.lang.String minGasPrice = this.fJNWhG.isConnected().getMinGasPrice();
        C9215bRQ.ActionBar actionBar = new C9215bRQ.ActionBar(zHDKMBd, strAYXKKw, strValueOf, strAkhnZx, strAhwBna, strGEmmrt, str5, minGasPrice == null ? "" : minGasPrice);
        if (z) {
            strDjBIcL = strDbNXlk == null ? "" : strDbNXlk;
        } else {
            strDjBIcL = djBIcL(i);
        }
        if (!z) {
            strDbNXlk = DbNXlk(i);
        } else if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        return new C9215bRQ(i, c10854bwMAYXKKw, strOLrzqt, first, second, strOLrzqt2, actionBar, new C9215bRQ.Activity(strDjBIcL, strDbNXlk, AhwBna(this.fJNWhG.fetchVPNInfo().getMinGasLimit()), AhwBna(this.fJNWhG.fetchVPNInfo().getMaxGasLimit())), getNewProxyInstance());
    }

    public java.lang.String OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalOLrzqt = C54862xYb.OLrzqt(str, str2);
        java.lang.String strDbNXlk = this.fJNWhG.DbNXlk();
        if (strDbNXlk != null) {
            bigDecimalOLrzqt = C54862xYb.KWHzl(bigDecimalOLrzqt, strDbNXlk);
        }
        int iFIwbmz = this.fJNWhG.fIwbmz();
        if (iFIwbmz > 1) {
            bigDecimalOLrzqt = C54862xYb.OLrzqt(bigDecimalOLrzqt, java.lang.Integer.valueOf(iFIwbmz));
        }
        return C54862xYb.convertToBigIntegerString$default(bigDecimalOLrzqt, false, RoundingMode.UP, 1, (java.lang.Object) null);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(int i, java.lang.String str) {
        java.lang.String strWeiToGwei$default;
        java.lang.String min;
        java.lang.String strWeiToGwei$default2;
        java.lang.String normal;
        java.lang.String strWeiToGwei$default3;
        java.lang.String max;
        java.lang.String strWeiToGwei$default4;
        java.util.ArrayList arrayList;
        java.lang.String str2;
        if (i != 4) {
            switch (i) {
                case 31:
                    java.lang.String maxCost = this.fJNWhG.isConnected().getMaxCost();
                    str2 = maxCost != null ? maxCost : "";
                    return C56390yDp.OLrzqt(str2, AuCTel().EZpvd(str2, false));
                case 32:
                    java.lang.String normalCost = this.fJNWhG.isConnected().getNormalCost();
                    str2 = normalCost != null ? normalCost : "";
                    return C56390yDp.OLrzqt(str2, AuCTel().EZpvd(str2, false));
                case 33:
                    java.lang.String minCost = this.fJNWhG.isConnected().getMinCost();
                    str2 = minCost != null ? minCost : "";
                    return C56390yDp.OLrzqt(str2, AuCTel().EZpvd(str2, false));
                default:
                    return C56390yDp.OLrzqt("", "");
            }
        }
        int iValueOf = uzCIH().dHguZz().valueOf();
        EvmSignInfoGasPrice evmSignInfoGasPriceIsConnected = this.fJNWhG.isConnected();
        C12792ctf c12792ctfAuCTel = AuCTel();
        if (str == null || (strWeiToGwei$default = C54869xYi.weiToGwei$default(str, java.lang.Integer.valueOf(iValueOf), false, null, false, 8, null)) == null) {
            strWeiToGwei$default = "";
        }
        if (this.fJNWhG.hDKMBd()) {
            min = evmSignInfoGasPriceIsConnected.getOriMin();
        } else {
            min = evmSignInfoGasPriceIsConnected.getMin();
        }
        java.lang.String str3 = min;
        if (str3 == null || (strWeiToGwei$default2 = C54869xYi.weiToGwei$default(str3, java.lang.Integer.valueOf(iValueOf), false, null, false, 8, null)) == null) {
            strWeiToGwei$default2 = "";
        }
        if (this.fJNWhG.hDKMBd()) {
            normal = evmSignInfoGasPriceIsConnected.getOriNormal();
        } else {
            normal = evmSignInfoGasPriceIsConnected.getNormal();
        }
        java.lang.String str4 = normal;
        if (str4 == null || (strWeiToGwei$default3 = C54869xYi.weiToGwei$default(str4, java.lang.Integer.valueOf(iValueOf), false, null, false, 8, null)) == null) {
            strWeiToGwei$default3 = "";
        }
        if (this.fJNWhG.hDKMBd()) {
            max = evmSignInfoGasPriceIsConnected.getOriMax();
        } else {
            max = evmSignInfoGasPriceIsConnected.getMax();
        }
        java.lang.String str5 = max;
        if (str5 == null || (strWeiToGwei$default4 = C54869xYi.weiToGwei$default(str5, java.lang.Integer.valueOf(iValueOf), false, null, false, 8, null)) == null) {
            strWeiToGwei$default4 = "";
        }
        java.lang.String minCost2 = evmSignInfoGasPriceIsConnected.getMinCost();
        java.lang.String normalCost2 = evmSignInfoGasPriceIsConnected.getNormalCost();
        java.lang.String maxCost2 = evmSignInfoGasPriceIsConnected.getMaxCost();
        java.util.List<EstimateTime> estimateTimeList = evmSignInfoGasPriceIsConnected.getEstimateTimeList();
        if (estimateTimeList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(estimateTimeList, 10));
            for (EstimateTime estimateTime : estimateTimeList) {
                java.lang.String gas = estimateTime.getGas();
                arrayList2.add(new C12792ctf.Activity(gas != null ? C54869xYi.weiToGwei$default(gas, java.lang.Integer.valueOf(iValueOf), false, null, false, 12, null) : null, estimateTime.getTime()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        C12792ctf.Application applicationKWHzl = c12792ctfAuCTel.KWHzl(strWeiToGwei$default, strWeiToGwei$default2, strWeiToGwei$default3, strWeiToGwei$default4, minCost2, normalCost2, maxCost2, arrayList);
        java.lang.String strCopydefault = applicationKWHzl.copydefault();
        return C56390yDp.OLrzqt(strCopydefault != null ? strCopydefault : "", AuCTel().copydefault(applicationKWHzl, false));
    }

    public static /* synthetic */ java.lang.String getGasPrice$default(C9311bTG c9311bTG, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGasPrice");
        }
        if ((i2 & 1) != 0) {
            i = c9311bTG.DbNXlk();
        }
        return c9311bTG.gEmmrt(i);
    }

    public java.lang.String gEmmrt(int i) {
        java.lang.String strFJNWhG;
        java.lang.String str = this.fIwbmz;
        if (str != null) {
            return str;
        }
        if (i == 4) {
            strFJNWhG = fJNWhG();
        } else {
            switch (i) {
                case 31:
                    strFJNWhG = EZpvd(this.fJNWhG.isConnected().getMin(), this.fJNWhG.isConnected().getSafePriorityFee());
                    break;
                case 32:
                    strFJNWhG = EZpvd(this.fJNWhG.isConnected().getNormal(), this.fJNWhG.isConnected().getProposePriorityFee());
                    break;
                case 33:
                    strFJNWhG = EZpvd(this.fJNWhG.isConnected().getMax(), this.fJNWhG.isConnected().getFastPriorityFee());
                    break;
                default:
                    strFJNWhG = null;
                    break;
            }
        }
        java.lang.String str2 = strFJNWhG;
        return str2 == null ? "" : str2;
    }

    public final java.lang.String AhwBna(int i) {
        if (this.fJNWhG.hDKMBd()) {
            return C54862xYb.convertToString$default(C54862xYb.KWHzl(valueOf(i), AkhnZx(i)), false, null, null, 7, null);
        }
        return gEmmrt(i);
    }

    public final java.lang.String AYXKKw(int i) {
        java.lang.String baseFee;
        if (i == 4) {
            baseFee = zLjUOn();
        } else {
            baseFee = this.fJNWhG.isConnected().getBaseFee();
        }
        return baseFee == null ? "0" : baseFee;
    }

    public final java.lang.String valueOf(int i) {
        java.lang.String baseFee;
        if (i == 4 && C33129mqd.valueOf(zLjUOn(), this.fJNWhG.isConnected().getBaseFee())) {
            baseFee = zLjUOn();
        } else {
            baseFee = this.fJNWhG.isConnected().getBaseFee();
        }
        return baseFee == null ? "0" : baseFee;
    }

    public static /* synthetic */ java.lang.String getPriorityFee$default(C9311bTG c9311bTG, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPriorityFee");
        }
        if ((i2 & 1) != 0) {
            i = c9311bTG.DbNXlk();
        }
        return c9311bTG.AkhnZx(i);
    }

    public final java.lang.String AkhnZx(int i) {
        java.lang.String str = this.fARcdN;
        if (str != null) {
            return str;
        }
        if (i == 4) {
            return zsXlph();
        }
        switch (i) {
            case 31:
                return valueOf(this.fJNWhG.isConnected().getSafePriorityFee());
            case 32:
                return valueOf(this.fJNWhG.isConnected().getProposePriorityFee());
            case 33:
                return valueOf(this.fJNWhG.isConnected().getFastPriorityFee());
            default:
                return null;
        }
    }

    @Override // o.AbstractC9346bTp
    public java.lang.String djBIcL(int i) {
        return AhwBna(values(i));
    }

    private final java.lang.String DbNXlk(int i) {
        java.lang.String strValues = values(i);
        if (!C33129mqd.valueOf(strValues, this.fJNWhG.fetchVPNInfo().getOriginGasLimit())) {
            strValues = this.fJNWhG.fetchVPNInfo().getOriginGasLimit();
        }
        return AhwBna(strValues);
    }

    private final java.lang.String values(int i) {
        if (i == 4) {
            return fIwbmz();
        }
        java.lang.String gasLimit = this.fJNWhG.fetchVPNInfo().getGasLimit();
        return gasLimit == null ? "" : gasLimit;
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        BigDecimal bigDecimalOLrzqt;
        if (!ejfBZ() || Intrinsics.EZpvd((java.lang.Object) zuBGHE(), (java.lang.Object) "1")) {
            return str;
        }
        if (str != null) {
            if (str2 != null) {
                java.lang.String strZuBGHE = zuBGHE();
                bigDecimalOLrzqt = C54862xYb.OLrzqt(str2, strZuBGHE != null ? C54862xYb.AEQbTJ(strZuBGHE, 1) : null);
            } else {
                bigDecimalOLrzqt = null;
            }
            BigDecimal bigDecimalKWHzl = C54862xYb.KWHzl(str, bigDecimalOLrzqt);
            if (bigDecimalKWHzl != null) {
                return C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
            }
        }
        return null;
    }

    public final java.lang.String valueOf(java.lang.String str) {
        BigDecimal bigDecimalOLrzqt;
        if (Intrinsics.EZpvd((java.lang.Object) zuBGHE(), (java.lang.Object) "1")) {
            return str;
        }
        if (str == null || (bigDecimalOLrzqt = C54862xYb.OLrzqt(str, zuBGHE())) == null) {
            return null;
        }
        return C54862xYb.convertToString$default(bigDecimalOLrzqt, false, null, null, 7, null);
    }

    public final java.lang.String AhwBna(java.lang.String str) {
        if (!C33129mqd.copydefault(str, this.ejfBZ)) {
            java.lang.String str2 = this.ejfBZ;
            if (str2 != null) {
                return str2;
            }
        } else if (str != null) {
            return str;
        }
        return "";
    }

    public final java.lang.String zLjUOn() {
        java.lang.String strFARcdN = fARcdN();
        if (strFARcdN == null || strFARcdN.length() == 0) {
            java.lang.String baseFee = this.fJNWhG.isConnected().getBaseFee();
            if (baseFee != null) {
                return baseFee;
            }
        } else {
            java.lang.String strFARcdN2 = fARcdN();
            if (strFARcdN2 != null) {
                return strFARcdN2;
            }
        }
        return "";
    }

    public final java.lang.String zsXlph() {
        java.lang.String fieldNames = getFieldNames();
        if (fieldNames == null || fieldNames.length() == 0) {
            return valueOf(this.fJNWhG.isConnected().getProposePriorityFee());
        }
        return getFieldNames();
    }

    private final java.lang.String fJNWhG() {
        java.lang.String strIwGUEr = iwGUEr();
        if (strIwGUEr == null || strIwGUEr.length() == 0) {
            if (ejfBZ()) {
                return C54862xYb.convertToString$default(C54862xYb.KWHzl(this.fJNWhG.isConnected().getBaseFee(), valueOf(this.fJNWhG.isConnected().getProposePriorityFee())), false, null, null, 7, null);
            }
            java.lang.String normal = this.fJNWhG.isConnected().getNormal();
            if (normal != null) {
                return normal;
            }
        } else {
            java.lang.String strIwGUEr2 = iwGUEr();
            if (strIwGUEr2 != null) {
                return strIwGUEr2;
            }
        }
        return "";
    }

    private final java.lang.String fIwbmz() {
        java.lang.String strHDKMBd = hDKMBd();
        if (strHDKMBd == null || strHDKMBd.length() == 0) {
            java.lang.String gasLimit = this.fJNWhG.fetchVPNInfo().getGasLimit();
            if (gasLimit != null) {
                return gasLimit;
            }
        } else {
            java.lang.String strHDKMBd2 = hDKMBd();
            if (strHDKMBd2 != null) {
                return strHDKMBd2;
            }
        }
        return "";
    }

    @Override // o.AbstractC8485bDc
    public int fetchVPNInfo() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.fIwbmz)) {
            return 7;
        }
        return super.fetchVPNInfo();
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        this.fIwbmz = str != null ? C54862xYb.convertToBigIntegerString$default(str, false, (RoundingMode) null, 3, (java.lang.Object) null) : null;
        this.fARcdN = str2 != null ? C54862xYb.convertToBigIntegerString$default(str2, false, (RoundingMode) null, 3, (java.lang.Object) null) : null;
    }

    @Override // o.AbstractC9346bTp
    public boolean ejfBZ() {
        return this.fJNWhG.hDKMBd();
    }
}
