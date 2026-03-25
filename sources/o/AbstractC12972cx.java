package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC12972cx {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public static final java.util.List<AbstractC12972cx> OLrzqt = yDY.gEmmrt(ActionBar.EZpvd, Activity.KWHzl, StateListAnimator.KWHzl, PendingIntent.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cx.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC12972cx(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12972cx() {
    }

    /* JADX INFO: renamed from: o.cx$ActionBar */
    public static final class ActionBar extends AbstractC12972cx {
        public static final ActionBar EZpvd = new ActionBar();
        public static final java.lang.String copydefault = "ACTIVE";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Active";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cx$Activity */
    public static final class Activity extends AbstractC12972cx {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String copydefault = DebugCoroutineInfoImplKt.CREATED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Created";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cx$StateListAnimator */
    public static final class StateListAnimator extends AbstractC12972cx {
        public static final StateListAnimator KWHzl = new StateListAnimator();
        public static final java.lang.String copydefault = "CREATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Creating";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cx$PendingIntent */
    public static final class PendingIntent extends AbstractC12972cx {
        public static final PendingIntent EZpvd = new PendingIntent();
        public static final java.lang.String copydefault = "UPDATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Updating";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.cx$Application */
    public static final class Application extends AbstractC12972cx {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            return application.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Application) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + KWHzl() + ')';
        }
    }

    /* JADX INFO: renamed from: o.cx$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cx.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [38=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC12972cx EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1691918663:
                    if (str.equals("CREATING")) {
                        return StateListAnimator.KWHzl;
                    }
                    break;
                case 1746537160:
                    if (str.equals(DebugCoroutineInfoImplKt.CREATED)) {
                        return Activity.KWHzl;
                    }
                    break;
                case 1925346054:
                    if (str.equals("ACTIVE")) {
                        return ActionBar.EZpvd;
                    }
                    break;
                case 2105227078:
                    if (str.equals("UPDATING")) {
                        return PendingIntent.EZpvd;
                    }
                    break;
            }
            return new Application(str);
        }
    }
}
