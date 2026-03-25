package o;

import androidx.camera.video.AudioStats;
import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.ionspin.kotlin.bignum.integer.Sign;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C7986auF;
import o.InterfaceC7981auA;
import o.InterfaceC8028auw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.auF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7986auF implements InterfaceC8028auw<C7986auF>, InterfaceC7981auA<C7986auF>, java.lang.Comparable<java.lang.Object> {
    public static final double AEQbTJ;
    public static final Application Companion;
    public static final C7986auF EZpvd;
    public static final C7986auF KWHzl;
    public static final C7986auF OLrzqt;
    public static final C7986auF copydefault;
    public static final InterfaceC7985auE valueOf;
    public final int AYXKKw;
    public final Sign AhwBna;
    public final long[] djBIcL;

    /* JADX INFO: renamed from: o.auF$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Sign.valuesCustom().length];
            iArr[Sign.POSITIVE.ordinal()] = 1;
            iArr[Sign.NEGATIVE.ordinal()] = 2;
            iArr[Sign.ZERO.ordinal()] = 3;
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long[]), (r2v0 com.ionspin.kotlin.bignum.integer.Sign) A[MD:(long[], com.ionspin.kotlin.bignum.integer.Sign):void (m)] call: o.auF.<init>(long[], com.ionspin.kotlin.bignum.integer.Sign):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C7986auF(long[] jArr, Sign sign, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr, sign);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/auw; */
    @Override // o.InterfaceC7981auA
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public C7986auF AEQbTJ() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Sign DbNXlk() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7981auA
    public InterfaceC8028auw.Activity<C7986auF> EZpvd() {
        return Companion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long[] values() {
        return this.djBIcL;
    }

    public C7986auF(long[] jArr, Sign sign) {
        Sign sign2 = Sign.ZERO;
        if (sign == sign2 && !KWHzl(jArr)) {
            throw new java.lang.IllegalArgumentException("sign should be Sign.ZERO iff magnitude has a value of 0".toString());
        }
        this.djBIcL = C7999auS.EZpvd.djBIcL(jArr);
        this.AhwBna = KWHzl(values()) ? sign2 : sign;
        this.AYXKKw = C56394yDt.copydefault(values());
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(I)Lo/auw; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C7986auF KWHzl(int i) {
        return (C7986auF) InterfaceC7981auA.ActionBar.AEQbTJ(this, i);
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna(Lo/auw;)Lo/auw; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C7986auF AhwBna(@NotNull C7986auF c7986auF) {
        return (C7986auF) InterfaceC7981auA.ActionBar.AEQbTJ(this, c7986auF);
    }

    /* JADX DEBUG: Method merged with bridge method: djBIcL(Lo/auw;)Lo/auw; */
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public C7986auF djBIcL(@NotNull C7986auF c7986auF) {
        return (C7986auF) InterfaceC7981auA.ActionBar.copydefault(this, c7986auF);
    }

    /* JADX DEBUG: Method merged with bridge method: AYXKKw(Lo/auw;)Lo/auw; */
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public C7986auF AYXKKw(@NotNull C7986auF c7986auF) {
        return (C7986auF) InterfaceC7981auA.ActionBar.EZpvd(this, c7986auF);
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt(Lo/auw;)Lo/auw; */
    /* JADX INFO: renamed from: AkhnZx, reason: merged with bridge method [inline-methods] */
    public C7986auF gEmmrt(@NotNull C7986auF c7986auF) {
        return (C7986auF) InterfaceC7981auA.ActionBar.KWHzl(this, c7986auF);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(I)Lo/auw; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C7986auF OLrzqt(int i) {
        return (C7986auF) InterfaceC7981auA.ActionBar.copydefault(this, i);
    }

    /* JADX DEBUG: Method merged with bridge method: valueOf(Lo/auw;)Lo/auw; */
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C7986auF valueOf(@NotNull C7986auF c7986auF) {
        return (C7986auF) InterfaceC7981auA.ActionBar.OLrzqt(this, c7986auF);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7986auF(long j) {
        Sign sign;
        long[] jArrAEQbTJ = valueOf.AEQbTJ(j);
        java.lang.Number numberValueOf = java.lang.Long.valueOf(j);
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.Long.class);
        if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.longValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.intValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.shortValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Byte.TYPE))) {
            if (numberValueOf.byteValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.byteValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else {
            throw new java.lang.RuntimeException(Intrinsics.KWHzl("Unsupported type ", C56524yIo.AEQbTJ(java.lang.Long.class)));
        }
        this(jArrAEQbTJ, sign, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7986auF(int i) {
        Sign sign;
        long[] jArrKWHzl = valueOf.KWHzl(i);
        java.lang.Number numberValueOf = java.lang.Integer.valueOf(i);
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.Integer.class);
        if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.longValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.intValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.shortValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Byte.TYPE))) {
            if (numberValueOf.byteValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.byteValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else {
            throw new java.lang.RuntimeException(Intrinsics.KWHzl("Unsupported type ", C56524yIo.AEQbTJ(java.lang.Integer.class)));
        }
        this(jArrKWHzl, sign, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7986auF(short s) {
        Sign sign;
        long[] jArrAEQbTJ = valueOf.AEQbTJ(s);
        java.lang.Number numberValueOf = java.lang.Short.valueOf(s);
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.Short.class);
        if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.longValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.intValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.shortValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Byte.TYPE))) {
            if (numberValueOf.byteValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.byteValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else {
            throw new java.lang.RuntimeException(Intrinsics.KWHzl("Unsupported type ", C56524yIo.AEQbTJ(java.lang.Short.class)));
        }
        this(jArrAEQbTJ, sign, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7986auF(byte b) {
        Sign sign;
        long[] jArrEZpvd = valueOf.EZpvd(b);
        java.lang.Number numberValueOf = java.lang.Byte.valueOf(b);
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(java.lang.Byte.class);
        if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Long.TYPE))) {
            if (numberValueOf.longValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.longValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Integer.TYPE))) {
            if (numberValueOf.intValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.intValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Short.TYPE))) {
            if (numberValueOf.shortValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.shortValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else if (Intrinsics.EZpvd(interfaceC56551yJoAEQbTJ, C56524yIo.AEQbTJ(java.lang.Byte.TYPE))) {
            if (numberValueOf.byteValue() < 0) {
                sign = Sign.NEGATIVE;
            } else {
                sign = numberValueOf.byteValue() > 0 ? Sign.POSITIVE : Sign.ZERO;
            }
        } else {
            throw new java.lang.RuntimeException(Intrinsics.KWHzl("Unsupported type ", C56524yIo.AEQbTJ(java.lang.Byte.class)));
        }
        this(jArrEZpvd, sign, null);
    }

    /* JADX INFO: renamed from: o.auF$Application */
    public static final class Application implements InterfaceC8028auw.Activity<C7986auF> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.auF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public C7986auF copydefault() {
            return C7986auF.copydefault;
        }

        public C7986auF AEQbTJ() {
            return C7986auF.KWHzl;
        }

        public C7986auF OLrzqt() {
            return C7986auF.OLrzqt;
        }

        public C7986auF EZpvd() {
            return C7986auF.EZpvd;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/String;I)Ljava/lang/Object; */
        @Override // o.InterfaceC8028auw.Activity
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public C7986auF EZpvd(@NotNull java.lang.String str, int i) {
            Sign sign;
            Intrinsics.checkNotNullParameter(str, "");
            if (i < 2 || i > 36) {
                throw new java.lang.NumberFormatException("Unsupported base: " + i + ". Supported base range is from 2 to 36");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, '.', false, 2, (java.lang.Object) null)) {
                BigDecimal bigDecimalEZpvd = BigDecimal.Companion.EZpvd(str);
                if (bigDecimalEZpvd.djBIcL(bigDecimalEZpvd.copydefault()).compareTo(0) > 0) {
                    throw new java.lang.NumberFormatException("Supplied string is decimal, which cannot be converted to BigInteger without precision loss.");
                }
                return bigDecimalEZpvd.AYXKKw();
            }
            if (str.charAt(0) == '-' || str.charAt(0) == '+') {
                if (str.length() == 1) {
                    throw new java.lang.NumberFormatException(Intrinsics.KWHzl("Invalid big integer: ", str));
                }
                if (str.charAt(0) == '-') {
                    sign = Sign.NEGATIVE;
                } else {
                    sign = Sign.POSITIVE;
                }
                if (str.length() == 2 && str.charAt(1) == '0') {
                    return copydefault();
                }
                InterfaceC7985auE interfaceC7985auE = C7986auF.valueOf;
                java.lang.String strSubstring = str.substring(1, str.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                return new C7986auF(interfaceC7985auE.copydefault(strSubstring, i), sign, defaultConstructorMarker);
            }
            if (str.length() == 1 && str.charAt(0) == '0') {
                return copydefault();
            }
            return new C7986auF(C7986auF.valueOf.copydefault(str, i), Sign.POSITIVE, defaultConstructorMarker);
        }

        public C7986auF OLrzqt(long j) {
            return new C7986auF(C7986auF.valueOf.copydefault(j), Sign.POSITIVE, null);
        }

        public C7986auF AEQbTJ(int i) {
            return new C7986auF(C7986auF.valueOf.OLrzqt(i), Sign.POSITIVE, null);
        }

        public C7986auF EZpvd(short s) {
            return new C7986auF(C7986auF.valueOf.KWHzl(s), Sign.POSITIVE, null);
        }

        public C7986auF EZpvd(byte b) {
            return new C7986auF(C7986auF.valueOf.KWHzl(b), Sign.POSITIVE, null);
        }

        public C7986auF copydefault(long j) {
            return new C7986auF(j);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(I)Ljava/lang/Object; */
        @Override // o.InterfaceC8028auw.Activity
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public C7986auF KWHzl(int i) {
            return new C7986auF(i);
        }

        public C7986auF KWHzl(short s) {
            return new C7986auF(s);
        }

        public C7986auF OLrzqt(byte b) {
            return new C7986auF(b);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(FZ)Ljava/lang/Object; */
        @Override // o.InterfaceC8028auw.Activity
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public C7986auF KWHzl(float f, boolean z) {
            double d = f;
            float fFloor = (float) java.lang.Math.floor(d);
            BigDecimal bigDecimalAEQbTJ = BigDecimal.Companion.AEQbTJ((float) java.lang.Math.floor(d), (C7984auD) null);
            if (z && f - fFloor > 0.0f) {
                throw new java.lang.ArithmeticException("Cant create BigInteger without precision loss, and exact  value was required");
            }
            return bigDecimalAEQbTJ.AYXKKw();
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(DZ)Ljava/lang/Object; */
        @Override // o.InterfaceC8028auw.Activity
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public C7986auF copydefault(double d, boolean z) {
            double dFloor = java.lang.Math.floor(d);
            BigDecimal bigDecimalEZpvd = BigDecimal.Companion.EZpvd(java.lang.Math.floor(d), (C7984auD) null);
            if (z && d - dFloor > AudioStats.AUDIO_AMPLITUDE_NONE) {
                throw new java.lang.ArithmeticException("Cant create BigInteger without precision loss, and exact  value was required");
            }
            return bigDecimalEZpvd.AYXKKw();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Application(defaultConstructorMarker);
        InterfaceC7985auE interfaceC7985auEOLrzqt = C7991auK.OLrzqt();
        valueOf = interfaceC7985auEOLrzqt;
        copydefault = new C7986auF(interfaceC7985auEOLrzqt.copydefault(), Sign.ZERO, defaultConstructorMarker);
        long[] jArrAEQbTJ = interfaceC7985auEOLrzqt.AEQbTJ();
        Sign sign = Sign.POSITIVE;
        KWHzl = new C7986auF(jArrAEQbTJ, sign, defaultConstructorMarker);
        OLrzqt = new C7986auF(interfaceC7985auEOLrzqt.EZpvd(), sign, defaultConstructorMarker);
        EZpvd = new C7986auF(interfaceC7985auEOLrzqt.KWHzl(), sign, defaultConstructorMarker);
        AEQbTJ = java.lang.Math.log10(2.0d);
    }

    public final boolean KWHzl(long[] jArr) {
        InterfaceC7985auE interfaceC7985auE = valueOf;
        return interfaceC7985auE.EZpvd(jArr, interfaceC7985auE.copydefault()) == 0;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/auw;)Lo/auw; */
    @Override // o.InterfaceC8028auw
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C7986auF AEQbTJ(@NotNull C7986auF c7986auF) {
        Intrinsics.checkNotNullParameter(c7986auF, "");
        InterfaceC7985auE interfaceC7985auE = valueOf;
        int iEZpvd = interfaceC7985auE.EZpvd(values(), c7986auF.values());
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (c7986auF.AhwBna == this.AhwBna) {
            return new C7986auF(interfaceC7985auE.copydefault(values(), c7986auF.values()), this.AhwBna, defaultConstructorMarker);
        }
        if (iEZpvd > 0) {
            return new C7986auF(interfaceC7985auE.OLrzqt(values(), c7986auF.values()), this.AhwBna, defaultConstructorMarker);
        }
        return iEZpvd < 0 ? new C7986auF(interfaceC7985auE.OLrzqt(c7986auF.values(), values()), c7986auF.AhwBna, defaultConstructorMarker) : copydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/auw;)Lo/auw; */
    @Override // o.InterfaceC8028auw
    /* JADX INFO: renamed from: DbNXlk, reason: merged with bridge method [inline-methods] */
    public C7986auF EZpvd(@NotNull C7986auF c7986auF) {
        Intrinsics.checkNotNullParameter(c7986auF, "");
        InterfaceC7985auE interfaceC7985auE = valueOf;
        int iEZpvd = interfaceC7985auE.EZpvd(values(), c7986auF.values());
        C7986auF c7986auF2 = copydefault;
        if (Intrinsics.EZpvd(this, c7986auF2)) {
            return c7986auF.AkhnZx();
        }
        if (Intrinsics.EZpvd(c7986auF, c7986auF2)) {
            return this;
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (c7986auF.AhwBna != this.AhwBna) {
            return new C7986auF(interfaceC7985auE.copydefault(values(), c7986auF.values()), this.AhwBna, defaultConstructorMarker);
        }
        if (iEZpvd > 0) {
            return new C7986auF(interfaceC7985auE.OLrzqt(values(), c7986auF.values()), this.AhwBna, defaultConstructorMarker);
        }
        return iEZpvd < 0 ? new C7986auF(interfaceC7985auE.OLrzqt(c7986auF.values(), values()), this.AhwBna.not(), defaultConstructorMarker) : c7986auF2;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/auw;)Lo/auw; */
    @Override // o.InterfaceC8028auw
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public C7986auF copydefault(@NotNull C7986auF c7986auF) {
        Sign sign;
        Intrinsics.checkNotNullParameter(c7986auF, "");
        if (fetchVPNInfo() || c7986auF.fetchVPNInfo()) {
            return copydefault;
        }
        if (Intrinsics.EZpvd(c7986auF, KWHzl)) {
            return this;
        }
        if (this.AhwBna != c7986auF.AhwBna) {
            sign = Sign.NEGATIVE;
        } else {
            sign = Sign.POSITIVE;
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (sign == Sign.POSITIVE) {
            return new C7986auF(valueOf.KWHzl(values(), c7986auF.values()), sign, defaultConstructorMarker);
        }
        return new C7986auF(valueOf.KWHzl(values(), c7986auF.values()), sign, defaultConstructorMarker);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/auw;)Lo/auw; */
    @Override // o.InterfaceC8028auw
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C7986auF KWHzl(@NotNull C7986auF c7986auF) {
        Sign sign;
        Intrinsics.checkNotNullParameter(c7986auF, "");
        if (c7986auF.fetchVPNInfo()) {
            throw new java.lang.ArithmeticException("Division by zero! " + this + " / " + c7986auF);
        }
        InterfaceC7985auE interfaceC7985auE = valueOf;
        long[] jArrEZpvd = interfaceC7985auE.AEQbTJ(values(), c7986auF.values()).getFirst().EZpvd();
        if (C56394yDt.EZpvd(jArrEZpvd, interfaceC7985auE.copydefault())) {
            return copydefault;
        }
        if (this.AhwBna != c7986auF.AhwBna) {
            sign = Sign.NEGATIVE;
        } else {
            sign = Sign.POSITIVE;
        }
        return new C7986auF(jArrEZpvd, sign, null);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/auw;)Lo/auw; */
    @Override // o.InterfaceC8028auw
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public C7986auF OLrzqt(@NotNull C7986auF c7986auF) {
        Sign sign;
        Intrinsics.checkNotNullParameter(c7986auF, "");
        if (c7986auF.fetchVPNInfo()) {
            throw new java.lang.ArithmeticException("Division by zero! " + this + " / " + c7986auF);
        }
        if (this.AhwBna != c7986auF.AhwBna) {
            sign = Sign.NEGATIVE;
        } else {
            sign = Sign.POSITIVE;
        }
        InterfaceC7985auE interfaceC7985auE = valueOf;
        long[] jArrEZpvd = interfaceC7985auE.AEQbTJ(values(), c7986auF.values()).getSecond().EZpvd();
        if (C56394yDt.EZpvd(jArrEZpvd, interfaceC7985auE.copydefault())) {
            sign = Sign.ZERO;
        }
        return new C7986auF(jArrEZpvd, sign, null);
    }

    public kotlin.Pair<C7986auF, C7986auF> KWHzl(@NotNull C7986auF c7986auF) {
        Sign sign;
        Intrinsics.checkNotNullParameter(c7986auF, "");
        if (c7986auF.fetchVPNInfo()) {
            throw new java.lang.ArithmeticException("Division by zero! " + this + " / " + c7986auF);
        }
        if (this.AhwBna != c7986auF.AhwBna) {
            sign = Sign.NEGATIVE;
        } else {
            sign = Sign.POSITIVE;
        }
        InterfaceC7985auE interfaceC7985auE = valueOf;
        kotlin.Pair<C56394yDt, C56394yDt> pairAEQbTJ = interfaceC7985auE.AEQbTJ(values(), c7986auF.values());
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new kotlin.Pair<>(C56394yDt.EZpvd(pairAEQbTJ.getFirst().EZpvd(), interfaceC7985auE.copydefault()) ? copydefault : new C7986auF(pairAEQbTJ.getFirst().EZpvd(), sign, defaultConstructorMarker), C56394yDt.EZpvd(pairAEQbTJ.getSecond().EZpvd(), interfaceC7985auE.copydefault()) ? copydefault : new C7986auF(pairAEQbTJ.getSecond().EZpvd(), this.AhwBna, defaultConstructorMarker));
    }

    public final int copydefault(@NotNull C7986auF c7986auF) {
        Intrinsics.checkNotNullParameter(c7986auF, "");
        if (fetchVPNInfo() && c7986auF.fetchVPNInfo()) {
            return 0;
        }
        if (c7986auF.fetchVPNInfo() && this.AhwBna == Sign.POSITIVE) {
            return 1;
        }
        if (c7986auF.fetchVPNInfo() && this.AhwBna == Sign.NEGATIVE) {
            return -1;
        }
        if (fetchVPNInfo() && c7986auF.AhwBna == Sign.POSITIVE) {
            return -1;
        }
        if (fetchVPNInfo() && c7986auF.AhwBna == Sign.NEGATIVE) {
            return 1;
        }
        Sign sign = this.AhwBna;
        if (sign != c7986auF.AhwBna) {
            return sign == Sign.POSITIVE ? 1 : -1;
        }
        int iEZpvd = valueOf.EZpvd(values(), c7986auF.values());
        Sign sign2 = this.AhwBna;
        Sign sign3 = Sign.NEGATIVE;
        return (sign2 == sign3 && c7986auF.AhwBna == sign3) ? iEZpvd * (-1) : iEZpvd;
    }

    public boolean fetchVPNInfo() {
        return this.AhwBna == Sign.ZERO || C7991auK.OLrzqt().EZpvd(values(), C7991auK.OLrzqt().copydefault()) == 0;
    }

    public C7986auF AkhnZx() {
        return new C7986auF(values(), this.AhwBna.not(), null);
    }

    public C7986auF gEmmrt() {
        return new C7986auF(values(), Sign.POSITIVE, null);
    }

    public C7986auF AEQbTJ(long j) {
        if (j < 0) {
            throw new java.lang.ArithmeticException("Negative exponent not supported with BigInteger");
        }
        C7986auF c7986auF = copydefault;
        if (Intrinsics.EZpvd(this, c7986auF)) {
            return c7986auF;
        }
        C7986auF c7986auF2 = KWHzl;
        if (Intrinsics.EZpvd(this, c7986auF2)) {
            return c7986auF2;
        }
        Sign sign = this.AhwBna;
        Sign sign2 = Sign.NEGATIVE;
        if (sign != sign2 || j % ((long) 2) == 0) {
            sign2 = Sign.POSITIVE;
        }
        return new C7986auF(valueOf.EZpvd(values(), j), sign2, null);
    }

    public C7986auF EZpvd(int i) {
        return AEQbTJ(i);
    }

    public int fIwbmz() {
        int i = TaskDescription.OLrzqt[this.AhwBna.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return -1;
        }
        if (i == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public long fARcdN() {
        if (fetchVPNInfo()) {
            return 1L;
        }
        int iCeil = (int) java.lang.Math.ceil(((double) (valueOf.copydefault(values()) - 1)) * AEQbTJ);
        C7986auF c7986auF = (C7986auF) AhwBna((InterfaceC8028auw) C7987auG.KWHzl(10).EZpvd(iCeil));
        long j = 0;
        while (c7986auF.compareTo(0) != 0) {
            c7986auF = (C7986auF) c7986auF.KWHzl(10);
            j++;
        }
        return j + ((long) iCeil);
    }

    public final C7986auF valueOf() {
        return (C7986auF) AYXKKw((InterfaceC8028auw) KWHzl);
    }

    public final C7986auF isConnected() {
        return (C7986auF) valueOf((InterfaceC8028auw) KWHzl);
    }

    public final ActionBar gEmmrt(@NotNull C7986auF c7986auF) {
        Intrinsics.checkNotNullParameter(c7986auF, "");
        kotlin.Pair<C7986auF, C7986auF> pairKWHzl = KWHzl(c7986auF);
        return new ActionBar(pairKWHzl.getFirst(), pairKWHzl.getSecond());
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof java.lang.Number) {
            java.lang.Number number = (java.lang.Number) obj;
            if (C7983auC.copydefault.OLrzqt(number)) {
                return OLrzqt(number);
            }
        }
        if (obj instanceof C7986auF) {
            return copydefault((C7986auF) obj);
        }
        if (obj instanceof java.lang.Long) {
            return copydefault(Companion.copydefault(((java.lang.Number) obj).longValue()));
        }
        if (obj instanceof java.lang.Integer) {
            return copydefault(Companion.KWHzl(((java.lang.Number) obj).intValue()));
        }
        if (obj instanceof java.lang.Short) {
            return copydefault(Companion.KWHzl(((java.lang.Number) obj).shortValue()));
        }
        if (obj instanceof java.lang.Byte) {
            return copydefault(Companion.OLrzqt(((java.lang.Number) obj).byteValue()));
        }
        if (obj instanceof C56396yDv) {
            return copydefault(Companion.OLrzqt(((C56396yDv) obj).OLrzqt()));
        }
        if (obj instanceof C56395yDu) {
            return copydefault(Companion.AEQbTJ(((C56395yDu) obj).copydefault()));
        }
        if (obj instanceof yDB) {
            return copydefault(Companion.EZpvd(((yDB) obj).EZpvd()));
        }
        if (obj instanceof C56393yDs) {
            return copydefault(Companion.EZpvd(((C56393yDs) obj).OLrzqt()));
        }
        if (obj instanceof java.lang.Float) {
            return KWHzl(((java.lang.Number) obj).floatValue(), new Function1<C7986auF, java.lang.Integer>() { // from class: com.ionspin.kotlin.bignum.integer.BigInteger$compareTo$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final int invoke2(@NotNull C7986auF c7986auF) {
                    Intrinsics.checkNotNullParameter(c7986auF, "");
                    return this.this$0.copydefault(c7986auF);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Integer invoke(C7986auF c7986auF) {
                    return Integer.valueOf(invoke2(c7986auF));
                }
            });
        }
        if (obj instanceof java.lang.Double) {
            return OLrzqt(((java.lang.Number) obj).doubleValue(), new Function1<C7986auF, java.lang.Integer>() { // from class: com.ionspin.kotlin.bignum.integer.BigInteger$compareTo$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final int invoke2(@NotNull C7986auF c7986auF) {
                    Intrinsics.checkNotNullParameter(c7986auF, "");
                    return this.this$0.copydefault(c7986auF);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Integer invoke(C7986auF c7986auF) {
                    return Integer.valueOf(invoke2(c7986auF));
                }
            });
        }
        throw new java.lang.RuntimeException(Intrinsics.KWHzl("Invalid comparison type for BigInteger: ", C56524yIo.AEQbTJ(obj.getClass())));
    }

    private final int OLrzqt(java.lang.Number number) {
        if (number.floatValue() % 1 == 0.0f) {
            return copydefault(Companion.copydefault(number.longValue()));
        }
        return KWHzl(number.floatValue(), new Function1<C7986auF, java.lang.Integer>() { // from class: com.ionspin.kotlin.bignum.integer.BigInteger$javascriptNumberComparison$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2(@NotNull C7986auF c7986auF) {
                Intrinsics.checkNotNullParameter(c7986auF, "");
                return this.this$0.copydefault(c7986auF);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Integer invoke(C7986auF c7986auF) {
                return Integer.valueOf(invoke2(c7986auF));
            }
        });
    }

    public final int KWHzl(float f, @NotNull Function1<? super C7986auF, java.lang.Integer> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        float fFloor = (float) java.lang.Math.floor(f);
        float f2 = 1;
        if (!(f % f2 == 0.0f)) {
            int iIntValue = function1.invoke(InterfaceC8028auw.Activity.Application.tryFromFloat$default(Companion, fFloor + f2, false, 2, null)).intValue();
            if (iIntValue == 0) {
                return 1;
            }
            return iIntValue;
        }
        return function1.invoke(InterfaceC8028auw.Activity.Application.tryFromFloat$default(Companion, fFloor, false, 2, null)).intValue();
    }

    public final int OLrzqt(double d, @NotNull Function1<? super C7986auF, java.lang.Integer> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        double dFloor = java.lang.Math.floor(d);
        double d2 = 1;
        if (!(d % d2 == AudioStats.AUDIO_AMPLITUDE_NONE)) {
            int iIntValue = function1.invoke(InterfaceC8028auw.Activity.Application.tryFromDouble$default(Companion, dFloor + d2, false, 2, null)).intValue();
            if (iIntValue == 0) {
                return 1;
            }
            return iIntValue;
        }
        return function1.invoke(InterfaceC8028auw.Activity.Application.tryFromDouble$default(Companion, dFloor, false, 2, null)).intValue();
    }

    public boolean equals(java.lang.Object obj) {
        int iCopydefault;
        if (obj instanceof C7986auF) {
            iCopydefault = copydefault((C7986auF) obj);
        } else if (obj instanceof java.lang.Long) {
            iCopydefault = copydefault(Companion.copydefault(((java.lang.Number) obj).longValue()));
        } else if (obj instanceof java.lang.Integer) {
            iCopydefault = copydefault(Companion.KWHzl(((java.lang.Number) obj).intValue()));
        } else if (obj instanceof java.lang.Short) {
            iCopydefault = copydefault(Companion.KWHzl(((java.lang.Number) obj).shortValue()));
        } else if (obj instanceof java.lang.Byte) {
            iCopydefault = copydefault(Companion.OLrzqt(((java.lang.Number) obj).byteValue()));
        } else if (obj instanceof C56396yDv) {
            iCopydefault = copydefault(Companion.OLrzqt(((C56396yDv) obj).OLrzqt()));
        } else if (obj instanceof C56395yDu) {
            iCopydefault = copydefault(Companion.AEQbTJ(((C56395yDu) obj).copydefault()));
        } else {
            if (!(obj instanceof yDB)) {
                if (obj instanceof C56393yDs) {
                    iCopydefault = copydefault(Companion.EZpvd(((C56393yDs) obj).OLrzqt()));
                }
            }
            iCopydefault = copydefault(Companion.EZpvd(((yDB) obj).EZpvd()));
        }
        return iCopydefault == 0;
    }

    public int hashCode() {
        int iAEQbTJ = 0;
        for (long j : values()) {
            iAEQbTJ += C56396yDv.AEQbTJ(j);
        }
        return iAEQbTJ + this.AhwBna.hashCode();
    }

    public java.lang.String toString() {
        return AhwBna(10);
    }

    public java.lang.String AhwBna(int i) {
        return Intrinsics.KWHzl(this.AhwBna == Sign.NEGATIVE ? "-" : "", AYXKKw(i));
    }

    public final java.lang.String AYXKKw(int i) {
        return valueOf.OLrzqt(values(), i);
    }

    /* JADX INFO: renamed from: o.auF$ActionBar */
    public static final class ActionBar {
        public final C7986auF OLrzqt;
        public final C7986auF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, C7986auF c7986auF, C7986auF c7986auF2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c7986auF = actionBar.OLrzqt;
            }
            if ((i & 2) != 0) {
                c7986auF2 = actionBar.copydefault;
            }
            return actionBar.KWHzl(c7986auF, c7986auF2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7986auF EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull C7986auF c7986auF, @NotNull C7986auF c7986auF2) {
            Intrinsics.checkNotNullParameter(c7986auF, "");
            Intrinsics.checkNotNullParameter(c7986auF2, "");
            return new ActionBar(c7986auF, c7986auF2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7986auF OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "QuotientAndRemainder(quotient=" + this.OLrzqt + ", remainder=" + this.copydefault + ')';
        }

        public ActionBar(@NotNull C7986auF c7986auF, @NotNull C7986auF c7986auF2) {
            Intrinsics.checkNotNullParameter(c7986auF, "");
            Intrinsics.checkNotNullParameter(c7986auF2, "");
            this.OLrzqt = c7986auF;
            this.copydefault = c7986auF2;
        }
    }

    public int OLrzqt(boolean z) {
        if (z && (compareTo(Integer.MAX_VALUE) > 0 || compareTo(Integer.MIN_VALUE) < 0)) {
            throw new java.lang.ArithmeticException("Cannot convert to int and provide exact value");
        }
        return ((int) C56394yDt.copydefault(values(), 0)) * fIwbmz();
    }
}
