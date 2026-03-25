package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC35715oB {
    public static final Application KWHzl = new Application(null);
    public static final java.util.List<AbstractC35715oB> EZpvd = yDY.gEmmrt(StateListAnimator.OLrzqt, ActionBar.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oB.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC35715oB(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35715oB() {
    }

    /* JADX INFO: renamed from: o.oB$StateListAnimator */
    public static final class StateListAnimator extends AbstractC35715oB {
        public static final StateListAnimator OLrzqt = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "NOT_SELECTED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NotSelected";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.oB$ActionBar */
    public static final class ActionBar extends AbstractC35715oB {
        public static final ActionBar copydefault = new ActionBar();
        public static final java.lang.String AEQbTJ = "SELECTED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Selected";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.oB$TaskDescription */
    public static final class TaskDescription extends AbstractC35715oB {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.OLrzqt;
            }
            return taskDescription.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.OLrzqt;
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
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    /* JADX INFO: renamed from: o.oB$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oB.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AbstractC35715oB EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "NOT_SELECTED") ? StateListAnimator.OLrzqt : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SELECTED") ? ActionBar.copydefault : new TaskDescription(str);
        }
    }
}
