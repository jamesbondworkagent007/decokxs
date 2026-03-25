package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57227yeT implements InterfaceC57302yfp {
    public final java.util.List<TaskDescription> AEQbTJ;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yeT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C57227yeT copy$default(C57227yeT c57227yeT, java.util.List list, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c57227yeT.AEQbTJ;
        }
        if ((i & 2) != 0) {
            j = c57227yeT.copydefault;
        }
        return c57227yeT.copydefault(list, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TaskDescription> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57227yeT copydefault(@NotNull java.util.List<TaskDescription> list, long j) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C57227yeT(list, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57227yeT)) {
            return false;
        }
        C57227yeT c57227yeT = (C57227yeT) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c57227yeT.AEQbTJ) && this.copydefault == c57227yeT.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + java.lang.Long.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MultiAddressState(addresses=" + this.AEQbTJ + ", version=" + this.copydefault + ")";
    }

    public C57227yeT(@NotNull java.util.List<TaskDescription> list, long j) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.copydefault = j;
    }

    /* JADX INFO: renamed from: o.yeT$TaskDescription */
    public static final class TaskDescription {
        public final int AEQbTJ;
        public final int AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String AkhnZx;
        public final boolean EZpvd;
        public final boolean KWHzl;
        public final int OLrzqt;
        public final int copydefault;
        public final int djBIcL;
        public final int fetchVPNInfo;
        public final int gEmmrt;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AYXKKw() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(int i, @NotNull java.lang.String str, int i2, int i3, int i4, @androidx.annotation.ColorRes int i5, @androidx.annotation.DrawableRes int i6, @androidx.annotation.ColorRes int i7, @NotNull java.lang.String str2, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(i, str, i2, i3, i4, i5, i6, i7, str2, z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.copydefault == taskDescription.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) taskDescription.AkhnZx) && this.AYXKKw == taskDescription.AYXKKw && this.OLrzqt == taskDescription.OLrzqt && this.djBIcL == taskDescription.djBIcL && this.fetchVPNInfo == taskDescription.fetchVPNInfo && this.AEQbTJ == taskDescription.AEQbTJ && this.gEmmrt == taskDescription.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) taskDescription.AhwBna) && this.valueOf == taskDescription.valueOf && this.KWHzl == taskDescription.KWHzl && this.EZpvd == taskDescription.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((java.lang.Integer.hashCode(this.copydefault) * 31) + this.AkhnZx.hashCode()) * 31) + java.lang.Integer.hashCode(this.AYXKKw)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.djBIcL)) * 31) + java.lang.Integer.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.gEmmrt)) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AddressState(id=" + this.copydefault + ", text=" + this.AkhnZx + ", selection=" + this.AYXKKw + ", index=" + this.OLrzqt + ", selectedIndex=" + this.djBIcL + ", textColor=" + this.fetchVPNInfo + ", background=" + this.AEQbTJ + ", promptColor=" + this.gEmmrt + ", promptMsg=" + this.AhwBna + ", isShowPrompt=" + this.valueOf + ", isShowAlertBanner=" + this.KWHzl + ", isExchangeAddress=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.djBIcL;
        }

        public TaskDescription(int i, @NotNull java.lang.String str, int i2, int i3, int i4, @androidx.annotation.ColorRes int i5, @androidx.annotation.DrawableRes int i6, @androidx.annotation.ColorRes int i7, @NotNull java.lang.String str2, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = i;
            this.AkhnZx = str;
            this.AYXKKw = i2;
            this.OLrzqt = i3;
            this.djBIcL = i4;
            this.fetchVPNInfo = i5;
            this.AEQbTJ = i6;
            this.gEmmrt = i7;
            this.AhwBna = str2;
            this.valueOf = z;
            this.KWHzl = z2;
            this.EZpvd = z3;
        }
    }
}
