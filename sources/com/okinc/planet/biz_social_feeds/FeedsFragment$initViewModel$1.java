package com.okinc.planet.biz_social_feeds;

import androidx.fragment.app.Fragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC46197tLk;
import o.C33546myW;
import o.C46133tJa;
import o.C56391yDq;
import o.C56442yFn;
import o.C57589ylK;
import o.rVN;
import o.tIO;

/* JADX INFO: loaded from: classes24.dex */
public final class FeedsFragment$initViewModel$1 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends C46133tJa.Activity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tIO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedsFragment$initViewModel$1(tIO tio, Continuation<? super FeedsFragment$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = tio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FeedsFragment$initViewModel$1 feedsFragment$initViewModel$1 = new FeedsFragment$initViewModel$1(this.this$0, continuation);
        feedsFragment$initViewModel$1.L$0 = obj;
        return feedsFragment$initViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends C46133tJa.Activity> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<C46133tJa.Activity>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<C46133tJa.Activity> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((FeedsFragment$initViewModel$1) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                this.this$0.KWHzl((C46133tJa.Activity) ((AbstractC46197tLk.Application) abstractC46197tLk).copydefault());
                if (!this.this$0.AEQbTJ) {
                    this.this$0.AEQbTJ = true;
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                }
            } else {
                if (abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator) {
                    return Unit.INSTANCE;
                }
                if (abstractC46197tLk instanceof AbstractC46197tLk.Activity) {
                    this.this$0.OLrzqt(((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd());
                    if (!this.this$0.AEQbTJ) {
                        this.this$0.AEQbTJ = true;
                        rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            C33546myW c33546myW = this.this$0.EZpvd().KWHzl;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.KWHzl(c33546myW, true);
            this.this$0.EZpvd().AEQbTJ.copydefault();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
