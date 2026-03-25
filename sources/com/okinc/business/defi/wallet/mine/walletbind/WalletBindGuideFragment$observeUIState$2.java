package com.okinc.business.defi.wallet.mine.walletbind;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.okinc.business.defi.wallet.mine.walletbind.WalletBindGuideFragment$observeUIState$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C13754dXa;
import o.C14140dfo;
import o.C19352fzf;
import o.C32866mlf;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54852xXs;
import o.InterfaceC54856xXw;
import o.InterfaceC54859xXz;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletBindGuideFragment$observeUIState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19352fzf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindGuideFragment$observeUIState$2(C19352fzf c19352fzf, Continuation<? super WalletBindGuideFragment$observeUIState$2> continuation) {
        super(2, continuation);
        this.this$0 = c19352fzf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBindGuideFragment$observeUIState$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBindGuideFragment$observeUIState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.walletbind.WalletBindGuideFragment$observeUIState$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C19352fzf this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19352fzf c19352fzf, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19352fzf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
                FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                C14140dfo.showConnectWalletDialog$default(instance$default, childFragmentManager, new InterfaceC54859xXz() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBindGuideFragment.observeUIState.2.1.1
                    @Override // o.InterfaceC54859xXz
                    public void EZpvd() {
                    }
                }, 0, null, yDY.gEmmrt(UnsupportedWalletType.MPCWallet, UnsupportedWalletType.HardwareWallet), C33070mpX.AYXKKw(C13754dXa.FragmentManager.values), new InterfaceC54856xXw() { // from class: o.fzn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC54856xXw
                    public final void OLrzqt(android.os.Bundle bundle) {
                        WalletBindGuideFragment$observeUIState$2.AnonymousClass1.invokeSuspend$lambda$1(bundle);
                    }
                }, new AnonymousClass3(), 12, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(Bundle bundle) {
            if (bundle == null) {
                C32866mlf.onEvent$default("LinkedAccount_AddWallet_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return WalletBindGuideFragment$observeUIState$2.AnonymousClass1.invokeSuspend$lambda$1$lambda$0((EventParamsList) obj);
                    }
                }, 1, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1$lambda$0(EventParamsList eventParamsList) {
            eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "exit_bottomsheet", true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.walletbind.WalletBindGuideFragment$observeUIState$2$1$3, reason: invalid class name */
        public static final class AnonymousClass3 implements InterfaceC54852xXs {
            @Override // o.InterfaceC54852xXs
            public void AEQbTJ() {
                C32866mlf.onEvent$default("LinkedAccount_AddWallet_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return WalletBindGuideFragment$observeUIState$2.AnonymousClass1.AnonymousClass3.EZpvd((EventParamsList) obj);
                    }
                }, 1, (Object) null);
            }

            public static final Unit EZpvd(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "create", true);
                return Unit.INSTANCE;
            }

            @Override // o.InterfaceC54852xXs
            public void copydefault() {
                C32866mlf.onEvent$default("LinkedAccount_AddWallet_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return WalletBindGuideFragment$observeUIState$2.AnonymousClass1.AnonymousClass3.AEQbTJ((EventParamsList) obj);
                    }
                }, 1, (Object) null);
            }

            public static final Unit AEQbTJ(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, Web3SecurityTrackEvent.VALUE_IMPORT, true);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<Unit> sharedFlowKWHzl = this.this$0.values().KWHzl();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Flow flowFlowWithLifecycle$default = FlowExtKt.flowWithLifecycle$default(sharedFlowKWHzl, lifecycle, null, 2, null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFlowWithLifecycle$default, anonymousClass1, this) == objCopydefault) {
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
