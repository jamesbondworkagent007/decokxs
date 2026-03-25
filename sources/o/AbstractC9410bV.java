package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC9410bV {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public static final java.util.List<AbstractC9410bV> OLrzqt = yDY.gEmmrt(TaskDescription.AEQbTJ, ActionBar.copydefault, Activity.KWHzl, FragmentManager.KWHzl, PendingIntent.copydefault, LoaderManager.copydefault);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bV.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC9410bV(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC9410bV() {
    }

    /* JADX INFO: renamed from: o.bV$TaskDescription */
    public static final class TaskDescription extends AbstractC9410bV {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final java.lang.String copydefault = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bV$ActionBar */
    public static final class ActionBar extends AbstractC9410bV {
        public static final ActionBar copydefault = new ActionBar();
        public static final java.lang.String AEQbTJ = DebugCoroutineInfoImplKt.RUNNING;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Running";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bV$Activity */
    public static final class Activity extends AbstractC9410bV {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String AEQbTJ = "STARTING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Starting";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bV$FragmentManager */
    public static final class FragmentManager extends AbstractC9410bV {
        public static final FragmentManager KWHzl = new FragmentManager();
        public static final java.lang.String AEQbTJ = "STOPPED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Stopped";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bV$PendingIntent */
    public static final class PendingIntent extends AbstractC9410bV {
        public static final PendingIntent copydefault = new PendingIntent();
        public static final java.lang.String AEQbTJ = "STOPPING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Stopping";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bV$LoaderManager */
    public static final class LoaderManager extends AbstractC9410bV {
        public static final LoaderManager copydefault = new LoaderManager();
        public static final java.lang.String KWHzl = "UPDATING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Updating";
        }

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.bV$Application */
    public static final class Application extends AbstractC9410bV {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            return application.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.KWHzl;
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
            return "SdkUnknown(" + copydefault() + ')';
        }
    }

    /* JADX INFO: renamed from: o.bV$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [48=6] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC9410bV AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -2026200673:
                    if (str.equals(DebugCoroutineInfoImplKt.RUNNING)) {
                        return ActionBar.copydefault;
                    }
                    break;
                case -1796691852:
                    if (str.equals("STOPPING")) {
                        return PendingIntent.copydefault;
                    }
                    break;
                case -1166336595:
                    if (str.equals("STOPPED")) {
                        return FragmentManager.KWHzl;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return TaskDescription.AEQbTJ;
                    }
                    break;
                case 2099433536:
                    if (str.equals("STARTING")) {
                        return Activity.KWHzl;
                    }
                    break;
                case 2105227078:
                    if (str.equals("UPDATING")) {
                        return LoaderManager.copydefault;
                    }
                    break;
            }
            return new Application(str);
        }
    }
}
