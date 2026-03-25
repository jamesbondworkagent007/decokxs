package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class BluetoothConnectDevice {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BluetoothConnectDevice[] $VALUES;
    public static final BluetoothConnectDevice TRIGGER_VERIFICATION = new BluetoothConnectDevice("TRIGGER_VERIFICATION", 0);
    public static final BluetoothConnectDevice AUTHORIZATION = new BluetoothConnectDevice("AUTHORIZATION", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BluetoothConnectDevice[] $values() {
        return new BluetoothConnectDevice[]{TRIGGER_VERIFICATION, AUTHORIZATION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BluetoothConnectDevice> getEntries() {
        return $ENTRIES;
    }

    private BluetoothConnectDevice(String str, int i) {
    }

    static {
        BluetoothConnectDevice[] bluetoothConnectDeviceArr$values = $values();
        $VALUES = bluetoothConnectDeviceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bluetoothConnectDeviceArr$values);
    }

    public static BluetoothConnectDevice valueOf(String str) {
        return (BluetoothConnectDevice) Enum.valueOf(BluetoothConnectDevice.class, str);
    }

    public static BluetoothConnectDevice[] values() {
        return (BluetoothConnectDevice[]) $VALUES.clone();
    }
}
