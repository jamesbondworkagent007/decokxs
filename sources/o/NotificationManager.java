package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class NotificationManager {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public static final java.util.List<NotificationManager> copydefault = yDY.gEmmrt(Activity.KWHzl, ActionBar.OLrzqt, Application.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NotificationManager.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NotificationManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String AEQbTJ();

    private NotificationManager() {
    }

    public static final class Activity extends NotificationManager {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String AEQbTJ = "client_credentials";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NotificationManager
        public java.lang.String AEQbTJ() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ClientCredentials";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class ActionBar extends NotificationManager {
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String AEQbTJ = "code";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NotificationManager
        public java.lang.String AEQbTJ() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Code";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Application extends NotificationManager {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String OLrzqt = "implicit";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NotificationManager
        public java.lang.String AEQbTJ() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Implicit";
        }

        private Application() {
            super(null);
        }
    }

    public static final class TaskDescription extends NotificationManager {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.OLrzqt;
            }
            return taskDescription.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NotificationManager
        public java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((TaskDescription) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NotificationManager.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final NotificationManager AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode != -425423387) {
                if (iHashCode != 3059181) {
                    if (iHashCode == 290069640 && str.equals("client_credentials")) {
                        return Activity.KWHzl;
                    }
                } else if (str.equals("code")) {
                    return ActionBar.OLrzqt;
                }
            } else if (str.equals("implicit")) {
                return Application.AEQbTJ;
            }
            return new TaskDescription(str);
        }
    }
}
