package aws.smithy.kotlin.runtime.content;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.CQ;
import o.CS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ByteStreamKt$toFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super byte[]>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $bufferSize;
    final /* synthetic */ CS $this_toFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteStreamKt$toFlow$1(CS cs, long j, Continuation<? super ByteStreamKt$toFlow$1> continuation) {
        super(2, continuation);
        this.$this_toFlow = cs;
        this.$bufferSize = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        ByteStreamKt$toFlow$1 byteStreamKt$toFlow$1 = new ByteStreamKt$toFlow$1(this.$this_toFlow, this.$bufferSize, continuation);
        byteStreamKt$toFlow$1.L$0 = obj;
        return byteStreamKt$toFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull FlowCollector<? super byte[]> flowCollector, Continuation<? super Unit> continuation) {
        return ((ByteStreamKt$toFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0078 -> B:13:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008a -> B:13:0x004d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        FlowCollector flowCollector;
        CS cs;
        CQ cq;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            cs = this.$this_toFlow;
            cq = new CQ();
        } else {
            if (i == 1) {
                cq = (CQ) this.L$2;
                cs = (CS) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (((Number) obj).longValue() != -1) {
                    long jAhwBna = cq.AhwBna();
                    long j = this.$bufferSize;
                    if (jAhwBna >= j) {
                        byte[] bArrEZpvd = cq.EZpvd(j);
                        this.L$0 = flowCollector;
                        this.L$1 = cs;
                        this.L$2 = cq;
                        this.label = 2;
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
                    this.label = 3;
                    if (flowCollector.emit(bArrKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            cq = (CQ) this.L$2;
            cs = (CS) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (!cs.KWHzl()) {
            long j2 = this.$bufferSize;
            this.L$0 = flowCollector;
            this.L$1 = cs;
            this.L$2 = cq;
            this.label = 1;
            obj = cs.copydefault(cq, j2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (((Number) obj).longValue() != -1) {
            }
        }
        if (cq.AhwBna() > 0) {
        }
        return Unit.INSTANCE;
    }
}
