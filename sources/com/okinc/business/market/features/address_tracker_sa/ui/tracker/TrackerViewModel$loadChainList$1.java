package com.okinc.business.market.features.address_tracker_sa.ui.tracker;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25750jEz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerViewModel$loadChainList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TrackerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerViewModel$loadChainList$1(TrackerViewModel trackerViewModel, Continuation<? super TrackerViewModel$loadChainList$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerViewModel$loadChainList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerViewModel$loadChainList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TrackerViewModel trackerViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TrackerViewModel trackerViewModel2 = this.this$0;
            C25750jEz c25750jEz = trackerViewModel2.sSMYrx;
            this.L$0 = trackerViewModel2;
            this.label = 1;
            Object objKWHzl = c25750jEz.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            trackerViewModel = trackerViewModel2;
            obj = objKWHzl;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trackerViewModel = (TrackerViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        trackerViewModel.fetchVPNInfo = (List) obj;
        return Unit.INSTANCE;
    }
}
