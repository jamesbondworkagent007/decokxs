package com.okinc.business.dex.tee.swap.limit.ui.viewmodel;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.kUH;

/* JADX INFO: loaded from: classes5.dex */
public final class SwapLimitHomeViewModel$loadSupportListInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SwapLimitHomeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwapLimitHomeViewModel$loadSupportListInfo$1(SwapLimitHomeViewModel swapLimitHomeViewModel, Continuation<? super SwapLimitHomeViewModel$loadSupportListInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = swapLimitHomeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwapLimitHomeViewModel$loadSupportListInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwapLimitHomeViewModel$loadSupportListInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kUH kuh = this.this$0.copydefault;
            ChainBizType chainBizType = ChainBizType.Limit;
            this.label = 1;
            obj = kuh.EZpvd(chainBizType, this);
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
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                SwapLimitHomeViewModel swapLimitHomeViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    MutableSharedFlow mutableSharedFlow = swapLimitHomeViewModel.OLrzqt;
                    Boolean boolKWHzl = C56443yFo.KWHzl(true);
                    this.L$0 = abstractC43419rot;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        SwapLimitHomeViewModel swapLimitHomeViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            swapLimitHomeViewModel2.EZpvd.setValue(list);
            swapLimitHomeViewModel2.copydefault((List<DefiChainInfo>) list);
            MutableSharedFlow mutableSharedFlow2 = swapLimitHomeViewModel2.OLrzqt;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
            this.L$0 = abstractC43419rot;
            this.label = 2;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        SwapLimitHomeViewModel swapLimitHomeViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
