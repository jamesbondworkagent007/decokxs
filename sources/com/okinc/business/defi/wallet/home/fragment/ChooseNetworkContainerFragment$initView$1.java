package com.okinc.business.defi.wallet.home.fragment;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC12782ctV;
import o.C16519elU;
import o.C18006faJ;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class ChooseNetworkContainerFragment$initView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ C18006faJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseNetworkContainerFragment$initView$1(C18006faJ c18006faJ, View view, Continuation<? super ChooseNetworkContainerFragment$initView$1> continuation) {
        super(2, continuation);
        this.this$0 = c18006faJ;
        this.$view = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChooseNetworkContainerFragment$initView$1(this.this$0, this.$view, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChooseNetworkContainerFragment$initView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkContainerFragment$initView$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Point<? extends AbstractC12782ctV>, Continuation<? super Unit>, Object> {
        final /* synthetic */ View $view;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18006faJ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18006faJ c18006faJ, View view, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18006faJ;
            this.$view = view;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$view, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Point<? extends AbstractC12782ctV> point, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(point, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Point point = (Point) this.L$0;
                if (point instanceof Point.StateListAnimator) {
                    this.this$0.showLoading();
                } else {
                    if (point instanceof Point.Application) {
                        this.this$0.dismissLoading();
                        Point.Application application = (Point.Application) point;
                        boolean z = false;
                        if (!((AbstractC12782ctV) application.copydefault()).getFieldNames() && AbstractC12782ctV.isCustomNetworkSupport$default((AbstractC12782ctV) application.copydefault(), false, 1, null)) {
                            z = true;
                        }
                        C16519elU c16519elU = this.this$0.AEQbTJ;
                        if (c16519elU != null) {
                            C18006faJ c18006faJ = this.this$0;
                            Context context = this.$view.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            c18006faJ.KWHzl(c16519elU, context, z);
                        }
                        rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                    } else if (point instanceof Point.TaskDescription) {
                        this.this$0.dismissLoading();
                        String strEZpvd = ((Point.TaskDescription) point).EZpvd();
                        pUU.copydefault("fetchMainWallet failed", strEZpvd != null ? strEZpvd : "");
                    } else if (point != null) {
                        throw new NoWhenBranchMatchedException();
                    }
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
            StateFlow<Point<AbstractC12782ctV>> stateFlowEZpvd = this.this$0.OLrzqt().EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$view, null);
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
