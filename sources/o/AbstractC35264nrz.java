package o;

import com.okinc.im.call.model.CallSessionV2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35264nrz {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrz.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC35264nrz(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35264nrz() {
    }

    /* JADX INFO: renamed from: o.nrz$LoaderManager */
    public static final class LoaderManager extends AbstractC35264nrz {
        public final CallSessionV2 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, CallSessionV2 callSessionV2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                callSessionV2 = loaderManager.copydefault;
            }
            return loaderManager.AEQbTJ(callSessionV2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CallSessionV2 AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager AEQbTJ(@NotNull CallSessionV2 callSessionV2) {
            Intrinsics.checkNotNullParameter(callSessionV2, "");
            return new LoaderManager(callSessionV2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && Intrinsics.EZpvd(this.copydefault, ((LoaderManager) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InitiateCall(session=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull CallSessionV2 callSessionV2) {
            super(null);
            Intrinsics.checkNotNullParameter(callSessionV2, "");
            this.copydefault = callSessionV2;
        }
    }

    /* JADX INFO: renamed from: o.nrz$Application */
    public static final class Application extends AbstractC35264nrz {
        public final CallSessionV2 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, CallSessionV2 callSessionV2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                callSessionV2 = application.AEQbTJ;
            }
            return application.copydefault(callSessionV2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CallSessionV2 copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull CallSessionV2 callSessionV2) {
            Intrinsics.checkNotNullParameter(callSessionV2, "");
            return new Application(callSessionV2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "IncomingCall(session=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull CallSessionV2 callSessionV2) {
            super(null);
            Intrinsics.checkNotNullParameter(callSessionV2, "");
            this.AEQbTJ = callSessionV2;
        }
    }

    /* JADX INFO: renamed from: o.nrz$Dialog */
    public static final class Dialog extends AbstractC35264nrz {
        public static final Dialog EZpvd = new Dialog();

        private Dialog() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$VoiceInteractor */
    public static final class VoiceInteractor extends AbstractC35264nrz {
        public static final VoiceInteractor KWHzl = new VoiceInteractor();

        private VoiceInteractor() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$Fragment */
    public static final class Fragment extends AbstractC35264nrz {
        public static final Fragment AEQbTJ = new Fragment();

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$AssistContent */
    public static final class AssistContent extends AbstractC35264nrz {
        public static final AssistContent AEQbTJ = new AssistContent();

        private AssistContent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$PendingIntent */
    public static final class PendingIntent extends AbstractC35264nrz {
        public static final PendingIntent OLrzqt = new PendingIntent();

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$SharedElementCallback */
    public static final class SharedElementCallback extends AbstractC35264nrz {
        public static final SharedElementCallback OLrzqt = new SharedElementCallback();

        private SharedElementCallback() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$FragmentManager */
    public static final class FragmentManager extends AbstractC35264nrz {
        public static final FragmentManager EZpvd = new FragmentManager();

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$TaskStackBuilder */
    public static final class TaskStackBuilder extends AbstractC35264nrz {
        public static final TaskStackBuilder KWHzl = new TaskStackBuilder();

        private TaskStackBuilder() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$TaskDescription */
    public static final class TaskDescription extends AbstractC35264nrz {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$ComponentName */
    public static final class ComponentName extends AbstractC35264nrz {
        public static final ComponentName AEQbTJ = new ComponentName();

        private ComponentName() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$BroadcastReceiver */
    public static final class BroadcastReceiver extends AbstractC35264nrz {
        public static final BroadcastReceiver KWHzl = new BroadcastReceiver();

        private BroadcastReceiver() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 extends AbstractC35264nrz {
        public static final ComponentCallbacks2 copydefault = new ComponentCallbacks2();

        private ComponentCallbacks2() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$PictureInPictureParams */
    public static final class PictureInPictureParams extends AbstractC35264nrz {
        public static final PictureInPictureParams OLrzqt = new PictureInPictureParams();

        private PictureInPictureParams() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$Activity */
    public static final class Activity extends AbstractC35264nrz {
        public final java.lang.Throwable AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = activity.AEQbTJ;
            }
            return activity.OLrzqt(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Activity(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.AEQbTJ, ((Activity) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(throwable=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.AEQbTJ = th;
        }
    }

    /* JADX INFO: renamed from: o.nrz$StateListAnimator */
    public static final class StateListAnimator extends AbstractC35264nrz {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$ActionBar */
    public static final class ActionBar extends AbstractC35264nrz {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.nrz$ClipData */
    public static final class ClipData extends AbstractC35264nrz {
        public static final ClipData KWHzl = new ClipData();

        private ClipData() {
            super(null);
        }
    }
}
