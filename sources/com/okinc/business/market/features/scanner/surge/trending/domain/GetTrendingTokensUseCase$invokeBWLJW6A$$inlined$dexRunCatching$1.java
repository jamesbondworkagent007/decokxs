package com.okinc.business.market.features.scanner.surge.trending.domain;

import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingTokenData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C29250kqB;
import o.C29300kqz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29249kqA;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.trending.domain.GetTrendingTokensUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetTrendingTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ TrendingConfigData $config$inlined;
    final /* synthetic */ String $rankType$inlined;
    int label;
    final /* synthetic */ C29300kqz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrendingTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C29300kqz c29300kqz, String str, String str2, TrendingConfigData trendingConfigData) {
        super(2, continuation);
        this.this$0 = c29300kqz;
        this.$rankType$inlined = str;
        this.$chainId$inlined = str2;
        this.$config$inlined = trendingConfigData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetTrendingTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$rankType$inlined, this.$chainId$inlined, this.$config$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((GetTrendingTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                InterfaceC29249kqA interfaceC29249kqA = this.this$0.AYXKKw;
                String str = this.$rankType$inlined;
                String str2 = this.$chainId$inlined;
                this.label = 1;
                obj = interfaceC29249kqA.OLrzqt(str, str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            List list = (List) ((AbstractC43419rot) obj).AEQbTJ();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29250kqB c29250kqBOLrzqt = this.this$0.OLrzqt((TrendingTokenData) it.next(), this.$config$inlined);
                if (c29250kqBOLrzqt != null) {
                    arrayList.add(c29250kqBOLrzqt);
                }
            }
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, arrayList));
            this.this$0.AEQbTJ("dex-market-trending-ranking-" + this.$rankType$inlined, this.$chainId$inlined, this.$config$inlined);
            this.this$0.copydefault((List<C29250kqB>) arrayList);
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
