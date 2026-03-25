package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class NetworkFeeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NetworkFeeType[] $VALUES;
    public static final NetworkFeeType STANDARD = new NetworkFeeType("STANDARD", 0);
    public static final NetworkFeeType EIP1559 = new NetworkFeeType("EIP1559", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NetworkFeeType[] $values() {
        return new NetworkFeeType[]{STANDARD, EIP1559};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NetworkFeeType> getEntries() {
        return $ENTRIES;
    }

    private NetworkFeeType(String str, int i) {
    }

    static {
        NetworkFeeType[] networkFeeTypeArr$values = $values();
        $VALUES = networkFeeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(networkFeeTypeArr$values);
    }

    public static NetworkFeeType valueOf(String str) {
        return (NetworkFeeType) Enum.valueOf(NetworkFeeType.class, str);
    }

    public static NetworkFeeType[] values() {
        return (NetworkFeeType[]) $VALUES.clone();
    }
}
