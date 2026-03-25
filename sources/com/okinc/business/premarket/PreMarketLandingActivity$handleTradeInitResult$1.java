package com.okinc.business.premarket;

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

/* JADX INFO: loaded from: classes7.dex */
public final class PreMarketLandingActivity$handleTradeInitResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $success;
    final /* synthetic */ InterfaceC54581xNr $trade;
    Object L$0;
    int label;
    final /* synthetic */ PreMarketLandingActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreMarketLandingActivity$handleTradeInitResult$1(boolean z, InterfaceC54581xNr interfaceC54581xNr, PreMarketLandingActivity preMarketLandingActivity, Continuation<? super PreMarketLandingActivity$handleTradeInitResult$1> continuation) {
        super(2, continuation);
        this.$success = z;
        this.$trade = interfaceC54581xNr;
        this.this$0 = preMarketLandingActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreMarketLandingActivity$handleTradeInitResult$1(this.$success, this.$trade, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PreMarketLandingActivity$handleTradeInitResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC54581xNr interfaceC54581xNr;
        AbstractC54531xLw abstractC54531xLw;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$success && (interfaceC54581xNr = this.$trade) != null) {
                this.label = 1;
                obj = interfaceC54581xNr.EZpvd("FUTURES", this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC54531xLw = (AbstractC54531xLw) this.L$0;
            C56391yDq.AEQbTJ(obj);
            AbstractC54531xLw abstractC54531xLw2 = (AbstractC54531xLw) obj;
            if (abstractC54531xLw != null || abstractC54531xLw2 == null) {
                pUU.copydefault(this.this$0.getTAG(), "biz init fail");
            }
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        AbstractC54531xLw abstractC54531xLw3 = (AbstractC54531xLw) obj;
        InterfaceC54581xNr interfaceC54581xNr2 = this.$trade;
        this.L$0 = abstractC54531xLw3;
        this.label = 2;
        Object objEZpvd = interfaceC54581xNr2.EZpvd("SWAP", this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        abstractC54531xLw = abstractC54531xLw3;
        obj = objEZpvd;
        AbstractC54531xLw abstractC54531xLw22 = (AbstractC54531xLw) obj;
        if (abstractC54531xLw != null) {
            pUU.copydefault(this.this$0.getTAG(), "biz init fail");
        }
        return Unit.INSTANCE;
    }
}
