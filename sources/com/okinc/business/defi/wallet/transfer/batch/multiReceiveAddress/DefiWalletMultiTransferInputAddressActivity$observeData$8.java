package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC16400ejH;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletMultiTransferInputAddressActivity$observeData$8 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC16400ejH $this_observeData;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMultiTransferInputAddressActivity$observeData$8(AbstractC16400ejH abstractC16400ejH, Continuation<? super DefiWalletMultiTransferInputAddressActivity$observeData$8> continuation) {
        super(2, continuation);
        this.$this_observeData = abstractC16400ejH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiWalletMultiTransferInputAddressActivity$observeData$8 defiWalletMultiTransferInputAddressActivity$observeData$8 = new DefiWalletMultiTransferInputAddressActivity$observeData$8(this.$this_observeData, continuation);
        defiWalletMultiTransferInputAddressActivity$observeData$8.Z$0 = ((Boolean) obj).booleanValue();
        return defiWalletMultiTransferInputAddressActivity$observeData$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((DefiWalletMultiTransferInputAddressActivity$observeData$8) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$this_observeData.DbNXlk.setVisibility(this.Z$0 ? 0 : 8);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
