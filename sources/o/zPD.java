package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.OkxPasskeyException;

/* JADX INFO: loaded from: classes17.dex */
public abstract class zPD {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zPD.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ zPD(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private zPD() {
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class ActionBar extends zPD {
        public static final int $stable = 0;
        public static final ActionBar INSTANCE = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class TaskDescription extends zPD {
        public static final int $stable = 0;
        public static final TaskDescription INSTANCE = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class PictureInPictureParams extends zPD {
        public static final int $stable = 0;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PictureInPictureParams copy$default(PictureInPictureParams pictureInPictureParams, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = pictureInPictureParams.copydefault;
            }
            return pictureInPictureParams.copydefault(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PictureInPictureParams copydefault(boolean z) {
            return new PictureInPictureParams(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PictureInPictureParams) && this.copydefault == ((PictureInPictureParams) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(didSyncPasskey=" + this.copydefault + ")";
        }

        public PictureInPictureParams(boolean z) {
            super(null);
            this.copydefault = z;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class TaskStackBuilder extends zPD {
        public static final int $stable = 0;
        public static final TaskStackBuilder INSTANCE = new TaskStackBuilder();

        private TaskStackBuilder() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class LoaderManager extends zPD {
        public static final int $stable = 0;
        public static final LoaderManager INSTANCE = new LoaderManager();

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Dialog extends zPD {
        public static final int $stable = 0;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.copydefault;
            }
            return dialog.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((Dialog) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NetworkException(message=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class PendingIntent extends zPD {
        public static final int $stable = 0;
        public final OkxPasskeyException KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, OkxPasskeyException okxPasskeyException, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                okxPasskeyException = pendingIntent.KWHzl;
            }
            return pendingIntent.OLrzqt(okxPasskeyException);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OkxPasskeyException EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent OLrzqt(@NotNull OkxPasskeyException okxPasskeyException) {
            Intrinsics.checkNotNullParameter(okxPasskeyException, "");
            return new PendingIntent(okxPasskeyException);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd(this.KWHzl, ((PendingIntent) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PasskeyError(error=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull OkxPasskeyException okxPasskeyException) {
            super(null);
            Intrinsics.checkNotNullParameter(okxPasskeyException, "");
            this.KWHzl = okxPasskeyException;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class StateListAnimator extends zPD {
        public static final int $stable = 0;
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((StateListAnimator) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BleConnectionError(message=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Application extends zPD {
        public static final int $stable = 0;
        public static final Application INSTANCE = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class FragmentManager extends zPD {
        public static final int $stable = 0;
        public static final FragmentManager INSTANCE = new FragmentManager();

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Activity extends zPD {
        public static final int $stable = 0;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = activity.KWHzl;
            }
            return activity.EZpvd(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(boolean z) {
            return new Activity(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && this.KWHzl == ((Activity) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CorrectDeviceNotAvailable(onMultipleDevices=" + this.KWHzl + ")";
        }

        public Activity(boolean z) {
            super(null);
            this.KWHzl = z;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Fragment extends zPD {
        public static final int $stable = 0;
        public static final Fragment INSTANCE = new Fragment();

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class AssistContent extends zPD {
        public static final int $stable = 0;
        public static final AssistContent INSTANCE = new AssistContent();

        private AssistContent() {
            super(null);
        }
    }
}
