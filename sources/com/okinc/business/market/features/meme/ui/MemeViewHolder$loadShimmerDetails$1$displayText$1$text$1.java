package com.okinc.business.market.features.meme.ui;

import android.graphics.drawable.Drawable;
import com.okinc.business.market.features.meme.domain.model.MemeCarSharingData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C23274hvD;
import o.C23313hvq;
import o.C25382ivf;
import o.C28891kjN;
import o.C28915kjl;
import o.C33057mpK;
import o.C33070mpX;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeViewHolder$loadShimmerDetails$1$displayText$1$text$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MemeCarSharingData $it;
    final /* synthetic */ String $normalText;
    final /* synthetic */ long $signalRemaining;
    int label;
    final /* synthetic */ C28915kjl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeViewHolder$loadShimmerDetails$1$displayText$1$text$1(long j, C28915kjl c28915kjl, String str, MemeCarSharingData memeCarSharingData, Continuation<? super MemeViewHolder$loadShimmerDetails$1$displayText$1$text$1> continuation) {
        super(2, continuation);
        this.$signalRemaining = j;
        this.this$0 = c28915kjl;
        this.$normalText = str;
        this.$it = memeCarSharingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeViewHolder$loadShimmerDetails$1$displayText$1$text$1(this.$signalRemaining, this.this$0, this.$normalText, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeViewHolder$loadShimmerDetails$1$displayText$1$text$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long j = this.$signalRemaining;
            this.label = 1;
            if (DelayKt.delay(j, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C28891kjN c28891kjN = this.this$0.AEQbTJ.OLrzqt;
        String str = this.$normalText;
        Drawable drawableKWHzl = C33070mpX.KWHzl(C23274hvD.ActionBar.getNewProxyInstance);
        C28891kjN.setContent$default(c28891kjN, str, drawableKWHzl != null ? C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI)) : null, null, false, 12, null);
        C28891kjN.setShimmerEnabled$default(this.this$0.AEQbTJ.OLrzqt, false, 0.0f, 2, null);
        C28891kjN c28891kjN2 = this.this$0.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c28891kjN2, "");
        c28891kjN2.setVisibility(C23313hvq.OLrzqt(this.$it.AEQbTJ(), "0") ? 0 : 8);
        return Unit.INSTANCE;
    }
}
