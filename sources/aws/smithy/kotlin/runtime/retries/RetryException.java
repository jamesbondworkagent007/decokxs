package aws.smithy.kotlin.runtime.retries;

import aws.smithy.kotlin.runtime.ClientException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RetryException extends ClientException {
    private final int attempts;
    private final Throwable lastException;
    private final Object lastResponse;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.Throwable), (r3v0 int), (r4v0 java.lang.Object), (r5v0 java.lang.Throwable) A[MD:(java.lang.String, java.lang.Throwable, int, java.lang.Object, java.lang.Throwable):void (m)] call: aws.smithy.kotlin.runtime.retries.RetryException.<init>(java.lang.String, java.lang.Throwable, int, java.lang.Object, java.lang.Throwable):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RetryException(String str, Throwable th, int i, Object obj, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th, i, obj, th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAttempts() {
        return this.attempts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Throwable getLastException() {
        return this.lastException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getLastResponse() {
        return this.lastResponse;
    }

    private RetryException(String str, Throwable th, int i, Object obj, Throwable th2) {
        super(str, th);
        this.attempts = i;
        this.lastResponse = obj;
        this.lastException = th2;
    }
}
