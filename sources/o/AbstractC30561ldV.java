package o;

import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ldV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30561ldV implements InterfaceC30619lea {
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.ldV.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC30561ldV(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public java.lang.String getValue() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.ldV$TaskStackBuilder */
    public static final class TaskStackBuilder extends AbstractC30561ldV {
        public static final TaskStackBuilder AEQbTJ = new TaskStackBuilder();

        private TaskStackBuilder() {
            super("token_from", null);
        }
    }

    public AbstractC30561ldV(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX INFO: renamed from: o.ldV$ClipData */
    public static final class ClipData extends AbstractC30561ldV {
        public static final ClipData KWHzl = new ClipData();

        private ClipData() {
            super("token_to", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$PendingIntent */
    public static final class PendingIntent extends AbstractC30561ldV {
        public static final PendingIntent copydefault = new PendingIntent();

        private PendingIntent() {
            super("liquidity_explain", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application extends AbstractC30561ldV {
        public static final Application copydefault = new Application();

        private Application() {
            super("amount_input", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$Dialog */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Dialog extends AbstractC30561ldV {
        public static final Dialog copydefault = new Dialog();

        private Dialog() {
            super("value_input_fiat", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$Activity */
    public static final class Activity extends AbstractC30561ldV {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
            super("deposit", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$SharedElementCallback */
    public static final class SharedElementCallback extends AbstractC30561ldV {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SharedElementCallback copy$default(SharedElementCallback sharedElementCallback, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sharedElementCallback.KWHzl;
            }
            return sharedElementCallback.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedElementCallback copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SharedElementCallback(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SharedElementCallback) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((SharedElementCallback) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Slider(input=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SharedElementCallback(@NotNull java.lang.String str) {
            super("qty_amount", null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    /* JADX INFO: renamed from: o.ldV$AssistContent */
    public static final class AssistContent extends AbstractC30561ldV {
        public static final AssistContent KWHzl = new AssistContent();

        private AssistContent() {
            super("service_fee_explain", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$Fragment */
    public static final class Fragment extends AbstractC30561ldV {
        public static final Fragment AEQbTJ = new Fragment();

        private Fragment() {
            super("liquidity_select", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$VoiceInteractor */
    public static final class VoiceInteractor extends AbstractC30561ldV {
        public static final VoiceInteractor copydefault = new VoiceInteractor();

        private VoiceInteractor() {
            super("rate_diff_explain", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$PictureInPictureParams */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class PictureInPictureParams extends AbstractC30561ldV {
        public static final PictureInPictureParams KWHzl = new PictureInPictureParams();

        private PictureInPictureParams() {
            super("settings_enter", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$LoaderManager */
    public static final class LoaderManager extends AbstractC30561ldV {
        public static final LoaderManager copydefault = new LoaderManager();

        private LoaderManager() {
            super("limit_explain", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$FragmentManager */
    public static final class FragmentManager extends AbstractC30561ldV {
        public static final FragmentManager KWHzl = new FragmentManager();

        private FragmentManager() {
            super("price_condition_select", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$StateListAnimator */
    public static final class StateListAnimator extends AbstractC30561ldV {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
            super("auto_sell_click", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$ActionBar */
    public static final class ActionBar extends AbstractC30561ldV {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
            super("auto_sell_edit", null);
        }
    }

    /* JADX INFO: renamed from: o.ldV$TaskDescription */
    public static final class TaskDescription extends AbstractC30561ldV {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.KWHzl;
            }
            return taskDescription.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((TaskDescription) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Confirm(submitType=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:25) call: o.ldV.TaskDescription.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super(Web3SecurityTrackEvent.VALUE_CONFIRM, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }
}
