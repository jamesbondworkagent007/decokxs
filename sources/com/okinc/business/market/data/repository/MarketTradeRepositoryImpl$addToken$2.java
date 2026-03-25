package com.okinc.business.market.data.repository;

import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C27613jyW;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketTradeRepositoryImpl$addToken$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends DexMultiTokenInfoBean>>>, Object> {
    final /* synthetic */ DexMultiTokenDetailReq $params;
    int label;
    final /* synthetic */ C27613jyW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketTradeRepositoryImpl$addToken$2(C27613jyW c27613jyW, DexMultiTokenDetailReq dexMultiTokenDetailReq, Continuation<? super MarketTradeRepositoryImpl$addToken$2> continuation) {
        super(1, continuation);
        this.this$0 = c27613jyW;
        this.$params = dexMultiTokenDetailReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MarketTradeRepositoryImpl$addToken$2(this.this$0, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends DexMultiTokenInfoBean>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<DexMultiTokenInfoBean>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<DexMultiTokenInfoBean>>> continuation) {
        return ((MarketTradeRepositoryImpl$addToken$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.KWHzl;
            DexMultiTokenDetailReq dexMultiTokenDetailReq = this.$params;
            this.label = 1;
            obj = interfaceC23234huQ.AEQbTJ(dexMultiTokenDetailReq, this);
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
