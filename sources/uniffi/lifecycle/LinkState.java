package uniffi.lifecycle;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class LinkState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LinkState[] $VALUES;
    public static final LinkState SUCCESS = new LinkState("SUCCESS", 0);
    public static final LinkState EMPTY_LINK = new LinkState("EMPTY_LINK", 1);
    public static final LinkState SHORTCODE_API_FAILED = new LinkState("SHORTCODE_API_FAILED", 2);
    public static final LinkState NO_DEEPLINK_PRESENT = new LinkState("NO_DEEPLINK_PRESENT", 3);
    public static final LinkState AUTH_FAILED = new LinkState("AUTH_FAILED", 4);
    public static final LinkState UNLOCK_FAILED = new LinkState("UNLOCK_FAILED", 5);
    public static final LinkState MODE_NOT_SUPPORTED = new LinkState("MODE_NOT_SUPPORTED", 6);
    public static final LinkState NO_SUPPORTED_HANDLER = new LinkState("NO_SUPPORTED_HANDLER", 7);
    public static final LinkState LINK_OPENED_EXTERNALLY = new LinkState("LINK_OPENED_EXTERNALLY", 8);
    public static final LinkState MODE_SWITCH_CANCELLED = new LinkState("MODE_SWITCH_CANCELLED", 9);
    public static final LinkState NEW_LINK_TRIGGER_CANCELLED = new LinkState("NEW_LINK_TRIGGER_CANCELLED", 10);
    public static final LinkState DEEPLINK_NOT_SUPPORTED_IN_WALLET_APP = new LinkState("DEEPLINK_NOT_SUPPORTED_IN_WALLET_APP", 11);
    public static final LinkState DEEPLINK_NOT_SUPPORTED_IN_RBAC_ACCOUNT = new LinkState("DEEPLINK_NOT_SUPPORTED_IN_RBAC_ACCOUNT", 12);
    public static final LinkState DEEPLINK_NOT_SUPPORTED_IN_RM_ACCOUNT = new LinkState("DEEPLINK_NOT_SUPPORTED_IN_RM_ACCOUNT", 13);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LinkState[] $values() {
        return new LinkState[]{SUCCESS, EMPTY_LINK, SHORTCODE_API_FAILED, NO_DEEPLINK_PRESENT, AUTH_FAILED, UNLOCK_FAILED, MODE_NOT_SUPPORTED, NO_SUPPORTED_HANDLER, LINK_OPENED_EXTERNALLY, MODE_SWITCH_CANCELLED, NEW_LINK_TRIGGER_CANCELLED, DEEPLINK_NOT_SUPPORTED_IN_WALLET_APP, DEEPLINK_NOT_SUPPORTED_IN_RBAC_ACCOUNT, DEEPLINK_NOT_SUPPORTED_IN_RM_ACCOUNT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LinkState> getEntries() {
        return $ENTRIES;
    }

    private LinkState(String str, int i) {
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
