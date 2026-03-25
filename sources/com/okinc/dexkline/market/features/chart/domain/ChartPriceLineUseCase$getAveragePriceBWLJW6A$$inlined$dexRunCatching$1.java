package com.okinc.dexkline.market.features.chart.domain;

import com.okinc.dexkline.market.data.model.position_pnl.LatestPnLData;
import com.okinc.kline.data.KlineDexAvgDataBean;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C34663ngO;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC34472nci;
import o.mVW;
import o.mVW.Activity;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.chart.domain.ChartPriceLineUseCase$getAveragePrice-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends KlineDexAvgDataBean>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ mVW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, String str, mVW mvw, String str2, String str3) {
        super(2, continuation);
        this.$walletAddress$inlined = str;
        this.this$0 = mvw;
        this.$chainId$inlined = str2;
        this.$tokenContractAddress$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1(continuation, this.$walletAddress$inlined, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends KlineDexAvgDataBean>> continuation) {
        return ((ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                String strAEQbTJ = C34663ngO.AEQbTJ(this.$walletAddress$inlined, this.this$0.new Activity(this.$chainId$inlined));
                InterfaceC34472nci interfaceC34472nci = this.this$0.AEQbTJ;
                String str = this.$chainId$inlined;
                String str2 = this.$tokenContractAddress$inlined;
                this.label = 1;
                obj = interfaceC34472nci.EZpvd(strAEQbTJ, str, str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(this.this$0.EZpvd.AEQbTJ((LatestPnLData) ((AbstractC43419rot) obj).AEQbTJ(), this.$walletAddress$inlined));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
