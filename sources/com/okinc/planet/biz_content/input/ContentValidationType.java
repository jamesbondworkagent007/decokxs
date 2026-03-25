package com.okinc.planet.biz_content.input;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ContentValidationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ContentValidationType[] $VALUES;
    public static final ContentValidationType BLANK_ALL = new ContentValidationType("BLANK_ALL", 0);
    public static final ContentValidationType BLANK_TEXT_HAVE_IMAGES = new ContentValidationType("BLANK_TEXT_HAVE_IMAGES", 1);
    public static final ContentValidationType BLANK_TEXT_HAVE_PLUGIN = new ContentValidationType("BLANK_TEXT_HAVE_PLUGIN", 2);
    public static final ContentValidationType URL_DETECTION = new ContentValidationType("URL_DETECTION", 3);
    public static final ContentValidationType LENGTH_LIMIT = new ContentValidationType("LENGTH_LIMIT", 4);
    public static final ContentValidationType IMAGE_UPLOAD_FAIL = new ContentValidationType("IMAGE_UPLOAD_FAIL", 5);
    public static final ContentValidationType ACTIVITY_IMAGE_UPLOAD_FAIL = new ContentValidationType("ACTIVITY_IMAGE_UPLOAD_FAIL", 6);
    public static final ContentValidationType IMAGE_UPLOAD_PROGRESSING = new ContentValidationType("IMAGE_UPLOAD_PROGRESSING", 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ContentValidationType[] $values() {
        return new ContentValidationType[]{BLANK_ALL, BLANK_TEXT_HAVE_IMAGES, BLANK_TEXT_HAVE_PLUGIN, URL_DETECTION, LENGTH_LIMIT, IMAGE_UPLOAD_FAIL, ACTIVITY_IMAGE_UPLOAD_FAIL, IMAGE_UPLOAD_PROGRESSING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ContentValidationType> getEntries() {
        return $ENTRIES;
    }

    private ContentValidationType(String str, int i) {
    }

    static {
        ContentValidationType[] contentValidationTypeArr$values = $values();
        $VALUES = contentValidationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(contentValidationTypeArr$values);
    }

    public static ContentValidationType valueOf(String str) {
        return (ContentValidationType) Enum.valueOf(ContentValidationType.class, str);
    }

    public static ContentValidationType[] values() {
        return (ContentValidationType[]) $VALUES.clone();
    }
}
