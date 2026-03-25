package aws.sdk.kotlin.services.translate.paginators;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import o.C45970tD;
import o.C46024tF;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44254sJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PaginatorsKt$listTextTranslationJobsPaginated$2 extends SuspendLambda implements Function2<FlowCollector<? super C45970tD>, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46024tF $initialRequest;
    final /* synthetic */ InterfaceC44254sJ $this_listTextTranslationJobsPaginated;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaginatorsKt$listTextTranslationJobsPaginated$2(C46024tF c46024tF, InterfaceC44254sJ interfaceC44254sJ, Continuation<? super PaginatorsKt$listTextTranslationJobsPaginated$2> continuation) {
        super(2, continuation);
        this.$initialRequest = c46024tF;
        this.$this_listTextTranslationJobsPaginated = interfaceC44254sJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        PaginatorsKt$listTextTranslationJobsPaginated$2 paginatorsKt$listTextTranslationJobsPaginated$2 = new PaginatorsKt$listTextTranslationJobsPaginated$2(this.$initialRequest, this.$this_listTextTranslationJobsPaginated, continuation);
        paginatorsKt$listTextTranslationJobsPaginated$2.L$0 = obj;
        return paginatorsKt$listTextTranslationJobsPaginated$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull FlowCollector<? super C45970tD> flowCollector, Continuation<? super Unit> continuation) {
        return ((PaginatorsKt$listTextTranslationJobsPaginated$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
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
        C45970tD c45970tD;
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
            c45970tD = (C45970tD) obj;
            ?? EZpvd = c45970tD.EZpvd();
            objectRef.element = EZpvd;
            i = (EZpvd != 0 || EZpvd.length() <= 0) ? 0 : 1;
            this.L$0 = flowCollector;
            this.L$1 = objectRef;
            this.I$0 = i;
            this.label = 2;
            if (flowCollector.emit(c45970tD, this) == objCopydefault) {
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
            C46024tF.Activity activity = new C46024tF.Activity(this.$initialRequest);
            activity.EZpvd((String) objectRef.element);
            C46024tF c46024tFKWHzl = activity.KWHzl();
            InterfaceC44254sJ interfaceC44254sJ = this.$this_listTextTranslationJobsPaginated;
            this.L$0 = flowCollector;
            this.L$1 = objectRef;
            this.label = 1;
            obj = interfaceC44254sJ.copydefault(c46024tFKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            c45970tD = (C45970tD) obj;
            ?? EZpvd2 = c45970tD.EZpvd();
            objectRef.element = EZpvd2;
            if (EZpvd2 != 0) {
            }
            this.L$0 = flowCollector;
            this.L$1 = objectRef;
            this.I$0 = i;
            this.label = 2;
            if (flowCollector.emit(c45970tD, this) == objCopydefault) {
            }
            if (i == 0) {
                return Unit.INSTANCE;
            }
        }
    }
}
