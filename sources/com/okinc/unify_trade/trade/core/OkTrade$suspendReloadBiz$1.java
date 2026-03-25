package com.okinc.unify_trade.trade.core;

import com.okinc.base.uploadlog.UpLoadLogException;
import java.util.HashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import me.relex.circleindicator.SnackbarBehavior;
import o.AbstractC54531xLw;
import o.AbstractC54575xNl;
import o.C54582xNs;
import o.C56391yDq;
import o.C56442yFn;
import o.C6777aVl;
import o.pUU;

/* JADX INFO: loaded from: classes12.dex */
public final class OkTrade$suspendReloadBiz$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bizType;
    int label;
    final /* synthetic */ C54582xNs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkTrade$suspendReloadBiz$1(C54582xNs c54582xNs, String str, Continuation<? super OkTrade$suspendReloadBiz$1> continuation) {
        super(2, continuation);
        this.this$0 = c54582xNs;
        this.$bizType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkTrade$suspendReloadBiz$1(this.this$0, this.$bizType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OkTrade$suspendReloadBiz$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) ((HashMap) C54582xNs.copydefault(new Object[]{this.this$0}, SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), -919921477, 919921478)).get(this.$bizType);
            pUU.KWHzl("TradeInstrumentTask-OkTrade", "----->> reloadBiz");
            if (abstractC54531xLw != null) {
                this.label = 1;
                objEZpvd = abstractC54531xLw.EZpvd(true, (Continuation<? super Result<? extends AbstractC54531xLw>>) this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objEZpvd = ((Result) obj).m7386unboximpl();
        C54582xNs c54582xNs = this.this$0;
        String str = this.$bizType;
        pUU.KWHzl("TradeInstrumentTask-OkTrade", "----->> reloadBiz notifyChange");
        if (!Result.m7384isSuccessimpl(objEZpvd)) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
            taskDescription.EZpvd(new UpLoadLogException("OKTradeReloadBiz:" + (thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null)));
        } else {
            for (AbstractC54575xNl abstractC54575xNl : C54582xNs.OLrzqt(c54582xNs)) {
                if (Intrinsics.EZpvd((Object) abstractC54575xNl.copydefault(), (Object) str)) {
                    abstractC54575xNl.OLrzqt();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
