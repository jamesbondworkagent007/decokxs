package aws.smithy.kotlin.runtime.auth.awscredentials;

import aws.smithy.kotlin.runtime.ClientException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CredentialsProviderException extends ClientException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialsProviderException(@NotNull String str, Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:13) call: aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException.<init>(java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ CredentialsProviderException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
