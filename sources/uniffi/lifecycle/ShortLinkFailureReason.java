package uniffi.lifecycle;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class ShortLinkFailureReason {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ShortLinkFailureReason[] $VALUES;
    public static final ShortLinkFailureReason INVALID_SHORT_LINK = new ShortLinkFailureReason("INVALID_SHORT_LINK", 0);
    public static final ShortLinkFailureReason NO_DEEPLINK = new ShortLinkFailureReason("NO_DEEPLINK", 1);
    public static final ShortLinkFailureReason API_FAIL = new ShortLinkFailureReason("API_FAIL", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ShortLinkFailureReason[] $values() {
        return new ShortLinkFailureReason[]{INVALID_SHORT_LINK, NO_DEEPLINK, API_FAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ShortLinkFailureReason> getEntries() {
        return $ENTRIES;
    }

    private ShortLinkFailureReason(String str, int i) {
    }

    static {
        ShortLinkFailureReason[] shortLinkFailureReasonArr$values = $values();
        $VALUES = shortLinkFailureReasonArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(shortLinkFailureReasonArr$values);
    }

    public static ShortLinkFailureReason valueOf(String str) {
        return (ShortLinkFailureReason) Enum.valueOf(ShortLinkFailureReason.class, str);
    }

    public static ShortLinkFailureReason[] values() {
        return (ShortLinkFailureReason[]) $VALUES.clone();
    }
}
