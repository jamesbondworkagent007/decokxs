package aws.smithy.kotlin.runtime.http.engine;

import aws.smithy.kotlin.runtime.ClientException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpClientEngineClosedException extends ClientException {
    private final Throwable cause;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HttpClientEngineClosedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public HttpClientEngineClosedException(Throwable th) {
        super("HttpClientEngine already closed");
        this.cause = th;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r1v0 java.lang.Throwable))
 A[MD:(java.lang.Throwable):void (m)] (LINE:69) call: aws.smithy.kotlin.runtime.http.engine.HttpClientEngineClosedException.<init>(java.lang.Throwable):void type: THIS */
    public /* synthetic */ HttpClientEngineClosedException(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th);
    }
}
