package aws.sdk.kotlin.runtime.auth.credentials;

import aws.sdk.kotlin.runtime.ClientException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class CredentialsNotLoadedException extends ClientException {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:14) call: aws.sdk.kotlin.runtime.auth.credentials.CredentialsNotLoadedException.<init>(java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ CredentialsNotLoadedException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public CredentialsNotLoadedException(String str, Throwable th) {
        super(str == null ? "The provider could not provide credentials or required configuration was not set" : str, th);
    }
}
