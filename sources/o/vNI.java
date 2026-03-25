package o;

import com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse;
import com.okinc.tradingbot.impl.order.strategy.domain.usecase.SmartArbGetProfitInfoUseCase$execute$2;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vNI extends vNH<TaskDescription, ActionBar> {
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC50055vAf OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public vNI(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC50055vAf;
        this.KWHzl = coroutineDispatcher;
    }

    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.AEQbTJ;
            }
            return taskDescription.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.KWHzl + ", instId=" + this.AEQbTJ + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
        }
    }

    public static final class ActionBar {
        public static final int EZpvd;
        public final SmartArbWithdrawProfitResponse KWHzl;
        public final TickersData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int i = TickersData.$stable;
            int i2 = ProfitDetailResponse.$stable;
            EZpvd = i | i2 | i2 | i2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponse, TickersData tickersData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smartArbWithdrawProfitResponse = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                tickersData = actionBar.copydefault;
            }
            return actionBar.copydefault(smartArbWithdrawProfitResponse, tickersData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SmartArbWithdrawProfitResponse EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TickersData copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponse, TickersData tickersData) {
            return new ActionBar(smartArbWithdrawProfitResponse, tickersData);
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
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponse = this.KWHzl;
            int iHashCode = smartArbWithdrawProfitResponse == null ? 0 : smartArbWithdrawProfitResponse.hashCode();
            TickersData tickersData = this.copydefault;
            return (iHashCode * 31) + (tickersData != null ? tickersData.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(profitInfo=" + this.KWHzl + ", ticker=" + this.copydefault + ")";
        }

        public ActionBar(SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponse, TickersData tickersData) {
            this.KWHzl = smartArbWithdrawProfitResponse;
            this.copydefault = tickersData;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse) : (r2v0 com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse))
  (wrap:com.okinc.unify_trade.biz.subscribe.TickersData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.subscribe.TickersData) : (r3v0 com.okinc.unify_trade.biz.subscribe.TickersData))
 A[MD:(com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse, com.okinc.unify_trade.biz.subscribe.TickersData):void (m)] (LINE:23) call: o.vNI.ActionBar.<init>(com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse, com.okinc.unify_trade.biz.subscribe.TickersData):void type: THIS */
        public /* synthetic */ ActionBar(SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponse, TickersData tickersData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : smartArbWithdrawProfitResponse, (i & 2) != 0 ? null : tickersData);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.vNH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super ActionBar> continuation) {
        return SupervisorKt.supervisorScope(new SmartArbGetProfitInfoUseCase$execute$2(this, taskDescription, null), continuation);
    }
}
