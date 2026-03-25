package aws.smithy.kotlin.runtime.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes21.dex */
public final class FlowUtilKt$mergeSequential$1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T>[] $flows;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.flow.Flow<? extends T>[] */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowUtilKt$mergeSequential$1(Flow<? extends T>[] flowArr, Continuation<? super FlowUtilKt$mergeSequential$1> continuation) {
        super(2, continuation);
        this.$flows = flowArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        FlowUtilKt$mergeSequential$1 flowUtilKt$mergeSequential$1 = new FlowUtilKt$mergeSequential$1(this.$flows, continuation);
        flowUtilKt$mergeSequential$1.L$0 = obj;
        return flowUtilKt$mergeSequential$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        return ((FlowUtilKt$mergeSequential$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0045 -> B:13:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        FlowCollector flowCollector;
        Flow<T>[] flowArr;
        int length;
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            Flow<T>[] flowArr2 = this.$flows;
            flowCollector = flowCollector2;
            flowArr = flowArr2;
            length = flowArr2.length;
            i = 0;
            if (i < length) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = this.I$1;
            i = this.I$0;
            flowArr = (Flow[]) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            i++;
            if (i < length) {
                Flow<T> flow = flowArr[i];
                this.L$0 = flowCollector;
                this.L$1 = flowArr;
                this.I$0 = i;
                this.I$1 = length;
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, flow, this) == objCopydefault) {
                    return objCopydefault;
                }
                i++;
                if (i < length) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
