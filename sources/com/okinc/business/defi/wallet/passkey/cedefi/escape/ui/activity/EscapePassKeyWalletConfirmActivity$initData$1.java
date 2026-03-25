package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$initData$1;
import com.okinc.wallet.api.bean.CurrentWalletSelectMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.wallet.api.bean.FunctionConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC17567fKc;
import o.C13754dXa;
import o.C17599fLh;
import o.C33070mpX;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.fLG;
import o.xWX;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapePassKeyWalletConfirmActivity$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17567fKc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletConfirmActivity$initData$1(ActivityC17567fKc activityC17567fKc, Continuation<? super EscapePassKeyWalletConfirmActivity$initData$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC17567fKc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletConfirmActivity$initData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletConfirmActivity$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletConfirmActivity$initData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<fLG.Activity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC17567fKc this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17567fKc activityC17567fKc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17567fKc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fLG.Activity activity, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CurrentWalletSelectMode walletSelectedById;
            String strDbNXlk;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                fLG.Activity activity = (fLG.Activity) this.L$0;
                this.this$0.dismissLoading();
                String str = "";
                if (activity instanceof fLG.Activity.ActionBar) {
                    C17599fLh c17599fLhCopydefault = C17599fLh.Companion.copydefault();
                    FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    c17599fLhCopydefault.show(supportFragmentManager);
                } else if (activity instanceof fLG.Activity.StateListAnimator) {
                    xWX xwx = (xWX) C43251rlk.copydefault(xWX.class);
                    FragmentManager supportFragmentManager2 = this.this$0.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    if (this.this$0.AhwBna != null) {
                        InterfaceC9738bbJ interfaceC9738bbJ = this.this$0.AhwBna;
                        if (interfaceC9738bbJ != null && (strDbNXlk = interfaceC9738bbJ.DbNXlk()) != null) {
                            str = strDbNXlk;
                        }
                        walletSelectedById = new CurrentWalletSelectMode.WalletSelectedById(str);
                    } else {
                        walletSelectedById = CurrentWalletSelectMode.NoWalletSelected.EZpvd;
                    }
                    xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, supportFragmentManager2, new CurrentWalletSwitchConfig(walletSelectedById, CurrentWalletSwitchNetworkMode.Ignored.OLrzqt, "", C33070mpX.AYXKKw(C13754dXa.FragmentManager.addPreRequisiteCollector), null, 1, null, new FunctionConfig(false, true, true, false, 8, null), 80, null), new Function2() { // from class: o.fKi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return java.lang.Boolean.valueOf(EscapePassKeyWalletConfirmActivity$initData$1.AnonymousClass1.invokeSuspend$lambda$0((InterfaceC9738bbJ) obj2, (java.lang.Long) obj3));
                        }
                    }, null, this.this$0.KWHzl(), 8, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(InterfaceC9738bbJ interfaceC9738bbJ, Long l) {
            return interfaceC9738bbJ.AubY();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<fLG.Activity> stateFlowOLrzqt = this.this$0.AYXKKw().OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowOLrzqt, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
