package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC28871kiu;
import o.C28774khC;
import o.C28775khD;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenTabViewModel$fetchSimilarTokens$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $tokenSymbol;
    int label;
    final /* synthetic */ TokenTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenTabViewModel$fetchSimilarTokens$1(TokenTabViewModel tokenTabViewModel, String str, String str2, String str3, Continuation<? super TokenTabViewModel$fetchSimilarTokens$1> continuation) {
        super(2, continuation);
        this.this$0 = tokenTabViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$tokenSymbol = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenTabViewModel$fetchSimilarTokens$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$tokenSymbol, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenTabViewModel$fetchSimilarTokens$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(AbstractC28871kiu.Application.EZpvd);
            C28774khC c28774khC = this.this$0.AEQbTJ;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            String str3 = this.$tokenSymbol;
            this.label = 1;
            objCopydefault = c28774khC.copydefault(str, str2, str3, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        TokenTabViewModel tokenTabViewModel = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow = tokenTabViewModel.EZpvd;
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            mutableStateFlow.setValue(new AbstractC28871kiu.StateListAnimator(message));
        } else {
            C28775khD c28775khD = (C28775khD) objCopydefault;
            tokenTabViewModel.EZpvd.setValue(new AbstractC28871kiu.ActionBar(c28775khD.copydefault(), c28775khD.OLrzqt()));
        }
        return Unit.INSTANCE;
    }
}
