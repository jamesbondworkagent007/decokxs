package com.okinc.dexkline.market.features.position.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32389mcE;
import o.xHC;

/* JADX INFO: loaded from: classes8.dex */
public final class PositionsViewModel$onTokenPriceChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $tokenPrice;
    Object L$0;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$onTokenPriceChange$1(PositionsViewModel positionsViewModel, String str, Continuation<? super PositionsViewModel$onTokenPriceChange$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsViewModel;
        this.$tokenPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsViewModel$onTokenPriceChange$1(this.this$0, this.$tokenPrice, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsViewModel$onTokenPriceChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PositionsViewModel positionsViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            positionsViewModel = this.this$0;
            InterfaceC32389mcE interfaceC32389mcEDbNXlk = positionsViewModel.DbNXlk();
            xHC.ActionBar actionBar = this.this$0.values;
            String str = this.$tokenPrice;
            this.L$0 = positionsViewModel;
            this.label = 1;
            obj = interfaceC32389mcEDbNXlk.EZpvd(actionBar, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            positionsViewModel = (PositionsViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        positionsViewModel.values = (xHC.ActionBar) obj;
        PositionsViewModel positionsViewModel2 = this.this$0;
        positionsViewModel2.copydefault(positionsViewModel2.values);
        PositionsViewModel positionsViewModel3 = this.this$0;
        this.L$0 = null;
        this.label = 2;
        if (positionsViewModel3.AEQbTJ(this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
