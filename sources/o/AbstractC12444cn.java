package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC12444cn {
    public static final Application AEQbTJ = new Application(null);
    public static final java.util.List<AbstractC12444cn> EZpvd = yDY.gEmmrt(ActionBar.OLrzqt, TaskDescription.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cn.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC12444cn(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12444cn() {
    }

    /* JADX INFO: renamed from: o.cn$ActionBar */
    public static final class ActionBar extends AbstractC12444cn {
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String copydefault = "ASSOCIATED_TO_AN_EXISTING_USER";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AssociatedToAnExistingUser";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cn$TaskDescription */
    public static final class TaskDescription extends AbstractC12444cn {
        public static final TaskDescription KWHzl = new TaskDescription();
        public static final java.lang.String OLrzqt = "FACE_NOT_FOUND";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FaceNotFound";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cn$StateListAnimator */
    public static final class StateListAnimator extends AbstractC12444cn {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            return stateListAnimator.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((StateListAnimator) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    /* JADX INFO: renamed from: o.cn$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cn.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AbstractC12444cn OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ASSOCIATED_TO_AN_EXISTING_USER") ? ActionBar.OLrzqt : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FACE_NOT_FOUND") ? TaskDescription.KWHzl : new StateListAnimator(str);
        }
    }
}
