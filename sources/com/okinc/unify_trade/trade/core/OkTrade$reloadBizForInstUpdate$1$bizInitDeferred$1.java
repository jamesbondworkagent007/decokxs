package com.okinc.unify_trade.trade.core;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes12.dex */
public final class OkTrade$reloadBizForInstUpdate$1$bizInitDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AbstractC54531xLw>>, Object> {
    final /* synthetic */ AbstractC54531xLw $biz;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkTrade$reloadBizForInstUpdate$1$bizInitDeferred$1(AbstractC54531xLw abstractC54531xLw, Continuation<? super OkTrade$reloadBizForInstUpdate$1$bizInitDeferred$1> continuation) {
        super(2, continuation);
        this.$biz = abstractC54531xLw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkTrade$reloadBizForInstUpdate$1$bizInitDeferred$1(this.$biz, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AbstractC54531xLw>> continuation) {
        return ((OkTrade$reloadBizForInstUpdate$1$bizInitDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC54531xLw abstractC54531xLw = this.$biz;
            if (abstractC54531xLw == null) {
                return null;
            }
            this.label = 1;
            objEZpvd = abstractC54531xLw.EZpvd(true, (Continuation<? super Result<? extends AbstractC54531xLw>>) this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objEZpvd);
    }
}
