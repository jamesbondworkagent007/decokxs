package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.botList.domain.GetBacktestListUseCase$execute$1;
import com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import o.AbstractC43419rot;
import o.InterfaceC50055vAf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uJy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48234uJy extends vNH<TaskDescription, ActionBar> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC50055vAf copydefault;

    /* JADX INFO: renamed from: o.uJy$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BacktestFilter.values().length];
            try {
                iArr[BacktestFilter.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BacktestFilter.RUNNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BacktestFilter.COMPLETED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C48234uJy(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC50055vAf;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.uJy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uJy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        GetBacktestListUseCase$execute$1 getBacktestListUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof GetBacktestListUseCase$execute$1) {
            getBacktestListUseCase$execute$1 = (GetBacktestListUseCase$execute$1) continuation;
            int i = getBacktestListUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getBacktestListUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getBacktestListUseCase$execute$1 = new GetBacktestListUseCase$execute$1(this, continuation);
            }
        }
        GetBacktestListUseCase$execute$1 getBacktestListUseCase$execute$12 = getBacktestListUseCase$execute$1;
        java.lang.Object backtestList$default = getBacktestListUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getBacktestListUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(backtestList$default);
                InterfaceC50055vAf interfaceC50055vAf = this.copydefault;
                java.lang.String strOLrzqt = OLrzqt(taskDescription.KWHzl());
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(20);
                java.lang.String strCopydefault = taskDescription.copydefault();
                getBacktestListUseCase$execute$12.label = 1;
                backtestList$default = InterfaceC50055vAf.ActionBar.getBacktestList$default(interfaceC50055vAf, strOLrzqt, numAEQbTJ, strCopydefault, null, getBacktestListUseCase$execute$12, 8, null);
                if (backtestList$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(backtestList$default);
            }
            responseData = (ResponseData) backtestList$default;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            java.util.List list = (java.util.List) stateListAnimator.AEQbTJ();
            if (list.size() >= 20) {
            }
            StrategyPendingListResp strategyPendingListResp = (StrategyPendingListResp) CollectionsKt___CollectionsKt.wlaJM(list);
            return new ActionBar(z, strategyPendingListResp == null ? strategyPendingListResp.getAlgoId() : null, list);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        java.util.List list2 = (java.util.List) stateListAnimator.AEQbTJ();
        boolean z = list2.size() >= 20;
        StrategyPendingListResp strategyPendingListResp2 = (StrategyPendingListResp) CollectionsKt___CollectionsKt.wlaJM(list2);
        return new ActionBar(z, strategyPendingListResp2 == null ? strategyPendingListResp2.getAlgoId() : null, list2);
    }

    public final java.lang.String OLrzqt(BacktestFilter backtestFilter) {
        int i = Application.EZpvd[backtestFilter.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return DebugCoroutineInfoImplKt.RUNNING;
        }
        if (i == 3) {
            return "DONE";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o.uJy$TaskDescription */
    public static final class TaskDescription {
        public final BacktestFilter EZpvd;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, BacktestFilter backtestFilter, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                backtestFilter = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                str = taskDescription.KWHzl;
            }
            return taskDescription.copydefault(backtestFilter, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BacktestFilter KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@NotNull BacktestFilter backtestFilter, java.lang.String str) {
            Intrinsics.checkNotNullParameter(backtestFilter, "");
            return new TaskDescription(backtestFilter, str);
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
            return this.EZpvd == taskDescription.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            java.lang.String str = this.KWHzl;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(filter=" + this.EZpvd + ", lastShownAlgoId=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull BacktestFilter backtestFilter, java.lang.String str) {
            Intrinsics.checkNotNullParameter(backtestFilter, "");
            this.EZpvd = backtestFilter;
            this.KWHzl = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter:0x0004: SGET  A[WRAPPED] (LINE:72) com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter.ALL com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter) : (r1v0 com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter, java.lang.String):void (m)] (LINE:71) call: o.uJy.TaskDescription.<init>(com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter, java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(BacktestFilter backtestFilter, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BacktestFilter.ALL : backtestFilter, (i & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: o.uJy$ActionBar */
    public static final class ActionBar {
        public final boolean EZpvd;
        public final java.lang.String KWHzl;
        public final java.util.List<BizTradeStrategyInfo> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uJy$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                str = actionBar.KWHzl;
            }
            if ((i & 4) != 0) {
                list = actionBar.copydefault;
            }
            return actionBar.KWHzl(z, str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<BizTradeStrategyInfo> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(boolean z, java.lang.String str, @NotNull java.util.List<? extends BizTradeStrategyInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(z, str, list);
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
            return this.EZpvd == actionBar.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
            java.lang.String str = this.KWHzl;
            return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(hasMore=" + this.EZpvd + ", lastShownAlgoId=" + this.KWHzl + ", backtests=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(boolean z, java.lang.String str, @NotNull java.util.List<? extends BizTradeStrategyInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = z;
            this.KWHzl = str;
            this.copydefault = list;
        }
    }
}
