package com.okinc.business.invest_biz.ui.screens.univ3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25480ixX;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeActivity$resetBottomContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$resetBottomContent$1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Continuation<? super InvestUniv3SubscribeActivity$resetBottomContent$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$resetBottomContent$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$resetBottomContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<C25480ixX> mutableStateFlowAwvSrB = this.this$0.isConnected().AwvSrB();
            C25480ixX value = this.this$0.isConnected().AwvSrB().getValue();
            C25480ixX c25480ixXEZpvd = value.EZpvd((6095 & 1) != 0 ? value.OLrzqt : "0", (6095 & 2) != 0 ? value.EZpvd : null, (6095 & 4) != 0 ? value.KWHzl : null, (6095 & 8) != 0 ? value.AEQbTJ : "0", (6095 & 16) != 0 ? value.valueOf : false, (6095 & 32) != 0 ? value.AYXKKw : false, (6095 & 64) != 0 ? value.AhwBna : false, (6095 & 128) != 0 ? value.gEmmrt : false, (6095 & 256) != 0 ? value.djBIcL : false, (6095 & 512) != 0 ? value.values : null, (6095 & 1024) != 0 ? value.fetchVPNInfo : 0, (6095 & 2048) != 0 ? value.AkhnZx : null, (6095 & 4096) != 0 ? value.copydefault : false);
            this.label = 1;
            if (mutableStateFlowAwvSrB.emit(c25480ixXEZpvd, this) == objCopydefault) {
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
        }
        MutableStateFlow<C25480ixX> mutableStateFlowZuBGHE = this.this$0.isConnected().zuBGHE();
        C25480ixX value2 = this.this$0.isConnected().zuBGHE().getValue();
        C25480ixX c25480ixXEZpvd2 = value2.EZpvd((6095 & 1) != 0 ? value2.OLrzqt : "0", (6095 & 2) != 0 ? value2.EZpvd : null, (6095 & 4) != 0 ? value2.KWHzl : null, (6095 & 8) != 0 ? value2.AEQbTJ : "0", (6095 & 16) != 0 ? value2.valueOf : false, (6095 & 32) != 0 ? value2.AYXKKw : false, (6095 & 64) != 0 ? value2.AhwBna : false, (6095 & 128) != 0 ? value2.gEmmrt : false, (6095 & 256) != 0 ? value2.djBIcL : false, (6095 & 512) != 0 ? value2.values : null, (6095 & 1024) != 0 ? value2.fetchVPNInfo : 0, (6095 & 2048) != 0 ? value2.AkhnZx : null, (6095 & 4096) != 0 ? value2.copydefault : false);
        this.label = 2;
        if (mutableStateFlowZuBGHE.emit(c25480ixXEZpvd2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
