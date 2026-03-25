package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class ConvertOrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConvertOrderStatus[] $VALUES;
    public static final ConvertOrderStatus SUCCESS = new ConvertOrderStatus("SUCCESS", 0);
    public static final ConvertOrderStatus FAILURE = new ConvertOrderStatus("FAILURE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConvertOrderStatus[] $values() {
        return new ConvertOrderStatus[]{SUCCESS, FAILURE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConvertOrderStatus> getEntries() {
        return $ENTRIES;
    }

    private ConvertOrderStatus(String str, int i) {
    }

    static {
        ConvertOrderStatus[] convertOrderStatusArr$values = $values();
        $VALUES = convertOrderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(convertOrderStatusArr$values);
    }

    public static ConvertOrderStatus valueOf(String str) {
        return (ConvertOrderStatus) Enum.valueOf(ConvertOrderStatus.class, str);
    }

    public static ConvertOrderStatus[] values() {
        return (ConvertOrderStatus[]) $VALUES.clone();
    }
}
