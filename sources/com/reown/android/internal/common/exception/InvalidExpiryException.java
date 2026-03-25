package com.reown.android.internal.common.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class InvalidExpiryException extends WalletConnectException {
    public final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvalidExpiryException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.exception.WalletConnectException, java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Request expiry validation failed. Expiry must be between current timestamp + MIN_INTERVAL and current timestamp + MAX_INTERVAL (MIN_INTERVAL: 300, MAX_INTERVAL: 604800)") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:18) call: com.reown.android.internal.common.exception.InvalidExpiryException.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ InvalidExpiryException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Request expiry validation failed. Expiry must be between current timestamp + MIN_INTERVAL and current timestamp + MAX_INTERVAL (MIN_INTERVAL: 300, MAX_INTERVAL: 604800)" : str);
    }

    public InvalidExpiryException(String str) {
        super(str);
        this.message = str;
    }
}
