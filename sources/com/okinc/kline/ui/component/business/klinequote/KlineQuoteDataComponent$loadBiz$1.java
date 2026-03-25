package com.okinc.kline.ui.component.business.klinequote;

import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineQuoteDataComponent$loadBiz$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSwitchCoin;
    final /* synthetic */ Object $result;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ KlineQuoteDataComponent this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineQuoteDataComponent$loadBiz$1(KlineQuoteDataComponent klineQuoteDataComponent, Object obj, boolean z, Continuation<? super KlineQuoteDataComponent$loadBiz$1> continuation) {
        super(2, continuation);
        this.this$0 = klineQuoteDataComponent;
        this.$result = obj;
        this.$isSwitchCoin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineQuoteDataComponent$loadBiz$1(this.this$0, this.$result, this.$isSwitchCoin, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineQuoteDataComponent$loadBiz$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        KlineQuoteDataComponent klineQuoteDataComponent;
        boolean z;
        AbstractC54531xLw abstractC54531xLw;
        KlineQuoteDataComponent klineQuoteDataComponent2;
        boolean z2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketCoinInfo marketCoinInfoHDKMBd = this.this$0.hDKMBd();
            if (marketCoinInfoHDKMBd != null) {
                klineQuoteDataComponent = this.this$0;
                Object obj2 = this.$result;
                z = this.$isSwitchCoin;
                abstractC54531xLw = null;
                if (Result.m7383isFailureimpl(obj2)) {
                    obj2 = null;
                }
                InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) obj2;
                if (interfaceC54581xNr != null) {
                    String instrumentType = marketCoinInfoHDKMBd.getInstrumentType();
                    this.L$0 = klineQuoteDataComponent;
                    this.L$1 = klineQuoteDataComponent;
                    this.Z$0 = z;
                    this.label = 1;
                    obj = interfaceC54581xNr.EZpvd(instrumentType, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    klineQuoteDataComponent2 = klineQuoteDataComponent;
                    z2 = z;
                } else {
                    klineQuoteDataComponent2 = klineQuoteDataComponent;
                    klineQuoteDataComponent.OLrzqt(abstractC54531xLw);
                    klineQuoteDataComponent2.values().fIwbmz().setValue(klineQuoteDataComponent2.AhwBna());
                    pUU.KWHzl("KlinePageInit", "finish loadBiz, got to next step");
                    klineQuoteDataComponent2.EZpvd(z);
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z2 = this.Z$0;
        klineQuoteDataComponent = (KlineQuoteDataComponent) this.L$1;
        klineQuoteDataComponent2 = (KlineQuoteDataComponent) this.L$0;
        C56391yDq.AEQbTJ(obj);
        abstractC54531xLw = (AbstractC54531xLw) obj;
        z = z2;
        klineQuoteDataComponent.OLrzqt(abstractC54531xLw);
        klineQuoteDataComponent2.values().fIwbmz().setValue(klineQuoteDataComponent2.AhwBna());
        pUU.KWHzl("KlinePageInit", "finish loadBiz, got to next step");
        klineQuoteDataComponent2.EZpvd(z);
        return Unit.INSTANCE;
    }
}
