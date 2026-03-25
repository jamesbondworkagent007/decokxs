package com.okinc.lifecycle.impl.deeplink.core;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LinkState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LinkState[] $VALUES;
    private final String reason;
    public static final LinkState SUCCESS = new LinkState("SUCCESS", 0, "SUCCESS");
    public static final LinkState EMPTY_LINK = new LinkState("EMPTY_LINK", 1, "empty_link");
    public static final LinkState SHORTCODE_API_FAILED = new LinkState("SHORTCODE_API_FAILED", 2, "shortcode_api_failed");
    public static final LinkState NO_DEEPLINK_PRESENT = new LinkState("NO_DEEPLINK_PRESENT", 3, "no_deeplink_present");
    public static final LinkState AUTH_FAILED = new LinkState("AUTH_FAILED", 4, "auth_failed");
    public static final LinkState UNLOCK_FAILED = new LinkState("UNLOCK_FAILED", 5, "unlock_failed");
    public static final LinkState MODE_NOT_SUPPORTED = new LinkState("MODE_NOT_SUPPORTED", 6, "mode_not_supported");
    public static final LinkState NO_SUPPORTED_HANDLER = new LinkState("NO_SUPPORTED_HANDLER", 7, "no_supported_handler");
    public static final LinkState LINK_OPENED_EXTERNALLY = new LinkState("LINK_OPENED_EXTERNALLY", 8, "link_opened_externally");
    public static final LinkState MODE_SWITCH_CANCELLED = new LinkState("MODE_SWITCH_CANCELLED", 9, "compliance_failed");
    public static final LinkState NEW_LINK_TRIGGER_CANCELLED = new LinkState("NEW_LINK_TRIGGER_CANCELLED", 10, "new_link_trigger_cancelled");
    public static final LinkState DEEPLINK_NOT_SUPPORTED_IN_WALLET_APP = new LinkState("DEEPLINK_NOT_SUPPORTED_IN_WALLET_APP", 11, "deeplink_not_supported_in_wallet_app");
    public static final LinkState DEEPLINK_NOT_SUPPORTED_IN_RBAC_ACCOUNT = new LinkState("DEEPLINK_NOT_SUPPORTED_IN_RBAC_ACCOUNT", 12, "deeplink_not_supported_in_rbac_account");
    public static final LinkState DEEPLINK_NOT_SUPPORTED_IN_RM_ACCOUNT = new LinkState("DEEPLINK_NOT_SUPPORTED_IN_RM_ACCOUNT", 13, "deeplink_not_supported_in_rm_account");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LinkState[] $values() {
        return new LinkState[]{SUCCESS, EMPTY_LINK, SHORTCODE_API_FAILED, NO_DEEPLINK_PRESENT, AUTH_FAILED, UNLOCK_FAILED, MODE_NOT_SUPPORTED, NO_SUPPORTED_HANDLER, LINK_OPENED_EXTERNALLY, MODE_SWITCH_CANCELLED, NEW_LINK_TRIGGER_CANCELLED, DEEPLINK_NOT_SUPPORTED_IN_WALLET_APP, DEEPLINK_NOT_SUPPORTED_IN_RBAC_ACCOUNT, DEEPLINK_NOT_SUPPORTED_IN_RM_ACCOUNT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LinkState> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReason() {
        return this.reason;
    }

    private LinkState(String str, int i, String str2) {
        this.reason = str2;
    }

    static {
        LinkState[] linkStateArr$values = $values();
        $VALUES = linkStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(linkStateArr$values);
    }

    public static LinkState valueOf(String str) {
        return (LinkState) Enum.valueOf(LinkState.class, str);
    }

    public static LinkState[] values() {
        return (LinkState[]) $VALUES.clone();
    }
}
