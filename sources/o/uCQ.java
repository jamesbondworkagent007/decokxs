package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.domain.usecase.StopBacktestUseCase$execute$1;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.StrategyStopReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCQ extends vNH<TaskDescription, Unit> {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC50055vAf OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uCQ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = interfaceC50055vAf;
    }

    public static final class TaskDescription {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.OLrzqt;
            }
            return taskDescription.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((TaskDescription) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.vNH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull TaskDescription taskDescription, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        StopBacktestUseCase$execute$1 stopBacktestUseCase$execute$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof StopBacktestUseCase$execute$1) {
            stopBacktestUseCase$execute$1 = (StopBacktestUseCase$execute$1) continuation;
            int i = stopBacktestUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBacktestUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBacktestUseCase$execute$1 = new StopBacktestUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = stopBacktestUseCase$execute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = stopBacktestUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC50055vAf interfaceC50055vAf = this.OLrzqt;
                StrategyStopReq strategyStopReq = new StrategyStopReq(taskDescription.EZpvd(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (PlaceOrderCondition) null, (java.lang.String) null, 62, (DefaultConstructorMarker) null);
                stopBacktestUseCase$execute$1.label = 1;
                objCopydefault = interfaceC50055vAf.copydefault(strategyStopReq, stopBacktestUseCase$execute$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            ResponseData responseData = (ResponseData) objCopydefault;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        actionBar.AEQbTJ();
        return Unit.INSTANCE;
    }
}
