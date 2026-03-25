package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import android.graphics.drawable.Drawable;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC20923gpz;
import o.C13754dXa;
import o.C33069mpW;
import o.C33129mqd;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletMultiTransferInputAddressActivity$observeData$4 extends SuspendLambda implements Function2<MultiTransferInputAddressViewModel.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC20923gpz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMultiTransferInputAddressActivity$observeData$4(ActivityC20923gpz activityC20923gpz, Continuation<? super DefiWalletMultiTransferInputAddressActivity$observeData$4> continuation) {
        super(2, continuation);
        this.this$0 = activityC20923gpz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiWalletMultiTransferInputAddressActivity$observeData$4 defiWalletMultiTransferInputAddressActivity$observeData$4 = new DefiWalletMultiTransferInputAddressActivity$observeData$4(this.this$0, continuation);
        defiWalletMultiTransferInputAddressActivity$observeData$4.L$0 = obj;
        return defiWalletMultiTransferInputAddressActivity$observeData$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MultiTransferInputAddressViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
        return ((DefiWalletMultiTransferInputAddressActivity$observeData$4) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MultiTransferInputAddressViewModel.ActionBar actionBar = (MultiTransferInputAddressViewModel.ActionBar) this.L$0;
            if (actionBar instanceof MultiTransferInputAddressViewModel.ActionBar.C0325ActionBar) {
                this.this$0.EZpvd((List<String>) ((MultiTransferInputAddressViewModel.ActionBar.C0325ActionBar) actionBar).copydefault());
            } else if (actionBar instanceof MultiTransferInputAddressViewModel.ActionBar.StateListAnimator) {
                this.this$0.EZpvd((List<String>) C56402yEa.EZpvd(((MultiTransferInputAddressViewModel.ActionBar.StateListAnimator) actionBar).KWHzl()));
            } else {
                if (!(actionBar instanceof MultiTransferInputAddressViewModel.ActionBar.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.ActivityResultCallerLauncherresultContract2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(C56443yFo.AEQbTJ(((MultiTransferInputAddressViewModel.ActionBar.Activity) actionBar).AEQbTJ()))))), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
