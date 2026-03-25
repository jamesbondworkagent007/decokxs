package com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase;

import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressSourceResponse;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C25750jEz;
import o.C56391yDq;
import o.C56442yFn;
import o.jEA;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker_sa.ui.tracker.usecase.TrackerUseCase$getAddressSourceList-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class TrackerUseCase$getAddressSourceListgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TrackerAddressSourceResponse>>, Object> {
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ C25750jEz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerUseCase$getAddressSourceListgIAlus$$inlined$dexRunCatching$1(Continuation continuation, C25750jEz c25750jEz, String str) {
        super(2, continuation);
        this.this$0 = c25750jEz;
        this.$walletAddress$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerUseCase$getAddressSourceListgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$walletAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TrackerAddressSourceResponse>> continuation) {
        return ((TrackerUseCase$getAddressSourceListgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                jEA jea = this.this$0.KWHzl;
                String str = this.$walletAddress$inlined;
                this.label = 1;
                obj = jea.KWHzl(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
