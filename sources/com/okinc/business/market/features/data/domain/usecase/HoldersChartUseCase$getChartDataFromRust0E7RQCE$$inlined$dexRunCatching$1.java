package com.okinc.business.market.features.data.domain.usecase;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AAI;
import o.AAL;
import o.C2221ADk;
import o.C33077mpe;
import o.C56391yDq;
import o.C56442yFn;
import o.jQD;
import o.jQF;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.data.domain.usecase.HoldersChartUseCase$getChartDataFromRust-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class HoldersChartUseCase$getChartDataFromRust0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends jQD>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    Object L$0;
    int label;
    final /* synthetic */ jQF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldersChartUseCase$getChartDataFromRust0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, jQF jqf, String str, String str2) {
        super(2, continuation);
        this.this$0 = jqf;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HoldersChartUseCase$getChartDataFromRust0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends jQD>> continuation) {
        return ((HoldersChartUseCase$getChartDataFromRust0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        jQF jqf;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                jQF jqf2 = this.this$0;
                C2221ADk holderAnalysis = AAL.getHolderAnalysis(this.$chainId$inlined, this.$tokenContractAddress$inlined);
                C33077mpe c33077mpe = new C33077mpe(new HoldersChartUseCase$getChartDataFromRust$2$1$1(holderAnalysis), new HoldersChartUseCase$getChartDataFromRust$2$1$2(holderAnalysis), new HoldersChartUseCase$getChartDataFromRust$2$1$3(holderAnalysis), new HoldersChartUseCase$getChartDataFromRust$2$1$4(holderAnalysis), this.this$0.copydefault);
                this.L$0 = jqf2;
                this.label = 1;
                Object objAEQbTJ = c33077mpe.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                jqf = jqf2;
                objM7386unboximpl = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jqf = (jQF) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                pUU.KWHzl("HoldersChartUseCase", "Rust call success");
            }
            C56391yDq.AEQbTJ(objM7386unboximpl);
            objM7377constructorimpl = Result.m7377constructorimpl(jqf.OLrzqt((AAI) objM7386unboximpl));
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
