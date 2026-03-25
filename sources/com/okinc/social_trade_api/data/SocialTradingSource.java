package com.okinc.social_trade_api.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class SocialTradingSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SocialTradingSource[] $VALUES;
    public static final SocialTradingSource DEFAULT = new SocialTradingSource("DEFAULT", 0);
    public static final SocialTradingSource FROM_IA = new SocialTradingSource("FROM_IA", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SocialTradingSource[] $values() {
        return new SocialTradingSource[]{DEFAULT, FROM_IA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SocialTradingSource> getEntries() {
        return $ENTRIES;
    }

    private SocialTradingSource(String str, int i) {
    }

    static {
        SocialTradingSource[] socialTradingSourceArr$values = $values();
        $VALUES = socialTradingSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(socialTradingSourceArr$values);
    }

    public static SocialTradingSource valueOf(String str) {
        return (SocialTradingSource) Enum.valueOf(SocialTradingSource.class, str);
    }

    public static SocialTradingSource[] values() {
        return (SocialTradingSource[]) $VALUES.clone();
    }
}
