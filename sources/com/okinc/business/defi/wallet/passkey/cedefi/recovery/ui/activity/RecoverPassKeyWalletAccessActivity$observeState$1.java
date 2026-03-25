package com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity;

import android.view.View;
import android.widget.Checkable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC17078evx;
import o.C13754dXa;
import o.C17637fMs;
import o.C52794wYp;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.fLW;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class RecoverPassKeyWalletAccessActivity$observeState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fLW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverPassKeyWalletAccessActivity$observeState$1(fLW flw, Continuation<? super RecoverPassKeyWalletAccessActivity$observeState$1> continuation) {
        super(2, continuation);
        this.this$0 = flw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoverPassKeyWalletAccessActivity$observeState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoverPassKeyWalletAccessActivity$observeState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletAccessActivity$observeState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C17637fMs>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fLW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fLW flw, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = flw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C17637fMs> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<C17637fMs>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<C17637fMs> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    this.this$0.isConnected();
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    this.this$0.AhwBna();
                    AbstractC17078evx abstractC17078evx = null;
                    rVN.reportFullyDrawn$default((android.app.Activity) this.this$0, true, (String) null, 2, (Object) null);
                    InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
                    if (((C17637fMs) activity.copydefault()).AEQbTJ()) {
                        AbstractC17078evx abstractC17078evx2 = this.this$0.gEmmrt;
                        if (abstractC17078evx2 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC17078evx2 = null;
                        }
                        abstractC17078evx2.KWHzl.setText(this.this$0.getString(C13754dXa.FragmentManager.QzqeNH));
                        AbstractC17078evx abstractC17078evx3 = this.this$0.gEmmrt;
                        if (abstractC17078evx3 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC17078evx = abstractC17078evx3;
                        }
                        C52794wYp c52794wYp = abstractC17078evx.KWHzl;
                        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this.this$0));
                        this.this$0.djBIcL();
                    } else if (((C17637fMs) activity.copydefault()).EZpvd()) {
                        AbstractC17078evx abstractC17078evx4 = this.this$0.gEmmrt;
                        if (abstractC17078evx4 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC17078evx4 = null;
                        }
                        abstractC17078evx4.KWHzl.setText(this.this$0.getString(C13754dXa.FragmentManager.QzqeNH));
                        AbstractC17078evx abstractC17078evx5 = this.this$0.gEmmrt;
                        if (abstractC17078evx5 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC17078evx = abstractC17078evx5;
                        }
                        C52794wYp c52794wYp2 = abstractC17078evx.KWHzl;
                        c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, this.this$0));
                        this.this$0.gEmmrt();
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    this.this$0.DbNXlk();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletAccessActivity$observeState$1$1$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ fLW AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ View OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(View view, long j, fLW flw) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.AEQbTJ = flw;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.AEQbTJ.finish();
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletAccessActivity$observeState$1$1$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ View EZpvd;
            public final /* synthetic */ fLW OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(View view, long j, fLW flw) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.OLrzqt = flw;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.OLrzqt.finish();
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
            StateFlow<InterfaceC49371unL<C17637fMs>> stateFlowCopydefault = this.this$0.AYXKKw().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowCopydefault, anonymousClass1, this) == objCopydefault) {
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
