package com.okinc.business.defi.wallet.passkey.cedefi.update.ui.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Checkable;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.OrderStatus;
import com.okinc.components.track.TrackChannel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C13754dXa;
import o.C32866mlf;
import o.C52794wYp;
import o.C55178xez;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.fMM;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class ScanResultActivity$onCreate$2$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C55178xez $this_apply;
    int label;
    final /* synthetic */ fMM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanResultActivity$onCreate$2$3(fMM fmm, C55178xez c55178xez, Continuation<? super ScanResultActivity$onCreate$2$3> continuation) {
        super(2, continuation);
        this.this$0 = fmm;
        this.$this_apply = c55178xez;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScanResultActivity$onCreate$2$3(this.this$0, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScanResultActivity$onCreate$2$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.activity.ScanResultActivity$onCreate$2$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<OrderStatus, Continuation<? super Unit>, Object> {
        final /* synthetic */ C55178xez $this_apply;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fMM this$0;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.activity.ScanResultActivity$onCreate$2$3$1$Activity */
        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[OrderStatus.values().length];
                try {
                    iArr[OrderStatus.PENDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderStatus.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrderStatus.FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fMM fmm, C55178xez c55178xez, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fmm;
            this.$this_apply = c55178xez;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderStatus orderStatus, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(orderStatus, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                int i = Activity.AEQbTJ[((OrderStatus) this.L$0).ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        rVN.reportFullyDrawn$default((android.app.Activity) this.this$0, true, (String) null, 2, (Object) null);
                        this.$this_apply.AEQbTJ().setVisibility(8);
                        C55178xez c55178xez = this.$this_apply;
                        c55178xez.setTitleText(c55178xez.getContext().getString(C13754dXa.FragmentManager.fmdvVn));
                        this.$this_apply.copydefault().setText(this.$this_apply.getContext().getString(C13754dXa.FragmentManager.ORrpqH));
                        this.$this_apply.setStatus(4);
                        C52794wYp c52794wYpCopydefault = this.$this_apply.OLrzqt().copydefault();
                        if (c52794wYpCopydefault != null) {
                            fMM fmm = this.this$0;
                            c52794wYpCopydefault.setVisibility(0);
                            c52794wYpCopydefault.setOKDSType(257);
                            c52794wYpCopydefault.setText(c52794wYpCopydefault.getContext().getString(C13754dXa.FragmentManager.DCJXGO));
                            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, fmm));
                        }
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rVN.reportFullyDrawn$default((android.app.Activity) this.this$0, false, (String) null, 2, (Object) null);
                        this.$this_apply.AEQbTJ().setVisibility(8);
                        C55178xez c55178xez2 = this.$this_apply;
                        c55178xez2.setTitleText(c55178xez2.getContext().getString(C13754dXa.FragmentManager.OUcgGI));
                        this.$this_apply.copydefault().setText(this.$this_apply.getContext().getString(C13754dXa.FragmentManager.zdxASf));
                        this.$this_apply.setStatus(3);
                        C52794wYp c52794wYpCopydefault2 = this.$this_apply.OLrzqt().copydefault();
                        if (c52794wYpCopydefault2 != null) {
                            fMM fmm2 = this.this$0;
                            c52794wYpCopydefault2.setVisibility(0);
                            c52794wYpCopydefault2.setOKDSType(257);
                            c52794wYpCopydefault2.setText(c52794wYpCopydefault2.getContext().getString(C13754dXa.FragmentManager.finit));
                            c52794wYpCopydefault2.setOnClickListener(new ActionBar(c52794wYpCopydefault2, 1000L, fmm2));
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.activity.ScanResultActivity$onCreate$2$3$1$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ fMM EZpvd;
            public final /* synthetic */ View KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(View view, long j, fMM fmm) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.EZpvd = fmm;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    fMM fmm = this.EZpvd;
                    Intent intent = new Intent();
                    intent.putExtra("result_try_again", true);
                    Unit unit = Unit.INSTANCE;
                    fmm.setResult(-1, intent);
                    this.EZpvd.finish();
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.update.ui.activity.ScanResultActivity$onCreate$2$3$1$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ View EZpvd;
            public final /* synthetic */ fMM OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(View view, long j, fMM fmm) {
                this.EZpvd = view;
                this.copydefault = j;
                this.OLrzqt = fmm;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    C32866mlf.onEvent$default("Wallet_PasskeyAdd_Success_Click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
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
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.KWHzl().AEQbTJ());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == objCopydefault) {
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
