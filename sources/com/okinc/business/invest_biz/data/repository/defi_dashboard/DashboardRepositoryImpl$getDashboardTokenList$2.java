package com.okinc.business.invest_biz.data.repository.defi_dashboard;

import com.okinc.business.invest_biz.data.bean.response.DashboardTokenListResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iDM;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardRepositoryImpl$getDashboardTokenList$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends DashboardTokenListResponse>>, Object> {
    final /* synthetic */ String $accountId;
    int label;
    final /* synthetic */ iDM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardRepositoryImpl$getDashboardTokenList$2(iDM idm, String str, Continuation<? super DashboardRepositoryImpl$getDashboardTokenList$2> continuation) {
        super(1, continuation);
        this.this$0 = idm;
        this.$accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DashboardRepositoryImpl$getDashboardTokenList$2(this.this$0, this.$accountId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends DashboardTokenListResponse>> continuation) {
        return invoke2((Continuation<? super List<DashboardTokenListResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<DashboardTokenListResponse>> continuation) {
        return ((DashboardRepositoryImpl$getDashboardTokenList$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.OLrzqt.OLrzqt();
            String str = this.$accountId;
            this.label = 1;
            obj = InterfaceC25472ixP.getDeFiDashboardTokenList$default(interfaceC25472ixPOLrzqt, null, str, this, 1, null);
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
        return objUnwrapResponseData$default;
    }
}
