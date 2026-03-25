package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gWn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC19982gWn {

    /* JADX INFO: renamed from: o.gWn$ActionBar */
    public static final class ActionBar implements InterfaceC19982gWn {
        public final java.lang.Integer AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.Integer KWHzl;
        public final InterfaceC19970gWb OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, InterfaceC19970gWb interfaceC19970gWb, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                num = actionBar.KWHzl;
            }
            java.lang.Integer num3 = num;
            if ((i & 4) != 0) {
                num2 = actionBar.AEQbTJ;
            }
            java.lang.Integer num4 = num2;
            if ((i & 8) != 0) {
                str2 = actionBar.EZpvd;
            }
            java.lang.String str3 = str2;
            if ((i & 16) != 0) {
                interfaceC19970gWb = actionBar.OLrzqt;
            }
            return actionBar.copydefault(str, num3, num4, str3, interfaceC19970gWb);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC19970gWb AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.lang.String str, @androidx.annotation.DrawableRes java.lang.Integer num, @androidx.annotation.ColorInt java.lang.Integer num2, java.lang.String str2, InterfaceC19970gWb interfaceC19970gWb) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str, num, num2, str2, interfaceC19970gWb);
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            java.lang.Integer num = this.KWHzl;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.AEQbTJ;
            int iHashCode3 = num2 == null ? 0 : num2.hashCode();
            java.lang.String str = this.EZpvd;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            InterfaceC19970gWb interfaceC19970gWb = this.OLrzqt;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (interfaceC19970gWb != null ? interfaceC19970gWb.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Default(content=" + this.copydefault + ", trailingIcon=" + this.KWHzl + ", trailingIconTint=" + this.AEQbTJ + ", leadingIcon=" + this.EZpvd + ", clickAction=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @androidx.annotation.DrawableRes java.lang.Integer num, @androidx.annotation.ColorInt java.lang.Integer num2, java.lang.String str2, InterfaceC19970gWb interfaceC19970gWb) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.KWHzl = num;
            this.AEQbTJ = num2;
            this.EZpvd = str2;
            this.OLrzqt = interfaceC19970gWb;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:o.gWb:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null o.gWb) : (r12v0 o.gWb))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, o.gWb):void (m)] (LINE:22) call: o.gWn.ActionBar.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, o.gWb):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, InterfaceC19970gWb interfaceC19970gWb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : interfaceC19970gWb);
        }
    }

    /* JADX INFO: renamed from: o.gWn$TaskDescription */
    public static final class TaskDescription implements InterfaceC19982gWn {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final InterfaceC19970gWb OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC19970gWb interfaceC19970gWb, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.copydefault;
            }
            if ((i & 4) != 0) {
                str3 = taskDescription.KWHzl;
            }
            if ((i & 8) != 0) {
                interfaceC19970gWb = taskDescription.OLrzqt;
            }
            return taskDescription.OLrzqt(str, str2, str3, interfaceC19970gWb);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC19970gWb interfaceC19970gWb) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str, str2, str3, interfaceC19970gWb);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC19970gWb copydefault() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            java.lang.String str = this.copydefault;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.KWHzl;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            InterfaceC19970gWb interfaceC19970gWb = this.OLrzqt;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (interfaceC19970gWb != null ? interfaceC19970gWb.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Address(address=" + this.AEQbTJ + ", kolName=" + this.copydefault + ", kolUrl=" + this.KWHzl + ", clickAction=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC19970gWb interfaceC19970gWb) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.copydefault = str2;
            this.KWHzl = str3;
            this.OLrzqt = interfaceC19970gWb;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:o.gWb:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.gWb) : (r5v0 o.gWb))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, o.gWb):void (m)] (LINE:31) call: o.gWn.TaskDescription.<init>(java.lang.String, java.lang.String, java.lang.String, o.gWb):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC19970gWb interfaceC19970gWb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : interfaceC19970gWb);
        }
    }

    /* JADX INFO: renamed from: o.gWn$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC19982gWn {
        public final java.lang.String EZpvd;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PnL(content=" + this.EZpvd + ", isProfit=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.OLrzqt = z;
        }
    }

    /* JADX INFO: renamed from: o.gWn$Activity */
    public static final class Activity implements InterfaceC19982gWn {
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = activity.copydefault;
            }
            return activity.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
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
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Txns(buyCount=" + this.OLrzqt + ", sellCount=" + this.copydefault + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.copydefault = str2;
        }
    }

    /* JADX INFO: renamed from: o.gWn$Application */
    public static final class Application implements InterfaceC19982gWn {
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = application.OLrzqt;
            }
            return application.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Application(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BuySell(buyAmt=" + this.KWHzl + ", sellAmt=" + this.OLrzqt + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.OLrzqt = str2;
        }
    }
}
