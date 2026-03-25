package com.okinc.business.defi.wallet.tx.history;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC16521elW;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;

/* JADX INFO: loaded from: classes5.dex */
public final class CoinDetailFragmentNew$observeDynamicTokenState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CoinDetailFragmentNew this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailFragmentNew$observeDynamicTokenState$1(CoinDetailFragmentNew coinDetailFragmentNew, Continuation<? super CoinDetailFragmentNew$observeDynamicTokenState$1> continuation) {
        super(2, continuation);
        this.this$0 = coinDetailFragmentNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinDetailFragmentNew$observeDynamicTokenState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinDetailFragmentNew$observeDynamicTokenState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(this.this$0.AuCTelauCTel().copydefault(), this.this$0.getViewLifecycleOwner().getLifecycle(), Lifecycle.State.CREATED);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFlowWithLifecycle, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$observeDynamicTokenState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Point<? extends Boolean>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CoinDetailFragmentNew this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CoinDetailFragmentNew coinDetailFragmentNew, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = coinDetailFragmentNew;
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
        public /* bridge */ /* synthetic */ Object invoke(Point<? extends Boolean> point, Continuation<? super Unit> continuation) {
            return invoke2((Point<Boolean>) point, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Point<Boolean> point, Continuation<? super Unit> continuation) {
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
                AbstractC16521elW abstractC16521elW = null;
                if (!(point instanceof Point.Application)) {
                    AbstractC16521elW abstractC16521elW2 = this.this$0.AYXKKw;
                    if (abstractC16521elW2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16521elW = abstractC16521elW2;
                    }
                    OKAlertBanner oKAlertBanner = abstractC16521elW.valueOf;
                    Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
                    oKAlertBanner.setVisibility(8);
                    return Unit.INSTANCE;
                }
                boolean zBooleanValue = ((Boolean) ((Point.Application) point).copydefault()).booleanValue();
                AbstractC16521elW abstractC16521elW3 = this.this$0.AYXKKw;
                if (abstractC16521elW3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16521elW = abstractC16521elW3;
                }
                OKAlertBanner oKAlertBanner2 = abstractC16521elW.valueOf;
                Intrinsics.checkNotNullExpressionValue(oKAlertBanner2, "");
                oKAlertBanner2.setVisibility(zBooleanValue ? 0 : 8);
                if (zBooleanValue) {
                    this.this$0.fvQaOB();
                    this.this$0.fFgQHt();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
