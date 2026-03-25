package com.okinc.web;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class WebStringEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WebStringEnum[] $VALUES;
    private final String type;
    public static final WebStringEnum BTN_SAVE_IMAGE = new WebStringEnum("BTN_SAVE_IMAGE", 0, "btn_save_image");
    public static final WebStringEnum BTN_CANCEL = new WebStringEnum("BTN_CANCEL", 1, "btn_cancel");
    public static final WebStringEnum BTN_OK = new WebStringEnum("BTN_OK", 2, "btn_ok");
    public static final WebStringEnum BTN_RELOAD = new WebStringEnum("BTN_RELOAD", 3, "btn_reload");
    public static final WebStringEnum FIXED_LINK_SHARE = new WebStringEnum("FIXED_LINK_SHARE", 4, "fixed_link_share");
    public static final WebStringEnum EMPTY_TITLE_ERROR = new WebStringEnum("EMPTY_TITLE_ERROR", 5, "empty_title_error");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WebStringEnum[] $values() {
        return new WebStringEnum[]{BTN_SAVE_IMAGE, BTN_CANCEL, BTN_OK, BTN_RELOAD, FIXED_LINK_SHARE, EMPTY_TITLE_ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WebStringEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private WebStringEnum(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        WebStringEnum[] webStringEnumArr$values = $values();
        $VALUES = webStringEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(webStringEnumArr$values);
    }

    public static WebStringEnum valueOf(String str) {
        return (WebStringEnum) Enum.valueOf(WebStringEnum.class, str);
    }

    public static WebStringEnum[] values() {
        return (WebStringEnum[]) $VALUES.clone();
    }
}
