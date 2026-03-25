package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse;
import com.okinc.business.invest_biz.data.bean.request.InvestTokenDetailsReq;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iGE;

/* JADX INFO: loaded from: classes6.dex */
public final class TokenInvestDetailUseCaseImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TokenInvestDetailResponse>>, Object> {
    final /* synthetic */ List<String> $ids;
    int label;
    final /* synthetic */ iGE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenInvestDetailUseCaseImpl$invoke$2(iGE ige, List<String> list, Continuation<? super TokenInvestDetailUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = ige;
        this.$ids = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenInvestDetailUseCaseImpl$invoke$2(this.this$0, this.$ids, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TokenInvestDetailResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<TokenInvestDetailResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<TokenInvestDetailResponse>> continuation) {
        return ((TokenInvestDetailUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                iGE ige = this.this$0;
                List<String> list = this.$ids;
                Result.Application application = Result.Companion;
                InterfaceC25472ixP interfaceC25472ixPOLrzqt = ige.EZpvd.OLrzqt();
                InvestTokenDetailsReq investTokenDetailsReq = new InvestTokenDetailsReq(list);
                this.label = 1;
                obj = InterfaceC25472ixP.getTokenInvestDetail$default(interfaceC25472ixPOLrzqt, null, investTokenDetailsReq, this, 1, null);
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
            objM7377constructorimpl = Result.m7377constructorimpl((TokenInvestDetailResponse) objUnwrapResponseData$default);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
