package com.okinc.business.market.features.floatwindow.ui;

import com.okinc.business.market.features.floatwindow.ui.FloatWindowViewModel$subscribePnl$1$1;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C28434kah;
import o.C56391yDq;
import o.C56442yFn;
import o.jWO;

/* JADX INFO: loaded from: classes7.dex */
public final class FloatWindowViewModel$subscribePnl$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ jWO.Activity $currentState;
    int label;
    final /* synthetic */ FloatWindowViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatWindowViewModel$subscribePnl$1$1(FloatWindowViewModel floatWindowViewModel, jWO.Activity activity, Continuation<? super FloatWindowViewModel$subscribePnl$1$1> continuation) {
        super(2, continuation);
        this.this$0 = floatWindowViewModel;
        this.$currentState = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FloatWindowViewModel$subscribePnl$1$1(this.this$0, this.$currentState, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FloatWindowViewModel$subscribePnl$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28434kah c28434kah = this.this$0.EZpvd;
            List<HoldingAsset> listCopydefault = this.$currentState.copydefault();
            final FloatWindowViewModel floatWindowViewModel = this.this$0;
            Function0<Unit> function0 = new Function0() { // from class: o.jWS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return FloatWindowViewModel$subscribePnl$1$1.invokeSuspend$lambda$0(floatWindowViewModel);
                }
            };
            this.label = 1;
            obj = c28434kah.AEQbTJ(listCopydefault, function0, this);
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
            C56391yDq.AEQbTJ(obj);
        }
        final FloatWindowViewModel floatWindowViewModel2 = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.floatwindow.ui.FloatWindowViewModel$subscribePnl$1$1.1
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<HoldingAsset> list, Continuation<? super Unit> continuation) {
                floatWindowViewModel2.OLrzqt.setValue(new jWO.Activity(floatWindowViewModel2.KWHzl(list), 0L, false, 6, null));
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(FloatWindowViewModel floatWindowViewModel) {
        floatWindowViewModel.EZpvd.copydefault();
        floatWindowViewModel.copydefault(false, true);
        return Unit.INSTANCE;
    }
}
