package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class SearchDialog {
    public static final ActionBar copydefault = new ActionBar(null);
    public static final java.util.List<SearchDialog> KWHzl = yDY.gEmmrt(Activity.OLrzqt, Application.AEQbTJ, StateListAnimator.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SearchDialog.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SearchDialog(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SearchDialog() {
    }

    public static final class Activity extends SearchDialog {
        public static final Activity OLrzqt = new Activity();
        public static final java.lang.String AEQbTJ = "High";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "High";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class Application extends SearchDialog {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String EZpvd = "Low";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Low";
        }

        private Application() {
            super(null);
        }
    }

    public static final class StateListAnimator extends SearchDialog {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String OLrzqt = "Medium";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Medium";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class TaskDescription extends SearchDialog {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.AEQbTJ;
            }
            return taskDescription.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
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
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((TaskDescription) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SearchDialog.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final SearchDialog copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode != -1994163307) {
                if (iHashCode != 76596) {
                    if (iHashCode == 2249154 && str.equals("High")) {
                        return Activity.OLrzqt;
                    }
                } else if (str.equals("Low")) {
                    return Application.AEQbTJ;
                }
            } else if (str.equals("Medium")) {
                return StateListAnimator.AEQbTJ;
            }
            return new TaskDescription(str);
        }
    }
}
