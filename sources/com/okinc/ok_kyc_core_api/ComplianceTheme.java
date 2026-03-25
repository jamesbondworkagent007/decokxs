package com.okinc.ok_kyc_core_api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ComplianceTheme {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ComplianceTheme[] $VALUES;
    public static final ComplianceTheme OKX = new ComplianceTheme("OKX", 0);
    public static final ComplianceTheme OKX_LITE = new ComplianceTheme("OKX_LITE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ComplianceTheme[] $values() {
        return new ComplianceTheme[]{OKX, OKX_LITE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ComplianceTheme> getEntries() {
        return $ENTRIES;
    }

    private ComplianceTheme(String str, int i) {
    }

    static {
        ComplianceTheme[] complianceThemeArr$values = $values();
        $VALUES = complianceThemeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(complianceThemeArr$values);
    }

    public static ComplianceTheme valueOf(String str) {
        return (ComplianceTheme) Enum.valueOf(ComplianceTheme.class, str);
    }

    public static ComplianceTheme[] values() {
        return (ComplianceTheme[]) $VALUES.clone();
    }
}
