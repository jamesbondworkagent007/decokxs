package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class ChainExpireStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChainExpireStyle[] $VALUES;
    public static final ChainExpireStyle EXPIRED = new ChainExpireStyle("EXPIRED", 0);
    public static final ChainExpireStyle NOT_EXPIRED = new ChainExpireStyle("NOT_EXPIRED", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChainExpireStyle[] $values() {
        return new ChainExpireStyle[]{EXPIRED, NOT_EXPIRED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChainExpireStyle> getEntries() {
        return $ENTRIES;
    }

    private ChainExpireStyle(String str, int i) {
    }

    static {
        ChainExpireStyle[] chainExpireStyleArr$values = $values();
        $VALUES = chainExpireStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chainExpireStyleArr$values);
    }

    public static ChainExpireStyle valueOf(String str) {
        return (ChainExpireStyle) Enum.valueOf(ChainExpireStyle.class, str);
    }

    public static ChainExpireStyle[] values() {
        return (ChainExpireStyle[]) $VALUES.clone();
    }
}
