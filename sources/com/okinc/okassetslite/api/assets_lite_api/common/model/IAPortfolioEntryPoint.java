package com.okinc.okassetslite.api.assets_lite_api.common.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class IAPortfolioEntryPoint {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IAPortfolioEntryPoint[] $VALUES;
    public static final IAPortfolioEntryPoint PORTFOLIO = new IAPortfolioEntryPoint("PORTFOLIO", 0);
    public static final IAPortfolioEntryPoint TOKEN_DETAIL = new IAPortfolioEntryPoint("TOKEN_DETAIL", 1);
    public static final IAPortfolioEntryPoint TRANSACTION_HISTORY = new IAPortfolioEntryPoint("TRANSACTION_HISTORY", 2);
    public static final IAPortfolioEntryPoint ADV_TRANSACTION = new IAPortfolioEntryPoint("ADV_TRANSACTION", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IAPortfolioEntryPoint[] $values() {
        return new IAPortfolioEntryPoint[]{PORTFOLIO, TOKEN_DETAIL, TRANSACTION_HISTORY, ADV_TRANSACTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IAPortfolioEntryPoint> getEntries() {
        return $ENTRIES;
    }

    private IAPortfolioEntryPoint(String str, int i) {
    }

    static {
        IAPortfolioEntryPoint[] iAPortfolioEntryPointArr$values = $values();
        $VALUES = iAPortfolioEntryPointArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iAPortfolioEntryPointArr$values);
    }

    public static IAPortfolioEntryPoint valueOf(String str) {
        return (IAPortfolioEntryPoint) Enum.valueOf(IAPortfolioEntryPoint.class, str);
    }

    public static IAPortfolioEntryPoint[] values() {
        return (IAPortfolioEntryPoint[]) $VALUES.clone();
    }
}
