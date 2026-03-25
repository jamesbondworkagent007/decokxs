package aws.smithy.kotlin.runtime.http.middleware;

import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.BP;
import o.BR;
import o.C5003Bz;
import o.C5141Gh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.CG;
import o.GU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [O] */
/* JADX INFO: loaded from: classes2.dex */
public final class RetryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1<O> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super O>, Object> {
    final /* synthetic */ Ref.IntRef $attempt$inlined;
    final /* synthetic */ BP $modified$inlined;
    final /* synthetic */ CG $next$inlined;
    final /* synthetic */ GU $span;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5003Bz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1(GU gu, Continuation continuation, Ref.IntRef intRef, BP bp, C5003Bz c5003Bz, CG cg) {
        super(2, continuation);
        this.$span = gu;
        this.$attempt$inlined = intRef;
        this.$modified$inlined = bp;
        this.this$0 = c5003Bz;
        this.$next$inlined = cg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        RetryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1 retryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1 = new RetryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1(this.$span, continuation, this.$attempt$inlined, this.$modified$inlined, this.this$0, this.$next$inlined);
        retryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1.L$0 = obj;
        return retryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super O> continuation) {
        return ((RetryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (this.$attempt$inlined.element > 1) {
                CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
                final Ref.IntRef intRef = this.$attempt$inlined;
                Function0<String> function0 = new Function0<String>() { // from class: aws.smithy.kotlin.runtime.http.middleware.RetryMiddleware$handle$result$outcome$1$1$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "retrying request, attempt " + intRef.element;
                    }
                };
                LogLevel logLevel = LogLevel.Debug;
                String strGEmmrt = C56524yIo.AEQbTJ(C5003Bz.class).gEmmrt();
                if (strGEmmrt == null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                C5141Gh.copydefault(coroutineContext, logLevel, strGEmmrt, null, function0);
            }
            BP bpEZpvd = BR.EZpvd(this.$modified$inlined);
            C5003Bz c5003Bz = this.this$0;
            CG cg = this.$next$inlined;
            int i2 = this.$attempt$inlined.element;
            this.label = 1;
            objEZpvd = c5003Bz.EZpvd(bpEZpvd, cg, i2, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        this.$attempt$inlined.element++;
        C56391yDq.AEQbTJ(objEZpvd);
        return objEZpvd;
    }
}
