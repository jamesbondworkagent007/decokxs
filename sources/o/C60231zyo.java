package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.AccountErrorType;

/* JADX INFO: renamed from: o.zyo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C60231zyo {
    public static final int $stable = 8;
    public C4326BbW AEQbTJ;
    public int EZpvd;
    public java.lang.String KWHzl;
    public int OLrzqt;
    public AccountErrorType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C60231zyo copy$default(C60231zyo c60231zyo, int i, int i2, java.lang.String str, AccountErrorType accountErrorType, C4326BbW c4326BbW, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c60231zyo.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i2 = c60231zyo.OLrzqt;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = c60231zyo.KWHzl;
        }
        java.lang.String str2 = str;
        if ((i3 & 8) != 0) {
            accountErrorType = c60231zyo.copydefault;
        }
        AccountErrorType accountErrorType2 = accountErrorType;
        if ((i3 & 16) != 0) {
            c4326BbW = c60231zyo.AEQbTJ;
        }
        return c60231zyo.AEQbTJ(i, i4, str2, accountErrorType2, c4326BbW);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60231zyo AEQbTJ(int i, int i2, @NotNull java.lang.String str, @NotNull AccountErrorType accountErrorType, C4326BbW c4326BbW) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(accountErrorType, "");
        return new C60231zyo(i, i2, str, accountErrorType, c4326BbW);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountErrorType AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4326BbW EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60231zyo)) {
            return false;
        }
        C60231zyo c60231zyo = (C60231zyo) obj;
        return this.EZpvd == c60231zyo.EZpvd && this.OLrzqt == c60231zyo.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c60231zyo.KWHzl) && this.copydefault == c60231zyo.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c60231zyo.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.EZpvd);
        int iHashCode2 = java.lang.Integer.hashCode(this.OLrzqt);
        int iHashCode3 = this.KWHzl.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        C4326BbW c4326BbW = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (c4326BbW == null ? 0 : c4326BbW.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AccountError(httpStatus=" + this.EZpvd + ", businessCode=" + this.OLrzqt + ", errorMessage=" + this.KWHzl + ", errorType=" + this.copydefault + ", originResponse=" + this.AEQbTJ + ")";
    }

    public C60231zyo(int i, int i2, @NotNull java.lang.String str, @NotNull AccountErrorType accountErrorType, C4326BbW c4326BbW) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(accountErrorType, "");
        this.EZpvd = i;
        this.OLrzqt = i2;
        this.KWHzl = str;
        this.copydefault = accountErrorType;
        this.AEQbTJ = c4326BbW;
    }
}
