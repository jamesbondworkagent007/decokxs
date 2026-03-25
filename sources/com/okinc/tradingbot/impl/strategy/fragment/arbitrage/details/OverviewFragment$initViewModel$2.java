package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import com.okinc.tradingbot.impl.dto.GridReinvestedProfitsQueryVO;
import com.okinc.tradingbot.impl.dto.GridWithdrawnProfitsQueryVO;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.vNB;

/* JADX INFO: loaded from: classes17.dex */
public final class OverviewFragment$initViewModel$2 extends SuspendLambda implements Function2<vNB<? extends OverviewViewModel.TaskDescription>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OverviewFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewFragment$initViewModel$2(OverviewFragment overviewFragment, Continuation<? super OverviewFragment$initViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = overviewFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OverviewFragment$initViewModel$2 overviewFragment$initViewModel$2 = new OverviewFragment$initViewModel$2(this.this$0, continuation);
        overviewFragment$initViewModel$2.L$0 = obj;
        return overviewFragment$initViewModel$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends OverviewViewModel.TaskDescription> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<OverviewViewModel.TaskDescription>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<OverviewViewModel.TaskDescription> vnb, Continuation<? super Unit> continuation) {
        return ((OverviewFragment$initViewModel$2) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OverviewViewModel.TaskDescription taskDescription = (OverviewViewModel.TaskDescription) ((vNB) this.L$0).KWHzl();
            Pair pairEZpvd = taskDescription != null ? taskDescription.EZpvd() : null;
            if (pairEZpvd != null) {
                this.this$0.EZpvd((Pair<? extends GridReinvestedProfitsQueryVO, ? extends GridWithdrawnProfitsQueryVO>) pairEZpvd);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
