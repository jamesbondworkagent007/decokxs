package com.okinc.assets.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class AssetsAccountType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AssetsAccountType[] $VALUES;
    public static final AssetsAccountType Funding = new AssetsAccountType("Funding", 0);
    public static final AssetsAccountType Trading = new AssetsAccountType("Trading", 1);
    public static final AssetsAccountType Earn = new AssetsAccountType("Earn", 2);
    public static final AssetsAccountType Loan = new AssetsAccountType("Loan", 3);
    public static final AssetsAccountType Jumpstart = new AssetsAccountType("Jumpstart", 4);
    public static final AssetsAccountType Structured = new AssetsAccountType("Structured", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AssetsAccountType[] $values() {
        return new AssetsAccountType[]{Funding, Trading, Earn, Loan, Jumpstart, Structured};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AssetsAccountType> getEntries() {
        return $ENTRIES;
    }

    private AssetsAccountType(String str, int i) {
    }

    static {
        AssetsAccountType[] assetsAccountTypeArr$values = $values();
        $VALUES = assetsAccountTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(assetsAccountTypeArr$values);
    }

    public static AssetsAccountType valueOf(String str) {
        return (AssetsAccountType) Enum.valueOf(AssetsAccountType.class, str);
    }

    public static AssetsAccountType[] values() {
        return (AssetsAccountType[]) $VALUES.clone();
    }
}
