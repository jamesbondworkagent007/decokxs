package aws.smithy.kotlin.runtime.http.engine.okhttp;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C4303Bb;
import o.C56391yDq;
import o.C56442yFn;
import o.yFA;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamingRequestBody$doWriteTo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BufferedSink $sink;
    Object L$0;
    int label;
    final /* synthetic */ C4303Bb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamingRequestBody$doWriteTo$1(BufferedSink bufferedSink, C4303Bb c4303Bb, Continuation<? super StreamingRequestBody$doWriteTo$1> continuation) {
        super(2, continuation);
        this.$sink = bufferedSink;
        this.this$0 = c4303Bb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new StreamingRequestBody$doWriteTo$1(this.$sink, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StreamingRequestBody$doWriteTo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Closeable closeable;
        Throwable th;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BufferedSink bufferedSink = this.$sink;
            C4303Bb c4303Bb = this.this$0;
            try {
                this.L$0 = bufferedSink;
                this.label = 1;
                if (c4303Bb.OLrzqt(bufferedSink, this) == objCopydefault) {
                    return objCopydefault;
                }
                closeable = bufferedSink;
            } catch (Throwable th2) {
                closeable = bufferedSink;
                th = th2;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (Closeable) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    yFA.copydefault(closeable, th);
                    throw th4;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        yFA.copydefault(closeable, null);
        return unit;
    }
}
