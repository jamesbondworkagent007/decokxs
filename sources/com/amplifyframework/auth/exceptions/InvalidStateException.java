package com.amplifyframework.auth.exceptions;

import com.amplifyframework.auth.AuthException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidStateException extends AuthException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvalidStateException() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Auth state is an invalid state, cannot process the request.") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("Operation performed is not a valid operation for the current auth state.") : (r2v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:25) call: com.amplifyframework.auth.exceptions.InvalidStateException.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ InvalidStateException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Auth state is an invalid state, cannot process the request." : str, (i & 2) != 0 ? "Operation performed is not a valid operation for the current auth state." : str2, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidStateException(@NotNull String str, @NotNull String str2, Throwable th) {
        super(str, str2, th);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }
}
