package com.okinc.kline.ui.unlock.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C36098oPe;
import o.C39690pxB;
import o.C52761wXj;
import o.C55173xeu;
import o.C55237xgE;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes23.dex */
public final class UnlockTokenEventListFragment$initView$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C39690pxB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokenEventListFragment$initView$3(C39690pxB c39690pxB, Continuation<? super UnlockTokenEventListFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c39690pxB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnlockTokenEventListFragment$initView$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnlockTokenEventListFragment$initView$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.UnlockTokenEventListFragment$initView$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CombinedLoadStates, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C39690pxB this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C39690pxB c39690pxB, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c39690pxB;
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
        public final Object invoke(CombinedLoadStates combinedLoadStates, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(combinedLoadStates, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C55237xgE c55237xgE;
            C55237xgE c55237xgE2;
            C55237xgE c55237xgE3;
            C55237xgE c55237xgE4;
            C55237xgE c55237xgE5;
            C55237xgE c55237xgE6;
            View viewAEQbTJ;
            C55173xeu c55173xeu;
            C55237xgE c55237xgE7;
            C55237xgE c55237xgE8;
            C55237xgE c55237xgE9;
            View viewAEQbTJ2;
            C55173xeu c55173xeu2;
            C55237xgE c55237xgE10;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CombinedLoadStates combinedLoadStates = (CombinedLoadStates) this.L$0;
                C39690pxB.Application application = this.this$0.copydefault;
                boolean z = application != null && application.getItemCount() == 0;
                boolean z2 = (combinedLoadStates.getRefresh() instanceof LoadState.NotLoading) && z;
                boolean z3 = (combinedLoadStates.getRefresh() instanceof LoadState.Loading) && z;
                if (z2) {
                    C36098oPe c36098oPeAEQbTJ = this.this$0.AEQbTJ();
                    if (c36098oPeAEQbTJ != null && (c55237xgE10 = c36098oPeAEQbTJ.EZpvd) != null) {
                        c55237xgE10.setStatus(StatefulView.Status.Empty);
                    }
                    C36098oPe c36098oPeAEQbTJ2 = this.this$0.AEQbTJ();
                    if (c36098oPeAEQbTJ2 != null && (c55237xgE9 = c36098oPeAEQbTJ2.EZpvd) != null && (viewAEQbTJ2 = c55237xgE9.AEQbTJ(StatefulView.Status.Error)) != null && (c55173xeu2 = (C55173xeu) viewAEQbTJ2.findViewById(C52761wXj.FragmentManager.gasjUx)) != null) {
                        this.this$0.EZpvd(c55173xeu2);
                    }
                    C36098oPe c36098oPeAEQbTJ3 = this.this$0.AEQbTJ();
                    if (c36098oPeAEQbTJ3 != null && (c55237xgE8 = c36098oPeAEQbTJ3.EZpvd) != null) {
                        c55237xgE8.setVisibility(0);
                    }
                }
                boolean z4 = (combinedLoadStates.getRefresh() instanceof LoadState.Error) && z;
                if (z4) {
                    C36098oPe c36098oPeAEQbTJ4 = this.this$0.AEQbTJ();
                    if (c36098oPeAEQbTJ4 != null && (c55237xgE7 = c36098oPeAEQbTJ4.EZpvd) != null) {
                        c55237xgE7.setStatus(StatefulView.Status.Error);
                    }
                    C36098oPe c36098oPeAEQbTJ5 = this.this$0.AEQbTJ();
                    if (c36098oPeAEQbTJ5 != null && (c55237xgE6 = c36098oPeAEQbTJ5.EZpvd) != null && (viewAEQbTJ = c55237xgE6.AEQbTJ(StatefulView.Status.Error)) != null && (c55173xeu = (C55173xeu) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.gasjUx)) != null) {
                        this.this$0.OLrzqt(c55173xeu);
                    }
                    C36098oPe c36098oPeAEQbTJ6 = this.this$0.AEQbTJ();
                    if (c36098oPeAEQbTJ6 != null && (c55237xgE5 = c36098oPeAEQbTJ6.EZpvd) != null) {
                        c55237xgE5.setVisibility(0);
                    }
                }
                if (z3) {
                    C36098oPe c36098oPeAEQbTJ7 = this.this$0.AEQbTJ();
                    if (c36098oPeAEQbTJ7 != null && (c55237xgE4 = c36098oPeAEQbTJ7.EZpvd) != null) {
                        c55237xgE4.setStatus(StatefulView.Status.Loading);
                    }
                    C36098oPe c36098oPeAEQbTJ8 = this.this$0.AEQbTJ();
                    if (c36098oPeAEQbTJ8 != null && (c55237xgE3 = c36098oPeAEQbTJ8.EZpvd) != null) {
                        c55237xgE3.setVisibility(0);
                    }
                }
                if (!z4 && !z2 && !z3) {
                    C36098oPe c36098oPeAEQbTJ9 = this.this$0.AEQbTJ();
                    if (c36098oPeAEQbTJ9 != null && (c55237xgE2 = c36098oPeAEQbTJ9.EZpvd) != null) {
                        c55237xgE2.setStatus(StatefulView.Status.Content);
                    }
                    C36098oPe c36098oPeAEQbTJ10 = this.this$0.AEQbTJ();
                    if (c36098oPeAEQbTJ10 != null && (c55237xgE = c36098oPeAEQbTJ10.EZpvd) != null) {
                        c55237xgE.setVisibility(8);
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else if (z4 || z2) {
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Flow<CombinedLoadStates> loadStateFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C39690pxB.Application application = this.this$0.copydefault;
            if (application != null && (loadStateFlow = application.getLoadStateFlow()) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(loadStateFlow, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
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
