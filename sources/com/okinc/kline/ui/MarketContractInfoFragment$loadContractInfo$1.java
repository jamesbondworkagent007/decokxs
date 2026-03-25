package com.okinc.kline.ui;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C37941pGj;
import o.C38743pfG;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketContractInfoFragment$loadContractInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C38743pfG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketContractInfoFragment$loadContractInfo$1(C38743pfG c38743pfG, Continuation<? super MarketContractInfoFragment$loadContractInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = c38743pfG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketContractInfoFragment$loadContractInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketContractInfoFragment$loadContractInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8790ensureInitialize0E7RQCE$default;
        MarketCoinInfo marketCoinInfo;
        String instrumentType;
        BizInstrument suggestedInstrument$default;
        InterfaceC54581xNr interfaceC54581xNrDjBIcL;
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
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default) && (marketCoinInfo = this.this$0.values) != null && (instrumentType = marketCoinInfo.getInstrumentType()) != null) {
            C38743pfG c38743pfG = this.this$0;
            InterfaceC54581xNr interfaceC54581xNrDjBIcL2 = c38743pfG.djBIcL();
            if (interfaceC54581xNrDjBIcL2 != null) {
                MarketCoinInfo marketCoinInfo2 = c38743pfG.values;
                suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrDjBIcL2, instrumentType, marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentId() : null, null, null, 12, null);
            } else {
                suggestedInstrument$default = null;
            }
            String strEZpvd = Intrinsics.EZpvd((Object) instrumentType, (Object) "SPOT") ? C37941pGj.EZpvd(suggestedInstrument$default) : instrumentType;
            if (!Intrinsics.EZpvd((Object) strEZpvd, (Object) instrumentType) && (interfaceC54581xNrDjBIcL = c38743pfG.djBIcL()) != null) {
                MarketCoinInfo marketCoinInfo3 = c38743pfG.values;
                BizInstrument suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrDjBIcL, strEZpvd, marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentId() : null, null, null, 12, null);
                if (suggestedInstrument$default2 != null) {
                    suggestedInstrument$default = suggestedInstrument$default2;
                }
            }
            if (suggestedInstrument$default != null) {
                this.label = 2;
                if (c38743pfG.EZpvd(suggestedInstrument$default, strEZpvd, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
