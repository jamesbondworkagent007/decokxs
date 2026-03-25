package com.okinc.im.imui.group.giftcontact;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34123nSg;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nJC;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GiftContactSelectionFragment$setObserver$1$1 extends SuspendLambda implements yHO<CoroutineScope, Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34123nSg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftContactSelectionFragment$setObserver$1$1(C34123nSg c34123nSg, Continuation<? super GiftContactSelectionFragment$setObserver$1$1> continuation) {
        super(3, continuation);
        this.this$0 = c34123nSg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, Boolean bool, Continuation<? super Unit> continuation) {
        GiftContactSelectionFragment$setObserver$1$1 giftContactSelectionFragment$setObserver$1$1 = new GiftContactSelectionFragment$setObserver$1$1(this.this$0, continuation);
        giftContactSelectionFragment$setObserver$1$1.L$0 = bool;
        return giftContactSelectionFragment$setObserver$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Boolean bool = (Boolean) this.L$0;
            nJC njc = this.this$0.KWHzl;
            if (njc == null) {
                Intrinsics.gEmmrt("");
                njc = null;
            }
            C55113xdn c55113xdn = njc.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) ? 0 : 8);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
