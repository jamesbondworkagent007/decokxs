package com.okinc.unify_trade.trade.core;

import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.relex.circleindicator.SnackbarBehavior;
import o.AbstractC54531xLw;
import o.C54582xNs;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes12.dex */
public final class OkTrade$loadBiz$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC54531xLw>, Object> {
    final /* synthetic */ String $bizType;
    int label;
    final /* synthetic */ C54582xNs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkTrade$loadBiz$3(C54582xNs c54582xNs, String str, Continuation<? super OkTrade$loadBiz$3> continuation) {
        super(2, continuation);
        this.this$0 = c54582xNs;
        this.$bizType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkTrade$loadBiz$3(this.this$0, this.$bizType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC54531xLw> continuation) {
        return ((OkTrade$loadBiz$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC54531xLw abstractC54531xLw;
        Object objM8789ensureInitializedgIAlus$OKTradeCore_trade_core$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                abstractC54531xLw = (AbstractC54531xLw) ((HashMap) C54582xNs.copydefault(new Object[]{this.this$0}, SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), -919921477, 919921478)).get(this.$bizType);
                if (abstractC54531xLw == null) {
                    return null;
                }
                if (!AbstractC54531xLw.isInitFun$default(abstractC54531xLw, false, 1, null)) {
                    this.label = 1;
                    objM8789ensureInitializedgIAlus$OKTradeCore_trade_core$default = AbstractC54531xLw.m8789ensureInitializedgIAlus$OKTradeCore_trade_core$default(abstractC54531xLw, false, this, 1, null);
                    if (objM8789ensureInitializedgIAlus$OKTradeCore_trade_core$default == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return abstractC54531xLw;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8789ensureInitializedgIAlus$OKTradeCore_trade_core$default = ((Result) obj).m7386unboximpl();
            C54582xNs.copydefault(this.this$0, this.$bizType);
            if (Result.m7383isFailureimpl(objM8789ensureInitializedgIAlus$OKTradeCore_trade_core$default)) {
                objM8789ensureInitializedgIAlus$OKTradeCore_trade_core$default = null;
            }
            abstractC54531xLw = (AbstractC54531xLw) objM8789ensureInitializedgIAlus$OKTradeCore_trade_core$default;
            return abstractC54531xLw;
        } catch (CancellationException unused) {
            pUU.KWHzl("okTrade-TradeInstrumentTask", this.$bizType + " loadBiz CancellationException");
            return null;
        } catch (Exception unused2) {
            pUU.KWHzl("okTrade-TradeInstrumentTask", this.$bizType + " loadBiz Exception");
            return null;
        }
    }
}
