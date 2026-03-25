package com.okinc.modular.deeplinkv2;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LinkSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LinkSource[] $VALUES;
    private final String source;
    public static final LinkSource UNKNOWN = new LinkSource("UNKNOWN", 0, "unknown");
    public static final LinkSource IN_APP = new LinkSource("IN_APP", 1, "in_app");
    public static final LinkSource EXTERNAL = new LinkSource("EXTERNAL", 2, "external");
    public static final LinkSource WEB3_QR_SCAN = new LinkSource("WEB3_QR_SCAN", 3, "web3_qr_scan");
    public static final LinkSource NFC_TAG = new LinkSource("NFC_TAG", 4, "nfc_tag");
    public static final LinkSource DOWNLOAD_HANDLER = new LinkSource("DOWNLOAD_HANDLER", 5, "download_handler");
    public static final LinkSource SHORTCODE_HANDLER = new LinkSource("SHORTCODE_HANDLER", 6, "shortcode_handler");
    public static final LinkSource CAMPAIGN_HANDLER = new LinkSource("CAMPAIGN_HANDLER", 7, "campaign_handler");
    public static final LinkSource H5_INTERCEPTION = new LinkSource("H5_INTERCEPTION", 8, "h5_interception");
    public static final LinkSource UNKNOWN_APP_LINK_HANDLER = new LinkSource("UNKNOWN_APP_LINK_HANDLER", 9, "unknown_app_link_handler");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LinkSource[] $values() {
        return new LinkSource[]{UNKNOWN, IN_APP, EXTERNAL, WEB3_QR_SCAN, NFC_TAG, DOWNLOAD_HANDLER, SHORTCODE_HANDLER, CAMPAIGN_HANDLER, H5_INTERCEPTION, UNKNOWN_APP_LINK_HANDLER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LinkSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    private LinkSource(String str, int i, String str2) {
        this.source = str2;
    }

    static {
        LinkSource[] linkSourceArr$values = $values();
        $VALUES = linkSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(linkSourceArr$values);
    }

    public static LinkSource valueOf(String str) {
        return (LinkSource) Enum.valueOf(LinkSource.class, str);
    }

    public static LinkSource[] values() {
        return (LinkSource[]) $VALUES.clone();
    }
}
