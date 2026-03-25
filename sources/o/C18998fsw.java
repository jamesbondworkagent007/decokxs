package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18998fsw {
    public final java.lang.String AEQbTJ;
    public final long EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18998fsw copy$default(C18998fsw c18998fsw, long j, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = c18998fsw.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c18998fsw.KWHzl;
        }
        if ((i & 4) != 0) {
            str2 = c18998fsw.AEQbTJ;
        }
        return c18998fsw.EZpvd(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18998fsw EZpvd(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C18998fsw(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18998fsw)) {
            return false;
        }
        C18998fsw c18998fsw = (C18998fsw) obj;
        return this.EZpvd == c18998fsw.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c18998fsw.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c18998fsw.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Long.hashCode(this.EZpvd) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletSearchFilterChainUiModel(chainId=" + this.EZpvd + ", chainName=" + this.KWHzl + ", chainLogo=" + this.AEQbTJ + ")";
    }

    public C18998fsw(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = j;
        this.KWHzl = str;
        this.AEQbTJ = str2;
    }
}
