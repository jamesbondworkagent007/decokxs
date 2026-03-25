package com.okinc.business.market.features.meme.ui;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28693kfb;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePumpUseCase$getBlackListed$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ boolean $forceLoad$inlined;
    Object L$0;
    int label;
    final /* synthetic */ MemePumpUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemePumpUseCase$getBlackListed$$inlined$dexRunCatching$1(Continuation continuation, MemePumpUseCase memePumpUseCase, boolean z) {
        super(2, continuation);
        this.this$0 = memePumpUseCase;
        this.$forceLoad$inlined = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemePumpUseCase$getBlackListed$$inlined$dexRunCatching$1(continuation, this.this$0, this.$forceLoad$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((MemePumpUseCase$getBlackListed$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        MemePumpUseCase memePumpUseCase;
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
            if (this.this$0.AhwBna.isEmpty() || this.$forceLoad$inlined) {
                MemePumpUseCase memePumpUseCase2 = this.this$0;
                InterfaceC28693kfb interfaceC28693kfb = memePumpUseCase2.AkhnZx;
                this.L$0 = memePumpUseCase2;
                this.label = 1;
                Object objEZpvd = interfaceC28693kfb.EZpvd(this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                memePumpUseCase = memePumpUseCase2;
                obj = objEZpvd;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        memePumpUseCase = (MemePumpUseCase) this.L$0;
        C56391yDq.AEQbTJ(obj);
        memePumpUseCase.AhwBna = (List) obj;
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
