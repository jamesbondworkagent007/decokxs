package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class UntaggedSocketViolation {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public static final java.util.List<UntaggedSocketViolation> AEQbTJ = yDY.gEmmrt(TaskDescription.copydefault, StateListAnimator.copydefault, Application.EZpvd, Activity.KWHzl);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UntaggedSocketViolation.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UntaggedSocketViolation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String OLrzqt();

    private UntaggedSocketViolation() {
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription extends UntaggedSocketViolation {
        public static final TaskDescription copydefault = new TaskDescription();
        public static final java.lang.String EZpvd = "MIXED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.UntaggedSocketViolation
        public java.lang.String OLrzqt() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Mixed";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator extends UntaggedSocketViolation {
        public static final StateListAnimator copydefault = new StateListAnimator();
        public static final java.lang.String KWHzl = "NEGATIVE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.UntaggedSocketViolation
        public java.lang.String OLrzqt() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Negative";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application extends UntaggedSocketViolation {
        public static final Application EZpvd = new Application();
        public static final java.lang.String copydefault = "NEUTRAL";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.UntaggedSocketViolation
        public java.lang.String OLrzqt() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Neutral";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity extends UntaggedSocketViolation {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String EZpvd = "POSITIVE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.UntaggedSocketViolation
        public java.lang.String OLrzqt() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Positive";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Dialog extends UntaggedSocketViolation {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.EZpvd;
            }
            return dialog.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.UntaggedSocketViolation
        public java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((Dialog) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + OLrzqt() + ')';
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UntaggedSocketViolation.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [38=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final UntaggedSocketViolation AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1732662873:
                    if (str.equals("NEUTRAL")) {
                        return Application.EZpvd;
                    }
                    break;
                case 73372635:
                    if (str.equals("MIXED")) {
                        return TaskDescription.copydefault;
                    }
                    break;
                case 1530431993:
                    if (str.equals("POSITIVE")) {
                        return Activity.KWHzl;
                    }
                    break;
                case 1703738421:
                    if (str.equals("NEGATIVE")) {
                        return StateListAnimator.copydefault;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
