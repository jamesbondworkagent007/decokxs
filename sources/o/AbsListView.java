package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbsListView {
    public static final Application AEQbTJ = new Application(null);
    public static final java.util.List<AbsListView> OLrzqt = yDY.gEmmrt(TaskDescription.copydefault, ActionBar.KWHzl, Activity.KWHzl, StateListAnimator.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AbsListView.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbsListView(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbsListView() {
    }

    public static final class TaskDescription extends AbsListView {
        public static final TaskDescription copydefault = new TaskDescription();
        public static final java.lang.String EZpvd = "FACE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Face";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class ActionBar extends AbsListView {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String copydefault = "HEAD";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Head";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Activity extends AbsListView {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String copydefault = "LEFT_HAND";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LeftHand";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class StateListAnimator extends AbsListView {
        public static final StateListAnimator EZpvd = new StateListAnimator();
        public static final java.lang.String copydefault = "RIGHT_HAND";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RightHand";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class PendingIntent extends AbsListView {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.EZpvd;
            }
            return pendingIntent.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PendingIntent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((PendingIntent) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AbsListView.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [38=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbsListView OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -873364270:
                    if (str.equals("RIGHT_HAND")) {
                        return StateListAnimator.EZpvd;
                    }
                    break;
                case 2149981:
                    if (str.equals("FACE")) {
                        return TaskDescription.copydefault;
                    }
                    break;
                case 2213344:
                    if (str.equals("HEAD")) {
                        return ActionBar.KWHzl;
                    }
                    break;
                case 262784423:
                    if (str.equals("LEFT_HAND")) {
                        return Activity.KWHzl;
                    }
                    break;
            }
            return new PendingIntent(str);
        }
    }
}
