package com.okinc.business.market.features.position.repo;

import com.okinc.business.market.data.constant.Sort;
import com.okinc.business.market.data.model.position_pnl.PnLTransactionResponse;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C29139knx;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class PnLTransactionRepositoryImpl$load$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<PnLTransactionResponse>>, Object> {
    final /* synthetic */ boolean $isDescOrder;
    final /* synthetic */ long $lastGlobalIndex;
    final /* synthetic */ TokenFilter $tokenFilter;
    int label;
    final /* synthetic */ C29139knx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PnLTransactionRepositoryImpl$load$2(TokenFilter tokenFilter, long j, boolean z, C29139knx c29139knx, Continuation<? super PnLTransactionRepositoryImpl$load$2> continuation) {
        super(1, continuation);
        this.$tokenFilter = tokenFilter;
        this.$lastGlobalIndex = j;
        this.$isDescOrder = z;
        this.this$0 = c29139knx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PnLTransactionRepositoryImpl$load$2(this.$tokenFilter, this.$lastGlobalIndex, this.$isDescOrder, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<PnLTransactionResponse>> continuation) {
        return ((PnLTransactionRepositoryImpl$load$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HashMap<String, String> map = new HashMap<>();
            map.put("chainId", this.$tokenFilter.KWHzl());
            String str = (String) CollectionsKt___CollectionsKt.firstOrNull(this.$tokenFilter.OLrzqt());
            if (str == null) {
                str = "";
            }
            map.put("walletAddress", str);
            map.put("tokenContractAddress", this.$tokenFilter.isConnected());
            map.put(OtcExtraKeys.TYPES, this.$tokenFilter.DbNXlk());
            long j = this.$lastGlobalIndex;
            if (j != -1) {
                map.put("lastGlobalIndex", C33129mqd.gEmmrt(C56443yFo.KWHzl(j)));
            }
            map.put("pageSize", "20");
            map.put("sort", (this.$isDescOrder ? Sort.DESC : Sort.ASC).getValue());
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.KWHzl;
            this.label = 1;
            obj = interfaceC27595jyE.valueOf(map, (Continuation<? super ResponseData<PnLTransactionResponse>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
