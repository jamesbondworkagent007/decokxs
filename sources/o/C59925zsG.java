package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59925zsG {
    public final java.math.BigInteger AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.math.BigInteger AEQbTJ(@NotNull java.math.BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        return bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean OLrzqt(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        return Intrinsics.EZpvd(bigInteger, bigInteger2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int copydefault(java.math.BigInteger bigInteger) {
        return bigInteger.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean copydefault(java.math.BigInteger bigInteger, java.lang.Object obj) {
        return (obj instanceof C59925zsG) && Intrinsics.EZpvd(bigInteger, ((C59925zsG) obj).EZpvd());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ java.math.BigInteger EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return copydefault(this.AEQbTJ, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return copydefault(this.AEQbTJ);
    }

    public static java.lang.String KWHzl(java.math.BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        java.lang.String string = bigInteger.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public java.lang.String toString() {
        return KWHzl(this.AEQbTJ);
    }
}
