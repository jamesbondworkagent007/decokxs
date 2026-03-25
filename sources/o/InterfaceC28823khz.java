package o;

import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28823khz extends kMU {

    /* JADX INFO: renamed from: o.khz$TaskDescription */
    public static final class TaskDescription {
        public static boolean EZpvd(@NotNull InterfaceC28823khz interfaceC28823khz, @NotNull kMU kmu) {
            Intrinsics.checkNotNullParameter(kmu, "");
            return kMU.TaskDescription.AEQbTJ(interfaceC28823khz, kmu);
        }

        public static java.lang.Object KWHzl(@NotNull InterfaceC28823khz interfaceC28823khz, @NotNull kMU kmu) {
            Intrinsics.checkNotNullParameter(kmu, "");
            return kMU.TaskDescription.EZpvd(interfaceC28823khz, kmu);
        }

        public static boolean OLrzqt(@NotNull InterfaceC28823khz interfaceC28823khz, @NotNull kMU kmu) {
            Intrinsics.checkNotNullParameter(kmu, "");
            return kMU.TaskDescription.KWHzl(interfaceC28823khz, kmu);
        }
    }

    /* JADX INFO: renamed from: o.khz$ActionBar */
    public static final class ActionBar implements InterfaceC28823khz {
        public final boolean AEQbTJ;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.copydefault;
            }
            if ((i & 4) != 0) {
                str3 = actionBar.OLrzqt;
            }
            if ((i & 8) != 0) {
                z = actionBar.AEQbTJ;
            }
            return actionBar.KWHzl(str, str2, str3, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new ActionBar(str, str2, str3, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
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
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && this.AEQbTJ == actionBar.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Protocol(protocolId=" + this.KWHzl + ", protocolName=" + this.copydefault + ", protocolIconUrl=" + this.OLrzqt + ", isSelected=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.KWHzl = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
            this.AEQbTJ = z;
        }

        @Override // o.kMU
        public boolean compareContent(@NotNull kMU kmu) {
            return TaskDescription.EZpvd(this, kmu);
        }

        @Override // o.kMU
        public boolean compareId(@NotNull kMU kmu) {
            return TaskDescription.OLrzqt(this, kmu);
        }

        @Override // o.kMU
        public java.lang.Object getChangePayload(@NotNull kMU kmu) {
            return TaskDescription.KWHzl(this, kmu);
        }
    }

    /* JADX INFO: renamed from: o.khz$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC28823khz {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }

        @Override // o.kMU
        public boolean compareContent(@NotNull kMU kmu) {
            return TaskDescription.EZpvd(this, kmu);
        }

        @Override // o.kMU
        public boolean compareId(@NotNull kMU kmu) {
            return TaskDescription.OLrzqt(this, kmu);
        }

        @Override // o.kMU
        public java.lang.Object getChangePayload(@NotNull kMU kmu) {
            return TaskDescription.KWHzl(this, kmu);
        }
    }
}
