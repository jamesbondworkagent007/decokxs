package com.okinc.business.invest_biz.data.usecase;

import com.okinc.business.invest_biz.data.bean.HomeTokensResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23580iBq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iFV;

/* JADX INFO: loaded from: classes6.dex */
public final class HomeV2TokensUseCaseImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends HomeTokensResponse>>, Object> {
    final /* synthetic */ boolean $isDashboard;
    int label;
    final /* synthetic */ iFV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeV2TokensUseCaseImpl$invoke$2(boolean z, iFV ifv, Continuation<? super HomeV2TokensUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
        this.$isDashboard = z;
        this.this$0 = ifv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeV2TokensUseCaseImpl$invoke$2(this.$isDashboard, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends HomeTokensResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<HomeTokensResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<HomeTokensResponse>> continuation) {
        return ((HomeV2TokensUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        HomeTokensResponse homeTokensResponse;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.$isDashboard;
                iFV ifv = this.this$0;
                Result.Application application = Result.Companion;
                C23580iBq c23580iBq = C23580iBq.AEQbTJ;
                String strCopydefault = c23580iBq.AhwBna() ? c23580iBq.copydefault() : "";
                if (z) {
                    InterfaceC25472ixP interfaceC25472ixPOLrzqt = ifv.copydefault.OLrzqt();
                    this.label = 1;
                    obj = InterfaceC25472ixP.getDashboardRecommendTokens$default(interfaceC25472ixPOLrzqt, null, strCopydefault, this, 1, null);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
                    Intrinsics.copydefault(objUnwrapResponseData$default);
                    homeTokensResponse = (HomeTokensResponse) objUnwrapResponseData$default;
                } else {
                    InterfaceC25472ixP interfaceC25472ixPOLrzqt2 = ifv.copydefault.OLrzqt();
                    this.label = 2;
                    obj = InterfaceC25472ixP.getHomeTokens$default(interfaceC25472ixPOLrzqt2, null, strCopydefault, this, 1, null);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
                    Intrinsics.copydefault(objUnwrapResponseData$default2);
                    homeTokensResponse = (HomeTokensResponse) objUnwrapResponseData$default2;
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                Object objUnwrapResponseData$default3 = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default3);
                homeTokensResponse = (HomeTokensResponse) objUnwrapResponseData$default3;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Object objUnwrapResponseData$default22 = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default22);
                homeTokensResponse = (HomeTokensResponse) objUnwrapResponseData$default22;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(homeTokensResponse);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
