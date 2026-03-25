package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41054qja implements InterfaceC40516qYt {
    public final boolean AEQbTJ;
    public final java.lang.String AhwBna;
    public boolean EZpvd;
    public boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41054qja copy$default(C41054qja c41054qja, java.lang.String str, java.lang.String str2, boolean z, boolean z2, long j, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c41054qja.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c41054qja.AhwBna;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            z = c41054qja.EZpvd;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = c41054qja.KWHzl;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            j = c41054qja.copydefault;
        }
        long j2 = j;
        if ((i & 32) != 0) {
            z3 = c41054qja.AEQbTJ;
        }
        return c41054qja.EZpvd(str, str3, z4, z5, j2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41054qja EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, long j, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C41054qja(str, str2, z, z2, j, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41054qja)) {
            return false;
        }
        C41054qja c41054qja = (C41054qja) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c41054qja.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c41054qja.AhwBna) && this.EZpvd == c41054qja.EZpvd && this.KWHzl == c41054qja.KWHzl && this.copydefault == c41054qja.copydefault && this.AEQbTJ == c41054qja.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.OLrzqt.hashCode() * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradingCalendarDayVo(dayValue=" + this.OLrzqt + ", weekValue=" + this.AhwBna + ", isSelected=" + this.EZpvd + ", isClickable=" + this.KWHzl + ", timestamp=" + this.copydefault + ", isToday=" + this.AEQbTJ + ")";
    }

    public C41054qja(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, long j, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.AhwBna = str2;
        this.EZpvd = z;
        this.KWHzl = z2;
        this.copydefault = j;
        this.AEQbTJ = z3;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C41054qja) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C41054qja) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
