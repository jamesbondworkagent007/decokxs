package o;

import android.os.Build;
import com.welie.blessed.BondState;
import com.welie.blessed.ConnectionState;
import com.welie.blessed.GattStatus;
import com.welie.blessed.HciStatus;
import com.welie.blessed.PeripheralType;
import com.welie.blessed.PhyType;
import com.welie.blessed.Transport;
import com.welie.blessed.WriteType;
import java.util.Collections;
import java.util.Objects;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58160yvz {
    public static final UUID AEQbTJ = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final java.lang.String KWHzl = "BluetoothPeripheral";
    public final android.os.Handler AYXKKw;
    public java.lang.Runnable AuCTel;
    public AbstractC58111yvC AuCTelauCTel;
    public volatile android.bluetooth.BluetoothGatt OLrzqt;
    public final StateListAnimator ejfBZ;
    public android.bluetooth.BluetoothDevice fIwbmz;
    public boolean fJNWhG;
    public final android.content.Context fetchVPNInfo;
    public int getFieldNames;
    public long isConnected;
    public java.lang.Runnable wlaJM;
    public final Transport zLjUOn;
    public final Queue<java.lang.Runnable> gEmmrt = new ConcurrentLinkedQueue();
    public java.lang.String valueOf = "";
    public byte[] values = new byte[0];
    public int DbNXlk = 0;
    public final java.util.Set<android.bluetooth.BluetoothGattCharacteristic> hDKMBd = new java.util.HashSet();
    public final android.os.Handler iwGUEr = new android.os.Handler(android.os.Looper.getMainLooper());
    public volatile boolean djBIcL = false;
    public boolean EZpvd = false;
    public boolean getNewProxyInstance = false;
    public volatile boolean zsXlph = false;
    public boolean fARcdN = false;
    public volatile int AubY = 0;
    public int AkhnZx = 23;
    public final android.bluetooth.BluetoothGattCallback copydefault = new android.bluetooth.BluetoothGattCallback() { // from class: o.yvz.2
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 != 1) {
                C58160yvz.this.AEQbTJ();
            }
            int i3 = C58160yvz.this.AubY;
            C58160yvz.this.AubY = i2;
            HciStatus hciStatusFromValue = HciStatus.fromValue(i);
            if (hciStatusFromValue != HciStatus.SUCCESS) {
                C58160yvz.this.KWHzl(hciStatusFromValue, i3, i2);
                return;
            }
            if (i2 == 0) {
                C58160yvz.this.AEQbTJ(i3);
                return;
            }
            if (i2 == 1) {
                C58109yvA.copydefault(C58160yvz.KWHzl, "peripheral '%s' is connecting", C58160yvz.this.AkhnZx());
                C58160yvz.this.ejfBZ.EZpvd(C58160yvz.this);
            } else if (i2 == 2) {
                C58160yvz.this.zsXlph();
            } else if (i2 == 3) {
                C58109yvA.copydefault(C58160yvz.KWHzl, "peripheral '%s' is disconnecting", C58160yvz.this.AkhnZx());
                C58160yvz.this.ejfBZ.AEQbTJ(C58160yvz.this);
            } else {
                C58109yvA.AEQbTJ(C58160yvz.KWHzl, "unknown state received");
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, int i) {
            GattStatus gattStatusFromValue = GattStatus.fromValue(i);
            if (gattStatusFromValue != GattStatus.SUCCESS) {
                C58109yvA.OLrzqt(C58160yvz.KWHzl, "service discovery failed due to internal error '%s', disconnecting", gattStatusFromValue);
                C58160yvz.this.AhwBna();
                return;
            }
            C58109yvA.copydefault(C58160yvz.KWHzl, "onServicesDiscovered: resetting discoveryStarted for '%s'", C58160yvz.this.DbNXlk());
            C58160yvz.this.fARcdN = false;
            java.util.List<android.bluetooth.BluetoothGattService> services = bluetoothGatt.getServices();
            java.lang.String str = C58160yvz.KWHzl;
            int size = services.size();
            C58109yvA.copydefault(str, "discovered %d services for '%s'", java.lang.Integer.valueOf(size), C58160yvz.this.DbNXlk());
            C58160yvz.this.ejfBZ.copydefault(C58160yvz.this);
            C58160yvz.this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.2.3
                @Override // java.lang.Runnable
                public void run() {
                    C58160yvz c58160yvz = C58160yvz.this;
                    c58160yvz.AuCTelauCTel.KWHzl(c58160yvz);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, @NotNull final android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            final GattStatus gattStatusFromValue = GattStatus.fromValue(i);
            final android.bluetooth.BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
            GattStatus gattStatus = GattStatus.SUCCESS;
            if (gattStatusFromValue != gattStatus) {
                C58109yvA.OLrzqt(C58160yvz.KWHzl, "failed to write <%s> to descriptor of characteristic <%s> for device: '%s', status '%s' ", C58157yvw.AEQbTJ(C58160yvz.this.values), characteristic.getUuid(), C58160yvz.this.AkhnZx(), gattStatusFromValue);
                if (AEQbTJ(gattStatusFromValue)) {
                    return;
                }
            }
            final byte[] bArr = C58160yvz.this.values;
            C58160yvz.this.values = new byte[0];
            if (bluetoothGattDescriptor.getUuid().equals(C58160yvz.AEQbTJ)) {
                if (gattStatusFromValue == gattStatus) {
                    if (java.util.Arrays.equals(bArr, android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) || java.util.Arrays.equals(bArr, android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE)) {
                        C58160yvz.this.hDKMBd.add(characteristic);
                    } else if (java.util.Arrays.equals(bArr, android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
                        C58160yvz.this.hDKMBd.remove(characteristic);
                    }
                }
                C58160yvz.this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.2.4
                    @Override // java.lang.Runnable
                    public void run() {
                        C58160yvz c58160yvz = C58160yvz.this;
                        c58160yvz.AuCTelauCTel.AEQbTJ(c58160yvz, characteristic, gattStatusFromValue);
                    }
                });
            } else {
                C58160yvz.this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C58160yvz c58160yvz = C58160yvz.this;
                        c58160yvz.AuCTelauCTel.copydefault(c58160yvz, bArr, bluetoothGattDescriptor, gattStatusFromValue);
                    }
                });
            }
            C58160yvz.this.AYXKKw();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, @NotNull final android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i, byte[] bArr) {
            final GattStatus gattStatusFromValue = GattStatus.fromValue(i);
            if (gattStatusFromValue != GattStatus.SUCCESS) {
                C58109yvA.OLrzqt(C58160yvz.KWHzl, "reading descriptor <%s> failed for device '%s, status '%s'", bluetoothGattDescriptor.getUuid(), C58160yvz.this.AkhnZx(), gattStatusFromValue);
                if (AEQbTJ(gattStatusFromValue)) {
                    return;
                }
            }
            final byte[] bArrAEQbTJ = C58160yvz.this.AEQbTJ(bArr);
            C58160yvz.this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.2.6
                @Override // java.lang.Runnable
                public void run() {
                    C58160yvz c58160yvz = C58160yvz.this;
                    c58160yvz.AuCTelauCTel.EZpvd(c58160yvz, bArrAEQbTJ, bluetoothGattDescriptor, gattStatusFromValue);
                }
            });
            C58160yvz.this.AYXKKw();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, @NotNull android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i, bluetoothGattDescriptor.getValue());
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, @NotNull final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            final byte[] bArrAEQbTJ = C58160yvz.this.AEQbTJ(bArr);
            C58160yvz.this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.2.10
                @Override // java.lang.Runnable
                public void run() {
                    C58160yvz c58160yvz = C58160yvz.this;
                    c58160yvz.AuCTelauCTel.KWHzl(c58160yvz, bArrAEQbTJ, bluetoothGattCharacteristic, GattStatus.SUCCESS);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, @NotNull android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, @NotNull final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
            final GattStatus gattStatusFromValue = GattStatus.fromValue(i);
            if (gattStatusFromValue != GattStatus.SUCCESS) {
                C58109yvA.OLrzqt(C58160yvz.KWHzl, "read failed for characteristic <%s>, status '%s'", bluetoothGattCharacteristic.getUuid(), gattStatusFromValue);
                if (AEQbTJ(gattStatusFromValue)) {
                    return;
                }
            }
            final byte[] bArrAEQbTJ = C58160yvz.this.AEQbTJ(bArr);
            C58160yvz.this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.2.9
                @Override // java.lang.Runnable
                public void run() {
                    C58160yvz c58160yvz = C58160yvz.this;
                    c58160yvz.AuCTelauCTel.KWHzl(c58160yvz, bArrAEQbTJ, bluetoothGattCharacteristic, gattStatusFromValue);
                }
            });
            C58160yvz.this.AYXKKw();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, @NotNull android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, @NotNull final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            final GattStatus gattStatusFromValue = GattStatus.fromValue(i);
            if (gattStatusFromValue != GattStatus.SUCCESS) {
                C58109yvA.OLrzqt(C58160yvz.KWHzl, "writing <%s> to characteristic <%s> failed, status '%s'", C58157yvw.AEQbTJ(C58160yvz.this.values), bluetoothGattCharacteristic.getUuid(), gattStatusFromValue);
                if (AEQbTJ(gattStatusFromValue)) {
                    return;
                }
            }
            final byte[] bArr = C58160yvz.this.values;
            C58160yvz.this.values = new byte[0];
            C58160yvz.this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.2.8
                @Override // java.lang.Runnable
                public void run() {
                    C58160yvz c58160yvz = C58160yvz.this;
                    c58160yvz.AuCTelauCTel.copydefault(c58160yvz, bArr, bluetoothGattCharacteristic, gattStatusFromValue);
                }
            });
            C58160yvz.this.AYXKKw();
        }

        public final boolean AEQbTJ(@NotNull GattStatus gattStatus) {
            if ((gattStatus != GattStatus.AUTHORIZATION_FAILED && gattStatus != GattStatus.INSUFFICIENT_AUTHENTICATION && gattStatus != GattStatus.INSUFFICIENT_ENCRYPTION) || Build.VERSION.SDK_INT >= 26) {
                return false;
            }
            C58109yvA.OLrzqt(C58160yvz.KWHzl, "operation will be retried after bonding, bonding should be in progress");
            return true;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, final int i, int i2) {
            final GattStatus gattStatusFromValue = GattStatus.fromValue(i2);
            if (gattStatusFromValue != GattStatus.SUCCESS) {
                C58109yvA.OLrzqt(C58160yvz.KWHzl, "reading RSSI failed, status '%s'", gattStatusFromValue);
            }
            C58160yvz.this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.2.7
                @Override // java.lang.Runnable
                public void run() {
                    C58160yvz c58160yvz = C58160yvz.this;
                    c58160yvz.AuCTelauCTel.KWHzl(c58160yvz, i, gattStatusFromValue);
                }
            });
            C58160yvz.this.AYXKKw();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, final int i, int i2) {
            final GattStatus gattStatusFromValue = GattStatus.fromValue(i2);
            if (gattStatusFromValue != GattStatus.SUCCESS) {
                C58109yvA.OLrzqt(C58160yvz.KWHzl, "change MTU failed, status '%s'", gattStatusFromValue);
            }
            C58160yvz.this.AkhnZx = i;
            C58160yvz.this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.2.14
                @Override // java.lang.Runnable
                public void run() {
                    C58160yvz c58160yvz = C58160yvz.this;
                    c58160yvz.AuCTelauCTel.OLrzqt(c58160yvz, i, gattStatusFromValue);
                }
            });
            if (C58160yvz.this.DbNXlk == 1) {
                C58160yvz.this.DbNXlk = 0;
                C58160yvz.this.AYXKKw();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyRead(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, final int i, final int i2, int i3) {
            final GattStatus gattStatusFromValue = GattStatus.fromValue(i3);
            if (gattStatusFromValue != GattStatus.SUCCESS) {
                C58109yvA.OLrzqt(C58160yvz.KWHzl, "read Phy failed, status '%s'", gattStatusFromValue);
            } else {
                C58109yvA.copydefault(C58160yvz.KWHzl, "updated Phy: tx = %s, rx = %s", PhyType.fromValue(i), PhyType.fromValue(i2));
            }
            C58160yvz.this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.2.5
                @Override // java.lang.Runnable
                public void run() {
                    C58160yvz c58160yvz = C58160yvz.this;
                    c58160yvz.AuCTelauCTel.copydefault(c58160yvz, PhyType.fromValue(i), PhyType.fromValue(i2), gattStatusFromValue);
                }
            });
            C58160yvz.this.AYXKKw();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(@NotNull android.bluetooth.BluetoothGatt bluetoothGatt, final int i, final int i2, int i3) {
            final GattStatus gattStatusFromValue = GattStatus.fromValue(i3);
            if (gattStatusFromValue != GattStatus.SUCCESS) {
                C58109yvA.OLrzqt(C58160yvz.KWHzl, "update Phy failed, status '%s'", gattStatusFromValue);
            } else {
                C58109yvA.copydefault(C58160yvz.KWHzl, "updated Phy: tx = %s, rx = %s", PhyType.fromValue(i), PhyType.fromValue(i2));
            }
            C58160yvz.this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.2.2
                @Override // java.lang.Runnable
                public void run() {
                    C58160yvz c58160yvz = C58160yvz.this;
                    c58160yvz.AuCTelauCTel.copydefault(c58160yvz, PhyType.fromValue(i), PhyType.fromValue(i2), gattStatusFromValue);
                }
            });
            if (C58160yvz.this.DbNXlk == 2) {
                C58160yvz.this.DbNXlk = 0;
                C58160yvz.this.AYXKKw();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServiceChanged(android.bluetooth.BluetoothGatt bluetoothGatt) {
            C58109yvA.KWHzl(C58160yvz.KWHzl, "onServiceChangedCalled");
            C58160yvz.this.gEmmrt.clear();
            C58160yvz.this.djBIcL = false;
            C58160yvz.this.copydefault(100L);
        }
    };
    public final android.content.BroadcastReceiver AhwBna = new android.content.BroadcastReceiver() { // from class: o.yvz.19
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            android.bluetooth.BluetoothDevice bluetoothDevice;
            java.lang.String action = intent.getAction();
            if (action != null && (bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null && bluetoothDevice.getAddress().equalsIgnoreCase(C58160yvz.this.AkhnZx()) && action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                C58160yvz.this.KWHzl(intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE), intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", Integer.MIN_VALUE));
            }
        }
    };
    public final android.content.BroadcastReceiver uzCIH = new android.content.BroadcastReceiver() { // from class: o.yvz.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            java.lang.String strKWHzl;
            android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null && bluetoothDevice.getAddress().equalsIgnoreCase(C58160yvz.this.AkhnZx())) {
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
                C58109yvA.KWHzl(C58160yvz.KWHzl, "pairing request received: " + C58160yvz.this.KWHzl(intExtra) + " (" + intExtra + ")");
                if (intExtra != 0 || (strKWHzl = C58160yvz.this.ejfBZ.KWHzl(C58160yvz.this)) == null) {
                    return;
                }
                C58109yvA.AEQbTJ(C58160yvz.KWHzl, "setting PIN code for this peripheral using '%s'", strKWHzl);
                bluetoothDevice.setPin(strKWHzl.getBytes());
                abortBroadcast();
            }
        }
    };

    /* JADX INFO: renamed from: o.yvz$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(@NotNull C58160yvz c58160yvz);

        void AEQbTJ(@NotNull C58160yvz c58160yvz, @NotNull HciStatus hciStatus);

        void EZpvd(@NotNull C58160yvz c58160yvz);

        java.lang.String KWHzl(@NotNull C58160yvz c58160yvz);

        void copydefault(@NotNull C58160yvz c58160yvz);

        void copydefault(@NotNull C58160yvz c58160yvz, @NotNull HciStatus hciStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] AEQbTJ(byte[] bArr) {
        return bArr == null ? new byte[0] : bArr;
    }

    public final void EZpvd(@NotNull android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl(int i) {
        switch (i) {
            case 0:
                return "PAIRING_VARIANT_PIN";
            case 1:
                return "PAIRING_VARIANT_PASSKEY";
            case 2:
                return "PAIRING_VARIANT_PASSKEY_CONFIRMATION";
            case 3:
                return "PAIRING_VARIANT_CONSENT";
            case 4:
                return "PAIRING_VARIANT_DISPLAY_PASSKEY";
            case 5:
                return "PAIRING_VARIANT_DISPLAY_PIN";
            case 6:
                return "PAIRING_VARIANT_OOB_CONSENT";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.OLrzqt != null && this.AubY == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int fetchVPNInfo() {
        return this.AkhnZx;
    }

    public final void zsXlph() {
        BondState bondStateValues = values();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j = this.isConnected;
        java.lang.String str = KWHzl;
        C58109yvA.copydefault(str, "connected to '%s' (%s) in %.1fs", DbNXlk(), bondStateValues, java.lang.Float.valueOf((jElapsedRealtime - j) / 1000.0f));
        if (bondStateValues == BondState.NONE || bondStateValues == BondState.BONDED) {
            copydefault(KWHzl(bondStateValues));
        } else if (bondStateValues == BondState.BONDING) {
            C58109yvA.OLrzqt(str, "waiting for bonding to complete");
        }
    }

    public final void copydefault(final long j) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.yvz.10
            @Override // java.lang.Runnable
            public void run() {
                C58109yvA.AEQbTJ(C58160yvz.KWHzl, "discovering services of '%s' with delay of %d ms", C58160yvz.this.DbNXlk(), java.lang.Long.valueOf(j));
                if (C58160yvz.this.OLrzqt != null && C58160yvz.this.OLrzqt.discoverServices()) {
                    C58160yvz.this.fARcdN = true;
                } else {
                    C58109yvA.AEQbTJ(C58160yvz.KWHzl, "discoverServices failed to start");
                }
                C58160yvz.this.AuCTel = null;
            }
        };
        this.AuCTel = runnable;
        this.iwGUEr.postDelayed(runnable, j);
    }

    public final long KWHzl(@NotNull BondState bondState) {
        BondState bondState2 = BondState.BONDED;
        return 0L;
    }

    public final void AEQbTJ(int i) {
        if (i == 2 || i == 3) {
            C58109yvA.copydefault(KWHzl, "disconnected '%s' on request", DbNXlk());
        } else if (i == 1) {
            C58109yvA.OLrzqt(KWHzl, "cancelling connect attempt");
        }
        if (this.EZpvd) {
            C58109yvA.KWHzl(KWHzl, "disconnected because of bond lost");
            this.AYXKKw.postDelayed(new java.lang.Runnable() { // from class: o.yvz.14
                @Override // java.lang.Runnable
                public void run() {
                    if (C58160yvz.this.fJNWhG().isEmpty()) {
                        C58160yvz c58160yvz = C58160yvz.this;
                        HciStatus hciStatus = HciStatus.AUTHENTICATION_FAILURE;
                        c58160yvz.EZpvd(false, hciStatus);
                        C58160yvz.this.ejfBZ.AEQbTJ(C58160yvz.this, hciStatus);
                        return;
                    }
                    C58160yvz.this.EZpvd(true, HciStatus.AUTHENTICATION_FAILURE);
                }
            }, 1000L);
        } else {
            EZpvd(true, HciStatus.SUCCESS);
        }
    }

    public final void KWHzl(@NotNull HciStatus hciStatus, int i, int i2) {
        KWHzl();
        boolean zIsEmpty = fJNWhG().isEmpty();
        if (i == 1) {
            boolean z = android.os.SystemClock.elapsedRealtime() - this.isConnected > ((long) fIwbmz());
            if (hciStatus == HciStatus.ERROR && z) {
                hciStatus = HciStatus.CONNECTION_FAILED_ESTABLISHMENT;
            }
            C58109yvA.copydefault(KWHzl, "connection failed with status '%s'", hciStatus);
            EZpvd(false, hciStatus);
            this.ejfBZ.AEQbTJ(this, hciStatus);
            return;
        }
        if (i == 2 && i2 == 0 && !(!zIsEmpty)) {
            C58109yvA.copydefault(KWHzl, "peripheral '%s' disconnected with status '%s' (%d) before completing service discovery", DbNXlk(), hciStatus, java.lang.Integer.valueOf(hciStatus.value));
            EZpvd(false, hciStatus);
            this.ejfBZ.AEQbTJ(this, hciStatus);
        } else {
            if (i2 == 0) {
                C58109yvA.copydefault(KWHzl, "peripheral '%s' disconnected with status '%s' (%d)", DbNXlk(), hciStatus, java.lang.Integer.valueOf(hciStatus.value));
            } else {
                C58109yvA.copydefault(KWHzl, "unexpected connection state change for '%s' status '%s' (%d)", DbNXlk(), hciStatus, java.lang.Integer.valueOf(hciStatus.value));
            }
            EZpvd(true, hciStatus);
        }
    }

    public final void KWHzl() {
        java.lang.Runnable runnable = this.AuCTel;
        if (runnable != null) {
            this.iwGUEr.removeCallbacks(runnable);
            this.AuCTel = null;
        }
    }

    public final void KWHzl(int i, int i2) {
        switch (i) {
            case 10:
                if (i2 == 11) {
                    C58109yvA.OLrzqt(KWHzl, "bonding failed for '%s', disconnecting device", DbNXlk());
                    this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.16
                        @Override // java.lang.Runnable
                        public void run() {
                            C58160yvz c58160yvz = C58160yvz.this;
                            c58160yvz.AuCTelauCTel.OLrzqt(c58160yvz);
                        }
                    });
                } else {
                    C58109yvA.OLrzqt(KWHzl, "bond lost for '%s'", DbNXlk());
                    this.EZpvd = true;
                    KWHzl();
                    this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.25
                        @Override // java.lang.Runnable
                        public void run() {
                            C58160yvz c58160yvz = C58160yvz.this;
                            c58160yvz.AuCTelauCTel.copydefault(c58160yvz);
                        }
                    });
                }
                this.iwGUEr.postDelayed(new java.lang.Runnable() { // from class: o.yvz.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C58160yvz.this.fARcdN() == ConnectionState.CONNECTED) {
                            C58160yvz.this.AhwBna();
                        }
                    }
                }, 100L);
                break;
            case 11:
                C58109yvA.AEQbTJ(KWHzl, "starting bonding with '%s' (%s)", DbNXlk(), AkhnZx());
                this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.18
                    @Override // java.lang.Runnable
                    public void run() {
                        C58160yvz c58160yvz = C58160yvz.this;
                        c58160yvz.AuCTelauCTel.EZpvd(c58160yvz);
                    }
                });
                break;
            case 12:
                java.lang.String str = KWHzl;
                C58109yvA.AEQbTJ(str, "bonded with '%s' (%s)", DbNXlk(), AkhnZx());
                this.AYXKKw.post(new java.lang.Runnable() { // from class: o.yvz.20
                    @Override // java.lang.Runnable
                    public void run() {
                        C58160yvz c58160yvz = C58160yvz.this;
                        c58160yvz.AuCTelauCTel.AEQbTJ(c58160yvz);
                    }
                });
                if (this.OLrzqt == null) {
                    valueOf();
                } else {
                    if (fJNWhG().isEmpty()) {
                        C58109yvA.copydefault(str, "bonded but no services discovered yet, discoveryStarted=%s", java.lang.Boolean.valueOf(this.fARcdN));
                        if (!this.fARcdN) {
                            copydefault(0L);
                        }
                    }
                    if (Build.VERSION.SDK_INT < 26 && this.djBIcL && !this.getNewProxyInstance) {
                        this.iwGUEr.postDelayed(new java.lang.Runnable() { // from class: o.yvz.17
                            @Override // java.lang.Runnable
                            public void run() {
                                C58109yvA.KWHzl(C58160yvz.KWHzl, "retrying command after bonding");
                                C58160yvz.this.uzCIH();
                            }
                        }, 50L);
                    }
                    if (this.getNewProxyInstance) {
                        this.getNewProxyInstance = false;
                        AYXKKw();
                    }
                    if (this.zsXlph) {
                        this.zsXlph = false;
                        getNewProxyInstance();
                    }
                }
                break;
        }
    }

    public C58160yvz(@NotNull android.content.Context context, @NotNull android.bluetooth.BluetoothDevice bluetoothDevice, @NotNull StateListAnimator stateListAnimator, @NotNull AbstractC58111yvC abstractC58111yvC, @NotNull android.os.Handler handler, @NotNull Transport transport) {
        Objects.requireNonNull(context, "no valid context provided");
        this.fetchVPNInfo = context;
        Objects.requireNonNull(bluetoothDevice, "no valid device provided");
        this.fIwbmz = bluetoothDevice;
        Objects.requireNonNull(stateListAnimator, "no valid listener provided");
        this.ejfBZ = stateListAnimator;
        Objects.requireNonNull(abstractC58111yvC, "no valid peripheral callback provided");
        this.AuCTelauCTel = abstractC58111yvC;
        Objects.requireNonNull(handler, "no valid callback handler provided");
        this.AYXKKw = handler;
        Objects.requireNonNull(transport, "no valid transport provided");
        this.zLjUOn = transport;
    }

    public void OLrzqt(@NotNull AbstractC58111yvC abstractC58111yvC) {
        Objects.requireNonNull(abstractC58111yvC, "no valid peripheral callback provided");
        this.AuCTelauCTel = abstractC58111yvC;
    }

    public void EZpvd(@NotNull android.bluetooth.BluetoothDevice bluetoothDevice) {
        Objects.requireNonNull(bluetoothDevice, "no valid device provided");
        this.fIwbmz = bluetoothDevice;
    }

    public void valueOf() {
        if (this.AubY == 0) {
            this.iwGUEr.postDelayed(new java.lang.Runnable() { // from class: o.yvz.1
                @Override // java.lang.Runnable
                public void run() {
                    C58109yvA.copydefault(C58160yvz.KWHzl, "connect to '%s' (%s) using transport %s", C58160yvz.this.DbNXlk(), C58160yvz.this.AkhnZx(), C58160yvz.this.zLjUOn.name());
                    C58160yvz.this.iwGUEr();
                    C58160yvz.this.fARcdN = false;
                    C58160yvz.this.isConnected = android.os.SystemClock.elapsedRealtime();
                    C58160yvz c58160yvz = C58160yvz.this;
                    c58160yvz.OLrzqt = c58160yvz.EZpvd(c58160yvz.fIwbmz, false, C58160yvz.this.copydefault);
                    if (C58160yvz.this.OLrzqt != null) {
                        C58160yvz.this.copydefault.onConnectionStateChange(C58160yvz.this.OLrzqt, HciStatus.SUCCESS.value, 1);
                        C58160yvz c58160yvz2 = C58160yvz.this;
                        c58160yvz2.hDKMBd(c58160yvz2);
                        return;
                    }
                    C58109yvA.OLrzqt(C58160yvz.KWHzl, "failed to connect to peripheral '%s'", C58160yvz.this.AkhnZx());
                }
            }, 100L);
        } else {
            C58109yvA.OLrzqt(KWHzl, "peripheral '%s' not yet disconnected, will not connect", DbNXlk());
        }
    }

    public final void iwGUEr() {
        this.fetchVPNInfo.registerReceiver(this.AhwBna, new android.content.IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
        this.fetchVPNInfo.registerReceiver(this.uzCIH, new android.content.IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"));
    }

    public boolean djBIcL() {
        if (this.OLrzqt == null) {
            C58109yvA.AEQbTJ(KWHzl, "connecting and creating bond with '%s'", DbNXlk());
            iwGUEr();
            return this.fIwbmz.createBond();
        }
        return copydefault(new java.lang.Runnable() { // from class: o.yvz.3
            @Override // java.lang.Runnable
            public void run() {
                C58160yvz.this.getNewProxyInstance = true;
                if (!C58160yvz.this.fIwbmz.createBond()) {
                    C58109yvA.OLrzqt(C58160yvz.KWHzl, "bonding failed for %s", C58160yvz.this.AkhnZx());
                    C58160yvz.this.AYXKKw();
                } else {
                    C58109yvA.AEQbTJ(C58160yvz.KWHzl, "manually bonding %s", C58160yvz.this.AkhnZx());
                    C58160yvz.this.getFieldNames++;
                }
            }
        });
    }

    public void OLrzqt() {
        if (this.OLrzqt == null) {
            C58109yvA.copydefault(KWHzl, "cannot cancel connection because no connection attempt is made yet");
            return;
        }
        if (this.AubY == 0 || this.AubY == 3) {
            return;
        }
        AEQbTJ();
        if (this.AubY == 1) {
            AhwBna();
            this.iwGUEr.postDelayed(new java.lang.Runnable() { // from class: o.yvz.6
                @Override // java.lang.Runnable
                public void run() {
                    if (C58160yvz.this.OLrzqt != null) {
                        C58160yvz.this.copydefault.onConnectionStateChange(C58160yvz.this.OLrzqt, HciStatus.SUCCESS.value, 0);
                    }
                }
            }, 50L);
        } else {
            AhwBna();
        }
    }

    public final void AhwBna() {
        if (this.AubY == 2 || this.AubY == 1) {
            if (this.OLrzqt != null) {
                this.copydefault.onConnectionStateChange(this.OLrzqt, HciStatus.SUCCESS.value, 3);
            }
            this.iwGUEr.post(new java.lang.Runnable() { // from class: o.yvz.8
                @Override // java.lang.Runnable
                public void run() {
                    if (C58160yvz.this.AubY != 3 || C58160yvz.this.OLrzqt == null) {
                        return;
                    }
                    C58160yvz.this.OLrzqt.disconnect();
                    C58109yvA.copydefault(C58160yvz.KWHzl, "force disconnect '%s' (%s)", C58160yvz.this.DbNXlk(), C58160yvz.this.AkhnZx());
                }
            });
            return;
        }
        this.ejfBZ.copydefault(this, HciStatus.SUCCESS);
    }

    public void isConnected() {
        EZpvd(true, HciStatus.SUCCESS);
    }

    public final void EZpvd(boolean z, @NotNull HciStatus hciStatus) {
        if (this.OLrzqt != null) {
            this.OLrzqt.close();
            this.OLrzqt = null;
        }
        this.gEmmrt.clear();
        this.djBIcL = false;
        this.hDKMBd.clear();
        this.AkhnZx = 23;
        this.DbNXlk = 0;
        this.getNewProxyInstance = false;
        this.zsXlph = false;
        this.fARcdN = false;
        try {
            this.fetchVPNInfo.unregisterReceiver(this.AhwBna);
            this.fetchVPNInfo.unregisterReceiver(this.uzCIH);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        this.EZpvd = false;
        if (z) {
            this.ejfBZ.copydefault(this, hciStatus);
        }
    }

    public java.lang.String AkhnZx() {
        return this.fIwbmz.getAddress();
    }

    public PeripheralType AuCTel() {
        return PeripheralType.fromValue(this.fIwbmz.getType());
    }

    public java.lang.String DbNXlk() {
        java.lang.String name = this.fIwbmz.getName();
        if (name == null) {
            return this.valueOf;
        }
        this.valueOf = name;
        return name;
    }

    public BondState values() {
        return BondState.fromValue(this.fIwbmz.getBondState());
    }

    public java.util.List<android.bluetooth.BluetoothGattService> fJNWhG() {
        if (this.OLrzqt != null) {
            return this.OLrzqt.getServices();
        }
        return Collections.emptyList();
    }

    public android.bluetooth.BluetoothGattService KWHzl(@NotNull UUID uuid) {
        Objects.requireNonNull(uuid, "no valid service UUID provided");
        if (this.OLrzqt != null) {
            return this.OLrzqt.getService(uuid);
        }
        return null;
    }

    public android.bluetooth.BluetoothGattCharacteristic OLrzqt(@NotNull UUID uuid, @NotNull UUID uuid2) {
        Objects.requireNonNull(uuid, "no valid service UUID provided");
        Objects.requireNonNull(uuid2, "no valid characteristic UUID provided");
        android.bluetooth.BluetoothGattService bluetoothGattServiceKWHzl = KWHzl(uuid);
        if (bluetoothGattServiceKWHzl != null) {
            return bluetoothGattServiceKWHzl.getCharacteristic(uuid2);
        }
        return null;
    }

    public ConnectionState fARcdN() {
        return ConnectionState.fromValue(this.AubY);
    }

    public int EZpvd(@NotNull WriteType writeType) {
        Objects.requireNonNull(writeType, "writetype is null");
        int i = AnonymousClass15.EZpvd[writeType.ordinal()];
        if (i != 1) {
            return i != 2 ? this.AkhnZx - 3 : this.AkhnZx - 15;
        }
        return 512;
    }

    /* JADX INFO: renamed from: o.yvz$15, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass15 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[WriteType.values().length];
            EZpvd = iArr;
            try {
                iArr[WriteType.WITH_RESPONSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[WriteType.SIGNED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public boolean copydefault(@NotNull android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        Objects.requireNonNull(bluetoothGattCharacteristic, "no valid characteristic provided");
        return this.hDKMBd.contains(bluetoothGattCharacteristic);
    }

    public final boolean getFieldNames() {
        return !ejfBZ();
    }

    public boolean hDKMBd() {
        return AuCTel() == PeripheralType.UNKNOWN;
    }

    public boolean EZpvd(@NotNull final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, @NotNull byte[] bArr, @NotNull final WriteType writeType) {
        Objects.requireNonNull(bluetoothGattCharacteristic, "no valid characteristic provided");
        Objects.requireNonNull(bArr, "no valid value provided");
        Objects.requireNonNull(writeType, "no valid writeType provided");
        if (getFieldNames()) {
            C58109yvA.AEQbTJ(KWHzl, "peripheral not connected");
            return false;
        }
        if (bArr.length == 0) {
            throw new java.lang.IllegalArgumentException("value byte array is empty");
        }
        if (bArr.length > EZpvd(writeType)) {
            throw new java.lang.IllegalArgumentException("value byte array is too long");
        }
        if (OLrzqt(bluetoothGattCharacteristic, writeType)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("characteristic <%s> does not support writeType '%s'", bluetoothGattCharacteristic.getUuid(), writeType));
        }
        final byte[] bArrEZpvd = EZpvd(bArr);
        return copydefault(new java.lang.Runnable() { // from class: o.yvz.7
            @Override // java.lang.Runnable
            public void run() {
                if (C58160yvz.this.ejfBZ()) {
                    if (C58160yvz.this.KWHzl(bArrEZpvd, writeType)) {
                        C58109yvA.copydefault(C58160yvz.KWHzl, "value byte array is longer than allowed by MTU, write will fail if peripheral does not support long writes");
                    }
                    if (C58160yvz.this.copydefault(bluetoothGattCharacteristic, bArrEZpvd, writeType)) {
                        C58109yvA.AEQbTJ(C58160yvz.KWHzl, "writing <%s> to characteristic <%s>", C58157yvw.AEQbTJ(bArrEZpvd), bluetoothGattCharacteristic.getUuid());
                        C58160yvz.this.getFieldNames++;
                        return;
                    } else {
                        C58109yvA.OLrzqt(C58160yvz.KWHzl, "writeCharacteristic failed for characteristic: %s", bluetoothGattCharacteristic.getUuid());
                        C58160yvz.this.AYXKKw();
                        return;
                    }
                }
                C58160yvz.this.AYXKKw();
            }
        });
    }

    public final boolean KWHzl(@NotNull byte[] bArr, @NotNull WriteType writeType) {
        return bArr.length > this.AkhnZx + (-3) && writeType == WriteType.WITH_RESPONSE;
    }

    public final boolean OLrzqt(@NotNull android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, @NotNull WriteType writeType) {
        return (bluetoothGattCharacteristic.getProperties() & writeType.property) == 0;
    }

    public final boolean copydefault(@NotNull android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, @NotNull byte[] bArr, @NotNull WriteType writeType) {
        if (this.OLrzqt == null) {
            return false;
        }
        this.values = bArr;
        bluetoothGattCharacteristic.setWriteType(writeType.writeType);
        bluetoothGattCharacteristic.setValue(bArr);
        return this.OLrzqt.writeCharacteristic(bluetoothGattCharacteristic);
    }

    public final boolean KWHzl(@NotNull android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, @NotNull byte[] bArr) {
        if (this.OLrzqt == null) {
            return false;
        }
        this.values = bArr;
        EZpvd(bluetoothGattDescriptor.getCharacteristic());
        bluetoothGattDescriptor.setValue(bArr);
        return this.OLrzqt.writeDescriptor(bluetoothGattDescriptor);
    }

    public boolean OLrzqt(@NotNull final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, final boolean z) {
        byte[] bArr;
        Objects.requireNonNull(bluetoothGattCharacteristic, "no valid characteristic provided");
        if (getFieldNames()) {
            C58109yvA.AEQbTJ(KWHzl, "peripheral not connected");
            return false;
        }
        final android.bluetooth.BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(AEQbTJ);
        if (descriptor == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("could not get CCC descriptor for characteristic %s", bluetoothGattCharacteristic.getUuid()));
        }
        int properties = bluetoothGattCharacteristic.getProperties();
        if ((properties & 16) > 0) {
            bArr = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
        } else if ((properties & 32) > 0) {
            bArr = android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
        } else {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("characteristic %s does not have notify or indicate property", bluetoothGattCharacteristic.getUuid()));
        }
        if (!z) {
            bArr = android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
        }
        final byte[] bArr2 = bArr;
        return copydefault(new java.lang.Runnable() { // from class: o.yvz.9
            @Override // java.lang.Runnable
            public void run() {
                if (C58160yvz.this.getFieldNames()) {
                    C58160yvz.this.AYXKKw();
                    return;
                }
                if (!C58160yvz.this.OLrzqt.setCharacteristicNotification(bluetoothGattCharacteristic, z)) {
                    C58109yvA.OLrzqt(C58160yvz.KWHzl, "setCharacteristicNotification failed for characteristic: %s", bluetoothGattCharacteristic.getUuid());
                    C58160yvz.this.AYXKKw();
                    return;
                }
                C58160yvz.this.values = bArr2;
                if (C58160yvz.this.KWHzl(descriptor, bArr2)) {
                    C58160yvz.this.getFieldNames++;
                } else {
                    C58109yvA.OLrzqt(C58160yvz.KWHzl, "writeDescriptor failed for descriptor: %s", descriptor.getUuid());
                    C58160yvz.this.AYXKKw();
                }
            }
        });
    }

    public boolean EZpvd(final int i) {
        if (i < 23 || i > 517) {
            throw new java.lang.IllegalArgumentException("mtu must be between 23 and 517");
        }
        if (getFieldNames()) {
            C58109yvA.AEQbTJ(KWHzl, "peripheral not connected");
            return false;
        }
        return copydefault(new java.lang.Runnable() { // from class: o.yvz.13
            @Override // java.lang.Runnable
            public void run() {
                if (C58160yvz.this.ejfBZ()) {
                    if (C58160yvz.this.OLrzqt.requestMtu(i)) {
                        C58160yvz.this.DbNXlk = 1;
                        C58109yvA.copydefault(C58160yvz.KWHzl, "requesting MTU of %d", java.lang.Integer.valueOf(i));
                        return;
                    } else {
                        C58109yvA.AEQbTJ(C58160yvz.KWHzl, "requestMtu failed");
                        C58160yvz.this.AYXKKw();
                        return;
                    }
                }
                C58160yvz.this.AYXKKw();
            }
        });
    }

    public boolean gEmmrt() {
        if (this.OLrzqt == null) {
            return false;
        }
        try {
            java.lang.reflect.Method method = this.OLrzqt.getClass().getMethod("refresh", new java.lang.Class[0]);
            if (method != null) {
                return ((java.lang.Boolean) method.invoke(this.OLrzqt, new java.lang.Object[0])).booleanValue();
            }
            return false;
        } catch (java.lang.Exception unused) {
            C58109yvA.AEQbTJ(KWHzl, "could not invoke refresh method");
            return false;
        }
    }

    public final boolean copydefault(java.lang.Runnable runnable) {
        boolean zAdd = this.gEmmrt.add(runnable);
        if (zAdd) {
            getNewProxyInstance();
        } else {
            C58109yvA.AEQbTJ(KWHzl, "could not enqueue command");
        }
        return zAdd;
    }

    public final void AYXKKw() {
        this.fJNWhG = false;
        this.gEmmrt.poll();
        this.djBIcL = false;
        getNewProxyInstance();
    }

    public final void uzCIH() {
        this.djBIcL = false;
        if (this.gEmmrt.peek() != null) {
            if (this.getFieldNames >= 2) {
                C58109yvA.KWHzl(KWHzl, "max number of tries reached, not retrying operation anymore");
                this.gEmmrt.poll();
            } else {
                this.fJNWhG = true;
            }
        }
        getNewProxyInstance();
    }

    public final void getNewProxyInstance() {
        synchronized (this) {
            if (this.djBIcL) {
                return;
            }
            final java.lang.Runnable runnablePeek = this.gEmmrt.peek();
            if (runnablePeek == null) {
                return;
            }
            if (this.OLrzqt == null) {
                C58109yvA.OLrzqt(KWHzl, "gatt is 'null' for peripheral '%s', clearing command queue", AkhnZx());
                this.gEmmrt.clear();
                this.djBIcL = false;
            } else if (values() == BondState.BONDING) {
                C58109yvA.copydefault(KWHzl, "bonding is in progress, waiting for bonding to complete");
                this.zsXlph = true;
            } else {
                this.djBIcL = true;
                if (!this.fJNWhG) {
                    this.getFieldNames = 0;
                }
                this.iwGUEr.post(new java.lang.Runnable() { // from class: o.yvz.12
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            runnablePeek.run();
                        } catch (java.lang.Exception e) {
                            C58109yvA.OLrzqt(C58160yvz.KWHzl, "command exception for device '%s'", C58160yvz.this.DbNXlk());
                            C58109yvA.AEQbTJ(C58160yvz.KWHzl, e.toString());
                            C58160yvz.this.AYXKKw();
                        }
                    }
                });
            }
        }
    }

    public final android.bluetooth.BluetoothGatt EZpvd(android.bluetooth.BluetoothDevice bluetoothDevice, boolean z, android.bluetooth.BluetoothGattCallback bluetoothGattCallback) {
        if (bluetoothDevice == null) {
            return null;
        }
        return EZpvd(bluetoothGattCallback, bluetoothDevice, z);
    }

    public final android.bluetooth.BluetoothGatt EZpvd(android.bluetooth.BluetoothGattCallback bluetoothGattCallback, android.bluetooth.BluetoothDevice bluetoothDevice, boolean z) {
        return bluetoothDevice.connectGatt(this.fetchVPNInfo, z, bluetoothGattCallback, this.zLjUOn.value);
    }

    public final void hDKMBd(@NotNull final C58160yvz c58160yvz) {
        AEQbTJ();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.yvz.11
            @Override // java.lang.Runnable
            public void run() {
                C58109yvA.OLrzqt(C58160yvz.KWHzl, "connection timout, disconnecting '%s'", c58160yvz.DbNXlk());
                C58160yvz.this.AhwBna();
                C58160yvz.this.iwGUEr.postDelayed(new java.lang.Runnable() { // from class: o.yvz.11.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C58160yvz.this.OLrzqt != null) {
                            C58160yvz.this.copydefault.onConnectionStateChange(C58160yvz.this.OLrzqt, HciStatus.CONNECTION_FAILED_ESTABLISHMENT.value, 0);
                        }
                    }
                }, 50L);
                C58160yvz.this.wlaJM = null;
            }
        };
        this.wlaJM = runnable;
        this.iwGUEr.postDelayed(runnable, 35000L);
    }

    public final void AEQbTJ() {
        java.lang.Runnable runnable = this.wlaJM;
        if (runnable != null) {
            this.iwGUEr.removeCallbacks(runnable);
            this.wlaJM = null;
        }
    }

    public final int fIwbmz() {
        return android.os.Build.MANUFACTURER.equalsIgnoreCase("samsung") ? 4500 : 25000;
    }

    public byte[] EZpvd(byte[] bArr) {
        return bArr == null ? new byte[0] : java.util.Arrays.copyOf(bArr, bArr.length);
    }
}
