package com.okinc.business.defi.wallet.home.more;

import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C18060fbK;
import o.C56391yDq;
import o.C56442yFn;
import o.fVJ;

/* JADX INFO: loaded from: classes5.dex */
public final class MoreFunctionViewModel$refreshAccountTeeStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $teeId;
    int label;
    final /* synthetic */ C18060fbK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreFunctionViewModel$refreshAccountTeeStatus$1(C18060fbK c18060fbK, String str, String str2, Continuation<? super MoreFunctionViewModel$refreshAccountTeeStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = c18060fbK;
        this.$accountId = str;
        this.$teeId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MoreFunctionViewModel$refreshAccountTeeStatus$1(this.this$0, this.$accountId, this.$teeId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MoreFunctionViewModel$refreshAccountTeeStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            fVJ fvj = this.this$0.AhwBna;
            String str = this.$accountId;
            String str2 = this.$teeId;
            this.label = 1;
            obj = fvj.AEQbTJ(str, str2, false, false, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        SingleTeeStatus singleTeeStatus = (SingleTeeStatus) obj;
        if (singleTeeStatus != null) {
            this.this$0.OLrzqt.setValue(singleTeeStatus);
        }
        return Unit.INSTANCE;
    }
}
