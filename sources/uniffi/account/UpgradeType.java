package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class UpgradeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UpgradeType[] $VALUES;
    public static final UpgradeType ON_DEVICE_MULTIPLE = new UpgradeType("ON_DEVICE_MULTIPLE", 0);
    public static final UpgradeType ON_DEVICE_SINGLE = new UpgradeType("ON_DEVICE_SINGLE", 1);
    public static final UpgradeType CROSS_DEVICE = new UpgradeType("CROSS_DEVICE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UpgradeType[] $values() {
        return new UpgradeType[]{ON_DEVICE_MULTIPLE, ON_DEVICE_SINGLE, CROSS_DEVICE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UpgradeType> getEntries() {
        return $ENTRIES;
    }

    private UpgradeType(String str, int i) {
    }

    static {
        UpgradeType[] upgradeTypeArr$values = $values();
        $VALUES = upgradeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(upgradeTypeArr$values);
    }

    public static UpgradeType valueOf(String str) {
        return (UpgradeType) Enum.valueOf(UpgradeType.class, str);
    }

    public static UpgradeType[] values() {
        return (UpgradeType[]) $VALUES.clone();
    }
}
