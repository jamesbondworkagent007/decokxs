package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class SearchableInfo {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final java.util.List<SearchableInfo> AEQbTJ = yDY.gEmmrt(Application.OLrzqt, StateListAnimator.OLrzqt, Activity.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SearchableInfo.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SearchableInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SearchableInfo() {
    }

    public static final class Application extends SearchableInfo {
        public static final Application OLrzqt = new Application();
        public static final java.lang.String EZpvd = "AccountTakeover";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AccountTakeover";
        }

        private Application() {
            super(null);
        }
    }

    public static final class StateListAnimator extends SearchableInfo {
        public static final StateListAnimator OLrzqt = new StateListAnimator();
        public static final java.lang.String copydefault = "Block";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Block";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Activity extends SearchableInfo {
        public static final Activity OLrzqt = new Activity();
        public static final java.lang.String copydefault = "NoRisk";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoRisk";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class ActionBar extends SearchableInfo {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.copydefault;
            }
            return actionBar.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((ActionBar) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SearchableInfo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final SearchableInfo copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode != -1956835248) {
                if (iHashCode != -860029176) {
                    if (iHashCode == 64279661 && str.equals("Block")) {
                        return StateListAnimator.OLrzqt;
                    }
                } else if (str.equals("AccountTakeover")) {
                    return Application.OLrzqt;
                }
            } else if (str.equals("NoRisk")) {
                return Activity.OLrzqt;
            }
            return new ActionBar(str);
        }
    }
}
