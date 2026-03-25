package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import android.widget.TextView;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ErrorMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC16400ejH;
import o.ActivityC20923gpz;
import o.C33069mpW;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletMultiTransferInputAddressActivity$observeData$1 extends SuspendLambda implements Function2<ErrorMessage, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC16400ejH $this_observeData;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC20923gpz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMultiTransferInputAddressActivity$observeData$1(AbstractC16400ejH abstractC16400ejH, ActivityC20923gpz activityC20923gpz, Continuation<? super DefiWalletMultiTransferInputAddressActivity$observeData$1> continuation) {
        super(2, continuation);
        this.$this_observeData = abstractC16400ejH;
        this.this$0 = activityC20923gpz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiWalletMultiTransferInputAddressActivity$observeData$1 defiWalletMultiTransferInputAddressActivity$observeData$1 = new DefiWalletMultiTransferInputAddressActivity$observeData$1(this.$this_observeData, this.this$0, continuation);
        defiWalletMultiTransferInputAddressActivity$observeData$1.L$0 = obj;
        return defiWalletMultiTransferInputAddressActivity$observeData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ErrorMessage errorMessage, Continuation<? super Unit> continuation) {
        return ((DefiWalletMultiTransferInputAddressActivity$observeData$1) create(errorMessage, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ErrorMessage errorMessage = (ErrorMessage) this.L$0;
            if (errorMessage != null) {
                TextView textView = this.$this_observeData.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                if (errorMessage.copydefault() != null) {
                    string = C33069mpW.KWHzl(this.this$0, errorMessage.KWHzl(), errorMessage.copydefault());
                } else {
                    string = this.this$0.getString(errorMessage.KWHzl());
                    Intrinsics.copydefault((Object) string);
                }
                this.$this_observeData.valueOf.setText(string);
            } else {
                TextView textView2 = this.$this_observeData.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
