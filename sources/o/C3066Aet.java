package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Aet, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3066Aet {
    public static final int $stable = 8;
    public byte[] AEQbTJ;
    public byte[] EZpvd;
    public byte[] KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3066Aet copy$default(C3066Aet c3066Aet, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = c3066Aet.KWHzl;
        }
        if ((i & 2) != 0) {
            bArr2 = c3066Aet.EZpvd;
        }
        if ((i & 4) != 0) {
            bArr3 = c3066Aet.AEQbTJ;
        }
        return c3066Aet.KWHzl(bArr, bArr2, bArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3066Aet KWHzl(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        return new C3066Aet(bArr, bArr2, bArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3066Aet)) {
            return false;
        }
        C3066Aet c3066Aet = (C3066Aet) obj;
        return Intrinsics.EZpvd(this.KWHzl, c3066Aet.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c3066Aet.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c3066Aet.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.util.Arrays.hashCode(this.KWHzl) * 31) + java.util.Arrays.hashCode(this.EZpvd)) * 31) + java.util.Arrays.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RegistrationResult(credentialId=" + java.util.Arrays.toString(this.KWHzl) + ", attestationObject=" + java.util.Arrays.toString(this.EZpvd) + ", clientDataJson=" + java.util.Arrays.toString(this.AEQbTJ) + ")";
    }

    public C3066Aet(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        this.KWHzl = bArr;
        this.EZpvd = bArr2;
        this.AEQbTJ = bArr3;
    }
}
