package com.okinc.tradingbot.impl.strategy.fragment.detail;

import com.okinc.unify_trade.biz.CancelSpotDcaOrderBody;
import com.okinc.unify_trade.biz.StrategyResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C52674wUd;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;

/* JADX INFO: loaded from: classes11.dex */
public final class DcaOngoingViewModel$stopSpotManualOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    final /* synthetic */ String $ordId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DcaOngoingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcaOngoingViewModel$stopSpotManualOrder$1(DcaOngoingViewModel dcaOngoingViewModel, String str, String str2, Continuation<? super DcaOngoingViewModel$stopSpotManualOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = dcaOngoingViewModel;
        this.$algoId = str;
        this.$ordId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DcaOngoingViewModel$stopSpotManualOrder$1 dcaOngoingViewModel$stopSpotManualOrder$1 = new DcaOngoingViewModel$stopSpotManualOrder$1(this.this$0, this.$algoId, this.$ordId, continuation);
        dcaOngoingViewModel$stopSpotManualOrder$1.L$0 = obj;
        return dcaOngoingViewModel$stopSpotManualOrder$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DcaOngoingViewModel$stopSpotManualOrder$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        DcaOngoingViewModel dcaOngoingViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            dcaOngoingViewModel = this.this$0;
            String str = this.$algoId;
            String str2 = this.$ordId;
            Result.Application application2 = Result.Companion;
            C52674wUd c52674wUd = dcaOngoingViewModel.isConnected;
            CancelSpotDcaOrderBody cancelSpotDcaOrderBody = new CancelSpotDcaOrderBody(str, str2);
            this.L$0 = dcaOngoingViewModel;
            this.label = 1;
            obj = c52674wUd.KWHzl(cancelSpotDcaOrderBody, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                DcaOngoingViewModel dcaOngoingViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow = dcaOngoingViewModel2.AEQbTJ;
                    vNB.StateListAnimator stateListAnimator = new vNB.StateListAnimator(thM7380exceptionOrNullimpl);
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            dcaOngoingViewModel = (DcaOngoingViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow2 = dcaOngoingViewModel.AEQbTJ;
        vNB.TaskDescription taskDescription = new vNB.TaskDescription((StrategyResponse) obj);
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        DcaOngoingViewModel dcaOngoingViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
