package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import android.app.Activity;
import androidx.fragment.app.FragmentContainerView;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.gTC;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingEditStrategyActivity$observeData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CopyTradingEditStrategyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyActivity$observeData$3(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, Continuation<? super CopyTradingEditStrategyActivity$observeData$3> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyActivity$observeData$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyActivity$observeData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$observeData$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Result<? extends gTC>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CopyTradingEditStrategyActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = copyTradingEditStrategyActivity;
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
        public /* bridge */ /* synthetic */ Object invoke(Result<? extends gTC> result, Continuation<? super Unit> continuation) {
            return invoke2((Result<gTC>) result, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Result<gTC> result, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(result, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Result result = (Result) this.L$0;
                if (result == null) {
                    this.this$0.EZpvd(0);
                } else if (Result.m7383isFailureimpl(result.m7386unboximpl())) {
                    rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                    this.this$0.EZpvd(1);
                } else {
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    this.this$0.EZpvd(2);
                    FragmentContainerView fragmentContainerView = this.this$0.AhwBna().KWHzl;
                    Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
                    fragmentContainerView.postDelayed(new StateListAnimator(this.this$0), 300L);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$observeData$3$1$StateListAnimator */
        public static final class StateListAnimator implements Runnable {
            public final /* synthetic */ CopyTradingEditStrategyActivity OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity) {
                this.OLrzqt = copyTradingEditStrategyActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.OLrzqt.AkhnZx();
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Result<gTC>> stateFlowFJNWhG = this.this$0.gEmmrt().fJNWhG();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowFJNWhG, anonymousClass1, this) == objCopydefault) {
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
