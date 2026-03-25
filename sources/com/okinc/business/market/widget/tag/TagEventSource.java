package com.okinc.business.market.widget.tag;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TagEventSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TagEventSource[] $VALUES;
    private final String value;
    public static final TagEventSource HOMEPAGE = new TagEventSource("HOMEPAGE", 0, "dex_homepage_tag");
    public static final TagEventSource SEARCH_BANNER = new TagEventSource("SEARCH_BANNER", 1, "dex_search_banner");
    public static final TagEventSource TOKEN_DETAIL = new TagEventSource("TOKEN_DETAIL", 2, "dex_tokendetail_tag");
    public static final TagEventSource MODULE = new TagEventSource("MODULE", 3, "dex_module_tag");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TagEventSource[] $values() {
        return new TagEventSource[]{HOMEPAGE, SEARCH_BANNER, TOKEN_DETAIL, MODULE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TagEventSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private TagEventSource(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        TagEventSource[] tagEventSourceArr$values = $values();
        $VALUES = tagEventSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tagEventSourceArr$values);
    }

    public static TagEventSource valueOf(String str) {
        return (TagEventSource) Enum.valueOf(TagEventSource.class, str);
    }

    public static TagEventSource[] values() {
        return (TagEventSource[]) $VALUES.clone();
    }
}
