package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
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
import o.C52761wXj;
import o.C55276xgr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.kRD;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedPricingTokensUseCase$getOrderTypes-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPricingTokensUseCase$getOrderTypesgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C55276xgr>>>, Object> {
    final /* synthetic */ boolean $isLimitOrderSupported$inlined;
    int label;
    final /* synthetic */ kRD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPricingTokensUseCase$getOrderTypesgIAlus$$inlined$dexRunCatching$1(Continuation continuation, kRD krd, boolean z) {
        super(2, continuation);
        this.this$0 = krd;
        this.$isLimitOrderSupported$inlined = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPricingTokensUseCase$getOrderTypesgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$isLimitOrderSupported$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C55276xgr>>> continuation) {
        return ((AdvancedPricingTokensUseCase$getOrderTypesgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        List listGEmmrt;
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        try {
            Result.Application application = Result.Companion;
            if (this.this$0.KWHzl.valueOf()) {
                listGEmmrt = yDY.gEmmrt(new C55276xgr(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplApi21), C56443yFo.KWHzl(true), null, false, false, null, null, 100, null), new C55276xgr(C33070mpX.AYXKKw(C23274hvD.Fragment.update), AdvancedOrderType.MARKET, C33070mpX.AYXKKw(C23274hvD.Fragment.sendEvent), true, true, C56443yFo.AEQbTJ(C52761wXj.TaskDescription.iLWfRf), "web3_dex_advance_entrust_market"), new C55276xgr(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBase1), AdvancedOrderType.LIMIT, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBase), false, this.$isLimitOrderSupported$inlined, C56443yFo.AEQbTJ(C52761wXj.TaskDescription.DXd), "web3_dex_advance_entrust_limit"), new C55276xgr(C33070mpX.AYXKKw(C23274hvD.Fragment.sendExtras), C56443yFo.KWHzl(true), null, false, false, null, null, 100, null), new C55276xgr(C33070mpX.AYXKKw(C23274hvD.Fragment.sendQueue), AdvancedOrderType.DEVSELL, C33070mpX.AYXKKw(C23274hvD.Fragment.sendSessionDestroyed), false, false, C56443yFo.AEQbTJ(C52761wXj.TaskDescription.DUUtXg), null, 64, null), new C55276xgr(C33070mpX.AYXKKw(C23274hvD.Fragment.sendRepeatMode), AdvancedOrderType.SNIPE, C33070mpX.AYXKKw(C23274hvD.Fragment.sendCaptioningEnabled), false, false, C56443yFo.AEQbTJ(C52761wXj.TaskDescription.extraCallback), null, 64, null), new C55276xgr(C33070mpX.AYXKKw(C23274hvD.Fragment.sendQueueTitle), AdvancedOrderType.DCA, C33070mpX.AYXKKw(C23274hvD.Fragment.sendMetadata), false, false, C56443yFo.AEQbTJ(C52761wXj.TaskDescription.OHqIaq), null, 64, null));
            } else {
                listGEmmrt = yDY.gEmmrt(new C55276xgr(C33070mpX.AYXKKw(C23274hvD.Fragment.update), AdvancedOrderType.MARKET, C33070mpX.AYXKKw(C23274hvD.Fragment.sendEvent), true, true, C56443yFo.AEQbTJ(C52761wXj.TaskDescription.iLWfRf), "web3_dex_advance_entrust_market"), new C55276xgr(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBase1), AdvancedOrderType.LIMIT, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBase), false, this.$isLimitOrderSupported$inlined, C56443yFo.AEQbTJ(C52761wXj.TaskDescription.DXd), "web3_dex_advance_entrust_limit"));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(listGEmmrt);
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
