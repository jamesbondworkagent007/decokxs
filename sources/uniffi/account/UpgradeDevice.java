package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class UpgradeDevice {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UpgradeDevice[] $VALUES;
    public static final UpgradeDevice ON_DEVICE = new UpgradeDevice("ON_DEVICE", 0);
    public static final UpgradeDevice CROSS_DEVICE = new UpgradeDevice("CROSS_DEVICE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UpgradeDevice[] $values() {
        return new UpgradeDevice[]{ON_DEVICE, CROSS_DEVICE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UpgradeDevice> getEntries() {
        return $ENTRIES;
    }

    private UpgradeDevice(String str, int i) {
    }

    static {
        UpgradeDevice[] upgradeDeviceArr$values = $values();
        $VALUES = upgradeDeviceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(upgradeDeviceArr$values);
    }

    public static UpgradeDevice valueOf(String str) {
        return (UpgradeDevice) Enum.valueOf(UpgradeDevice.class, str);
    }

    public static UpgradeDevice[] values() {
        return (UpgradeDevice[]) $VALUES.clone();
    }
}
