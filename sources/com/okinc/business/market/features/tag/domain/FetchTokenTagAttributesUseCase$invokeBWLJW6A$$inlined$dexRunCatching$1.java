package com.okinc.business.market.features.tag.domain;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C29713kyo;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29685kyM;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.tag.domain.FetchTokenTagAttributesUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class FetchTokenTagAttributesUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InterfaceC29685kyM.ActionBar>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ boolean $fetchStaticTags$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    int label;
    final /* synthetic */ C29713kyo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchTokenTagAttributesUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, boolean z, C29713kyo c29713kyo, String str, String str2) {
        super(2, continuation);
        this.$fetchStaticTags$inlined = z;
        this.this$0 = c29713kyo;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchTokenTagAttributesUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.$fetchStaticTags$inlined, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InterfaceC29685kyM.ActionBar>> continuation) {
        return ((FetchTokenTagAttributesUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                FetchTokenTagAttributesUseCase$invoke$2$1 fetchTokenTagAttributesUseCase$invoke$2$1 = new FetchTokenTagAttributesUseCase$invoke$2$1(this.$fetchStaticTags$inlined, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined, null);
                this.label = 1;
                obj = CoroutineScopeKt.coroutineScope(fetchTokenTagAttributesUseCase$invoke$2$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(obj);
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
