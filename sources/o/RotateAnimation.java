package o;

import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class RotateAnimation {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public static final java.util.List<RotateAnimation> KWHzl = yDY.gEmmrt(Application.AEQbTJ, Activity.copydefault, StateListAnimator.copydefault, ActionBar.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RotateAnimation.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RotateAnimation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String copydefault();

    private RotateAnimation() {
    }

    public static final class Application extends RotateAnimation {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String OLrzqt = "completed";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RotateAnimation
        public java.lang.String copydefault() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Completed";
        }

        private Application() {
            super(null);
        }
    }

    public static final class Activity extends RotateAnimation {
        public static final Activity copydefault = new Activity();
        public static final java.lang.String AEQbTJ = EopTrackEvent.KEY_RESULT_FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RotateAnimation
        public java.lang.String copydefault() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class StateListAnimator extends RotateAnimation {
        public static final StateListAnimator copydefault = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "inProgress";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RotateAnimation
        public java.lang.String copydefault() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InProgress";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class ActionBar extends RotateAnimation {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final java.lang.String copydefault = "scheduled";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RotateAnimation
        public java.lang.String copydefault() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Scheduled";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class LoaderManager extends RotateAnimation {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.OLrzqt;
            }
            return loaderManager.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LoaderManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RotateAnimation
        public java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((LoaderManager) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RotateAnimation.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [38=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final RotateAnimation KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1402931637:
                    if (str.equals("completed")) {
                        return Application.AEQbTJ;
                    }
                    break;
                case -1347010958:
                    if (str.equals("inProgress")) {
                        return StateListAnimator.copydefault;
                    }
                    break;
                case -1281977283:
                    if (str.equals(EopTrackEvent.KEY_RESULT_FAILED)) {
                        return Activity.copydefault;
                    }
                    break;
                case -160710483:
                    if (str.equals("scheduled")) {
                        return ActionBar.AEQbTJ;
                    }
                    break;
            }
            return new LoaderManager(str);
        }
    }
}
