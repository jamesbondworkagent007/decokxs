package com.okinc.wallet.hardware.api.onekey;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OneKeyException extends Exception {
    public static final int $stable = 0;
    private final OneKeySDKError error;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OneKeySDKError getError() {
        return this.error;
    }

    public OneKeyException() {
        this.error = null;
    }

    public OneKeyException(String str) {
        super(str);
        this.error = null;
    }

    public OneKeyException(String str, Throwable th) {
        super(str, th);
        this.error = null;
    }

    public OneKeyException(Throwable th) {
        OneKeySDKError oneKeySDKError;
        super(th);
        OneKeyException oneKeyException = th instanceof OneKeyException ? (OneKeyException) th : null;
        this.error = (oneKeyException == null || (oneKeySDKError = oneKeyException.error) == null) ? OneKeySDKError.RuntimeError : oneKeySDKError;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeyException(@NotNull OneKeySDKError oneKeySDKError, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(oneKeySDKError, "");
        this.error = oneKeySDKError;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 com.okinc.wallet.hardware.api.onekey.OneKeySDKError)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0004: INVOKE (r1v0 com.okinc.wallet.hardware.api.onekey.OneKeySDKError) VIRTUAL call: com.okinc.wallet.hardware.api.onekey.OneKeySDKError.getMessage():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:22)) : (r2v0 java.lang.String))
 A[MD:(com.okinc.wallet.hardware.api.onekey.OneKeySDKError, java.lang.String):void (m)] (LINE:22) call: com.okinc.wallet.hardware.api.onekey.OneKeyException.<init>(com.okinc.wallet.hardware.api.onekey.OneKeySDKError, java.lang.String):void type: THIS */
    public /* synthetic */ OneKeyException(OneKeySDKError oneKeySDKError, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oneKeySDKError, (i & 2) != 0 ? oneKeySDKError.getMessage() : str);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "OneKeyException(message=" + getMessage() + ", cause=" + getCause() + ", error=" + this.error + ")";
    }
}
