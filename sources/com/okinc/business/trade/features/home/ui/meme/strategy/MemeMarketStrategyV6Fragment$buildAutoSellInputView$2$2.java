package com.okinc.business.trade.features.home.ui.meme.strategy;

import com.okinc.business.dex.tee.common.viewmodel.TradeAutoSellViewModel;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeMarketStrategyV6Fragment$buildAutoSellInputView$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MemeMarketStrategyV6Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeMarketStrategyV6Fragment$buildAutoSellInputView$2$2(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, Continuation<? super MemeMarketStrategyV6Fragment$buildAutoSellInputView$2$2> continuation) {
        super(2, continuation);
        this.this$0 = memeMarketStrategyV6Fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeMarketStrategyV6Fragment$buildAutoSellInputView$2$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeMarketStrategyV6Fragment$buildAutoSellInputView$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment2 = this.this$0;
            TradeAutoSellViewModel tradeAutoSellViewModelEjfBZ = memeMarketStrategyV6Fragment2.ejfBZ();
            this.L$0 = memeMarketStrategyV6Fragment2;
            this.label = 1;
            Object objKWHzl = tradeAutoSellViewModelEjfBZ.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            memeMarketStrategyV6Fragment = memeMarketStrategyV6Fragment2;
            obj = objKWHzl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            memeMarketStrategyV6Fragment = (MemeMarketStrategyV6Fragment) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        memeMarketStrategyV6Fragment.AEQbTJ((List<? extends AdvancedAutoSellStrategy>) obj);
        return Unit.INSTANCE;
    }
}
