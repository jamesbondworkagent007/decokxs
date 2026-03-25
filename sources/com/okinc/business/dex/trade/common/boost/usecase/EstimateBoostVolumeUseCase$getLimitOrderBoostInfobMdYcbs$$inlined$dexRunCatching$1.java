package com.okinc.business.dex.trade.common.boost.usecase;

import com.okinc.business.dex.trade.common.boost.model.LimitOrderConfirmResponse;
import com.okinc.business.dex.trade.order.domain.model.BoostInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C19757gOe;
import o.C56391yDq;
import o.C56442yFn;
import o.gNX;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.dex.trade.common.boost.usecase.EstimateBoostVolumeUseCase$getLimitOrderBoostInfo-bMdYcbs$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class EstimateBoostVolumeUseCase$getLimitOrderBoostInfobMdYcbs$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends BoostInfo>>, Object> {
    final /* synthetic */ int $chainId$inlined;
    final /* synthetic */ String $fromTokenAddress$inlined;
    final /* synthetic */ String $fromTokenAmount$inlined;
    final /* synthetic */ ServiceFeeInfo $serviceFeeInfo$inlined;
    final /* synthetic */ String $toTokenAddress$inlined;
    final /* synthetic */ String $toTokenAmount$inlined;
    int label;
    final /* synthetic */ C19757gOe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EstimateBoostVolumeUseCase$getLimitOrderBoostInfobMdYcbs$$inlined$dexRunCatching$1(Continuation continuation, C19757gOe c19757gOe, int i, String str, String str2, String str3, String str4, ServiceFeeInfo serviceFeeInfo) {
        super(2, continuation);
        this.this$0 = c19757gOe;
        this.$chainId$inlined = i;
        this.$fromTokenAddress$inlined = str;
        this.$toTokenAddress$inlined = str2;
        this.$fromTokenAmount$inlined = str3;
        this.$toTokenAmount$inlined = str4;
        this.$serviceFeeInfo$inlined = serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EstimateBoostVolumeUseCase$getLimitOrderBoostInfobMdYcbs$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$fromTokenAddress$inlined, this.$toTokenAddress$inlined, this.$fromTokenAmount$inlined, this.$toTokenAmount$inlined, this.$serviceFeeInfo$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends BoostInfo>> continuation) {
        return ((EstimateBoostVolumeUseCase$getLimitOrderBoostInfobMdYcbs$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                gNX gnx = this.this$0.EZpvd;
                int i2 = this.$chainId$inlined;
                String str = this.$fromTokenAddress$inlined;
                String str2 = this.$toTokenAddress$inlined;
                String str3 = this.$fromTokenAmount$inlined;
                String str4 = this.$toTokenAmount$inlined;
                ServiceFeeInfo serviceFeeInfo = this.$serviceFeeInfo$inlined;
                this.label = 1;
                obj = gnx.EZpvd(i2, str, str2, str3, str4, serviceFeeInfo, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            LimitOrderConfirmResponse limitOrderConfirmResponse = (LimitOrderConfirmResponse) ((AbstractC43419rot) obj).copydefault();
            objM7377constructorimpl = Result.m7377constructorimpl(limitOrderConfirmResponse != null ? limitOrderConfirmResponse.getBoostInfo() : null);
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
