package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59965zsu {
    public final byte[] OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String AEQbTJ(byte[] bArr) {
        return "Seed(seed=" + java.util.Arrays.toString(bArr) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean KWHzl(byte[] bArr, java.lang.Object obj) {
        return (obj instanceof C59965zsu) && Intrinsics.EZpvd(bArr, ((C59965zsu) obj).EZpvd());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static byte[] KWHzl(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int copydefault(byte[] bArr) {
        return java.util.Arrays.hashCode(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ byte[] EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        return KWHzl(this.OLrzqt, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return copydefault(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return AEQbTJ(this.OLrzqt);
    }
}
