package com.okinc.business.dexlogic.error;

import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class BizException extends Exception {
    public static final int $stable = 0;
    private final String detailMsg;
    private final int errorCode;
    private final String errorMessage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizException() {
        this(0, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetailMsg() {
        return this.detailMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.business.dexlogic.error.BizException.<init>(int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BizException(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? "" : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizException(int i, String str, String str2, @NotNull String str3) {
        super(str);
        Intrinsics.checkNotNullParameter(str3, "");
        this.errorCode = i;
        this.detailMsg = str2;
        this.errorMessage = str3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizException(@NotNull ResponseData<?> responseData) {
        this(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg());
        Intrinsics.checkNotNullParameter(responseData, "");
    }
}
