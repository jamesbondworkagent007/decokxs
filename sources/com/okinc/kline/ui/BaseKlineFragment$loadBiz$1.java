package com.okinc.kline.ui;

import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.oYA;

/* JADX INFO: loaded from: classes8.dex */
public final class BaseKlineFragment$loadBiz$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $result;
    Object L$0;
    int label;
    final /* synthetic */ oYA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKlineFragment$loadBiz$1(oYA oya, Object obj, Continuation<? super BaseKlineFragment$loadBiz$1> continuation) {
        super(2, continuation);
        this.this$0 = oya;
        this.$result = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKlineFragment$loadBiz$1(this.this$0, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKlineFragment$loadBiz$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        oYA oya;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketCoinInfo marketCoinInfoQbewEr = this.this$0.QbewEr();
            if (marketCoinInfoQbewEr != null) {
                oYA oya2 = this.this$0;
                Object obj2 = this.$result;
                if (Intrinsics.EZpvd((Object) marketCoinInfoQbewEr.getInstrumentType(), (Object) "formula")) {
                    if (oya2.uzCIH() != null) {
                        oya2.iRxXKY();
                    }
                } else {
                    if (Result.m7383isFailureimpl(obj2)) {
                        obj2 = null;
                    }
                    InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) obj2;
                    if (interfaceC54581xNr != null) {
                        String instrumentType = marketCoinInfoQbewEr.getInstrumentType();
                        this.L$0 = oya2;
                        this.label = 1;
                        obj = interfaceC54581xNr.EZpvd(instrumentType, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        oya = oya2;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oya = (oYA) this.L$0;
        C56391yDq.AEQbTJ(obj);
        AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) obj;
        if (abstractC54531xLw != null) {
            oya.copydefault(abstractC54531xLw);
        }
        return Unit.INSTANCE;
    }
}
