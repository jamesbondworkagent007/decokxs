package com.okinc.business.invest_biz.data.repository.defi_dashboard;

import com.okinc.business.invest_biz.data.bean.response.DashboardProtocolDetailsResponse;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolDetailsParams;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolParams;
import com.okinc.network.okg.response.ResponseData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.internal.ArrayListSerializer;
import o.C23663iEs;
import o.C24193iYi;
import o.C33489mxS;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iDM;
import o.iDV;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardRepositoryImpl$getBatchProtocolDetails$2 extends SuspendLambda implements Function1<Continuation<? super Map<String, ? extends iDV>>, Object> {
    final /* synthetic */ String $accountIdParam;
    final /* synthetic */ ProtocolDetailsParams $params;
    int label;
    final /* synthetic */ iDM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardRepositoryImpl$getBatchProtocolDetails$2(iDM idm, String str, ProtocolDetailsParams protocolDetailsParams, Continuation<? super DashboardRepositoryImpl$getBatchProtocolDetails$2> continuation) {
        super(1, continuation);
        this.this$0 = idm;
        this.$accountIdParam = str;
        this.$params = protocolDetailsParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DashboardRepositoryImpl$getBatchProtocolDetails$2(this.this$0, this.$accountIdParam, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Map<String, ? extends iDV>> continuation) {
        return invoke2((Continuation<? super Map<String, iDV>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Map<String, iDV>> continuation) {
        return ((DashboardRepositoryImpl$getBatchProtocolDetails$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.OLrzqt.OLrzqt();
            String str = this.$accountIdParam;
            String strKWHzl = C33489mxS.KWHzl.KWHzl(new ArrayListSerializer(ProtocolParams.Companion.serializer()), this.$params.OLrzqt());
            String strEZpvd = C24193iYi.OLrzqt.EZpvd();
            this.label = 1;
            obj = InterfaceC25472ixP.getProtocolDetails$default(interfaceC25472ixPOLrzqt, null, str, strKWHzl, strEZpvd, this, 1, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List<DashboardProtocolDetailsResponse> listAhwBna = (List) iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        iDM idm = this.this$0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listAhwBna, 10)), 16));
        for (DashboardProtocolDetailsResponse dashboardProtocolDetailsResponse : listAhwBna) {
            String strKWHzl2 = C23663iEs.KWHzl(dashboardProtocolDetailsResponse.OLrzqt(), dashboardProtocolDetailsResponse.copydefault());
            iDV idvEZpvd = idm.AYXKKw.EZpvd(dashboardProtocolDetailsResponse);
            idm.djBIcL.KWHzl(strKWHzl2, idvEZpvd);
            Pair pairOLrzqt = C56390yDp.OLrzqt(strKWHzl2, idvEZpvd);
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        return linkedHashMap;
    }
}
