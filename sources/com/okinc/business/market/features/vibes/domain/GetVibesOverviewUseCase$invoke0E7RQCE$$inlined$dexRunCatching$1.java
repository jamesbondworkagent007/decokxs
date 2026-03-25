package com.okinc.business.market.features.vibes.domain;

import com.okinc.business.market.features.overview.ui.widget.VibesRelevance;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29116kna;
import o.C56391yDq;
import o.C56442yFn;
import o.kAM;
import o.kAN;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.vibes.domain.GetVibesOverviewUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetVibesOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C29116kna>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    int label;
    final /* synthetic */ kAN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetVibesOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, kAN kan, String str, String str2) {
        super(2, continuation);
        this.this$0 = kan;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetVibesOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C29116kna>> continuation) {
        return ((GetVibesOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objKWHzl;
        Object objM7377constructorimpl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                kAM kamCopydefault = this.this$0.copydefault();
                String str = this.$chainId$inlined;
                String str2 = this.$tokenContractAddress$inlined;
                this.label = 1;
                objKWHzl = kamCopydefault.KWHzl(str, str2, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7384isSuccessimpl(objKWHzl)) {
                Result.Application application2 = Result.Companion;
                VibesOverviewData vibesOverviewData = (VibesOverviewData) objKWHzl;
                objM7377constructorimpl2 = Result.m7377constructorimpl(new C29116kna(vibesOverviewData.EZpvd(), VibesRelevance.Companion.OLrzqt(vibesOverviewData.OLrzqt()), vibesOverviewData.KWHzl(), vibesOverviewData.copydefault(), null, null, 48, null));
            } else {
                objM7377constructorimpl2 = Result.m7377constructorimpl(objKWHzl);
            }
            C56391yDq.AEQbTJ(objM7377constructorimpl2);
            objM7377constructorimpl = Result.m7377constructorimpl(objM7377constructorimpl2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
