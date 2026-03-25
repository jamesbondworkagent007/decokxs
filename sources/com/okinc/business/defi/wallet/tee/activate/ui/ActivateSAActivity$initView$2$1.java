package com.okinc.business.defi.wallet.tee.activate.ui;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchTeeConfig;
import com.okinc.wallet.api.bean.FunctionConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC17792fSl;
import o.C13754dXa;
import o.C33070mpX;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.InterfaceC54855xXv;
import o.InterfaceC9738bbJ;
import o.pUU;
import o.xWX;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivateSAActivity$initView$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17792fSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAActivity$initView$2$1(ActivityC17792fSl activityC17792fSl, Continuation<? super ActivateSAActivity$initView$2$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC17792fSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAActivity$initView$2$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAActivity$initView$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC17792fSl activityC17792fSl = this.this$0;
            ActivateSAViewModel activateSAViewModelAEQbTJ = activityC17792fSl.AEQbTJ();
            this.label = 1;
            objCopydefault = activityC17792fSl.copydefault(activateSAViewModelAEQbTJ, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        ActivityC17792fSl activityC17792fSl2 = this.this$0;
        if (((ActivateSAViewModel.Application) objCopydefault).OLrzqt() instanceof InterfaceC49371unL.Activity) {
            xWX xwx = (xWX) C43251rlk.copydefault(xWX.class);
            FragmentManager supportFragmentManager = activityC17792fSl2.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, supportFragmentManager, new CurrentWalletSwitchConfig(null, CurrentWalletSwitchNetworkMode.Ignored.OLrzqt, "", C33070mpX.AYXKKw(C13754dXa.FragmentManager.addPreRequisiteCollector), null, 1, new CurrentWalletSwitchTeeConfig(C13754dXa.FragmentManager.Slwtri, "num", "learn", C13754dXa.FragmentManager.RZOtbZ), new FunctionConfig(true, true, true, false, 8, null), 17, null), ActionBar.KWHzl, null, new Application(activityC17792fSl2), 8, null);
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements Function2<InterfaceC9738bbJ, Long, Boolean> {
        public static final ActionBar KWHzl = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC9738bbJ interfaceC9738bbJ, Long l) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            return Boolean.valueOf(interfaceC9738bbJ.AubY());
        }
    }

    public static final class Application implements InterfaceC54855xXv {
        public final /* synthetic */ ActivityC17792fSl KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
        }

        public Application(ActivityC17792fSl activityC17792fSl) {
            this.KWHzl = activityC17792fSl;
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            pUU.copydefault(this.KWHzl.getTAG(), "onWalletAndNetworkSwitched = " + interfaceC9738bbJ.AkhnZx() + " : " + interfaceC9738bbJ.RJOkX() + " : " + interfaceC9738bbJ.DbNXlk());
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            pUU.copydefault(this.KWHzl.getTAG(), "onWalletSwitched = " + interfaceC9738bbJ.AkhnZx() + " : " + interfaceC9738bbJ.RJOkX() + " : " + interfaceC9738bbJ.DbNXlk());
            this.KWHzl.EZpvd = false;
            this.KWHzl.KWHzl().AEQbTJ(interfaceC9738bbJ.DbNXlk());
            this.KWHzl.AEQbTJ().EZpvd(interfaceC9738bbJ.DbNXlk());
        }
    }
}
