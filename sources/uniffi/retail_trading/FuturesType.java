package uniffi.retail_trading;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class FuturesType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FuturesType[] $VALUES;
    public static final FuturesType ALL = new FuturesType("ALL", 0);
    public static final FuturesType PERPETUAL_AND_EXPIRY = new FuturesType("PERPETUAL_AND_EXPIRY", 1);
    public static final FuturesType PERPETUAL = new FuturesType("PERPETUAL", 2);
    public static final FuturesType EXPIRY = new FuturesType("EXPIRY", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FuturesType[] $values() {
        return new FuturesType[]{ALL, PERPETUAL_AND_EXPIRY, PERPETUAL, EXPIRY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FuturesType> getEntries() {
        return $ENTRIES;
    }

    private FuturesType(String str, int i) {
    }

    static {
        FuturesType[] futuresTypeArr$values = $values();
        $VALUES = futuresTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(futuresTypeArr$values);
    }

    public static FuturesType valueOf(String str) {
        return (FuturesType) Enum.valueOf(FuturesType.class, str);
    }

    public static FuturesType[] values() {
        return (FuturesType[]) $VALUES.clone();
    }
}
