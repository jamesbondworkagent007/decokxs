package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oSJ {
    public final oSK OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oSK) A[MD:(o.oSK):void (m)] call: o.oSJ.<init>(o.oSK):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ oSJ(oSK osk, DefaultConstructorMarker defaultConstructorMarker) {
        this(osk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public oSK KWHzl() {
        return this.OLrzqt;
    }

    public oSJ(oSK osk) {
        this.OLrzqt = osk;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:o.oSK:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.oSK) : (r1v0 o.oSK))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(o.oSK, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:6) call: o.oSJ.<init>(o.oSK, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ oSJ(oSK osk, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : osk, null);
    }

    public static final class Application extends oSJ {
        public final java.lang.String EZpvd;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i & 2) != 0) {
                z = application.copydefault;
            }
            return application.AEQbTJ(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Title(title=" + this.EZpvd + ", isVisible=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:10) call: o.oSJ.Application.<init>(java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? true : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str, boolean z) {
            super(null, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.copydefault = z;
        }
    }

    public static final class Activity extends oSJ {
        public final java.lang.String AEQbTJ;
        public final oSK AhwBna;
        public final boolean EZpvd;
        public final boolean KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, oSK osk, boolean z, java.lang.String str, int i, boolean z2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                osk = activity.AhwBna;
            }
            if ((i2 & 2) != 0) {
                z = activity.EZpvd;
            }
            boolean z3 = z;
            if ((i2 & 4) != 0) {
                str = activity.AEQbTJ;
            }
            java.lang.String str2 = str;
            if ((i2 & 8) != 0) {
                i = activity.copydefault;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                z2 = activity.KWHzl;
            }
            return activity.KWHzl(osk, z3, str2, i3, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull oSK osk, boolean z, @NotNull java.lang.String str, @androidx.annotation.DrawableRes int i, boolean z2) {
            Intrinsics.checkNotNullParameter(osk, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(osk, z, str, i, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oSJ
        public oSK KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
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
            return Intrinsics.EZpvd(this.AhwBna, activity.AhwBna) && this.EZpvd == activity.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && this.copydefault == activity.copydefault && this.KWHzl == activity.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.AhwBna.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Top(type=" + this.AhwBna + ", isVisible=" + this.EZpvd + ", title=" + this.AEQbTJ + ", iconRes=" + this.copydefault + ", isShowRedPoint=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r7v0 o.oSK)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
  (r9v0 java.lang.String)
  (r10v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(o.oSK, boolean, java.lang.String, int, boolean):void (m)] (LINE:15) call: o.oSJ.Activity.<init>(o.oSK, boolean, java.lang.String, int, boolean):void type: THIS */
        public /* synthetic */ Activity(oSK osk, boolean z, java.lang.String str, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(osk, (i2 & 2) != 0 ? true : z, str, i, (i2 & 16) != 0 ? false : z2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull oSK osk, boolean z, @NotNull java.lang.String str, @androidx.annotation.DrawableRes int i, boolean z2) {
            super(osk, null);
            Intrinsics.checkNotNullParameter(osk, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AhwBna = osk;
            this.EZpvd = z;
            this.AEQbTJ = str;
            this.copydefault = i;
            this.KWHzl = z2;
        }
    }

    public static final class StateListAnimator extends oSJ {
        public final boolean AEQbTJ;
        public final oSK AYXKKw;
        public final boolean EZpvd;
        public final boolean KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, oSK osk, boolean z, java.lang.String str, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                osk = stateListAnimator.AYXKKw;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.KWHzl;
            }
            boolean z4 = z;
            if ((i & 4) != 0) {
                str = stateListAnimator.copydefault;
            }
            java.lang.String str2 = str;
            if ((i & 8) != 0) {
                z2 = stateListAnimator.AEQbTJ;
            }
            boolean z5 = z2;
            if ((i & 16) != 0) {
                z3 = stateListAnimator.EZpvd;
            }
            return stateListAnimator.copydefault(osk, z4, str2, z5, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oSJ
        public oSK KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull oSK osk, boolean z, @NotNull java.lang.String str, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(osk, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(osk, z, str, z2, z3);
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
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.AYXKKw, stateListAnimator.AYXKKw) && this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && this.AEQbTJ == stateListAnimator.AEQbTJ && this.EZpvd == stateListAnimator.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.AYXKKw.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CheckBox(type=" + this.AYXKKw + ", isVisible=" + this.KWHzl + ", title=" + this.copydefault + ", isSelected=" + this.AEQbTJ + ", isNeedGuide=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r8v0 o.oSK)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r9v0 boolean))
  (r10v0 java.lang.String)
  (wrap:boolean:0x000d: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
 A[MD:(o.oSK, boolean, java.lang.String, boolean, boolean):void (m)] (LINE:24) call: o.oSJ.StateListAnimator.<init>(o.oSK, boolean, java.lang.String, boolean, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(oSK osk, boolean z, java.lang.String str, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(osk, (i & 2) != 0 ? true : z, str, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? true : z3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull oSK osk, boolean z, @NotNull java.lang.String str, boolean z2, boolean z3) {
            super(osk, null);
            Intrinsics.checkNotNullParameter(osk, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AYXKKw = osk;
            this.KWHzl = z;
            this.copydefault = str;
            this.AEQbTJ = z2;
            this.EZpvd = z3;
        }
    }

    public static final class TaskDescription extends oSJ {
        public final int AEQbTJ;
        public final boolean EZpvd;
        public final oSK KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, oSK osk, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                osk = taskDescription.KWHzl;
            }
            if ((i2 & 2) != 0) {
                z = taskDescription.EZpvd;
            }
            if ((i2 & 4) != 0) {
                i = taskDescription.AEQbTJ;
            }
            return taskDescription.KWHzl(osk, z, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull oSK osk, boolean z, int i) {
            Intrinsics.checkNotNullParameter(osk, "");
            return new TaskDescription(osk, z, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.oSJ
        public oSK KWHzl() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && this.EZpvd == taskDescription.EZpvd && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SeekBar(type=" + this.KWHzl + ", isVisible=" + this.EZpvd + ", progress=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.oSK)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (r3v0 int)
 A[MD:(o.oSK, boolean, int):void (m)] (LINE:32) call: o.oSJ.TaskDescription.<init>(o.oSK, boolean, int):void type: THIS */
        public /* synthetic */ TaskDescription(oSK osk, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(osk, (i2 & 2) != 0 ? true : z, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull oSK osk, boolean z, int i) {
            super(osk, null);
            Intrinsics.checkNotNullParameter(osk, "");
            this.KWHzl = osk;
            this.EZpvd = z;
            this.AEQbTJ = i;
        }
    }
}
