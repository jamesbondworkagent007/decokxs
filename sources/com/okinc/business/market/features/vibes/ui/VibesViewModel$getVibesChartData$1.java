package com.okinc.business.market.features.vibes.ui;

import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27746kBv;
import o.kAO;
import o.kAV;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesViewModel$getVibesChartData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ VibesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesViewModel$getVibesChartData$1(VibesViewModel vibesViewModel, Continuation<? super VibesViewModel$getVibesChartData$1> continuation) {
        super(2, continuation);
        this.this$0 = vibesViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VibesViewModel$getVibesChartData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VibesViewModel$getVibesChartData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault.setValue(InterfaceC27746kBv.Application.KWHzl);
            kAO kao = this.this$0.ejfBZ;
            long jKWHzl = this.this$0.KWHzl().KWHzl();
            String strCopydefault = this.this$0.KWHzl().copydefault();
            VibesTimeRange vibesTimeRangeCopydefault = this.this$0.OLrzqt().getValue().copydefault();
            this.label = 1;
            objKWHzl = kao.KWHzl(String.valueOf(jKWHzl), strCopydefault, vibesTimeRangeCopydefault, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        VibesViewModel vibesViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            vibesViewModel.copydefault.setValue(new InterfaceC27746kBv.ActionBar((kAV) objKWHzl));
        }
        VibesViewModel vibesViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            vibesViewModel2.copydefault.setValue(InterfaceC27746kBv.TaskDescription.AEQbTJ);
        }
        return Unit.INSTANCE;
    }
}
