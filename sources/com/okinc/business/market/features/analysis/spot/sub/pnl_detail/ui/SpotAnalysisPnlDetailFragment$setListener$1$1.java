package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C25973jNf;
import o.C56391yDq;
import o.C56442yFn;
import o.jMD;
import o.jMI;

/* JADX INFO: loaded from: classes18.dex */
public final class SpotAnalysisPnlDetailFragment$setListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jMI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisPnlDetailFragment$setListener$1$1(jMI jmi, Continuation<? super SpotAnalysisPnlDetailFragment$setListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = jmi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisPnlDetailFragment$setListener$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisPnlDetailFragment$setListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        boolean zAYXKKw = ((C25973jNf) obj).AYXKKw();
        final jMI jmi2 = this.this$0;
        new jMD(zAYXKKw, new Function1<Boolean, Unit>() { // from class: com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.SpotAnalysisPnlDetailFragment$setListener$1$1.3
            public final void KWHzl(boolean z) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(jmi2), null, null, new SpotAnalysisPnlDetailFragment$setListener$1$1$1$1(jmi2, z, null), 3, null);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Boolean bool) {
                KWHzl(bool.booleanValue());
                return Unit.INSTANCE;
            }
        }).show(this.this$0.getChildFragmentManager(), "HideSmallAssetBottomsheetFragment");
        return Unit.INSTANCE;
    }
}
