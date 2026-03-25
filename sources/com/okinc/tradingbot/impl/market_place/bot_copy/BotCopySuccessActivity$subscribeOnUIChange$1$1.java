package com.okinc.tradingbot.impl.market_place.bot_copy;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC51282vkA;
import o.ActivityC51150vhb;
import o.C51284vkC;
import o.C56391yDq;
import o.C56442yFn;
import o.C59462zhW;
import o.C59519zia;

/* JADX INFO: loaded from: classes11.dex */
public final class BotCopySuccessActivity$subscribeOnUIChange$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC51150vhb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotCopySuccessActivity$subscribeOnUIChange$1$1(ActivityC51150vhb activityC51150vhb, Continuation<? super BotCopySuccessActivity$subscribeOnUIChange$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC51150vhb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotCopySuccessActivity$subscribeOnUIChange$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotCopySuccessActivity$subscribeOnUIChange$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            long jEZpvd = C59519zia.EZpvd(8, DurationUnit.SECONDS);
            this.label = 1;
            if (DelayKt.m7393delayVtjQ1oo(jEZpvd, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC51282vkA abstractC51282vkAAhwBna = ActivityC51150vhb.EZpvd(this.this$0).AhwBna();
        C51284vkC c51284vkC = abstractC51282vkAAhwBna instanceof C51284vkC ? (C51284vkC) abstractC51282vkAAhwBna : null;
        if (c51284vkC != null) {
            c51284vkC.fIwbmz();
        }
        return Unit.INSTANCE;
    }
}
