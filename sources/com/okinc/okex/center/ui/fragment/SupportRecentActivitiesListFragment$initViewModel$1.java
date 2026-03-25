package com.okinc.okex.center.ui.fragment;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC45154skT;
import o.AbstractC47345toL;
import o.C45224slk;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportRecentActivitiesListFragment$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<AbstractC45154skT> $combinedStateFlow;
    int label;
    final /* synthetic */ SupportRecentActivitiesListFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.flow.Flow<? extends o.skT> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SupportRecentActivitiesListFragment$initViewModel$1(Flow<? extends AbstractC45154skT> flow, SupportRecentActivitiesListFragment supportRecentActivitiesListFragment, Continuation<? super SupportRecentActivitiesListFragment$initViewModel$1> continuation) {
        super(2, continuation);
        this.$combinedStateFlow = flow;
        this.this$0 = supportRecentActivitiesListFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportRecentActivitiesListFragment$initViewModel$1(this.$combinedStateFlow, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportRecentActivitiesListFragment$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.SupportRecentActivitiesListFragment$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC45154skT, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SupportRecentActivitiesListFragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SupportRecentActivitiesListFragment supportRecentActivitiesListFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = supportRecentActivitiesListFragment;
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
        public final Object invoke(AbstractC45154skT abstractC45154skT, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC45154skT, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC45154skT abstractC45154skT = (AbstractC45154skT) this.L$0;
                AbstractC47345toL abstractC47345toL = null;
                if (abstractC45154skT instanceof AbstractC45154skT.Activity) {
                    AbstractC47345toL abstractC47345toL2 = this.this$0.AkhnZx;
                    if (abstractC47345toL2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL2 = null;
                    }
                    RecyclerView recyclerView = abstractC47345toL2.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                    recyclerView.setVisibility(8);
                    AbstractC47345toL abstractC47345toL3 = this.this$0.AkhnZx;
                    if (abstractC47345toL3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL3 = null;
                    }
                    C55173xeu c55173xeu = abstractC47345toL3.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                    c55173xeu.setVisibility(0);
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                } else if (abstractC45154skT instanceof AbstractC45154skT.ActionBar) {
                    AbstractC47345toL abstractC47345toL4 = this.this$0.AkhnZx;
                    if (abstractC47345toL4 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL4 = null;
                    }
                    RecyclerView recyclerView2 = abstractC47345toL4.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                    recyclerView2.setVisibility(8);
                    AbstractC47345toL abstractC47345toL5 = this.this$0.AkhnZx;
                    if (abstractC47345toL5 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC47345toL = abstractC47345toL5;
                    }
                    C55173xeu c55173xeu2 = abstractC47345toL.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                    c55173xeu2.setVisibility(8);
                } else if (abstractC45154skT instanceof AbstractC45154skT.StateListAnimator) {
                    AbstractC47345toL abstractC47345toL6 = this.this$0.AkhnZx;
                    if (abstractC47345toL6 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC47345toL6 = null;
                    }
                    RecyclerView recyclerView3 = abstractC47345toL6.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                    recyclerView3.setVisibility(0);
                    C45224slk c45224slkIsConnected = this.this$0.isConnected();
                    AbstractC45154skT.StateListAnimator stateListAnimator = (AbstractC45154skT.StateListAnimator) abstractC45154skT;
                    List<TransactionDisplayModelV2> listAhwBna = stateListAnimator.OLrzqt().get(this.this$0.isConnected().OLrzqt());
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    c45224slkIsConnected.AEQbTJ(listAhwBna, stateListAnimator.copydefault().get(this.this$0.isConnected().OLrzqt()));
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else if (abstractC45154skT instanceof AbstractC45154skT.TaskDescription) {
                    AbstractC47345toL abstractC47345toL7 = this.this$0.AkhnZx;
                    if (abstractC47345toL7 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC47345toL = abstractC47345toL7;
                    }
                    RecyclerView recyclerView4 = abstractC47345toL.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
                    recyclerView4.setVisibility(0);
                    AbstractC45154skT.TaskDescription taskDescription = (AbstractC45154skT.TaskDescription) abstractC45154skT;
                    this.this$0.isConnected().copydefault(taskDescription.OLrzqt(), taskDescription.AEQbTJ());
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
            Flow<AbstractC45154skT> flow = this.$combinedStateFlow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, anonymousClass1, this) == objCopydefault) {
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
