package com.okinc.buysell.data;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ImageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ImageType[] $VALUES;
    public static final ImageType WARNING = new ImageType("WARNING", 0);
    public static final ImageType SUCCESS = new ImageType("SUCCESS", 1);
    public static final ImageType PROCESSING = new ImageType("PROCESSING", 2);
    public static final ImageType ERROR = new ImageType(EventType.ERROR, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ImageType[] $values() {
        return new ImageType[]{WARNING, SUCCESS, PROCESSING, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ImageType> getEntries() {
        return $ENTRIES;
    }

    private ImageType(String str, int i) {
    }

    static {
        ImageType[] imageTypeArr$values = $values();
        $VALUES = imageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(imageTypeArr$values);
    }

    public static ImageType valueOf(String str) {
        return (ImageType) Enum.valueOf(ImageType.class, str);
    }

    public static ImageType[] values() {
        return (ImageType[]) $VALUES.clone();
    }
}
