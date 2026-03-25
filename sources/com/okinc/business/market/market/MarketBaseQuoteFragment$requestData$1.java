package com.okinc.business.market.market;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.AbstractC27806kEY;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.pWO;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketBaseQuoteFragment$requestData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC27806kEY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketBaseQuoteFragment$requestData$1(AbstractC27806kEY abstractC27806kEY, Continuation<? super MarketBaseQuoteFragment$requestData$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC27806kEY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketBaseQuoteFragment$requestData$1 marketBaseQuoteFragment$requestData$1 = new MarketBaseQuoteFragment$requestData$1(this.this$0, continuation);
        marketBaseQuoteFragment$requestData$1.L$0 = obj;
        return marketBaseQuoteFragment$requestData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketBaseQuoteFragment$requestData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, this, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope2;
            objM7386unboximpl = objM8790ensureInitialize0E7RQCE$default;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) objM7386unboximpl;
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            if (interfaceC54581xNr != null) {
                this.this$0.copydefault(interfaceC54581xNr);
            } else {
                this.this$0.fIwbmz();
            }
        }
        return Unit.INSTANCE;
    }
}
