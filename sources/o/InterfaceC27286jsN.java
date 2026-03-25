package o;

import com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo;
import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC27286jsN {

    /* JADX INFO: renamed from: o.jsN$Application */
    public static final class Application implements InterfaceC27286jsN {
        public static final Application KWHzl = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.jsN$TaskDescription */
    public static final class TaskDescription implements InterfaceC27286jsN {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.AEQbTJ;
            }
            return taskDescription.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((TaskDescription) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OpenProtocolAddress(url=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    /* JADX INFO: renamed from: o.jsN$PendingIntent */
    public static final class PendingIntent implements InterfaceC27286jsN {
        public final long KWHzl;
        public final boolean OLrzqt;
        public final long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, long j, long j2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = pendingIntent.copydefault;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = pendingIntent.KWHzl;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                z = pendingIntent.OLrzqt;
            }
            return pendingIntent.KWHzl(j3, j4, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent KWHzl(long j, long j2, boolean z) {
            return new PendingIntent(j, j2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.KWHzl;
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
            return this.copydefault == pendingIntent.copydefault && this.KWHzl == pendingIntent.KWHzl && this.OLrzqt == pendingIntent.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Long.hashCode(this.copydefault) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ViewProtocolDetails(protocolId=" + this.copydefault + ", chainId=" + this.KWHzl + ", expand=" + this.OLrzqt + ")";
        }

        public PendingIntent(long j, long j2, boolean z) {
            this.copydefault = j;
            this.KWHzl = j2;
            this.OLrzqt = z;
        }
    }

    /* JADX INFO: renamed from: o.jsN$Activity */
    public static final class Activity implements InterfaceC27286jsN {
        public static final Activity KWHzl = new Activity();

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.jsN$ActionBar */
    public static final class ActionBar implements InterfaceC27286jsN {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.Integer KWHzl;
        public final long OLrzqt;
        public final java.lang.Long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, long j, java.lang.String str, java.lang.Long l, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = actionBar.OLrzqt;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = actionBar.AEQbTJ;
            }
            java.lang.String str3 = str;
            if ((i & 4) != 0) {
                l = actionBar.copydefault;
            }
            java.lang.Long l2 = l;
            if ((i & 8) != 0) {
                str2 = actionBar.EZpvd;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                num = actionBar.KWHzl;
            }
            return actionBar.AEQbTJ(j2, str3, l2, str4, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(long j, @NotNull java.lang.String str, java.lang.Long l, java.lang.String str2, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(j, str, l, str2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.OLrzqt == actionBar.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Long.hashCode(this.OLrzqt);
            int iHashCode2 = this.AEQbTJ.hashCode();
            java.lang.Long l = this.copydefault;
            int iHashCode3 = l == null ? 0 : l.hashCode();
            java.lang.String str = this.EZpvd;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.KWHzl;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OpenProductDetails(investmentId=" + this.OLrzqt + ", source=" + this.AEQbTJ + ", chainId=" + this.copydefault + ", activitySourcePage=" + this.EZpvd + ", investmentCategory=" + this.KWHzl + ")";
        }

        public ActionBar(long j, @NotNull java.lang.String str, java.lang.Long l, java.lang.String str2, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = j;
            this.AEQbTJ = str;
            this.copydefault = l;
            this.EZpvd = str2;
            this.KWHzl = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 long)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
 A[MD:(long, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer):void (m)] (LINE:27) call: o.jsN.ActionBar.<init>(long, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ ActionBar(long j, java.lang.String str, java.lang.Long l, java.lang.String str2, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num);
        }
    }

    /* JADX INFO: renamed from: o.jsN$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC27286jsN {
        public final java.lang.String AEQbTJ;
        public final long EZpvd;
        public final java.util.List<DashboardInvestmentInfo> KWHzl;
        public final long OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<DashboardInvestmentInfo> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(j, j2, str, str2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<DashboardInvestmentInfo> copydefault() {
            return this.KWHzl;
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
            return this.OLrzqt == stateListAnimator.OLrzqt && this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((java.lang.Long.hashCode(this.OLrzqt) * 31) + java.lang.Long.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ViewDashboardV3DetailsDialog(chainId=" + this.OLrzqt + ", analysisPlatformId=" + this.EZpvd + ", containAvailableReward=" + this.AEQbTJ + ", containMarketReward=" + this.copydefault + ", dashboardInvestmentInfos=" + this.KWHzl + ")";
        }

        public StateListAnimator(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<DashboardInvestmentInfo> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = j;
            this.EZpvd = j2;
            this.AEQbTJ = str;
            this.copydefault = str2;
            this.KWHzl = list;
        }
    }

    /* JADX INFO: renamed from: o.jsN$LoaderManager */
    public static final class LoaderManager implements InterfaceC27286jsN {
        public final long EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final InvestedToken copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, InvestedToken investedToken, java.lang.String str, java.lang.String str2, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investedToken = loaderManager.copydefault;
            }
            if ((i & 2) != 0) {
                str = loaderManager.OLrzqt;
            }
            java.lang.String str3 = str;
            if ((i & 4) != 0) {
                str2 = loaderManager.KWHzl;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                j = loaderManager.EZpvd;
            }
            return loaderManager.OLrzqt(investedToken, str3, str4, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestedToken OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager OLrzqt(@NotNull InvestedToken investedToken, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
            Intrinsics.checkNotNullParameter(investedToken, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new LoaderManager(investedToken, str, str2, j);
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
            return Intrinsics.EZpvd(this.copydefault, loaderManager.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) loaderManager.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) loaderManager.KWHzl) && this.EZpvd == loaderManager.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Long.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ViewProtocolDetailDialog(investedToken=" + this.copydefault + ", protocolName=" + this.OLrzqt + ", protocolUrl=" + this.KWHzl + ", chainId=" + this.EZpvd + ")";
        }

        public LoaderManager(@NotNull InvestedToken investedToken, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
            Intrinsics.checkNotNullParameter(investedToken, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = investedToken;
            this.OLrzqt = str;
            this.KWHzl = str2;
            this.EZpvd = j;
        }
    }

    /* JADX INFO: renamed from: o.jsN$Dialog */
    public static final class Dialog implements InterfaceC27286jsN {
        public final long AEQbTJ;
        public final java.util.List<UnifiedRewardInfoByInvestment> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jsN$Dialog */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, long j, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = dialog.AEQbTJ;
            }
            if ((i & 2) != 0) {
                list = dialog.KWHzl;
            }
            return dialog.AEQbTJ(j, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog AEQbTJ(long j, @NotNull java.util.List<UnifiedRewardInfoByInvestment> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Dialog(j, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<UnifiedRewardInfoByInvestment> OLrzqt() {
            return this.KWHzl;
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
            return this.AEQbTJ == dialog.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, dialog.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Long.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ViewProtocolRewardDialog(analysisPlatformId=" + this.AEQbTJ + ", allRewards=" + this.KWHzl + ")";
        }

        public Dialog(long j, @NotNull java.util.List<UnifiedRewardInfoByInvestment> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = j;
            this.KWHzl = list;
        }
    }
}
