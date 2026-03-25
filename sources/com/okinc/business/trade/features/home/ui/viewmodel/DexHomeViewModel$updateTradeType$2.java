package com.okinc.business.trade.features.home.ui.viewmodel;

import com.okinc.business.trade.features.home.domain.model.TradingType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28242kUd;
import o.C28258kUt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class DexHomeViewModel$updateTradeType$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needCache;
    final /* synthetic */ TradingType $tradingType;
    Object L$0;
    int label;
    final /* synthetic */ DexHomeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexHomeViewModel$updateTradeType$2(DexHomeViewModel dexHomeViewModel, TradingType tradingType, boolean z, Continuation<? super DexHomeViewModel$updateTradeType$2> continuation) {
        super(2, continuation);
        this.this$0 = dexHomeViewModel;
        this.$tradingType = tradingType;
        this.$needCache = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexHomeViewModel$updateTradeType$2(this.this$0, this.$tradingType, this.$needCache, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexHomeViewModel$updateTradeType$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        DexHomeViewModel dexHomeViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DexHomeViewModel dexHomeViewModel2 = this.this$0;
            C28258kUt c28258kUt = dexHomeViewModel2.AkhnZx;
            this.L$0 = dexHomeViewModel2;
            this.label = 1;
            Object objAEQbTJ = c28258kUt.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            dexHomeViewModel = dexHomeViewModel2;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dexHomeViewModel = (DexHomeViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        dexHomeViewModel.KWHzl((C28242kUd) obj);
        this.this$0.AEQbTJ(this.$tradingType, this.$needCache);
        return Unit.INSTANCE;
    }
}
