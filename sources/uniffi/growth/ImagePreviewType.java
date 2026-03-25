package uniffi.growth;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class ImagePreviewType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ImagePreviewType[] $VALUES;
    private final int value;
    public static final ImagePreviewType CENTER_INSIDE = new ImagePreviewType("CENTER_INSIDE", 0, 1);
    public static final ImagePreviewType CENTER_CROP = new ImagePreviewType("CENTER_CROP", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ImagePreviewType[] $values() {
        return new ImagePreviewType[]{CENTER_INSIDE, CENTER_CROP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ImagePreviewType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ImagePreviewType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ImagePreviewType[] imagePreviewTypeArr$values = $values();
        $VALUES = imagePreviewTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(imagePreviewTypeArr$values);
    }

    public static ImagePreviewType valueOf(String str) {
        return (ImagePreviewType) Enum.valueOf(ImagePreviewType.class, str);
    }

    public static ImagePreviewType[] values() {
        return (ImagePreviewType[]) $VALUES.clone();
    }
}
