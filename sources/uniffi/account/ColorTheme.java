package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class ColorTheme {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ColorTheme[] $VALUES;
    public static final ColorTheme GREEN_UP_MODERN = new ColorTheme("GREEN_UP_MODERN", 0);
    public static final ColorTheme RED_UP_MODERN = new ColorTheme("RED_UP_MODERN", 1);
    public static final ColorTheme GREEN_UP_CLASSIC = new ColorTheme("GREEN_UP_CLASSIC", 2);
    public static final ColorTheme RED_UP_CLASSIC = new ColorTheme("RED_UP_CLASSIC", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ColorTheme[] $values() {
        return new ColorTheme[]{GREEN_UP_MODERN, RED_UP_MODERN, GREEN_UP_CLASSIC, RED_UP_CLASSIC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ColorTheme> getEntries() {
        return $ENTRIES;
    }

    private ColorTheme(String str, int i) {
    }

    static {
        ColorTheme[] colorThemeArr$values = $values();
        $VALUES = colorThemeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(colorThemeArr$values);
    }

    public static ColorTheme valueOf(String str) {
        return (ColorTheme) Enum.valueOf(ColorTheme.class, str);
    }

    public static ColorTheme[] values() {
        return (ColorTheme[]) $VALUES.clone();
    }
}
