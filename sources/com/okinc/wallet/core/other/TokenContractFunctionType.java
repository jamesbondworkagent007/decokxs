package com.okinc.wallet.core.other;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class TokenContractFunctionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenContractFunctionType[] $VALUES;
    public static final TokenContractFunctionType TypeUnknown = new TokenContractFunctionType("TypeUnknown", 0);
    public static final TokenContractFunctionType TypeTransfer = new TokenContractFunctionType("TypeTransfer", 1);
    public static final TokenContractFunctionType TypeBalanceOf = new TokenContractFunctionType("TypeBalanceOf", 2);
    public static final TokenContractFunctionType TypeTotalSupply = new TokenContractFunctionType("TypeTotalSupply", 3);
    public static final TokenContractFunctionType TypeApprove = new TokenContractFunctionType("TypeApprove", 4);
    public static final TokenContractFunctionType TypeSetApproveForAll = new TokenContractFunctionType("TypeSetApproveForAll", 5);
    public static final TokenContractFunctionType TypeSymbol = new TokenContractFunctionType("TypeSymbol", 6);
    public static final TokenContractFunctionType TypeName = new TokenContractFunctionType("TypeName", 7);
    public static final TokenContractFunctionType TypeDecimals = new TokenContractFunctionType("TypeDecimals", 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenContractFunctionType[] $values() {
        return new TokenContractFunctionType[]{TypeUnknown, TypeTransfer, TypeBalanceOf, TypeTotalSupply, TypeApprove, TypeSetApproveForAll, TypeSymbol, TypeName, TypeDecimals};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenContractFunctionType> getEntries() {
        return $ENTRIES;
    }

    private TokenContractFunctionType(String str, int i) {
    }

    static {
        TokenContractFunctionType[] tokenContractFunctionTypeArr$values = $values();
        $VALUES = tokenContractFunctionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenContractFunctionTypeArr$values);
    }

    public static TokenContractFunctionType valueOf(String str) {
        return (TokenContractFunctionType) Enum.valueOf(TokenContractFunctionType.class, str);
    }

    public static TokenContractFunctionType[] values() {
        return (TokenContractFunctionType[]) $VALUES.clone();
    }
}
