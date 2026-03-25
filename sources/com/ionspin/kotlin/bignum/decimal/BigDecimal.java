package com.ionspin.kotlin.bignum.decimal;

import com.ionspin.kotlin.bignum.integer.Sign;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.C56524yIo;
import o.C56548yJl;
import o.C7983auC;
import o.C7984auD;
import o.C7986auF;
import o.C7987auG;
import o.C8030auz;
import o.InterfaceC7981auA;
import o.InterfaceC8028auw;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class BigDecimal implements InterfaceC8028auw<BigDecimal>, InterfaceC7981auA<BigDecimal>, Comparable<Object> {
    public static final BigDecimal AEQbTJ;
    public static final float[] AYXKKw;
    public static final BigDecimal AhwBna;
    public static final Companion Companion;
    public static final double[] EZpvd;
    public static final BigDecimal KWHzl;
    public static final BigDecimal OLrzqt;
    public static final BigDecimal copydefault;
    public static final BigDecimal djBIcL;
    public static final BigDecimal gEmmrt;
    public static final BigDecimal valueOf;
    public static boolean values;
    public final long AkhnZx;
    public final C7986auF AuCTel;
    public final C7984auD DbNXlk;
    public final RoundingMode ejfBZ;
    public final boolean fARcdN;
    public final long fIwbmz;
    public final long fetchVPNInfo;
    public final long isConnected;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ScaleOps.valuesCustom().length];
            iArr[ScaleOps.Max.ordinal()] = 1;
            iArr[ScaleOps.Min.ordinal()] = 2;
            iArr[ScaleOps.Add.ordinal()] = 3;
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.auF), (r2v0 long), (r4v0 o.auD) A[MD:(o.auF, long, o.auD):void (m)] call: com.ionspin.kotlin.bignum.decimal.BigDecimal.<init>(o.auF, long, o.auD):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BigDecimal(C7986auF c7986auF, long j, C7984auD c7984auD, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7986auF, j, c7984auD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7981auA
    public InterfaceC8028auw.Activity<BigDecimal> EZpvd() {
        return Companion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7986auF djBIcL() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/auw; */
    @Override // o.InterfaceC7981auA
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public BigDecimal AEQbTJ() {
        return this;
    }

    public BigDecimal(C7986auF c7986auF, long j, C7984auD c7984auD) {
        if (c7984auD == null || !c7984auD.OLrzqt()) {
            this.AuCTel = c7986auF;
            this.isConnected = c7986auF.fARcdN();
            this.AkhnZx = j;
            this.DbNXlk = c7984auD;
        } else {
            BigDecimal bigDecimalKWHzl = Companion.KWHzl(c7986auF, j, c7984auD);
            if (!bigDecimalKWHzl.AhwBna()) {
                C7986auF c7986auF2 = bigDecimalKWHzl.AuCTel;
                this.AuCTel = c7986auF2;
                this.AkhnZx = bigDecimalKWHzl.AkhnZx;
                long jFARcdN = c7986auF2.fARcdN();
                this.isConnected = jFARcdN;
                this.DbNXlk = C7984auD.copy$default(c7984auD, jFARcdN, null, 0L, 6, null);
            } else {
                this.AuCTel = bigDecimalKWHzl.AuCTel;
                this.AkhnZx = bigDecimalKWHzl.AkhnZx * (c7984auD.KWHzl() + c7984auD.AEQbTJ());
                long jKWHzl = c7984auD.KWHzl() + c7984auD.AEQbTJ();
                this.isConnected = jKWHzl;
                this.DbNXlk = C7984auD.copy$default(c7984auD, jKWHzl, null, 0L, 6, null);
            }
        }
        C7984auD c7984auD2 = this.DbNXlk;
        this.fetchVPNInfo = c7984auD2 == null ? 0L : c7984auD2.KWHzl();
        C7984auD c7984auD3 = this.DbNXlk;
        RoundingMode roundingModeEZpvd = c7984auD3 == null ? null : c7984auD3.EZpvd();
        this.ejfBZ = roundingModeEZpvd == null ? RoundingMode.NONE : roundingModeEZpvd;
        C7984auD c7984auD4 = this.DbNXlk;
        long jAEQbTJ = c7984auD4 == null ? -1L : c7984auD4.AEQbTJ();
        this.fIwbmz = jAEQbTJ;
        this.fARcdN = jAEQbTJ >= 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 o.auF)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
  (wrap:o.auD:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.auD) : (r4v0 o.auD))
 A[MD:(o.auF, long, o.auD):void (m)] (LINE:59) call: com.ionspin.kotlin.bignum.decimal.BigDecimal.<init>(o.auF, long, o.auD):void type: THIS */
    public /* synthetic */ BigDecimal(C7986auF c7986auF, long j, C7984auD c7984auD, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7986auF, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : c7984auD);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(I)Lo/auw; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public BigDecimal copydefault(int i) {
        return (BigDecimal) InterfaceC7981auA.ActionBar.KWHzl(this, i);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(I)Lo/auw; */
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public BigDecimal EZpvd(int i) {
        return (BigDecimal) InterfaceC7981auA.ActionBar.EZpvd(this, i);
    }

    public static final class Companion implements InterfaceC8028auw.Activity<BigDecimal> {

        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] AEQbTJ;
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[RoundingMode.valuesCustom().length];
                iArr[RoundingMode.AWAY_FROM_ZERO.ordinal()] = 1;
                iArr[RoundingMode.TOWARDS_ZERO.ordinal()] = 2;
                iArr[RoundingMode.CEILING.ordinal()] = 3;
                iArr[RoundingMode.FLOOR.ordinal()] = 4;
                iArr[RoundingMode.ROUND_HALF_AWAY_FROM_ZERO.ordinal()] = 5;
                iArr[RoundingMode.ROUND_HALF_TOWARDS_ZERO.ordinal()] = 6;
                iArr[RoundingMode.ROUND_HALF_CEILING.ordinal()] = 7;
                iArr[RoundingMode.ROUND_HALF_FLOOR.ordinal()] = 8;
                iArr[RoundingMode.ROUND_HALF_TO_EVEN.ordinal()] = 9;
                iArr[RoundingMode.ROUND_HALF_TO_ODD.ordinal()] = 10;
                iArr[RoundingMode.NONE.ordinal()] = 11;
                AEQbTJ = iArr;
                int[] iArr2 = new int[Sign.valuesCustom().length];
                iArr2[Sign.POSITIVE.ordinal()] = 1;
                iArr2[Sign.NEGATIVE.ordinal()] = 2;
                iArr2[Sign.ZERO.ordinal()] = 3;
                copydefault = iArr2;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.ionspin.kotlin.bignum.decimal.BigDecimal.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public BigDecimal EZpvd() {
            return BigDecimal.AEQbTJ;
        }

        public final BigDecimal copydefault(C7986auF c7986auF, long j, C7984auD c7984auD) {
            if (c7984auD.djBIcL()) {
                return new BigDecimal(c7986auF, j, null, 4, null);
            }
            return EZpvd(c7986auF, j, c7984auD);
        }

        public enum SignificantDecider {
            FIVE,
            LESS_THAN_FIVE,
            MORE_THAN_FIVE;

            /* JADX DEBUG: Replace access to removed values field ($VALUES) with 'values()' method */
            /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
            public static SignificantDecider[] valuesCustom() {
                SignificantDecider[] significantDeciderArrValuesCustom = values();
                return (SignificantDecider[]) Arrays.copyOf(significantDeciderArrValuesCustom, significantDeciderArrValuesCustom.length);
            }
        }

        public final SignificantDecider copydefault(C7986auF c7986auF) {
            C7986auF.Application application = C7986auF.Companion;
            C7986auF.ActionBar actionBarGEmmrt = c7986auF.gEmmrt(application.EZpvd().AEQbTJ(c7986auF.fARcdN() - 1));
            int iOLrzqt = actionBarGEmmrt.EZpvd().gEmmrt().OLrzqt(true);
            C7986auF c7986auFGEmmrt = actionBarGEmmrt.OLrzqt().gEmmrt();
            if (iOLrzqt == 5) {
                if (Intrinsics.EZpvd(c7986auFGEmmrt, application.copydefault())) {
                    return SignificantDecider.FIVE;
                }
                return SignificantDecider.MORE_THAN_FIVE;
            }
            if (iOLrzqt > 5) {
                return SignificantDecider.MORE_THAN_FIVE;
            }
            if (iOLrzqt < 5) {
                return SignificantDecider.LESS_THAN_FIVE;
            }
            throw new RuntimeException("Couldn't determine decider");
        }

        public final C7986auF AEQbTJ(C7986auF c7986auF, C7986auF c7986auF2, C7984auD c7984auD) {
            Pair pair;
            Sign signDbNXlk;
            long jFARcdN = c7986auF.fARcdN() - c7984auD.KWHzl();
            if (jFARcdN > 0) {
                C7986auF.ActionBar actionBarGEmmrt = c7986auF.gEmmrt(C7986auF.Companion.EZpvd().AEQbTJ(jFARcdN));
                pair = new Pair(actionBarGEmmrt.EZpvd(), actionBarGEmmrt.OLrzqt());
            } else {
                pair = new Pair(c7986auF, c7986auF2);
            }
            C7986auF c7986auFIsConnected = (C7986auF) pair.component1();
            C7986auF c7986auF3 = (C7986auF) pair.component2();
            C7986auF.Application application = C7986auF.Companion;
            if (Intrinsics.EZpvd(c7986auF, application.copydefault())) {
                signDbNXlk = c7986auF2.DbNXlk();
            } else {
                signDbNXlk = c7986auF.DbNXlk();
            }
            if (c7986auF3.fetchVPNInfo()) {
                return c7986auFIsConnected;
            }
            SignificantDecider significantDeciderCopydefault = copydefault(c7986auF3);
            switch (StateListAnimator.AEQbTJ[c7984auD.EZpvd().ordinal()]) {
                case 1:
                    if (signDbNXlk == Sign.POSITIVE) {
                        return c7986auFIsConnected.isConnected();
                    }
                    return c7986auFIsConnected.valueOf();
                case 2:
                default:
                    return c7986auFIsConnected;
                case 3:
                    return signDbNXlk == Sign.POSITIVE ? c7986auFIsConnected.isConnected() : c7986auFIsConnected;
                case 4:
                    return signDbNXlk == Sign.POSITIVE ? c7986auFIsConnected : c7986auFIsConnected.valueOf();
                case 5:
                    int i = StateListAnimator.copydefault[signDbNXlk.ordinal()];
                    return i != 1 ? (i == 2 && significantDeciderCopydefault != SignificantDecider.LESS_THAN_FIVE) ? c7986auFIsConnected.valueOf() : c7986auFIsConnected : significantDeciderCopydefault != SignificantDecider.LESS_THAN_FIVE ? c7986auFIsConnected.isConnected() : c7986auFIsConnected;
                case 6:
                    int i2 = StateListAnimator.copydefault[signDbNXlk.ordinal()];
                    return i2 != 1 ? (i2 == 2 && significantDeciderCopydefault == SignificantDecider.MORE_THAN_FIVE) ? c7986auFIsConnected.valueOf() : c7986auFIsConnected : significantDeciderCopydefault == SignificantDecider.MORE_THAN_FIVE ? c7986auFIsConnected.isConnected() : c7986auFIsConnected;
                case 7:
                    int i3 = StateListAnimator.copydefault[signDbNXlk.ordinal()];
                    return i3 != 1 ? (i3 == 2 && significantDeciderCopydefault == SignificantDecider.MORE_THAN_FIVE) ? c7986auFIsConnected.valueOf() : c7986auFIsConnected : significantDeciderCopydefault != SignificantDecider.LESS_THAN_FIVE ? c7986auFIsConnected.isConnected() : c7986auFIsConnected;
                case 8:
                    int i4 = StateListAnimator.copydefault[signDbNXlk.ordinal()];
                    return i4 != 1 ? (i4 == 2 && significantDeciderCopydefault != SignificantDecider.LESS_THAN_FIVE) ? c7986auFIsConnected.valueOf() : c7986auFIsConnected : significantDeciderCopydefault == SignificantDecider.MORE_THAN_FIVE ? c7986auFIsConnected.isConnected() : c7986auFIsConnected;
                case 9:
                    if (significantDeciderCopydefault == SignificantDecider.FIVE) {
                        if (Intrinsics.EZpvd(c7986auF.OLrzqt(2), application.AEQbTJ())) {
                            int i5 = StateListAnimator.copydefault[signDbNXlk.ordinal()];
                            return i5 != 1 ? (i5 == 2 && significantDeciderCopydefault != SignificantDecider.LESS_THAN_FIVE) ? c7986auFIsConnected.valueOf() : c7986auFIsConnected : significantDeciderCopydefault != SignificantDecider.LESS_THAN_FIVE ? c7986auFIsConnected.isConnected() : c7986auFIsConnected;
                        }
                        int i6 = StateListAnimator.copydefault[signDbNXlk.ordinal()];
                        return i6 != 1 ? (i6 == 2 && significantDeciderCopydefault != SignificantDecider.LESS_THAN_FIVE) ? c7986auFIsConnected.valueOf() : c7986auFIsConnected : significantDeciderCopydefault == SignificantDecider.MORE_THAN_FIVE ? c7986auFIsConnected.isConnected() : c7986auFIsConnected;
                    }
                    if (significantDeciderCopydefault != SignificantDecider.MORE_THAN_FIVE) {
                        return c7986auFIsConnected;
                    }
                    if (signDbNXlk == Sign.POSITIVE) {
                        c7986auFIsConnected = c7986auFIsConnected.isConnected();
                    }
                    return signDbNXlk == Sign.NEGATIVE ? c7986auFIsConnected.valueOf() : c7986auFIsConnected;
                case 10:
                    if (significantDeciderCopydefault == SignificantDecider.FIVE) {
                        if (Intrinsics.EZpvd(c7986auF.OLrzqt(2), application.copydefault())) {
                            int i7 = StateListAnimator.copydefault[signDbNXlk.ordinal()];
                            return i7 != 1 ? (i7 == 2 && significantDeciderCopydefault != SignificantDecider.LESS_THAN_FIVE) ? c7986auFIsConnected.valueOf() : c7986auFIsConnected : significantDeciderCopydefault != SignificantDecider.LESS_THAN_FIVE ? c7986auFIsConnected.isConnected() : c7986auFIsConnected;
                        }
                        int i8 = StateListAnimator.copydefault[signDbNXlk.ordinal()];
                        return i8 != 1 ? (i8 == 2 && significantDeciderCopydefault != SignificantDecider.LESS_THAN_FIVE) ? c7986auFIsConnected.valueOf() : c7986auFIsConnected : significantDeciderCopydefault == SignificantDecider.MORE_THAN_FIVE ? c7986auFIsConnected.isConnected() : c7986auFIsConnected;
                    }
                    if (significantDeciderCopydefault != SignificantDecider.MORE_THAN_FIVE) {
                        return c7986auFIsConnected;
                    }
                    if (signDbNXlk == Sign.POSITIVE) {
                        c7986auFIsConnected = c7986auFIsConnected.isConnected();
                    }
                    return signDbNXlk == Sign.NEGATIVE ? c7986auFIsConnected.valueOf() : c7986auFIsConnected;
                case 11:
                    throw new ArithmeticException("Non-terminating result of division operation. Specify decimalPrecision");
            }
        }

        public final BigDecimal AEQbTJ(@NotNull C7986auF c7986auF, long j, @NotNull C7984auD c7984auD) {
            BigDecimal bigDecimal;
            Intrinsics.checkNotNullParameter(c7986auF, "");
            Intrinsics.checkNotNullParameter(c7984auD, "");
            if (c7986auF.DbNXlk() == Sign.POSITIVE) {
                int i = StateListAnimator.AEQbTJ[c7984auD.EZpvd().ordinal()];
                if (i == 1 || i == 3) {
                    C7986auF c7986auFIsConnected = c7986auF.isConnected();
                    bigDecimal = new BigDecimal(c7986auFIsConnected, (c7986auFIsConnected.fARcdN() - c7986auF.fARcdN()) + j, c7984auD, null);
                } else {
                    return new BigDecimal(c7986auF, j, c7984auD, null);
                }
            } else if (c7986auF.DbNXlk() == Sign.NEGATIVE) {
                int i2 = StateListAnimator.AEQbTJ[c7984auD.EZpvd().ordinal()];
                if (i2 == 1 || i2 == 4) {
                    C7986auF c7986auFValueOf = c7986auF.valueOf();
                    bigDecimal = new BigDecimal(c7986auFValueOf, (c7986auFValueOf.fARcdN() - c7986auF.fARcdN()) + j, c7984auD, null);
                } else {
                    return new BigDecimal(c7986auF, j, c7984auD, null);
                }
            } else {
                return new BigDecimal(c7986auF, j, c7984auD, null);
            }
            return bigDecimal;
        }

        public final BigDecimal EZpvd(C7986auF c7986auF, long j, C7984auD c7984auD) {
            long jKWHzl;
            C7986auF.Application application = C7986auF.Companion;
            if (Intrinsics.EZpvd(c7986auF, application.copydefault())) {
                return new BigDecimal(application.copydefault(), j, c7984auD, null);
            }
            long jFARcdN = c7986auF.fARcdN();
            if (c7984auD.OLrzqt()) {
                jKWHzl = c7984auD.KWHzl() + c7984auD.AEQbTJ();
            } else {
                jKWHzl = c7984auD.KWHzl();
            }
            if (jKWHzl > jFARcdN) {
                return new BigDecimal((C7986auF) c7986auF.gEmmrt((InterfaceC8028auw) application.EZpvd().AEQbTJ(jKWHzl - jFARcdN)), j, c7984auD, null);
            }
            if (jKWHzl < jFARcdN) {
                C7986auF.ActionBar actionBarGEmmrt = c7986auF.gEmmrt(application.EZpvd().AEQbTJ(jFARcdN - jKWHzl));
                C7986auF c7986auFOLrzqt = actionBarGEmmrt.OLrzqt();
                if (Intrinsics.EZpvd(actionBarGEmmrt.OLrzqt(), application.copydefault())) {
                    return new BigDecimal(actionBarGEmmrt.EZpvd(), j, c7984auD, null);
                }
                if (c7986auF.fARcdN() == actionBarGEmmrt.EZpvd().fARcdN() + actionBarGEmmrt.OLrzqt().fARcdN()) {
                    C7986auF c7986auFAEQbTJ = AEQbTJ(actionBarGEmmrt.EZpvd(), c7986auFOLrzqt, c7984auD);
                    return new BigDecimal(c7986auFAEQbTJ, j + (c7986auFAEQbTJ.fARcdN() - actionBarGEmmrt.EZpvd().fARcdN()), c7984auD, null);
                }
                return AEQbTJ(actionBarGEmmrt.EZpvd(), j, c7984auD);
            }
            return new BigDecimal(c7986auF, j, c7984auD, null);
        }

        public final BigDecimal KWHzl(C7986auF c7986auF, long j, C7984auD c7984auD) {
            C7984auD c7984auD2;
            if (!c7984auD.OLrzqt()) {
                return new BigDecimal(c7986auF, j, c7984auD, null);
            }
            if (j >= 0) {
                c7984auD2 = new C7984auD(c7984auD.AEQbTJ() + j + 1, c7984auD.EZpvd(), 0L, 4, null);
            } else if (j < 0) {
                c7984auD2 = new C7984auD(c7984auD.AEQbTJ() + 1, c7984auD.EZpvd(), 0L, 4, null);
            } else {
                throw new RuntimeException("Unexpected state");
            }
            C7984auD c7984auD3 = c7984auD2;
            if (j >= 0) {
                return EZpvd(c7986auF, j, c7984auD3);
            }
            BigDecimal bigDecimal = (BigDecimal) new BigDecimal(c7986auF, j, null, 4, null).EZpvd(c7986auF.fIwbmz());
            return (BigDecimal) EZpvd(bigDecimal.djBIcL(), bigDecimal.KWHzl(), c7984auD3).copydefault(c7986auF.fIwbmz());
        }

        public static /* synthetic */ BigDecimal fromBigDecimal$default(Companion companion, BigDecimal bigDecimal, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.copydefault(bigDecimal, c7984auD);
        }

        public final BigDecimal copydefault(@NotNull BigDecimal bigDecimal, C7984auD c7984auD) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return new BigDecimal(bigDecimal.djBIcL(), bigDecimal.KWHzl(), c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromBigInteger$default(Companion companion, C7986auF c7986auF, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.AEQbTJ(c7986auF, c7984auD);
        }

        public final BigDecimal AEQbTJ(@NotNull C7986auF c7986auF, C7984auD c7984auD) {
            Intrinsics.checkNotNullParameter(c7986auF, "");
            return new BigDecimal(c7986auF, c7986auF.fARcdN() - 1, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromLong$default(Companion companion, long j, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.AEQbTJ(j, c7984auD);
        }

        public final BigDecimal AEQbTJ(long j, C7984auD c7984auD) {
            C7986auF c7986auFCopydefault = C7986auF.Companion.copydefault(j);
            return new BigDecimal(c7986auFCopydefault, c7986auFCopydefault.fARcdN() - 1, c7984auD, null).EZpvd(c7984auD);
        }

        /* JADX INFO: renamed from: fromULong-4PLdz1A$default, reason: not valid java name */
        public static /* synthetic */ BigDecimal m6338fromULong4PLdz1A$default(Companion companion, long j, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.KWHzl(j, c7984auD);
        }

        public final BigDecimal KWHzl(long j, C7984auD c7984auD) {
            C7986auF c7986auFOLrzqt = C7986auF.Companion.OLrzqt(j);
            return new BigDecimal(c7986auFOLrzqt, c7986auFOLrzqt.fARcdN() - 1, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromInt$default(Companion companion, int i, C7984auD c7984auD, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                c7984auD = null;
            }
            return companion.AEQbTJ(i, c7984auD);
        }

        public final BigDecimal AEQbTJ(int i, C7984auD c7984auD) {
            C7986auF c7986auFEZpvd = C7986auF.Companion.KWHzl(i);
            return new BigDecimal(c7986auFEZpvd, c7986auFEZpvd.fARcdN() - 1, c7984auD, null).EZpvd(c7984auD);
        }

        /* JADX INFO: renamed from: fromUInt-qim9Vi0$default, reason: not valid java name */
        public static /* synthetic */ BigDecimal m6337fromUIntqim9Vi0$default(Companion companion, int i, C7984auD c7984auD, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                c7984auD = null;
            }
            return companion.EZpvd(i, c7984auD);
        }

        public final BigDecimal EZpvd(int i, C7984auD c7984auD) {
            C7986auF c7986auFAEQbTJ = C7986auF.Companion.AEQbTJ(i);
            return new BigDecimal(c7986auFAEQbTJ, c7986auFAEQbTJ.fARcdN() - 1, c7984auD, null).EZpvd(c7984auD);
        }

        /* JADX INFO: renamed from: fromUShort-vckuEUM$default, reason: not valid java name */
        public static /* synthetic */ BigDecimal m6339fromUShortvckuEUM$default(Companion companion, short s, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.copydefault(s, c7984auD);
        }

        public final BigDecimal copydefault(short s, C7984auD c7984auD) {
            C7986auF c7986auFEZpvd = C7986auF.Companion.EZpvd(s);
            return new BigDecimal(c7986auFEZpvd, c7986auFEZpvd.fARcdN() - 1, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromShort$default(Companion companion, short s, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.AEQbTJ(s, c7984auD);
        }

        public final BigDecimal AEQbTJ(short s, C7984auD c7984auD) {
            C7986auF c7986auFKWHzl = C7986auF.Companion.KWHzl(s);
            return new BigDecimal(c7986auFKWHzl, c7986auFKWHzl.fARcdN() - 1, c7984auD, null).EZpvd(c7984auD);
        }

        /* JADX INFO: renamed from: fromUByte-0ky7B_Q$default, reason: not valid java name */
        public static /* synthetic */ BigDecimal m6336fromUByte0ky7B_Q$default(Companion companion, byte b, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.EZpvd(b, c7984auD);
        }

        public final BigDecimal EZpvd(byte b, C7984auD c7984auD) {
            C7986auF c7986auFEZpvd = C7986auF.Companion.EZpvd(b);
            return new BigDecimal(c7986auFEZpvd, c7986auFEZpvd.fARcdN() - 1, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromByte$default(Companion companion, byte b, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.AEQbTJ(b, c7984auD);
        }

        public final BigDecimal AEQbTJ(byte b, C7984auD c7984auD) {
            C7986auF c7986auFOLrzqt = C7986auF.Companion.OLrzqt(b);
            return new BigDecimal(c7986auFOLrzqt, c7986auFOLrzqt.fARcdN() - 1, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromLongAsSignificand$default(Companion companion, long j, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.OLrzqt(j, c7984auD);
        }

        public final BigDecimal OLrzqt(long j, C7984auD c7984auD) {
            return new BigDecimal(C7986auF.Companion.copydefault(j), 0L, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromIntAsSignificand$default(Companion companion, int i, C7984auD c7984auD, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                c7984auD = null;
            }
            return companion.KWHzl(i, c7984auD);
        }

        public final BigDecimal KWHzl(int i, C7984auD c7984auD) {
            return new BigDecimal(C7986auF.Companion.KWHzl(i), 0L, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromShortAsSignificand$default(Companion companion, short s, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.KWHzl(s, c7984auD);
        }

        public final BigDecimal KWHzl(short s, C7984auD c7984auD) {
            return new BigDecimal(C7986auF.Companion.KWHzl(s), 0L, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromByteAsSignificand$default(Companion companion, byte b, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.copydefault(b, c7984auD);
        }

        public final BigDecimal copydefault(byte b, C7984auD c7984auD) {
            return new BigDecimal(C7986auF.Companion.OLrzqt(b), 0L, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromFloat$default(Companion companion, float f, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.AEQbTJ(f, c7984auD);
        }

        public final BigDecimal AEQbTJ(float f, C7984auD c7984auD) {
            String str;
            String strValueOf = String.valueOf(f);
            if (!StringsKt__StringsKt.contains$default((CharSequence) strValueOf, '.', false, 2, (Object) null) || StringsKt__StringsKt.KWHzl((CharSequence) strValueOf, 'E', true)) {
                return EZpvd(strValueOf, c7984auD).EZpvd(c7984auD);
            }
            int iFIwbmz = StringsKt__StringsKt.fIwbmz((CharSequence) strValueOf);
            while (true) {
                str = "";
                if (iFIwbmz >= 0) {
                    if (strValueOf.charAt(iFIwbmz) != '0') {
                        String strSubstring = strValueOf.substring(0, iFIwbmz + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        str = strSubstring;
                        break;
                    }
                    iFIwbmz--;
                } else {
                    break;
                }
            }
            return EZpvd(str, c7984auD).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromDouble$default(Companion companion, double d, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.EZpvd(d, c7984auD);
        }

        public final BigDecimal EZpvd(double d, C7984auD c7984auD) {
            String str;
            String strValueOf = String.valueOf(d);
            if (!StringsKt__StringsKt.contains$default((CharSequence) strValueOf, '.', false, 2, (Object) null) || StringsKt__StringsKt.KWHzl((CharSequence) strValueOf, 'E', true)) {
                return EZpvd(strValueOf, c7984auD).EZpvd(c7984auD).EZpvd(c7984auD);
            }
            int iFIwbmz = StringsKt__StringsKt.fIwbmz((CharSequence) strValueOf);
            while (true) {
                str = "";
                if (iFIwbmz >= 0) {
                    if (strValueOf.charAt(iFIwbmz) != '0') {
                        String strSubstring = strValueOf.substring(0, iFIwbmz + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        str = strSubstring;
                        break;
                    }
                    iFIwbmz--;
                } else {
                    break;
                }
            }
            return EZpvd(str, c7984auD).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromBigIntegerWithExponent$default(Companion companion, C7986auF c7986auF, long j, C7984auD c7984auD, int i, Object obj) {
            if ((i & 4) != 0) {
                c7984auD = null;
            }
            return companion.OLrzqt(c7986auF, j, c7984auD);
        }

        public final BigDecimal OLrzqt(@NotNull C7986auF c7986auF, long j, C7984auD c7984auD) {
            Intrinsics.checkNotNullParameter(c7986auF, "");
            return new BigDecimal(c7986auF, j, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromLongWithExponent$default(Companion companion, long j, long j2, C7984auD c7984auD, int i, Object obj) {
            if ((i & 4) != 0) {
                c7984auD = null;
            }
            return companion.EZpvd(j, j2, c7984auD);
        }

        public final BigDecimal EZpvd(long j, long j2, C7984auD c7984auD) {
            return new BigDecimal(C7986auF.Companion.copydefault(j), j2, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromIntWithExponent$default(Companion companion, int i, long j, C7984auD c7984auD, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                c7984auD = null;
            }
            return companion.OLrzqt(i, j, c7984auD);
        }

        public final BigDecimal OLrzqt(int i, long j, C7984auD c7984auD) {
            return new BigDecimal(C7986auF.Companion.KWHzl(i), j, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromShortWithExponent$default(Companion companion, short s, long j, C7984auD c7984auD, int i, Object obj) {
            if ((i & 4) != 0) {
                c7984auD = null;
            }
            return companion.AEQbTJ(s, j, c7984auD);
        }

        public final BigDecimal AEQbTJ(short s, long j, C7984auD c7984auD) {
            return new BigDecimal(C7986auF.Companion.KWHzl(s), j, c7984auD, null).EZpvd(c7984auD);
        }

        public static /* synthetic */ BigDecimal fromByteWithExponent$default(Companion companion, byte b, long j, C7984auD c7984auD, int i, Object obj) {
            if ((i & 4) != 0) {
                c7984auD = null;
            }
            return companion.copydefault(b, j, c7984auD);
        }

        public final BigDecimal copydefault(byte b, long j, C7984auD c7984auD) {
            return new BigDecimal(C7986auF.Companion.OLrzqt(b), j, c7984auD, null).EZpvd(c7984auD);
        }

        public BigDecimal copydefault(long j) {
            return AEQbTJ(j, (C7984auD) null);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(I)Ljava/lang/Object; */
        @Override // o.InterfaceC8028auw.Activity
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public BigDecimal KWHzl(int i) {
            return AEQbTJ(i, (C7984auD) null);
        }

        public BigDecimal copydefault(short s) {
            return AEQbTJ(s, (C7984auD) null);
        }

        public BigDecimal OLrzqt(byte b) {
            return AEQbTJ(b, (C7984auD) null);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(FZ)Ljava/lang/Object; */
        @Override // o.InterfaceC8028auw.Activity
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public BigDecimal KWHzl(float f, boolean z) {
            return AEQbTJ(f, (C7984auD) null);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(DZ)Ljava/lang/Object; */
        @Override // o.InterfaceC8028auw.Activity
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public BigDecimal copydefault(double d, boolean z) {
            return EZpvd(d, (C7984auD) null);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/String;I)Ljava/lang/Object; */
        @Override // o.InterfaceC8028auw.Activity
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public BigDecimal EZpvd(@NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            return EZpvd(str, (C7984auD) null);
        }

        public final BigDecimal EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return parseStringWithMode$default(this, str, null, 2, null);
        }

        public static /* synthetic */ BigDecimal parseStringWithMode$default(Companion companion, String str, C7984auD c7984auD, int i, Object obj) {
            if ((i & 2) != 0) {
                c7984auD = null;
            }
            return companion.EZpvd(str, c7984auD);
        }

        /* JADX WARN: Removed duplicated region for block: B:140:0x028b  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0291  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final BigDecimal EZpvd(@NotNull String str, C7984auD c7984auD) {
            Sign sign;
            int i;
            char c;
            int length;
            int i2;
            char c2;
            List listSplit$default;
            Sign sign2;
            Sign sign3;
            long j;
            int i3;
            long length2;
            Intrinsics.checkNotNullParameter(str, "");
            if (str.length() == 0) {
                return EZpvd();
            }
            int i4 = 0;
            if (StringsKt__StringsKt.KWHzl((CharSequence) str, 'E', true)) {
                if (!StringsKt__StringsKt.contains$default((CharSequence) str, '.', false, 2, (Object) null)) {
                    i2 = 2;
                    c2 = '-';
                    List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'E', 'e'}, false, 0, 6, (Object) null);
                    listSplit$default = yDY.gEmmrt((String) listSplit$default2.get(0), Intrinsics.KWHzl("0E", listSplit$default2.get(1)));
                } else {
                    i2 = 2;
                    c2 = '-';
                    listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
                }
                if (listSplit$default.size() == i2) {
                    int i5 = (str.charAt(0) == c2 || str.charAt(0) == '+') ? 1 : 0;
                    if (i5 != 0 && str.charAt(0) == c2) {
                        sign2 = Sign.NEGATIVE;
                    } else {
                        sign2 = Sign.POSITIVE;
                    }
                    String str2 = (String) listSplit$default.get(0);
                    if (str2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String strSubstring = str2.substring(i5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    CharSequence charSequence = (CharSequence) listSplit$default.get(1);
                    char[] cArr = new char[i2];
                    // fill-array-data instruction
                    cArr[0] = 'E';
                    cArr[1] = 'e';
                    List listSplit$default3 = StringsKt__StringsKt.split$default(charSequence, cArr, false, 0, 6, (Object) null);
                    String str3 = (String) listSplit$default3.get(0);
                    String str4 = (String) listSplit$default3.get(1);
                    int i6 = (str4.charAt(0) == c2 || str4.charAt(0) == '+') ? 1 : 0;
                    if (str4.charAt(0) == c2) {
                        sign3 = Sign.NEGATIVE;
                    } else {
                        sign3 = Sign.POSITIVE;
                    }
                    String strSubstring2 = str4.substring(i6);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    if (sign3 == Sign.POSITIVE) {
                        j = Long.parseLong(strSubstring2, CharsKt__CharJVMKt.checkRadix(10));
                    } else {
                        j = Long.parseLong(strSubstring2, CharsKt__CharJVMKt.checkRadix(10)) * ((long) (-1));
                    }
                    int length3 = strSubstring.length();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length3) {
                            i3 = -1;
                            i7 = -1;
                            break;
                        }
                        if (strSubstring.charAt(i7) != '0') {
                            i3 = -1;
                            break;
                        }
                        i7++;
                    }
                    if (i7 == i3) {
                        i7 = 0;
                    }
                    int length4 = str3.length() - 1;
                    while (true) {
                        if (length4 < 0) {
                            length4 = -1;
                            break;
                        }
                        if (str3.charAt(length4) != '0') {
                            break;
                        }
                        length4--;
                    }
                    if (length4 == -1) {
                        length4 = str3.length() - 1;
                    }
                    String strSubstring3 = strSubstring.substring(i7, strSubstring.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                    if (str3 != null) {
                        String strSubstring4 = str3.substring(0, length4 + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                        C7986auF.Application application = C7986auF.Companion;
                        C7986auF c7986auFAEQbTJ = application.EZpvd(Intrinsics.KWHzl(strSubstring3, strSubstring4), 10);
                        if (Intrinsics.EZpvd(c7986auFAEQbTJ, application.copydefault())) {
                            sign2 = Sign.ZERO;
                        }
                        if (sign2 == Sign.NEGATIVE) {
                            c7986auFAEQbTJ = c7986auFAEQbTJ.AkhnZx();
                        }
                        C7986auF c7986auF = c7986auFAEQbTJ;
                        if (!Intrinsics.EZpvd((Object) strSubstring3, (Object) "0")) {
                            length2 = j + ((long) strSubstring3.length());
                        } else {
                            length2 = j - (((long) strSubstring4.length()) - c7986auF.fARcdN());
                        }
                        return new BigDecimal(c7986auF, length2 - 1, c7984auD, null);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new ArithmeticException(Intrinsics.KWHzl("Invalid (or unsupported) floating point number format: ", str));
            }
            if (StringsKt__StringsKt.contains$default((CharSequence) str, '.', false, 2, (Object) null)) {
                List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
                if (listSplit$default4.size() == 2) {
                    int i8 = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0;
                    if (i8 != 0 && str.charAt(0) == '-') {
                        sign = Sign.NEGATIVE;
                    } else {
                        sign = Sign.POSITIVE;
                    }
                    String str5 = (String) listSplit$default4.get(0);
                    if (str5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String strSubstring5 = str5.substring(i8);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
                    String str6 = (String) listSplit$default4.get(1);
                    int length5 = strSubstring5.length();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length5) {
                            i = -1;
                            break;
                        }
                        if (strSubstring5.charAt(i9) != '0') {
                            i = i9;
                            break;
                        }
                        i9++;
                    }
                    if (i == -1) {
                        i = 0;
                    }
                    int length6 = str6.length() - 1;
                    while (true) {
                        if (length6 < 0) {
                            length6 = -1;
                            break;
                        }
                        if (str6.charAt(length6) != '0') {
                            break;
                        }
                        length6--;
                    }
                    if (length6 == -1) {
                        length6 = str6.length() - 1;
                    }
                    String strSubstring6 = strSubstring5.substring(i, strSubstring5.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring6, "");
                    if (str6 != null) {
                        String strSubstring7 = str6.substring(0, length6 + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "");
                        C7986auF c7986auFAEQbTJ2 = C7986auF.Companion.EZpvd(Intrinsics.KWHzl(strSubstring6, strSubstring7), 10);
                        if (strSubstring6.length() > 0) {
                            c = '0';
                            if (strSubstring6.charAt(0) != '0') {
                                length = strSubstring6.length() - 1;
                            }
                            if (Intrinsics.EZpvd(c7986auFAEQbTJ2, C7986auF.Companion.copydefault())) {
                                sign = Sign.ZERO;
                            }
                            if (sign == Sign.NEGATIVE) {
                                c7986auFAEQbTJ2 = c7986auFAEQbTJ2.AkhnZx();
                            }
                            return new BigDecimal(c7986auFAEQbTJ2, length, c7984auD, null);
                        }
                        c = '0';
                        int length7 = strSubstring7.length();
                        while (true) {
                            if (i4 >= length7) {
                                i4 = -1;
                                break;
                            }
                            if (strSubstring7.charAt(i4) != c) {
                                break;
                            }
                            i4++;
                        }
                        length = (-1) * (i4 + 1);
                        if (Intrinsics.EZpvd(c7986auFAEQbTJ2, C7986auF.Companion.copydefault())) {
                        }
                        if (sign == Sign.NEGATIVE) {
                        }
                        return new BigDecimal(c7986auFAEQbTJ2, length, c7984auD, null);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new ArithmeticException(Intrinsics.KWHzl("Invalid (or unsupported) floating point number format: ", str));
            }
            C7986auF c7986auFAEQbTJ3 = C7986auF.Companion.EZpvd(str, 10);
            return new BigDecimal(c7986auFAEQbTJ3, c7986auFAEQbTJ3.fARcdN() - 1, c7984auD, null);
        }

        public final C7984auD OLrzqt(C7984auD c7984auD, C7984auD c7984auD2, C7984auD c7984auD3) {
            if (c7984auD3 != null) {
                return c7984auD3;
            }
            if (c7984auD == null && c7984auD2 == null) {
                return new C7984auD(0L, null, 0L, 7, null);
            }
            if (c7984auD == null && c7984auD2 != null) {
                return c7984auD2;
            }
            if (c7984auD2 == null && c7984auD != null) {
                return c7984auD;
            }
            Intrinsics.copydefault(c7984auD);
            RoundingMode roundingModeEZpvd = c7984auD.EZpvd();
            Intrinsics.copydefault(c7984auD2);
            if (roundingModeEZpvd == c7984auD2.EZpvd()) {
                if (c7984auD.KWHzl() < c7984auD2.KWHzl()) {
                    c7984auD = c7984auD2;
                }
                return c7984auD;
            }
            throw new ArithmeticException("Different rounding modes! This: " + c7984auD.EZpvd() + " Other: " + c7984auD2.EZpvd());
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        C7986auF.Application application = C7986auF.Companion;
        long j = 0;
        C7984auD c7984auD = null;
        int i = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AEQbTJ = new BigDecimal(application.copydefault(), j, c7984auD, i, defaultConstructorMarker);
        C7984auD c7984auD2 = null;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        KWHzl = new BigDecimal(application.AEQbTJ(), 0L, c7984auD2, 6, defaultConstructorMarker2);
        copydefault = new BigDecimal(application.OLrzqt(), j, c7984auD, i, defaultConstructorMarker);
        OLrzqt = new BigDecimal(application.EZpvd(), 1L, c7984auD2, 4, defaultConstructorMarker2);
        EZpvd = new double[]{1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
        gEmmrt = Companion.fromDouble$default(companion, Double.MAX_VALUE, null, 2, null);
        valueOf = Companion.fromDouble$default(companion, Double.MIN_VALUE, null, 2, null);
        AYXKKw = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        AhwBna = Companion.fromFloat$default(companion, Float.MAX_VALUE, null, 2, null);
        djBIcL = Companion.fromFloat$default(companion, Float.MIN_VALUE, null, 2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/auw;)Lo/auw; */
    @Override // o.InterfaceC8028auw
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public BigDecimal AEQbTJ(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return copydefault(bigDecimal, EZpvd(bigDecimal, ScaleOps.Max));
    }

    public static /* synthetic */ BigDecimal add$default(BigDecimal bigDecimal, BigDecimal bigDecimal2, C7984auD c7984auD, int i, Object obj) {
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return bigDecimal.copydefault(bigDecimal2, c7984auD);
    }

    public final BigDecimal copydefault(@NotNull BigDecimal bigDecimal, C7984auD c7984auD) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Companion companion = Companion;
        C7984auD c7984auDOLrzqt = companion.OLrzqt(this.DbNXlk, bigDecimal.DbNXlk, c7984auD);
        BigDecimal bigDecimal2 = AEQbTJ;
        if (Intrinsics.EZpvd(this, bigDecimal2)) {
            return companion.copydefault(bigDecimal.AuCTel, bigDecimal.AkhnZx, c7984auDOLrzqt);
        }
        if (Intrinsics.EZpvd(bigDecimal, bigDecimal2)) {
            return companion.copydefault(this.AuCTel, this.AkhnZx, c7984auDOLrzqt);
        }
        Triple<C7986auF, C7986auF, Long> tripleCopydefault = copydefault(this, bigDecimal);
        C7986auF c7986auFComponent1 = tripleCopydefault.component1();
        C7986auF c7986auFComponent2 = tripleCopydefault.component2();
        long jFARcdN = c7986auFComponent1.fARcdN();
        long jFARcdN2 = c7986auFComponent2.fARcdN();
        C7986auF c7986auF = (C7986auF) c7986auFComponent1.valueOf((InterfaceC8028auw) c7986auFComponent2);
        long jFARcdN3 = c7986auF.fARcdN();
        if (jFARcdN <= jFARcdN2) {
            jFARcdN = jFARcdN2;
        }
        long jMax = Math.max(this.AkhnZx, bigDecimal.AkhnZx) + (jFARcdN3 - jFARcdN);
        return c7984auDOLrzqt.OLrzqt() ? companion.copydefault(c7986auF, jMax, C7984auD.copy$default(c7984auDOLrzqt, jFARcdN3, null, 0L, 6, null)) : companion.copydefault(c7986auF, jMax, c7984auDOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/auw;)Lo/auw; */
    @Override // o.InterfaceC8028auw
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public BigDecimal EZpvd(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return gEmmrt(bigDecimal, EZpvd(bigDecimal, ScaleOps.Max));
    }

    public static /* synthetic */ BigDecimal subtract$default(BigDecimal bigDecimal, BigDecimal bigDecimal2, C7984auD c7984auD, int i, Object obj) {
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return bigDecimal.gEmmrt(bigDecimal2, c7984auD);
    }

    public final BigDecimal gEmmrt(@NotNull BigDecimal bigDecimal, C7984auD c7984auD) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Companion companion = Companion;
        C7984auD c7984auDOLrzqt = companion.OLrzqt(this.DbNXlk, bigDecimal.DbNXlk, c7984auD);
        BigDecimal bigDecimal2 = AEQbTJ;
        if (Intrinsics.EZpvd(this, bigDecimal2)) {
            return companion.copydefault(bigDecimal.AuCTel.AkhnZx(), bigDecimal.AkhnZx, c7984auDOLrzqt);
        }
        if (Intrinsics.EZpvd(bigDecimal, bigDecimal2)) {
            return companion.copydefault(this.AuCTel, this.AkhnZx, c7984auDOLrzqt);
        }
        Triple<C7986auF, C7986auF, Long> tripleCopydefault = copydefault(this, bigDecimal);
        C7986auF c7986auFComponent1 = tripleCopydefault.component1();
        C7986auF c7986auFComponent2 = tripleCopydefault.component2();
        long jFARcdN = c7986auFComponent1.fARcdN();
        long jFARcdN2 = c7986auFComponent2.fARcdN();
        C7986auF c7986auF = (C7986auF) c7986auFComponent1.AYXKKw((InterfaceC8028auw) c7986auFComponent2);
        long jFARcdN3 = c7986auF.fARcdN();
        if (jFARcdN <= jFARcdN2) {
            jFARcdN = jFARcdN2;
        }
        long jMax = Math.max(this.AkhnZx, bigDecimal.AkhnZx) + (jFARcdN3 - jFARcdN);
        return this.fARcdN ? companion.copydefault(c7986auF, jMax, C7984auD.copy$default(c7984auDOLrzqt, jFARcdN3, null, 0L, 6, null)) : companion.copydefault(c7986auF, jMax, c7984auDOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/auw;)Lo/auw; */
    @Override // o.InterfaceC8028auw
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public BigDecimal copydefault(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return AEQbTJ(bigDecimal, EZpvd(bigDecimal, ScaleOps.Max));
    }

    public static /* synthetic */ BigDecimal multiply$default(BigDecimal bigDecimal, BigDecimal bigDecimal2, C7984auD c7984auD, int i, Object obj) {
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return bigDecimal.AEQbTJ(bigDecimal2, c7984auD);
    }

    public final BigDecimal AEQbTJ(@NotNull BigDecimal bigDecimal, C7984auD c7984auD) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Companion companion = Companion;
        C7984auD c7984auDOLrzqt = companion.OLrzqt(this.DbNXlk, bigDecimal.DbNXlk, c7984auD);
        long jFARcdN = this.AuCTel.fARcdN();
        long jFARcdN2 = bigDecimal.AuCTel.fARcdN();
        C7986auF c7986auF = (C7986auF) this.AuCTel.gEmmrt((InterfaceC8028auw) bigDecimal.AuCTel);
        long jFARcdN3 = c7986auF.fARcdN();
        long j = 1 + this.AkhnZx + bigDecimal.AkhnZx + (jFARcdN3 - (jFARcdN + jFARcdN2));
        return c7984auDOLrzqt.OLrzqt() ? companion.copydefault(c7986auF, j, C7984auD.copy$default(c7984auDOLrzqt, jFARcdN3, null, 0L, 6, null)) : companion.copydefault(c7986auF, j, c7984auDOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/auw;)Lo/auw; */
    @Override // o.InterfaceC8028auw
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public BigDecimal KWHzl(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return KWHzl(bigDecimal, EZpvd(bigDecimal, ScaleOps.Max));
    }

    public static /* synthetic */ BigDecimal divide$default(BigDecimal bigDecimal, BigDecimal bigDecimal2, C7984auD c7984auD, int i, Object obj) {
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return bigDecimal.KWHzl(bigDecimal2, c7984auD);
    }

    public final BigDecimal KWHzl(@NotNull BigDecimal bigDecimal, C7984auD c7984auD) {
        C7986auF c7986auF;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Companion companion = Companion;
        C7984auD c7984auDOLrzqt = companion.OLrzqt(this.DbNXlk, bigDecimal.DbNXlk, c7984auD);
        if (c7984auDOLrzqt.djBIcL()) {
            long j = this.AkhnZx;
            long j2 = bigDecimal.AkhnZx;
            C7986auF c7986auF2 = this.AuCTel;
            C7986auF.Application application = C7986auF.Companion;
            C7986auF c7986auF3 = (C7986auF) c7986auF2.gEmmrt((InterfaceC8028auw) application.EZpvd().AEQbTJ((bigDecimal.isConnected * ((long) 2)) + ((long) 6)));
            C7986auF.ActionBar actionBarGEmmrt = c7986auF3.gEmmrt(bigDecimal.AuCTel);
            C7986auF c7986auFEZpvd = actionBarGEmmrt.EZpvd();
            long j3 = bigDecimal.isConnected;
            long jFARcdN = c7986auFEZpvd.fARcdN();
            long jFARcdN2 = c7986auF3.fARcdN();
            if (!Intrinsics.EZpvd(actionBarGEmmrt.OLrzqt(), application.copydefault())) {
                throw new ArithmeticException("Non-terminating result of division operation (i.e. 1/3 = 0.3333... library needs to know when to stop and how to round up at that point). Specify decimalPrecision inside your decimal mode.");
            }
            return new BigDecimal(c7986auFEZpvd, (j - j2) + (j3 - 1) + (jFARcdN - jFARcdN2), c7984auDOLrzqt);
        }
        long j4 = this.AkhnZx - bigDecimal.AkhnZx;
        long j5 = j4 - 1;
        long jKWHzl = (c7984auDOLrzqt.KWHzl() - this.isConnected) + bigDecimal.isConnected;
        if (jKWHzl > 0) {
            c7986auF = (C7986auF) this.AuCTel.gEmmrt((InterfaceC8028auw) C7987auG.KWHzl(10).AEQbTJ(jKWHzl));
        } else {
            c7986auF = jKWHzl < 0 ? (C7986auF) this.AuCTel.AhwBna((InterfaceC8028auw) C7987auG.KWHzl(10).AEQbTJ(Math.abs(jKWHzl))) : this.AuCTel;
        }
        C7986auF.ActionBar actionBarGEmmrt2 = c7986auF.gEmmrt(bigDecimal.AuCTel);
        C7986auF c7986auFEZpvd2 = actionBarGEmmrt2.EZpvd();
        if (Intrinsics.EZpvd(c7986auFEZpvd2, C7986auF.Companion.copydefault())) {
            j5 = j4 - 2;
        }
        long j6 = j5;
        long jFARcdN3 = c7986auFEZpvd2.fARcdN() - c7984auDOLrzqt.KWHzl();
        if (this.fARcdN) {
            return new BigDecimal(companion.AEQbTJ(c7986auFEZpvd2, actionBarGEmmrt2.OLrzqt(), c7984auDOLrzqt), j6 + jFARcdN3, C7984auD.copy$default(c7984auDOLrzqt, c7986auFEZpvd2.fARcdN(), null, 0L, 6, null));
        }
        return new BigDecimal(companion.AEQbTJ(c7986auFEZpvd2, actionBarGEmmrt2.OLrzqt(), c7984auDOLrzqt), j6 + jFARcdN3, c7984auDOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/auw;)Lo/auw; */
    @Override // o.InterfaceC8028auw
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public BigDecimal OLrzqt(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return EZpvd(bigDecimal).getSecond();
    }

    public Pair<BigDecimal, BigDecimal> EZpvd(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        C7984auD c7984auD = this.DbNXlk;
        if (c7984auD == null) {
            c7984auD = new C7984auD(this.AkhnZx + 1, RoundingMode.FLOOR, 0L, 4, null);
        }
        BigDecimal bigDecimalKWHzl = KWHzl(bigDecimal, c7984auD);
        return new Pair<>(bigDecimalKWHzl, djBIcL(copy$default(bigDecimalKWHzl, null, 0L, C7984auD.Companion.OLrzqt(), 3, null).fetchVPNInfo(bigDecimal)));
    }

    public boolean AhwBna() {
        return this.AuCTel.fetchVPNInfo();
    }

    public static /* synthetic */ BigDecimal copy$default(BigDecimal bigDecimal, C7986auF c7986auF, long j, C7984auD c7984auD, int i, Object obj) {
        if ((i & 1) != 0) {
            c7986auF = bigDecimal.AuCTel;
        }
        if ((i & 2) != 0) {
            j = bigDecimal.AkhnZx;
        }
        if ((i & 4) != 0) {
            c7984auD = bigDecimal.DbNXlk;
        }
        return bigDecimal.copydefault(c7986auF, j, c7984auD);
    }

    public final BigDecimal copydefault(@NotNull C7986auF c7986auF, long j, C7984auD c7984auD) {
        Intrinsics.checkNotNullParameter(c7986auF, "");
        return new BigDecimal(c7986auF, j, c7984auD);
    }

    public final BigDecimal EZpvd(long j) {
        return j == 0 ? this : copy$default(this, null, this.AkhnZx + j, null, 5, null);
    }

    public final BigDecimal copydefault() {
        return EZpvd(new C7984auD(this.AkhnZx + 1, RoundingMode.FLOOR, 0L, 4, null));
    }

    public final C7986auF AYXKKw() {
        long j = this.AkhnZx;
        if (j < 0) {
            return C7986auF.Companion.copydefault();
        }
        long j2 = j - this.isConnected;
        if (j2 > 0) {
            return (C7986auF) this.AuCTel.gEmmrt((InterfaceC8028auw) C7987auG.KWHzl(10).AEQbTJ(j2 + 1));
        }
        return j2 < 0 ? (C7986auF) this.AuCTel.AhwBna((InterfaceC8028auw) C7987auG.KWHzl(10).AEQbTJ(Math.abs(j2) - 1)) : this.AuCTel;
    }

    public final BigDecimal gEmmrt(BigDecimal bigDecimal) {
        if (Intrinsics.EZpvd(bigDecimal, AEQbTJ)) {
            return this;
        }
        C7986auF c7986auFEZpvd = bigDecimal.AuCTel;
        C7986auF.ActionBar actionBar = new C7986auF.ActionBar(c7986auFEZpvd, C7986auF.Companion.copydefault());
        while (true) {
            C7986auF c7986auFEZpvd2 = actionBar.EZpvd();
            C7986auF.Application application = C7986auF.Companion;
            actionBar = c7986auFEZpvd2.gEmmrt(application.EZpvd());
            if (Intrinsics.EZpvd(actionBar.OLrzqt(), application.copydefault())) {
                c7986auFEZpvd = actionBar.EZpvd();
            }
            C7986auF c7986auF = c7986auFEZpvd;
            if (!Intrinsics.EZpvd(actionBar.OLrzqt(), application.copydefault())) {
                return new BigDecimal(c7986auF, bigDecimal.AkhnZx, null, 4, null);
            }
            c7986auFEZpvd = c7986auF;
        }
    }

    public static /* synthetic */ BigDecimal integerDiv$default(BigDecimal bigDecimal, BigDecimal bigDecimal2, C7984auD c7984auD, int i, Object obj) {
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return bigDecimal.EZpvd(bigDecimal2, c7984auD);
    }

    public final BigDecimal EZpvd(BigDecimal bigDecimal, C7984auD c7984auD) {
        Companion companion = Companion;
        return companion.copydefault((C7986auF) this.AuCTel.AhwBna((InterfaceC8028auw) bigDecimal.AuCTel), this.AkhnZx - bigDecimal.AkhnZx, companion.OLrzqt(this.DbNXlk, bigDecimal.DbNXlk, c7984auD));
    }

    public static /* synthetic */ BigDecimal rem$default(BigDecimal bigDecimal, BigDecimal bigDecimal2, C7984auD c7984auD, int i, Object obj) {
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return bigDecimal.AhwBna(bigDecimal2, c7984auD);
    }

    public final BigDecimal AhwBna(BigDecimal bigDecimal, C7984auD c7984auD) {
        Companion companion = Companion;
        return companion.copydefault((C7986auF) this.AuCTel.djBIcL((InterfaceC8028auw) bigDecimal.AuCTel), this.AkhnZx - bigDecimal.AkhnZx, companion.OLrzqt(this.DbNXlk, bigDecimal.DbNXlk, c7984auD));
    }

    public static /* synthetic */ Pair divrem$default(BigDecimal bigDecimal, BigDecimal bigDecimal2, C7984auD c7984auD, int i, Object obj) {
        if ((i & 2) != 0) {
            c7984auD = null;
        }
        return bigDecimal.OLrzqt(bigDecimal2, c7984auD);
    }

    public final Pair<BigDecimal, BigDecimal> OLrzqt(BigDecimal bigDecimal, C7984auD c7984auD) {
        Companion companion = Companion;
        C7984auD c7984auDOLrzqt = companion.OLrzqt(this.DbNXlk, bigDecimal.DbNXlk, c7984auD);
        long jMax = Math.max(this.AkhnZx, bigDecimal.AkhnZx);
        return new Pair<>(companion.copydefault((C7986auF) this.AuCTel.AhwBna((InterfaceC8028auw) bigDecimal.AuCTel), jMax, c7984auDOLrzqt), companion.copydefault((C7986auF) this.AuCTel.djBIcL((InterfaceC8028auw) bigDecimal.AuCTel), jMax, c7984auDOLrzqt));
    }

    public enum ScaleOps {
        Max,
        Min,
        Add;

        /* JADX DEBUG: Replace access to removed values field ($VALUES) with 'values()' method */
        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ScaleOps[] valuesCustom() {
            ScaleOps[] scaleOpsArrValuesCustom = values();
            return (ScaleOps[]) Arrays.copyOf(scaleOpsArrValuesCustom, scaleOpsArrValuesCustom.length);
        }
    }

    public final C7984auD EZpvd(BigDecimal bigDecimal, ScaleOps scaleOps) {
        C7984auD c7984auD;
        long jMax;
        long jAEQbTJ;
        C7984auD c7984auD2 = this.DbNXlk;
        if (c7984auD2 == null || c7984auD2.djBIcL() || (c7984auD = bigDecimal.DbNXlk) == null || c7984auD.djBIcL()) {
            return C7984auD.Companion.OLrzqt();
        }
        long jMax2 = Math.max(this.DbNXlk.KWHzl(), bigDecimal.DbNXlk.KWHzl());
        RoundingMode roundingModeEZpvd = this.DbNXlk.EZpvd();
        if (this.DbNXlk.OLrzqt() && bigDecimal.DbNXlk.OLrzqt()) {
            int i = StateListAnimator.AEQbTJ[scaleOps.ordinal()];
            if (i == 1) {
                jMax = Math.max(this.DbNXlk.AEQbTJ(), bigDecimal.DbNXlk.AEQbTJ());
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jAEQbTJ = this.DbNXlk.AEQbTJ() + bigDecimal.DbNXlk.AEQbTJ();
                    return new C7984auD(jMax2, roundingModeEZpvd, jAEQbTJ);
                }
                jMax = Math.min(this.DbNXlk.AEQbTJ(), bigDecimal.DbNXlk.AEQbTJ());
            }
        } else {
            jMax = -1;
        }
        jAEQbTJ = jMax;
        return new C7984auD(jMax2, roundingModeEZpvd, jAEQbTJ);
    }

    public BigDecimal djBIcL(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return gEmmrt(bigDecimal, EZpvd(bigDecimal, ScaleOps.Max));
    }

    public BigDecimal fetchVPNInfo(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return AEQbTJ(bigDecimal, EZpvd(bigDecimal, ScaleOps.Max));
    }

    public int gEmmrt() {
        return this.AuCTel.fIwbmz();
    }

    public final BigDecimal EZpvd(C7984auD c7984auD) {
        return c7984auD == null ? this : Companion.EZpvd(this.AuCTel, this.AkhnZx, c7984auD);
    }

    public static /* synthetic */ BigDecimal roundToDigitPosition$default(BigDecimal bigDecimal, long j, RoundingMode roundingMode, int i, Object obj) {
        if ((i & 2) != 0) {
            roundingMode = bigDecimal.ejfBZ;
        }
        return bigDecimal.copydefault(j, roundingMode);
    }

    public final BigDecimal copydefault(long j, @NotNull RoundingMode roundingMode) {
        BigDecimal bigDecimalEZpvd;
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (j == 0) {
            throw new ArithmeticException("Rounding to 0 position is not supported");
        }
        if (this.AkhnZx >= 0) {
            bigDecimalEZpvd = EZpvd(new C7984auD(j, roundingMode, 0L, 4, null));
        } else {
            bigDecimalEZpvd = (BigDecimal) ((BigDecimal) EZpvd(gEmmrt())).EZpvd(new C7984auD(j, roundingMode, 0L, 4, null)).copydefault(gEmmrt());
        }
        C7984auD c7984auD = this.DbNXlk;
        if (c7984auD == null) {
            return new BigDecimal(bigDecimalEZpvd.AuCTel, bigDecimalEZpvd.AkhnZx, null, 4, null);
        }
        return new BigDecimal(bigDecimalEZpvd.AuCTel, bigDecimalEZpvd.AkhnZx, c7984auD);
    }

    public final BigDecimal AEQbTJ(BigDecimal bigDecimal) {
        long jFARcdN = bigDecimal.AuCTel.fARcdN();
        return new BigDecimal(bigDecimal.AuCTel, (bigDecimal.AkhnZx - jFARcdN) + 1, null, 4, null);
    }

    public final Triple<C7986auF, C7986auF, Long> copydefault(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimalAEQbTJ = AEQbTJ(bigDecimal);
        BigDecimal bigDecimalAEQbTJ2 = AEQbTJ(bigDecimal2);
        long j = bigDecimalAEQbTJ.AkhnZx;
        long j2 = bigDecimalAEQbTJ2.AkhnZx;
        long j3 = bigDecimal.AkhnZx;
        long j4 = bigDecimal2.AkhnZx;
        if (j3 > j4) {
            long j5 = j - j2;
            if (j5 >= 0) {
                return new Triple<>((C7986auF) bigDecimalAEQbTJ.AuCTel.gEmmrt((InterfaceC8028auw) C7987auG.KWHzl(10).AEQbTJ(j5)), bigDecimal2.AuCTel, Long.valueOf(j2));
            }
            return new Triple<>(bigDecimal.AuCTel, (C7986auF) bigDecimalAEQbTJ2.AuCTel.gEmmrt((InterfaceC8028auw) C7987auG.KWHzl(10).AEQbTJ(j5 * ((long) (-1)))), Long.valueOf(j));
        }
        if (j3 < j4) {
            long j6 = j2 - j;
            if (j6 >= 0) {
                return new Triple<>(bigDecimal.AuCTel, (C7986auF) bigDecimalAEQbTJ2.AuCTel.gEmmrt((InterfaceC8028auw) C7987auG.KWHzl(10).AEQbTJ(j6)), Long.valueOf(j));
            }
            return new Triple<>((C7986auF) bigDecimalAEQbTJ.AuCTel.gEmmrt((InterfaceC8028auw) C7987auG.KWHzl(10).AEQbTJ(j6 * ((long) (-1)))), bigDecimal2.AuCTel, Long.valueOf(j));
        }
        if (j3 != j4) {
            throw new RuntimeException("Invalid comparison state BigInteger: " + bigDecimal.AkhnZx + ", " + bigDecimal2.AkhnZx);
        }
        long j7 = j - j2;
        if (j7 > 0) {
            return new Triple<>((C7986auF) bigDecimal.AuCTel.gEmmrt((InterfaceC8028auw) C7987auG.KWHzl(10).AEQbTJ(j7)), bigDecimal2.AuCTel, Long.valueOf(j));
        }
        if (j7 < 0) {
            return new Triple<>(bigDecimal.AuCTel, (C7986auF) bigDecimal2.AuCTel.gEmmrt((InterfaceC8028auw) C7987auG.KWHzl(10).AEQbTJ(j7 * ((long) (-1)))), Long.valueOf(j));
        }
        if (Intrinsics.copydefault(j7, 0L) == 0) {
            return new Triple<>(bigDecimal.AuCTel, bigDecimal2.AuCTel, Long.valueOf(j));
        }
        throw new RuntimeException(Intrinsics.KWHzl("Invalid delta: ", Long.valueOf(j7)));
    }

    public final int KWHzl(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        if (this.AkhnZx == bigDecimal.AkhnZx && this.isConnected == bigDecimal.isConnected) {
            return this.AuCTel.copydefault(bigDecimal.AuCTel);
        }
        Triple<C7986auF, C7986auF, Long> tripleCopydefault = copydefault(this, bigDecimal);
        return tripleCopydefault.component1().copydefault(tripleCopydefault.component2());
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (C7983auC.copydefault.OLrzqt(number)) {
                return KWHzl(number);
            }
        }
        if (obj instanceof BigDecimal) {
            return KWHzl((BigDecimal) obj);
        }
        if (obj instanceof Long) {
            return KWHzl(Companion.copydefault(((Number) obj).longValue()));
        }
        if (obj instanceof Integer) {
            return KWHzl(Companion.KWHzl(((Number) obj).intValue()));
        }
        if (obj instanceof Short) {
            return KWHzl(Companion.copydefault(((Number) obj).shortValue()));
        }
        if (obj instanceof Byte) {
            return KWHzl(Companion.OLrzqt(((Number) obj).byteValue()));
        }
        if (obj instanceof Double) {
            return KWHzl(Companion.fromDouble$default(Companion, ((Number) obj).doubleValue(), null, 2, null));
        }
        if (obj instanceof Float) {
            return KWHzl(Companion.fromFloat$default(Companion, ((Number) obj).floatValue(), null, 2, null));
        }
        throw new RuntimeException(Intrinsics.KWHzl("Invalid comparison type for BigDecimal: ", C56524yIo.AEQbTJ(obj.getClass()).valueOf()));
    }

    public final int KWHzl(Number number) {
        if (number.floatValue() % 1 == 0.0f) {
            return KWHzl(Companion.copydefault(number.longValue()));
        }
        return KWHzl(C8030auz.toBigDecimal$default(number.floatValue(), (Long) null, (C7984auD) null, 3, (Object) null));
    }

    public boolean equals(Object obj) {
        int iKWHzl;
        if (obj instanceof BigDecimal) {
            iKWHzl = KWHzl((BigDecimal) obj);
        } else if (obj instanceof Long) {
            iKWHzl = KWHzl(Companion.copydefault(((Number) obj).longValue()));
        } else if (obj instanceof Integer) {
            iKWHzl = KWHzl(Companion.KWHzl(((Number) obj).intValue()));
        } else if (obj instanceof Short) {
            iKWHzl = KWHzl(Companion.copydefault(((Number) obj).shortValue()));
        } else if (obj instanceof Byte) {
            iKWHzl = KWHzl(Companion.OLrzqt(((Number) obj).byteValue()));
        } else {
            if (!(obj instanceof Double)) {
                if (obj instanceof Float) {
                    iKWHzl = KWHzl(Companion.fromFloat$default(Companion, ((Number) obj).floatValue(), null, 2, null));
                }
            }
            iKWHzl = KWHzl(Companion.fromDouble$default(Companion, ((Number) obj).doubleValue(), null, 2, null));
        }
        return iKWHzl == 0;
    }

    public int hashCode() {
        if (Intrinsics.EZpvd(this, AEQbTJ)) {
            return 0;
        }
        return gEmmrt(this).AuCTel.hashCode() + Long.hashCode(this.AkhnZx);
    }

    public String toString() {
        String strSubstring;
        if (values) {
            return values();
        }
        String strAhwBna = this.AuCTel.AhwBna(10);
        int i = this.AuCTel.compareTo(0) < 0 ? 2 : 1;
        String string = this.AuCTel.toString();
        int iFIwbmz = StringsKt__StringsKt.fIwbmz((CharSequence) string);
        while (true) {
            if (iFIwbmz < 0) {
                strSubstring = "";
                break;
            }
            if (string.charAt(iFIwbmz) != '0') {
                strSubstring = string.substring(0, iFIwbmz + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                break;
            }
            iFIwbmz--;
        }
        String str = strSubstring.length() <= 1 ? "0" : "";
        long j = this.AkhnZx;
        if (j > 0) {
            return AEQbTJ(strAhwBna, strAhwBna.length() - i) + str + "E+" + this.AkhnZx;
        }
        if (j >= 0) {
            if (j == 0) {
                return Intrinsics.KWHzl(AEQbTJ(strAhwBna, strAhwBna.length() - i), str);
            }
            throw new RuntimeException("Invalid state, please report a bug (Integer compareTo invalid)");
        }
        return AEQbTJ(strAhwBna, strAhwBna.length() - i) + str + 'E' + this.AkhnZx;
    }

    public final String values() {
        String strCopydefault;
        if (Intrinsics.EZpvd(this, AEQbTJ)) {
            return "0";
        }
        long jFARcdN = this.AuCTel.fARcdN();
        if (this.AkhnZx > 2147483647L) {
            throw new RuntimeException("Invalid toStringExpanded request (exponent > Int.MAX_VALUE)");
        }
        String strAYXKKw = this.AuCTel.AYXKKw(10);
        String str = this.AuCTel.DbNXlk() == Sign.NEGATIVE ? "-" : "";
        long j = this.AkhnZx;
        if (j > 0) {
            long j2 = (j - jFARcdN) + 1;
            if (j2 > 0) {
                strCopydefault = Intrinsics.KWHzl(strAYXKKw, AEQbTJ(j2, '0'));
            } else {
                strCopydefault = copydefault(strAYXKKw, (strAYXKKw.length() - ((int) this.AkhnZx)) - 1);
            }
        } else if (j < 0) {
            if (Math.abs((int) j) > 0) {
                strCopydefault = copydefault(Intrinsics.KWHzl(AEQbTJ(Math.abs(this.AkhnZx), '0'), strAYXKKw), (r0 + strAYXKKw.length()) - 1);
            } else {
                strCopydefault = copydefault(strAYXKKw, strAYXKKw.length() - 1);
            }
        } else {
            if (j != 0) {
                throw new RuntimeException("Invalid state, please report a bug (Integer compareTo invalid)");
            }
            if (jFARcdN == 1) {
                return Intrinsics.KWHzl(str, strAYXKKw);
            }
            strCopydefault = copydefault(strAYXKKw, strAYXKKw.length() - 1);
        }
        return Intrinsics.KWHzl(str, strCopydefault);
    }

    public final String copydefault(String str, int i) {
        String str2;
        String strKWHzl = StringsKt__StringsKt.KWHzl(str, C56548yJl.AhwBna(0, str.length() - i));
        String strKWHzl2 = StringsKt__StringsKt.KWHzl(str, C56548yJl.AhwBna(str.length() - i, str.length()));
        int iFIwbmz = StringsKt__StringsKt.fIwbmz((CharSequence) strKWHzl2);
        while (true) {
            str2 = "";
            if (iFIwbmz >= 0) {
                if (strKWHzl2.charAt(iFIwbmz) != '0') {
                    String strSubstring = strKWHzl2.substring(0, iFIwbmz + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    str2 = strSubstring;
                    break;
                }
                iFIwbmz--;
            } else {
                break;
            }
        }
        if (str2.length() <= 0) {
            return strKWHzl;
        }
        return strKWHzl + '.' + str2;
    }

    public final String AEQbTJ(String str, int i) {
        String str2 = StringsKt__StringsKt.KWHzl(str, C56548yJl.AhwBna(0, str.length() - i)) + '.' + StringsKt__StringsKt.KWHzl(str, C56548yJl.AhwBna(str.length() - i, str.length()));
        for (int iFIwbmz = StringsKt__StringsKt.fIwbmz((CharSequence) str2); iFIwbmz >= 0; iFIwbmz--) {
            if (str2.charAt(iFIwbmz) != '0') {
                String strSubstring = str2.substring(0, iFIwbmz + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                return strSubstring;
            }
        }
        return "";
    }

    public final String AEQbTJ(long j, char c) {
        if (j < 0) {
            throw new RuntimeException("Char cannot be multiplied with negative number");
        }
        StringBuilder sb = new StringBuilder();
        while (j > 0) {
            sb.append(c);
            j--;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
