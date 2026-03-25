package com.okinc.okex.center.ui.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.ui.adapter.TopicListHomeCardAdapter;
import com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC47416tpd;
import o.C45146skL;
import o.C45175sko;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportTopTopicsListFragment$initView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C45175sko this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTopTopicsListFragment$initView$2(C45175sko c45175sko, Continuation<? super SupportTopTopicsListFragment$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = c45175sko;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportTopTopicsListFragment$initView$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportTopTopicsListFragment$initView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportTopTopicsListFragment$initView$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C45175sko this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C45175sko c45175sko, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c45175sko;
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

        /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportTopTopicsListFragment$initView$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05411 extends SuspendLambda implements Function2<SupportCenterHomeViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C45175sko this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05411(C45175sko c45175sko, Continuation<? super C05411> continuation) {
                super(2, continuation);
                this.this$0 = c45175sko;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05411 c05411 = new C05411(this.this$0, continuation);
                c05411.L$0 = obj;
                return c05411;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportCenterHomeViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                return ((C05411) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SupportCenterHomeViewModel.StateListAnimator stateListAnimator = (SupportCenterHomeViewModel.StateListAnimator) this.L$0;
                    if (!(stateListAnimator instanceof SupportCenterHomeViewModel.StateListAnimator.Activity)) {
                        this.this$0.KWHzl(false);
                    } else {
                        SupportCenterHomeViewModel.StateListAnimator.Activity activity = (SupportCenterHomeViewModel.StateListAnimator.Activity) stateListAnimator;
                        List<TopicListItem> listAhwBna = activity.AhwBna();
                        if (!listAhwBna.isEmpty()) {
                            this.this$0.KWHzl(true);
                            TopicListHomeCardAdapter topicListHomeCardAdapterOLrzqt = this.this$0.OLrzqt();
                            AbstractC47416tpd abstractC47416tpd = this.this$0.OLrzqt;
                            if (abstractC47416tpd == null) {
                                Intrinsics.gEmmrt("");
                                abstractC47416tpd = null;
                            }
                            RecyclerView recyclerView = abstractC47416tpd.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                            topicListHomeCardAdapterOLrzqt.copydefault(recyclerView, (List) listAhwBna);
                            AbstractC47416tpd abstractC47416tpd2 = this.this$0.OLrzqt;
                            if (abstractC47416tpd2 == null) {
                                Intrinsics.gEmmrt("");
                                abstractC47416tpd2 = null;
                            }
                            C45146skL c45146skL = abstractC47416tpd2.KWHzl;
                            Intrinsics.checkNotNullExpressionValue(c45146skL, "");
                            c45146skL.setVisibility(activity.AYXKKw() ^ true ? 8 : 0);
                        } else {
                            this.this$0.KWHzl(false);
                        }
                        rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
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
                StateFlow<SupportCenterHomeViewModel.StateListAnimator> stateFlowDjBIcL = this.this$0.KWHzl().djBIcL();
                C05411 c05411 = new C05411(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowDjBIcL, c05411, this) == objCopydefault) {
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
            C45175sko c45175sko = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c45175sko, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c45175sko, state, anonymousClass1, this) == objCopydefault) {
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
