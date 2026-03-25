package com.amplifyframework.predictions.aws.exceptions;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.PredictionsException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class FaceLivenessSessionTimeoutException extends PredictionsException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FaceLivenessSessionTimeoutException() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Session timed out.") : (r1v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("Retry the face liveness check and prompt user to follow the on screen instructions.") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Throwable, java.lang.String):void (m)] (LINE:22) call: com.amplifyframework.predictions.aws.exceptions.FaceLivenessSessionTimeoutException.<init>(java.lang.String, java.lang.Throwable, java.lang.String):void type: THIS */
    public /* synthetic */ FaceLivenessSessionTimeoutException(String str, Throwable th, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Session timed out." : str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "Retry the face liveness check and prompt user to follow the on screen instructions." : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceLivenessSessionTimeoutException(@NotNull String str, Throwable th, @NotNull String str2) {
        super(str, th, str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }
}
