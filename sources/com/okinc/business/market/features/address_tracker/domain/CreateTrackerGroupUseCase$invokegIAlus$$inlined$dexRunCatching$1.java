package com.okinc.business.market.features.address_tracker.domain;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25645jBb;
import o.InterfaceC25651jBh;
import o.InterfaceC26243jXf;
import o.jAE;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.CreateTrackerGroupUseCase$invoke-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class CreateTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InterfaceC26243jXf>>, Object> {
    final /* synthetic */ String $groupName$inlined;
    int label;
    final /* synthetic */ jAE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1(Continuation continuation, jAE jae, String str) {
        super(2, continuation);
        this.this$0 = jae;
        this.$groupName$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$groupName$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InterfaceC26243jXf>> continuation) {
        return ((CreateTrackerGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
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
            kKG kkg = this.this$0.KWHzl;
            this.label = 1;
            obj = kkg.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(this.this$0.AEQbTJ.AEQbTJ((InterfaceC25645jBb) obj));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        String strCopydefault = this.this$0.KWHzl.copydefault();
        InterfaceC25651jBh interfaceC25651jBh = this.this$0.EZpvd;
        String str = this.$groupName$inlined;
        this.label = 2;
        obj = interfaceC25651jBh.AEQbTJ((String) obj, strCopydefault, str, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(this.this$0.AEQbTJ.AEQbTJ((InterfaceC25645jBb) obj));
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
