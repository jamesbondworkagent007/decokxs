package com.okinc.business.market.features.ai_summary.core;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AAL;
import o.AGG;
import o.C2275AFm;
import o.C25794jGp;
import o.C33077mpe;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class AiSummaryCoreAdapter$getInsightsSummary$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AGG>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ String $tokenTicker;
    int label;
    final /* synthetic */ C25794jGp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiSummaryCoreAdapter$getInsightsSummary$2(String str, String str2, String str3, C25794jGp c25794jGp, Continuation<? super AiSummaryCoreAdapter$getInsightsSummary$2> continuation) {
        super(2, continuation);
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$tokenTicker = str3;
        this.this$0 = c25794jGp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiSummaryCoreAdapter$getInsightsSummary$2(this.$chainId, this.$tokenAddress, this.$tokenTicker, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AGG>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<AGG>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<AGG>> continuation) {
        return ((AiSummaryCoreAdapter$getInsightsSummary$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C2275AFm insightsSummary = AAL.getInsightsSummary(this.$chainId, this.$tokenAddress, this.$tokenTicker);
            C33077mpe c33077mpe = new C33077mpe(new AiSummaryCoreAdapter$getInsightsSummary$2$1$1(insightsSummary), new AiSummaryCoreAdapter$getInsightsSummary$2$1$2(insightsSummary), new AiSummaryCoreAdapter$getInsightsSummary$2$1$3(insightsSummary), new AiSummaryCoreAdapter$getInsightsSummary$2$1$4(insightsSummary), this.this$0.AEQbTJ);
            this.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            pUU.KWHzl("AiSummaryCoreAdapter", "core success");
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("AiSummaryCoreAdapter", "core failed", thM7380exceptionOrNullimpl);
        }
        return Result.m7376boximpl(objAEQbTJ);
    }
}
