package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.AggregateHeaderData;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23689iFr;
import o.C23722iGx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBL;

/* JADX INFO: loaded from: classes6.dex */
public final class AggregateHeaderUseCaseImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AggregateHeaderData>>, Object> {
    final /* synthetic */ C23722iGx $query;
    int label;
    final /* synthetic */ C23689iFr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregateHeaderUseCaseImpl$invoke$2(C23689iFr c23689iFr, C23722iGx c23722iGx, Continuation<? super AggregateHeaderUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c23689iFr;
        this.$query = c23722iGx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AggregateHeaderUseCaseImpl$invoke$2(this.this$0, this.$query, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AggregateHeaderData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<AggregateHeaderData>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<AggregateHeaderData>> continuation) {
        return ((AggregateHeaderUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C23689iFr c23689iFr = this.this$0;
                C23722iGx c23722iGx = this.$query;
                Result.Application application = Result.Companion;
                String strCopydefault = c23689iFr.KWHzl.copydefault();
                InterfaceC25472ixP interfaceC25472ixPOLrzqt = c23689iFr.AEQbTJ.OLrzqt();
                int iEZpvd = c23722iGx.EZpvd();
                String strAEQbTJ = c23722iGx.AEQbTJ();
                String strKWHzl = c23722iGx.KWHzl();
                this.label = 1;
                obj = interfaceC25472ixPOLrzqt.KWHzl(iEZpvd, strAEQbTJ, strKWHzl, strCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default);
            objM7377constructorimpl = Result.m7377constructorimpl((AggregateHeaderData) objUnwrapResponseData$default);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
