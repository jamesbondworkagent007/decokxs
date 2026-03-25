package com.okinc.business.market.features.holders.ui.detail;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jAK;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailsViewModel$reloadSelectedFollow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HolderDetailsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderDetailsViewModel$reloadSelectedFollow$1(HolderDetailsViewModel holderDetailsViewModel, Continuation<? super HolderDetailsViewModel$reloadSelectedFollow$1> continuation) {
        super(2, continuation);
        this.this$0 = holderDetailsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HolderDetailsViewModel$reloadSelectedFollow$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HolderDetailsViewModel$reloadSelectedFollow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jAK jak = this.this$0.DbNXlk;
            String strKWHzl = this.this$0.EZpvd().KWHzl();
            this.label = 1;
            objCopydefault = jak.copydefault(strKWHzl, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        List list = (List) objCopydefault;
        if (list != null) {
            this.this$0.KWHzl.setValue(list);
        }
        return Unit.INSTANCE;
    }
}
