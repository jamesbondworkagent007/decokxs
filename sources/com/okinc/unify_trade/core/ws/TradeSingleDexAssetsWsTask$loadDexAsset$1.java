package com.okinc.unify_trade.core.ws;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.DexAssets;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC55738xpc;
import o.C54386xGm;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.xHF;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeSingleDexAssetsWsTask$loadDexAsset$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C54386xGm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeSingleDexAssetsWsTask$loadDexAsset$1(C54386xGm c54386xGm, Continuation<? super TradeSingleDexAssetsWsTask$loadDexAsset$1> continuation) {
        super(2, continuation);
        this.this$0 = c54386xGm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeSingleDexAssetsWsTask$loadDexAsset$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeSingleDexAssetsWsTask$loadDexAsset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strKWHzl;
        Object objAEQbTJ;
        String strOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                xHF xhfIsConnected = this.this$0.isConnected();
                AbstractC55738xpc abstractC55738xpc = this.this$0.djBIcL;
                String str = "";
                if (abstractC55738xpc == null || (strKWHzl = abstractC55738xpc.KWHzl()) == null) {
                    strKWHzl = "";
                }
                AbstractC55738xpc abstractC55738xpc2 = this.this$0.djBIcL;
                if (abstractC55738xpc2 != null && (strOLrzqt = abstractC55738xpc2.OLrzqt()) != null) {
                    str = strOLrzqt;
                }
                this.label = 1;
                objAEQbTJ = xhfIsConnected.AEQbTJ(strKWHzl, str, this);
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
            if (this.this$0.djBIcL == null) {
                return Unit.INSTANCE;
            }
            this.this$0.EZpvd((ResponseData<List<DexAssets>>) responseData);
            return Unit.INSTANCE;
        } catch (Exception e) {
            pUU.KWHzl("TradeSingleDexAssetsWsTask", String.valueOf(e.getMessage()));
            AbstractC55738xpc abstractC55738xpc3 = this.this$0.djBIcL;
            if (abstractC55738xpc3 != null) {
                abstractC55738xpc3.AEQbTJ(new DexAssets(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null), "http", C56443yFo.KWHzl(false));
            }
            return Unit.INSTANCE;
        }
    }
}
