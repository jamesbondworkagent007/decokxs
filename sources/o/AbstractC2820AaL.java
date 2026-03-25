package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AaL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC2820AaL {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AaL.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC2820AaL(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2820AaL() {
    }

    /* JADX INFO: renamed from: o.AaL$VoiceInteractor */
    public static final class VoiceInteractor extends AbstractC2820AaL {
        public static final int $stable = 0;
        public final zCC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VoiceInteractor copy$default(VoiceInteractor voiceInteractor, zCC zcc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                zcc = voiceInteractor.copydefault;
            }
            return voiceInteractor.copydefault(zcc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final zCC OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VoiceInteractor copydefault(@NotNull zCC zcc) {
            Intrinsics.checkNotNullParameter(zcc, "");
            return new VoiceInteractor(zcc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VoiceInteractor) && Intrinsics.EZpvd(this.copydefault, ((VoiceInteractor) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WebView(url=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VoiceInteractor(@NotNull zCC zcc) {
            super(null);
            Intrinsics.checkNotNullParameter(zcc, "");
            this.copydefault = zcc;
        }
    }

    /* JADX INFO: renamed from: o.AaL$AssistContent */
    public static final class AssistContent extends AbstractC2820AaL {
        public static final int $stable = 0;
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = assistContent.AEQbTJ;
            }
            return assistContent.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new AssistContent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AssistContent) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((AssistContent) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UidCopy(uid=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssistContent(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    /* JADX INFO: renamed from: o.AaL$Activity */
    public static final class Activity extends AbstractC2820AaL {
        public static final int $stable = 8;
        public final C60209zyS KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, boolean z, C60209zyS c60209zyS, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                c60209zyS = activity.KWHzl;
            }
            return activity.OLrzqt(z, c60209zyS);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C60209zyS EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(boolean z, @NotNull C60209zyS c60209zyS) {
            Intrinsics.checkNotNullParameter(c60209zyS, "");
            return new Activity(z, c60209zyS);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GlobalTradingAccount(isKyc=" + this.OLrzqt + ", alternateAccountInformation=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(boolean z, @NotNull C60209zyS c60209zyS) {
            super(null);
            Intrinsics.checkNotNullParameter(c60209zyS, "");
            this.OLrzqt = z;
            this.KWHzl = c60209zyS;
        }
    }

    /* JADX INFO: renamed from: o.AaL$Application */
    public static final class Application extends AbstractC2820AaL {
        public static final int $stable = 8;
        public final boolean EZpvd;
        public final C60209zyS KWHzl;
        public final zZX copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, zZX zzx, C60209zyS c60209zyS, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.EZpvd;
            }
            if ((i & 2) != 0) {
                zzx = application.copydefault;
            }
            if ((i & 4) != 0) {
                c60209zyS = application.KWHzl;
            }
            return application.KWHzl(z, zzx, c60209zyS);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(boolean z, @NotNull zZX zzx, @NotNull C60209zyS c60209zyS) {
            Intrinsics.checkNotNullParameter(zzx, "");
            Intrinsics.checkNotNullParameter(c60209zyS, "");
            return new Application(z, zzx, c60209zyS);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C60209zyS OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final zZX copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.EZpvd == application.EZpvd && Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Boolean.hashCode(this.EZpvd) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GlobalTradingAccountWithConsent(isKyc=" + this.EZpvd + ", consentData=" + this.copydefault + ", alternateAccountInformation=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(boolean z, @NotNull zZX zzx, @NotNull C60209zyS c60209zyS) {
            super(null);
            Intrinsics.checkNotNullParameter(zzx, "");
            Intrinsics.checkNotNullParameter(c60209zyS, "");
            this.EZpvd = z;
            this.copydefault = zzx;
            this.KWHzl = c60209zyS;
        }
    }

    /* JADX INFO: renamed from: o.AaL$TaskDescription */
    public static final class TaskDescription extends AbstractC2820AaL {
        public static final int $stable = 0;
        public static final TaskDescription INSTANCE = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.AaL$StateListAnimator */
    public static final class StateListAnimator extends AbstractC2820AaL {
        public static final int $stable = 0;
        public static final StateListAnimator INSTANCE = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.AaL$LoaderManager */
    public static final class LoaderManager extends AbstractC2820AaL {
        public static final int $stable = 0;
        public static final LoaderManager INSTANCE = new LoaderManager();

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.AaL$ActionBar */
    public static final class ActionBar extends AbstractC2820AaL {
        public static final int $stable = 0;
        public static final ActionBar INSTANCE = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.AaL$Dialog */
    public static final class Dialog extends AbstractC2820AaL {
        public static final int $stable = 0;
        public static final Dialog INSTANCE = new Dialog();

        private Dialog() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.AaL$PictureInPictureParams */
    public static final class PictureInPictureParams extends AbstractC2820AaL {
        public static final int $stable = 0;
        public static final PictureInPictureParams INSTANCE = new PictureInPictureParams();

        private PictureInPictureParams() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.AaL$PendingIntent */
    public static final class PendingIntent extends AbstractC2820AaL {
        public static final int $stable = 0;
        public static final PendingIntent INSTANCE = new PendingIntent();

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.AaL$FragmentManager */
    public static final class FragmentManager extends AbstractC2820AaL {
        public static final int $stable = 0;
        public static final FragmentManager INSTANCE = new FragmentManager();

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.AaL$SharedElementCallback */
    public static final class SharedElementCallback extends AbstractC2820AaL {
        public static final int $stable = 0;
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SharedElementCallback copy$default(SharedElementCallback sharedElementCallback, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sharedElementCallback.EZpvd;
            }
            return sharedElementCallback.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedElementCallback OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SharedElementCallback(str);
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
            return (obj instanceof SharedElementCallback) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((SharedElementCallback) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UnLinkX(username=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SharedElementCallback(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    /* JADX INFO: renamed from: o.AaL$Fragment */
    public static final class Fragment extends AbstractC2820AaL {
        public static final int $stable = 0;
        public static final Fragment INSTANCE = new Fragment();

        private Fragment() {
            super(null);
        }
    }
}
