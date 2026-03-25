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
import o.uCI;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOperatorViewModel$editBacktestStrategyName$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $algoId;
    final /* synthetic */ String $name;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BotOperatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotOperatorViewModel$editBacktestStrategyName$1(BotOperatorViewModel botOperatorViewModel, String str, String str2, Continuation<? super BotOperatorViewModel$editBacktestStrategyName$1> continuation) {
        super(2, continuation);
        this.this$0 = botOperatorViewModel;
        this.$algoId = str;
        this.$name = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotOperatorViewModel$editBacktestStrategyName$1 botOperatorViewModel$editBacktestStrategyName$1 = new BotOperatorViewModel$editBacktestStrategyName$1(this.this$0, this.$algoId, this.$name, continuation);
        botOperatorViewModel$editBacktestStrategyName$1.L$0 = obj;
        return botOperatorViewModel$editBacktestStrategyName$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotOperatorViewModel$editBacktestStrategyName$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                String str2 = this.$name;
                Result.Application application = Result.Companion;
                uCI uci = botOperatorViewModel.OLrzqt;
                uCI.Application application2 = new uCI.Application(str, str2);
                this.label = 1;
                if (uci.KWHzl(application2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        BotOperatorViewModel botOperatorViewModel2 = this.this$0;
        String str3 = this.$algoId;
        String str4 = this.$name;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            botOperatorViewModel2.KWHzl.tryEmit(new BotOperatorViewModel.ActionBar.Application(str3, str4, str4.length() == 0));
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
