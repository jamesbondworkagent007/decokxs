package aws.smithy.kotlin.runtime.http.middleware;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.BP;
import o.C5003Bz;
import o.C56391yDq;
import o.C56442yFn;
import o.CG;
import o.GU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [O] */
/* JADX INFO: loaded from: classes2.dex */
public final class RetryMiddleware$handle$$inlined$withSpan$default$1<O> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends O>>, Object> {
    final /* synthetic */ Ref.IntRef $attempt$inlined;
    final /* synthetic */ BP $modified$inlined;
    final /* synthetic */ CG $next$inlined;
    final /* synthetic */ GU $span;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5003Bz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryMiddleware$handle$$inlined$withSpan$default$1(GU gu, Continuation continuation, C5003Bz c5003Bz, BP bp, CG cg, Ref.IntRef intRef) {
        super(2, continuation);
        this.$span = gu;
        this.this$0 = c5003Bz;
        this.$modified$inlined = bp;
        this.$next$inlined = cg;
        this.$attempt$inlined = intRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        RetryMiddleware$handle$$inlined$withSpan$default$1 retryMiddleware$handle$$inlined$withSpan$default$1 = new RetryMiddleware$handle$$inlined$withSpan$default$1(this.$span, continuation, this.this$0, this.$modified$inlined, this.$next$inlined, this.$attempt$inlined);
        retryMiddleware$handle$$inlined$withSpan$default$1.L$0 = obj;
        return retryMiddleware$handle$$inlined$withSpan$default$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Result<? extends O>> continuation) {
        return ((RetryMiddleware$handle$$inlined$withSpan$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5003Bz c5003Bz = this.this$0;
            BP bp = this.$modified$inlined;
            CG cg = this.$next$inlined;
            int i2 = this.$attempt$inlined.element;
            this.label = 1;
            objEZpvd = c5003Bz.EZpvd(bp, cg, i2, this);
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
        return Result.m7376boximpl(objEZpvd);
    }
}
