package com.okinc.wallet.api;

import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletAddressSwitchException extends Exception {
    public static final int $stable = 0;
    private final ErrorType errorType;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletAddressSwitchException copy$default(WalletAddressSwitchException walletAddressSwitchException, String str, ErrorType errorType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletAddressSwitchException.message;
        }
        if ((i & 2) != 0) {
            errorType = walletAddressSwitchException.errorType;
        }
        return walletAddressSwitchException.copy(str, errorType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ErrorType component2() {
        return this.errorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAddressSwitchException copy(@NotNull String str, @NotNull ErrorType errorType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(errorType, "");
        return new WalletAddressSwitchException(str, errorType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletAddressSwitchException)) {
            return false;
        }
        WalletAddressSwitchException walletAddressSwitchException = (WalletAddressSwitchException) obj;
        return Intrinsics.EZpvd((Object) this.message, (Object) walletAddressSwitchException.message) && this.errorType == walletAddressSwitchException.errorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ErrorType getErrorType() {
        return this.errorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.message.hashCode() * 31) + this.errorType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String toString() {
        return "WalletAddressSwitchException(message=" + this.message + ", errorType=" + this.errorType + ")";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ErrorType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType INVALID_WALLET = new ErrorType("INVALID_WALLET", 0);
        public static final ErrorType INVALID_COIN_ID = new ErrorType("INVALID_COIN_ID", 1);
        public static final ErrorType COIN_NOT_SUPPORT_AGGREGATION = new ErrorType("COIN_NOT_SUPPORT_AGGREGATION", 2);
        public static final ErrorType ADDRESS_SWITCH_CANCELLED = new ErrorType("ADDRESS_SWITCH_CANCELLED", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{INVALID_WALLET, INVALID_COIN_ID, COIN_NOT_SUPPORT_AGGREGATION, ADDRESS_SWITCH_CANCELLED};
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressSwitchException(@NotNull String str, @NotNull ErrorType errorType) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(errorType, "");
        this.message = str;
        this.errorType = errorType;
    }
}
