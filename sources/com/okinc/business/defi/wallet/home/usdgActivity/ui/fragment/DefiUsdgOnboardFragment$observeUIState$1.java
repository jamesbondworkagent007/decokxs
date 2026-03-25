package com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment;

import androidx.activity.result.ActivityResultLauncher;
import com.okinc.account.api.model.wallet.BindWalletInput;
import com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C18254fet;
import o.C56391yDq;
import o.C56442yFn;
import o.gJK;
import o.gJR;
import o.gJY;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiUsdgOnboardFragment$observeUIState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18254fet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiUsdgOnboardFragment$observeUIState$1(C18254fet c18254fet, Continuation<? super DefiUsdgOnboardFragment$observeUIState$1> continuation) {
        super(2, continuation);
        this.this$0 = c18254fet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiUsdgOnboardFragment$observeUIState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiUsdgOnboardFragment$observeUIState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeUIState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<gJK, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18254fet this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18254fet c18254fet, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18254fet;
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
        public final Object invoke(gJK gjk, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(gjk, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                gJK gjk = (gJK) this.L$0;
                if (Intrinsics.EZpvd(gjk, gJK.TaskDescription.copydefault)) {
                    this.this$0.showLoading();
                } else {
                    this.this$0.dismissLoading();
                }
                gJY gjy = gJY.OLrzqt;
                WalletAddressBindViewModel walletAddressBindViewModelEjfBZ = this.this$0.ejfBZ();
                ActivityResultLauncher<BindWalletInput> activityResultLauncher = this.this$0.copydefault;
                gJR gjr = this.this$0.AkhnZx;
                gjy.OLrzqt(this.this$0, walletAddressBindViewModelEjfBZ, gjk, activityResultLauncher, this.this$0.values, gjr, true);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<gJK> sharedFlowCopydefault = this.this$0.ejfBZ().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowCopydefault, anonymousClass1, this) == objCopydefault) {
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
