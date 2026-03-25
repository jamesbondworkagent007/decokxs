package com.okinc.business.dexlogic.error;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DebugThrowException extends Exception {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DebugThrowException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugThrowException(@NotNull String str, Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:3) call: com.okinc.business.dexlogic.error.DebugThrowException.<init>(java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ DebugThrowException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : th);
    }
}
