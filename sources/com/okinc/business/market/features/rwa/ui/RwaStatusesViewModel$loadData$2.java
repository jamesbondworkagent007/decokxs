package com.okinc.business.market.features.rwa.ui;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29162koT;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29168koZ;

/* JADX INFO: loaded from: classes7.dex */
public final class RwaStatusesViewModel$loadData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $rwaPlatformId;
    int label;
    final /* synthetic */ RwaStatusesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RwaStatusesViewModel$loadData$2(RwaStatusesViewModel rwaStatusesViewModel, String str, Continuation<? super RwaStatusesViewModel$loadData$2> continuation) {
        super(2, continuation);
        this.this$0 = rwaStatusesViewModel;
        this.$rwaPlatformId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RwaStatusesViewModel$loadData$2(this.this$0, this.$rwaPlatformId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RwaStatusesViewModel$loadData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object value;
        Object value2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29162koT c29162koT = this.this$0.AEQbTJ;
            String str = this.$rwaPlatformId;
            this.label = 1;
            objOLrzqt = c29162koT.OLrzqt(str, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        RwaStatusesViewModel rwaStatusesViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            List list = (List) objOLrzqt;
            MutableStateFlow mutableStateFlow = rwaStatusesViewModel.OLrzqt;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, new InterfaceC29168koZ.Application(list)));
        }
        RwaStatusesViewModel rwaStatusesViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
            MutableStateFlow mutableStateFlow2 = rwaStatusesViewModel2.OLrzqt;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, InterfaceC29168koZ.StateListAnimator.copydefault));
        }
        return Unit.INSTANCE;
    }
}
