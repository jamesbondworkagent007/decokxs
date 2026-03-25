package o;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC26680jgr {

    /* JADX INFO: renamed from: o.jgr$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC26680jgr {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.jgr$Application */
    public static final class Application implements InterfaceC26680jgr {
        public static final Application copydefault = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.jgr$Fragment */
    public static final class Fragment implements InterfaceC26680jgr {
        public final TransactionStage AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, TransactionStage transactionStage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transactionStage = fragment.AEQbTJ;
            }
            return fragment.OLrzqt(transactionStage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionStage EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment OLrzqt(@NotNull TransactionStage transactionStage) {
            Intrinsics.checkNotNullParameter(transactionStage, "");
            return new Fragment(transactionStage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fragment) && this.AEQbTJ == ((Fragment) obj).AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RefreshReceiveInfo(stage=" + this.AEQbTJ + ")";
        }

        public Fragment(@NotNull TransactionStage transactionStage) {
            Intrinsics.checkNotNullParameter(transactionStage, "");
            this.AEQbTJ = transactionStage;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage:0x0004: SGET  A[WRAPPED] (LINE:12) com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage.RECEIVE_INFO_TIME_OUT com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage) : (r1v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage))
 A[MD:(com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage):void (m)] (LINE:12) call: o.jgr.Fragment.<init>(com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage):void type: THIS */
        public /* synthetic */ Fragment(TransactionStage transactionStage, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? TransactionStage.RECEIVE_INFO_TIME_OUT : transactionStage);
        }
    }

    /* JADX INFO: renamed from: o.jgr$Activity */
    public static final class Activity implements InterfaceC26680jgr {
        public final InvestTokenWithAmount AEQbTJ;
        public final InvestTokenWithAmount EZpvd;
        public final TransactionStage KWHzl;
        public final boolean OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, TransactionStage transactionStage, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.copydefault;
            }
            if ((i & 2) != 0) {
                investTokenWithAmount = activity.AEQbTJ;
            }
            InvestTokenWithAmount investTokenWithAmount3 = investTokenWithAmount;
            if ((i & 4) != 0) {
                investTokenWithAmount2 = activity.EZpvd;
            }
            InvestTokenWithAmount investTokenWithAmount4 = investTokenWithAmount2;
            if ((i & 8) != 0) {
                transactionStage = activity.KWHzl;
            }
            TransactionStage transactionStage2 = transactionStage;
            if ((i & 16) != 0) {
                z = activity.OLrzqt;
            }
            return activity.copydefault(str, investTokenWithAmount3, investTokenWithAmount4, transactionStage2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTokenWithAmount EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTokenWithAmount KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionStage copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, @NotNull TransactionStage transactionStage, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(transactionStage, "");
            return new Activity(str, investTokenWithAmount, investTokenWithAmount2, transactionStage, z);
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && this.KWHzl == activity.KWHzl && this.OLrzqt == activity.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            InvestTokenWithAmount investTokenWithAmount = this.AEQbTJ;
            int iHashCode2 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
            InvestTokenWithAmount investTokenWithAmount2 = this.EZpvd;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + (investTokenWithAmount2 != null ? investTokenWithAmount2.hashCode() : 0)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(amount=" + this.copydefault + ", selectedToken=" + this.AEQbTJ + ", receiveToken=" + this.EZpvd + ", stage=" + this.KWHzl + ", reset=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull java.lang.String str, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, @NotNull TransactionStage transactionStage, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(transactionStage, "");
            this.copydefault = str;
            this.AEQbTJ = investTokenWithAmount;
            this.EZpvd = investTokenWithAmount2;
            this.KWHzl = transactionStage;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r9v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r10v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage:0x0013: SGET  A[WRAPPED] (LINE:18) com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage.INPUT com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage) : (r11v0 com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage, boolean):void (m)] (LINE:14) call: o.jgr.Activity.<init>(java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage, boolean):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, TransactionStage transactionStage, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : investTokenWithAmount, (i & 4) != 0 ? null : investTokenWithAmount2, (i & 8) != 0 ? TransactionStage.INPUT : transactionStage, (i & 16) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.jgr$TaskDescription */
    public static final class TaskDescription implements InterfaceC26680jgr {
        public final TransactionStage OLrzqt;
        public final InterfaceC24182iXy copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, InterfaceC24182iXy interfaceC24182iXy, TransactionStage transactionStage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC24182iXy = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                transactionStage = taskDescription.OLrzqt;
            }
            return taskDescription.copydefault(interfaceC24182iXy, transactionStage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull InterfaceC24182iXy interfaceC24182iXy, @NotNull TransactionStage transactionStage) {
            Intrinsics.checkNotNullParameter(interfaceC24182iXy, "");
            Intrinsics.checkNotNullParameter(transactionStage, "");
            return new TaskDescription(interfaceC24182iXy, transactionStage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ExecuteTransaction(screenState=" + this.copydefault + ", stage=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull InterfaceC24182iXy interfaceC24182iXy, @NotNull TransactionStage transactionStage) {
            Intrinsics.checkNotNullParameter(interfaceC24182iXy, "");
            Intrinsics.checkNotNullParameter(transactionStage, "");
            this.copydefault = interfaceC24182iXy;
            this.OLrzqt = transactionStage;
        }
    }

    /* JADX INFO: renamed from: o.jgr$ActionBar */
    public static final class ActionBar implements InterfaceC26680jgr {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.AEQbTJ;
            }
            return actionBar.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((ActionBar) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChangeSlippage(slippage=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }
}
