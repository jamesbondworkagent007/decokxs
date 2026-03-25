package aws.sdk.kotlin.runtime.auth.credentials;

import aws.sdk.kotlin.runtime.ConfigurationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ProviderConfigurationException extends ConfigurationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProviderConfigurationException(@NotNull String str, Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:20) call: aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException.<init>(java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ ProviderConfigurationException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
