package com.okinc.business.market.features.meme.preview;

import com.okinc.business.market.features.meme.data.model.XPostType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28800khc;
import o.C28807khj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28740kgV;

/* JADX INFO: loaded from: classes7.dex */
public final class TwitterPreviewViewModel$load$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ XPostType $postType;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ TwitterPreviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwitterPreviewViewModel$load$1(TwitterPreviewViewModel twitterPreviewViewModel, String str, String str2, XPostType xPostType, Continuation<? super TwitterPreviewViewModel$load$1> continuation) {
        super(2, continuation);
        this.this$0 = twitterPreviewViewModel;
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$postType = xPostType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwitterPreviewViewModel$load$1(this.this$0, this.$chainId, this.$tokenAddress, this.$postType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TwitterPreviewViewModel$load$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl.setValue(InterfaceC28740kgV.Activity.OLrzqt);
            C28800khc c28800khc = this.this$0.AhwBna;
            String str = this.$chainId;
            String str2 = this.$tokenAddress;
            XPostType xPostType = this.$postType;
            this.label = 1;
            objEZpvd = c28800khc.EZpvd(str, str2, xPostType, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        TwitterPreviewViewModel twitterPreviewViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            C28807khj c28807khj = (C28807khj) objEZpvd;
            twitterPreviewViewModel.KWHzl.setValue(new InterfaceC28740kgV.TaskDescription(c28807khj));
            if (!twitterPreviewViewModel.gEmmrt) {
                twitterPreviewViewModel.AEQbTJ(c28807khj);
            }
        }
        TwitterPreviewViewModel twitterPreviewViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            twitterPreviewViewModel2.KWHzl.setValue(InterfaceC28740kgV.StateListAnimator.copydefault);
        }
        return Unit.INSTANCE;
    }
}
