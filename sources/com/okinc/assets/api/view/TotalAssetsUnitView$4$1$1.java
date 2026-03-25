package com.okinc.assets.api.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.assets.api.model.ValuationCurrency;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C8226ayj;

/* JADX INFO: loaded from: classes22.dex */
public final class TotalAssetsUnitView$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LifecycleOwner $this_apply;
    int label;
    final /* synthetic */ C8226ayj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalAssetsUnitView$4$1$1(LifecycleOwner lifecycleOwner, C8226ayj c8226ayj, Continuation<? super TotalAssetsUnitView$4$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = lifecycleOwner;
        this.this$0 = c8226ayj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TotalAssetsUnitView$4$1$1(this.$this_apply, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TotalAssetsUnitView$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.assets.api.view.TotalAssetsUnitView$4$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C8226ayj this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C8226ayj c8226ayj, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c8226ayj;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<Pair<List<ValuationCurrency>, ValuationCurrency>> flowEZpvd = this.this$0.KWHzl.EZpvd();
                final C8226ayj c8226ayj = this.this$0;
                FlowCollector<? super Pair<List<ValuationCurrency>, ValuationCurrency>> flowCollector = new FlowCollector() { // from class: com.okinc.assets.api.view.TotalAssetsUnitView.4.1.1.1.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Pair<? extends List<ValuationCurrency>, ValuationCurrency> pair, Continuation<? super Unit> continuation) {
                        List<ValuationCurrency> first = pair.getFirst();
                        ValuationCurrency second = pair.getSecond();
                        C8226ayj.Activity activity = c8226ayj.copydefault;
                        if (activity != null) {
                            C8226ayj c8226ayj2 = c8226ayj;
                            activity.AEQbTJ(c8226ayj2.OLrzqt(c8226ayj2.copydefault(second.getUnit(), (List<ValuationCurrency>) first), c8226ayj.KWHzl(second.getUnit())));
                        }
                        c8226ayj.setText(second.getUnit());
                        if (!Intrinsics.EZpvd((Object) c8226ayj.AEQbTJ, (Object) second.getUnit())) {
                            C8226ayj.ActionBar actionBarCopydefault = c8226ayj.copydefault();
                            if (actionBarCopydefault != null) {
                                actionBarCopydefault.EZpvd(second.getUnit());
                            }
                            c8226ayj.AEQbTJ = second.getUnit();
                        }
                        C8226ayj c8226ayj3 = c8226ayj;
                        c8226ayj3.EZpvd(c8226ayj3.AhwBna);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowEZpvd.collect(flowCollector, this) == objCopydefault) {
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
            LifecycleOwner lifecycleOwner = this.$this_apply;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
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
