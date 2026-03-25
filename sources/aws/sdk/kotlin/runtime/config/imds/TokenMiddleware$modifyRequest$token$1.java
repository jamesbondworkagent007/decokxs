package aws.sdk.kotlin.runtime.config.imds;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.BP;
import o.C5036Cg;
import o.C56391yDq;
import o.C56442yFn;
import o.HA;
import o.InterfaceC5168Hi;
import o.LineNumberInputStream;
import o.LineNumberReader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class TokenMiddleware$modifyRequest$token$1 extends SuspendLambda implements Function1<Continuation<? super HA<LineNumberReader>>, Object> {
    final /* synthetic */ BP<C5036Cg> $req;
    int label;
    final /* synthetic */ LineNumberInputStream this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenMiddleware$modifyRequest$token$1(LineNumberInputStream lineNumberInputStream, BP<C5036Cg> bp, Continuation<? super TokenMiddleware$modifyRequest$token$1> continuation) {
        super(1, continuation);
        this.this$0 = lineNumberInputStream;
        this.$req = bp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new TokenMiddleware$modifyRequest$token$1(this.this$0, this.$req, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super HA<LineNumberReader>> continuation) {
        return ((TokenMiddleware$modifyRequest$token$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LineNumberInputStream lineNumberInputStream = this.this$0;
            InterfaceC5168Hi interfaceC5168Hi = lineNumberInputStream.OLrzqt;
            BP<C5036Cg> bp = this.$req;
            this.label = 1;
            obj = lineNumberInputStream.KWHzl(interfaceC5168Hi, bp, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        LineNumberReader lineNumberReader = (LineNumberReader) obj;
        return new HA(lineNumberReader, lineNumberReader.KWHzl());
    }
}
