package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import android.content.Context;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C15406eHd;
import o.C15433eId;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckWalletNotAddedDialog$observeResult$1 extends SuspendLambda implements Function2<OneKeyConnectEvent, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C15433eId this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckWalletNotAddedDialog$observeResult$1(C15433eId c15433eId, Continuation<? super CheckWalletNotAddedDialog$observeResult$1> continuation) {
        super(2, continuation);
        this.this$0 = c15433eId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheckWalletNotAddedDialog$observeResult$1 checkWalletNotAddedDialog$observeResult$1 = new CheckWalletNotAddedDialog$observeResult$1(this.this$0, continuation);
        checkWalletNotAddedDialog$observeResult$1.L$0 = obj;
        return checkWalletNotAddedDialog$observeResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OneKeyConnectEvent oneKeyConnectEvent, Continuation<? super Unit> continuation) {
        return ((CheckWalletNotAddedDialog$observeResult$1) create(oneKeyConnectEvent, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OneKeyConnectEvent oneKeyConnectEvent = (OneKeyConnectEvent) this.L$0;
            if (oneKeyConnectEvent == null) {
                return Unit.INSTANCE;
            }
            if (oneKeyConnectEvent instanceof OneKeyConnectEvent.ShowNotification) {
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C15406eHd.KWHzl(contextRequireContext, ((OneKeyConnectEvent.ShowNotification) oneKeyConnectEvent).getTitle());
            } else if (oneKeyConnectEvent instanceof OneKeyConnectEvent.Activity) {
                C15433eId.StateListAnimator stateListAnimatorKWHzl = this.this$0.KWHzl();
                if (stateListAnimatorKWHzl != null) {
                    stateListAnimatorKWHzl.AEQbTJ(((OneKeyConnectEvent.Activity) oneKeyConnectEvent).EZpvd());
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.dismiss();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
