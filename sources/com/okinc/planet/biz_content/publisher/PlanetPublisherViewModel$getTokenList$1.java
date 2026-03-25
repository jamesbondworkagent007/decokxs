package com.okinc.planet.biz_content.publisher;

import com.okinc.network.okg.cache.CacheStrategy;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46353tRe;
import o.C47793twn;
import o.C47802tww;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetPublisherViewModel$getTokenList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C47793twn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetPublisherViewModel$getTokenList$1(C47793twn c47793twn, Continuation<? super PlanetPublisherViewModel$getTokenList$1> continuation) {
        super(2, continuation);
        this.this$0 = c47793twn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetPublisherViewModel$getTokenList$1 planetPublisherViewModel$getTokenList$1 = new PlanetPublisherViewModel$getTokenList$1(this.this$0, continuation);
        planetPublisherViewModel$getTokenList$1.L$0 = obj;
        return planetPublisherViewModel$getTokenList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetPublisherViewModel$getTokenList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C47793twn c47793twn = this.this$0;
            Result.Application application2 = Result.Companion;
            C46353tRe c46353tRe = c47793twn.fZBcTu;
            CacheStrategy cacheStrategy = CacheStrategy.ONLY_CACHE;
            this.label = 1;
            obj = c46353tRe.KWHzl(cacheStrategy, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.fFgQHt();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl((Pair) obj);
        Pair pairOLrzqt = C56390yDp.OLrzqt(yDY.AhwBna(), C56443yFo.KWHzl(false));
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = pairOLrzqt;
        }
        C47802tww c47802tww = new C47802tww((List) ((Pair) objM7377constructorimpl).getFirst(), false, false);
        this.this$0.DTwDnp.setValue(c47802tww);
        this.this$0.QKVWgx.tryEmit(c47802tww);
        C47793twn c47793twn2 = this.this$0;
        this.label = 2;
        if (c47793twn2.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        this.this$0.fFgQHt();
        return Unit.INSTANCE;
    }
}
