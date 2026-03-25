package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Afa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC3100Afa {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Afa.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC3100Afa(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3100Afa() {
    }

    /* JADX INFO: renamed from: o.Afa$StateListAnimator */
    public static final class StateListAnimator extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final StateListAnimator INSTANCE = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$BroadcastReceiver */
    public static final class BroadcastReceiver extends AbstractC3100Afa {
        public static final int $stable = 0;
        public final int EZpvd;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BroadcastReceiver copy$default(BroadcastReceiver broadcastReceiver, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = broadcastReceiver.copydefault;
            }
            if ((i3 & 2) != 0) {
                i2 = broadcastReceiver.EZpvd;
            }
            return broadcastReceiver.copydefault(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BroadcastReceiver copydefault(int i, int i2) {
            return new BroadcastReceiver(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastReceiver)) {
                return false;
            }
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) obj;
            return this.copydefault == broadcastReceiver.copydefault && this.EZpvd == broadcastReceiver.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ToSetupPassword(type=" + this.copydefault + ", behavior=" + this.EZpvd + ")";
        }

        public BroadcastReceiver(int i, int i2) {
            super(null);
            this.copydefault = i;
            this.EZpvd = i2;
        }
    }

    /* JADX INFO: renamed from: o.Afa$VoiceInteractor */
    public static final class VoiceInteractor extends AbstractC3100Afa {
        public static final int $stable = 0;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VoiceInteractor copy$default(VoiceInteractor voiceInteractor, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = voiceInteractor.OLrzqt;
            }
            return voiceInteractor.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VoiceInteractor OLrzqt(java.lang.String str) {
            return new VoiceInteractor(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VoiceInteractor) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((VoiceInteractor) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.OLrzqt;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ToEmailSetup(email=" + this.OLrzqt + ")";
        }

        public VoiceInteractor(java.lang.String str) {
            super(null);
            this.OLrzqt = str;
        }
    }

    /* JADX INFO: renamed from: o.Afa$SharedElementCallback */
    public static final class SharedElementCallback extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final SharedElementCallback INSTANCE = new SharedElementCallback();

        private SharedElementCallback() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final ComponentCallbacks2 INSTANCE = new ComponentCallbacks2();

        private ComponentCallbacks2() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$ComponentCallbacks */
    public static final class ComponentCallbacks extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final ComponentCallbacks INSTANCE = new ComponentCallbacks();

        private ComponentCallbacks() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$ClipData */
    public static final class ClipData extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final ClipData INSTANCE = new ClipData();

        private ClipData() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$ComponentName */
    public static final class ComponentName extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final ComponentName INSTANCE = new ComponentName();

        private ComponentName() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$AssistContent */
    public static final class AssistContent extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final AssistContent INSTANCE = new AssistContent();

        private AssistContent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$LoaderManager */
    public static final class LoaderManager extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final LoaderManager INSTANCE = new LoaderManager();

        private LoaderManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$TaskStackBuilder */
    public static final class TaskStackBuilder extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final TaskStackBuilder INSTANCE = new TaskStackBuilder();

        private TaskStackBuilder() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$Dialog */
    public static final class Dialog extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final Dialog INSTANCE = new Dialog();

        private Dialog() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$Activity */
    public static final class Activity extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final Activity INSTANCE = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$ActionBar */
    public static final class ActionBar extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final ActionBar INSTANCE = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$Application */
    public static final class Application extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final Application INSTANCE = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$FragmentManager */
    public static final class FragmentManager extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final FragmentManager INSTANCE = new FragmentManager();

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$PendingIntent */
    public static final class PendingIntent extends AbstractC3100Afa {
        public static final int $stable = 0;
        public final zAU EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, zAU zau, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                zau = pendingIntent.EZpvd;
            }
            return pendingIntent.EZpvd(zau);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent EZpvd(@NotNull zAU zau) {
            Intrinsics.checkNotNullParameter(zau, "");
            return new PendingIntent(zau);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final zAU OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd(this.EZpvd, ((PendingIntent) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ToDexAccountManagement(status=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull zAU zau) {
            super(null);
            Intrinsics.checkNotNullParameter(zau, "");
            this.EZpvd = zau;
        }
    }

    /* JADX INFO: renamed from: o.Afa$PictureInPictureParams */
    public static final class PictureInPictureParams extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final PictureInPictureParams INSTANCE = new PictureInPictureParams();

        private PictureInPictureParams() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$Fragment */
    public static final class Fragment extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final Fragment INSTANCE = new Fragment();

        private Fragment() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Afa$TaskDescription */
    public static final class TaskDescription extends AbstractC3100Afa {
        public static final int $stable = 0;
        public static final TaskDescription INSTANCE = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }
}
