package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class StyleRes {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public static final java.util.List<StyleRes> EZpvd = yDY.gEmmrt(Activity.KWHzl, StateListAnimator.KWHzl, TaskDescription.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.StyleRes.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ StyleRes(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StyleRes() {
    }

    public static final class Activity extends StyleRes {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String AEQbTJ = "Fail";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Fail";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class StateListAnimator extends StyleRes {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final java.lang.String copydefault = "InProgress";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InProgress";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class TaskDescription extends StyleRes {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final java.lang.String KWHzl = "Pass";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Pass";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class Application extends StyleRes {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.AEQbTJ;
            }
            return application.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((Application) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.StyleRes.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final StyleRes copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode != 2181950) {
                if (iHashCode != 2480177) {
                    if (iHashCode == 646453906 && str.equals("InProgress")) {
                        return StateListAnimator.KWHzl;
                    }
                } else if (str.equals("Pass")) {
                    return TaskDescription.AEQbTJ;
                }
            } else if (str.equals("Fail")) {
                return Activity.KWHzl;
            }
            return new Application(str);
        }
    }
}
