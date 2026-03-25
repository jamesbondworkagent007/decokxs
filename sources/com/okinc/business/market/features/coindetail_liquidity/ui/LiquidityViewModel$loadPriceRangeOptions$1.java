package com.okinc.business.market.features.coindetail_liquidity.ui;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jPQ;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityViewModel$loadPriceRangeOptions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LiquidityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiquidityViewModel$loadPriceRangeOptions$1(LiquidityViewModel liquidityViewModel, Continuation<? super LiquidityViewModel$loadPriceRangeOptions$1> continuation) {
        super(2, continuation);
        this.this$0 = liquidityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidityViewModel$loadPriceRangeOptions$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiquidityViewModel$loadPriceRangeOptions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jPQ jpq = this.this$0.valueOf;
            this.label = 1;
            objAEQbTJ = jpq.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        LiquidityViewModel liquidityViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            liquidityViewModel.OLrzqt.clear();
            liquidityViewModel.OLrzqt.addAll((List) objAEQbTJ);
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
