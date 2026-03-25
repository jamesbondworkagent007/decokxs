package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AQq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC2565AQq {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AQq.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC2565AQq(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2565AQq() {
    }

    /* JADX INFO: renamed from: o.AQq$ActionBar */
    public static final class ActionBar extends AbstractC2565AQq {
        public static final int $stable = 8;
        public final C2562AQn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, C2562AQn c2562AQn, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c2562AQn = actionBar.copydefault;
            }
            return actionBar.copydefault(c2562AQn);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C2562AQn KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull C2562AQn c2562AQn) {
            Intrinsics.checkNotNullParameter(c2562AQn, "");
            return new ActionBar(c2562AQn);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.copydefault, ((ActionBar) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Text(v1=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C2562AQn c2562AQn) {
            super(null);
            Intrinsics.checkNotNullParameter(c2562AQn, "");
            this.copydefault = c2562AQn;
        }
    }

    /* JADX INFO: renamed from: o.AQq$Activity */
    public static final class Activity extends AbstractC2565AQq {
        public static final int $stable = 8;
        public final ANZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, ANZ anz, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                anz = activity.copydefault;
            }
            return activity.AEQbTJ(anz);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ANZ AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull ANZ anz) {
            Intrinsics.checkNotNullParameter(anz, "");
            return new Activity(anz);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.copydefault, ((Activity) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ImageDefault(v1=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ANZ anz) {
            super(null);
            Intrinsics.checkNotNullParameter(anz, "");
            this.copydefault = anz;
        }
    }

    /* JADX INFO: renamed from: o.AQq$TaskDescription */
    public static final class TaskDescription extends AbstractC2565AQq {
        public static final int $stable = 8;
        public final ANW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, ANW anw, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                anw = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(anw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ANW AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull ANW anw) {
            Intrinsics.checkNotNullParameter(anw, "");
            return new TaskDescription(anw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ImageCustom(v1=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ANW anw) {
            super(null);
            Intrinsics.checkNotNullParameter(anw, "");
            this.copydefault = anw;
        }
    }

    /* JADX INFO: renamed from: o.AQq$StateListAnimator */
    public static final class StateListAnimator extends AbstractC2565AQq {
        public static final int $stable = 8;
        public final C2497AOa EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, C2497AOa c2497AOa, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c2497AOa = stateListAnimator.EZpvd;
            }
            return stateListAnimator.AEQbTJ(c2497AOa);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C2497AOa AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull C2497AOa c2497AOa) {
            Intrinsics.checkNotNullParameter(c2497AOa, "");
            return new StateListAnimator(c2497AOa);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((StateListAnimator) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ImageCustomLua(v1=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C2497AOa c2497AOa) {
            super(null);
            Intrinsics.checkNotNullParameter(c2497AOa, "");
            this.EZpvd = c2497AOa;
        }
    }

    /* JADX INFO: renamed from: o.AQq$Application */
    public static final class Application extends AbstractC2565AQq {
        public static final int $stable = 8;
        public final C2501AOe OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, C2501AOe c2501AOe, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c2501AOe = application.OLrzqt;
            }
            return application.KWHzl(c2501AOe);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull C2501AOe c2501AOe) {
            Intrinsics.checkNotNullParameter(c2501AOe, "");
            return new Application(c2501AOe);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C2501AOe OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.OLrzqt, ((Application) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LinkDefault(v1=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C2501AOe c2501AOe) {
            super(null);
            Intrinsics.checkNotNullParameter(c2501AOe, "");
            this.OLrzqt = c2501AOe;
        }
    }
}
