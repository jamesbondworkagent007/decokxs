package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59928zsJ {
    public final java.math.BigInteger KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.math.BigInteger AEQbTJ(@NotNull java.math.BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        return bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String EZpvd(java.math.BigInteger bigInteger) {
        return "PrivateKey(key=" + bigInteger + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean KWHzl(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        return Intrinsics.EZpvd(bigInteger, bigInteger2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OLrzqt(java.math.BigInteger bigInteger) {
        return bigInteger.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean OLrzqt(java.math.BigInteger bigInteger, java.lang.Object obj) {
        return (obj instanceof C59928zsJ) && Intrinsics.EZpvd(bigInteger, ((C59928zsJ) obj).copydefault());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ java.math.BigInteger copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return OLrzqt(this.KWHzl, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return OLrzqt(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return EZpvd(this.KWHzl);
    }

    public static java.math.BigInteger KWHzl(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return AEQbTJ(C59927zsI.KWHzl(bArr));
    }
}
