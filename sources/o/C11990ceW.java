package o;

import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferBaseSignData;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C11989ceV;
import o.C12792ctf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ceW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C11990ceW extends AbstractC8485bDc<C11989ceV> {
    public final AbstractC11993ceZ<?> AYXKKw;
    public final java.lang.String djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public java.lang.String valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11990ceW(@NotNull AbstractC11993ceZ<?> abstractC11993ceZ) {
        super(abstractC11993ceZ);
        Intrinsics.checkNotNullParameter(abstractC11993ceZ, "");
        this.AYXKKw = abstractC11993ceZ;
        this.djBIcL = "UTXOFeeHandler";
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.ceY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C11990ceW.ejfBZ();
            }
        });
    }

    private final C12792ctf fJNWhG() {
        return (C12792ctf) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C12792ctf ejfBZ() {
        return new C12792ctf();
    }

    public static final kotlin.Pair EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8426bCW
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AhwBna() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAhwBna = super.AhwBna();
        final Function1 function1 = new Function1() { // from class: o.cfa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11990ceW.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXAhwBna.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cfc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11990ceW.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair OLrzqt(C11990ceW c11990ceW, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String feeRate = ((UTXOTransferBaseSignData) c11990ceW.AYXKKw.QVsKAR()).getFeeRate();
        if (C33129mqd.AEQbTJ(feeRate, "0")) {
            c11990ceW.valueOf = feeRate;
            c11990ceW.OLrzqt(4);
        }
        return pair;
    }

    @Override // o.AbstractC8485bDc
    public void AEQbTJ(int i) {
        this.AYXKKw.OLrzqt(this.djBIcL, "onSetSelectFeeType  " + i);
        this.valueOf = null;
        KWHzl(4);
    }

    public final void EZpvd(java.lang.String str) {
        this.AYXKKw.OLrzqt(this.djBIcL, "selectCustomFee  feeRate:" + str);
        this.valueOf = str;
        OLrzqt(4);
        KWHzl(4);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(I)Lo/bDi; */
    @Override // o.AbstractC8485bDc
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public C11989ceV EZpvd(int i) {
        return AhwBna(i);
    }

    @Override // o.AbstractC8426bCW
    public java.util.List<C11989ceV> OLrzqt() {
        return yDY.gEmmrt(EZpvd(31), EZpvd(32), EZpvd(33), EZpvd(4));
    }

    public final C11989ceV KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(4, str);
    }

    public final C11989ceV AhwBna(int i) {
        return copydefault(i, djBIcL(i));
    }

    public final C11989ceV copydefault(int i, java.lang.String str) throws CoinMetaError {
        java.lang.String strCopydefault = copydefault(str);
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = AEQbTJ(i, str);
        C10854bwM c10854bwMAYXKKw = AYXKKw();
        java.lang.String first = pairAEQbTJ.getFirst();
        java.lang.String second = pairAEQbTJ.getSecond();
        java.lang.String strFARcdN = fARcdN();
        UTXOSignInfo uTXOSignInfoUeEOUB = this.AYXKKw.UeEOUB();
        java.lang.String min = uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMin() : null;
        if (min == null) {
            min = "";
        }
        UTXOSignInfo uTXOSignInfoUeEOUB2 = this.AYXKKw.UeEOUB();
        java.lang.String max = uTXOSignInfoUeEOUB2 != null ? uTXOSignInfoUeEOUB2.getMax() : null;
        if (max == null) {
            max = "";
        }
        UTXOSignInfo uTXOSignInfoUeEOUB3 = this.AYXKKw.UeEOUB();
        java.lang.String mempoolMin = uTXOSignInfoUeEOUB3 != null ? uTXOSignInfoUeEOUB3.getMempoolMin() : null;
        return new C11989ceV(i, c10854bwMAYXKKw, strCopydefault, first, second, strFARcdN, new C11989ceV.Activity(str, min, max, mempoolMin != null ? mempoolMin : ""));
    }

    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC11993ceZ<?> abstractC11993ceZ = this.AYXKKw;
        abstractC11993ceZ.OLrzqt(this.djBIcL, "calFeeAmount  feeRate:" + str + "  signLength: " + abstractC11993ceZ.fZBcTu());
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(str, this.AYXKKw.fZBcTu()), false, RoundingMode.UP, 1, (java.lang.Object) null);
    }

    private final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(int i, java.lang.String str) {
        java.lang.String str2;
        java.lang.String maxCost;
        java.lang.String normalCost;
        java.lang.String minCost;
        str2 = "";
        if (i != 4) {
            switch (i) {
                case 31:
                    UTXOSignInfo uTXOSignInfoUeEOUB = this.AYXKKw.UeEOUB();
                    if (uTXOSignInfoUeEOUB != null && (maxCost = uTXOSignInfoUeEOUB.getMaxCost()) != null) {
                        str2 = maxCost;
                    }
                    return C56390yDp.OLrzqt(str2, fJNWhG().EZpvd(str2, true));
                case 32:
                    UTXOSignInfo uTXOSignInfoUeEOUB2 = this.AYXKKw.UeEOUB();
                    if (uTXOSignInfoUeEOUB2 != null && (normalCost = uTXOSignInfoUeEOUB2.getNormalCost()) != null) {
                        str2 = normalCost;
                    }
                    return C56390yDp.OLrzqt(str2, fJNWhG().EZpvd(str2, true));
                case 33:
                    UTXOSignInfo uTXOSignInfoUeEOUB3 = this.AYXKKw.UeEOUB();
                    if (uTXOSignInfoUeEOUB3 != null && (minCost = uTXOSignInfoUeEOUB3.getMinCost()) != null) {
                        str2 = minCost;
                    }
                    return C56390yDp.OLrzqt(str2, fJNWhG().EZpvd(str2, true));
                default:
                    return C56390yDp.OLrzqt("", "");
            }
        }
        C12792ctf c12792ctfFJNWhG = fJNWhG();
        UTXOSignInfo uTXOSignInfoUeEOUB4 = this.AYXKKw.UeEOUB();
        java.lang.String min = uTXOSignInfoUeEOUB4 != null ? uTXOSignInfoUeEOUB4.getMin() : null;
        java.lang.String str3 = min == null ? "" : min;
        UTXOSignInfo uTXOSignInfoUeEOUB5 = this.AYXKKw.UeEOUB();
        java.lang.String normal = uTXOSignInfoUeEOUB5 != null ? uTXOSignInfoUeEOUB5.getNormal() : null;
        java.lang.String str4 = normal == null ? "" : normal;
        UTXOSignInfo uTXOSignInfoUeEOUB6 = this.AYXKKw.UeEOUB();
        java.lang.String max = uTXOSignInfoUeEOUB6 != null ? uTXOSignInfoUeEOUB6.getMax() : null;
        java.lang.String str5 = max == null ? "" : max;
        UTXOSignInfo uTXOSignInfoUeEOUB7 = this.AYXKKw.UeEOUB();
        java.lang.String minCost2 = uTXOSignInfoUeEOUB7 != null ? uTXOSignInfoUeEOUB7.getMinCost() : null;
        UTXOSignInfo uTXOSignInfoUeEOUB8 = this.AYXKKw.UeEOUB();
        java.lang.String normalCost2 = uTXOSignInfoUeEOUB8 != null ? uTXOSignInfoUeEOUB8.getNormalCost() : null;
        UTXOSignInfo uTXOSignInfoUeEOUB9 = this.AYXKKw.UeEOUB();
        C12792ctf.Application applicationKWHzl = c12792ctfFJNWhG.KWHzl(str, str3, str4, str5, minCost2, normalCost2, uTXOSignInfoUeEOUB9 != null ? uTXOSignInfoUeEOUB9.getMaxCost() : null, null);
        java.lang.String strCopydefault = applicationKWHzl.copydefault();
        return C56390yDp.OLrzqt(strCopydefault != null ? strCopydefault : "", fJNWhG().copydefault(applicationKWHzl, true));
    }

    public static /* synthetic */ java.lang.String getFeeRate$default(C11990ceW c11990ceW, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeeRate");
        }
        if ((i2 & 1) != 0) {
            i = c11990ceW.DbNXlk();
        }
        return c11990ceW.djBIcL(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String djBIcL(int i) {
        java.lang.String strFIwbmz;
        if (i != 4) {
            switch (i) {
                case 31:
                    UTXOSignInfo uTXOSignInfoUeEOUB = this.AYXKKw.UeEOUB();
                    strFIwbmz = uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMin() : null;
                    if (strFIwbmz == null) {
                        strFIwbmz = "";
                    }
                    break;
                case 32:
                    UTXOSignInfo uTXOSignInfoUeEOUB2 = this.AYXKKw.UeEOUB();
                    strFIwbmz = uTXOSignInfoUeEOUB2 != null ? uTXOSignInfoUeEOUB2.getNormal() : null;
                    if (strFIwbmz == null) {
                    }
                    break;
                case 33:
                    UTXOSignInfo uTXOSignInfoUeEOUB3 = this.AYXKKw.UeEOUB();
                    strFIwbmz = uTXOSignInfoUeEOUB3 != null ? uTXOSignInfoUeEOUB3.getMax() : null;
                    if (strFIwbmz == null) {
                    }
                    break;
            }
        } else {
            strFIwbmz = fIwbmz();
        }
        this.AYXKKw.OLrzqt(this.djBIcL, "getFeeRate  feeRate:" + strFIwbmz + "  type:" + i);
        return strFIwbmz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String fIwbmz() {
        java.lang.String min;
        java.lang.String str = this.valueOf;
        if (str == null || str.length() == 0) {
            int iDbNXlk = DbNXlk();
            if (iDbNXlk == 31) {
                UTXOSignInfo uTXOSignInfoUeEOUB = this.AYXKKw.UeEOUB();
                min = uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMin() : null;
            } else if (iDbNXlk == 33) {
                UTXOSignInfo uTXOSignInfoUeEOUB2 = this.AYXKKw.UeEOUB();
                min = uTXOSignInfoUeEOUB2 != null ? uTXOSignInfoUeEOUB2.getMax() : null;
            } else {
                UTXOSignInfo uTXOSignInfoUeEOUB3 = this.AYXKKw.UeEOUB();
                min = uTXOSignInfoUeEOUB3 != null ? uTXOSignInfoUeEOUB3.getNormal() : null;
            }
        } else {
            java.lang.String str2 = this.valueOf;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final java.lang.String fARcdN() {
        return AYXKKw().iRxXKY() ? "Sat/vB" : "";
    }
}
