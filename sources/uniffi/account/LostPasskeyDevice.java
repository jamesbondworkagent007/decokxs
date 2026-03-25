package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class LostPasskeyDevice {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LostPasskeyDevice[] $VALUES;
    public static final LostPasskeyDevice ON_DEVICE_SINGLE = new LostPasskeyDevice("ON_DEVICE_SINGLE", 0);
    public static final LostPasskeyDevice ON_DEVICE_MULTIPLE = new LostPasskeyDevice("ON_DEVICE_MULTIPLE", 1);
    public static final LostPasskeyDevice CROSS_DEVICE_SINGLE = new LostPasskeyDevice("CROSS_DEVICE_SINGLE", 2);
    public static final LostPasskeyDevice CROSS_DEVICE_MULTIPLE = new LostPasskeyDevice("CROSS_DEVICE_MULTIPLE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LostPasskeyDevice[] $values() {
        return new LostPasskeyDevice[]{ON_DEVICE_SINGLE, ON_DEVICE_MULTIPLE, CROSS_DEVICE_SINGLE, CROSS_DEVICE_MULTIPLE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LostPasskeyDevice> getEntries() {
        return $ENTRIES;
    }

    private LostPasskeyDevice(String str, int i) {
    }

    static {
        LostPasskeyDevice[] lostPasskeyDeviceArr$values = $values();
        $VALUES = lostPasskeyDeviceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(lostPasskeyDeviceArr$values);
    }

    public static LostPasskeyDevice valueOf(String str) {
        return (LostPasskeyDevice) Enum.valueOf(LostPasskeyDevice.class, str);
    }

    public static LostPasskeyDevice[] values() {
        return (LostPasskeyDevice[]) $VALUES.clone();
    }
}
