package com.okinc.business.defi.wallet.switchComponent.fragments;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$4;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C16694eok;
import o.C17748fQv;
import o.C56391yDq;
import o.C56442yFn;
import o.fQI;

/* JADX INFO: loaded from: classes5.dex */
public final class CurrentWalletSwitchFragment$initObserver$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fQI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentWalletSwitchFragment$initObserver$4(fQI fqi, Continuation<? super CurrentWalletSwitchFragment$initObserver$4> continuation) {
        super(2, continuation);
        this.this$0 = fqi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrentWalletSwitchFragment$initObserver$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrentWalletSwitchFragment$initObserver$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fQI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fQI fqi, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fqi;
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
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AppCompatImageView appCompatImageView;
            int i;
            ConstraintLayout constraintLayout;
            ConstraintLayout constraintLayout2;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Boolean bool = (Boolean) this.L$0;
                if (bool != null) {
                    C16694eok c16694eok = this.this$0.KWHzl;
                    if (c16694eok != null && (appCompatImageView = c16694eok.EZpvd) != null) {
                        if (bool.booleanValue()) {
                            C16694eok c16694eok2 = this.this$0.KWHzl;
                            if (c16694eok2 != null && (constraintLayout2 = c16694eok2.djBIcL) != null) {
                                final fQI fqi = this.this$0;
                                constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.fRi
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(android.view.View view) {
                                        CurrentWalletSwitchFragment$initObserver$4.AnonymousClass1.invokeSuspend$lambda$1(fqi, view);
                                    }
                                });
                            }
                            i = 0;
                        } else {
                            C16694eok c16694eok3 = this.this$0.KWHzl;
                            if (c16694eok3 != null && (constraintLayout = c16694eok3.djBIcL) != null) {
                                constraintLayout.setOnClickListener(null);
                            }
                            i = 8;
                        }
                        appCompatImageView.setVisibility(i);
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(fQI fqi, View view) {
            CurrentWalletSwitchConfig currentWalletSwitchConfigKWHzl = fqi.djBIcL().KWHzl();
            CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkModeCopydefault = currentWalletSwitchConfigKWHzl != null ? currentWalletSwitchConfigKWHzl.copydefault() : null;
            CurrentWalletSwitchNetworkMode.MultipleNetworks multipleNetworks = currentWalletSwitchNetworkModeCopydefault instanceof CurrentWalletSwitchNetworkMode.MultipleNetworks ? (CurrentWalletSwitchNetworkMode.MultipleNetworks) currentWalletSwitchNetworkModeCopydefault : null;
            if (multipleNetworks != null) {
                C17748fQv c17748fQvKWHzl = C17748fQv.Companion.KWHzl(fqi.djBIcL().AEQbTJ().getValue().longValue(), multipleNetworks.OLrzqt(), multipleNetworks.AEQbTJ());
                FragmentManager childFragmentManager = fqi.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c17748fQvKWHzl.show(childFragmentManager);
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Boolean> stateFlowAYXKKw = this.this$0.djBIcL().AYXKKw();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAYXKKw, anonymousClass1, this) == objCopydefault) {
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
