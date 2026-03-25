package com.okinc.business.trade.features.home.advanced.usecase;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C33070mpX;
import o.C55276xgr;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedPricingTokensUseCase$getLimitOrderByList-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPricingTokensUseCase$getLimitOrderByListIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C55276xgr>>>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedPricingTokensUseCase$getLimitOrderByListIoAF18A$$inlined$dexRunCatching$1(Continuation continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPricingTokensUseCase$getLimitOrderByListIoAF18A$$inlined$dexRunCatching$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C55276xgr>>> continuation) {
        return ((AdvancedPricingTokensUseCase$getLimitOrderByListIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(yDY.gEmmrt(new C55276xgr(C33070mpX.AYXKKw(C23274hvD.Fragment.zsXlph), AdvancedLimitBy.Price, null, true, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), new C55276xgr(C33070mpX.AYXKKw(C23274hvD.Fragment.getNewProxyInstance), AdvancedLimitBy.MCap, null, false, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null)));
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
