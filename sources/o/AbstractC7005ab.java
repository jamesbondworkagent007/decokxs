package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC7005ab {
    public static final Activity KWHzl = new Activity(null);
    public static final java.util.List<AbstractC7005ab> EZpvd = yDY.gEmmrt(TaskDescription.AEQbTJ, Application.AEQbTJ, StateListAnimator.OLrzqt, ActionBar.copydefault, PendingIntent.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ab.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC7005ab(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC7005ab() {
    }

    /* JADX INFO: renamed from: o.ab$TaskDescription */
    public static final class TaskDescription extends AbstractC7005ab {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final java.lang.String copydefault = DebugCoroutineInfoImplKt.CREATED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Created";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ab$Application */
    public static final class Application extends AbstractC7005ab {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String OLrzqt = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ab$StateListAnimator */
    public static final class StateListAnimator extends AbstractC7005ab {
        public static final StateListAnimator OLrzqt = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InProgress";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ab$ActionBar */
    public static final class ActionBar extends AbstractC7005ab {
        public static final ActionBar copydefault = new ActionBar();
        public static final java.lang.String AEQbTJ = "QUEUED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Queued";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ab$PendingIntent */
    public static final class PendingIntent extends AbstractC7005ab {
        public static final PendingIntent AEQbTJ = new PendingIntent();
        public static final java.lang.String copydefault = CardSyncResponse.SUCCEEDED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Succeeded";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.ab$Dialog */
    public static final class Dialog extends AbstractC7005ab {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.OLrzqt;
            }
            return dialog.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((Dialog) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    /* JADX INFO: renamed from: o.ab$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ab.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC7005ab EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -1895367309:
                    if (str.equals("QUEUED")) {
                        return ActionBar.copydefault;
                    }
                    break;
                case -604548089:
                    if (str.equals("IN_PROGRESS")) {
                        return StateListAnimator.OLrzqt;
                    }
                    break;
                case -562638271:
                    if (str.equals(CardSyncResponse.SUCCEEDED)) {
                        return PendingIntent.AEQbTJ;
                    }
                    break;
                case 1746537160:
                    if (str.equals(DebugCoroutineInfoImplKt.CREATED)) {
                        return TaskDescription.AEQbTJ;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return Application.AEQbTJ;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
