package o;

import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29582kwP implements kMU {
    public final java.lang.String EZpvd;
    public final int KWHzl;
    public final long OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C29582kwP copy$default(C29582kwP c29582kwP, int i, long j, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c29582kwP.KWHzl;
        }
        if ((i2 & 2) != 0) {
            j = c29582kwP.OLrzqt;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str = c29582kwP.copydefault;
        }
        java.lang.String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = c29582kwP.EZpvd;
        }
        return c29582kwP.OLrzqt(i, j2, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29582kwP OLrzqt(int i, long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C29582kwP(i, j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29582kwP)) {
            return false;
        }
        C29582kwP c29582kwP = (C29582kwP) obj;
        return this.KWHzl == c29582kwP.KWHzl && this.OLrzqt == c29582kwP.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c29582kwP.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c29582kwP.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignalSummary(count=" + this.KWHzl + ", eventTime=" + this.OLrzqt + ", marketCap=" + this.copydefault + ", price=" + this.EZpvd + ")";
    }

    public C29582kwP(int i, long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = i;
        this.OLrzqt = j;
        this.copydefault = str;
        this.EZpvd = str2;
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }
}
