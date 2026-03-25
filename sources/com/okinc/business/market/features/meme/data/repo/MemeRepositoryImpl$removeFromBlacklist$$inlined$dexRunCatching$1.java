package com.okinc.business.market.features.meme.data.repo;

import com.okinc.business.market.features.meme.filter.domain.MemeBlacklist;
import com.okinc.core.util.SPUtils;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28624keL;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeRepositoryImpl$removeFromBlacklist$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ MemeBlacklist $meme$inlined;
    int label;
    final /* synthetic */ C28624keL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeRepositoryImpl$removeFromBlacklist$$inlined$dexRunCatching$1(Continuation continuation, C28624keL c28624keL, MemeBlacklist memeBlacklist) {
        super(2, continuation);
        this.this$0 = c28624keL;
        this.$meme$inlined = memeBlacklist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeRepositoryImpl$removeFromBlacklist$$inlined$dexRunCatching$1(continuation, this.this$0, this.$meme$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((MemeRepositoryImpl$removeFromBlacklist$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                C28624keL c28624keL = this.this$0;
                this.label = 1;
                obj = c28624keL.EZpvd(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                MemeBlacklist memeBlacklist = (MemeBlacklist) obj2;
                if (!Intrinsics.EZpvd((Object) memeBlacklist.getChainId(), (Object) this.$meme$inlined.getChainId()) || !Intrinsics.EZpvd((Object) memeBlacklist.getTokenAddress(), (Object) this.$meme$inlined.getTokenAddress())) {
                    arrayList.add(obj2);
                }
            }
            SPUtils.put("dex_market_meme_blacklisted", arrayList, "dex_market");
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
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
