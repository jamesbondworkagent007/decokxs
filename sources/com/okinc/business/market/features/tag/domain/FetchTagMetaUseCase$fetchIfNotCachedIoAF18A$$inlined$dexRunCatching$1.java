package com.okinc.business.market.features.tag.domain;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29709kyk;
import o.C29710kyl;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.tag.domain.FetchTagMetaUseCase$fetchIfNotCached-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class FetchTagMetaUseCase$fetchIfNotCachedIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    int label;
    final /* synthetic */ C29709kyk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchTagMetaUseCase$fetchIfNotCachedIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, C29709kyk c29709kyk) {
        super(2, continuation);
        this.this$0 = c29709kyk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchTagMetaUseCase$fetchIfNotCachedIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((FetchTagMetaUseCase$fetchIfNotCachedIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objKWHzl;
        Unit unit;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            C29710kyl c29710kyl = this.this$0.KWHzl;
            this.label = 1;
            objKWHzl = c29710kyl.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            objKWHzl = C56443yFo.KWHzl(true);
        }
        if (!((Boolean) objKWHzl).booleanValue()) {
            unit = Unit.INSTANCE;
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        C29710kyl c29710kyl2 = this.this$0.KWHzl;
        this.label = 2;
        if (c29710kyl2.copydefault(this) == objCopydefault) {
            return objCopydefault;
        }
        unit = Unit.INSTANCE;
        objM7377constructorimpl = Result.m7377constructorimpl(unit);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
