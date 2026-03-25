package o;

import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.unify_trade.bot.util.dca.DcaPreviewData;
import java.math.BigDecimal;
import java.math.MathContext;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56045xvR {
    public static final C56045xvR KWHzl = new C56045xvR();

    private C56045xvR() {
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int iAhwBna = C33129mqd.AhwBna(str2);
        java.lang.String strAddS$default = "0";
        for (int i = 0; i < iAhwBna; i++) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, C33129mqd.mulS$default(str, java.lang.Double.valueOf(java.lang.Math.pow(C33129mqd.AEQbTJ(str3), i)), null, null, null, 14, null), null, null, null, 14, null);
        }
        return strAddS$default;
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return C33129mqd.divS$default(copydefault("1", str2, str3, str), C33129mqd.mulS$default("1", str, null, null, null, 14, null), null, null, null, 14, null);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int iAhwBna = C33129mqd.AhwBna(str2);
        java.lang.String strAddS$default = "0";
        for (int i = 0; i < iAhwBna; i++) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, java.lang.Double.valueOf(java.lang.Math.pow(C33129mqd.AEQbTJ(str3), i)), null, null, null, 14, null);
        }
        return C33129mqd.divS$default(C33129mqd.mulS$default(str, C33129mqd.subS$default(1, str4, null, null, null, 14, null), null, null, null, 14, null), strAddS$default, null, null, null, 14, null);
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int iAhwBna = C33129mqd.AhwBna(str2);
        java.lang.String strAddS$default = "0";
        for (int i = 0; i < iAhwBna; i++) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, java.lang.Double.valueOf(java.lang.Math.pow(C33129mqd.AEQbTJ(str3), i)), null, null, null, 14, null);
        }
        return C33129mqd.mulS$default(str, strAddS$default, null, null, null, 14, null);
    }

    public static /* synthetic */ java.lang.String calculateMinMargin$default(C56045xvR c56045xvR, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        return c56045xvR.AEQbTJ(str, str2, str3, str4, str5);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return C33129mqd.mulS$default(C33129mqd.divS$default(C33129mqd.mulS$default(C33129mqd.mulS$default(str, str2, null, null, null, 14, null), str3, null, null, null, 14, null), str4 == null ? 1 : str4, null, null, null, 14, null), str5 == null ? 1 : str5, null, null, null, 14, null);
    }

    public final java.util.List<DcaPreviewData> copydefault(boolean z, @NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull BigDecimal bigDecimal3, @NotNull BigDecimal bigDecimal4, int i, @NotNull BigDecimal bigDecimal5, @NotNull BigDecimal bigDecimal6, @NotNull BigDecimal bigDecimal7) {
        java.util.ArrayList arrayList;
        BigDecimal bigDecimalNegate;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(bigDecimal3, "");
        Intrinsics.checkNotNullParameter(bigDecimal4, "");
        Intrinsics.checkNotNullParameter(bigDecimal5, "");
        Intrinsics.checkNotNullParameter(bigDecimal6, "");
        Intrinsics.checkNotNullParameter(bigDecimal7, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        try {
            Result.Application application = Result.Companion;
            if (z) {
                BigDecimal bigDecimal8 = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(bigDecimal8, "");
                bigDecimalNegate = bigDecimal8.negate();
                Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "");
            } else {
                bigDecimalNegate = BigDecimal.ONE;
            }
            Intrinsics.copydefault(bigDecimalNegate);
            BigDecimal bigDecimalMultiply = bigDecimal5.multiply(bigDecimalNegate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
            BigDecimal bigDecimalAdd = bigDecimalMultiply.divide(new BigDecimal("100")).add(BigDecimal.ONE);
            BigDecimal bigDecimalMultiply2 = bigDecimal4.multiply(bigDecimalNegate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "");
            Intrinsics.copydefault(bigDecimalAdd);
            arrayList2.add(KWHzl(bigDecimal2, bigDecimal, bigDecimalAdd));
            BigDecimal bigDecimalValueOf = ((DcaPreviewData) CollectionsKt___CollectionsKt.AubY(arrayList2)).valueOf();
            BigDecimal bigDecimalKWHzl = ((DcaPreviewData) CollectionsKt___CollectionsKt.AubY(arrayList2)).KWHzl();
            if (1 <= i) {
                BigDecimal bigDecimalAdd2 = bigDecimalValueOf;
                BigDecimal bigDecimalAdd3 = bigDecimalKWHzl;
                int i2 = 1;
                while (true) {
                    int i3 = i2;
                    BigDecimal bigDecimal9 = bigDecimalAdd3;
                    BigDecimal bigDecimal10 = bigDecimalAdd2;
                    BigDecimal bigDecimal11 = bigDecimalMultiply2;
                    BigDecimal bigDecimal12 = bigDecimalAdd;
                    arrayList = arrayList2;
                    try {
                        DcaPreviewData dcaPreviewDataAEQbTJ = AEQbTJ(i2, bigDecimal3, bigDecimal7, bigDecimal, bigDecimalMultiply2, bigDecimal6, bigDecimalAdd, bigDecimal10, bigDecimal9, (DcaPreviewData) CollectionsKt___CollectionsKt.AubY(arrayList2));
                        if (!C33129mqd.valueOf(dcaPreviewDataAEQbTJ.EZpvd(), 0)) {
                            arrayList.add(dcaPreviewDataAEQbTJ);
                            bigDecimalAdd2 = bigDecimal10.add(dcaPreviewDataAEQbTJ.valueOf());
                            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "");
                            bigDecimalAdd3 = bigDecimal9.add(dcaPreviewDataAEQbTJ.KWHzl());
                            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "");
                            if (i3 == i) {
                                break;
                            }
                            i2 = i3 + 1;
                            arrayList2 = arrayList;
                            bigDecimalMultiply2 = bigDecimal11;
                            bigDecimalAdd = bigDecimal12;
                        } else {
                            break;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        Result.Application application2 = Result.Companion;
                        Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                }
            } else {
                arrayList = arrayList2;
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th2) {
            th = th2;
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public final DcaPreviewData AEQbTJ(int i, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, DcaPreviewData dcaPreviewData) {
        int i2 = i - 1;
        BigDecimal bigDecimalPow = bigDecimal2.pow(i2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalPow);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
        BigDecimal bigDecimalPow2 = bigDecimal5.pow(i2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow2, "");
        BigDecimal bigDecimalMultiply2 = bigDecimal4.multiply(bigDecimalPow2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "");
        BigDecimal bigDecimalEZpvd = dcaPreviewData.EZpvd();
        BigDecimal bigDecimalMultiply3 = bigDecimal3.multiply(bigDecimalMultiply2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "");
        BigDecimal bigDecimalSubtract = bigDecimalEZpvd.subtract(bigDecimalMultiply3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
        MathContext mathContext = MathContext.DECIMAL64;
        BigDecimal bigDecimalDivide = bigDecimalMultiply.divide(bigDecimalSubtract, mathContext);
        BigDecimal bigDecimalAdd = bigDecimal7.add(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
        Intrinsics.copydefault(bigDecimalDivide);
        BigDecimal bigDecimalAdd2 = bigDecimal8.add(bigDecimalDivide);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "");
        BigDecimal bigDecimalDivide2 = bigDecimalAdd.divide(bigDecimalAdd2, mathContext);
        java.lang.String strCopydefault = C33069mpW.copydefault(C55688xof.Application.ffGIBT, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(java.lang.String.valueOf(i)))));
        BigDecimal bigDecimalAEQbTJ = dcaPreviewData.AEQbTJ();
        BigDecimal bigDecimalAbs = bigDecimalMultiply2.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "");
        BigDecimal bigDecimalAdd3 = bigDecimalAEQbTJ.add(bigDecimalAbs);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "");
        Intrinsics.copydefault(bigDecimalDivide2);
        BigDecimal bigDecimalMultiply4 = bigDecimalDivide2.multiply(bigDecimal6);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply4, "");
        return new DcaPreviewData(strCopydefault, bigDecimalMultiply, bigDecimalSubtract, bigDecimalDivide, bigDecimalAdd3, bigDecimalDivide2, bigDecimalMultiply4);
    }

    public final DcaPreviewData KWHzl(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getPostValueLengthLimit);
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, MathContext.DECIMAL64);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
        BigDecimal bigDecimalOLrzqt = DcaPreviewData.Companion.OLrzqt();
        BigDecimal bigDecimalMultiply = bigDecimal2.multiply(bigDecimal3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
        return new DcaPreviewData(strAYXKKw, bigDecimal, bigDecimal2, bigDecimalDivide, bigDecimalOLrzqt, bigDecimal2, bigDecimalMultiply);
    }
}
