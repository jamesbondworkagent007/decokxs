package com.okinc.business.defi.wallet.switchComponent.fragments;

import android.content.Context;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC12782ctV;
import o.C13754dXa;
import o.C19595gIe;
import o.C33069mpW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C8322bAY;
import o.Point;
import o.fQI;
import o.gCC;

/* JADX INFO: loaded from: classes5.dex */
public final class CurrentWalletSwitchFragment$initObserver$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fQI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentWalletSwitchFragment$initObserver$6(fQI fqi, Continuation<? super CurrentWalletSwitchFragment$initObserver$6> continuation) {
        super(2, continuation);
        this.this$0 = fqi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrentWalletSwitchFragment$initObserver$6(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrentWalletSwitchFragment$initObserver$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$6$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Point<? extends gCC>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fQI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fQI fqi, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fqi;
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
        public /* bridge */ /* synthetic */ Object invoke(Point<? extends gCC> point, Continuation<? super Unit> continuation) {
            return invoke2((Point<gCC>) point, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Point<gCC> point, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(point, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Point point = (Point) this.L$0;
                if (point == null) {
                    return Unit.INSTANCE;
                }
                if (point instanceof Point.StateListAnimator) {
                    this.this$0.showLoading();
                } else if (point instanceof Point.Application) {
                    Context context = this.this$0.getContext();
                    if (context == null) {
                        return Unit.INSTANCE;
                    }
                    this.this$0.dismissLoading();
                    this.this$0.AhwBna();
                    Point.Application application = (Point.Application) point;
                    C19595gIe.Companion.AEQbTJ(C33069mpW.KWHzl(context, C13754dXa.FragmentManager.connect, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainName", ((gCC) application.copydefault()).EZpvd()), C56390yDp.OLrzqt("type", C8322bAY.getAddressFormat$default(C8322bAY.KWHzl, ((gCC) application.copydefault()).AEQbTJ(), false, 2, null)))), ((gCC) application.copydefault()).copydefault()).KWHzl(context);
                    AbstractC12782ctV abstractC12782ctVKWHzl = ((gCC) application.copydefault()).KWHzl();
                    if (abstractC12782ctVKWHzl.zuWLRA()) {
                        this.this$0.djBIcL().EZpvd(abstractC12782ctVKWHzl);
                    }
                } else {
                    if (!(point instanceof Point.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.dismissLoading();
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
            StateFlow<Point<gCC>> stateFlowCopydefault = this.this$0.AYXKKw().copydefault();
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
