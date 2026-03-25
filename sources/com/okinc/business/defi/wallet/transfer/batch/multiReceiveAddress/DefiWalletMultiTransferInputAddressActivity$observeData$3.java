package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC16400ejH;
import o.ActivityC20923gpz;
import o.C56391yDq;
import o.C56442yFn;
import o.C57294yfh;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletMultiTransferInputAddressActivity$observeData$3 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC16400ejH $this_observeData;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC20923gpz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMultiTransferInputAddressActivity$observeData$3(ActivityC20923gpz activityC20923gpz, AbstractC16400ejH abstractC16400ejH, Continuation<? super DefiWalletMultiTransferInputAddressActivity$observeData$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC20923gpz;
        this.$this_observeData = abstractC16400ejH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiWalletMultiTransferInputAddressActivity$observeData$3 defiWalletMultiTransferInputAddressActivity$observeData$3 = new DefiWalletMultiTransferInputAddressActivity$observeData$3(this.this$0, this.$this_observeData, continuation);
        defiWalletMultiTransferInputAddressActivity$observeData$3.L$0 = obj;
        return defiWalletMultiTransferInputAddressActivity$observeData$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return ((DefiWalletMultiTransferInputAddressActivity$observeData$3) create(num, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Integer num = (Integer) this.L$0;
            if ((num == null || num.intValue() != -1) && num != null) {
                View currentFocus = this.this$0.getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
                C57294yfh.scrollToAddressByIndex$default(this.$this_observeData.AkhnZx, num.intValue(), 0, 2, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
