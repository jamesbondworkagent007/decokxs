package com.okinc.business.defi.wallet.tx.history;

import android.view.View;
import android.widget.TextView;
import com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$initObserver$4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16581emd;
import o.C19422gBu;
import o.C56391yDq;
import o.C56442yFn;
import o.gBT;

/* JADX INFO: loaded from: classes5.dex */
public final class OverviewCoinDetailFragment$initObserver$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19422gBu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewCoinDetailFragment$initObserver$4(C19422gBu c19422gBu, Continuation<? super OverviewCoinDetailFragment$initObserver$4> continuation) {
        super(2, continuation);
        this.this$0 = c19422gBu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverviewCoinDetailFragment$initObserver$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverviewCoinDetailFragment$initObserver$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$initObserver$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C19422gBu this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19422gBu c19422gBu, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19422gBu;
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
                if (this.Z$0) {
                    AbstractC16581emd abstractC16581emd = this.this$0.AkhnZx;
                    if (abstractC16581emd == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16581emd = null;
                    }
                    abstractC16581emd.djBIcL.addOnLayoutChangeListener(new AnonymousClass5(this.this$0));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$initObserver$4$1$5, reason: invalid class name */
        public static final class AnonymousClass5 implements View.OnLayoutChangeListener {
            public final /* synthetic */ C19422gBu EZpvd;

            public AnonymousClass5(C19422gBu c19422gBu) {
                this.EZpvd = c19422gBu;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                AbstractC16581emd abstractC16581emd = this.EZpvd.AkhnZx;
                AbstractC16581emd abstractC16581emd2 = null;
                if (abstractC16581emd == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16581emd = null;
                }
                abstractC16581emd.djBIcL.removeOnLayoutChangeListener(this);
                AbstractC16581emd abstractC16581emd3 = this.EZpvd.AkhnZx;
                if (abstractC16581emd3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16581emd2 = abstractC16581emd3;
                }
                TextView textView = abstractC16581emd2.djBIcL;
                final C19422gBu c19422gBu = this.EZpvd;
                textView.postDelayed(new Runnable() { // from class: o.gBN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        OverviewCoinDetailFragment$initObserver$4.AnonymousClass1.AnonymousClass5.AEQbTJ(c19422gBu);
                    }
                }, 400L);
            }

            public static final void AEQbTJ(C19422gBu c19422gBu) {
                gBT gbt = c19422gBu.DbNXlk;
                if (gbt != null) {
                    AbstractC16581emd abstractC16581emd = c19422gBu.AkhnZx;
                    if (abstractC16581emd == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16581emd = null;
                    }
                    TextView textView = abstractC16581emd.djBIcL;
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
            StateFlow<Boolean> stateFlowKWHzl = this.this$0.gEmmrt().KWHzl();
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
