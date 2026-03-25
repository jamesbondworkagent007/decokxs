package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5734aC {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public static final java.util.List<AbstractC5734aC> copydefault = yDY.gEmmrt(ActionBar.KWHzl, Activity.AEQbTJ, Application.AEQbTJ, StateListAnimator.OLrzqt, LoaderManager.OLrzqt, Fragment.KWHzl, FragmentManager.KWHzl, PendingIntent.KWHzl, VoiceInteractor.AEQbTJ, SharedElementCallback.AEQbTJ, TaskStackBuilder.KWHzl, PictureInPictureParams.AEQbTJ, AssistContent.KWHzl, ComponentName.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aC.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC5734aC(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String AEQbTJ();

    private AbstractC5734aC() {
    }

    /* JADX INFO: renamed from: o.aC$ActionBar */
    public static final class ActionBar extends AbstractC5734aC {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String OLrzqt = "COPYING_COMPLETED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CopyingCompleted";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$Activity */
    public static final class Activity extends AbstractC5734aC {
        public static final Activity AEQbTJ = new Activity();
        public static final java.lang.String OLrzqt = "COPYING_FAILED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CopyingFailed";
        }

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$Application */
    public static final class Application extends AbstractC5734aC {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String OLrzqt = "COPYING_IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CopyingInProgress";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$StateListAnimator */
    public static final class StateListAnimator extends AbstractC5734aC {
        public static final StateListAnimator OLrzqt = new StateListAnimator();
        public static final java.lang.String AEQbTJ = "DELETING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Deleting";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$LoaderManager */
    public static final class LoaderManager extends AbstractC5734aC {
        public static final LoaderManager OLrzqt = new LoaderManager();
        public static final java.lang.String KWHzl = "DEPRECATED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Deprecated";
        }

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$Fragment */
    public static final class Fragment extends AbstractC5734aC {
        public static final Fragment KWHzl = new Fragment();
        public static final java.lang.String AEQbTJ = "EXPIRED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Expired";
        }

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$FragmentManager */
    public static final class FragmentManager extends AbstractC5734aC {
        public static final FragmentManager KWHzl = new FragmentManager();
        public static final java.lang.String AEQbTJ = CardSyncResponse.FAILED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed";
        }

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$PendingIntent */
    public static final class PendingIntent extends AbstractC5734aC {
        public static final PendingIntent KWHzl = new PendingIntent();
        public static final java.lang.String OLrzqt = DebugCoroutineInfoImplKt.RUNNING;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Running";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$VoiceInteractor */
    public static final class VoiceInteractor extends AbstractC5734aC {
        public static final VoiceInteractor AEQbTJ = new VoiceInteractor();
        public static final java.lang.String KWHzl = "STARTING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Starting";
        }

        private VoiceInteractor() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$SharedElementCallback */
    public static final class SharedElementCallback extends AbstractC5734aC {
        public static final SharedElementCallback AEQbTJ = new SharedElementCallback();
        public static final java.lang.String OLrzqt = "STOPPED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Stopped";
        }

        private SharedElementCallback() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$TaskStackBuilder */
    public static final class TaskStackBuilder extends AbstractC5734aC {
        public static final TaskStackBuilder KWHzl = new TaskStackBuilder();
        public static final java.lang.String AEQbTJ = "STOPPING";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Stopping";
        }

        private TaskStackBuilder() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$PictureInPictureParams */
    public static final class PictureInPictureParams extends AbstractC5734aC {
        public static final PictureInPictureParams AEQbTJ = new PictureInPictureParams();
        public static final java.lang.String KWHzl = "TRAINING_COMPLETED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TrainingCompleted";
        }

        private PictureInPictureParams() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$AssistContent */
    public static final class AssistContent extends AbstractC5734aC {
        public static final AssistContent KWHzl = new AssistContent();
        public static final java.lang.String AEQbTJ = "TRAINING_FAILED";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TrainingFailed";
        }

        private AssistContent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$ComponentName */
    public static final class ComponentName extends AbstractC5734aC {
        public static final ComponentName OLrzqt = new ComponentName();
        public static final java.lang.String AEQbTJ = "TRAINING_IN_PROGRESS";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TrainingInProgress";
        }

        private ComponentName() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aC$Dialog */
    public static final class Dialog extends AbstractC5734aC {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.KWHzl;
            }
            return dialog.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5734aC
        public java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Dialog) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    /* JADX INFO: renamed from: o.aC$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [88=14] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC5734aC copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case -2026200673:
                    if (str.equals(DebugCoroutineInfoImplKt.RUNNING)) {
                        return PendingIntent.KWHzl;
                    }
                    break;
                case -1796691852:
                    if (str.equals("STOPPING")) {
                        return TaskStackBuilder.KWHzl;
                    }
                    break;
                case -1537694577:
                    if (str.equals("COPYING_FAILED")) {
                        return Activity.AEQbTJ;
                    }
                    break;
                case -1374015226:
                    if (str.equals("TRAINING_COMPLETED")) {
                        return PictureInPictureParams.AEQbTJ;
                    }
                    break;
                case -1250114750:
                    if (str.equals("TRAINING_FAILED")) {
                        return AssistContent.KWHzl;
                    }
                    break;
                case -1166336595:
                    if (str.equals("STOPPED")) {
                        return SharedElementCallback.AEQbTJ;
                    }
                    break;
                case -1147252301:
                    if (str.equals("DEPRECATED")) {
                        return LoaderManager.OLrzqt;
                    }
                    break;
                case -738642910:
                    if (str.equals("TRAINING_IN_PROGRESS")) {
                        return ComponentName.OLrzqt;
                    }
                    break;
                case -591252731:
                    if (str.equals("EXPIRED")) {
                        return Fragment.KWHzl;
                    }
                    break;
                case -204885863:
                    if (str.equals("COPYING_COMPLETED")) {
                        return ActionBar.KWHzl;
                    }
                    break;
                case 1602343848:
                    if (str.equals("DELETING")) {
                        return StateListAnimator.OLrzqt;
                    }
                    break;
                case 1808210677:
                    if (str.equals("COPYING_IN_PROGRESS")) {
                        return Application.AEQbTJ;
                    }
                    break;
                case 2066319421:
                    if (str.equals(CardSyncResponse.FAILED)) {
                        return FragmentManager.KWHzl;
                    }
                    break;
                case 2099433536:
                    if (str.equals("STARTING")) {
                        return VoiceInteractor.AEQbTJ;
                    }
                    break;
            }
            return new Dialog(str);
        }
    }
}
