package com.okinc.tradingbot.impl.strategy.view.helper;

import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.uCJ;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOperatorViewModel$fetchAiBotRecreateConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    final /* synthetic */ boolean $isBacktest;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BotOperatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotOperatorViewModel$fetchAiBotRecreateConfig$1(BotOperatorViewModel botOperatorViewModel, String str, boolean z, Continuation<? super BotOperatorViewModel$fetchAiBotRecreateConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = botOperatorViewModel;
        this.$algoId = str;
        this.$isBacktest = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotOperatorViewModel$fetchAiBotRecreateConfig$1 botOperatorViewModel$fetchAiBotRecreateConfig$1 = new BotOperatorViewModel$fetchAiBotRecreateConfig$1(this.this$0, this.$algoId, this.$isBacktest, continuation);
        botOperatorViewModel$fetchAiBotRecreateConfig$1.L$0 = obj;
        return botOperatorViewModel$fetchAiBotRecreateConfig$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotOperatorViewModel$fetchAiBotRecreateConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                BotOperatorViewModel botOperatorViewModel = this.this$0;
                String str = this.$algoId;
                boolean z = this.$isBacktest;
                Result.Application application = Result.Companion;
                uCJ ucj = botOperatorViewModel.gEmmrt;
                uCJ.TaskDescription taskDescription = new uCJ.TaskDescription(str, z);
                this.label = 1;
                obj = ucj.KWHzl(taskDescription, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((uCJ.StateListAnimator) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        BotOperatorViewModel botOperatorViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            botOperatorViewModel2.KWHzl.tryEmit(new BotOperatorViewModel.ActionBar.TaskDescription((uCJ.StateListAnimator) objM7377constructorimpl));
        }
        BotOperatorViewModel botOperatorViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            MutableSharedFlow mutableSharedFlow = botOperatorViewModel3.KWHzl;
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mutableSharedFlow.tryEmit(new BotOperatorViewModel.ActionBar.StateListAnimator(message));
        }
        return Unit.INSTANCE;
    }
}
