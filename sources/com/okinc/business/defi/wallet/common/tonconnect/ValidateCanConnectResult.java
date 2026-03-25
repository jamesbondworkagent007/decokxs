package com.okinc.business.defi.wallet.common.tonconnect;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ValidateCanConnectResult {
    public final ErrorType KWHzl;
    public final Integer copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ValidateCanConnectResult copy$default(ValidateCanConnectResult validateCanConnectResult, ErrorType errorType, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            errorType = validateCanConnectResult.KWHzl;
        }
        if ((i & 2) != 0) {
            num = validateCanConnectResult.copydefault;
        }
        return validateCanConnectResult.AEQbTJ(errorType, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidateCanConnectResult AEQbTJ(@NotNull ErrorType errorType, @StringRes Integer num) {
        Intrinsics.checkNotNullParameter(errorType, "");
        return new ValidateCanConnectResult(errorType, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ErrorType KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateCanConnectResult)) {
            return false;
        }
        ValidateCanConnectResult validateCanConnectResult = (ValidateCanConnectResult) obj;
        return this.KWHzl == validateCanConnectResult.KWHzl && Intrinsics.EZpvd(this.copydefault, validateCanConnectResult.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        Integer num = this.copydefault;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ValidateCanConnectResult(errorType=" + this.KWHzl + ", msgRes=" + this.copydefault + ")";
    }

    public ValidateCanConnectResult(@NotNull ErrorType errorType, @StringRes Integer num) {
        Intrinsics.checkNotNullParameter(errorType, "");
        this.KWHzl = errorType;
        this.copydefault = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult$ErrorType)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
 A[MD:(com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult$ErrorType, java.lang.Integer):void (m)] (LINE:820) call: com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult.<init>(com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult$ErrorType, java.lang.Integer):void type: THIS */
    public /* synthetic */ ValidateCanConnectResult(ErrorType errorType, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorType, (i & 2) != 0 ? null : num);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ErrorType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType NONE = new ErrorType("NONE", 0);
        public static final ErrorType NOT_SUPPORTED = new ErrorType("NOT_SUPPORTED", 1);
        public static final ErrorType NOT_TCV2 = new ErrorType("NOT_TCV2", 2);
        public static final ErrorType WALLET_NOT_BACKED_UP = new ErrorType("WALLET_NOT_BACKED_UP", 3);
        public static final ErrorType WALLET_NOT_SUPPORTED = new ErrorType("WALLET_NOT_SUPPORTED", 4);
        public static final ErrorType ENCRYPTED_STORAGE_NOT_INIT = new ErrorType("ENCRYPTED_STORAGE_NOT_INIT", 5);
        public static final ErrorType RISKY_CONNECTION = new ErrorType("RISKY_CONNECTION", 6);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{NONE, NOT_SUPPORTED, NOT_TCV2, WALLET_NOT_BACKED_UP, WALLET_NOT_SUPPORTED, ENCRYPTED_STORAGE_NOT_INIT, RISKY_CONNECTION};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ErrorType> getEntries() {
            return $ENTRIES;
        }

        private ErrorType(String str, int i) {
        }

        static {
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(errorTypeArr$values);
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    public final boolean EZpvd() {
        ErrorType errorType = this.KWHzl;
        return errorType == ErrorType.NONE || errorType == ErrorType.WALLET_NOT_SUPPORTED;
    }

    public final boolean AEQbTJ() {
        return this.KWHzl == ErrorType.NONE;
    }
}
