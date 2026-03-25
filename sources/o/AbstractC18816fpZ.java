package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18816fpZ implements InterfaceC14776dro {
    public final int AEQbTJ;
    public final int EZpvd;
    public final int OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 int), (r3v0 int) A[MD:(int, int, int):void (m)] call: o.fpZ.<init>(int, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC18816fpZ(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    public AbstractC18816fpZ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.DrawableRes int i3) {
        this.EZpvd = i;
        this.OLrzqt = i2;
        this.AEQbTJ = i3;
    }

    /* JADX INFO: renamed from: o.fpZ$TaskDescription */
    public static final class TaskDescription extends AbstractC18816fpZ {
        public final int AYXKKw;
        public final int KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(0, 0, 0, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = taskDescription.AYXKKw;
            }
            if ((i4 & 2) != 0) {
                i2 = taskDescription.KWHzl;
            }
            if ((i4 & 4) != 0) {
                i3 = taskDescription.copydefault;
            }
            return taskDescription.copydefault(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.DrawableRes int i3) {
            return new TaskDescription(i, i2, i3);
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
            return this.AYXKKw == taskDescription.AYXKKw && this.KWHzl == taskDescription.KWHzl && this.copydefault == taskDescription.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.AYXKKw) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Create(title=" + this.AYXKKw + ", description=" + this.KWHzl + ", icon=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.dXa.FragmentManager.setCurrentControllerInfo int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.dXa.FragmentManager.onAddQueueItem int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0010: SGET  A[WRAPPED] o.wXj.TaskDescription.AYXKKw int) : (r3v0 int))
 A[MD:(int, int, int):void (m)] (LINE:16) call: o.fpZ.TaskDescription.<init>(int, int, int):void type: THIS */
        public /* synthetic */ TaskDescription(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? C13754dXa.FragmentManager.setCurrentControllerInfo : i, (i4 & 2) != 0 ? C13754dXa.FragmentManager.onAddQueueItem : i2, (i4 & 4) != 0 ? C52761wXj.TaskDescription.AYXKKw : i3);
        }

        public TaskDescription(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.DrawableRes int i3) {
            super(i, i2, i3, null);
            this.AYXKKw = i;
            this.KWHzl = i2;
            this.copydefault = i3;
        }
    }

    /* JADX INFO: renamed from: o.fpZ$Activity */
    public static final class Activity extends AbstractC18816fpZ {
        public final int AhwBna;
        public final int KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(0, 0, 0, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = activity.AhwBna;
            }
            if ((i4 & 2) != 0) {
                i2 = activity.KWHzl;
            }
            if ((i4 & 4) != 0) {
                i3 = activity.copydefault;
            }
            return activity.KWHzl(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.DrawableRes int i3) {
            return new Activity(i, i2, i3);
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
            return this.AhwBna == activity.AhwBna && this.KWHzl == activity.KWHzl && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.AhwBna) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Import(title=" + this.AhwBna + ", description=" + this.KWHzl + ", icon=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.dXa.FragmentManager.getRccTransportControlFlagsFromActions int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.dXa.FragmentManager.onCommand int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0010: SGET  A[WRAPPED] o.wXj.TaskDescription.DRGLNw int) : (r3v0 int))
 A[MD:(int, int, int):void (m)] (LINE:22) call: o.fpZ.Activity.<init>(int, int, int):void type: THIS */
        public /* synthetic */ Activity(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? C13754dXa.FragmentManager.getRccTransportControlFlagsFromActions : i, (i4 & 2) != 0 ? C13754dXa.FragmentManager.onCommand : i2, (i4 & 4) != 0 ? C52761wXj.TaskDescription.DRGLNw : i3);
        }

        public Activity(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.DrawableRes int i3) {
            super(i, i2, i3, null);
            this.AhwBna = i;
            this.KWHzl = i2;
            this.copydefault = i3;
        }
    }

    /* JADX INFO: renamed from: o.fpZ$ActionBar */
    public static final class ActionBar extends AbstractC18816fpZ {
        public final int KWHzl;
        public final int copydefault;
        public final int djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(0, 0, 0, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = actionBar.djBIcL;
            }
            if ((i4 & 2) != 0) {
                i2 = actionBar.copydefault;
            }
            if ((i4 & 4) != 0) {
                i3 = actionBar.KWHzl;
            }
            return actionBar.AEQbTJ(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.DrawableRes int i3) {
            return new ActionBar(i, i2, i3);
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
            return this.djBIcL == actionBar.djBIcL && this.copydefault == actionBar.copydefault && this.KWHzl == actionBar.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.djBIcL) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HardwareWallet(title=" + this.djBIcL + ", description=" + this.copydefault + ", icon=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.dXa.FragmentManager.unregisterMediaButtonEventReceiver int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.dXa.FragmentManager.handleMediaPlayPauseKeySingleTapIfPending int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0010: SGET  A[WRAPPED] o.wXj.TaskDescription.fbC int) : (r3v0 int))
 A[MD:(int, int, int):void (m)] (LINE:28) call: o.fpZ.ActionBar.<init>(int, int, int):void type: THIS */
        public /* synthetic */ ActionBar(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? C13754dXa.FragmentManager.unregisterMediaButtonEventReceiver : i, (i4 & 2) != 0 ? C13754dXa.FragmentManager.handleMediaPlayPauseKeySingleTapIfPending : i2, (i4 & 4) != 0 ? C52761wXj.TaskDescription.fbC : i3);
        }

        public ActionBar(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.DrawableRes int i3) {
            super(i, i2, i3, null);
            this.djBIcL = i;
            this.copydefault = i2;
            this.KWHzl = i3;
        }
    }

    /* JADX INFO: renamed from: o.fpZ$StateListAnimator */
    public static final class StateListAnimator extends AbstractC18816fpZ {
        public final int KWHzl;
        public final int copydefault;
        public final int valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(0, 0, 0, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = stateListAnimator.valueOf;
            }
            if ((i4 & 2) != 0) {
                i2 = stateListAnimator.copydefault;
            }
            if ((i4 & 4) != 0) {
                i3 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.DrawableRes int i3) {
            return new StateListAnimator(i, i2, i3);
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
            return this.valueOf == stateListAnimator.valueOf && this.copydefault == stateListAnimator.copydefault && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.valueOf) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WatchOnlyWallet(title=" + this.valueOf + ", description=" + this.copydefault + ", icon=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.dXa.FragmentManager.registerMediaButtonEventReceiver int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.dXa.FragmentManager.onMediaButtonEvent int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0010: SGET  A[WRAPPED] o.wXj.TaskDescription.ZNPcth int) : (r3v0 int))
 A[MD:(int, int, int):void (m)] (LINE:34) call: o.fpZ.StateListAnimator.<init>(int, int, int):void type: THIS */
        public /* synthetic */ StateListAnimator(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? C13754dXa.FragmentManager.registerMediaButtonEventReceiver : i, (i4 & 2) != 0 ? C13754dXa.FragmentManager.onMediaButtonEvent : i2, (i4 & 4) != 0 ? C52761wXj.TaskDescription.ZNPcth : i3);
        }

        public StateListAnimator(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.DrawableRes int i3) {
            super(i, i2, i3, null);
            this.valueOf = i;
            this.copydefault = i2;
            this.KWHzl = i3;
        }
    }

    @Override // o.InterfaceC14776dro
    public java.lang.String copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string = context.getString(this.EZpvd);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC14776dro
    public java.lang.String AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string = context.getString(this.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.InterfaceC14776dro
    public android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, this.AEQbTJ);
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(context, C52761wXj.Activity.DTeKQX));
        }
        return drawable;
    }
}
