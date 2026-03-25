package o;

import com.okinc.core.util.SPUtils;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.okinc.wallet.hardware.api.onekey.OneKeyDevice;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dcz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13992dcz {
    public static final C13992dcz AEQbTJ = new C13992dcz();

    private C13992dcz() {
    }

    public final boolean AYXKKw() {
        return SPUtils.getBoolean("show_first_bluetooth_guide", true);
    }

    public final void EZpvd() {
        SPUtils.commit("show_first_bluetooth_guide", java.lang.Boolean.FALSE);
    }

    public final boolean gEmmrt() {
        return SPUtils.getBoolean("show_first_keystone_guide", true);
    }

    public final void AEQbTJ() {
        SPUtils.commit("show_first_keystone_guide", java.lang.Boolean.FALSE);
    }

    public final boolean OLrzqt() {
        return SPUtils.getBoolean("connect_succeed_once", false);
    }

    public final java.util.ArrayList<BluetoothDeviceModel> copydefault() {
        java.util.ArrayList<BluetoothDeviceModel> arrayList = SPUtils.getArrayList("get_connected_bluetooth_devices", BluetoothDeviceModel.class);
        return arrayList == null ? new java.util.ArrayList<>() : arrayList;
    }

    public final void KWHzl() {
        SPUtils.remove("connect_succeed_once");
        SPUtils.remove("get_connected_bluetooth_devices");
        C57032yak c57032yak = C57032yak.AEQbTJ;
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = c57032yak.AEQbTJ();
        if (interfaceC57036yaoAEQbTJ != null) {
            c57032yak.copydefault(interfaceC57036yaoAEQbTJ.OLrzqt());
        }
        InterfaceC57039yar interfaceC57039yarOLrzqt = ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).OLrzqt();
        java.util.Iterator<T> it = interfaceC57039yarOLrzqt.OLrzqt().iterator();
        while (it.hasNext()) {
            interfaceC57039yarOLrzqt.KWHzl((OneKeyDevice) it.next());
        }
    }

    public final void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        java.util.ArrayList<BluetoothDeviceModel> arrayListCopydefault = copydefault();
        arrayListCopydefault.remove(bluetoothDeviceModel);
        if (arrayListCopydefault.isEmpty()) {
            SPUtils.remove("connect_succeed_once");
            SPUtils.remove("get_connected_bluetooth_devices");
        } else {
            SPUtils.commit("get_connected_bluetooth_devices", arrayListCopydefault);
        }
        C57032yak c57032yak = C57032yak.AEQbTJ;
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = c57032yak.AEQbTJ();
        if (interfaceC57036yaoAEQbTJ == null || !Intrinsics.EZpvd((java.lang.Object) bluetoothDeviceModel.getAddress(), (java.lang.Object) interfaceC57036yaoAEQbTJ.OLrzqt().getAddress())) {
            return;
        }
        c57032yak.copydefault(interfaceC57036yaoAEQbTJ.OLrzqt());
    }

    public final void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        SPUtils.commit("connect_succeed_once", java.lang.Boolean.TRUE);
        java.util.ArrayList<BluetoothDeviceModel> arrayListCopydefault = copydefault();
        arrayListCopydefault.remove(bluetoothDeviceModel);
        arrayListCopydefault.add(0, bluetoothDeviceModel);
        SPUtils.commit("get_connected_bluetooth_devices", arrayListCopydefault);
        C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
        java.lang.String address = bluetoothDeviceModel.getAddress();
        java.lang.String name = bluetoothDeviceModel.getName();
        if (name == null) {
            return;
        }
        instance$default.AEQbTJ(address, name).bO_();
    }
}
