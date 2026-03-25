package com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase;

import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityResponse;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerActivityWsParam;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import o.C25750jEz;
import o.C56391yDq;
import o.C56442yFn;
import o.jEA;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerUseCase$subscribeActivity$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends List<? extends TrackerActivityResponse>>>, Object> {
    final /* synthetic */ TrackerActivityWsParam $param;
    int label;
    final /* synthetic */ C25750jEz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerUseCase$subscribeActivity$2(C25750jEz c25750jEz, TrackerActivityWsParam trackerActivityWsParam, Continuation<? super TrackerUseCase$subscribeActivity$2> continuation) {
        super(2, continuation);
        this.this$0 = c25750jEz;
        this.$param = trackerActivityWsParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerUseCase$subscribeActivity$2(this.this$0, this.$param, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends List<? extends TrackerActivityResponse>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Flow<? extends List<TrackerActivityResponse>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Flow<? extends List<TrackerActivityResponse>>> continuation) {
        return ((TrackerUseCase$subscribeActivity$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jEA jea = this.this$0.KWHzl;
            TrackerActivityWsParam trackerActivityWsParam = this.$param;
            this.label = 1;
            obj = jea.AEQbTJ(trackerActivityWsParam, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
