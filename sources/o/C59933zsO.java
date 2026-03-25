package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59933zsO {
    public static final Application copydefault = new Application(null);
    public java.math.BigInteger AEQbTJ;
    public java.math.BigInteger KWHzl;
    public java.math.BigInteger OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59933zsO() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C59933zsO copy$default(C59933zsO c59933zsO, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigInteger = c59933zsO.OLrzqt;
        }
        if ((i & 2) != 0) {
            bigInteger2 = c59933zsO.AEQbTJ;
        }
        if ((i & 4) != 0) {
            bigInteger3 = c59933zsO.KWHzl;
        }
        return c59933zsO.EZpvd(bigInteger, bigInteger2, bigInteger3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59933zsO EZpvd(@NotNull java.math.BigInteger bigInteger, @NotNull java.math.BigInteger bigInteger2, @NotNull java.math.BigInteger bigInteger3) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        Intrinsics.checkNotNullParameter(bigInteger3, "");
        return new C59933zsO(bigInteger, bigInteger2, bigInteger3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59933zsO)) {
            return false;
        }
        C59933zsO c59933zsO = (C59933zsO) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c59933zsO.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c59933zsO.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c59933zsO.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignatureData(r=" + this.OLrzqt + ", s=" + this.AEQbTJ + ", v=" + this.KWHzl + ')';
    }

    public C59933zsO(@NotNull java.math.BigInteger bigInteger, @NotNull java.math.BigInteger bigInteger2, @NotNull java.math.BigInteger bigInteger3) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        Intrinsics.checkNotNullParameter(bigInteger3, "");
        this.OLrzqt = bigInteger;
        this.AEQbTJ = bigInteger2;
        this.KWHzl = bigInteger3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C59933zsO(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            bigInteger = java.math.BigInteger.ZERO;
            Intrinsics.checkNotNullExpressionValue(bigInteger, "");
        }
        if ((i & 2) != 0) {
            bigInteger2 = java.math.BigInteger.ZERO;
            Intrinsics.checkNotNullExpressionValue(bigInteger2, "");
        }
        if ((i & 4) != 0) {
            bigInteger3 = java.math.BigInteger.ZERO;
            Intrinsics.checkNotNullExpressionValue(bigInteger3, "");
        }
        this(bigInteger, bigInteger2, bigInteger3);
    }

    /* JADX INFO: renamed from: o.zsO$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zsO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
