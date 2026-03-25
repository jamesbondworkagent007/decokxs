package aws.sdk.kotlin.services.translate.paginators;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import o.C47541ts;
import o.C47753tw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44254sJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PaginatorsKt$listParallelDataPaginated$2 extends SuspendLambda implements Function2<FlowCollector<? super C47753tw>, Continuation<? super Unit>, Object> {
    final /* synthetic */ C47541ts $initialRequest;
    final /* synthetic */ InterfaceC44254sJ $this_listParallelDataPaginated;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaginatorsKt$listParallelDataPaginated$2(C47541ts c47541ts, InterfaceC44254sJ interfaceC44254sJ, Continuation<? super PaginatorsKt$listParallelDataPaginated$2> continuation) {
        super(2, continuation);
        this.$initialRequest = c47541ts;
        this.$this_listParallelDataPaginated = interfaceC44254sJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        PaginatorsKt$listParallelDataPaginated$2 paginatorsKt$listParallelDataPaginated$2 = new PaginatorsKt$listParallelDataPaginated$2(this.$initialRequest, this.$this_listParallelDataPaginated, continuation);
        paginatorsKt$listParallelDataPaginated$2.L$0 = obj;
        return paginatorsKt$listParallelDataPaginated$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull FlowCollector<? super C47753tw> flowCollector, Continuation<? super Unit> continuation) {
        return ((PaginatorsKt$listParallelDataPaginated$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:17:0x006d, B:20:0x0075], limit reached: 26 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0082 -> B:11:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        FlowCollector flowCollector;
        Ref.ObjectRef objectRef;
        int i;
        C47753tw c47753tw;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            objectRef = new Ref.ObjectRef();
            i = 1;
        } else if (i2 == 1) {
            Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.L$1;
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            flowCollector = flowCollector2;
            objectRef = objectRef2;
            c47753tw = (C47753tw) obj;
            ?? OLrzqt = c47753tw.OLrzqt();
            objectRef.element = OLrzqt;
            i = (OLrzqt != 0 || OLrzqt.length() <= 0) ? 0 : 1;
            this.L$0 = flowCollector;
            this.L$1 = objectRef;
            this.I$0 = i;
            this.label = 2;
            if (flowCollector.emit(c47753tw, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            objectRef = (Ref.ObjectRef) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (i == 0) {
            C47541ts.TaskDescription taskDescription = new C47541ts.TaskDescription(this.$initialRequest);
            taskDescription.AEQbTJ((String) objectRef.element);
            C47541ts c47541tsOLrzqt = taskDescription.OLrzqt();
            InterfaceC44254sJ interfaceC44254sJ = this.$this_listParallelDataPaginated;
            this.L$0 = flowCollector;
            this.L$1 = objectRef;
            this.label = 1;
            obj = interfaceC44254sJ.OLrzqt(c47541tsOLrzqt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            c47753tw = (C47753tw) obj;
            ?? OLrzqt2 = c47753tw.OLrzqt();
            objectRef.element = OLrzqt2;
            if (OLrzqt2 != 0) {
            }
            this.L$0 = flowCollector;
            this.L$1 = objectRef;
            this.I$0 = i;
            this.label = 2;
            if (flowCollector.emit(c47753tw, this) == objCopydefault) {
            }
            if (i == 0) {
                return Unit.INSTANCE;
            }
        }
    }
}
