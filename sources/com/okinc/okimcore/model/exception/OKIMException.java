package com.okinc.okimcore.model.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C44157sFk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class OKIMException extends Exception {
    public static final int $stable = 0;
    public static final int CODE_ERROR_MSG = -4;
    public static final int CODE_FETCH_DATA_FAILED = -2;
    public static final int CODE_OPERATE_FAILED = -1;
    public static final int CODE_RETURN_DATA_NULL = -3;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private final int code;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMException(@NotNull String str, int i) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.lang.String, int):void (m)] (LINE:14) call: com.okinc.okimcore.model.exception.OKIMException.<init>(java.lang.String, int):void type: THIS */
    public /* synthetic */ OKIMException(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMException(@NotNull Throwable th, int i) {
        super(th);
        Intrinsics.checkNotNullParameter(th, "");
        this.code = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Throwable)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r2v0 int))
 A[MD:(java.lang.Throwable, int):void (m)] (LINE:18) call: com.okinc.okimcore.model.exception.OKIMException.<init>(java.lang.Throwable, int):void type: THIS */
    public /* synthetic */ OKIMException(Throwable th, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i2 & 2) != 0 ? -1 : i);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.exception.OKIMException.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final String getErrorMessage() {
        String message;
        Throwable cause = getCause();
        return (cause == null || (message = cause.getMessage()) == null) ? getMessage() : message;
    }

    public final Integer getServerErrorCodeOrNull() {
        Throwable cause = getCause();
        if (cause != null) {
            return C44157sFk.OLrzqt(cause);
        }
        return null;
    }
}
