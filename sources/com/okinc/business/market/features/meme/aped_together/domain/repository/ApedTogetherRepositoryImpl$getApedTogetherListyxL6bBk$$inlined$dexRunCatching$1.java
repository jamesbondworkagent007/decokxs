package com.okinc.business.market.features.meme.aped_together.domain.repository;

import com.okinc.business.market.features.meme.aped_together.domain.model.ApedTogetherResponseData;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28659keu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23229huL;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.meme.aped_together.domain.repository.ApedTogetherRepositoryImpl$getApedTogetherList-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class ApedTogetherRepositoryImpl$getApedTogetherListyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ApedTogetherResponseData>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ int $pageSize$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ C28659keu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApedTogetherRepositoryImpl$getApedTogetherListyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, C28659keu c28659keu, String str, String str2, String str3, int i) {
        super(2, continuation);
        this.this$0 = c28659keu;
        this.$chainId$inlined = str;
        this.$walletAddress$inlined = str2;
        this.$tokenContractAddress$inlined = str3;
        this.$pageSize$inlined = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ApedTogetherRepositoryImpl$getApedTogetherListyxL6bBk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$walletAddress$inlined, this.$tokenContractAddress$inlined, this.$pageSize$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ApedTogetherResponseData>> continuation) {
        return ((ApedTogetherRepositoryImpl$getApedTogetherListyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC23229huL interfaceC23229huLEZpvd = this.this$0.EZpvd();
                String str = this.$chainId$inlined;
                String str2 = this.$walletAddress$inlined;
                String str3 = this.$tokenContractAddress$inlined;
                int i2 = this.$pageSize$inlined;
                this.label = 1;
                obj = interfaceC23229huLEZpvd.KWHzl(str, str2, str3, i2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Object data = ((ResponseData) obj).getData();
            Intrinsics.copydefault(data);
            objM7377constructorimpl = Result.m7377constructorimpl(data);
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
