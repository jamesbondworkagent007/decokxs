package aws.smithy.kotlin.runtime.content;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.CQ;
import o.InterfaceC5060De;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ByteStreamKt$toFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super byte[]>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $bufferSize;
    final /* synthetic */ InterfaceC5060De $this_toFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteStreamKt$toFlow$2(InterfaceC5060De interfaceC5060De, long j, Continuation<? super ByteStreamKt$toFlow$2> continuation) {
        super(2, continuation);
        this.$this_toFlow = interfaceC5060De;
        this.$bufferSize = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        ByteStreamKt$toFlow$2 byteStreamKt$toFlow$2 = new ByteStreamKt$toFlow$2(this.$this_toFlow, this.$bufferSize, continuation);
        byteStreamKt$toFlow$2.L$0 = obj;
        return byteStreamKt$toFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull FlowCollector<? super byte[]> flowCollector, Continuation<? super Unit> continuation) {
        return ((ByteStreamKt$toFlow$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        FlowCollector flowCollector;
        InterfaceC5060De interfaceC5060De;
        CQ cq;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            interfaceC5060De = this.$this_toFlow;
            cq = new CQ();
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            cq = (CQ) this.L$2;
            interfaceC5060De = (InterfaceC5060De) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (interfaceC5060De.KWHzl(cq, this.$bufferSize) != -1) {
            long jAhwBna = cq.AhwBna();
            long j = this.$bufferSize;
            if (jAhwBna >= j) {
                byte[] bArrEZpvd = cq.EZpvd(j);
                this.L$0 = flowCollector;
                this.L$1 = interfaceC5060De;
                this.L$2 = cq;
                this.label = 1;
                if (flowCollector.emit(bArrEZpvd, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        if (cq.AhwBna() > 0) {
            byte[] bArrKWHzl = cq.KWHzl();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (flowCollector.emit(bArrKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
