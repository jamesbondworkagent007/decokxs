package com.okinc.business.defi.wallet.connect;

import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ActivityC16031ecJ;
import o.ActivityC18418fhy;
import o.C10854bwM;
import o.C10954byG;
import o.C13754dXa;
import o.C16103edc;
import o.C16297ehK;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletTrackerAddressActivity$onCreate$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C16297ehK $binding;
    int label;
    final /* synthetic */ ActivityC16031ecJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletTrackerAddressActivity$onCreate$8(ActivityC16031ecJ activityC16031ecJ, C16297ehK c16297ehK, Continuation<? super DefiWalletTrackerAddressActivity$onCreate$8> continuation) {
        super(2, continuation);
        this.this$0 = activityC16031ecJ;
        this.$binding = c16297ehK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletTrackerAddressActivity$onCreate$8(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletTrackerAddressActivity$onCreate$8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity$onCreate$8$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C16297ehK $binding;
        int label;
        final /* synthetic */ ActivityC16031ecJ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC16031ecJ activityC16031ecJ, C16297ehK c16297ehK, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC16031ecJ;
            this.$binding = c16297ehK;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<C16103edc.Activity> flowKWHzl = this.this$0.AYXKKw().KWHzl();
                final ActivityC16031ecJ activityC16031ecJ = this.this$0;
                final C16297ehK c16297ehK = this.$binding;
                FlowCollector<? super C16103edc.Activity> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.connect.DefiWalletTrackerAddressActivity.onCreate.8.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C16103edc.Activity activity, Continuation<? super Unit> continuation) {
                        long jLongValue;
                        activityC16031ecJ.dismissLoading();
                        int iEZpvd = activity.EZpvd();
                        C16103edc.Application.ActionBar actionBar = C16103edc.Application.Companion;
                        if (C16103edc.Application.KWHzl(iEZpvd, actionBar.KWHzl())) {
                            C52794wYp c52794wYpCopydefault = c16297ehK.copydefault.copydefault();
                            if (c52794wYpCopydefault != null) {
                                c52794wYpCopydefault.setEnabled(false);
                            }
                            TextView textView = c16297ehK.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(textView, "");
                            textView.setVisibility(0);
                            c16297ehK.AEQbTJ.setText(C13754dXa.FragmentManager.PipHintTrackerKttrackPipAnimationHintViewflow11);
                        } else if (C16103edc.Application.KWHzl(iEZpvd, actionBar.AEQbTJ()) || C16103edc.Application.KWHzl(iEZpvd, actionBar.copydefault())) {
                            C10854bwM c10854bwMAuCTel = C10954byG.EZpvd.valueOf().AuCTel();
                            if (C16103edc.Application.KWHzl(activity.EZpvd()) && c10854bwMAuCTel != null) {
                                jLongValue = c10854bwMAuCTel.AEQbTJ();
                            } else {
                                Long lAEQbTJ = activity.AEQbTJ();
                                jLongValue = lAEQbTJ != null ? lAEQbTJ.longValue() : 0L;
                            }
                            activityC16031ecJ.AYXKKw().KWHzl(jLongValue, activity.KWHzl());
                        } else {
                            ActivityC18418fhy.StateListAnimator stateListAnimator = ActivityC18418fhy.Companion;
                            ActivityC16031ecJ activityC16031ecJ2 = activityC16031ecJ;
                            String strOLrzqt = activity.OLrzqt();
                            stateListAnimator.OLrzqt(activityC16031ecJ2, (784 & 2) != 0 ? "" : strOLrzqt == null ? "" : strOLrzqt, (784 & 4) != 0 ? "" : null, (784 & 8) != 0 ? "" : activity.KWHzl(), (784 & 16) == 0 ? null : "", (784 & 32) != 0 ? 1 : 0, (784 & 64) != 0 ? false : false, (784 & 128) == 0 ? C16103edc.Application.KWHzl(activity.EZpvd()) : false, (784 & 256) != 0 ? null : null, (784 & 512) == 0 ? null : null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowKWHzl.collect(flowCollector, this) == objCopydefault) {
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
            ActivityC16031ecJ activityC16031ecJ = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC16031ecJ, this.$binding, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC16031ecJ, state, anonymousClass1, this) == objCopydefault) {
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
