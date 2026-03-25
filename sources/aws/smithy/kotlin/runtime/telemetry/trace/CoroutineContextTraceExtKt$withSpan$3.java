package aws.smithy.kotlin.runtime.telemetry.trace;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.GU;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineContextTraceExtKt$withSpan$3<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    final /* synthetic */ yHO<CoroutineScope, GU, Continuation<? super R>, Object> $block;
    final /* synthetic */ GU $span;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHO<? super kotlinx.coroutines.CoroutineScope, ? super o.GU, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineContextTraceExtKt$withSpan$3(yHO<? super CoroutineScope, ? super GU, ? super Continuation<? super R>, ? extends Object> yho, GU gu, Continuation<? super CoroutineContextTraceExtKt$withSpan$3> continuation) {
        super(2, continuation);
        this.$block = yho;
        this.$span = gu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        CoroutineContextTraceExtKt$withSpan$3 coroutineContextTraceExtKt$withSpan$3 = new CoroutineContextTraceExtKt$withSpan$3(this.$block, this.$span, continuation);
        coroutineContextTraceExtKt$withSpan$3.L$0 = obj;
        return coroutineContextTraceExtKt$withSpan$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super R> continuation) {
        return ((CoroutineContextTraceExtKt$withSpan$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            yHO<CoroutineScope, GU, Continuation<? super R>, Object> yho = this.$block;
            GU gu = this.$span;
            this.label = 1;
            obj = yho.invoke(coroutineScope, gu, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }

    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        return this.$block.invoke((CoroutineScope) this.L$0, this.$span, this);
    }
}
