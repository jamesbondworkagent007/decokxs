package o;

import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.welie.blessed.BondState;
import com.welie.blessed.GattStatus;
import com.welie.blessed.HciStatus;
import com.welie.blessed.ScanFailure;
import com.welie.blessed.WriteType;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yaH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57003yaH {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final android.content.Context AEQbTJ;
    public final C58112yvD AYXKKw;
    public final AbstractC58110yvB AhwBna;
    public final java.util.Set<java.lang.String> EZpvd;
    public Application OLrzqt;
    public final java.util.Set<java.lang.String> copydefault;
    public final PendingIntent djBIcL;
    public final java.util.List<TaskDescription> gEmmrt;
    public final UUID[] isConnected;
    public BluetoothDeviceModel valueOf;
    public final java.util.Map<UUID, TaskDescription> values;

    /* JADX INFO: renamed from: o.yaH$Application */
    public interface Application {
        void AEQbTJ(int i);

        void AEQbTJ(@NotNull C58160yvz c58160yvz);

        void AEQbTJ(@NotNull C58160yvz c58160yvz, @NotNull java.lang.String str);

        void EZpvd();

        void EZpvd(@NotNull C58160yvz c58160yvz);

        void EZpvd(@NotNull C58160yvz c58160yvz, int i);

        void KWHzl(@NotNull C58160yvz c58160yvz);

        void KWHzl(@NotNull C58160yvz c58160yvz, @NotNull byte[] bArr, @NotNull android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic);

        void OLrzqt(@NotNull C58160yvz c58160yvz);

        void copydefault(@NotNull C58160yvz c58160yvz);

        void djBIcL(@NotNull C58160yvz c58160yvz);

        void gEmmrt(@NotNull C58160yvz c58160yvz);

        void valueOf(@NotNull C58160yvz c58160yvz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.OLrzqt = application;
    }

    public C57003yaH(@NotNull android.content.Context context, @NotNull java.util.List<TaskDescription> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = context;
        this.gEmmrt = list;
        this.EZpvd = new LinkedHashSet();
        this.copydefault = new LinkedHashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TaskDescription) it.next()).AEQbTJ());
        }
        this.isConnected = (UUID[]) arrayList.toArray(new UUID[0]);
        java.util.List<TaskDescription> list2 = this.gEmmrt;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
        for (java.lang.Object obj : list2) {
            linkedHashMap.put(((TaskDescription) obj).AEQbTJ(), obj);
        }
        this.values = linkedHashMap;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.AhwBna = stateListAnimator;
        this.djBIcL = new PendingIntent();
        C58112yvD c58112yvD = new C58112yvD(this.AEQbTJ, stateListAnimator, new android.os.Handler(android.os.Looper.getMainLooper()));
        c58112yvD.gEmmrt();
        this.AYXKKw = c58112yvD;
    }

    /* JADX INFO: renamed from: o.yaH$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yaH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String KWHzl(byte[] bArr) {
            java.lang.Byte bAEQbTJ = yDV.AEQbTJ(bArr, 0);
            if (bAEQbTJ == null) {
                return null;
            }
            java.lang.String str = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(bAEQbTJ.byteValue())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }
    }

    /* JADX INFO: renamed from: o.yaH$ActionBar */
    public static final class ActionBar {
        public final UUID KWHzl;
        public final WriteType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, UUID uuid, WriteType writeType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uuid = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                writeType = actionBar.copydefault;
            }
            return actionBar.KWHzl(uuid, writeType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UUID EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WriteType KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull UUID uuid, @NotNull WriteType writeType) {
            Intrinsics.checkNotNullParameter(uuid, "");
            Intrinsics.checkNotNullParameter(writeType, "");
            return new ActionBar(uuid, writeType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && this.copydefault == actionBar.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WriteInfo(characteristicUUID=" + this.KWHzl + ", writeType=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull UUID uuid, @NotNull WriteType writeType) {
            Intrinsics.checkNotNullParameter(uuid, "");
            Intrinsics.checkNotNullParameter(writeType, "");
            this.KWHzl = uuid;
            this.copydefault = writeType;
        }
    }

    /* JADX INFO: renamed from: o.yaH$TaskDescription */
    public static final class TaskDescription {
        public final UUID EZpvd;
        public final UUID KWHzl;
        public final java.util.List<ActionBar> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yaH$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, UUID uuid, UUID uuid2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uuid = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                uuid2 = taskDescription.EZpvd;
            }
            if ((i & 4) != 0) {
                list = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(uuid, uuid2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UUID AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull UUID uuid, @NotNull UUID uuid2, @NotNull java.util.List<ActionBar> list) {
            Intrinsics.checkNotNullParameter(uuid, "");
            Intrinsics.checkNotNullParameter(uuid2, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(uuid, uuid2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ActionBar> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UUID copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ServiceConfig(serviceUUID=" + this.KWHzl + ", notifyCharacteristicUUID=" + this.EZpvd + ", writeInfo=" + this.copydefault + ")";
        }

        public TaskDescription(@NotNull UUID uuid, @NotNull UUID uuid2, @NotNull java.util.List<ActionBar> list) {
            Intrinsics.checkNotNullParameter(uuid, "");
            Intrinsics.checkNotNullParameter(uuid2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = uuid;
            this.EZpvd = uuid2;
            this.copydefault = list;
        }
    }

    /* JADX INFO: renamed from: o.yaH$StateListAnimator */
    public static final class StateListAnimator extends AbstractC58110yvB {
        public StateListAnimator() {
        }

        @Override // o.AbstractC58110yvB
        public void copydefault(C58160yvz c58160yvz) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onConnectedPeripheral: peripheral: " + c58160yvz.AkhnZx());
            C57003yaH.this.EZpvd(c58160yvz);
            C57003yaH.this.KWHzl(c58160yvz, "onConnectedPeripheral");
        }

        @Override // o.AbstractC58110yvB
        public void KWHzl(C58160yvz c58160yvz, HciStatus hciStatus) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            Intrinsics.checkNotNullParameter(hciStatus, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onConnectionFailed: peripheral: " + c58160yvz.AkhnZx() + ", status: " + hciStatus);
            C57003yaH.this.copydefault(c58160yvz);
            Application application = C57003yaH.this.OLrzqt;
            if (application != null) {
                application.AEQbTJ(c58160yvz);
            }
        }

        @Override // o.AbstractC58110yvB
        public void copydefault(C58160yvz c58160yvz, HciStatus hciStatus) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            Intrinsics.checkNotNullParameter(hciStatus, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onDisconnectedPeripheral: peripheral: " + c58160yvz.AkhnZx() + ", status: " + hciStatus);
            C57003yaH.this.copydefault(c58160yvz);
            Application application = C57003yaH.this.OLrzqt;
            if (application != null) {
                application.EZpvd(c58160yvz);
            }
            java.lang.String strAkhnZx = c58160yvz.AkhnZx();
            BluetoothDeviceModel bluetoothDeviceModel = C57003yaH.this.valueOf;
            if (Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) (bluetoothDeviceModel != null ? bluetoothDeviceModel.getAddress() : null))) {
                C57003yaH.this.valueOf = null;
                Application application2 = C57003yaH.this.OLrzqt;
                if (application2 != null) {
                    application2.gEmmrt(c58160yvz);
                    return;
                }
                return;
            }
            if (C57026yae.copydefault.EZpvd(C57003yaH.this.AEQbTJ)) {
                C57003yaH.this.AYXKKw.EZpvd(c58160yvz, C57003yaH.this.djBIcL);
                return;
            }
            Application application3 = C57003yaH.this.OLrzqt;
            if (application3 != null) {
                application3.gEmmrt(c58160yvz);
            }
        }

        @Override // o.AbstractC58110yvB
        public void OLrzqt(C58160yvz c58160yvz, android.bluetooth.le.ScanResult scanResult) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            Intrinsics.checkNotNullParameter(scanResult, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onDiscoveredPeripheral: peripheral: " + c58160yvz.AkhnZx() + ", scanResult: " + scanResult);
            Application application = C57003yaH.this.OLrzqt;
            if (application != null) {
                application.djBIcL(c58160yvz);
            }
        }

        @Override // o.AbstractC58110yvB
        public void EZpvd(ScanFailure scanFailure) {
            Intrinsics.checkNotNullParameter(scanFailure, "");
            super.EZpvd(scanFailure);
            pUU.copydefault("HardwareWalletBluetoothManager", "onScanFailed: scanFailure: " + scanFailure);
            Application application = C57003yaH.this.OLrzqt;
            if (application != null) {
                application.EZpvd();
            }
        }

        @Override // o.AbstractC58110yvB
        public void EZpvd(int i) {
            pUU.KWHzl("HardwareWalletBluetoothManager", "onBluetoothAdapterStateChanged: state: " + i);
            Application application = C57003yaH.this.OLrzqt;
            if (application != null) {
                application.AEQbTJ(i);
            }
        }
    }

    public final void copydefault(C58160yvz c58160yvz) {
        this.EZpvd.remove(c58160yvz.AkhnZx());
        this.copydefault.remove(c58160yvz.AkhnZx());
    }

    /* JADX INFO: renamed from: o.yaH$PendingIntent */
    public static final class PendingIntent extends AbstractC58111yvC {
        public PendingIntent() {
        }

        @Override // o.AbstractC58111yvC
        public void KWHzl(C58160yvz c58160yvz) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onServicesDiscovered: peripheral: " + c58160yvz.AkhnZx());
            C57003yaH.this.EZpvd(c58160yvz);
            C57003yaH.this.KWHzl(c58160yvz, "onServicesDiscovered");
        }

        @Override // o.AbstractC58111yvC
        public void KWHzl(C58160yvz c58160yvz, byte[] bArr, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, GattStatus gattStatus) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "");
            Intrinsics.checkNotNullParameter(gattStatus, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onCharacteristicUpdate: peripheral: " + c58160yvz.AkhnZx() + ", value: (size=" + bArr.length + ", firstByte=" + C57003yaH.Companion.KWHzl(bArr) + "), characteristic: " + bluetoothGattCharacteristic.getUuid() + ", status: " + gattStatus);
            Application application = C57003yaH.this.OLrzqt;
            if (application != null) {
                application.KWHzl(c58160yvz, bArr, bluetoothGattCharacteristic);
            }
        }

        @Override // o.AbstractC58111yvC
        public void AEQbTJ(C58160yvz c58160yvz) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onBondingSucceeded: peripheral: " + c58160yvz.AkhnZx());
            Application application = C57003yaH.this.OLrzqt;
            if (application != null) {
                application.KWHzl(c58160yvz);
            }
        }

        @Override // o.AbstractC58111yvC
        public void OLrzqt(C58160yvz c58160yvz) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onBondingFailed: peripheral: " + c58160yvz.AkhnZx());
            C57003yaH.this.copydefault(c58160yvz);
            Application application = C57003yaH.this.OLrzqt;
            if (application != null) {
                application.OLrzqt(c58160yvz);
            }
        }

        @Override // o.AbstractC58111yvC
        public void copydefault(C58160yvz c58160yvz) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onBondLost: peripheral: " + c58160yvz.AkhnZx());
            C57003yaH.this.copydefault(c58160yvz);
            Application application = C57003yaH.this.OLrzqt;
            if (application != null) {
                application.OLrzqt(c58160yvz);
            }
        }

        @Override // o.AbstractC58111yvC
        public void OLrzqt(C58160yvz c58160yvz, int i, GattStatus gattStatus) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            Intrinsics.checkNotNullParameter(gattStatus, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onMtuChanged: peripheral: " + c58160yvz.AkhnZx() + ", mtu: " + i + ", status: " + gattStatus);
            C57003yaH.this.EZpvd.remove(c58160yvz.AkhnZx());
            Application application = C57003yaH.this.OLrzqt;
            if (application != null) {
                application.EZpvd(c58160yvz, c58160yvz.EZpvd(WriteType.WITHOUT_RESPONSE));
            }
            C57003yaH.this.KWHzl(c58160yvz, "onMtuChanged");
        }

        @Override // o.AbstractC58111yvC
        public void AEQbTJ(C58160yvz c58160yvz, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, GattStatus gattStatus) {
            UUID uuid;
            java.lang.Object next;
            Application application;
            UUID uuidAEQbTJ;
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "");
            Intrinsics.checkNotNullParameter(gattStatus, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onNotificationStateUpdate: peripheral: " + c58160yvz.AkhnZx() + ", characteristic: " + bluetoothGattCharacteristic.getUuid() + ", status: " + gattStatus);
            java.util.Iterator it = C57003yaH.this.gEmmrt.iterator();
            while (true) {
                uuid = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd(bluetoothGattCharacteristic.getUuid(), ((TaskDescription) next).copydefault())) {
                        break;
                    }
                }
            }
            TaskDescription taskDescription = (TaskDescription) next;
            if (taskDescription != null) {
                C57003yaH.this.copydefault.remove(c58160yvz.AkhnZx());
            }
            C57003yaH.this.EZpvd(c58160yvz);
            if (C57003yaH.this.KWHzl(c58160yvz, "onNotificationStateUpdate")) {
                if (taskDescription == null || (uuidAEQbTJ = taskDescription.AEQbTJ()) == null) {
                    UUID[] uuidArr = C57003yaH.this.isConnected;
                    int length = uuidArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        UUID uuid2 = uuidArr[i];
                        if (c58160yvz.OLrzqt(uuid2, bluetoothGattCharacteristic.getUuid()) != null) {
                            uuid = uuid2;
                            break;
                        }
                        i++;
                    }
                } else {
                    uuid = uuidAEQbTJ;
                }
                if (uuid == null || (application = C57003yaH.this.OLrzqt) == null) {
                    return;
                }
                java.lang.String string = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                application.AEQbTJ(c58160yvz, string);
            }
        }

        @Override // o.AbstractC58111yvC
        public void copydefault(C58160yvz c58160yvz, byte[] bArr, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, GattStatus gattStatus) {
            Intrinsics.checkNotNullParameter(c58160yvz, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "");
            Intrinsics.checkNotNullParameter(gattStatus, "");
            pUU.KWHzl("HardwareWalletBluetoothManager", "onCharacteristicWrite: peripheral: " + c58160yvz.AkhnZx() + ", value: (size=" + bArr.length + ", firstByte=" + C57003yaH.Companion.KWHzl(bArr) + "), characteristic: " + bluetoothGattCharacteristic.getUuid() + ", status: " + gattStatus);
        }
    }

    public final boolean KWHzl(C58160yvz c58160yvz, java.lang.String str) {
        TaskDescription taskDescription;
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristicOLrzqt;
        UUID[] uuidArr = this.isConnected;
        int length = uuidArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                taskDescription = null;
                bluetoothGattCharacteristicOLrzqt = null;
                break;
            }
            UUID uuid = uuidArr[i];
            taskDescription = this.values.get(uuid);
            if (taskDescription != null && (bluetoothGattCharacteristicOLrzqt = c58160yvz.OLrzqt(uuid, taskDescription.copydefault())) != null) {
                break;
            }
            i++;
        }
        if (bluetoothGattCharacteristicOLrzqt == null || taskDescription == null) {
            pUU.KWHzl("HardwareWalletBluetoothManager", str + ": notifyCharacteristic not found for any service UUID");
            c58160yvz.gEmmrt();
            return false;
        }
        if (!taskDescription.OLrzqt().isEmpty()) {
            java.util.List<ActionBar> listOLrzqt = taskDescription.OLrzqt();
            if (!(listOLrzqt instanceof java.util.Collection) || !listOLrzqt.isEmpty()) {
                for (ActionBar actionBar : listOLrzqt) {
                    if (EZpvd(c58160yvz, taskDescription.AEQbTJ(), actionBar.EZpvd(), str, actionBar.KWHzl())) {
                        boolean zCopydefault = c58160yvz.copydefault(bluetoothGattCharacteristicOLrzqt);
                        pUU.KWHzl("HardwareWalletBluetoothManager", str + ": notifyCharacteristic: " + bluetoothGattCharacteristicOLrzqt.getUuid() + ", isNotifying=" + zCopydefault);
                        if (!zCopydefault) {
                            KWHzl(c58160yvz, bluetoothGattCharacteristicOLrzqt);
                        }
                        return zCopydefault;
                    }
                }
            }
        }
        pUU.valueOf("HardwareWalletBluetoothManager", str + ": unable to write to device: " + c58160yvz.AkhnZx());
        return false;
    }

    public final boolean EZpvd(C58160yvz c58160yvz, UUID uuid, UUID uuid2, java.lang.String str, WriteType writeType) {
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristicOLrzqt = c58160yvz.OLrzqt(uuid, uuid2);
        if (bluetoothGattCharacteristicOLrzqt == null) {
            pUU.valueOf("HardwareWalletBluetoothManager", str + ": writeCharacteristic " + uuid2 + " is null for service " + uuid);
            c58160yvz.gEmmrt();
            return false;
        }
        if ((bluetoothGattCharacteristicOLrzqt.getProperties() & writeType.property) != 0) {
            return true;
        }
        pUU.valueOf("HardwareWalletBluetoothManager", str + ": writeCharacteristic " + uuid2 + " does not have property " + writeType);
        c58160yvz.gEmmrt();
        return false;
    }

    public final void KWHzl(C58160yvz c58160yvz, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (!this.copydefault.contains(c58160yvz.AkhnZx())) {
            this.copydefault.add(c58160yvz.AkhnZx());
            c58160yvz.OLrzqt(bluetoothGattCharacteristic, true);
            return;
        }
        pUU.KWHzl("HardwareWalletBluetoothManager", "setNotify: already setting for peripheral: " + c58160yvz.AkhnZx() + ", characteristic: " + bluetoothGattCharacteristic.getUuid());
    }

    public final void EZpvd(C58160yvz c58160yvz) {
        if (!this.EZpvd.contains(c58160yvz.AkhnZx())) {
            if (c58160yvz.fetchVPNInfo() == 23) {
                this.EZpvd.add(c58160yvz.AkhnZx());
                Application application = this.OLrzqt;
                if (application != null) {
                    application.valueOf(c58160yvz);
                    return;
                }
                return;
            }
            return;
        }
        pUU.KWHzl("HardwareWalletBluetoothManager", "requestMtu: already requested for peripheral: " + c58160yvz.AkhnZx());
    }

    public final void copydefault() {
        this.AYXKKw.KWHzl(this.isConnected);
    }

    public final void AEQbTJ() {
        this.AYXKKw.fIwbmz();
    }

    public final boolean OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (C57026yae.copydefault.EZpvd(context)) {
            C58160yvz c58160yvzAEQbTJ = this.AYXKKw.AEQbTJ(str);
            Intrinsics.checkNotNullExpressionValue(c58160yvzAEQbTJ, "");
            if (c58160yvzAEQbTJ.values() != BondState.BONDED) {
                return true;
            }
        }
        return false;
    }

    public final void copydefault(@NotNull BluetoothDeviceModel bluetoothDeviceModel, java.lang.String str) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        AEQbTJ();
        if (str == null) {
            C58160yvz c58160yvzAEQbTJ = this.AYXKKw.AEQbTJ(bluetoothDeviceModel.getAddress());
            Intrinsics.checkNotNullExpressionValue(c58160yvzAEQbTJ, "");
            this.AYXKKw.EZpvd(c58160yvzAEQbTJ, this.djBIcL);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) bluetoothDeviceModel.getAddress())) {
            Application application = this.OLrzqt;
            if (application != null) {
                C58160yvz c58160yvzAEQbTJ2 = this.AYXKKw.AEQbTJ(bluetoothDeviceModel.getAddress());
                Intrinsics.checkNotNullExpressionValue(c58160yvzAEQbTJ2, "");
                application.copydefault(c58160yvzAEQbTJ2);
                return;
            }
            return;
        }
        this.valueOf = bluetoothDeviceModel;
        C58160yvz c58160yvzAEQbTJ3 = this.AYXKKw.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c58160yvzAEQbTJ3, "");
        this.AYXKKw.copydefault(c58160yvzAEQbTJ3);
        C58160yvz c58160yvzAEQbTJ4 = this.AYXKKw.AEQbTJ(bluetoothDeviceModel.getAddress());
        Intrinsics.checkNotNullExpressionValue(c58160yvzAEQbTJ4, "");
        this.AYXKKw.EZpvd(c58160yvzAEQbTJ4, this.djBIcL);
    }

    public final void KWHzl(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        AEQbTJ();
        java.util.List<C58160yvz> listValueOf = this.AYXKKw.valueOf();
        Intrinsics.checkNotNullExpressionValue(listValueOf, "");
        if (!(listValueOf instanceof java.util.Collection) || !listValueOf.isEmpty()) {
            java.util.Iterator<T> it = listValueOf.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((C58160yvz) it.next()).AkhnZx(), (java.lang.Object) bluetoothDeviceModel.getAddress())) {
                    Application application = this.OLrzqt;
                    if (application != null) {
                        C58160yvz c58160yvzAEQbTJ = this.AYXKKw.AEQbTJ(bluetoothDeviceModel.getAddress());
                        Intrinsics.checkNotNullExpressionValue(c58160yvzAEQbTJ, "");
                        application.copydefault(c58160yvzAEQbTJ);
                        return;
                    }
                    return;
                }
            }
        }
        this.valueOf = bluetoothDeviceModel;
        C58160yvz c58160yvzAEQbTJ2 = this.AYXKKw.AEQbTJ(bluetoothDeviceModel.getAddress());
        Intrinsics.checkNotNullExpressionValue(c58160yvzAEQbTJ2, "");
        this.AYXKKw.EZpvd(c58160yvzAEQbTJ2, this.djBIcL);
    }

    public final void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        this.valueOf = bluetoothDeviceModel;
        C58160yvz c58160yvzAEQbTJ = this.AYXKKw.AEQbTJ(bluetoothDeviceModel.getAddress());
        Intrinsics.checkNotNullExpressionValue(c58160yvzAEQbTJ, "");
        this.AYXKKw.copydefault(c58160yvzAEQbTJ);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C58160yvz c58160yvzAEQbTJ = this.AYXKKw.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c58160yvzAEQbTJ, "");
        this.AYXKKw.KWHzl(c58160yvzAEQbTJ, this.djBIcL);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        C58160yvz c58160yvzAEQbTJ = this.AYXKKw.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c58160yvzAEQbTJ, "");
        for (UUID uuid : this.isConnected) {
            TaskDescription taskDescription = this.values.get(uuid);
            if (taskDescription != null) {
                for (ActionBar actionBar : taskDescription.OLrzqt()) {
                    UUID uuidEZpvd = actionBar.EZpvd();
                    WriteType writeTypeKWHzl = actionBar.KWHzl();
                    android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristicOLrzqt = c58160yvzAEQbTJ.OLrzqt(uuid, uuidEZpvd);
                    if (bluetoothGattCharacteristicOLrzqt != null) {
                        c58160yvzAEQbTJ.EZpvd(bluetoothGattCharacteristicOLrzqt, bArr, writeTypeKWHzl);
                        return;
                    }
                }
            }
        }
        pUU.valueOf("HardwareWalletBluetoothManager", "Write characteristics are not available for peripheral " + str);
    }

    public final BluetoothDeviceModel copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C58160yvz c58160yvzAEQbTJ = this.AYXKKw.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c58160yvzAEQbTJ, "");
        java.lang.String strDbNXlk = c58160yvzAEQbTJ.DbNXlk();
        java.lang.String strAkhnZx = c58160yvzAEQbTJ.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(strAkhnZx, "");
        return new BluetoothDeviceModel(strDbNXlk, strAkhnZx, "");
    }
}
