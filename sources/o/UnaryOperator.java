package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public abstract class UnaryOperator {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public static final java.util.List<UnaryOperator> AEQbTJ = yDY.gEmmrt(Application.OLrzqt, Activity.EZpvd, TaskDescription.EZpvd, ActionBar.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UnaryOperator.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UnaryOperator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String KWHzl();

    private UnaryOperator() {
    }

    public static final class Application extends UnaryOperator {
        public static final Application OLrzqt = new Application();
        public static final java.lang.String KWHzl = "BLOCK";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.UnaryOperator
        public java.lang.String KWHzl() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Block";
        }

        private Application() {
            super(null);
        }
    }

    public static final class Activity extends UnaryOperator {
        public static final Activity EZpvd = new Activity();
        public static final java.lang.String OLrzqt = "MFA_IF_CONFIGURED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.UnaryOperator
        public java.lang.String KWHzl() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MfaIfConfigured";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class TaskDescription extends UnaryOperator {
        public static final TaskDescription EZpvd = new TaskDescription();
        public static final java.lang.String OLrzqt = "MFA_REQUIRED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.UnaryOperator
        public java.lang.String KWHzl() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MfaRequired";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class ActionBar extends UnaryOperator {
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String KWHzl = "NO_ACTION";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.UnaryOperator
        public java.lang.String KWHzl() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoAction";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Fragment extends UnaryOperator {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.EZpvd;
            }
            return fragment.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Fragment(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.UnaryOperator
        public java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fragment) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((Fragment) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UnaryOperator.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [38=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final UnaryOperator OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case 63294573:
                    if (str.equals("BLOCK")) {
                        return Application.OLrzqt;
                    }
                    break;
                case 708420662:
                    if (str.equals("MFA_REQUIRED")) {
                        return TaskDescription.EZpvd;
                    }
                    break;
                case 1079348329:
                    if (str.equals("MFA_IF_CONFIGURED")) {
                        return Activity.EZpvd;
                    }
                    break;
                case 1334385268:
                    if (str.equals("NO_ACTION")) {
                        return ActionBar.OLrzqt;
                    }
                    break;
            }
            return new Fragment(str);
        }
    }
}
