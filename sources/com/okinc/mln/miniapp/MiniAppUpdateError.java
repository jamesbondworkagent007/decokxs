package com.okinc.mln.miniapp;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class MiniAppUpdateError extends Exception {
    public static final int $stable = 0;
    private final int code;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppUpdateError(int i, @NotNull String str, Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(int, java.lang.String, java.lang.Throwable):void (m)] (LINE:11) call: com.okinc.mln.miniapp.MiniAppUpdateError.<init>(int, java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ MiniAppUpdateError(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MiniAppUpdateError(int i, @NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        String message = th.getMessage();
        this(i, message != null ? message : "", th);
    }
}
