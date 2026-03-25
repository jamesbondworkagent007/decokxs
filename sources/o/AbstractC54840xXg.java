package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xXg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC54840xXg {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xXg.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC54840xXg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.xXg$FragmentManager */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class FragmentManager extends AbstractC54840xXg {
        public static final FragmentManager KWHzl = new FragmentManager();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FragmentManager)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 570138294;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GlobalAppNeedLogin";
        }

        private FragmentManager() {
            super(null);
        }
    }

    private AbstractC54840xXg() {
    }

    /* JADX INFO: renamed from: o.xXg$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar extends AbstractC54840xXg {
        public static final ActionBar KWHzl = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1742423230;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GlobalAppNeedKYC";
        }

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.xXg$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class StateListAnimator extends AbstractC54840xXg {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -992501849;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GlobalAppEasyConnectDisabled";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.xXg$Dialog */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Dialog extends AbstractC54840xXg {
        public static final Dialog copydefault = new Dialog();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -484559315;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GlobalAppNeedSwitchMainAccount";
        }

        private Dialog() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.xXg$LoaderManager */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class LoaderManager extends AbstractC54840xXg {
        public final InterfaceC9738bbJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, InterfaceC9738bbJ interfaceC9738bbJ, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC9738bbJ = loaderManager.copydefault;
            }
            return loaderManager.copydefault(interfaceC9738bbJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            return new LoaderManager(interfaceC9738bbJ);
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
            return "GlobalAppWalletAlreadyBound(wallet=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
            super(null);
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            this.copydefault = interfaceC9738bbJ;
        }
    }

    /* JADX INFO: renamed from: o.xXg$Fragment */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Fragment extends AbstractC54840xXg {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.KWHzl;
            }
            return fragment.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Fragment(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fragment) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Fragment) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GlobalAppReachedMaxAccountLimit(maxCapacity=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    /* JADX INFO: renamed from: o.xXg$AssistContent */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class AssistContent extends AbstractC54840xXg {
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = assistContent.copydefault;
            }
            return assistContent.copydefault(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent copydefault(boolean z) {
            return new AssistContent(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AssistContent) && this.copydefault == ((AssistContent) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GlobalAppWalletNotImported(otherWalletsAvailable=" + this.copydefault + ")";
        }

        public AssistContent(boolean z) {
            super(null);
            this.copydefault = z;
        }
    }

    /* JADX INFO: renamed from: o.xXg$PendingIntent */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class PendingIntent extends AbstractC54840xXg {
        public static final PendingIntent EZpvd = new PendingIntent();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingIntent)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1535877261;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GlobalAppWalletEligible";
        }

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.xXg$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Activity extends AbstractC54840xXg {
        public final xWT KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, xWT xwt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                xwt = activity.KWHzl;
            }
            return activity.EZpvd(xwt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull xWT xwt) {
            Intrinsics.checkNotNullParameter(xwt, "");
            return new Activity(xwt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GlobalAppBindSucceed(boundWalletInfo=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull xWT xwt) {
            super(null);
            Intrinsics.checkNotNullParameter(xwt, "");
            this.KWHzl = xwt;
        }
    }

    /* JADX INFO: renamed from: o.xXg$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Application extends AbstractC54840xXg {
        public static final Application AEQbTJ = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1847235788;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GlobalAppBindCancel";
        }

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.xXg$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class TaskDescription extends AbstractC54840xXg {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            return taskDescription.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(java.lang.String str) {
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.copydefault;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(message=" + this.copydefault + ")";
        }

        public TaskDescription(java.lang.String str) {
            super(null);
            this.copydefault = str;
        }
    }

    /* JADX INFO: renamed from: o.xXg$PictureInPictureParams */
    public static final class PictureInPictureParams extends AbstractC54840xXg {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PictureInPictureParams copy$default(PictureInPictureParams pictureInPictureParams, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pictureInPictureParams.copydefault;
            }
            return pictureInPictureParams.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PictureInPictureParams EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PictureInPictureParams(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PictureInPictureParams) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((PictureInPictureParams) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "IndependentAPPSuccess(uid=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PictureInPictureParams(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }
    }

    /* JADX INFO: renamed from: o.xXg$TaskStackBuilder */
    public static final class TaskStackBuilder extends AbstractC54840xXg {
        public static final TaskStackBuilder AEQbTJ = new TaskStackBuilder();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskStackBuilder)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 835250848;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "IndependentAPPRetry";
        }

        private TaskStackBuilder() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.xXg$VoiceInteractor */
    public static final class VoiceInteractor extends AbstractC54840xXg {
        public static final VoiceInteractor KWHzl = new VoiceInteractor();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VoiceInteractor)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -310352510;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "IndependentAPPCancel";
        }

        private VoiceInteractor() {
            super(null);
        }
    }
}
