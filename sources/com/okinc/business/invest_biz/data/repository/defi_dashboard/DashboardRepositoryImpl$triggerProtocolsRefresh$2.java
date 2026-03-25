package com.okinc.business.invest_biz.data.repository.defi_dashboard;

import com.okinc.business.invest_biz.data.bean.PlatformRefreshResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iDM;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardRepositoryImpl$triggerProtocolsRefresh$2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ iDM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardRepositoryImpl$triggerProtocolsRefresh$2(iDM idm, Continuation<? super DashboardRepositoryImpl$triggerProtocolsRefresh$2> continuation) {
        super(1, continuation);
        this.this$0 = idm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DashboardRepositoryImpl$triggerProtocolsRefresh$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((DashboardRepositoryImpl$triggerProtocolsRefresh$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.OLrzqt.OLrzqt();
            String strAEQbTJ = this.this$0.AEQbTJ();
            this.label = 1;
            obj = InterfaceC25472ixP.triggerDashboardRefresh$default(interfaceC25472ixPOLrzqt, null, strAEQbTJ, this, 1, null);
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
        return C56443yFo.KWHzl(((PlatformRefreshResponse) objUnwrapResponseData$default).getRateLimited());
    }
}
