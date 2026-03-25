package com.okinc.business.market.market.fragment;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import o.InterfaceC54581xNr;
import o.kGD;
import o.yHT;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class BaseOptionQuoteFragment$onVisible$1 extends AdaptedFunctionReference implements yHT<Boolean, InterfaceC54581xNr, Exception, Continuation<? super Unit>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseOptionQuoteFragment$onVisible$1(Object obj) {
        super(4, obj, kGD.class, "handleTradeResult", "handleTradeResult(ZLcom/okinc/unify_trade/trade/core/ITrade;Ljava/lang/Exception;)V", 4);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(Boolean bool, InterfaceC54581xNr interfaceC54581xNr, Exception exc, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), interfaceC54581xNr, exc, continuation);
    }

    public final Object invoke(boolean z, InterfaceC54581xNr interfaceC54581xNr, Exception exc, Continuation<? super Unit> continuation) {
        return kGD.copydefault((kGD) this.receiver, z, interfaceC54581xNr, exc, continuation);
    }
}
