package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nTK {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nTK.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ nTK(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class TaskDescription extends nTK {
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = taskDescription.KWHzl;
            }
            return taskDescription.KWHzl(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(boolean z) {
            return new TaskDescription(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.KWHzl == ((TaskDescription) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AlreadyInGroup(autoEnter=" + this.KWHzl + ")";
        }

        public TaskDescription(boolean z) {
            super(null);
            this.KWHzl = z;
        }
    }

    private nTK() {
    }

    public static final class FragmentManager extends nTK {
        public static final FragmentManager AEQbTJ = new FragmentManager();

        private FragmentManager() {
            super(null);
        }
    }

    public static final class Application extends nTK {
        public final nTF EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, nTF ntf, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ntf = application.EZpvd;
            }
            return application.AEQbTJ(ntf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull nTF ntf) {
            Intrinsics.checkNotNullParameter(ntf, "");
            return new Application(ntf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final nTF EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ApprovalRequired(approvalFormData=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull nTF ntf) {
            super(null);
            Intrinsics.checkNotNullParameter(ntf, "");
            this.EZpvd = ntf;
        }
    }

    public static final class Dialog extends nTK {
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = dialog.OLrzqt;
            }
            return dialog.AEQbTJ(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog AEQbTJ(boolean z) {
            return new Dialog(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && this.OLrzqt == ((Dialog) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MinimumAssetsRequired(approvalRequired=" + this.OLrzqt + ")";
        }

        public Dialog(boolean z) {
            super(null);
            this.OLrzqt = z;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class PendingIntent extends nTK {
        public final boolean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = pendingIntent.EZpvd;
            }
            return pendingIntent.AEQbTJ(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent AEQbTJ(boolean z) {
            return new PendingIntent(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && this.EZpvd == ((PendingIntent) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MinimumAssetsChanged(approvalRequired=" + this.EZpvd + ")";
        }

        public PendingIntent(boolean z) {
            super(null);
            this.EZpvd = z;
        }
    }

    public static final class ActionBar extends nTK {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    public static final class StateListAnimator extends nTK {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Activity extends nTK {
        public static final Activity copydefault = new Activity();

        private Activity() {
            super(null);
        }
    }

    public static final class LoaderManager extends nTK {
        public static final LoaderManager copydefault = new LoaderManager();

        private LoaderManager() {
            super(null);
        }
    }

    public static final class Fragment extends nTK {
        public static final Fragment OLrzqt = new Fragment();

        private Fragment() {
            super(null);
        }
    }
}
