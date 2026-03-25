package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25973jNf;
import o.C56391yDq;
import o.C56442yFn;
import o.jMI;

/* JADX INFO: loaded from: classes18.dex */
public final class SpotAnalysisPnlDetailFragment$setListener$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $it;
    int label;
    final /* synthetic */ jMI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailFragment$setListener$1$1$1$1(jMI jmi, boolean z, Continuation<? super SpotAnalysisPnlDetailFragment$setListener$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = jmi;
        this.$it = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisPnlDetailFragment$setListener$1$1$1$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailFragment$setListener$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jMI jmi = this.this$0;
            SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModelAhwBna = jmi.AhwBna();
            this.label = 1;
            obj = jmi.AEQbTJ(spotAnalysisPnlDetailViewModelAhwBna, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((C25973jNf) obj).EZpvd(this.$it);
                this.this$0.gEmmrt();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        ((C25973jNf) obj).KWHzl(this.$it);
        jMI jmi2 = this.this$0;
        SpotAnalysisPnlDetailViewModel spotAnalysisPnlDetailViewModelAhwBna2 = jmi2.AhwBna();
        this.label = 2;
        obj = jmi2.AEQbTJ(spotAnalysisPnlDetailViewModelAhwBna2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        ((C25973jNf) obj).EZpvd(this.$it);
        this.this$0.gEmmrt();
        return Unit.INSTANCE;
    }
}
