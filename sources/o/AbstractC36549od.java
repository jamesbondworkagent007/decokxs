package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC36549od {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public static final java.util.List<AbstractC36549od> AEQbTJ = yDY.gEmmrt(Application.KWHzl, StateListAnimator.EZpvd, Activity.OLrzqt, Dialog.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.od.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC36549od(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36549od() {
    }

    /* JADX INFO: renamed from: o.od$Application */
    public static final class Application extends AbstractC36549od {
        public static final Application KWHzl = new Application();
        public static final java.lang.String OLrzqt = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.od$StateListAnimator */
    public static final class StateListAnimator extends AbstractC36549od {
        public static final StateListAnimator EZpvd = new StateListAnimator();
        public static final java.lang.String KWHzl = "IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InProgress";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.od$Activity */
    public static final class Activity extends AbstractC36549od {
        public static final Activity OLrzqt = new Activity();
        public static final java.lang.String EZpvd = "PARTIAL_SUCCESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PartialSuccess";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.od$Dialog */
    public static final class Dialog extends AbstractC36549od {
        public static final Dialog EZpvd = new Dialog();
        public static final java.lang.String OLrzqt = CardSyncResponse.SUCCEEDED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Succeeded";
        }

        private Dialog() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.od$ActionBar */
    public static final class ActionBar extends AbstractC36549od {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.OLrzqt;
            }
            return actionBar.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((ActionBar) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + OLrzqt() + ')';
        }
    }

    /* JADX INFO: renamed from: o.od$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.od.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [38=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC36549od copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -604548089:
                    if (str.equals("IN_PROGRESS")) {
                        return StateListAnimator.EZpvd;
                    }
                    break;
                case -562638271:
                    if (str.equals(CardSyncResponse.SUCCEEDED)) {
                        return Dialog.EZpvd;
                    }
                    break;
                case 576837381:
                    if (str.equals("PARTIAL_SUCCESS")) {
                        return Activity.OLrzqt;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return Application.KWHzl;
                    }
                    break;
            }
            return new ActionBar(str);
        }
    }
}
