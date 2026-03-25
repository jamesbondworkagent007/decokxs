package aws.smithy.kotlin.runtime.time;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class TimestampFormat {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TimestampFormat[] $VALUES;
    public static final TimestampFormat ISO_8601 = new TimestampFormat("ISO_8601", 0);
    public static final TimestampFormat ISO_8601_CONDENSED = new TimestampFormat("ISO_8601_CONDENSED", 1);
    public static final TimestampFormat ISO_8601_CONDENSED_DATE = new TimestampFormat("ISO_8601_CONDENSED_DATE", 2);
    public static final TimestampFormat RFC_5322 = new TimestampFormat("RFC_5322", 3);
    public static final TimestampFormat EPOCH_SECONDS = new TimestampFormat("EPOCH_SECONDS", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TimestampFormat[] $values() {
        return new TimestampFormat[]{ISO_8601, ISO_8601_CONDENSED, ISO_8601_CONDENSED_DATE, RFC_5322, EPOCH_SECONDS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TimestampFormat> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TimestampFormat valueOf(String str) {
        return (TimestampFormat) Enum.valueOf(TimestampFormat.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static TimestampFormat[] values() {
        return (TimestampFormat[]) $VALUES.clone();
    }

    private TimestampFormat(String str, int i) {
    }

    static {
        TimestampFormat[] timestampFormatArr$values = $values();
        $VALUES = timestampFormatArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(timestampFormatArr$values);
    }
}
