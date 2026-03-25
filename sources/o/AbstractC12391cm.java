package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC12391cm {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public static final java.util.List<AbstractC12391cm> OLrzqt = yDY.gEmmrt(Activity.copydefault, Application.copydefault, StateListAnimator.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cm.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC12391cm(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12391cm() {
    }

    /* JADX INFO: renamed from: o.cm$Activity */
    public static final class Activity extends AbstractC12391cm {
        public static final Activity copydefault = new Activity();
        public static final java.lang.String KWHzl = "ASSOCIATED_TO_A_DIFFERENT_USER";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AssociatedToADifferentUser";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cm$Application */
    public static final class Application extends AbstractC12391cm {
        public static final Application copydefault = new Application();
        public static final java.lang.String EZpvd = "FACE_NOT_FOUND";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FaceNotFound";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cm$StateListAnimator */
    public static final class StateListAnimator extends AbstractC12391cm {
        public static final StateListAnimator EZpvd = new StateListAnimator();
        public static final java.lang.String KWHzl = "LOW_MATCH_CONFIDENCE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LowMatchConfidence";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cm$TaskDescription */
    public static final class TaskDescription extends AbstractC12391cm {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            return taskDescription.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    /* JADX INFO: renamed from: o.cm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final AbstractC12391cm AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            int iHashCode = str.hashCode();
            if (iHashCode != -468730097) {
                if (iHashCode != -190057350) {
                    if (iHashCode == 1531664244 && str.equals("FACE_NOT_FOUND")) {
                        return Application.copydefault;
                    }
                } else if (str.equals("ASSOCIATED_TO_A_DIFFERENT_USER")) {
                    return Activity.copydefault;
                }
            } else if (str.equals("LOW_MATCH_CONFIDENCE")) {
                return StateListAnimator.EZpvd;
            }
            return new TaskDescription(str);
        }
    }
}
