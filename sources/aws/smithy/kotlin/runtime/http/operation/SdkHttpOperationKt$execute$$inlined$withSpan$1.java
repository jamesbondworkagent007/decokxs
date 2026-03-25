package aws.smithy.kotlin.runtime.http.operation;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.BP;
import o.C56391yDq;
import o.C56442yFn;
import o.C56518yIi;
import o.CG;
import o.GU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes2.dex */
public final class SdkHttpOperationKt$execute$$inlined$withSpan$1<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    final /* synthetic */ Function2 $block$inlined;
    final /* synthetic */ CG $handler$inlined;
    final /* synthetic */ BP $request$inlined;
    final /* synthetic */ GU $span;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkHttpOperationKt$execute$$inlined$withSpan$1(GU gu, Continuation continuation, CG cg, BP bp, Function2 function2) {
        super(2, continuation);
        this.$span = gu;
        this.$handler$inlined = cg;
        this.$request$inlined = bp;
        this.$block$inlined = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        SdkHttpOperationKt$execute$$inlined$withSpan$1 sdkHttpOperationKt$execute$$inlined$withSpan$1 = new SdkHttpOperationKt$execute$$inlined$withSpan$1(this.$span, continuation, this.$handler$inlined, this.$request$inlined, this.$block$inlined);
        sdkHttpOperationKt$execute$$inlined$withSpan$1.L$0 = obj;
        return sdkHttpOperationKt$execute$$inlined$withSpan$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super R> continuation) {
        return ((SdkHttpOperationKt$execute$$inlined$withSpan$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CG cg = this.$handler$inlined;
            BP bp = this.$request$inlined;
            this.label = 1;
            obj = cg.OLrzqt(bp, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Function2 function2 = this.$block$inlined;
        this.label = 2;
        C56518yIi.AEQbTJ(6);
        obj = function2.invoke(obj, this);
        C56518yIi.AEQbTJ(7);
        return obj == objCopydefault ? objCopydefault : obj;
    }
}
