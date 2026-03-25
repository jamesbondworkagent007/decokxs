package com.okinc.business.invest_biz.data.logic;

import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C25542iyg;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestmentsManager$initData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C25542iyg>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestmentsManager$initData$2(Continuation<? super InvestmentsManager$initData$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestmentsManager$initData$2 investmentsManager$initData$2 = new InvestmentsManager$initData$2(continuation);
        investmentsManager$initData$2.L$0 = obj;
        return investmentsManager$initData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C25542iyg> continuation) {
        return ((InvestmentsManager$initData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new InvestmentsManager$initData$2$recommend$1(null), 3, null);
            this.label = 1;
            obj = deferredAsync$default.await(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            ResponseData responseData = (ResponseData) objM7386unboximpl;
            return new C25542iyg(responseData != null ? (List) responseData.getData() : null);
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl == null) {
            throw new Exception("");
        }
        throw thM7380exceptionOrNullimpl;
    }
}
