package com.okinc.business.market.features.vibes.repo;

import com.okinc.business.market.features.vibes.domain.VibesKolData;
import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import com.okinc.business.market.features.vibes.domain.VibesTopKolType;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C27725kBa;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23231huN;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.vibes.repo.VibesKolRepositoryImpl$fetchTopKolInfo-hUnOzRk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class VibesKolRepositoryImpl$fetchTopKolInfohUnOzRk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends VibesKolData>>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ VibesTopKolType $kolTopType$inlined;
    final /* synthetic */ VibesSortType $sortType$inlined;
    final /* synthetic */ VibesTimeRange $timeRange$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    int label;
    final /* synthetic */ C27725kBa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesKolRepositoryImpl$fetchTopKolInfohUnOzRk$$inlined$dexRunCatching$1(Continuation continuation, C27725kBa c27725kBa, String str, String str2, VibesSortType vibesSortType, VibesTopKolType vibesTopKolType, VibesTimeRange vibesTimeRange) {
        super(2, continuation);
        this.this$0 = c27725kBa;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
        this.$sortType$inlined = vibesSortType;
        this.$kolTopType$inlined = vibesTopKolType;
        this.$timeRange$inlined = vibesTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VibesKolRepositoryImpl$fetchTopKolInfohUnOzRk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined, this.$sortType$inlined, this.$kolTopType$inlined, this.$timeRange$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends VibesKolData>>> continuation) {
        return ((VibesKolRepositoryImpl$fetchTopKolInfohUnOzRk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC23231huN interfaceC23231huN = this.this$0.EZpvd;
                String str = this.$chainId$inlined;
                String str2 = this.$tokenContractAddress$inlined;
                int value = this.$sortType$inlined.getValue();
                int value2 = this.$kolTopType$inlined.getValue();
                int value3 = this.$timeRange$inlined.getValue();
                this.label = 1;
                obj = interfaceC23231huN.OLrzqt(str, str2, value, value2, value3, this);
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
