package com.okinc.business.market.features.vibes.ui;

import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C27750kBz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesViewModel$onTimeRangeChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ VibesTimeRange $timeRange;
    int label;
    final /* synthetic */ VibesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesViewModel$onTimeRangeChange$1(VibesViewModel vibesViewModel, VibesTimeRange vibesTimeRange, Continuation<? super VibesViewModel$onTimeRangeChange$1> continuation) {
        super(2, continuation);
        this.this$0 = vibesViewModel;
        this.$timeRange = vibesTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VibesViewModel$onTimeRangeChange$1(this.this$0, this.$timeRange, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VibesViewModel$onTimeRangeChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            C27750kBz c27750kBzCopy$default = C27750kBz.copy$default((C27750kBz) this.this$0.OLrzqt.getValue(), this.$timeRange, 0, null, null, false, 30, null);
            this.label = 1;
            if (mutableStateFlow.emit(c27750kBzCopy$default, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        VibesViewModel vibesViewModel = this.this$0;
        long jKWHzl = vibesViewModel.KWHzl().KWHzl();
        vibesViewModel.AEQbTJ(String.valueOf(jKWHzl), this.this$0.KWHzl().copydefault(), this.this$0.OLrzqt().getValue().EZpvd(), this.$timeRange);
        VibesViewModel vibesViewModel2 = this.this$0;
        long jKWHzl2 = vibesViewModel2.KWHzl().KWHzl();
        vibesViewModel2.copydefault(String.valueOf(jKWHzl2), this.this$0.KWHzl().copydefault(), this.this$0.OLrzqt().getValue().KWHzl(), this.$timeRange);
        this.this$0.EZpvd();
        return Unit.INSTANCE;
    }
}
