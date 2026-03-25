package com.okinc.unify_trade.core.ws;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.DexAssetsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC55660xoD;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.xFD;
import o.xHF;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeDexAssetsWsTask$loadDexAssets$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ xFD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeDexAssetsWsTask$loadDexAssets$1(xFD xfd, Continuation<? super TradeDexAssetsWsTask$loadDexAssets$1> continuation) {
        super(2, continuation);
        this.this$0 = xfd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeDexAssetsWsTask$loadDexAssets$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeDexAssetsWsTask$loadDexAssets$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                xHF xhfDbNXlk = this.this$0.DbNXlk();
                AbstractC55660xoD abstractC55660xoD = this.this$0.copydefault;
                Integer numAEQbTJ = C56443yFo.AEQbTJ((abstractC55660xoD == null || !abstractC55660xoD.OLrzqt()) ? 0 : 1);
                Integer numAEQbTJ2 = C56443yFo.AEQbTJ(0);
                AbstractC55660xoD abstractC55660xoD2 = this.this$0.copydefault;
                Integer numAEQbTJ3 = C56443yFo.AEQbTJ(abstractC55660xoD2 != null ? abstractC55660xoD2.copydefault() : 200);
                this.label = 1;
                objAEQbTJ = xhfDbNXlk.AEQbTJ(numAEQbTJ, numAEQbTJ2, numAEQbTJ3, null, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
            }
            ResponseData responseData = (ResponseData) objAEQbTJ;
            if (this.this$0.copydefault == null) {
                return Unit.INSTANCE;
            }
            this.this$0.EZpvd((ResponseData<List<DexAssetsResponse>>) responseData);
            return Unit.INSTANCE;
        } catch (Exception e) {
            pUU.copydefault("TradeDexAssetsWsTask", String.valueOf(e.getMessage()));
            AbstractC55660xoD abstractC55660xoD3 = this.this$0.copydefault;
            if (abstractC55660xoD3 != null) {
                abstractC55660xoD3.AEQbTJ(new DexAssetsResponse(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null), "http", C56443yFo.KWHzl(false));
            }
            return Unit.INSTANCE;
        }
    }
}
