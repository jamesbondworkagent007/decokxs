package com.okinc.kline.ui.trade;

import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C39678pwq;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes8.dex */
public final class TradeHeaderKlineFragment$startRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C39678pwq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeHeaderKlineFragment$startRefresh$1(C39678pwq c39678pwq, Continuation<? super TradeHeaderKlineFragment$startRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = c39678pwq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeHeaderKlineFragment$startRefresh$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeHeaderKlineFragment$startRefresh$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8790ensureInitialize0E7RQCE$default;
        C39678pwq c39678pwq;
        MarketCoinInfo marketCoinInfo;
        C39678pwq c39678pwq2;
        AbstractC54531xLw abstractC54531xLw;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            this.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c39678pwq2 = (C39678pwq) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC54531xLw = (AbstractC54531xLw) obj;
                if (abstractC54531xLw != null) {
                    c39678pwq2.OLrzqt = abstractC54531xLw;
                    c39678pwq2.isConnected();
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default) && (marketCoinInfo = (c39678pwq = this.this$0).zsXlph) != null) {
            if (Result.m7383isFailureimpl(objM8790ensureInitialize0E7RQCE$default)) {
                objM8790ensureInitialize0E7RQCE$default = null;
            }
            InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) objM8790ensureInitialize0E7RQCE$default;
            if (interfaceC54581xNr != null) {
                String instrumentType = marketCoinInfo.getInstrumentType();
                this.L$0 = c39678pwq;
                this.label = 2;
                obj = interfaceC54581xNr.EZpvd(instrumentType, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                c39678pwq2 = c39678pwq;
                abstractC54531xLw = (AbstractC54531xLw) obj;
                if (abstractC54531xLw != null) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
