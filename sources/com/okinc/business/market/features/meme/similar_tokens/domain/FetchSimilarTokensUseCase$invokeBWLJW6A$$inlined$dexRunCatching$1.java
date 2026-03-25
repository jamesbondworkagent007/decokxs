package com.okinc.business.market.features.meme.similar_tokens.domain;

import com.okinc.business.market.features.meme.similar_tokens.domain.model.SimilarTokenData;
import com.okinc.business.market.features.meme.similar_tokens.domain.model.SimilarTokensResponseData;
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
import o.C28774khC;
import o.C28775khD;
import o.C28776khE;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28781khJ;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.meme.similar_tokens.domain.FetchSimilarTokensUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class FetchSimilarTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C28775khD>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $keyword$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    int label;
    final /* synthetic */ C28774khC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchSimilarTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C28774khC c28774khC, String str, String str2, String str3) {
        super(2, continuation);
        this.this$0 = c28774khC;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
        this.$keyword$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchSimilarTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined, this.$keyword$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C28775khD>> continuation) {
        return ((FetchSimilarTokensUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                InterfaceC28781khJ interfaceC28781khJ = this.this$0.copydefault;
                String str = this.$chainId$inlined;
                String str2 = this.$tokenContractAddress$inlined;
                String str3 = this.$keyword$inlined;
                this.label = 1;
                objAEQbTJ = interfaceC28781khJ.AEQbTJ(str, str2, str3, this);
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
            C56391yDq.AEQbTJ(objAEQbTJ);
            SimilarTokensResponseData similarTokensResponseData = (SimilarTokensResponseData) objAEQbTJ;
            List<SimilarTokenData> similarTokens = similarTokensResponseData.getSimilarTokens();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(similarTokens, 10));
            Iterator<T> it = similarTokens.iterator();
            while (it.hasNext()) {
                arrayList.add(C28776khE.OLrzqt((SimilarTokenData) it.next()));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(new C28775khD(arrayList, similarTokensResponseData.getTokenLargeLogoUrl()));
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
