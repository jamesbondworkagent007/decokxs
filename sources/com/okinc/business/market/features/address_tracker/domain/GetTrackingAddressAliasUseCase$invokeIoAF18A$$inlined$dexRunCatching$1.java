package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25653jBj;
import o.C28586kda;
import o.C56391yDq;
import o.C56442yFn;
import o.jAH;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.GetTrackingAddressAliasUseCase$invoke-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class GetTrackingAddressAliasUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends TrackingAddressAlias>>>, Object> {
    int label;
    final /* synthetic */ jAH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrackingAddressAliasUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, jAH jah) {
        super(2, continuation);
        this.this$0 = jah;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetTrackingAddressAliasUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends TrackingAddressAlias>>> continuation) {
        return ((GetTrackingAddressAliasUseCase$invokeIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
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
            C28586kda c28586kda = this.this$0.KWHzl;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objCopydefault);
                objM7377constructorimpl = Result.m7377constructorimpl(objCopydefault);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        String strEZpvd = ((DexUserIdentity) objOLrzqt).EZpvd();
        C25653jBj c25653jBj = this.this$0.OLrzqt;
        this.label = 2;
        objCopydefault = c25653jBj.copydefault(strEZpvd, this);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        C56391yDq.AEQbTJ(objCopydefault);
        objM7377constructorimpl = Result.m7377constructorimpl(objCopydefault);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
