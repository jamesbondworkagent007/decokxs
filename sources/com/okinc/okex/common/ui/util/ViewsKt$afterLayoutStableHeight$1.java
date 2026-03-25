package com.okinc.okex.common.ui.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56518yIi;

/* JADX INFO: loaded from: classes23.dex */
public final class ViewsKt$afterLayoutStableHeight$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<Integer> $heightFlow;
    final /* synthetic */ Function1<Integer, Unit> $onStable;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewsKt$afterLayoutStableHeight$1(Flow<Integer> flow, Function1<? super Integer, Unit> function1, Continuation<? super ViewsKt$afterLayoutStableHeight$1> continuation) {
        super(2, continuation);
        this.$heightFlow = flow;
        this.$onStable = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ViewsKt$afterLayoutStableHeight$1(this.$heightFlow, this.$onStable, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ViewsKt$afterLayoutStableHeight$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.common.ui.util.ViewsKt$afterLayoutStableHeight$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ Function1<Integer, Unit> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super Integer, Unit> function1) {
            this.AEQbTJ = function1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return copydefault(((Number) obj).intValue(), continuation);
        }

        public final Object copydefault(int i, Continuation<? super Unit> continuation) {
            this.AEQbTJ.invoke(C56443yFo.AEQbTJ(i));
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<Integer> flow = this.$heightFlow;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onStable);
            this.label = 1;
            if (flow.collect(anonymousClass2, this) == objCopydefault) {
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

    public final Object invokeSuspend$$forInline(Object obj) {
        Flow<Integer> flow = this.$heightFlow;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onStable);
        C56518yIi.AEQbTJ(0);
        flow.collect(anonymousClass2, this);
        C56518yIi.AEQbTJ(1);
        return Unit.INSTANCE;
    }
}
