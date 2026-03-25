package o;

import com.okinc.localization.util.format.PrecisionType;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pTy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38307pTy {
    public final PrecisionType AhwBna;
    public final int EZpvd;
    public final int OLrzqt;
    public final BigDecimal copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public static final java.lang.String KWHzl = "Precision";

    /* JADX INFO: renamed from: o.pTy$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PrecisionType.values().length];
            try {
                iArr[PrecisionType.MIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PrecisionType.MAX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PrecisionType.MIN_MAX.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PrecisionType.Significant.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[PrecisionType.FIXED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[PrecisionType.INCREMENT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.localization.util.format.PrecisionType), (r2v0 int), (r3v0 int), (r4v0 java.math.BigDecimal) A[MD:(com.okinc.localization.util.format.PrecisionType, int, int, java.math.BigDecimal):void (m)] call: o.pTy.<init>(com.okinc.localization.util.format.PrecisionType, int, int, java.math.BigDecimal):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C38307pTy(PrecisionType precisionType, int i, int i2, BigDecimal bigDecimal, DefaultConstructorMarker defaultConstructorMarker) {
        this(precisionType, i, i2, bigDecimal);
    }

    public C38307pTy(PrecisionType precisionType, int i, int i2, BigDecimal bigDecimal) {
        this.AhwBna = precisionType;
        this.OLrzqt = i;
        this.EZpvd = i2;
        this.copydefault = bigDecimal;
    }

    /* JADX INFO: renamed from: o.pTy$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pTy.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C38307pTy copydefault(int i) {
            PrecisionType precisionType = PrecisionType.MIN;
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            return new C38307pTy(precisionType, i, 0, bigDecimal, null);
        }

        public final C38307pTy AEQbTJ(int i) {
            PrecisionType precisionType = PrecisionType.MAX;
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            return new C38307pTy(precisionType, i, 0, bigDecimal, null);
        }

        public final C38307pTy KWHzl(int i, int i2) {
            PrecisionType precisionType = PrecisionType.MIN_MAX;
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            return new C38307pTy(precisionType, i, i2, bigDecimal, null);
        }

        public final C38307pTy EZpvd(int i) {
            PrecisionType precisionType = PrecisionType.FIXED;
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            return new C38307pTy(precisionType, i, 0, bigDecimal, null);
        }

        public final C38307pTy copydefault(int i, int i2) {
            PrecisionType precisionType = PrecisionType.Significant;
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            return new C38307pTy(precisionType, i, i2, bigDecimal, null);
        }

        public final C38307pTy copydefault(@NotNull BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return new C38307pTy(PrecisionType.INCREMENT, 0, 0, bigDecimal, null);
        }

        public final C38307pTy OLrzqt(int i) {
            if (i >= 0) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            BigDecimal bigDecimalPow = new BigDecimal(10).pow(java.lang.Math.abs(i));
            Intrinsics.copydefault(bigDecimalPow);
            return copydefault(bigDecimalPow);
        }
    }

    public final AbstractC7236afy EZpvd() {
        switch (StateListAnimator.OLrzqt[this.AhwBna.ordinal()]) {
            case 1:
                AbstractC7224afm abstractC7224afmDjBIcL = AbstractC7236afy.djBIcL(this.OLrzqt);
                Intrinsics.copydefault(abstractC7224afmDjBIcL);
                return abstractC7224afmDjBIcL;
            case 2:
                AbstractC7224afm abstractC7224afmValueOf = AbstractC7236afy.valueOf(this.OLrzqt);
                Intrinsics.copydefault(abstractC7224afmValueOf);
                return abstractC7224afmValueOf;
            case 3:
                int i = this.OLrzqt;
                int i2 = this.EZpvd;
                if (i > i2) {
                    pUU.copydefault(KWHzl, "toICUPrecision, error: fraction1 must be less or equals than fraction2. fragment1:" + i + ",fragment2:" + i2);
                    AbstractC7224afm abstractC7224afmAEQbTJ = AbstractC7236afy.AEQbTJ(this.OLrzqt);
                    Intrinsics.checkNotNullExpressionValue(abstractC7224afmAEQbTJ, "");
                    return abstractC7224afmAEQbTJ;
                }
                AbstractC7224afm abstractC7224afmOLrzqt = AbstractC7236afy.OLrzqt(i, i2);
                Intrinsics.checkNotNullExpressionValue(abstractC7224afmOLrzqt, "");
                return abstractC7224afmOLrzqt;
            case 4:
                int i3 = this.OLrzqt;
                if (i3 <= 0) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                int i4 = this.EZpvd;
                if (i4 <= 0) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
                }
                if (i3 > i4) {
                    pUU.copydefault(KWHzl, "toICUPrecision, error: fraction1 must be less or equals than fraction2. fragment1:" + i3 + ",fragment2:" + i4);
                    AbstractC7236afy abstractC7236afyAYXKKw = AbstractC7236afy.AYXKKw(this.OLrzqt);
                    Intrinsics.checkNotNullExpressionValue(abstractC7236afyAYXKKw, "");
                    return abstractC7236afyAYXKKw;
                }
                AbstractC7236afy abstractC7236afyEZpvd = AbstractC7236afy.EZpvd(i3, i4);
                Intrinsics.checkNotNullExpressionValue(abstractC7236afyEZpvd, "");
                return abstractC7236afyEZpvd;
            case 5:
                AbstractC7224afm abstractC7224afmAEQbTJ2 = AbstractC7236afy.AEQbTJ(this.OLrzqt);
                Intrinsics.copydefault(abstractC7224afmAEQbTJ2);
                return abstractC7224afmAEQbTJ2;
            case 6:
                AbstractC7236afy abstractC7236afyOLrzqt = AbstractC7236afy.OLrzqt(this.copydefault);
                Intrinsics.copydefault(abstractC7236afyOLrzqt);
                return abstractC7236afyOLrzqt;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
