package com.okinc.unify_trade.trade.core;

import com.okinc.base.uploadlog.UpLoadLogException;
import java.util.HashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import me.relex.circleindicator.SnackbarBehavior;
import o.AbstractC54531xLw;
import o.AbstractC54575xNl;
import o.C54582xNs;
import o.C56391yDq;
import o.C56442yFn;
import o.C6777aVl;
import o.pUU;

/* JADX INFO: loaded from: classes12.dex */
public final class OkTrade$reloadBizForInstUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bizType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C54582xNs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkTrade$reloadBizForInstUpdate$1(C54582xNs c54582xNs, String str, Continuation<? super OkTrade$reloadBizForInstUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = c54582xNs;
        this.$bizType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OkTrade$reloadBizForInstUpdate$1 okTrade$reloadBizForInstUpdate$1 = new OkTrade$reloadBizForInstUpdate$1(this.this$0, this.$bizType, continuation);
        okTrade$reloadBizForInstUpdate$1.L$0 = obj;
        return okTrade$reloadBizForInstUpdate$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OkTrade$reloadBizForInstUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredAsync$default;
        Result result;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) ((HashMap) C54582xNs.copydefault(new Object[]{this.this$0}, SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), SnackbarBehavior.AEQbTJ(), -919921477, 919921478)).get(this.$bizType);
            pUU.KWHzl("TradeInstrumentTask-OkTrade", "----->> reloadBizForInstUpdate");
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OkTrade$reloadBizForInstUpdate$1$coinsDeferred$1(this.this$0, null), 3, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OkTrade$reloadBizForInstUpdate$1$bizInitDeferred$1(abstractC54531xLw, null), 3, null);
            this.L$0 = deferredAsync$default;
            this.label = 1;
            if (deferredAsync$default2.await(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                result = (Result) obj;
                if (result != null) {
                    C54582xNs c54582xNs = this.this$0;
                    String str = this.$bizType;
                    Object objM7386unboximpl = result.m7386unboximpl();
                    pUU.KWHzl("TradeInstrumentTask-OkTrade", "----->> reloadBizForInstUpdate notifyChange");
                    if (!Result.m7384isSuccessimpl(objM7386unboximpl)) {
                        C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                        taskDescription.EZpvd(new UpLoadLogException("OKTradeReloadBiz:" + (thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null)));
                    } else {
                        for (AbstractC54575xNl abstractC54575xNl : C54582xNs.OLrzqt(c54582xNs)) {
                            if (Intrinsics.EZpvd((Object) abstractC54575xNl.copydefault(), (Object) str)) {
                                abstractC54575xNl.OLrzqt();
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            deferredAsync$default = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        obj = deferredAsync$default.await(this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        result = (Result) obj;
        if (result != null) {
        }
        return Unit.INSTANCE;
    }
}
