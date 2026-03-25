package com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment;

import android.view.View;
import android.widget.Checkable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC18226feR;
import o.C13754dXa;
import o.C14728dqt;
import o.C16698eoo;
import o.C18254fet;
import o.C33070mpX;
import o.C52794wYp;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiUsdgOnboardFragment$observeAddressBalanceState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18254fet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiUsdgOnboardFragment$observeAddressBalanceState$1(C18254fet c18254fet, Continuation<? super DefiUsdgOnboardFragment$observeAddressBalanceState$1> continuation) {
        super(2, continuation);
        this.this$0 = c18254fet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiUsdgOnboardFragment$observeAddressBalanceState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiUsdgOnboardFragment$observeAddressBalanceState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeAddressBalanceState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC18226feR.StateListAnimator, Continuation<? super Unit>, Object> {
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
        public final Object invoke(AbstractC18226feR.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.usdgActivity.ui.fragment.DefiUsdgOnboardFragment$observeAddressBalanceState$1$1$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ View EZpvd;
            public final /* synthetic */ C18254fet OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(View view, long j, C18254fet c18254fet) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.OLrzqt = c18254fet;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.OLrzqt.iwGUEr();
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C52794wYp c52794wYp;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (((AbstractC18226feR.StateListAnimator) this.L$0).EZpvd()) {
                    C16698eoo c16698eoo = this.this$0.valueOf;
                    if (c16698eoo != null && (c52794wYp = c16698eoo.AEQbTJ) != null) {
                        C18254fet c18254fet = this.this$0;
                        c52794wYp.fIwbmz();
                        c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hijVBL));
                        c52794wYp.setEnabled(true);
                        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, c18254fet));
                    }
                } else if (C14728dqt.KWHzl.KWHzl()) {
                    this.this$0.getFieldNames().OLrzqt(false);
                } else {
                    this.this$0.getFieldNames().copydefault();
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
            SharedFlow<AbstractC18226feR.StateListAnimator> sharedFlowFetchVPNInfo = this.this$0.getFieldNames().fetchVPNInfo();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowFetchVPNInfo, anonymousClass1, this) == objCopydefault) {
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
