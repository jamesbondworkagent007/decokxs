package o;

import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iVX {

    public interface ActionBar extends iVX {
        int OLrzqt();
    }

    public static final class StateListAnimator implements iVX {
        public final boolean AEQbTJ;
        public final InvestOrderDetailsInfoVo.InvestCoinInfo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investCoinInfo = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.EZpvd(investCoinInfo, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo, boolean z) {
            Intrinsics.checkNotNullParameter(investCoinInfo, "");
            return new StateListAnimator(investCoinInfo, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestOrderDetailsInfoVo.InvestCoinInfo copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Asset(info=" + this.OLrzqt + ", isLoading=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo, boolean z) {
            Intrinsics.checkNotNullParameter(investCoinInfo, "");
            this.OLrzqt = investCoinInfo;
            this.AEQbTJ = z;
        }
    }

    public static final class Activity implements iVX {
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Illegal instructions before constructor call */
        public Activity() {
            int i = 0;
            this(i, i, 3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = activity.OLrzqt;
            }
            if ((i3 & 2) != 0) {
                i2 = activity.copydefault;
            }
            return activity.EZpvd(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(int i, int i2) {
            return new Activity(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
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
            return this.OLrzqt == activity.OLrzqt && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Divider(horizontalMarginDp=" + this.OLrzqt + ", topMarginDp=" + this.copydefault + ")";
        }

        public Activity(int i, int i2) {
            this.OLrzqt = i;
            this.copydefault = i2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (16 int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (24 int) : (r2v0 int))
 A[MD:(int, int):void (m)] (LINE:9) call: o.iVX.Activity.<init>(int, int):void type: THIS */
        public /* synthetic */ Activity(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 16 : i, (i3 & 2) != 0 ? 24 : i2);
        }
    }

    public static final class Application implements iVX {
        public final InvestOrderDetailsInfoVo.InvestCoinInfo AEQbTJ;
        public final InvestOrderDetailsInfoVo.InvestmentInfo KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, InvestOrderDetailsInfoVo.InvestmentInfo investmentInfo, InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investmentInfo = application.KWHzl;
            }
            if ((i & 2) != 0) {
                investCoinInfo = application.AEQbTJ;
            }
            return application.OLrzqt(investmentInfo, investCoinInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestOrderDetailsInfoVo.InvestCoinInfo EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestOrderDetailsInfoVo.InvestmentInfo KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull InvestOrderDetailsInfoVo.InvestmentInfo investmentInfo, InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo) {
            Intrinsics.checkNotNullParameter(investmentInfo, "");
            return new Application(investmentInfo, investCoinInfo);
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
            return Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo = this.AEQbTJ;
            return (iHashCode * 31) + (investCoinInfo == null ? 0 : investCoinInfo.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Investment(info=" + this.KWHzl + ", singleToken=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull InvestOrderDetailsInfoVo.InvestmentInfo investmentInfo, InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo) {
            Intrinsics.checkNotNullParameter(investmentInfo, "");
            this.KWHzl = investmentInfo;
            this.AEQbTJ = investCoinInfo;
        }
    }

    public static final class TaskDescription implements iVX {
        public final InvestOrderDetailsInfoVo.InvestCoinInfo AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investCoinInfo = taskDescription.AEQbTJ;
            }
            return taskDescription.copydefault(investCoinInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestOrderDetailsInfoVo.InvestCoinInfo EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo) {
            Intrinsics.checkNotNullParameter(investCoinInfo, "");
            return new TaskDescription(investCoinInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InvestmentToken(info=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@NotNull InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo) {
            Intrinsics.checkNotNullParameter(investCoinInfo, "");
            this.AEQbTJ = investCoinInfo;
        }
    }

    public static final class FragmentManager implements iVX {
        public static final FragmentManager EZpvd = new FragmentManager();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PlusIcon";
        }

        private FragmentManager() {
        }
    }

    public static final class Dialog implements iVX {
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dialog.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = dialog.OLrzqt;
            }
            return dialog.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) dialog.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dialog.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            java.lang.String str = this.OLrzqt;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Title(title=" + this.copydefault + ", titleTip=" + this.OLrzqt + ")";
        }

        public Dialog(@NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.OLrzqt = str2;
        }
    }

    public static final class LoaderManager implements iVX {
        public final InvestOrderDetailsInfoVo.InvestLineInfo KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                investLineInfo = loaderManager.KWHzl;
            }
            if ((i2 & 2) != 0) {
                i = loaderManager.copydefault;
            }
            return loaderManager.EZpvd(investLineInfo, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestOrderDetailsInfoVo.InvestLineInfo EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager EZpvd(@NotNull InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo, int i) {
            Intrinsics.checkNotNullParameter(investLineInfo, "");
            return new LoaderManager(investLineInfo, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoaderManager)) {
                return false;
            }
            LoaderManager loaderManager = (LoaderManager) obj;
            return Intrinsics.EZpvd(this.KWHzl, loaderManager.KWHzl) && this.copydefault == loaderManager.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SingleColumnLineInfo(info=" + this.KWHzl + ", marginTopDp=" + this.copydefault + ")";
        }

        public LoaderManager(@NotNull InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo, int i) {
            Intrinsics.checkNotNullParameter(investLineInfo, "");
            this.KWHzl = investLineInfo;
            this.copydefault = i;
        }
    }

    public static final class PendingIntent implements iVX {
        public final InvestOrderDetailsInfoVo.InvestLineInfo EZpvd;
        public final InvestOrderDetailsInfoVo.InvestLineInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo, InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investLineInfo = pendingIntent.EZpvd;
            }
            if ((i & 2) != 0) {
                investLineInfo2 = pendingIntent.copydefault;
            }
            return pendingIntent.copydefault(investLineInfo, investLineInfo2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestOrderDetailsInfoVo.InvestLineInfo EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestOrderDetailsInfoVo.InvestLineInfo KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent copydefault(@NotNull InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo, InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo2) {
            Intrinsics.checkNotNullParameter(investLineInfo, "");
            return new PendingIntent(investLineInfo, investLineInfo2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingIntent)) {
                return false;
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            return Intrinsics.EZpvd(this.EZpvd, pendingIntent.EZpvd) && Intrinsics.EZpvd(this.copydefault, pendingIntent.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo = this.copydefault;
            return (iHashCode * 31) + (investLineInfo == null ? 0 : investLineInfo.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TwoColumnsLineInfo(info1=" + this.EZpvd + ", info2=" + this.copydefault + ")";
        }

        public PendingIntent(@NotNull InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo, InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo2) {
            Intrinsics.checkNotNullParameter(investLineInfo, "");
            this.EZpvd = investLineInfo;
            this.copydefault = investLineInfo2;
        }
    }

    public static final class AssistContent implements iVX {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = assistContent.KWHzl;
            }
            return assistContent.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new AssistContent(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AssistContent) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((AssistContent) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WarningMessage(content=" + this.KWHzl + ")";
        }

        public AssistContent(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    public static final class VoiceInteractor implements ActionBar {
        public final java.lang.String AEQbTJ;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VoiceInteractor copy$default(VoiceInteractor voiceInteractor, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = voiceInteractor.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                i = voiceInteractor.copydefault;
            }
            return voiceInteractor.EZpvd(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VoiceInteractor EZpvd(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            return new VoiceInteractor(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.iVX.ActionBar
        public int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VoiceInteractor)) {
                return false;
            }
            VoiceInteractor voiceInteractor = (VoiceInteractor) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) voiceInteractor.AEQbTJ) && this.copydefault == voiceInteractor.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ViewOnExplorer(url=" + this.AEQbTJ + ", marginTopDp=" + this.copydefault + ")";
        }

        public VoiceInteractor(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.copydefault = i;
        }
    }

    public static final class Fragment implements ActionBar {
        public final int AEQbTJ;
        public final long KWHzl;
        public final long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, long j, long j2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                j = fragment.copydefault;
            }
            long j3 = j;
            if ((i2 & 2) != 0) {
                j2 = fragment.KWHzl;
            }
            long j4 = j2;
            if ((i2 & 4) != 0) {
                i = fragment.AEQbTJ;
            }
            return fragment.copydefault(j3, j4, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.iVX.ActionBar
        public int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment copydefault(long j, long j2, int i) {
            return new Fragment(j, j2, i);
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
            return this.copydefault == fragment.copydefault && this.KWHzl == fragment.KWHzl && this.AEQbTJ == fragment.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Long.hashCode(this.copydefault) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ViewInWallet(analysisPlatformId=" + this.copydefault + ", chainId=" + this.KWHzl + ", marginTopDp=" + this.AEQbTJ + ")";
        }

        public Fragment(long j, long j2, int i) {
            this.copydefault = j;
            this.KWHzl = j2;
            this.AEQbTJ = i;
        }
    }
}
