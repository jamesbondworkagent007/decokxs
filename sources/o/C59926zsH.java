package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59926zsH {
    public final java.math.BigInteger AEQbTJ;
    public final java.math.BigInteger KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.math.BigInteger), (r2v0 java.math.BigInteger) A[MD:(java.math.BigInteger, java.math.BigInteger):void (m)] call: o.zsH.<init>(java.math.BigInteger, java.math.BigInteger):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C59926zsH(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigInteger, bigInteger2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-hU7SZYE$default, reason: not valid java name */
    public static /* synthetic */ C59926zsH m9312copyhU7SZYE$default(C59926zsH c59926zsH, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bigInteger = c59926zsH.AEQbTJ;
        }
        if ((i & 2) != 0) {
            bigInteger2 = c59926zsH.KWHzl;
        }
        return c59926zsH.KWHzl(bigInteger, bigInteger2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.math.BigInteger AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59926zsH KWHzl(@NotNull java.math.BigInteger bigInteger, @NotNull java.math.BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        return new C59926zsH(bigInteger, bigInteger2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.math.BigInteger OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59926zsH)) {
            return false;
        }
        C59926zsH c59926zsH = (C59926zsH) obj;
        return C59928zsJ.KWHzl(this.AEQbTJ, c59926zsH.AEQbTJ) && C59925zsG.OLrzqt(this.KWHzl, c59926zsH.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (C59928zsJ.OLrzqt(this.AEQbTJ) * 31) + C59925zsG.copydefault(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ECKeyPair(privateKey=" + ((java.lang.Object) C59928zsJ.EZpvd(this.AEQbTJ)) + ", publicKey=" + ((java.lang.Object) C59925zsG.KWHzl(this.KWHzl)) + ')';
    }

    public C59926zsH(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.AEQbTJ = bigInteger;
        this.KWHzl = bigInteger2;
    }
}
