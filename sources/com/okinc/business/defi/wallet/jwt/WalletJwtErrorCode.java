package com.okinc.business.defi.wallet.jwt;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class WalletJwtErrorCode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletJwtErrorCode[] $VALUES;
    private final int code;
    public static final WalletJwtErrorCode UNKNOWN = new WalletJwtErrorCode("UNKNOWN", 0, -1);
    public static final WalletJwtErrorCode GENERATE_JWT_ERROR = new WalletJwtErrorCode("GENERATE_JWT_ERROR", 1, -999);
    public static final WalletJwtErrorCode DECODE_JWT_ERROR = new WalletJwtErrorCode("DECODE_JWT_ERROR", 2, -998);
    public static final WalletJwtErrorCode VALIDATE_JWT_ERROR = new WalletJwtErrorCode("VALIDATE_JWT_ERROR", 3, -997);
    public static final WalletJwtErrorCode EMPTY_JWT_ERROR = new WalletJwtErrorCode("EMPTY_JWT_ERROR", 4, -996);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletJwtErrorCode[] $values() {
        return new WalletJwtErrorCode[]{UNKNOWN, GENERATE_JWT_ERROR, DECODE_JWT_ERROR, VALIDATE_JWT_ERROR, EMPTY_JWT_ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletJwtErrorCode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    private WalletJwtErrorCode(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        WalletJwtErrorCode[] walletJwtErrorCodeArr$values = $values();
        $VALUES = walletJwtErrorCodeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletJwtErrorCodeArr$values);
    }

    public static WalletJwtErrorCode valueOf(String str) {
        return (WalletJwtErrorCode) Enum.valueOf(WalletJwtErrorCode.class, str);
    }

    public static WalletJwtErrorCode[] values() {
        return (WalletJwtErrorCode[]) $VALUES.clone();
    }
}
