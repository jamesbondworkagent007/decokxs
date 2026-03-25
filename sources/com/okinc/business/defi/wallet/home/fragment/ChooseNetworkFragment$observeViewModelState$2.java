package com.okinc.business.defi.wallet.home.fragment;

import androidx.fragment.app.Fragment;
import com.okinc.uilab.list.OKAnchorSelection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C13784dYd;
import o.C16096edV;
import o.C16517elS;
import o.C18082fbg;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class ChooseNetworkFragment$observeViewModelState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18082fbg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseNetworkFragment$observeViewModelState$2(C18082fbg c18082fbg, Continuation<? super ChooseNetworkFragment$observeViewModelState$2> continuation) {
        super(2, continuation);
        this.this$0 = c18082fbg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChooseNetworkFragment$observeViewModelState$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChooseNetworkFragment$observeViewModelState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkFragment$observeViewModelState$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Point<? extends C16096edV.TaskDescription>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18082fbg this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18082fbg c18082fbg, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18082fbg;
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
        public /* bridge */ /* synthetic */ Object invoke(Point<? extends C16096edV.TaskDescription> point, Continuation<? super Unit> continuation) {
            return invoke2((Point<C16096edV.TaskDescription>) point, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Point<C16096edV.TaskDescription> point, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(point, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            OKAnchorSelection oKAnchorSelection;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Point point = (Point) this.L$0;
                if (point instanceof Point.StateListAnimator) {
                    this.this$0.showLoading();
                } else if (point instanceof Point.Application) {
                    this.this$0.dismissLoading();
                    C16517elS c16517elS = this.this$0.KWHzl;
                    if (c16517elS == null || (oKAnchorSelection = c16517elS.KWHzl) == null) {
                        return Unit.INSTANCE;
                    }
                    C18082fbg c18082fbg = this.this$0;
                    oKAnchorSelection.EZpvd();
                    boolean z = !c18082fbg.KWHzl().copydefault();
                    oKAnchorSelection.setDividerLineVisibility(z);
                    oKAnchorSelection.OLrzqt().setVisibility(z ? 0 : 8);
                    C16096edV.TaskDescription taskDescription = (C16096edV.TaskDescription) ((Point.Application) point).copydefault();
                    oKAnchorSelection.setIndexList(CollectionsKt___CollectionsKt.fJNWhG((Collection) taskDescription.KWHzl()));
                    Iterator<T> it = taskDescription.EZpvd().iterator();
                    while (it.hasNext()) {
                        oKAnchorSelection.OLrzqt((C13784dYd) it.next());
                    }
                    if (!c18082fbg.AEQbTJ) {
                        c18082fbg.AEQbTJ = true;
                        c18082fbg.OLrzqt(c18082fbg.KWHzl().EZpvd());
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else if (point instanceof Point.TaskDescription) {
                    this.this$0.dismissLoading();
                    pUU.copydefault("error while loading networks: " + ((Point.TaskDescription) point).EZpvd());
                } else if (point != null) {
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
            StateFlow<Point<C16096edV.TaskDescription>> stateFlowKWHzl = this.this$0.KWHzl().KWHzl();
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
