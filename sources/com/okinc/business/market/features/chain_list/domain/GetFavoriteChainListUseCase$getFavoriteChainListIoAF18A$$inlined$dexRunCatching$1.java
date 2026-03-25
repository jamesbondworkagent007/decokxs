package com.okinc.business.market.features.chain_list.domain;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25981jNn;
import o.C25983jNp;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.chain_list.domain.GetFavoriteChainListUseCase$getFavoriteChainList-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class GetFavoriteChainListUseCase$getFavoriteChainListIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends MarketChainBean>>>, Object> {
    int label;
    final /* synthetic */ C25981jNn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFavoriteChainListUseCase$getFavoriteChainListIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, C25981jNn c25981jNn) {
        super(2, continuation);
        this.this$0 = c25981jNn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetFavoriteChainListUseCase$getFavoriteChainListIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends MarketChainBean>>> continuation) {
        return ((GetFavoriteChainListUseCase$getFavoriteChainListIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                C25983jNp c25983jNp = this.this$0.KWHzl;
                this.label = 1;
                obj = c25983jNp.KWHzl(this);
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
            boolean z = false;
            for (Object obj2 : (Iterable) obj) {
                if (z) {
                    arrayList.add(obj2);
                } else if (!Intrinsics.EZpvd((Object) ((MarketChainBean) obj2).getChainId(), (Object) "-100")) {
                    arrayList.add(obj2);
                    z = true;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((MarketChainBean) obj3).getPopularChain()) {
                    arrayList2.add(obj3);
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList2);
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
