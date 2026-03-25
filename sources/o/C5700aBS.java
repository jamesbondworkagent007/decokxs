package o;

import java.security.KeyStore;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5700aBS {
    public final byte[] AEQbTJ;
    public final java.lang.String EZpvd;
    public final KeyStore.PrivateKeyEntry KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5700aBS copy$default(C5700aBS c5700aBS, java.lang.String str, java.lang.String str2, java.lang.String str3, KeyStore.PrivateKeyEntry privateKeyEntry, byte[] bArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c5700aBS.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c5700aBS.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c5700aBS.OLrzqt;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            privateKeyEntry = c5700aBS.KWHzl;
        }
        KeyStore.PrivateKeyEntry privateKeyEntry2 = privateKeyEntry;
        if ((i & 16) != 0) {
            bArr = c5700aBS.AEQbTJ;
        }
        return c5700aBS.EZpvd(str, str4, str5, privateKeyEntry2, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeyStore.PrivateKeyEntry EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5700aBS EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull KeyStore.PrivateKeyEntry privateKeyEntry, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(privateKeyEntry, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        return new C5700aBS(str, str2, str3, privateKeyEntry, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5700aBS)) {
            return false;
        }
        C5700aBS c5700aBS = (C5700aBS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c5700aBS.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c5700aBS.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c5700aBS.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c5700aBS.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c5700aBS.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.util.Arrays.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UserKeyPair(credentialId=" + this.copydefault + ", userId=" + this.EZpvd + ", rpId=" + this.OLrzqt + ", privateKey=" + this.KWHzl + ", publicKey=" + java.util.Arrays.toString(this.AEQbTJ) + ")";
    }

    public C5700aBS(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull KeyStore.PrivateKeyEntry privateKeyEntry, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(privateKeyEntry, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.OLrzqt = str3;
        this.KWHzl = privateKeyEntry;
        this.AEQbTJ = bArr;
    }
}
