package com.okinc.business.trade.features.home.ui.viewmodel;

import com.okinc.business.dexlogic.bean.CheckServiceOfflineBean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25626jAj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class DexHomeViewModel$checkSwapStopService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DexHomeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexHomeViewModel$checkSwapStopService$1(DexHomeViewModel dexHomeViewModel, Continuation<? super DexHomeViewModel$checkSwapStopService$1> continuation) {
        super(2, continuation);
        this.this$0 = dexHomeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexHomeViewModel$checkSwapStopService$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexHomeViewModel$checkSwapStopService$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25626jAj c25626jAj = this.this$0.fetchVPNInfo;
            this.label = 1;
            objAEQbTJ = c25626jAj.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        DexHomeViewModel dexHomeViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            dexHomeViewModel.valueOf.postValue(((CheckServiceOfflineBean) objAEQbTJ).isLimitRegion());
        }
        Result.m7380exceptionOrNullimpl(objAEQbTJ);
        return Unit.INSTANCE;
    }
}
