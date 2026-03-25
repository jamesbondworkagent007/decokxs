package com.okinc.business.trade.features.home.advanced.usecase;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C22416heu;
import o.C27614jyX;
import o.C28179kRv;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28152kQv;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$subscribeMarketInfo-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketPriceUseCase$subscribeMarketInfogIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ C27614jyX $wsParam$inlined;
    int label;
    final /* synthetic */ C28179kRv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketPriceUseCase$subscribeMarketInfogIAlus$$inlined$dexRunCatching$1(Continuation continuation, C28179kRv c28179kRv, C27614jyX c27614jyX) {
        super(2, continuation);
        this.this$0 = c28179kRv;
        this.$wsParam$inlined = c27614jyX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketPriceUseCase$subscribeMarketInfogIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$wsParam$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((AdvancedMarketPriceUseCase$subscribeMarketInfogIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Unit unit;
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
            if (C22416heu.ejfBZ()) {
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            InterfaceC28152kQv interfaceC28152kQv = this.this$0.copydefault;
            C27614jyX c27614jyX = this.$wsParam$inlined;
            this.label = 1;
            if (interfaceC28152kQv.AEQbTJ(c27614jyX, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        unit = Unit.INSTANCE;
        objM7377constructorimpl = Result.m7377constructorimpl(unit);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
