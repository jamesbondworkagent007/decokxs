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
import o.uCN;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOperatorViewModel$fetchRerunBacktestConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BotOperatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotOperatorViewModel$fetchRerunBacktestConfig$1(BotOperatorViewModel botOperatorViewModel, String str, Continuation<? super BotOperatorViewModel$fetchRerunBacktestConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = botOperatorViewModel;
        this.$algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotOperatorViewModel$fetchRerunBacktestConfig$1 botOperatorViewModel$fetchRerunBacktestConfig$1 = new BotOperatorViewModel$fetchRerunBacktestConfig$1(this.this$0, this.$algoId, continuation);
        botOperatorViewModel$fetchRerunBacktestConfig$1.L$0 = obj;
        return botOperatorViewModel$fetchRerunBacktestConfig$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotOperatorViewModel$fetchRerunBacktestConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                Result.Application application = Result.Companion;
                uCN ucn = botOperatorViewModel.AhwBna;
                this.label = 1;
                obj = ucn.KWHzl(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((uCN.StateListAnimator) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        BotOperatorViewModel botOperatorViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            botOperatorViewModel2.KWHzl.tryEmit(new BotOperatorViewModel.ActionBar.C0676ActionBar((uCN.StateListAnimator) objM7377constructorimpl));
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
