package com.okinc.tradingbot.impl.strategy.viewmodel;

import com.okinc.tradingbot.impl.order.strategy.data.BotStopType;
import com.okinc.tradingbot.impl.strategy.viewmodel.StopBotPresenter;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C43422row;
import o.C50056vAg;
import o.C56391yDq;
import o.C56442yFn;
import o.wTZ;

/* JADX INFO: loaded from: classes11.dex */
public final class StopBotPresenter$trigger$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopBotPresenter.StateListAnimator $action;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StopBotPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBotPresenter$trigger$1(StopBotPresenter stopBotPresenter, StopBotPresenter.StateListAnimator stateListAnimator, Continuation<? super StopBotPresenter$trigger$1> continuation) {
        super(2, continuation);
        this.this$0 = stopBotPresenter;
        this.$action = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StopBotPresenter$trigger$1 stopBotPresenter$trigger$1 = new StopBotPresenter$trigger$1(this.this$0, this.$action, continuation);
        stopBotPresenter$trigger$1.L$0 = obj;
        return stopBotPresenter$trigger$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StopBotPresenter$trigger$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        StopBotPresenter stopBotPresenter;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            stopBotPresenter = this.this$0;
            StopBotPresenter.StateListAnimator stateListAnimator = this.$action;
            Result.Application application2 = Result.Companion;
            wTZ wtz = stopBotPresenter.djBIcL;
            wTZ.Application application3 = new wTZ.Application(((StopBotPresenter.StateListAnimator.Application) stateListAnimator).KWHzl());
            this.L$0 = stopBotPresenter;
            this.label = 1;
            obj = wtz.KWHzl(application3, this);
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
                StopBotPresenter stopBotPresenter2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableSharedFlow mutableSharedFlow = stopBotPresenter2.OLrzqt;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = C43422row.OLrzqt();
                    }
                    StopBotPresenter.ActionBar.Application application4 = new StopBotPresenter.ActionBar.Application(message);
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableSharedFlow.emit(application4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            stopBotPresenter = (StopBotPresenter) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Map<BotStopType, C50056vAg> mapAEQbTJ = ((wTZ.TaskDescription) obj).AEQbTJ();
        this.L$0 = null;
        this.label = 2;
        if (stopBotPresenter.EZpvd(mapAEQbTJ, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        StopBotPresenter stopBotPresenter22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
