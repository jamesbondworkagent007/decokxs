package com.okinc.business.defi.wallet.tee.activate.ui;

import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeDoneParam;
import com.okinc.business.defi.wallet.tee.activate.model.NotificationStateType;
import com.okinc.business.defi.wallet.tee.activate.model.TeeActivateSuccess;
import com.okinc.business.defi.wallet.tee.activate.model.TeeCreated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC17786fSf;
import o.ActivityC17792fSl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivateSAActivity$observerData$4 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends AbstractC17786fSf>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC17792fSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAActivity$observerData$4(ActivityC17792fSl activityC17792fSl, Continuation<? super ActivateSAActivity$observerData$4> continuation) {
        super(2, continuation);
        this.this$0 = activityC17792fSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ActivateSAActivity$observerData$4 activateSAActivity$observerData$4 = new ActivateSAActivity$observerData$4(this.this$0, continuation);
        activateSAActivity$observerData$4.L$0 = obj;
        return activateSAActivity$observerData$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC49371unL<? extends AbstractC17786fSf> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((ActivateSAActivity$observerData$4) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            if (!(interfaceC49371unL instanceof InterfaceC49371unL.StateListAnimator)) {
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    this.this$0.showLoadingWithLogo();
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    this.this$0.dismissLoadingWithLogo();
                    AbstractC17786fSf abstractC17786fSf = (AbstractC17786fSf) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault();
                    if (abstractC17786fSf instanceof TeeActivateSuccess) {
                        TeeActivateSuccess teeActivateSuccess = (TeeActivateSuccess) abstractC17786fSf;
                        this.this$0.AEQbTJ.launch(new ActivateTeeDoneParam(teeActivateSuccess.getAccountName(), teeActivateSuccess.getAddressOfWalletAvatar(), teeActivateSuccess.getExpireTimestamp(), teeActivateSuccess.getExpirePeriodDay(), teeActivateSuccess.getAutoRenew(), teeActivateSuccess.getNftAssets(), this.this$0.AYXKKw()));
                    } else {
                        if (!(abstractC17786fSf instanceof TeeCreated)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        TeeCreated teeCreated = (TeeCreated) abstractC17786fSf;
                        this.this$0.copydefault(teeCreated.isActive() ? NotificationStateType.SmartEnabled : NotificationStateType.EnableAgain, teeCreated.getAccountName(), true);
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    this.this$0.dismissLoadingWithLogo();
                    this.this$0.OLrzqt(((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ());
                } else {
                    if (!(interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.dismissLoadingWithLogo();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
