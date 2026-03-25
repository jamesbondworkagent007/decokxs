package com.okinc.business.invest_biz.data.repository.defi_dashboard;

import com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailReq;
import com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailWarpReq;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23589iBz;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iDM;
import o.iEC;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardRepositoryImpl$getTokenListDetail$2 extends SuspendLambda implements Function1<Continuation<? super iEC>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ List<DashboardTokenDetailReq> $investmentInfos;
    int label;
    final /* synthetic */ iDM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardRepositoryImpl$getTokenListDetail$2(iDM idm, String str, List<DashboardTokenDetailReq> list, Continuation<? super DashboardRepositoryImpl$getTokenListDetail$2> continuation) {
        super(1, continuation);
        this.this$0 = idm;
        this.$accountId = str;
        this.$investmentInfos = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DashboardRepositoryImpl$getTokenListDetail$2(this.this$0, this.$accountId, this.$investmentInfos, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super iEC> continuation) {
        return ((DashboardRepositoryImpl$getTokenListDetail$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23589iBz interfaceC23589iBz = this.this$0.OLrzqt;
            String str = this.$accountId;
            this.label = 1;
            obj = interfaceC23589iBz.KWHzl(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                List list = (List) iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
                ProtocolDetailsResponse protocolDetailsResponse = list != null ? (ProtocolDetailsResponse) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
                Intrinsics.copydefault(protocolDetailsResponse);
                return this.this$0.AhwBna.KWHzl(protocolDetailsResponse);
            }
            C56391yDq.AEQbTJ(obj);
        }
        DashboardTokenDetailWarpReq dashboardTokenDetailWarpReq = new DashboardTokenDetailWarpReq(this.$accountId, this.$investmentInfos);
        this.label = 2;
        obj = InterfaceC25472ixP.getDashboardTokenDetail$default((InterfaceC25472ixP) obj, dashboardTokenDetailWarpReq, null, this, 2, null);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        List list2 = (List) iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        if (list2 != null) {
        }
        Intrinsics.copydefault(protocolDetailsResponse);
        return this.this$0.AhwBna.KWHzl(protocolDetailsResponse);
    }
}
