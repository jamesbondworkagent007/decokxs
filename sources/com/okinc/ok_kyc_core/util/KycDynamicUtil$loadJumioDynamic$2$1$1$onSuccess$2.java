package com.okinc.ok_kyc_core.util;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import o.C42467rTy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class KycDynamicUtil$loadJumioDynamic$2$1$1$onSuccess$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Continuation<Boolean> $continuation;
    Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KycDynamicUtil$loadJumioDynamic$2$1$1$onSuccess$2(Continuation<? super Boolean> continuation, Continuation<? super KycDynamicUtil$loadJumioDynamic$2$1$1$onSuccess$2> continuation2) {
        super(2, continuation2);
        this.$continuation = continuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KycDynamicUtil$loadJumioDynamic$2$1$1$onSuccess$2(this.$continuation, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KycDynamicUtil$loadJumioDynamic$2$1$1$onSuccess$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutexAubY;
        Continuation<Boolean> continuation;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            mutexAubY = C42467rTy.KWHzl.AubY();
            Continuation<Boolean> continuation2 = this.$continuation;
            this.L$0 = mutexAubY;
            this.L$1 = continuation2;
            this.label = 1;
            if (mutexAubY.lock(null, this) == objCopydefault) {
                return objCopydefault;
            }
            continuation = continuation2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            continuation = (Continuation) this.L$1;
            mutexAubY = (Mutex) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            if (!c42467rTy.uzCIH()) {
                try {
                    c42467rTy.fARcdN(true);
                    Result.Application application = Result.Companion;
                    continuation.resumeWith(Result.m7377constructorimpl(C56443yFo.KWHzl(true)));
                    c42467rTy.UeEOUB();
                } catch (Exception e) {
                    pUU.copydefault("qjf", "KycDynamicUtil-loadJumioDynamic exception: " + e.getMessage());
                }
            }
            return Unit.INSTANCE;
        } finally {
            mutexAubY.unlock(null);
        }
    }
}
