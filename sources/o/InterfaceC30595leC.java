package o;

import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.business.trade.features.home.ui.cefi.common.WalletType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.leC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC30595leC {

    /* JADX INFO: renamed from: o.leC$ComponentName */
    public static final class ComponentName implements InterfaceC30595leC {
        public static final ComponentName OLrzqt = new ComponentName();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComponentName)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1687007501;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "None";
        }

        private ComponentName() {
        }
    }

    /* JADX INFO: renamed from: o.leC$ClipData */
    public static final class ClipData implements InterfaceC30595leC {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ClipData copy$default(ClipData clipData, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = clipData.copydefault;
            }
            return clipData.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ClipData copydefault(java.lang.String str) {
            return new ClipData(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClipData) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((ClipData) obj).copydefault);
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
            return "QuoteError(errorMsg=" + this.copydefault + ")";
        }

        public ClipData(java.lang.String str) {
            this.copydefault = str;
        }
    }

    /* JADX INFO: renamed from: o.leC$Application */
    public static final class Application implements InterfaceC30595leC {
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.copydefault;
            }
            return application.OLrzqt(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(boolean z) {
            return new Application(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && this.copydefault == ((Application) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ConnectWallet(needSmartWallet=" + this.copydefault + ")";
        }

        public Application(boolean z) {
            this.copydefault = z;
        }
    }

    /* JADX INFO: renamed from: o.leC$BroadcastReceiver */
    public static final class BroadcastReceiver implements InterfaceC30595leC {
        public static final BroadcastReceiver OLrzqt = new BroadcastReceiver();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastReceiver)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1300161038;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoTokenSupport";
        }

        private BroadcastReceiver() {
        }
    }

    /* JADX INFO: renamed from: o.leC$VoiceInteractor */
    public static final class VoiceInteractor implements InterfaceC30595leC {
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
            return -333819511;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoQuotePrice";
        }

        private VoiceInteractor() {
        }
    }

    /* JADX INFO: renamed from: o.leC$PendingIntent */
    public static final class PendingIntent implements InterfaceC30595leC {
        public static final PendingIntent OLrzqt = new PendingIntent();

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
            return -1429011195;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MEVError";
        }

        private PendingIntent() {
        }
    }

    /* JADX INFO: renamed from: o.leC$ComponentCallbacks */
    public static final class ComponentCallbacks implements InterfaceC30595leC {
        public static final ComponentCallbacks copydefault = new ComponentCallbacks();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComponentCallbacks)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 390662762;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RestrictedRegion";
        }

        private ComponentCallbacks() {
        }
    }

    /* JADX INFO: renamed from: o.leC$TaskDescription */
    public static final class TaskDescription implements InterfaceC30595leC {
        public static final TaskDescription copydefault = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2128751536;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BlackAddress";
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.leC$SharedElementCallback */
    public static final class SharedElementCallback implements InterfaceC30595leC {
        public static final SharedElementCallback copydefault = new SharedElementCallback();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SharedElementCallback)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 13528950;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoSupportTPLS";
        }

        private SharedElementCallback() {
        }
    }

    /* JADX INFO: renamed from: o.leC$TaskStackBuilder */
    public static final class TaskStackBuilder implements InterfaceC30595leC {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskStackBuilder copy$default(TaskStackBuilder taskStackBuilder, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskStackBuilder.AEQbTJ;
            }
            return taskStackBuilder.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskStackBuilder EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskStackBuilder(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskStackBuilder) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((TaskStackBuilder) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoMCapSupport(token=" + this.AEQbTJ + ")";
        }

        public TaskStackBuilder(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    /* JADX INFO: renamed from: o.leC$LoaderManager */
    public static final class LoaderManager implements InterfaceC30595leC {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loaderManager.KWHzl;
            }
            return loaderManager.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager KWHzl(java.lang.String str) {
            return new LoaderManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((LoaderManager) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HighRiskWarning(token=" + this.KWHzl + ")";
        }

        public LoaderManager(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:35) call: o.leC.LoaderManager.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ LoaderManager(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    /* JADX INFO: renamed from: o.leC$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC30595leC {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            return stateListAnimator.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(java.lang.String str) {
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HighRisk(token=" + this.KWHzl + ")";
        }

        public StateListAnimator(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:39) call: o.leC.StateListAnimator.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    /* JADX INFO: renamed from: o.leC$ActionBar */
    public static final class ActionBar implements InterfaceC30595leC {
        public final boolean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(false, 1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = actionBar.EZpvd;
            }
            return actionBar.EZpvd(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(boolean z) {
            return new ActionBar(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && this.EZpvd == ((ActionBar) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DAppTrade(isRestricted=" + this.EZpvd + ")";
        }

        public ActionBar(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:43) call: o.leC.ActionBar.<init>(boolean):void type: THIS */
        public /* synthetic */ ActionBar(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.leC$AssistContent */
    public static final class AssistContent implements InterfaceC30595leC {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = assistContent.OLrzqt;
            }
            return assistContent.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent OLrzqt(java.lang.String str) {
            return new AssistContent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AssistContent) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((AssistContent) obj).OLrzqt);
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
            return "NoChainSupport(chainName=" + this.OLrzqt + ")";
        }

        public AssistContent(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:47) call: o.leC.AssistContent.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ AssistContent(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    /* JADX INFO: renamed from: o.leC$PictureInPictureParams */
    public static final class PictureInPictureParams implements InterfaceC30595leC {
        public final Function0<Unit> EZpvd;
        public final java.lang.String KWHzl;
        public final boolean OLrzqt;
        public final InterfaceC30595leC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams() {
            this(null, false, null, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.leC$PictureInPictureParams */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PictureInPictureParams copy$default(PictureInPictureParams pictureInPictureParams, java.lang.String str, boolean z, InterfaceC30595leC interfaceC30595leC, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pictureInPictureParams.KWHzl;
            }
            if ((i & 2) != 0) {
                z = pictureInPictureParams.OLrzqt;
            }
            if ((i & 4) != 0) {
                interfaceC30595leC = pictureInPictureParams.copydefault;
            }
            if ((i & 8) != 0) {
                function0 = pictureInPictureParams.EZpvd;
            }
            return pictureInPictureParams.OLrzqt(str, z, interfaceC30595leC, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC30595leC AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PictureInPictureParams OLrzqt(@NotNull java.lang.String str, boolean z, InterfaceC30595leC interfaceC30595leC, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PictureInPictureParams(str, z, interfaceC30595leC, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PictureInPictureParams)) {
                return false;
            }
            PictureInPictureParams pictureInPictureParams = (PictureInPictureParams) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) pictureInPictureParams.KWHzl) && this.OLrzqt == pictureInPictureParams.OLrzqt && Intrinsics.EZpvd(this.copydefault, pictureInPictureParams.copydefault) && Intrinsics.EZpvd(this.EZpvd, pictureInPictureParams.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
            InterfaceC30595leC interfaceC30595leC = this.copydefault;
            int iHashCode3 = interfaceC30595leC == null ? 0 : interfaceC30595leC.hashCode();
            Function0<Unit> function0 = this.EZpvd;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (function0 != null ? function0.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoLiquidity(num=" + this.KWHzl + ", isBlocker=" + this.OLrzqt + ", buttonError=" + this.copydefault + ", action=" + this.EZpvd + ")";
        }

        public PictureInPictureParams(@NotNull java.lang.String str, boolean z, InterfaceC30595leC interfaceC30595leC, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
            this.OLrzqt = z;
            this.copydefault = interfaceC30595leC;
            this.EZpvd = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:o.leC:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.leC) : (r4v0 o.leC))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r5v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, boolean, o.leC, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:51) call: o.leC.PictureInPictureParams.<init>(java.lang.String, boolean, o.leC, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ PictureInPictureParams(java.lang.String str, boolean z, InterfaceC30595leC interfaceC30595leC, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : interfaceC30595leC, (i & 8) != 0 ? null : function0);
        }
    }

    /* JADX INFO: renamed from: o.leC$DialogInterface */
    public static final class DialogInterface implements InterfaceC30595leC {
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DialogInterface() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DialogInterface copy$default(DialogInterface dialogInterface, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialogInterface.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = dialogInterface.KWHzl;
            }
            return dialogInterface.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DialogInterface KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new DialogInterface(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DialogInterface)) {
                return false;
            }
            DialogInterface dialogInterface = (DialogInterface) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dialogInterface.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) dialogInterface.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SafeMoon(token=" + this.OLrzqt + ", rate=" + this.KWHzl + ")";
        }

        public DialogInterface(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:58) call: o.leC.DialogInterface.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ DialogInterface(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: o.leC$Dialog */
    public static final class Dialog implements InterfaceC30595leC {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final Function0<Unit> KWHzl;
        public final java.lang.String OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
            this(null, null, false, null, null, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.leC$Dialog */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = dialog.EZpvd;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                z = dialog.copydefault;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                str3 = dialog.OLrzqt;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                function0 = dialog.KWHzl;
            }
            return dialog.AEQbTJ(str, str4, z2, str5, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog AEQbTJ(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, Function0<Unit> function0) {
            return new Dialog(str, str2, z, str3, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) dialog.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) dialog.EZpvd) && this.copydefault == dialog.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dialog.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, dialog.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AEQbTJ;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.EZpvd;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            int iHashCode3 = java.lang.Boolean.hashCode(this.copydefault);
            java.lang.String str3 = this.OLrzqt;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            Function0<Unit> function0 = this.KWHzl;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (function0 != null ? function0.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NoBalance(token=" + this.AEQbTJ + ", code=" + this.EZpvd + ", canRecharge=" + this.copydefault + ", message=" + this.OLrzqt + ", onConfirmClick=" + this.KWHzl + ")";
        }

        public Dialog(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, Function0<Unit> function0) {
            this.AEQbTJ = str;
            this.EZpvd = str2;
            this.copydefault = z;
            this.OLrzqt = str3;
            this.KWHzl = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:boolean:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r8v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:63) call: o.leC.Dialog.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ Dialog(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : function0);
        }
    }

    /* JADX INFO: renamed from: o.leC$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 implements InterfaceC30595leC {
        public final java.lang.String AEQbTJ;
        public final Function1<java.lang.Boolean, Unit> KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.Throwable copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.leC$ComponentCallbacks2 */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComponentCallbacks2 copy$default(ComponentCallbacks2 componentCallbacks2, java.lang.String str, java.lang.String str2, java.lang.Throwable th, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = componentCallbacks2.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = componentCallbacks2.AEQbTJ;
            }
            if ((i & 4) != 0) {
                th = componentCallbacks2.copydefault;
            }
            if ((i & 8) != 0) {
                function1 = componentCallbacks2.KWHzl;
            }
            return componentCallbacks2.KWHzl(str, str2, th, function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<java.lang.Boolean, Unit> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ComponentCallbacks2 KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.Throwable th, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            return new ComponentCallbacks2(str, str2, th, function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComponentCallbacks2)) {
                return false;
            }
            ComponentCallbacks2 componentCallbacks2 = (ComponentCallbacks2) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) componentCallbacks2.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) componentCallbacks2.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, componentCallbacks2.copydefault) && Intrinsics.EZpvd(this.KWHzl, componentCallbacks2.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            java.lang.String str = this.AEQbTJ;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Throwable th = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (th != null ? th.hashCode() : 0)) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OrderError(code=" + this.OLrzqt + ", message=" + this.AEQbTJ + ", error=" + this.copydefault + ", retryOrderSubmit=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ComponentCallbacks2(@NotNull java.lang.String str, java.lang.String str2, java.lang.Throwable th, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = str;
            this.AEQbTJ = str2;
            this.copydefault = th;
            this.KWHzl = function1;
        }
    }

    /* JADX INFO: renamed from: o.leC$Activity */
    public static final class Activity implements InterfaceC30595leC {
        public final AdvancedApproveState EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, AdvancedApproveState advancedApproveState, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                advancedApproveState = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                str = activity.copydefault;
            }
            return activity.OLrzqt(advancedApproveState, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdvancedApproveState KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull AdvancedApproveState advancedApproveState, java.lang.String str) {
            Intrinsics.checkNotNullParameter(advancedApproveState, "");
            return new Activity(advancedApproveState, str);
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
            return this.EZpvd == activity.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            java.lang.String str = this.copydefault;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ApprovalError(state=" + this.EZpvd + ", token=" + this.copydefault + ")";
        }

        public Activity(@NotNull AdvancedApproveState advancedApproveState, java.lang.String str) {
            Intrinsics.checkNotNullParameter(advancedApproveState, "");
            this.EZpvd = advancedApproveState;
            this.copydefault = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState:0x0004: SGET  A[WRAPPED] (LINE:89) com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState.APPROVED com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState) : (r1v0 com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState, java.lang.String):void (m)] (LINE:88) call: o.leC.Activity.<init>(com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState, java.lang.String):void type: THIS */
        public /* synthetic */ Activity(AdvancedApproveState advancedApproveState, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AdvancedApproveState.APPROVED : advancedApproveState, (i & 2) != 0 ? "" : str);
        }
    }

    /* JADX INFO: renamed from: o.leC$Intent */
    public static final class Intent implements InterfaceC30595leC {
        public final Function0<Unit> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Intent() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.leC$Intent */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Intent copy$default(Intent intent, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = intent.AEQbTJ;
            }
            return intent.KWHzl(function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Intent KWHzl(Function0<Unit> function0) {
            return new Intent(function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Intent) && Intrinsics.EZpvd(this.AEQbTJ, ((Intent) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Function0<Unit> function0 = this.AEQbTJ;
            if (function0 == null) {
                return 0;
            }
            return function0.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RouteError(retryAction=" + this.AEQbTJ + ")";
        }

        public Intent(Function0<Unit> function0) {
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:93) call: o.leC.Intent.<init>(kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ Intent(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : function0);
        }
    }

    /* JADX INFO: renamed from: o.leC$ContentResolver */
    public static final class ContentResolver implements InterfaceC30595leC {
        public final java.lang.String EZpvd;
        public final WalletType KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContentResolver() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ContentResolver copy$default(ContentResolver contentResolver, WalletType walletType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                walletType = contentResolver.KWHzl;
            }
            if ((i & 2) != 0) {
                str = contentResolver.copydefault;
            }
            if ((i & 4) != 0) {
                str2 = contentResolver.EZpvd;
            }
            return contentResolver.KWHzl(walletType, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContentResolver KWHzl(@NotNull WalletType walletType, java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(walletType, "");
            return new ContentResolver(walletType, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentResolver)) {
                return false;
            }
            ContentResolver contentResolver = (ContentResolver) obj;
            return this.KWHzl == contentResolver.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) contentResolver.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) contentResolver.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            java.lang.String str = this.copydefault;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.EZpvd;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SwitchWallet(type=" + this.KWHzl + ", chainId=" + this.copydefault + ", chainName=" + this.EZpvd + ")";
        }

        public ContentResolver(@NotNull WalletType walletType, java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(walletType, "");
            this.KWHzl = walletType;
            this.copydefault = str;
            this.EZpvd = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:com.okinc.business.trade.features.home.ui.cefi.common.WalletType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.trade.features.home.ui.cefi.common.WalletType:0x0004: SGET  A[WRAPPED] (LINE:96) com.okinc.business.trade.features.home.ui.cefi.common.WalletType.VALID com.okinc.business.trade.features.home.ui.cefi.common.WalletType) : (r1v0 com.okinc.business.trade.features.home.ui.cefi.common.WalletType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("-100000000") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(com.okinc.business.trade.features.home.ui.cefi.common.WalletType, java.lang.String, java.lang.String):void (m)] (LINE:95) call: o.leC.ContentResolver.<init>(com.okinc.business.trade.features.home.ui.cefi.common.WalletType, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ContentResolver(WalletType walletType, java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? WalletType.VALID : walletType, (i & 2) != 0 ? "-100000000" : str, (i & 4) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: o.leC$ContextWrapper */
    public static final class ContextWrapper implements InterfaceC30595leC {
        public final gLQ EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ContextWrapper copy$default(ContextWrapper contextWrapper, gLQ glq, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                glq = contextWrapper.EZpvd;
            }
            return contextWrapper.copydefault(glq);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final gLQ OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContextWrapper copydefault(@NotNull gLQ glq) {
            Intrinsics.checkNotNullParameter(glq, "");
            return new ContextWrapper(glq);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContextWrapper) && Intrinsics.EZpvd(this.EZpvd, ((ContextWrapper) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SmartAccountError(state=" + this.EZpvd + ")";
        }

        public ContextWrapper(@NotNull gLQ glq) {
            Intrinsics.checkNotNullParameter(glq, "");
            this.EZpvd = glq;
        }
    }

    /* JADX INFO: renamed from: o.leC$Fragment */
    public static final class Fragment implements InterfaceC30595leC {
        public final java.lang.String AEQbTJ;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = fragment.copydefault;
            }
            return fragment.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment copydefault(java.lang.String str, java.lang.String str2) {
            return new Fragment(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fragment)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) fragment.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) fragment.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AEQbTJ;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.copydefault;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MinLimitAmount(amount=" + this.AEQbTJ + ", token=" + this.copydefault + ")";
        }

        public Fragment(java.lang.String str, java.lang.String str2) {
            this.AEQbTJ = str;
            this.copydefault = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:103) call: o.leC.Fragment.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Fragment(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: o.leC$Context */
    public static final class Context implements InterfaceC30595leC {
        public final int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Context copy$default(Context context, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = context.KWHzl;
            }
            return context.copydefault(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Context copydefault(int i) {
            return new Context(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Context) && this.KWHzl == ((Context) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TooManyOrders(maxOrderCount=" + this.KWHzl + ")";
        }

        public Context(int i) {
            this.KWHzl = i;
        }
    }

    /* JADX INFO: renamed from: o.leC$FragmentManager */
    public static final class FragmentManager implements InterfaceC30595leC {
        public static final FragmentManager OLrzqt = new FragmentManager();

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
            return 1792324480;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InvalidQuote";
        }

        private FragmentManager() {
        }
    }
}
