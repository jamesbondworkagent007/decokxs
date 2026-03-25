package com.okinc.lifecycle.impl.deeplink.core;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class AnalyticsLinkType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AnalyticsLinkType[] $VALUES;
    private final String type;
    public static final AnalyticsLinkType UNKNOWN = new AnalyticsLinkType("UNKNOWN", 0, "unknown");
    public static final AnalyticsLinkType DEEPLINK = new AnalyticsLinkType("DEEPLINK", 1, "deeplink");
    public static final AnalyticsLinkType DOWNLOAD_LINK = new AnalyticsLinkType("DOWNLOAD_LINK", 2, "download_link");
    public static final AnalyticsLinkType SHORTCODE_LINK = new AnalyticsLinkType("SHORTCODE_LINK", 3, "shortcode_link");
    public static final AnalyticsLinkType CAMPAIGN_LINK = new AnalyticsLinkType("CAMPAIGN_LINK", 4, "campaign_link");
    public static final AnalyticsLinkType OTHER_UNIVERSAL_LINK = new AnalyticsLinkType("OTHER_UNIVERSAL_LINK", 5, "other_universal_link");
    public static final AnalyticsLinkType NON_OKX_UNIVERSAL_LINK = new AnalyticsLinkType("NON_OKX_UNIVERSAL_LINK", 6, "non_okx_universal_link");
    public static final AnalyticsLinkType CUSTOM_SCHEME = new AnalyticsLinkType("CUSTOM_SCHEME", 7, "custom_scheme");
    public static final AnalyticsLinkType PROCESS_EXTERNAL_LINK = new AnalyticsLinkType("PROCESS_EXTERNAL_LINK", 8, "process_external_link");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AnalyticsLinkType[] $values() {
        return new AnalyticsLinkType[]{UNKNOWN, DEEPLINK, DOWNLOAD_LINK, SHORTCODE_LINK, CAMPAIGN_LINK, OTHER_UNIVERSAL_LINK, NON_OKX_UNIVERSAL_LINK, CUSTOM_SCHEME, PROCESS_EXTERNAL_LINK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AnalyticsLinkType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private AnalyticsLinkType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        AnalyticsLinkType[] analyticsLinkTypeArr$values = $values();
        $VALUES = analyticsLinkTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(analyticsLinkTypeArr$values);
    }

    public static AnalyticsLinkType valueOf(String str) {
        return (AnalyticsLinkType) Enum.valueOf(AnalyticsLinkType.class, str);
    }

    public static AnalyticsLinkType[] values() {
        return (AnalyticsLinkType[]) $VALUES.clone();
    }
}
