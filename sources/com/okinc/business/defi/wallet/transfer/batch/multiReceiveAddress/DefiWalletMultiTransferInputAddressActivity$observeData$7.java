package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC16400ejH;
import o.ActivityC20923gpz;
import o.C33070mpX;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletMultiTransferInputAddressActivity$observeData$7 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ ActivityC20923gpz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMultiTransferInputAddressActivity$observeData$7(ActivityC20923gpz activityC20923gpz, Continuation<? super DefiWalletMultiTransferInputAddressActivity$observeData$7> continuation) {
        super(2, continuation);
        this.this$0 = activityC20923gpz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiWalletMultiTransferInputAddressActivity$observeData$7 defiWalletMultiTransferInputAddressActivity$observeData$7 = new DefiWalletMultiTransferInputAddressActivity$observeData$7(this.this$0, continuation);
        defiWalletMultiTransferInputAddressActivity$observeData$7.Z$0 = ((Boolean) obj).booleanValue();
        return defiWalletMultiTransferInputAddressActivity$observeData$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((DefiWalletMultiTransferInputAddressActivity$observeData$7) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MultiTransferSignData multiTransferSignDataFetchVPNInfo;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC16400ejH abstractC16400ejH = null;
            if (!this.Z$0 || (multiTransferSignDataFetchVPNInfo = this.this$0.AEQbTJ().fetchVPNInfo()) == null || multiTransferSignDataFetchVPNInfo.getTransferType() != 2) {
                AbstractC16400ejH abstractC16400ejH2 = this.this$0.OLrzqt;
                if (abstractC16400ejH2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16400ejH2 = null;
                }
                abstractC16400ejH2.ejfBZ.setEnabled(true);
                AbstractC16400ejH abstractC16400ejH3 = this.this$0.OLrzqt;
                if (abstractC16400ejH3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16400ejH3 = null;
                }
                abstractC16400ejH3.ejfBZ.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.fdOvFl));
                AbstractC16400ejH abstractC16400ejH4 = this.this$0.OLrzqt;
                if (abstractC16400ejH4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16400ejH4 = null;
                }
                abstractC16400ejH4.isConnected.setEnabled(true);
                AbstractC16400ejH abstractC16400ejH5 = this.this$0.OLrzqt;
                if (abstractC16400ejH5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16400ejH = abstractC16400ejH5;
                }
                abstractC16400ejH.isConnected.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.fdOvFl));
            } else {
                AbstractC16400ejH abstractC16400ejH6 = this.this$0.OLrzqt;
                if (abstractC16400ejH6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16400ejH6 = null;
                }
                abstractC16400ejH6.ejfBZ.setEnabled(false);
                AbstractC16400ejH abstractC16400ejH7 = this.this$0.OLrzqt;
                if (abstractC16400ejH7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16400ejH7 = null;
                }
                abstractC16400ejH7.ejfBZ.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.UlJrfe));
                AbstractC16400ejH abstractC16400ejH8 = this.this$0.OLrzqt;
                if (abstractC16400ejH8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16400ejH8 = null;
                }
                abstractC16400ejH8.isConnected.setEnabled(false);
                AbstractC16400ejH abstractC16400ejH9 = this.this$0.OLrzqt;
                if (abstractC16400ejH9 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16400ejH = abstractC16400ejH9;
                }
                abstractC16400ejH.isConnected.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.UlJrfe));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
