package com.okinc.dexkline.market.features.position.repo;

import com.okinc.dexkline.market.data.constant.Sort;
import com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionResponse;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C33129mqd;
import o.C34473ncj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC32260mVk;

/* JADX INFO: loaded from: classes8.dex */
public final class PnLTransactionRepositoryImpl$load$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<PnLTransactionResponse>>, Object> {
    final /* synthetic */ boolean $isDescOrder;
    final /* synthetic */ long $lastGlobalIndex;
    final /* synthetic */ TokenFilter $tokenFilter;
    int label;
    final /* synthetic */ C34473ncj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PnLTransactionRepositoryImpl$load$2(TokenFilter tokenFilter, long j, boolean z, C34473ncj c34473ncj, Continuation<? super PnLTransactionRepositoryImpl$load$2> continuation) {
        super(1, continuation);
        this.$tokenFilter = tokenFilter;
        this.$lastGlobalIndex = j;
        this.$isDescOrder = z;
        this.this$0 = c34473ncj;
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
            String str = (String) CollectionsKt___CollectionsKt.firstOrNull(this.$tokenFilter.EZpvd());
            if (str == null) {
                str = "";
            }
            map.put("walletAddress", str);
            map.put("tokenContractAddress", this.$tokenFilter.DbNXlk());
            map.put(OtcExtraKeys.TYPES, this.$tokenFilter.isConnected());
            long j = this.$lastGlobalIndex;
            if (j != -1) {
                map.put("lastGlobalIndex", C33129mqd.gEmmrt(C56443yFo.KWHzl(j)));
            }
            map.put("pageSize", "20");
            map.put("sort", (this.$isDescOrder ? Sort.DESC : Sort.ASC).getValue());
            InterfaceC32260mVk interfaceC32260mVk = this.this$0.AEQbTJ;
            this.label = 1;
            obj = interfaceC32260mVk.AEQbTJ(map, this);
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
