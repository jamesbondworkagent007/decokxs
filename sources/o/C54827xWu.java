package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xWu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54827xWu {
    public final long AEQbTJ;
    public final long EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54827xWu OLrzqt(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C54827xWu(j, str, str2, str3, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54827xWu)) {
            return false;
        }
        C54827xWu c54827xWu = (C54827xWu) obj;
        return this.EZpvd == c54827xWu.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c54827xWu.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c54827xWu.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c54827xWu.copydefault) && this.AEQbTJ == c54827xWu.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.EZpvd);
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        java.lang.String str = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DAppHistoryBean(dappId=" + this.EZpvd + ", name=" + this.KWHzl + ", url=" + this.OLrzqt + ", iconUrl=" + this.copydefault + ", timestamp=" + this.AEQbTJ + ")";
    }

    public C54827xWu(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = j;
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.AEQbTJ = j2;
    }
}
