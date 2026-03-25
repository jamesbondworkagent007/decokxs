package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public interface fTZ {

    public static final class Application implements fTZ {
        public final C10854bwM AEQbTJ;
        public boolean EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, boolean z2, C10854bwM c10854bwM, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.copydefault;
            }
            if ((i & 2) != 0) {
                z2 = application.EZpvd;
            }
            boolean z3 = z2;
            if ((i & 4) != 0) {
                c10854bwM = application.AEQbTJ;
            }
            C10854bwM c10854bwM2 = c10854bwM;
            if ((i & 8) != 0) {
                str = application.OLrzqt;
            }
            java.lang.String str3 = str;
            if ((i & 16) != 0) {
                str2 = application.KWHzl;
            }
            return application.KWHzl(z, z3, c10854bwM2, str3, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.copydefault = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(boolean z, boolean z2, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(z, z2, c10854bwM, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10854bwM OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.copydefault == application.copydefault && this.EZpvd == application.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((java.lang.Boolean.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SmallAssets(hasQuote=" + this.copydefault + ", isChecked=" + this.EZpvd + ", coinMeta=" + this.AEQbTJ + ", amount=" + this.OLrzqt + ", currency=" + this.KWHzl + ")";
        }

        public Application(boolean z, boolean z2, @NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = z;
            this.EZpvd = z2;
            this.AEQbTJ = c10854bwM;
            this.OLrzqt = str;
            this.KWHzl = str2;
        }
    }

    public static final class StateListAnimator implements fTZ {
        public final int KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                z = stateListAnimator.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                i = stateListAnimator.KWHzl;
            }
            return stateListAnimator.KWHzl(z, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(boolean z, int i) {
            return new StateListAnimator(z, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.OLrzqt == stateListAnimator.OLrzqt && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Empty(hasSubTitle=" + this.OLrzqt + ", unAvailableTokenNum=" + this.KWHzl + ")";
        }

        public StateListAnimator(boolean z, int i) {
            this.OLrzqt = z;
            this.KWHzl = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(boolean, int):void (m)] (LINE:15) call: o.fTZ.StateListAnimator.<init>(boolean, int):void type: THIS */
        public /* synthetic */ StateListAnimator(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i2 & 2) != 0 ? 0 : i);
        }
    }

    public static final class ActionBar implements fTZ {
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, null, false, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.copydefault;
            }
            if ((i & 4) != 0) {
                z = actionBar.KWHzl;
            }
            return actionBar.AEQbTJ(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(java.lang.String str, java.lang.String str2, boolean z) {
            return new ActionBar(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
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
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && this.KWHzl == actionBar.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.OLrzqt;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.copydefault;
            return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NetworkError(title=" + this.OLrzqt + ", subTitle=" + this.copydefault + ", canRetry=" + this.KWHzl + ")";
        }

        public ActionBar(java.lang.String str, java.lang.String str2, boolean z) {
            this.OLrzqt = str;
            this.copydefault = str2;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:17) call: o.fTZ.ActionBar.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z);
        }
    }

    public static final class TaskDescription implements fTZ {
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(int i) {
            return new TaskDescription(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.copydefault == ((TaskDescription) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HiddenTokensEntry(hiddenCount=" + this.copydefault + ")";
        }

        public TaskDescription(int i) {
            this.copydefault = i;
        }
    }
}
