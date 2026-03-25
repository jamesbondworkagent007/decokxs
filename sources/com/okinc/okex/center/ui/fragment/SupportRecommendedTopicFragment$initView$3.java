package com.okinc.okex.center.ui.fragment;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.viewmodel.SupportRecommendTopicViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC47345toL;
import o.C45099sjR;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportRecommendedTopicFragment$initView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C45099sjR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportRecommendedTopicFragment$initView$3(C45099sjR c45099sjR, Continuation<? super SupportRecommendedTopicFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c45099sjR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportRecommendedTopicFragment$initView$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportRecommendedTopicFragment$initView$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportRecommendedTopicFragment$initView$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<SupportRecommendTopicViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C45099sjR this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C45099sjR c45099sjR, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c45099sjR;
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
        public final Object invoke(SupportRecommendTopicViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SupportRecommendTopicViewModel.StateListAnimator stateListAnimator = (SupportRecommendTopicViewModel.StateListAnimator) this.L$0;
                AbstractC47345toL abstractC47345toL = null;
                if (stateListAnimator instanceof SupportRecommendTopicViewModel.StateListAnimator.ActionBar) {
                    AbstractC47345toL abstractC47345toL2 = this.this$0.DbNXlk;
                    if (abstractC47345toL2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL2 = null;
                    }
                    C55173xeu c55173xeu = abstractC47345toL2.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                    c55173xeu.setVisibility(0);
                    AbstractC47345toL abstractC47345toL3 = this.this$0.DbNXlk;
                    if (abstractC47345toL3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL3 = null;
                    }
                    RecyclerView recyclerView = abstractC47345toL3.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                    recyclerView.setVisibility(8);
                    AbstractC47345toL abstractC47345toL4 = this.this$0.DbNXlk;
                    if (abstractC47345toL4 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL4 = null;
                    }
                    C55113xdn c55113xdn = abstractC47345toL4.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                    c55113xdn.setVisibility(8);
                    this.this$0.fetchVPNInfo().AEQbTJ(false);
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                } else if (stateListAnimator instanceof SupportRecommendTopicViewModel.StateListAnimator.Activity) {
                    AbstractC47345toL abstractC47345toL5 = this.this$0.DbNXlk;
                    if (abstractC47345toL5 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL5 = null;
                    }
                    C55113xdn c55113xdn2 = abstractC47345toL5.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                    c55113xdn2.setVisibility(0);
                    AbstractC47345toL abstractC47345toL6 = this.this$0.DbNXlk;
                    if (abstractC47345toL6 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL6 = null;
                    }
                    RecyclerView recyclerView2 = abstractC47345toL6.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                    recyclerView2.setVisibility(8);
                    AbstractC47345toL abstractC47345toL7 = this.this$0.DbNXlk;
                    if (abstractC47345toL7 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC47345toL = abstractC47345toL7;
                    }
                    C55173xeu c55173xeu2 = abstractC47345toL.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                    c55173xeu2.setVisibility(8);
                    this.this$0.fetchVPNInfo().AEQbTJ(false);
                } else if (stateListAnimator instanceof SupportRecommendTopicViewModel.StateListAnimator.Application) {
                    AbstractC47345toL abstractC47345toL8 = this.this$0.DbNXlk;
                    if (abstractC47345toL8 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL8 = null;
                    }
                    C55113xdn c55113xdn3 = abstractC47345toL8.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                    c55113xdn3.setVisibility(8);
                    AbstractC47345toL abstractC47345toL9 = this.this$0.DbNXlk;
                    if (abstractC47345toL9 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL9 = null;
                    }
                    RecyclerView recyclerView3 = abstractC47345toL9.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                    recyclerView3.setVisibility(0);
                    AbstractC47345toL abstractC47345toL10 = this.this$0.DbNXlk;
                    if (abstractC47345toL10 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL10 = null;
                    }
                    C55173xeu c55173xeu3 = abstractC47345toL10.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                    c55173xeu3.setVisibility(8);
                    this.this$0.fetchVPNInfo().AEQbTJ(false);
                    this.this$0.KWHzl((List<? extends TopicListItem>) ((SupportRecommendTopicViewModel.StateListAnimator.Application) stateListAnimator).OLrzqt());
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else if (stateListAnimator instanceof SupportRecommendTopicViewModel.StateListAnimator.C0543StateListAnimator) {
                    AbstractC47345toL abstractC47345toL11 = this.this$0.DbNXlk;
                    if (abstractC47345toL11 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL11 = null;
                    }
                    C55173xeu c55173xeu4 = abstractC47345toL11.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu4, "");
                    c55173xeu4.setVisibility(8);
                    AbstractC47345toL abstractC47345toL12 = this.this$0.DbNXlk;
                    if (abstractC47345toL12 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL12 = null;
                    }
                    RecyclerView recyclerView4 = abstractC47345toL12.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
                    recyclerView4.setVisibility(0);
                    AbstractC47345toL abstractC47345toL13 = this.this$0.DbNXlk;
                    if (abstractC47345toL13 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC47345toL = abstractC47345toL13;
                    }
                    C55113xdn c55113xdn4 = abstractC47345toL.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
                    c55113xdn4.setVisibility(8);
                    this.this$0.fetchVPNInfo().AEQbTJ(true);
                } else {
                    throw new NoWhenBranchMatchedException();
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
            StateFlow<SupportRecommendTopicViewModel.StateListAnimator> stateFlowEZpvd = this.this$0.djBIcL().EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowEZpvd, anonymousClass1, this) == objCopydefault) {
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
