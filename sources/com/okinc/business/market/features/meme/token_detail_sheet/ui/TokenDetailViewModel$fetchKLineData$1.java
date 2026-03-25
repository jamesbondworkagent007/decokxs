package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC28867kiq;
import o.C28779khH;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenDetailViewModel$fetchKLineData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $scale;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ TokenDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenDetailViewModel$fetchKLineData$1(TokenDetailViewModel tokenDetailViewModel, String str, String str2, String str3, Continuation<? super TokenDetailViewModel$fetchKLineData$1> continuation) {
        super(2, continuation);
        this.this$0 = tokenDetailViewModel;
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$scale = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenDetailViewModel$fetchKLineData$1(this.this$0, this.$chainId, this.$tokenAddress, this.$scale, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenDetailViewModel$fetchKLineData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl.setValue(AbstractC28867kiq.StateListAnimator.AEQbTJ);
            C28779khH c28779khH = this.this$0.EZpvd;
            String str = this.$chainId;
            String str2 = this.$tokenAddress;
            String str3 = this.$scale;
            this.label = 1;
            objOLrzqt = c28779khH.OLrzqt(str, str2, str3, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        TokenDetailViewModel tokenDetailViewModel = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow = tokenDetailViewModel.KWHzl;
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            mutableStateFlow.setValue(new AbstractC28867kiq.Activity(message));
        } else {
            List list = (List) objOLrzqt;
            tokenDetailViewModel.KWHzl.setValue(list.isEmpty() ? new AbstractC28867kiq.Activity("empty list") : new AbstractC28867kiq.TaskDescription(list));
        }
        return Unit.INSTANCE;
    }
}
