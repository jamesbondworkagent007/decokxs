package o;

import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.okinc.auth.impl.passkey.provider.NativeBlePasskeyProviderImpl$getServiceWithRetry$1;
import com.okinc.auth.impl.passkey.provider.NativeBlePasskeyProviderImpl$sendConfirmation$service$1;
import com.okinc.auth.impl.passkey.provider.NativeBlePasskeyProviderImpl$sendData$service$1;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.DelayKt;
import o.C5947aGA;
import org.jetbrains.annotations.NotNull;
import uniffi.account.BlePasskeyException;

/* JADX INFO: renamed from: o.aGA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5947aGA implements zHY {
    public final android.bluetooth.BluetoothManager AYXKKw;
    public android.bluetooth.le.BluetoothLeScanner AhwBna;
    public InterfaceC60214zyX AkhnZx;
    public android.bluetooth.BluetoothGattCharacteristic AuCTel;
    public boolean AuCTelauCTel;
    public boolean AubY;
    public boolean AwvSrB;
    public int AxsJAY;
    public java.util.List<UUID> DTwDnp;
    public android.bluetooth.BluetoothGatt DbNXlk;
    public final TaskDescription EZpvd;
    public final android.bluetooth.BluetoothAdapter KWHzl;
    public android.bluetooth.BluetoothGattServer OLrzqt;
    public UUID QKVWgx;
    public final StateListAnimator QOLQEE;
    public android.bluetooth.le.BluetoothLeAdvertiser copydefault;
    public android.bluetooth.BluetoothDevice djBIcL;
    public InterfaceC60279zzj ejfBZ;
    public int fARcdN;
    public android.bluetooth.BluetoothGattCharacteristic fIwbmz;
    public InterfaceC60216zyZ fJNWhG;
    public java.lang.String fetchVPNInfo;
    public final java.util.Map<UUID, kotlin.Pair<java.lang.Integer, java.lang.Integer>> gEmmrt;
    public java.lang.String gHZMYf;
    public boolean getFieldNames;
    public final ActionBar getNewProxyInstance;
    public final ConcurrentHashMap<java.lang.String, android.bluetooth.BluetoothDevice> hDKMBd;
    public int isConnected;
    public final android.os.Handler iwGUEr;
    public android.bluetooth.BluetoothGattService sSMYrx;
    public final Application uzCIH;
    public final java.util.Map<UUID, java.util.List<byte[]>> valueOf;
    public final android.content.Context values;
    public boolean wlaJM;
    public boolean zLjUOn;
    public boolean zsXlph;
    public android.bluetooth.BluetoothGatt zuBGHE;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zHY
    public boolean DbNXlk() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zHY
    public boolean valueOf() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zHY
    public boolean values() {
        return this.zsXlph;
    }

    public C5947aGA(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.values = context;
        java.lang.Object systemService = context.getSystemService("bluetooth");
        Intrinsics.copydefault(systemService, "");
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) systemService;
        this.AYXKKw = bluetoothManager;
        this.KWHzl = bluetoothManager.getAdapter();
        this.iwGUEr = new android.os.Handler(android.os.Looper.getMainLooper());
        this.fARcdN = 23;
        this.isConnected = 20;
        this.valueOf = new LinkedHashMap();
        this.gEmmrt = new LinkedHashMap();
        this.hDKMBd = new ConcurrentHashMap<>();
        this.QOLQEE = new StateListAnimator();
        this.EZpvd = new TaskDescription();
        this.uzCIH = new Application();
        this.getNewProxyInstance = new ActionBar();
    }

    /* JADX INFO: renamed from: o.aGA$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aGA.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final UUID EZpvd() {
        UUID uuidFromString = UUID.fromString(C60230zyn.blePasskeyDataCharacteristicUuid());
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
        return uuidFromString;
    }

    public final UUID KWHzl() {
        UUID uuidFromString = UUID.fromString(C60230zyn.blePasskeyDataConfirmCharacteristicUuid());
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
        return uuidFromString;
    }

    public final UUID copydefault() {
        UUID uuidFromString = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
        return uuidFromString;
    }

    /* JADX INFO: renamed from: o.aGA$StateListAnimator */
    public static final class StateListAnimator extends android.bluetooth.le.ScanCallback {
        public StateListAnimator() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, android.bluetooth.le.ScanResult scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "");
            android.bluetooth.BluetoothDevice device = scanResult.getDevice();
            int rssi = scanResult.getRssi();
            java.lang.String name = device.getName();
            if (name == null) {
                name = "Unknown";
            }
            pUU.EZpvd("NativeBlePasskeyProvider", "onScanResult: Device=" + name + " Address=" + device.getAddress() + " RSSI=" + rssi);
            C5947aGA.this.hDKMBd.put(device.getAddress(), device);
            pUU.EZpvd("NativeBlePasskeyProvider", "deviceDiscoveryCallback null? " + (C5947aGA.this.ejfBZ == null));
            InterfaceC60279zzj interfaceC60279zzj = C5947aGA.this.ejfBZ;
            if (interfaceC60279zzj != null) {
                java.lang.String address = device.getAddress();
                Intrinsics.checkNotNullExpressionValue(address, "");
                interfaceC60279zzj.OLrzqt(new C60288zzs(address, device.getName(), rssi));
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            pUU.copydefault("NativeBlePasskeyProvider", "onScanFailed: errorCode=" + i);
        }
    }

    /* JADX INFO: renamed from: o.aGA$TaskDescription */
    public static final class TaskDescription extends android.bluetooth.le.AdvertiseCallback {
        public TaskDescription() {
        }

        @Override // android.bluetooth.le.AdvertiseCallback
        public void onStartSuccess(android.bluetooth.le.AdvertiseSettings advertiseSettings) {
            Intrinsics.checkNotNullParameter(advertiseSettings, "");
            C5947aGA.this.getFieldNames = true;
            pUU.EZpvd("NativeBlePasskeyProvider", "onStartSuccess: Advertising started successfully");
        }

        @Override // android.bluetooth.le.AdvertiseCallback
        public void onStartFailure(int i) {
            java.lang.String str;
            C5947aGA.this.getFieldNames = false;
            if (i == 1) {
                str = "Advertising data too large (max 31 bytes)";
            } else if (i == 2) {
                str = "Too many advertisers (max 1 at a time)";
            } else if (i == 3) {
                str = "Advertising already started";
            } else if (i == 4) {
                str = "Internal error";
            } else if (i != 5) {
                str = "Unknown error: " + i;
            } else {
                str = "Feature unsupported";
            }
            pUU.copydefault("NativeBlePasskeyProvider", "onStartFailure: errorCode=" + i + ", message=" + str);
        }
    }

    /* JADX INFO: renamed from: o.aGA$Application */
    public static final class Application extends android.bluetooth.BluetoothGattServerCallback {
        public Application() {
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onConnectionStateChange(android.bluetooth.BluetoothDevice bluetoothDevice, int i, int i2) {
            Intrinsics.checkNotNullParameter(bluetoothDevice, "");
            pUU.EZpvd("NativeBlePasskeyProvider", "GATT Server onConnectionStateChange: device=" + bluetoothDevice.getAddress() + ", status=" + i + ", newState=" + i2);
            if (i2 == 0) {
                pUU.EZpvd("NativeBlePasskeyProvider", "GATT Server onConnectionStateChange:  newState == BluetoothProfile.STATE_DISCONNECTED");
                C5947aGA.this.djBIcL = null;
                C5947aGA.this.fetchVPNInfo = null;
                C5947aGA.this.zsXlph = false;
                C5947aGA.this.fARcdN = 23;
                C5947aGA.this.isConnected = 20;
                pUU.KWHzl("NativeBlePasskeyProvider", "GATT Server: Device disconnected - " + bluetoothDevice.getAddress());
                InterfaceC60214zyX interfaceC60214zyX = C5947aGA.this.AkhnZx;
                if (interfaceC60214zyX != null) {
                    interfaceC60214zyX.EZpvd(false, null);
                    return;
                }
                return;
            }
            if (i2 != 2) {
                return;
            }
            pUU.EZpvd("NativeBlePasskeyProvider", "GATT Server onConnectionStateChange:  newState == BluetoothProfile.STATE_CONNECTED");
            C5947aGA.this.djBIcL = bluetoothDevice;
            C5947aGA.this.fetchVPNInfo = bluetoothDevice.getAddress();
            C5947aGA.this.zsXlph = true;
            pUU.KWHzl("NativeBlePasskeyProvider", "GATT Server: Device connected - " + bluetoothDevice.getAddress());
            InterfaceC60214zyX interfaceC60214zyX2 = C5947aGA.this.AkhnZx;
            if (interfaceC60214zyX2 != null) {
                interfaceC60214zyX2.EZpvd(true, bluetoothDevice.getAddress());
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onCharacteristicReadRequest(android.bluetooth.BluetoothDevice bluetoothDevice, int i, int i2, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            Intrinsics.checkNotNullParameter(bluetoothDevice, "");
            Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "");
            pUU.EZpvd("NativeBlePasskeyProvider", "GATT Server onCharacteristicReadRequest: device=" + bluetoothDevice.getAddress() + ", characteristic=" + bluetoothGattCharacteristic.getUuid());
            byte[] value = bluetoothGattCharacteristic.getValue();
            android.bluetooth.BluetoothGattServer bluetoothGattServer = C5947aGA.this.OLrzqt;
            if (bluetoothGattServer != null) {
                bluetoothGattServer.sendResponse(bluetoothDevice, i, 0, i2, value);
            }
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onCharacteristicWriteRequest(android.bluetooth.BluetoothDevice bluetoothDevice, int i, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
            android.bluetooth.BluetoothGattServer bluetoothGattServer;
            android.bluetooth.BluetoothGattServer bluetoothGattServer2;
            InterfaceC60216zyZ interfaceC60216zyZ;
            Intrinsics.checkNotNullParameter(bluetoothDevice, "");
            Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "");
            pUU.EZpvd("NativeBlePasskeyProvider", "GATT Server onCharacteristicWriteRequest: device=" + bluetoothDevice.getAddress() + ", characteristic=" + bluetoothGattCharacteristic.getUuid());
            if (bArr == null) {
                C5947aGA c5947aGA = C5947aGA.this;
                if (!z2 || (bluetoothGattServer = c5947aGA.OLrzqt) == null) {
                    return;
                }
                bluetoothGattServer.sendResponse(bluetoothDevice, i, 0, i2, null);
                return;
            }
            C5947aGA c5947aGA2 = C5947aGA.this;
            bluetoothGattCharacteristic.setValue(bArr);
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            Intrinsics.copydefault(uuid);
            byte[] bArrAEQbTJ = c5947aGA2.AEQbTJ(uuid, bArr);
            if (bArrAEQbTJ != null) {
                java.lang.String str = new java.lang.String(bArrAEQbTJ, Charsets.UTF_8);
                pUU.KWHzl("NativeBlePasskeyProvider", "GATT Server: Complete data received, length=" + str.length());
                if (Intrinsics.EZpvd(uuid, c5947aGA2.EZpvd())) {
                    InterfaceC60216zyZ interfaceC60216zyZ2 = c5947aGA2.fJNWhG;
                    if (interfaceC60216zyZ2 != null) {
                        interfaceC60216zyZ2.copydefault(str);
                    }
                } else if (Intrinsics.EZpvd(uuid, c5947aGA2.KWHzl()) && (interfaceC60216zyZ = c5947aGA2.fJNWhG) != null) {
                    interfaceC60216zyZ.OLrzqt(str);
                }
            }
            if (!z2 || (bluetoothGattServer2 = c5947aGA2.OLrzqt) == null) {
                return;
            }
            bluetoothGattServer2.sendResponse(bluetoothDevice, i, 0, i2, null);
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onDescriptorWriteRequest(android.bluetooth.BluetoothDevice bluetoothDevice, int i, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
            android.bluetooth.BluetoothGattServer bluetoothGattServer;
            Intrinsics.checkNotNullParameter(bluetoothDevice, "");
            Intrinsics.checkNotNullParameter(bluetoothGattDescriptor, "");
            pUU.EZpvd("NativeBlePasskeyProvider", "GATT Server onDescriptorWriteRequest: device=" + bluetoothDevice.getAddress() + ", descriptor=" + bluetoothGattDescriptor.getUuid());
            if (Intrinsics.EZpvd(bluetoothGattDescriptor.getUuid(), C5947aGA.this.copydefault())) {
                bluetoothGattDescriptor.setValue(bArr);
                boolean z3 = true;
                if ((bArr == null || !java.util.Arrays.equals(bArr, android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE)) && (bArr == null || !java.util.Arrays.equals(bArr, android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE))) {
                    z3 = false;
                }
                pUU.KWHzl("NativeBlePasskeyProvider", "GATT Server: Notifications enabled=" + z3);
            }
            if (!z2 || (bluetoothGattServer = C5947aGA.this.OLrzqt) == null) {
                return;
            }
            bluetoothGattServer.sendResponse(bluetoothDevice, i, 0, i2, null);
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public void onMtuChanged(android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
            Intrinsics.checkNotNullParameter(bluetoothDevice, "");
            pUU.EZpvd("NativeBlePasskeyProvider", "GATT Server onMtuChanged: device=" + bluetoothDevice.getAddress() + ", mtu=" + i);
            C5947aGA.this.fARcdN = i;
            C5947aGA.this.isConnected = i + (-3);
            pUU.KWHzl("NativeBlePasskeyProvider", "GATT Server: MTU changed - MTU=" + C5947aGA.this.fARcdN + ", ChunkSize=" + C5947aGA.this.isConnected);
        }
    }

    /* JADX INFO: renamed from: o.aGA$ActionBar */
    public static final class ActionBar extends android.bluetooth.BluetoothGattCallback {
        public ActionBar() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            Intrinsics.checkNotNullParameter(bluetoothGatt, "");
            pUU.EZpvd("NativeBlePasskeyProvider", "GATT Client onConnectionStateChange: device=" + bluetoothGatt.getDevice().getAddress() + ", status=" + i + ", newState=" + i2);
            try {
                if (i2 == 0) {
                    C5947aGA.this.zsXlph = false;
                    C5947aGA.this.fetchVPNInfo = null;
                    pUU.KWHzl("NativeBlePasskeyProvider", "GATT Client: Disconnected from device - " + bluetoothGatt.getDevice().getAddress());
                    C5947aGA.this.fARcdN = 23;
                    C5947aGA.this.isConnected = 20;
                    InterfaceC60214zyX interfaceC60214zyX = C5947aGA.this.AkhnZx;
                    if (interfaceC60214zyX != null) {
                        interfaceC60214zyX.EZpvd(false, null);
                    }
                    bluetoothGatt.close();
                    return;
                }
                if (i2 != 2) {
                    return;
                }
                C5947aGA.this.zsXlph = true;
                C5947aGA.this.fetchVPNInfo = bluetoothGatt.getDevice().getAddress();
                pUU.KWHzl("NativeBlePasskeyProvider", "GATT Client: Connected to device - " + bluetoothGatt.getDevice().getAddress());
                boolean zRequestMtu = bluetoothGatt.requestMtu(517);
                pUU.KWHzl("NativeBlePasskeyProvider", "GATT Client: MTU request sent: " + zRequestMtu + " (requesting 517)");
                if (zRequestMtu) {
                    return;
                }
                pUU.copydefault("NativeBlePasskeyProvider", "GATT Client: MTU request failed, continuing with default MTU");
                bluetoothGatt.discoverServices();
            } catch (java.lang.Exception e) {
                pUU.copydefault("NativeBlePasskeyProvider", "GATT Client: onConnectionStateChange error: " + e.getMessage());
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
            Intrinsics.checkNotNullParameter(bluetoothGatt, "");
            pUU.EZpvd("NativeBlePasskeyProvider", "GATT Client onMtuChanged: mtu=" + i + ", status=" + i2);
            if (i2 == 0) {
                C5947aGA.this.fARcdN = i;
                C5947aGA.this.isConnected = i - 3;
                pUU.KWHzl("NativeBlePasskeyProvider", "GATT Client: MTU negotiated successfully - MTU=" + C5947aGA.this.fARcdN + ", ChunkSize=" + C5947aGA.this.isConnected);
            } else {
                pUU.copydefault("NativeBlePasskeyProvider", "GATT Client: MTU negotiation failed, using default - status=" + i2);
            }
            bluetoothGatt.discoverServices();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(android.bluetooth.BluetoothGatt bluetoothGatt, int i) {
            Intrinsics.checkNotNullParameter(bluetoothGatt, "");
            pUU.EZpvd("NativeBlePasskeyProvider", "GATT Client onServicesDiscovered: status=" + i);
            if (i == 0) {
                pUU.KWHzl("NativeBlePasskeyProvider", "GATT Client: Services discovered - count=" + bluetoothGatt.getServices().size());
                C5947aGA.this.AwvSrB = false;
                C5947aGA.this.KWHzl(bluetoothGatt);
                return;
            }
            pUU.copydefault("NativeBlePasskeyProvider", "GATT Client: Service discovery failed - status=" + i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            InterfaceC60216zyZ interfaceC60216zyZ;
            Intrinsics.checkNotNullParameter(bluetoothGatt, "");
            Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "");
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (value == null) {
                return;
            }
            UUID uuid = bluetoothGattCharacteristic.getUuid();
            pUU.KWHzl("NativeBlePasskeyProvider", "GATT Client onCharacteristicChanged: UUID=" + uuid + ", Chunk size=" + value.length);
            C5947aGA c5947aGA = C5947aGA.this;
            Intrinsics.copydefault(uuid);
            byte[] bArrAEQbTJ = c5947aGA.AEQbTJ(uuid, value);
            if (bArrAEQbTJ != null) {
                java.lang.String str = new java.lang.String(bArrAEQbTJ, Charsets.UTF_8);
                pUU.KWHzl("NativeBlePasskeyProvider", "GATT Client: Complete data received, data=" + str + " length=" + str.length());
                if (Intrinsics.EZpvd(uuid, C5947aGA.this.EZpvd())) {
                    InterfaceC60216zyZ interfaceC60216zyZ2 = C5947aGA.this.fJNWhG;
                    if (interfaceC60216zyZ2 != null) {
                        interfaceC60216zyZ2.copydefault(str);
                        return;
                    }
                    return;
                }
                if (!Intrinsics.EZpvd(uuid, C5947aGA.this.KWHzl()) || (interfaceC60216zyZ = C5947aGA.this.fJNWhG) == null) {
                    return;
                }
                interfaceC60216zyZ.OLrzqt(str);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            Intrinsics.checkNotNullParameter(bluetoothGatt, "");
            Intrinsics.checkNotNullParameter(bluetoothGattCharacteristic, "");
            C5947aGA.this.AuCTelauCTel = false;
            pUU.EZpvd("NativeBlePasskeyProvider", "GATT Client onCharacteristicWrite: UUID=" + bluetoothGattCharacteristic.getUuid() + ", status=" + i);
            if (i == 0) {
                pUU.KWHzl("NativeBlePasskeyProvider", "GATT Client: Data sent successfully");
                return;
            }
            pUU.copydefault("NativeBlePasskeyProvider", "GATT Client: Failed to send data - status=" + i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(final android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            Intrinsics.checkNotNullParameter(bluetoothGatt, "");
            Intrinsics.checkNotNullParameter(bluetoothGattDescriptor, "");
            C5947aGA.this.wlaJM = false;
            pUU.EZpvd("NativeBlePasskeyProvider", "GATT Client onDescriptorWrite: descriptor=" + bluetoothGattDescriptor.getUuid() + ", status=" + i);
            if (i != 0) {
                C5947aGA.this.AubY = false;
                pUU.copydefault("NativeBlePasskeyProvider", "GATT Client: Failed to write descriptor - status=" + i);
                return;
            }
            UUID uuid = bluetoothGattDescriptor.getCharacteristic().getUuid();
            if (Intrinsics.EZpvd(bluetoothGattDescriptor.getUuid(), C5947aGA.this.copydefault())) {
                pUU.KWHzl("NativeBlePasskeyProvider", "GATT Client: Notifications enabled for " + uuid);
                if (C5947aGA.this.AubY && Intrinsics.EZpvd(C5947aGA.this.zuBGHE, bluetoothGatt)) {
                    C5947aGA.this.AxsJAY++;
                    int i2 = C5947aGA.this.AxsJAY;
                    java.util.List list = C5947aGA.this.DTwDnp;
                    if (i2 < (list != null ? list.size() : 0)) {
                        android.os.Handler handler = C5947aGA.this.iwGUEr;
                        final C5947aGA c5947aGA = C5947aGA.this;
                        handler.postDelayed(new java.lang.Runnable() { // from class: o.aGG
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5947aGA.ActionBar.OLrzqt(c5947aGA, bluetoothGatt);
                            }
                        }, 100L);
                        return;
                    }
                    C5947aGA.this.AubY = false;
                    C5947aGA.this.AwvSrB = true;
                    C5947aGA.this.DTwDnp = null;
                    C5947aGA.this.sSMYrx = null;
                    C5947aGA.this.zuBGHE = null;
                    pUU.KWHzl("NativeBlePasskeyProvider", "GATT Client: All notifications enabled, ready to send/receive data");
                    java.lang.String str = C5947aGA.this.fetchVPNInfo;
                    if (str != null) {
                        C5947aGA c5947aGA2 = C5947aGA.this;
                        pUU.KWHzl("NativeBlePasskeyProvider", "GATT Client: Notifying Rust - connection ready for device: " + str);
                        InterfaceC60214zyX interfaceC60214zyX = c5947aGA2.AkhnZx;
                        if (interfaceC60214zyX != null) {
                            interfaceC60214zyX.EZpvd(true, str);
                        }
                    }
                }
            }
        }

        public static final void OLrzqt(C5947aGA c5947aGA, android.bluetooth.BluetoothGatt bluetoothGatt) {
            java.util.List list;
            android.bluetooth.BluetoothGattService bluetoothGattService = c5947aGA.sSMYrx;
            if (bluetoothGattService == null || (list = c5947aGA.DTwDnp) == null) {
                return;
            }
            c5947aGA.KWHzl(bluetoothGatt, bluetoothGattService, list, c5947aGA.AxsJAY);
        }
    }

    @Override // o.zHY
    public boolean AYXKKw() {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.KWHzl;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    @Override // o.zHY
    public boolean fetchVPNInfo() {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.KWHzl;
        return bluetoothAdapter != null && bluetoothAdapter.isMultipleAdvertisementSupported();
    }

    @Override // o.zHY
    public void EZpvd(@NotNull java.lang.String str) {
        UUID uuidFromString;
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("NativeBlePasskeyProvider", "setServiceUuid Service UUID set to: " + str);
        try {
            uuidFromString = UUID.fromString(str);
        } catch (java.lang.Exception e) {
            pUU.copydefault("NativeBlePasskeyProvider", "setServiceUuid e: " + e.getMessage());
            uuidFromString = null;
        }
        this.QKVWgx = uuidFromString;
    }

    @Override // o.zHY
    public java.lang.String djBIcL() {
        pUU.KWHzl("NativeBlePasskeyProvider", "getServiceUuid()");
        UUID uuid = this.QKVWgx;
        if (uuid != null) {
            return uuid.toString();
        }
        return null;
    }

    @Override // o.zHY
    public void AEQbTJ(InterfaceC60279zzj interfaceC60279zzj) {
        pUU.EZpvd("NativeBlePasskeyProvider", "setDeviceDiscoveryCallback");
        this.ejfBZ = interfaceC60279zzj;
    }

    @Override // o.zHY
    public void KWHzl(InterfaceC60214zyX interfaceC60214zyX) {
        pUU.EZpvd("NativeBlePasskeyProvider", "setConnectionCallback");
        this.AkhnZx = interfaceC60214zyX;
    }

    @Override // o.zHY
    public void copydefault(InterfaceC60216zyZ interfaceC60216zyZ) {
        pUU.EZpvd("NativeBlePasskeyProvider", "setDataCallback");
        this.fJNWhG = interfaceC60216zyZ;
    }

    @Override // o.zHY
    public void AkhnZx() throws BlePasskeyException.BluetoothNotEnabled, BlePasskeyException.ServiceUuidNotSet, BlePasskeyException.PermissionsNotGranted {
        pUU.EZpvd("NativeBlePasskeyProvider", "startScanning called");
        if (!gEmmrt()) {
            pUU.copydefault("NativeBlePasskeyProvider", "startScanning: BLE permissions not granted");
            throw new BlePasskeyException.PermissionsNotGranted("BLE permissions not granted");
        }
        if (!AYXKKw()) {
            pUU.copydefault("NativeBlePasskeyProvider", "startScanning: Bluetooth is not enabled");
            throw new BlePasskeyException.BluetoothNotEnabled("Bluetooth is not enabled");
        }
        UUID uuid = this.QKVWgx;
        if (uuid == null) {
            pUU.copydefault("NativeBlePasskeyProvider", "startScanning: Service UUID not set");
            throw new BlePasskeyException.ServiceUuidNotSet("Service UUID not set");
        }
        this.hDKMBd.clear();
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.KWHzl;
        this.AhwBna = bluetoothAdapter != null ? bluetoothAdapter.getBluetoothLeScanner() : null;
        android.bluetooth.le.ScanFilter scanFilterBuild = new ScanFilter.Builder().setServiceUuid(new android.os.ParcelUuid(uuid)).build();
        android.bluetooth.le.ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
        pUU.KWHzl("NativeBlePasskeyProvider", "startScanning: Starting BLE scan with service UUID=" + uuid);
        android.bluetooth.le.BluetoothLeScanner bluetoothLeScanner = this.AhwBna;
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.startScan(C56402yEa.EZpvd(scanFilterBuild), scanSettingsBuild, this.QOLQEE);
        }
        this.zLjUOn = true;
    }

    @Override // o.zHY
    public void ejfBZ() {
        pUU.EZpvd("NativeBlePasskeyProvider", "stopScanning called");
        android.bluetooth.le.BluetoothLeScanner bluetoothLeScanner = this.AhwBna;
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.stopScan(this.QOLQEE);
        }
        this.zLjUOn = false;
    }

    @Override // o.zHY
    public void KWHzl(@NotNull java.lang.String str) throws BlePasskeyException.ConnectionFailed, BlePasskeyException.PermissionsNotGranted {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("NativeBlePasskeyProvider", "connectToDevice called: deviceId=" + str);
        if (!gEmmrt()) {
            pUU.copydefault("NativeBlePasskeyProvider", "connectToDevice: BLE permissions not granted");
            throw new BlePasskeyException.PermissionsNotGranted("BLE permissions not granted");
        }
        android.bluetooth.BluetoothDevice bluetoothDevice = this.hDKMBd.get(str);
        if (bluetoothDevice == null) {
            pUU.copydefault("NativeBlePasskeyProvider", "connectToDevice: Device not found: " + str);
            throw new BlePasskeyException.ConnectionFailed("Device not found: " + str);
        }
        pUU.KWHzl("NativeBlePasskeyProvider", "connectToDevice: Connecting to " + bluetoothDevice.getAddress() + "...");
        this.fetchVPNInfo = str;
        this.DbNXlk = bluetoothDevice.connectGatt(this.values, false, this.getNewProxyInstance);
    }

    @Override // o.zHY
    public void copydefault(java.lang.String str) throws BlePasskeyException.GattServerFailed, BlePasskeyException.AdvertisingNotSupported, BlePasskeyException.BluetoothNotEnabled, BlePasskeyException.ServiceUuidNotSet, BlePasskeyException.AdvertisingFailed, BlePasskeyException.PermissionsNotGranted {
        pUU.EZpvd("NativeBlePasskeyProvider", "startAdvertising called with deviceName=" + str);
        if (!gEmmrt()) {
            pUU.copydefault("NativeBlePasskeyProvider", "startAdvertising: BLE permissions not granted");
            throw new BlePasskeyException.PermissionsNotGranted("BLE permissions not granted");
        }
        if (!AYXKKw()) {
            pUU.copydefault("NativeBlePasskeyProvider", "startAdvertising: Bluetooth is not enabled");
            throw new BlePasskeyException.BluetoothNotEnabled("Bluetooth is not enabled");
        }
        UUID uuid = this.QKVWgx;
        if (uuid == null) {
            pUU.copydefault("NativeBlePasskeyProvider", "startAdvertising: Service UUID not set");
            throw new BlePasskeyException.ServiceUuidNotSet("Service UUID not set");
        }
        if (this.getFieldNames && this.copydefault != null) {
            pUU.EZpvd("NativeBlePasskeyProvider", "startAdvertising: Stopping existing advertisement first");
            android.bluetooth.le.BluetoothLeAdvertiser bluetoothLeAdvertiser = this.copydefault;
            if (bluetoothLeAdvertiser != null) {
                bluetoothLeAdvertiser.stopAdvertising(this.EZpvd);
            }
            this.getFieldNames = false;
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException e) {
                pUU.copydefault("NativeBlePasskeyProvider", "startAdvertising: InterruptedException during sleep: " + e.getMessage());
                java.lang.Thread.currentThread().interrupt();
            }
        }
        if (this.OLrzqt != null) {
            pUU.EZpvd("NativeBlePasskeyProvider", "startAdvertising: Closing existing GATT server");
            android.bluetooth.BluetoothGattServer bluetoothGattServer = this.OLrzqt;
            if (bluetoothGattServer != null) {
                bluetoothGattServer.close();
            }
            this.OLrzqt = null;
        }
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.KWHzl;
        android.bluetooth.le.BluetoothLeAdvertiser bluetoothLeAdvertiser2 = bluetoothAdapter != null ? bluetoothAdapter.getBluetoothLeAdvertiser() : null;
        this.copydefault = bluetoothLeAdvertiser2;
        if (bluetoothLeAdvertiser2 == null) {
            pUU.copydefault("NativeBlePasskeyProvider", "startAdvertising: BluetoothLeAdvertiser is null");
            throw new BlePasskeyException.AdvertisingNotSupported("Device does not support BLE advertising");
        }
        android.bluetooth.BluetoothGattServer bluetoothGattServerOpenGattServer = this.AYXKKw.openGattServer(this.values, this.uzCIH);
        this.OLrzqt = bluetoothGattServerOpenGattServer;
        if (bluetoothGattServerOpenGattServer == null) {
            pUU.copydefault("NativeBlePasskeyProvider", "startAdvertising: Failed to open GATT server");
            throw new BlePasskeyException.GattServerFailed("Failed to open GATT server");
        }
        android.bluetooth.BluetoothGattService bluetoothGattService = new android.bluetooth.BluetoothGattService(uuid, 0);
        this.AuCTel = new android.bluetooth.BluetoothGattCharacteristic(EZpvd(), 26, 17);
        android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor = new android.bluetooth.BluetoothGattDescriptor(copydefault(), 17);
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic = this.AuCTel;
        if (bluetoothGattCharacteristic != null) {
            bluetoothGattCharacteristic.addDescriptor(bluetoothGattDescriptor);
        }
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.AuCTel;
        if (bluetoothGattCharacteristic2 != null) {
            bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic2);
        }
        this.fIwbmz = new android.bluetooth.BluetoothGattCharacteristic(KWHzl(), 26, 17);
        android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor2 = new android.bluetooth.BluetoothGattDescriptor(copydefault(), 17);
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic3 = this.fIwbmz;
        if (bluetoothGattCharacteristic3 != null) {
            bluetoothGattCharacteristic3.addDescriptor(bluetoothGattDescriptor2);
        }
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic4 = this.fIwbmz;
        if (bluetoothGattCharacteristic4 != null) {
            bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic4);
        }
        android.bluetooth.BluetoothGattServer bluetoothGattServer2 = this.OLrzqt;
        if (bluetoothGattServer2 != null) {
            bluetoothGattServer2.addService(bluetoothGattService);
        }
        android.bluetooth.le.AdvertiseSettings advertiseSettingsBuild = new AdvertiseSettings.Builder().setAdvertiseMode(1).setTxPowerLevel(2).setConnectable(true).setTimeout(0).build();
        android.bluetooth.le.AdvertiseData advertiseDataBuild = new AdvertiseData.Builder().setIncludeTxPowerLevel(false).setIncludeDeviceName(false).addServiceUuid(new android.os.ParcelUuid(uuid)).build();
        pUU.KWHzl("NativeBlePasskeyProvider", "startAdvertising: Starting advertisement with service UUID=" + uuid);
        try {
            android.bluetooth.le.BluetoothLeAdvertiser bluetoothLeAdvertiser3 = this.copydefault;
            if (bluetoothLeAdvertiser3 != null) {
                bluetoothLeAdvertiser3.startAdvertising(advertiseSettingsBuild, advertiseDataBuild, this.EZpvd);
            }
        } catch (java.lang.Exception e2) {
            pUU.AEQbTJ("NativeBlePasskeyProvider", "startAdvertising: Exception - " + e2.getMessage(), e2);
            throw new BlePasskeyException.AdvertisingFailed("Advertising failed: " + e2.getMessage());
        }
    }

    @Override // o.zHY
    public void isConnected() {
        pUU.EZpvd("NativeBlePasskeyProvider", "stopAdvertising called");
        android.bluetooth.le.BluetoothLeAdvertiser bluetoothLeAdvertiser = this.copydefault;
        if (bluetoothLeAdvertiser != null) {
            bluetoothLeAdvertiser.stopAdvertising(this.EZpvd);
        }
        android.bluetooth.BluetoothGattServer bluetoothGattServer = this.OLrzqt;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.close();
        }
        this.OLrzqt = null;
        this.djBIcL = null;
        this.AuCTel = null;
        this.fIwbmz = null;
        this.getFieldNames = false;
    }

    @Override // o.zHY
    public void AEQbTJ() {
        pUU.EZpvd("NativeBlePasskeyProvider", "disconnect called");
        android.bluetooth.BluetoothGatt bluetoothGatt = this.DbNXlk;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        android.bluetooth.BluetoothGatt bluetoothGatt2 = this.DbNXlk;
        if (bluetoothGatt2 != null) {
            bluetoothGatt2.close();
        }
        this.DbNXlk = null;
        this.zsXlph = false;
        this.fetchVPNInfo = null;
    }

    @Override // o.zHY
    public int AhwBna() {
        return C56395yDu.EZpvd(this.fARcdN);
    }

    @Override // o.zHY
    public void OLrzqt(@NotNull java.lang.String str) throws java.lang.InterruptedException, BlePasskeyException.NotConnected, BlePasskeyException.SendFailed, BlePasskeyException.CharacteristicNotFound {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("NativeBlePasskeyProvider", "sendData called: dataLength=" + str.length());
        android.bluetooth.BluetoothGatt bluetoothGatt = this.DbNXlk;
        if (bluetoothGatt != null) {
            if (bluetoothGatt == null) {
                return;
            }
            android.bluetooth.BluetoothGattCharacteristic characteristic = ((android.bluetooth.BluetoothGattService) BuildersKt__BuildersKt.runBlocking$default(null, new NativeBlePasskeyProviderImpl$sendData$service$1(this, bluetoothGatt, null), 1, null)).getCharacteristic(EZpvd());
            if (characteristic == null) {
                pUU.copydefault("NativeBlePasskeyProvider", "sendData: Data characteristic not found");
                throw new BlePasskeyException.CharacteristicNotFound("Characteristic not found");
            }
            EZpvd(bluetoothGatt, characteristic, str);
            return;
        }
        if (this.OLrzqt == null || this.djBIcL == null) {
            pUU.copydefault("NativeBlePasskeyProvider", "sendData: Not connected");
            throw new BlePasskeyException.NotConnected("Not connected");
        }
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic = this.AuCTel;
        if (bluetoothGattCharacteristic == null) {
            pUU.copydefault("NativeBlePasskeyProvider", "sendData: Data characteristic not initialized");
            throw new BlePasskeyException.CharacteristicNotFound("Data characteristic not found");
        }
        KWHzl(bluetoothGattCharacteristic, str);
    }

    @Override // o.zHY
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException, BlePasskeyException.NotConnected, BlePasskeyException.SendFailed, BlePasskeyException.CharacteristicNotFound {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("NativeBlePasskeyProvider", "sendConfirmation called: dataLength=" + str.length());
        android.bluetooth.BluetoothGatt bluetoothGatt = this.DbNXlk;
        if (bluetoothGatt != null) {
            if (bluetoothGatt == null) {
                return;
            }
            android.bluetooth.BluetoothGattCharacteristic characteristic = ((android.bluetooth.BluetoothGattService) BuildersKt__BuildersKt.runBlocking$default(null, new NativeBlePasskeyProviderImpl$sendConfirmation$service$1(this, bluetoothGatt, null), 1, null)).getCharacteristic(KWHzl());
            if (characteristic == null) {
                pUU.copydefault("NativeBlePasskeyProvider", "sendConfirmation: Confirmation characteristic not found");
                throw new BlePasskeyException.CharacteristicNotFound("Confirmation characteristic not found");
            }
            EZpvd(bluetoothGatt, characteristic, str);
            return;
        }
        if (this.OLrzqt == null || this.djBIcL == null) {
            pUU.copydefault("NativeBlePasskeyProvider", "sendConfirmation: Not connected");
            throw new BlePasskeyException.NotConnected("Not connected");
        }
        android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic = this.fIwbmz;
        if (bluetoothGattCharacteristic == null) {
            pUU.copydefault("NativeBlePasskeyProvider", "sendConfirmation: Data confirm characteristic not initialized");
            throw new BlePasskeyException.CharacteristicNotFound("Data confirm characteristic not found");
        }
        KWHzl(bluetoothGattCharacteristic, str);
    }

    @Override // o.zHY
    public void OLrzqt() {
        pUU.EZpvd("NativeBlePasskeyProvider", "cleanup called");
        ejfBZ();
        isConnected();
        AEQbTJ();
        this.hDKMBd.clear();
        this.valueOf.clear();
        this.gEmmrt.clear();
        this.fARcdN = 23;
        this.isConnected = 20;
    }

    public static /* synthetic */ java.lang.Object getServiceWithRetry$default(C5947aGA c5947aGA, android.bluetooth.BluetoothGatt bluetoothGatt, java.lang.String str, int i, long j, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 5;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = 1000;
        }
        return c5947aGA.OLrzqt(bluetoothGatt, str, i3, j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b8 -> B:24:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(android.bluetooth.BluetoothGatt bluetoothGatt, java.lang.String str, int i, long j, Continuation<? super android.bluetooth.BluetoothGattService> continuation) throws java.lang.Throwable {
        NativeBlePasskeyProviderImpl$getServiceWithRetry$1 nativeBlePasskeyProviderImpl$getServiceWithRetry$1;
        C5947aGA c5947aGA;
        android.bluetooth.BluetoothGatt bluetoothGatt2;
        int i2;
        long j2;
        int i3;
        java.lang.String str2;
        if (continuation instanceof NativeBlePasskeyProviderImpl$getServiceWithRetry$1) {
            nativeBlePasskeyProviderImpl$getServiceWithRetry$1 = (NativeBlePasskeyProviderImpl$getServiceWithRetry$1) continuation;
            int i4 = nativeBlePasskeyProviderImpl$getServiceWithRetry$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nativeBlePasskeyProviderImpl$getServiceWithRetry$1.label = i4 - Integer.MIN_VALUE;
            } else {
                nativeBlePasskeyProviderImpl$getServiceWithRetry$1 = new NativeBlePasskeyProviderImpl$getServiceWithRetry$1(this, continuation);
            }
        }
        java.lang.Object obj = nativeBlePasskeyProviderImpl$getServiceWithRetry$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = nativeBlePasskeyProviderImpl$getServiceWithRetry$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj);
            c5947aGA = this;
            bluetoothGatt2 = bluetoothGatt;
            i2 = 0;
            j2 = j;
            i3 = i;
            str2 = str;
            if (i2 < i3) {
            }
        } else {
            if (i5 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = nativeBlePasskeyProviderImpl$getServiceWithRetry$1.I$1;
            long j3 = nativeBlePasskeyProviderImpl$getServiceWithRetry$1.J$0;
            i3 = nativeBlePasskeyProviderImpl$getServiceWithRetry$1.I$0;
            java.lang.String str3 = (java.lang.String) nativeBlePasskeyProviderImpl$getServiceWithRetry$1.L$2;
            android.bluetooth.BluetoothGatt bluetoothGatt3 = (android.bluetooth.BluetoothGatt) nativeBlePasskeyProviderImpl$getServiceWithRetry$1.L$1;
            c5947aGA = (C5947aGA) nativeBlePasskeyProviderImpl$getServiceWithRetry$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str2 = str3;
            j2 = j3;
            bluetoothGatt2 = bluetoothGatt3;
            i2++;
            if (i2 < i3) {
                android.bluetooth.BluetoothGattService service = bluetoothGatt2.getService(c5947aGA.QKVWgx);
                if (service != null) {
                    pUU.EZpvd("NativeBlePasskeyProvider", str2 + ": Service found on attempt " + (i2 + 1));
                    return service;
                }
                pUU.EZpvd("NativeBlePasskeyProvider", str2 + ": Service not found, attempt " + (i2 + 1) + "/" + i3 + ", waiting " + j2 + "ms...");
                nativeBlePasskeyProviderImpl$getServiceWithRetry$1.L$0 = c5947aGA;
                nativeBlePasskeyProviderImpl$getServiceWithRetry$1.L$1 = bluetoothGatt2;
                nativeBlePasskeyProviderImpl$getServiceWithRetry$1.L$2 = str2;
                nativeBlePasskeyProviderImpl$getServiceWithRetry$1.I$0 = i3;
                nativeBlePasskeyProviderImpl$getServiceWithRetry$1.J$0 = j2;
                nativeBlePasskeyProviderImpl$getServiceWithRetry$1.I$1 = i2;
                nativeBlePasskeyProviderImpl$getServiceWithRetry$1.label = 1;
                if (DelayKt.delay(j2, nativeBlePasskeyProviderImpl$getServiceWithRetry$1) == objCopydefault) {
                    return objCopydefault;
                }
                i2++;
                if (i2 < i3) {
                }
            } else {
                pUU.copydefault("NativeBlePasskeyProvider", str2 + ": Service not found after " + i3 + " attempts");
                throw new BlePasskeyException.ServiceNotFound("Service not found after " + i3 + " retries");
            }
        }
    }

    public final void EZpvd(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, java.lang.String str) throws java.lang.InterruptedException, BlePasskeyException.SendFailed {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        int i = (bluetoothGattCharacteristic.getProperties() & 4) != 0 ? 1 : 2;
        if (bytes.length <= this.isConnected) {
            this.AuCTelauCTel = true;
            this.gHZMYf = str;
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    if (bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bytes, i) == 0) {
                        return;
                    }
                } else {
                    bluetoothGattCharacteristic.setValue(bytes);
                    bluetoothGattCharacteristic.setWriteType(i);
                    if (bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic)) {
                        return;
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("NativeBlePasskeyProvider", "sendDataForCentral: writeCharacteristic error: " + e.getMessage());
            }
            this.AuCTelauCTel = false;
            pUU.copydefault("NativeBlePasskeyProvider", "sendDataToCharacteristic: Failed to write characteristic");
            throw new BlePasskeyException.SendFailed("Failed to write characteristic");
        }
        KWHzl(bluetoothGatt, bluetoothGattCharacteristic, bytes, str, i);
    }

    public final void KWHzl(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, java.lang.String str) throws java.lang.InterruptedException, BlePasskeyException.SendFailed {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        if (bytes.length <= this.isConnected) {
            if (Build.VERSION.SDK_INT >= 33) {
                android.bluetooth.BluetoothGattServer bluetoothGattServer = this.OLrzqt;
                if (bluetoothGattServer != null) {
                    android.bluetooth.BluetoothDevice bluetoothDevice = this.djBIcL;
                    Intrinsics.copydefault(bluetoothDevice);
                    if (bluetoothGattServer.notifyCharacteristicChanged(bluetoothDevice, bluetoothGattCharacteristic, false, bytes) == 0) {
                        return;
                    }
                }
            } else {
                bluetoothGattCharacteristic.setValue(bytes);
                android.bluetooth.BluetoothGattServer bluetoothGattServer2 = this.OLrzqt;
                if (bluetoothGattServer2 != null && bluetoothGattServer2.notifyCharacteristicChanged(this.djBIcL, bluetoothGattCharacteristic, false)) {
                    return;
                }
            }
            pUU.copydefault("NativeBlePasskeyProvider", "sendDataViaNotification: Failed to send notification");
            throw new BlePasskeyException.SendFailed("Failed to send notification");
        }
        EZpvd(bluetoothGattCharacteristic, bytes, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, java.lang.String str, int i) throws java.lang.InterruptedException, BlePasskeyException.SendFailed {
        boolean z;
        int length = bArr.length;
        int i2 = this.isConnected;
        int i3 = ((length + i2) - 1) / i2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.isConnected;
            int i6 = i4 * i5;
            byte[] bArrEZpvd = yDV.EZpvd(bArr, C56548yJl.AhwBna(i6, java.lang.Math.min(i5 + i6, bArr.length)));
            this.AuCTelauCTel = true;
            try {
            } catch (java.lang.Exception e) {
                pUU.copydefault("NativeBlePasskeyProvider", "sendDataInChunksForCentral: writeCharacteristic chunk error: " + e.getMessage());
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArrEZpvd, i) != 0) {
                    this.AuCTelauCTel = false;
                    int i7 = i4 + 1;
                    pUU.copydefault("NativeBlePasskeyProvider", "sendDataInChunksForCentral: Failed to send chunk " + i7 + "/" + i3);
                    throw new BlePasskeyException.SendFailed("Failed to send chunk " + i7 + "/" + i3);
                }
                if (i != 2) {
                    int i8 = 0;
                    while (true) {
                        z = this.AuCTelauCTel;
                        if (!z || i8 >= 50) {
                            break;
                        }
                        java.lang.Thread.sleep(100L);
                        i8++;
                    }
                    if (z) {
                        this.AuCTelauCTel = false;
                    }
                } else {
                    java.lang.Thread.sleep(20L);
                    this.AuCTelauCTel = false;
                }
            } else {
                bluetoothGattCharacteristic.setValue(bArrEZpvd);
                bluetoothGattCharacteristic.setWriteType(i);
                if (!bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic)) {
                    this.AuCTelauCTel = false;
                    int i72 = i4 + 1;
                    pUU.copydefault("NativeBlePasskeyProvider", "sendDataInChunksForCentral: Failed to send chunk " + i72 + "/" + i3);
                    throw new BlePasskeyException.SendFailed("Failed to send chunk " + i72 + "/" + i3);
                }
                if (i != 2) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, java.lang.String str) throws java.lang.InterruptedException, BlePasskeyException.SendFailed {
        int length = bArr.length;
        int i = ((length + r0) - 1) / this.isConnected;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.isConnected;
            int i4 = i2 * i3;
            byte[] bArrEZpvd = yDV.EZpvd(bArr, C56548yJl.AhwBna(i4, java.lang.Math.min(i3 + i4, bArr.length)));
            if (Build.VERSION.SDK_INT >= 33) {
                android.bluetooth.BluetoothGattServer bluetoothGattServer = this.OLrzqt;
                if (bluetoothGattServer != null) {
                    android.bluetooth.BluetoothDevice bluetoothDevice = this.djBIcL;
                    Intrinsics.copydefault(bluetoothDevice);
                    if (bluetoothGattServer.notifyCharacteristicChanged(bluetoothDevice, bluetoothGattCharacteristic, false, bArrEZpvd) != 0) {
                    }
                    if (i2 >= i - 1) {
                        java.lang.Thread.sleep(50L);
                    }
                }
                int i5 = i2 + 1;
                pUU.copydefault("NativeBlePasskeyProvider", "sendDataInChunksForPeripheral: Failed to send chunk " + i5 + "/" + i);
                throw new BlePasskeyException.SendFailed("Failed to send chunk " + i5 + "/" + i);
            }
            bluetoothGattCharacteristic.setValue(bArrEZpvd);
            android.bluetooth.BluetoothGattServer bluetoothGattServer2 = this.OLrzqt;
            if (bluetoothGattServer2 == null || !bluetoothGattServer2.notifyCharacteristicChanged(this.djBIcL, bluetoothGattCharacteristic, false)) {
                int i52 = i2 + 1;
                pUU.copydefault("NativeBlePasskeyProvider", "sendDataInChunksForPeripheral: Failed to send chunk " + i52 + "/" + i);
                throw new BlePasskeyException.SendFailed("Failed to send chunk " + i52 + "/" + i);
            }
            if (i2 >= i - 1) {
            }
        }
    }

    public final void KWHzl(android.bluetooth.BluetoothGatt bluetoothGatt) {
        UUID uuid;
        android.bluetooth.BluetoothGattService service;
        if (this.AubY || (uuid = this.QKVWgx) == null || (service = bluetoothGatt.getService(uuid)) == null) {
            return;
        }
        this.AubY = true;
        java.util.List<UUID> listGEmmrt = yDY.gEmmrt(EZpvd(), KWHzl());
        this.DTwDnp = listGEmmrt;
        this.sSMYrx = service;
        this.zuBGHE = bluetoothGatt;
        this.AxsJAY = 0;
        Intrinsics.copydefault(listGEmmrt);
        KWHzl(bluetoothGatt, service, listGEmmrt, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[PHI: r10
  0x0066: PHI (r10v2 int) = (r10v1 int), (r10v0 int), (r10v0 int) binds: [B:24:0x004c, B:21:0x0048, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0066 -> B:27:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattService bluetoothGattService, java.util.List<UUID> list, int i) {
        if (i >= list.size()) {
            this.AubY = false;
            this.AwvSrB = true;
            return;
        }
        android.bluetooth.BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(list.get(i));
        if (characteristic == null) {
            KWHzl(bluetoothGatt, bluetoothGattService, list, i + 1);
            return;
        }
        bluetoothGatt.setCharacteristicNotification(characteristic, true);
        android.bluetooth.BluetoothGattDescriptor descriptor = characteristic.getDescriptor(copydefault());
        if (descriptor == null) {
            KWHzl(bluetoothGatt, bluetoothGattService, list, i + 1);
            return;
        }
        byte[] bArr = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
        this.wlaJM = true;
        try {
        } catch (java.lang.Exception e) {
            pUU.copydefault("NativeBlePasskeyProvider", "enableNotificationForCharacteristic: writeDescriptor error: " + e.getMessage());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (bluetoothGatt.writeDescriptor(descriptor, bArr) != 0) {
                this.wlaJM = false;
                i++;
                KWHzl(bluetoothGatt, bluetoothGattService, list, i);
            }
        } else {
            descriptor.setValue(bArr);
            if (!bluetoothGatt.writeDescriptor(descriptor)) {
            }
        }
    }

    public final boolean gEmmrt() {
        return Build.VERSION.SDK_INT < 31 ? ContextCompat.checkSelfPermission(this.values, "android.permission.ACCESS_FINE_LOCATION") == 0 : ContextCompat.checkSelfPermission(this.values, "android.permission.BLUETOOTH_SCAN") == 0 && ContextCompat.checkSelfPermission(this.values, "android.permission.BLUETOOTH_ADVERTISE") == 0 && ContextCompat.checkSelfPermission(this.values, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    public final byte[] AEQbTJ(UUID uuid, byte[] bArr) {
        java.util.Map<UUID, java.util.List<byte[]>> map = this.valueOf;
        java.util.List<byte[]> arrayList = map.get(uuid);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            map.put(uuid, arrayList);
        }
        java.util.List<byte[]> list = arrayList;
        if (bArr.length == this.isConnected) {
            list.add(bArr);
            return null;
        }
        if (list.isEmpty()) {
            return bArr;
        }
        list.add(bArr);
        java.util.Iterator<T> it = list.iterator();
        int length = 0;
        int length2 = 0;
        while (it.hasNext()) {
            length2 += ((byte[]) it.next()).length;
        }
        byte[] bArr2 = new byte[length2];
        for (byte[] bArr3 : list) {
            yDT.copyInto$default(bArr3, bArr2, length, 0, 0, 12, (java.lang.Object) null);
            length += bArr3.length;
        }
        this.valueOf.remove(uuid);
        this.gEmmrt.remove(uuid);
        return bArr2;
    }
}
