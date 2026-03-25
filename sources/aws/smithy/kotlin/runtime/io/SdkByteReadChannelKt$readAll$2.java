package aws.smithy.kotlin.runtime.io;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.CO;
import o.CQ;
import o.CS;
import o.CX;
import o.InterfaceC5058Dc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SdkByteReadChannelKt$readAll$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ InterfaceC5058Dc $sink;
    final /* synthetic */ CS $this_readAll;
    long J$0;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkByteReadChannelKt$readAll$2(InterfaceC5058Dc interfaceC5058Dc, CS cs, Continuation<? super SdkByteReadChannelKt$readAll$2> continuation) {
        super(2, continuation);
        this.$sink = interfaceC5058Dc;
        this.$this_readAll = cs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new SdkByteReadChannelKt$readAll$2(this.$sink, this.$this_readAll, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((SdkByteReadChannelKt$readAll$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:12:0x003e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        long j;
        CO coAEQbTJ;
        long jLongValue;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            j = 0;
            coAEQbTJ = CX.AEQbTJ(this.$sink);
            CS cs = this.$this_readAll;
            CQ cqCopydefault = coAEQbTJ.copydefault();
            this.L$0 = coAEQbTJ;
            this.J$0 = j;
            this.label = 1;
            obj = cs.copydefault(cqCopydefault, 16384L, this);
            if (obj == objCopydefault) {
            }
            jLongValue = ((Number) obj).longValue();
            if (jLongValue != -1) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            coAEQbTJ = (CO) this.L$0;
            C56391yDq.AEQbTJ(obj);
            jLongValue = ((Number) obj).longValue();
            if (jLongValue != -1) {
                coAEQbTJ.AEQbTJ();
                j += jLongValue;
                CS cs2 = this.$this_readAll;
                CQ cqCopydefault2 = coAEQbTJ.copydefault();
                this.L$0 = coAEQbTJ;
                this.J$0 = j;
                this.label = 1;
                obj = cs2.copydefault(cqCopydefault2, 16384L, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                jLongValue = ((Number) obj).longValue();
                if (jLongValue != -1) {
                    coAEQbTJ.AEQbTJ();
                    return C56443yFo.KWHzl(j);
                }
            }
        }
    }
}
