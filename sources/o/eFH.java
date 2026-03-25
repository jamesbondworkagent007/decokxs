package o;

import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eFH {
    public static final int EZpvd = BluetoothDeviceModel.$stable;
    public final boolean AEQbTJ;
    public final BluetoothDeviceModel KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BluetoothDeviceModel AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    public eFH(@NotNull BluetoothDeviceModel bluetoothDeviceModel, boolean z) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        this.KWHzl = bluetoothDeviceModel;
        this.AEQbTJ = z;
    }
}
