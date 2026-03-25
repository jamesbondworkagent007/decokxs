package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C18914frR;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class TokenSearchResultViewModel$reportDexValidSearch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ String $tokenContractAddress;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TokenSearchResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenSearchResultViewModel$reportDexValidSearch$1(TokenSearchResultViewModel tokenSearchResultViewModel, long j, String str, Continuation<? super TokenSearchResultViewModel$reportDexValidSearch$1> continuation) {
        super(2, continuation);
        this.this$0 = tokenSearchResultViewModel;
        this.$chainId = j;
        this.$tokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TokenSearchResultViewModel$reportDexValidSearch$1 tokenSearchResultViewModel$reportDexValidSearch$1 = new TokenSearchResultViewModel$reportDexValidSearch$1(this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
        tokenSearchResultViewModel$reportDexValidSearch$1.L$0 = obj;
        return tokenSearchResultViewModel$reportDexValidSearch$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenSearchResultViewModel$reportDexValidSearch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                TokenSearchResultViewModel tokenSearchResultViewModel = this.this$0;
                long j = this.$chainId;
                String str = this.$tokenContractAddress;
                Result.Application application = Result.Companion;
                C18914frR c18914frR = tokenSearchResultViewModel.isConnected;
                this.label = 1;
                if (c18914frR.AEQbTJ(j, str, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
