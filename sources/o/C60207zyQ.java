package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zyQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C60207zyQ {
    public static final int $stable = 8;
    public byte[] AEQbTJ;
    public java.lang.String EZpvd;
    public byte[] KWHzl;
    public byte[] OLrzqt;
    public byte[] copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C60207zyQ copy$default(C60207zyQ c60207zyQ, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = c60207zyQ.KWHzl;
        }
        if ((i & 2) != 0) {
            bArr2 = c60207zyQ.copydefault;
        }
        byte[] bArr5 = bArr2;
        if ((i & 4) != 0) {
            bArr3 = c60207zyQ.OLrzqt;
        }
        byte[] bArr6 = bArr3;
        if ((i & 8) != 0) {
            bArr4 = c60207zyQ.AEQbTJ;
        }
        byte[] bArr7 = bArr4;
        if ((i & 16) != 0) {
            str = c60207zyQ.djBIcL;
        }
        java.lang.String str3 = str;
        if ((i & 32) != 0) {
            str2 = c60207zyQ.EZpvd;
        }
        return c60207zyQ.AEQbTJ(bArr, bArr5, bArr6, bArr7, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60207zyQ AEQbTJ(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull byte[] bArr4, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(bArr4, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C60207zyQ(bArr, bArr2, bArr3, bArr4, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60207zyQ)) {
            return false;
        }
        C60207zyQ c60207zyQ = (C60207zyQ) obj;
        return Intrinsics.EZpvd(this.KWHzl, c60207zyQ.KWHzl) && Intrinsics.EZpvd(this.copydefault, c60207zyQ.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c60207zyQ.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c60207zyQ.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c60207zyQ.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c60207zyQ.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.util.Arrays.hashCode(this.KWHzl);
        int iHashCode2 = java.util.Arrays.hashCode(this.copydefault);
        int iHashCode3 = java.util.Arrays.hashCode(this.OLrzqt);
        int iHashCode4 = java.util.Arrays.hashCode(this.AEQbTJ);
        int iHashCode5 = this.djBIcL.hashCode();
        java.lang.String str = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AssertionResult(credentialId=" + java.util.Arrays.toString(this.KWHzl) + ", authenticatorData=" + java.util.Arrays.toString(this.copydefault) + ", signature=" + java.util.Arrays.toString(this.OLrzqt) + ", clientDataJson=" + java.util.Arrays.toString(this.AEQbTJ) + ", userId=" + this.djBIcL + ", encryptedPasskey=" + this.EZpvd + ")";
    }

    public C60207zyQ(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull byte[] bArr4, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(bArr4, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = bArr;
        this.copydefault = bArr2;
        this.OLrzqt = bArr3;
        this.AEQbTJ = bArr4;
        this.djBIcL = str;
        this.EZpvd = str2;
    }
}
