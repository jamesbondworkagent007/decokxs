package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55497xl<T> {
    public final T AEQbTJ;
    public final byte[] EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C55497xl copy$default(C55497xl c55497xl, java.lang.Object obj, byte[] bArr, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = c55497xl.AEQbTJ;
        }
        if ((i & 2) != 0) {
            bArr = c55497xl.EZpvd;
        }
        return c55497xl.AEQbTJ(obj, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55497xl<T> AEQbTJ(T t, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new C55497xl<>(t, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AwsSigningResult(output=" + this.AEQbTJ + ", signature=" + java.util.Arrays.toString(this.EZpvd) + ')';
    }

    public C55497xl(T t, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AEQbTJ = t;
        this.EZpvd = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C55497xl.class != obj.getClass()) {
            return false;
        }
        C55497xl c55497xl = (C55497xl) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c55497xl.AEQbTJ) && java.util.Arrays.equals(this.EZpvd, c55497xl.EZpvd);
    }

    public int hashCode() {
        T t = this.AEQbTJ;
        return ((t != null ? t.hashCode() : 0) * 31) + java.util.Arrays.hashCode(this.EZpvd);
    }
}
