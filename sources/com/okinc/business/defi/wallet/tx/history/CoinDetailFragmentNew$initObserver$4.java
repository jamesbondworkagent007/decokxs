package com.okinc.business.defi.wallet.tx.history;

import android.view.View;
import android.widget.TextView;
import com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$initObserver$4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16521elW;
import o.C56391yDq;
import o.C56442yFn;
import o.gBT;

/* JADX INFO: loaded from: classes5.dex */
public final class CoinDetailFragmentNew$initObserver$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CoinDetailFragmentNew this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailFragmentNew$initObserver$4(CoinDetailFragmentNew coinDetailFragmentNew, Continuation<? super CoinDetailFragmentNew$initObserver$4> continuation) {
        super(2, continuation);
        this.this$0 = coinDetailFragmentNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinDetailFragmentNew$initObserver$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinDetailFragmentNew$initObserver$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$initObserver$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ CoinDetailFragmentNew this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CoinDetailFragmentNew coinDetailFragmentNew, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = coinDetailFragmentNew;
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
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.Z$0;
                if (!this.this$0.sSMYrx().OLrzqt() && z) {
                    this.this$0.sSMYrx().copydefault();
                    AbstractC16521elW abstractC16521elW = this.this$0.AYXKKw;
                    if (abstractC16521elW == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW = null;
                    }
                    abstractC16521elW.fetchVPNInfo.addOnLayoutChangeListener(new AnonymousClass4(this.this$0));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$initObserver$4$1$4, reason: invalid class name */
        public static final class AnonymousClass4 implements View.OnLayoutChangeListener {
            public final /* synthetic */ CoinDetailFragmentNew EZpvd;

            public AnonymousClass4(CoinDetailFragmentNew coinDetailFragmentNew) {
                this.EZpvd = coinDetailFragmentNew;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                AbstractC16521elW abstractC16521elW = this.EZpvd.AYXKKw;
                if (abstractC16521elW == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW = null;
                }
                TextView textView = abstractC16521elW.fetchVPNInfo;
                final CoinDetailFragmentNew coinDetailFragmentNew = this.EZpvd;
                textView.postDelayed(new Runnable() { // from class: o.gAs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoinDetailFragmentNew$initObserver$4.AnonymousClass1.AnonymousClass4.AEQbTJ(coinDetailFragmentNew);
                    }
                }, 400L);
            }

            public static final void AEQbTJ(CoinDetailFragmentNew coinDetailFragmentNew) {
                gBT gbt = coinDetailFragmentNew.AuCTelauCTel;
                if (gbt != null) {
                    AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
                    if (abstractC16521elW == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW = null;
                    }
                    TextView textView = abstractC16521elW.fetchVPNInfo;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    gbt.showGuild(textView);
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Boolean> stateFlowKWHzl = this.this$0.sSMYrx().KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowKWHzl, anonymousClass1, this) == objCopydefault) {
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
