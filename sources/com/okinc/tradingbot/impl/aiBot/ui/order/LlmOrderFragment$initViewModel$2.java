package com.okinc.tradingbot.impl.aiBot.ui.order;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.okinc.tradingbot.impl.aiBot.dto.ModelInfoDto;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC48473uSs;
import o.C33070mpX;
import o.C48112uFk;
import o.C52761wXj;
import o.C5335Nt;
import o.C53418wlC;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class LlmOrderFragment$initViewModel$2 extends SuspendLambda implements Function2<ModelInfoDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C48112uFk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmOrderFragment$initViewModel$2(C48112uFk c48112uFk, Continuation<? super LlmOrderFragment$initViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = c48112uFk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmOrderFragment$initViewModel$2 llmOrderFragment$initViewModel$2 = new LlmOrderFragment$initViewModel$2(this.this$0, continuation);
        llmOrderFragment$initViewModel$2.L$0 = obj;
        return llmOrderFragment$initViewModel$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ModelInfoDto modelInfoDto, Continuation<? super Unit> continuation) {
        return ((LlmOrderFragment$initViewModel$2) create(modelInfoDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ModelInfoDto modelInfoDto = (ModelInfoDto) this.L$0;
            AbstractC48473uSs abstractC48473uSsIsConnected = C48112uFk.isConnected(this.this$0);
            C5335Nt<Drawable> c5335NtEZpvd = Glide.EZpvd(this.this$0).EZpvd(C53418wlC.AEQbTJ(modelInfoDto.OLrzqt()));
            Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gkJEwt);
            if (drawableKWHzl != null) {
                drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            } else {
                drawableKWHzl = null;
            }
            c5335NtEZpvd.AEQbTJ(drawableKWHzl).EZpvd((ImageView) abstractC48473uSsIsConnected.KWHzl);
            abstractC48473uSsIsConnected.EZpvd.setText(modelInfoDto.copydefault());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
