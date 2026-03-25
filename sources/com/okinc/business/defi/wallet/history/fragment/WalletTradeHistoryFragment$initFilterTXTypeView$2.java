package com.okinc.business.defi.wallet.history.fragment;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16696eom;
import o.C13754dXa;
import o.C15480eJx;
import o.C15505eKv;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletTradeHistoryFragment$initFilterTXTypeView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15480eJx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletTradeHistoryFragment$initFilterTXTypeView$2(C15480eJx c15480eJx, Continuation<? super WalletTradeHistoryFragment$initFilterTXTypeView$2> continuation) {
        super(2, continuation);
        this.this$0 = c15480eJx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletTradeHistoryFragment$initFilterTXTypeView$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletTradeHistoryFragment$initFilterTXTypeView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$initFilterTXTypeView$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C15480eJx this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15480eJx c15480eJx, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15480eJx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.history.fragment.WalletTradeHistoryFragment$initFilterTXTypeView$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02581 extends SuspendLambda implements Function2<C15505eKv, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C15480eJx this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02581(C15480eJx c15480eJx, Continuation<? super C02581> continuation) {
                super(2, continuation);
                this.this$0 = c15480eJx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02581 c02581 = new C02581(this.this$0, continuation);
                c02581.L$0 = obj;
                return c02581;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(C15505eKv c15505eKv, Continuation<? super Unit> continuation) {
                return ((C02581) create(c15505eKv, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                String strAYXKKw;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C15505eKv c15505eKv = (C15505eKv) this.L$0;
                    this.this$0.KWHzl().AEQbTJ(c15505eKv != null ? c15505eKv.AEQbTJ() : 0);
                    AbstractC16696eom abstractC16696eom = this.this$0.AEQbTJ;
                    if (abstractC16696eom == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16696eom = null;
                    }
                    TextView textViewEZpvd = abstractC16696eom.KWHzl.EZpvd();
                    if (c15505eKv == null || (strAYXKKw = c15505eKv.KWHzl()) == null) {
                        strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnNewIntentListener);
                    }
                    textViewEZpvd.setText(strAYXKKw);
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
                StateFlow<C15505eKv> stateFlowEZpvd = this.this$0.OLrzqt().EZpvd();
                C02581 c02581 = new C02581(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowEZpvd, c02581, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15480eJx c15480eJx = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c15480eJx, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c15480eJx, state, anonymousClass1, this) == objCopydefault) {
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
