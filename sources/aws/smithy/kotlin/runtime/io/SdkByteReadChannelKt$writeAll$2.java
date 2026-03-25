package aws.smithy.kotlin.runtime.io;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.CQ;
import o.CT;
import o.InterfaceC5060De;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SdkByteReadChannelKt$writeAll$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ InterfaceC5060De $source;
    final /* synthetic */ CT $this_writeAll;
    long J$0;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkByteReadChannelKt$writeAll$2(InterfaceC5060De interfaceC5060De, CT ct, Continuation<? super SdkByteReadChannelKt$writeAll$2> continuation) {
        super(2, continuation);
        this.$source = interfaceC5060De;
        this.$this_writeAll = ct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new SdkByteReadChannelKt$writeAll$2(this.$source, this.$this_writeAll, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((SdkByteReadChannelKt$writeAll$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CQ cq;
        long j;
        CT ct;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            cq = new CQ();
            j = 0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            cq = (CQ) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        do {
            long jKWHzl = this.$source.KWHzl(cq, 16384L);
            if (jKWHzl == -1) {
                return C56443yFo.KWHzl(j);
            }
            j += jKWHzl;
            ct = this.$this_writeAll;
            this.L$0 = cq;
            this.J$0 = j;
            this.label = 1;
        } while (CT.TaskDescription.write$default(ct, cq, 0L, this, 2, null) != objCopydefault);
        return objCopydefault;
    }
}
