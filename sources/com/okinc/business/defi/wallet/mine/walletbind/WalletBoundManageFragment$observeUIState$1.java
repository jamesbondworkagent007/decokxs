package com.okinc.business.defi.wallet.mine.walletbind;

import android.widget.RelativeLayout;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C13754dXa;
import o.C16625enU;
import o.C19365fzs;
import o.C33070mpX;
import o.C34703nhO;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletBoundManageFragment$observeUIState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19365fzs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBoundManageFragment$observeUIState$1(C19365fzs c19365fzs, Continuation<? super WalletBoundManageFragment$observeUIState$1> continuation) {
        super(2, continuation);
        this.this$0 = c19365fzs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBoundManageFragment$observeUIState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBoundManageFragment$observeUIState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.walletbind.WalletBoundManageFragment$observeUIState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C19365fzs this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19365fzs c19365fzs, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19365fzs;
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
            C52794wYp c52794wYp;
            String strAYXKKw;
            RecyclerView recyclerView;
            RelativeLayout relativeLayout;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Boolean bool = (Boolean) this.L$0;
                if (bool != null) {
                    C16625enU c16625enU = this.this$0.djBIcL;
                    if (c16625enU != null && (relativeLayout = c16625enU.KWHzl) != null) {
                        relativeLayout.setVisibility(bool.booleanValue() ? 0 : 8);
                    }
                    C16625enU c16625enU2 = this.this$0.djBIcL;
                    if (c16625enU2 != null && (recyclerView = c16625enU2.OLrzqt) != null) {
                        recyclerView.setVisibility(bool.booleanValue() ^ true ? 0 : 8);
                    }
                    C16625enU c16625enU3 = this.this$0.djBIcL;
                    if (c16625enU3 != null && (c52794wYp = c16625enU3.EZpvd) != null) {
                        if (bool.booleanValue()) {
                            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.fetchVPNInfo);
                        } else if (C34703nhO.copydefault()) {
                            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.uzCIH);
                        } else {
                            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AkhnZx);
                        }
                        c52794wYp.setText(strAYXKKw);
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
            StateFlow<Boolean> stateFlowIwGUEr = this.this$0.values().iwGUEr();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Flow flowFlowWithLifecycle$default = FlowExtKt.flowWithLifecycle$default(stateFlowIwGUEr, lifecycle, null, 2, null);
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
