package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class LinkTextStyleType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LinkTextStyleType[] $VALUES;
    public static final LinkTextStyleType HYPERLINK = new LinkTextStyleType("HYPERLINK", 0);
    public static final LinkTextStyleType UNKNOWN = new LinkTextStyleType("UNKNOWN", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LinkTextStyleType[] $values() {
        return new LinkTextStyleType[]{HYPERLINK, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LinkTextStyleType> getEntries() {
        return $ENTRIES;
    }

    private LinkTextStyleType(String str, int i) {
    }

    static {
        LinkTextStyleType[] linkTextStyleTypeArr$values = $values();
        $VALUES = linkTextStyleTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(linkTextStyleTypeArr$values);
    }

    public static LinkTextStyleType valueOf(String str) {
        return (LinkTextStyleType) Enum.valueOf(LinkTextStyleType.class, str);
    }

    public static LinkTextStyleType[] values() {
        return (LinkTextStyleType[]) $VALUES.clone();
    }
}
