package com.okinc.business.defi.wallet.switchComponent.fragments;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C16694eok;
import o.C55230xfy;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.fQI;

/* JADX INFO: loaded from: classes5.dex */
public final class CurrentWalletSwitchFragment$initObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fQI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentWalletSwitchFragment$initObserver$1(fQI fqi, Continuation<? super CurrentWalletSwitchFragment$initObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = fqi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrentWalletSwitchFragment$initObserver$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrentWalletSwitchFragment$initObserver$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
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
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AppCompatTextView appCompatTextView;
            C55230xfy c55230xfy;
            AppCompatTextView appCompatTextView2;
            C55230xfy c55230xfy2;
            C55230xfy c55230xfy3;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.Z$0;
                C16694eok c16694eok = this.this$0.KWHzl;
                if (c16694eok != null && (c55230xfy3 = c16694eok.AYXKKw) != null) {
                    c55230xfy3.setVisibility(z ? 0 : 8);
                }
                Context context = this.this$0.getContext();
                if (context == null) {
                    return Unit.INSTANCE;
                }
                if (z) {
                    C16694eok c16694eok2 = this.this$0.KWHzl;
                    if (c16694eok2 != null && (c55230xfy2 = c16694eok2.AYXKKw) != null) {
                        c55230xfy2.setPaddingRelative(c55230xfy2.getPaddingStart(), c55230xfy2.getPaddingTop(), c55230xfy2.getPaddingEnd(), C55298xhM.copydefault(10.0f, context));
                    }
                    C16694eok c16694eok3 = this.this$0.KWHzl;
                    if (c16694eok3 != null && (appCompatTextView2 = c16694eok3.KWHzl) != null) {
                        ViewGroup.LayoutParams layoutParams = appCompatTextView2.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.topMargin = C55298xhM.copydefault(12.0f, context);
                            appCompatTextView2.setLayoutParams(marginLayoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                } else {
                    C16694eok c16694eok4 = this.this$0.KWHzl;
                    if (c16694eok4 != null && (c55230xfy = c16694eok4.AYXKKw) != null) {
                        c55230xfy.setPaddingRelative(c55230xfy.getPaddingStart(), c55230xfy.getPaddingTop(), c55230xfy.getPaddingEnd(), C55298xhM.copydefault(0.0f, context));
                    }
                    C16694eok c16694eok5 = this.this$0.KWHzl;
                    if (c16694eok5 != null && (appCompatTextView = c16694eok5.KWHzl) != null) {
                        ViewGroup.LayoutParams layoutParams2 = appCompatTextView.getLayoutParams();
                        if (layoutParams2 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams2.topMargin = C55298xhM.copydefault(24.0f, context);
                            appCompatTextView.setLayoutParams(marginLayoutParams2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
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
            StateFlow<Boolean> stateFlowDbNXlk = this.this$0.djBIcL().DbNXlk();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowDbNXlk, anonymousClass1, this) == objCopydefault) {
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
