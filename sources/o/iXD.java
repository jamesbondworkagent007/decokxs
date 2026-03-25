package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iXD {

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements iXD {
        public static final Activity EZpvd = new Activity();

        private Activity() {
        }
    }

    public static final class TaskDescription implements iXD {
        public final java.lang.Throwable OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Throwable th, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(th, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.Throwable th, java.lang.String str) {
            Intrinsics.checkNotNullParameter(th, "");
            return new TaskDescription(th, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable OLrzqt() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            java.lang.String str = this.copydefault;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(e=" + this.OLrzqt + ", payload=" + this.copydefault + ")";
        }

        public TaskDescription(@NotNull java.lang.Throwable th, java.lang.String str) {
            Intrinsics.checkNotNullParameter(th, "");
            this.OLrzqt = th;
            this.copydefault = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Throwable)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.Throwable, java.lang.String):void (m)] (LINE:16) call: o.iXD.TaskDescription.<init>(java.lang.Throwable, java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.Throwable th, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : str);
        }
    }

    public static final class ActionBar implements iXD {
        public final DappInteractionArgs AEQbTJ;
        public final yHS<NewCallbackBean, InvestTxModel, TransactionConfig, java.lang.String, InvestTokenWithAmount, AbstractC58185ywX<ResponseData<java.lang.String>>> EZpvd;
        public final InvestTxModel KWHzl;
        public final Function2<NewCallbackBean, InvestTxModel, AbstractC58185ywX<ResponseData<java.lang.String>>> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iXD$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, InvestTxModel investTxModel, DappInteractionArgs dappInteractionArgs, yHS yhs, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investTxModel = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                dappInteractionArgs = actionBar.AEQbTJ;
            }
            if ((i & 4) != 0) {
                yhs = actionBar.EZpvd;
            }
            if ((i & 8) != 0) {
                function2 = actionBar.OLrzqt;
            }
            return actionBar.copydefault(investTxModel, dappInteractionArgs, yhs, function2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DappInteractionArgs EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final yHS<NewCallbackBean, InvestTxModel, TransactionConfig, java.lang.String, InvestTokenWithAmount, AbstractC58185ywX<ResponseData<java.lang.String>>> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function2<NewCallbackBean, InvestTxModel, AbstractC58185ywX<ResponseData<java.lang.String>>> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTxModel copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull InvestTxModel investTxModel, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull yHS<? super NewCallbackBean, ? super InvestTxModel, ? super TransactionConfig, ? super java.lang.String, ? super InvestTokenWithAmount, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> yhs, @NotNull Function2<? super NewCallbackBean, ? super InvestTxModel, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function2) {
            Intrinsics.checkNotNullParameter(investTxModel, "");
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            Intrinsics.checkNotNullParameter(yhs, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return new ActionBar(investTxModel, dappInteractionArgs, yhs, function2);
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
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(transactingModel=" + this.KWHzl + ", dappInteractionArgs=" + this.AEQbTJ + ", requestDataCallback=" + this.EZpvd + ", submitTransactionCallback=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yHS<? super com.okinc.business.defi.api.bean.NewCallbackBean, ? super com.okinc.business.invest_biz.data.bean.InvestTxModel, ? super com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig, ? super java.lang.String, ? super com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, ? extends o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.defi.api.bean.NewCallbackBean, ? super com.okinc.business.invest_biz.data.bean.InvestTxModel, ? extends o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull InvestTxModel investTxModel, @NotNull DappInteractionArgs dappInteractionArgs, @NotNull yHS<? super NewCallbackBean, ? super InvestTxModel, ? super TransactionConfig, ? super java.lang.String, ? super InvestTokenWithAmount, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> yhs, @NotNull Function2<? super NewCallbackBean, ? super InvestTxModel, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function2) {
            Intrinsics.checkNotNullParameter(investTxModel, "");
            Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
            Intrinsics.checkNotNullParameter(yhs, "");
            Intrinsics.checkNotNullParameter(function2, "");
            this.KWHzl = investTxModel;
            this.AEQbTJ = dappInteractionArgs;
            this.EZpvd = yhs;
            this.OLrzqt = function2;
        }
    }

    public static final class StateListAnimator implements iXD {
        public final Function2<NewCallbackBean, InvestTxModel, AbstractC58185ywX<ResponseData<java.lang.String>>> AEQbTJ;
        public final DappSignArgs EZpvd;
        public final InvestTxModel KWHzl;
        public final yHS<NewCallbackBean, InvestTxModel, TransactionConfig, java.lang.String, InvestTokenWithAmount, AbstractC58185ywX<ResponseData<java.lang.String>>> OLrzqt;
        public final InvestCallDataResult copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.iXD$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InvestTxModel investTxModel, DappSignArgs dappSignArgs, InvestCallDataResult investCallDataResult, yHS yhs, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                investTxModel = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                dappSignArgs = stateListAnimator.EZpvd;
            }
            DappSignArgs dappSignArgs2 = dappSignArgs;
            if ((i & 4) != 0) {
                investCallDataResult = stateListAnimator.copydefault;
            }
            InvestCallDataResult investCallDataResult2 = investCallDataResult;
            if ((i & 8) != 0) {
                yhs = stateListAnimator.OLrzqt;
            }
            yHS yhs2 = yhs;
            if ((i & 16) != 0) {
                function2 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(investTxModel, dappSignArgs2, investCallDataResult2, yhs2, function2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTxModel AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DappSignArgs EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestCallDataResult KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function2<NewCallbackBean, InvestTxModel, AbstractC58185ywX<ResponseData<java.lang.String>>> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull InvestTxModel investTxModel, @NotNull DappSignArgs dappSignArgs, @NotNull InvestCallDataResult investCallDataResult, @NotNull yHS<? super NewCallbackBean, ? super InvestTxModel, ? super TransactionConfig, ? super java.lang.String, ? super InvestTokenWithAmount, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> yhs, @NotNull Function2<? super NewCallbackBean, ? super InvestTxModel, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function2) {
            Intrinsics.checkNotNullParameter(investTxModel, "");
            Intrinsics.checkNotNullParameter(dappSignArgs, "");
            Intrinsics.checkNotNullParameter(investCallDataResult, "");
            Intrinsics.checkNotNullParameter(yhs, "");
            Intrinsics.checkNotNullParameter(function2, "");
            return new StateListAnimator(investTxModel, dappSignArgs, investCallDataResult, yhs, function2);
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
            return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SignPSBT(model=" + this.KWHzl + ", dAppSignArgs=" + this.EZpvd + ", callDataResponse=" + this.copydefault + ", requestDataCallback=" + this.OLrzqt + ", submitTransactionCallback=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.yHS<? super com.okinc.business.defi.api.bean.NewCallbackBean, ? super com.okinc.business.invest_biz.data.bean.InvestTxModel, ? super com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig, ? super java.lang.String, ? super com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, ? extends o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.defi.api.bean.NewCallbackBean, ? super com.okinc.business.invest_biz.data.bean.InvestTxModel, ? extends o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull InvestTxModel investTxModel, @NotNull DappSignArgs dappSignArgs, @NotNull InvestCallDataResult investCallDataResult, @NotNull yHS<? super NewCallbackBean, ? super InvestTxModel, ? super TransactionConfig, ? super java.lang.String, ? super InvestTokenWithAmount, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> yhs, @NotNull Function2<? super NewCallbackBean, ? super InvestTxModel, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function2) {
            Intrinsics.checkNotNullParameter(investTxModel, "");
            Intrinsics.checkNotNullParameter(dappSignArgs, "");
            Intrinsics.checkNotNullParameter(investCallDataResult, "");
            Intrinsics.checkNotNullParameter(yhs, "");
            Intrinsics.checkNotNullParameter(function2, "");
            this.KWHzl = investTxModel;
            this.EZpvd = dappSignArgs;
            this.copydefault = investCallDataResult;
            this.OLrzqt = yhs;
            this.AEQbTJ = function2;
        }
    }
}
