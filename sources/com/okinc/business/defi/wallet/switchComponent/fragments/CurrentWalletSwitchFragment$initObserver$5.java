package com.okinc.business.defi.wallet.switchComponent.fragments;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C16694eok;
import o.C33054mpH;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9731bbC;
import o.fQI;

/* JADX INFO: loaded from: classes5.dex */
public final class CurrentWalletSwitchFragment$initObserver$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fQI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentWalletSwitchFragment$initObserver$5(fQI fqi, Continuation<? super CurrentWalletSwitchFragment$initObserver$5> continuation) {
        super(2, continuation);
        this.this$0 = fqi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrentWalletSwitchFragment$initObserver$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrentWalletSwitchFragment$initObserver$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC9731bbC, Continuation<? super Unit>, Object> {
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
        public final Object invoke(InterfaceC9731bbC interfaceC9731bbC, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC9731bbC, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AppCompatTextView appCompatTextView;
            AppCompatImageView appCompatImageView;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC9731bbC interfaceC9731bbC = (InterfaceC9731bbC) this.L$0;
                if (interfaceC9731bbC != null) {
                    C16694eok c16694eok = this.this$0.KWHzl;
                    if (c16694eok != null && (appCompatImageView = c16694eok.OLrzqt) != null) {
                        C33054mpH.KWHzl(appCompatImageView, interfaceC9731bbC.copydefault());
                    }
                    C16694eok c16694eok2 = this.this$0.KWHzl;
                    if (c16694eok2 != null && (appCompatTextView = c16694eok2.copydefault) != null) {
                        appCompatTextView.setText(interfaceC9731bbC.djBIcL());
                    }
                    return Unit.INSTANCE;
                }
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
            StateFlow<InterfaceC9731bbC> stateFlowEZpvd = this.this$0.djBIcL().EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowEZpvd, anonymousClass1, this) == objCopydefault) {
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
