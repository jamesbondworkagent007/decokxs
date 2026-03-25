package com.okinc.business.trade.features.home.meme.viewmodel.v6;

import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6ApproveExecutionUseCase;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketStrategyV6ViewModel$getApproveState$1;
import com.okinc.business.trade.features.home.ui.meme.statepool.CheckStep;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC28352kYf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeMarketStrategyV6ViewModel$getApproveState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MemeV6ApproveExecutionUseCase.ApproveStateCheckParams $params;
    final /* synthetic */ TradeStatePool $tradeStatePool;
    int label;
    final /* synthetic */ AbstractC28352kYf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeMarketStrategyV6ViewModel$getApproveState$1(AbstractC28352kYf abstractC28352kYf, MemeV6ApproveExecutionUseCase.ApproveStateCheckParams approveStateCheckParams, TradeStatePool tradeStatePool, Continuation<? super MemeMarketStrategyV6ViewModel$getApproveState$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC28352kYf;
        this.$params = approveStateCheckParams;
        this.$tradeStatePool = tradeStatePool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeMarketStrategyV6ViewModel$getApproveState$1(this.this$0, this.$params, this.$tradeStatePool, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeMarketStrategyV6ViewModel$getApproveState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MemeV6ApproveExecutionUseCase memeV6ApproveExecutionUseCaseDvKsVJ = this.this$0.dvKsVJ();
            MemeV6ApproveExecutionUseCase.ApproveStateCheckParams approveStateCheckParams = this.$params;
            final AbstractC28352kYf abstractC28352kYf = this.this$0;
            final TradeStatePool tradeStatePool = this.$tradeStatePool;
            Function1<? super ApproveStatusGroup, Unit> function1 = new Function1() { // from class: o.kYu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MemeMarketStrategyV6ViewModel$getApproveState$1.invokeSuspend$lambda$0(abstractC28352kYf, tradeStatePool, (ApproveStatusGroup) obj2);
                }
            };
            this.label = 1;
            if (memeV6ApproveExecutionUseCaseDvKsVJ.OLrzqt(approveStateCheckParams, function1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AbstractC28352kYf abstractC28352kYf, TradeStatePool tradeStatePool, ApproveStatusGroup approveStatusGroup) {
        abstractC28352kYf.djSkpj.setValue(Boolean.valueOf(approveStatusGroup.getApproveStatus() == ApproveStatus.APPROVED_NEED_CANCEL_APPROVE));
        if (approveStatusGroup.getApproveStatus() == ApproveStatus.APPROVE_AND_SWAP) {
            if (!abstractC28352kYf.RlQdEF) {
                abstractC28352kYf.RlQdEF = true;
                abstractC28352kYf.copydefault(false);
            } else {
                tradeStatePool.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_SUCCESS, false, true));
            }
        } else if (abstractC28352kYf.RlQdEF) {
            abstractC28352kYf.RlQdEF = false;
            abstractC28352kYf.copydefault(false);
        }
        return Unit.INSTANCE;
    }
}
