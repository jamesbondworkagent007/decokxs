package com.okinc.okex.center.ui.fragment;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC44878sfI;
import o.C44901sff;
import o.C45124sjq;
import o.C47348toO;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportRecentActivitiesCardFragment$initView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C45124sjq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportRecentActivitiesCardFragment$initView$1(C45124sjq c45124sjq, Continuation<? super SupportRecentActivitiesCardFragment$initView$1> continuation) {
        super(2, continuation);
        this.this$0 = c45124sjq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportRecentActivitiesCardFragment$initView$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportRecentActivitiesCardFragment$initView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesCardFragment$initView$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C45124sjq this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C45124sjq c45124sjq, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c45124sjq;
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

        /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesCardFragment$initView$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05391 extends SuspendLambda implements Function2<SupportCenterHomeViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C45124sjq this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05391(C45124sjq c45124sjq, Continuation<? super C05391> continuation) {
                super(2, continuation);
                this.this$0 = c45124sjq;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05391 c05391 = new C05391(this.this$0, continuation);
                c05391.L$0 = obj;
                return c05391;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportCenterHomeViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                return ((C05391) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                LinearLayout root;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SupportCenterHomeViewModel.StateListAnimator stateListAnimator = (SupportCenterHomeViewModel.StateListAnimator) this.L$0;
                    if (stateListAnimator instanceof SupportCenterHomeViewModel.StateListAnimator.Activity) {
                        Pair<Boolean, Integer> pairKWHzl = ((SupportCenterHomeViewModel.StateListAnimator.Activity) stateListAnimator).KWHzl();
                        this.this$0.AEQbTJ(pairKWHzl.getFirst().booleanValue());
                        this.this$0.EZpvd(pairKWHzl.getSecond().intValue());
                        C47348toO c47348toO = this.this$0.valueOf;
                        if (c47348toO != null && (root = c47348toO.getRoot()) != null) {
                            root.setOnClickListener(new StateListAnimator(root, 1000L, this.this$0));
                        }
                        rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesCardFragment$initView$1$1$1$StateListAnimator */
            public static final class StateListAnimator implements View.OnClickListener {
                public final /* synthetic */ long EZpvd;
                public final /* synthetic */ C45124sjq KWHzl;
                public final /* synthetic */ View OLrzqt;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public StateListAnimator(View view, long j, C45124sjq c45124sjq) {
                    this.OLrzqt = view;
                    this.EZpvd = j;
                    this.KWHzl = c45124sjq;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                        C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                        C44901sff.copydefault.EZpvd();
                        C45124sjq c45124sjq = this.KWHzl;
                        ActivityC44878sfI.StateListAnimator stateListAnimator = ActivityC44878sfI.Companion;
                        Context applicationContext = c45124sjq.requireContext().getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                        c45124sjq.startActivity(ActivityC44878sfI.StateListAnimator.createIntent$default(stateListAnimator, applicationContext, null, 2, null));
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
                StateFlow<SupportCenterHomeViewModel.StateListAnimator> stateFlowDjBIcL = this.this$0.OLrzqt().djBIcL();
                C05391 c05391 = new C05391(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowDjBIcL, c05391, this) == objCopydefault) {
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
            C45124sjq c45124sjq = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c45124sjq, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c45124sjq, state, anonymousClass1, this) == objCopydefault) {
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
