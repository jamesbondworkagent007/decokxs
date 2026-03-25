package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC7503al {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public static final java.util.List<AbstractC7503al> copydefault = yDY.gEmmrt(ActionBar.KWHzl, Activity.OLrzqt, Application.EZpvd, StateListAnimator.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.al.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC7503al(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC7503al() {
    }

    /* JADX INFO: renamed from: o.al$ActionBar */
    public static final class ActionBar extends AbstractC7503al {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String OLrzqt = "ROTATE_0";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Rotate0";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.al$Activity */
    public static final class Activity extends AbstractC7503al {
        public static final Activity OLrzqt = new Activity();
        public static final java.lang.String EZpvd = "ROTATE_180";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Rotate180";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.al$Application */
    public static final class Application extends AbstractC7503al {
        public static final Application EZpvd = new Application();
        public static final java.lang.String KWHzl = "ROTATE_270";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Rotate270";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.al$StateListAnimator */
    public static final class StateListAnimator extends AbstractC7503al {
        public static final StateListAnimator EZpvd = new StateListAnimator();
        public static final java.lang.String KWHzl = "ROTATE_90";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Rotate90";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.al$PendingIntent */
    public static final class PendingIntent extends AbstractC7503al {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.OLrzqt;
            }
            return pendingIntent.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PendingIntent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((PendingIntent) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    /* JADX INFO: renamed from: o.al$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.al.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [38=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC7503al KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case 407607813:
                    if (str.equals("ROTATE_180")) {
                        return Activity.OLrzqt;
                    }
                    break;
                case 407608743:
                    if (str.equals("ROTATE_270")) {
                        return Application.EZpvd;
                    }
                    break;
                case 742322764:
                    if (str.equals("ROTATE_0")) {
                        return ActionBar.KWHzl;
                    }
                    break;
                case 1537169531:
                    if (str.equals("ROTATE_90")) {
                        return StateListAnimator.EZpvd;
                    }
                    break;
            }
            return new PendingIntent(str);
        }
    }
}
