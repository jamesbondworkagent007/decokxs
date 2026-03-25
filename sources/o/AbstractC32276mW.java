package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC32276mW {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public static final java.util.List<AbstractC32276mW> copydefault = yDY.gEmmrt(TaskDescription.EZpvd, ActionBar.KWHzl, Application.KWHzl, Activity.AEQbTJ, Fragment.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mW.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC32276mW(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC32276mW() {
    }

    /* JADX INFO: renamed from: o.mW$TaskDescription */
    public static final class TaskDescription extends AbstractC32276mW {
        public static final TaskDescription EZpvd = new TaskDescription();
        public static final java.lang.String KWHzl = "ACTIVE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Active";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.mW$ActionBar */
    public static final class ActionBar extends AbstractC32276mW {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String EZpvd = "AT_RISK";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AtRisk";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.mW$Application */
    public static final class Application extends AbstractC32276mW {
        public static final Application KWHzl = new Application();
        public static final java.lang.String AEQbTJ = "CREATION_ERROR";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CreationError";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.mW$Activity */
    public static final class Activity extends AbstractC32276mW {
        public static final Activity AEQbTJ = new Activity();
        public static final java.lang.String KWHzl = "CREATION_IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CreationInProgress";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.mW$Fragment */
    public static final class Fragment extends AbstractC32276mW {
        public static final Fragment EZpvd = new Fragment();
        public static final java.lang.String KWHzl = "DEPRECATED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Deprecated";
        }

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.mW$Dialog */
    public static final class Dialog extends AbstractC32276mW {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.AEQbTJ;
            }
            return dialog.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((Dialog) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    /* JADX INFO: renamed from: o.mW$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mW.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC32276mW AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1505380216:
                    if (str.equals("CREATION_ERROR")) {
                        return Application.KWHzl;
                    }
                    break;
                case -1341080921:
                    if (str.equals("CREATION_IN_PROGRESS")) {
                        return Activity.AEQbTJ;
                    }
                    break;
                case -1147252301:
                    if (str.equals("DEPRECATED")) {
                        return Fragment.EZpvd;
                    }
                    break;
                case 53295963:
                    if (str.equals("AT_RISK")) {
                        return ActionBar.KWHzl;
                    }
                    break;
                case 1925346054:
                    if (str.equals("ACTIVE")) {
                        return TaskDescription.EZpvd;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
