package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC41928r {
    public static final Application EZpvd = new Application(null);
    public static final java.util.List<AbstractC41928r> copydefault = yDY.gEmmrt(ActionBar.KWHzl, Activity.KWHzl, StateListAnimator.KWHzl, PendingIntent.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.r.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC41928r(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC41928r() {
    }

    /* JADX INFO: renamed from: o.r$ActionBar */
    public static final class ActionBar extends AbstractC41928r {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String OLrzqt = "Female";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Female";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.r$Activity */
    public static final class Activity extends AbstractC41928r {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String AEQbTJ = "Male";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Male";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.r$StateListAnimator */
    public static final class StateListAnimator extends AbstractC41928r {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final java.lang.String OLrzqt = "Nonbinary";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Nonbinary";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.r$PendingIntent */
    public static final class PendingIntent extends AbstractC41928r {
        public static final PendingIntent OLrzqt = new PendingIntent();
        public static final java.lang.String KWHzl = "Unlisted";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Unlisted";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.r$TaskDescription */
    public static final class TaskDescription extends AbstractC41928r {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.KWHzl;
            }
            return taskDescription.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((TaskDescription) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + EZpvd() + ')';
        }
    }

    /* JADX INFO: renamed from: o.r$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.r.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [41=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC41928r AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1616918290:
                    if (str.equals("Nonbinary")) {
                        return StateListAnimator.KWHzl;
                    }
                    break;
                case -151361098:
                    if (str.equals("Unlisted")) {
                        return PendingIntent.OLrzqt;
                    }
                    break;
                case 2390573:
                    if (str.equals("Male")) {
                        return Activity.KWHzl;
                    }
                    break;
                case 2100660076:
                    if (str.equals("Female")) {
                        return ActionBar.KWHzl;
                    }
                    break;
            }
            return new TaskDescription(str);
        }
    }
}
