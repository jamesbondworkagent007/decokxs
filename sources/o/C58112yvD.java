package o;

import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import com.welie.blessed.HciStatus;
import com.welie.blessed.ScanFailure;
import com.welie.blessed.ScanMode;
import com.welie.blessed.Transport;
import java.util.Collections;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import o.AbstractC58111yvC;
import o.C58160yvz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58112yvD {
    public static final java.lang.String AEQbTJ = "BluetoothCentralManager";
    public static final Transport EZpvd = Transport.LE;
    public volatile android.bluetooth.le.BluetoothLeScanner AYXKKw;
    public final android.bluetooth.le.ScanSettings AhwBna;
    public android.bluetooth.le.ScanSettings AuCTelauCTel;
    public final android.os.Handler DbNXlk;
    public java.lang.Runnable KWHzl;
    public final android.content.BroadcastReceiver OLrzqt;
    public final AbstractC58110yvB djBIcL;
    public volatile android.bluetooth.le.ScanCallback ejfBZ;
    public java.util.List<android.bluetooth.le.ScanFilter> fIwbmz;
    public final android.content.Context fetchVPNInfo;
    public volatile android.bluetooth.le.BluetoothLeScanner gEmmrt;
    public final android.bluetooth.BluetoothAdapter valueOf;
    public java.lang.Runnable wlaJM;
    public final java.util.Map<java.lang.String, C58160yvz> values = new ConcurrentHashMap();
    public final java.util.Map<java.lang.String, C58160yvz> AxsJAY = new ConcurrentHashMap();
    public final java.util.Map<java.lang.String, C58160yvz> AubY = new ConcurrentHashMap();
    public final java.util.List<java.lang.String> getFieldNames = new java.util.ArrayList();
    public final java.util.Map<java.lang.String, AbstractC58111yvC> uzCIH = new ConcurrentHashMap();
    public java.lang.String[] zLjUOn = new java.lang.String[0];
    public final android.os.Handler fARcdN = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.lang.Object AkhnZx = new java.lang.Object();
    public final java.lang.Object iwGUEr = new java.lang.Object();
    public final java.util.Map<java.lang.String, java.lang.Integer> isConnected = new ConcurrentHashMap();
    public final java.util.Map<java.lang.String, java.lang.String> hDKMBd = new ConcurrentHashMap();
    public Transport zsXlph = EZpvd;
    public final android.bluetooth.le.ScanCallback getNewProxyInstance = new android.bluetooth.le.ScanCallback() { // from class: o.yvD.2
        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, android.bluetooth.le.ScanResult scanResult) {
            synchronized (this) {
                java.lang.String name = scanResult.getDevice().getName();
                if (name == null) {
                    return;
                }
                for (java.lang.String str : C58112yvD.this.zLjUOn) {
                    if (name.contains(str)) {
                        C58112yvD.this.copydefault(scanResult);
                        return;
                    }
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            C58112yvD.this.fIwbmz();
            C58112yvD.this.AEQbTJ(ScanFailure.fromValue(i));
        }
    };
    public final android.bluetooth.le.ScanCallback fJNWhG = new android.bluetooth.le.ScanCallback() { // from class: o.yvD.1
        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, android.bluetooth.le.ScanResult scanResult) {
            synchronized (this) {
                C58112yvD.this.copydefault(scanResult);
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            C58112yvD.this.fIwbmz();
            C58112yvD.this.AEQbTJ(ScanFailure.fromValue(i));
        }
    };
    public final android.bluetooth.le.ScanCallback copydefault = new android.bluetooth.le.ScanCallback() { // from class: o.yvD.8
        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, android.bluetooth.le.ScanResult scanResult) {
            synchronized (this) {
                if (C58112yvD.this.AYXKKw()) {
                    C58109yvA.AEQbTJ(C58112yvD.AEQbTJ, "peripheral with address '%s' found", scanResult.getDevice().getAddress());
                    C58112yvD.this.fARcdN();
                    java.lang.String address = scanResult.getDevice().getAddress();
                    C58160yvz c58160yvz = (C58160yvz) C58112yvD.this.AxsJAY.get(address);
                    AbstractC58111yvC abstractC58111yvC = (AbstractC58111yvC) C58112yvD.this.uzCIH.get(address);
                    C58112yvD.this.getFieldNames.remove(address);
                    C58112yvD.this.uzCIH.remove(address);
                    C58112yvD.this.KWHzl(address);
                    if (c58160yvz != null && abstractC58111yvC != null) {
                        C58112yvD.this.EZpvd(c58160yvz, abstractC58111yvC);
                    }
                    if (C58112yvD.this.getFieldNames.size() > 0) {
                        C58112yvD.this.DbNXlk();
                    }
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            final ScanFailure scanFailureFromValue = ScanFailure.fromValue(i);
            C58109yvA.OLrzqt(C58112yvD.AEQbTJ, "autoConnect scan failed with error code %d (%s)", java.lang.Integer.valueOf(i), scanFailureFromValue);
            C58112yvD.this.fARcdN();
            C58112yvD.this.DbNXlk.post(new java.lang.Runnable() { // from class: o.yvD.8.3
                @Override // java.lang.Runnable
                public void run() {
                    C58112yvD.this.djBIcL.EZpvd(scanFailureFromValue);
                }
            });
        }
    };
    public final C58160yvz.StateListAnimator AuCTel = new C58160yvz.StateListAnimator() { // from class: o.yvD.10
        @Override // o.C58160yvz.StateListAnimator
        public void EZpvd(@NotNull final C58160yvz c58160yvz) {
            C58112yvD.this.DbNXlk.post(new java.lang.Runnable() { // from class: o.yvD.10.2
                @Override // java.lang.Runnable
                public void run() {
                    C58112yvD.this.djBIcL.AEQbTJ(c58160yvz);
                }
            });
        }

        @Override // o.C58160yvz.StateListAnimator
        public void copydefault(@NotNull final C58160yvz c58160yvz) {
            java.lang.String strAkhnZx = c58160yvz.AkhnZx();
            C58112yvD.this.KWHzl(strAkhnZx);
            C58112yvD.this.values.put(strAkhnZx, c58160yvz);
            C58112yvD.this.DbNXlk.post(new java.lang.Runnable() { // from class: o.yvD.10.5
                @Override // java.lang.Runnable
                public void run() {
                    C58112yvD.this.djBIcL.copydefault(c58160yvz);
                }
            });
        }

        @Override // o.C58160yvz.StateListAnimator
        public void AEQbTJ(@NotNull final C58160yvz c58160yvz, @NotNull final HciStatus hciStatus) {
            java.lang.String strAkhnZx = c58160yvz.AkhnZx();
            java.lang.Integer num = (java.lang.Integer) C58112yvD.this.isConnected.get(strAkhnZx);
            int iIntValue = num != null ? num.intValue() : 0;
            C58112yvD.this.KWHzl(strAkhnZx);
            if (iIntValue < 1 && hciStatus != HciStatus.CONNECTION_FAILED_ESTABLISHMENT) {
                C58109yvA.copydefault(C58112yvD.AEQbTJ, "retrying connection to '%s' (%s)", c58160yvz.DbNXlk(), strAkhnZx);
                C58112yvD.this.isConnected.put(strAkhnZx, java.lang.Integer.valueOf(iIntValue + 1));
                C58112yvD.this.AxsJAY.put(strAkhnZx, c58160yvz);
                c58160yvz.valueOf();
                return;
            }
            C58109yvA.copydefault(C58112yvD.AEQbTJ, "connection to '%s' (%s) failed", c58160yvz.DbNXlk(), strAkhnZx);
            C58112yvD.this.DbNXlk.post(new java.lang.Runnable() { // from class: o.yvD.10.4
                @Override // java.lang.Runnable
                public void run() {
                    C58112yvD.this.djBIcL.KWHzl(c58160yvz, hciStatus);
                }
            });
        }

        @Override // o.C58160yvz.StateListAnimator
        public void AEQbTJ(@NotNull final C58160yvz c58160yvz) {
            C58112yvD.this.DbNXlk.post(new java.lang.Runnable() { // from class: o.yvD.10.3
                @Override // java.lang.Runnable
                public void run() {
                    C58112yvD.this.djBIcL.KWHzl(c58160yvz);
                }
            });
        }

        @Override // o.C58160yvz.StateListAnimator
        public void copydefault(@NotNull final C58160yvz c58160yvz, @NotNull final HciStatus hciStatus) {
            C58112yvD.this.KWHzl(c58160yvz.AkhnZx());
            C58112yvD.this.DbNXlk.post(new java.lang.Runnable() { // from class: o.yvD.10.1
                @Override // java.lang.Runnable
                public void run() {
                    C58112yvD.this.djBIcL.copydefault(c58160yvz, hciStatus);
                }
            });
        }

        @Override // o.C58160yvz.StateListAnimator
        public java.lang.String KWHzl(@NotNull C58160yvz c58160yvz) {
            return (java.lang.String) C58112yvD.this.hDKMBd.get(c58160yvz.AkhnZx());
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.gEmmrt != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return (this.AYXKKw == null || this.ejfBZ == null) ? false : true;
    }

    public final void copydefault(@NotNull final android.bluetooth.le.ScanResult scanResult) {
        this.DbNXlk.post(new java.lang.Runnable() { // from class: o.yvD.4
            @Override // java.lang.Runnable
            public void run() {
                if (C58112yvD.this.AkhnZx()) {
                    C58160yvz c58160yvzAEQbTJ = C58112yvD.this.AEQbTJ(scanResult.getDevice().getAddress());
                    c58160yvzAEQbTJ.EZpvd(scanResult.getDevice());
                    C58112yvD.this.djBIcL.OLrzqt(c58160yvzAEQbTJ, scanResult);
                }
            }
        });
    }

    public final void AEQbTJ(@NotNull final ScanFailure scanFailure) {
        this.ejfBZ = null;
        this.fIwbmz = null;
        this.DbNXlk.post(new java.lang.Runnable() { // from class: o.yvD.3
            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = C58112yvD.AEQbTJ;
                int i = scanFailure.value;
                C58109yvA.OLrzqt(str, "scan failed with error code %d (%s)", java.lang.Integer.valueOf(i), scanFailure);
                C58112yvD.this.djBIcL.EZpvd(scanFailure);
            }
        });
    }

    public final void KWHzl(java.lang.String str) {
        this.values.remove(str);
        this.AxsJAY.remove(str);
        this.AubY.remove(str);
        this.isConnected.remove(str);
    }

    public C58112yvD(@NotNull android.content.Context context, @NotNull AbstractC58110yvB abstractC58110yvB, @NotNull android.os.Handler handler) {
        android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: o.yvD.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                java.lang.String action = intent.getAction();
                if (action != null && action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    final int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    C58112yvD.this.copydefault(intExtra);
                    C58112yvD.this.DbNXlk.post(new java.lang.Runnable() { // from class: o.yvD.5.5
                        @Override // java.lang.Runnable
                        public void run() {
                            C58112yvD.this.djBIcL.EZpvd(intExtra);
                        }
                    });
                }
            }
        };
        this.OLrzqt = broadcastReceiver;
        Objects.requireNonNull(context, "no valid context provided");
        this.fetchVPNInfo = context;
        Objects.requireNonNull(abstractC58110yvB, "no valid bluetoothCallback provided");
        this.djBIcL = abstractC58110yvB;
        Objects.requireNonNull(handler, "no valid handler provided");
        this.DbNXlk = handler;
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) context.getSystemService("bluetooth");
        Objects.requireNonNull(bluetoothManager, "cannot get BluetoothManager");
        android.bluetooth.BluetoothAdapter adapter = bluetoothManager.getAdapter();
        Objects.requireNonNull(adapter, "no bluetooth adapter found");
        this.valueOf = adapter;
        this.AhwBna = copydefault(ScanMode.LOW_POWER);
        this.AuCTelauCTel = copydefault(ScanMode.LOW_LATENCY);
        context.registerReceiver(broadcastReceiver, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    public void gEmmrt() {
        C58109yvA.copydefault = true;
    }

    public final android.bluetooth.le.ScanSettings copydefault(@NotNull ScanMode scanMode) {
        Objects.requireNonNull(scanMode, "scanMode is null");
        return new ScanSettings.Builder().setScanMode(scanMode.value).setCallbackType(1).setMatchMode(1).setNumOfMatches(1).setReportDelay(0L).build();
    }

    public final void AEQbTJ(@NotNull java.util.List<android.bluetooth.le.ScanFilter> list, @NotNull android.bluetooth.le.ScanSettings scanSettings, @NotNull android.bluetooth.le.ScanCallback scanCallback) {
        if (AEQbTJ()) {
            return;
        }
        if (AkhnZx()) {
            C58109yvA.AEQbTJ(AEQbTJ, "other scan still active, stopping scan");
            fIwbmz();
        }
        if (this.AYXKKw == null) {
            this.AYXKKw = this.valueOf.getBluetoothLeScanner();
        }
        if (this.AYXKKw != null) {
            fetchVPNInfo();
            this.ejfBZ = scanCallback;
            this.fIwbmz = list;
            this.AYXKKw.startScan(list, scanSettings, scanCallback);
            C58109yvA.OLrzqt(AEQbTJ, "scan started");
            return;
        }
        C58109yvA.AEQbTJ(AEQbTJ, "starting scan failed");
    }

    public void KWHzl(@NotNull UUID[] uuidArr) {
        Objects.requireNonNull(uuidArr, "no service UUIDs supplied");
        if (uuidArr.length == 0) {
            throw new java.lang.IllegalArgumentException("at least one service UUID  must be supplied");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (UUID uuid : uuidArr) {
            arrayList.add(new ScanFilter.Builder().setServiceUuid(new android.os.ParcelUuid(uuid)).build());
        }
        AEQbTJ(arrayList, this.AuCTelauCTel, this.fJNWhG);
    }

    public final void DbNXlk() {
        if (AEQbTJ()) {
            return;
        }
        if (this.gEmmrt != null) {
            fARcdN();
        }
        this.gEmmrt = this.valueOf.getBluetoothLeScanner();
        if (this.gEmmrt != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.String> it = this.getFieldNames.iterator();
            while (it.hasNext()) {
                arrayList.add(new ScanFilter.Builder().setDeviceAddress(it.next()).build());
            }
            this.gEmmrt.startScan(arrayList, this.AhwBna, this.copydefault);
            C58109yvA.KWHzl(AEQbTJ, "started scanning to autoconnect peripherals (" + this.getFieldNames.size() + ")");
            values();
            return;
        }
        C58109yvA.AEQbTJ(AEQbTJ, "starting autoconnect scan failed");
    }

    public final void fARcdN() {
        EZpvd();
        if (this.gEmmrt != null) {
            try {
                this.gEmmrt.stopScan(this.copydefault);
            } catch (java.lang.Exception unused) {
            }
            this.gEmmrt = null;
            C58109yvA.OLrzqt(AEQbTJ, "autoscan stopped");
        }
    }

    public void fIwbmz() {
        synchronized (this.iwGUEr) {
            OLrzqt();
            if (AkhnZx()) {
                try {
                    if (this.AYXKKw != null) {
                        this.AYXKKw.stopScan(this.ejfBZ);
                        this.ejfBZ = null;
                        this.fIwbmz = null;
                        C58109yvA.OLrzqt(AEQbTJ, "scan stopped");
                    }
                } catch (java.lang.Exception unused) {
                    C58109yvA.AEQbTJ(AEQbTJ, "caught exception in stopScan");
                }
            }
            C58109yvA.OLrzqt(AEQbTJ, "no scan to stop because no scan is running");
            this.AYXKKw = null;
        }
    }

    public void EZpvd(@NotNull C58160yvz c58160yvz, @NotNull AbstractC58111yvC abstractC58111yvC) {
        synchronized (this.AkhnZx) {
            Objects.requireNonNull(c58160yvz, "no valid peripheral provided");
            Objects.requireNonNull(abstractC58111yvC, "no valid peripheral callback specified");
            if (this.values.containsKey(c58160yvz.AkhnZx())) {
                C58109yvA.KWHzl(AEQbTJ, "already connected to %s'", c58160yvz.AkhnZx());
                return;
            }
            if (this.AxsJAY.containsKey(c58160yvz.AkhnZx())) {
                C58109yvA.KWHzl(AEQbTJ, "already connecting to %s'", c58160yvz.AkhnZx());
                return;
            }
            if (!this.valueOf.isEnabled()) {
                C58109yvA.AEQbTJ(AEQbTJ, "cannot connect to peripheral because Bluetooth is off");
                return;
            }
            if (c58160yvz.hDKMBd()) {
                C58109yvA.KWHzl(AEQbTJ, "peripheral with address '%s' is not in the Bluetooth cache, hence connection may fail", c58160yvz.AkhnZx());
            }
            c58160yvz.OLrzqt(abstractC58111yvC);
            this.AubY.remove(c58160yvz.AkhnZx());
            this.AxsJAY.put(c58160yvz.AkhnZx(), c58160yvz);
            c58160yvz.valueOf();
        }
    }

    public void KWHzl(@NotNull C58160yvz c58160yvz, @NotNull AbstractC58111yvC abstractC58111yvC) {
        synchronized (this.AkhnZx) {
            Objects.requireNonNull(c58160yvz, "no valid peripheral provided");
            Objects.requireNonNull(abstractC58111yvC, "no valid peripheral callback specified");
            if (this.values.containsKey(c58160yvz.AkhnZx())) {
                C58109yvA.KWHzl(AEQbTJ, "already connected to %s'", c58160yvz.AkhnZx());
                return;
            }
            if (this.AxsJAY.containsKey(c58160yvz.AkhnZx())) {
                C58109yvA.KWHzl(AEQbTJ, "already connecting to %s'", c58160yvz.AkhnZx());
                return;
            }
            if (!this.valueOf.isEnabled()) {
                C58109yvA.AEQbTJ(AEQbTJ, "cannot connect to peripheral because Bluetooth is off");
                return;
            }
            if (c58160yvz.hDKMBd()) {
                C58109yvA.KWHzl(AEQbTJ, "peripheral with address '%s' is not in the Bluetooth cache, hence connection may fail", c58160yvz.AkhnZx());
            }
            c58160yvz.OLrzqt(abstractC58111yvC);
            c58160yvz.djBIcL();
        }
    }

    public void copydefault(@NotNull final C58160yvz c58160yvz) {
        Objects.requireNonNull(c58160yvz, "no valid peripheral provided");
        java.lang.String strAkhnZx = c58160yvz.AkhnZx();
        if (this.getFieldNames.contains(strAkhnZx)) {
            this.getFieldNames.remove(strAkhnZx);
            this.uzCIH.remove(strAkhnZx);
            this.AxsJAY.remove(strAkhnZx);
            fARcdN();
            C58109yvA.AEQbTJ(AEQbTJ, "cancelling autoconnect for %s", strAkhnZx);
            this.DbNXlk.post(new java.lang.Runnable() { // from class: o.yvD.6
                @Override // java.lang.Runnable
                public void run() {
                    C58112yvD.this.djBIcL.copydefault(c58160yvz, HciStatus.SUCCESS);
                }
            });
            if (this.getFieldNames.size() > 0) {
                DbNXlk();
                return;
            }
            return;
        }
        if (this.AxsJAY.containsKey(strAkhnZx) || this.values.containsKey(strAkhnZx)) {
            c58160yvz.OLrzqt();
        } else {
            C58109yvA.OLrzqt(AEQbTJ, "cannot cancel connection to unknown peripheral %s", strAkhnZx);
        }
    }

    public C58160yvz AEQbTJ(@NotNull java.lang.String str) {
        Objects.requireNonNull(str, "no peripheral address provided");
        if (!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not a valid bluetooth address. Make sure all alphabetic characters are uppercase.", str));
        }
        if (this.values.containsKey(str)) {
            C58160yvz c58160yvz = this.values.get(str);
            Objects.requireNonNull(c58160yvz);
            return c58160yvz;
        }
        if (this.AxsJAY.containsKey(str)) {
            C58160yvz c58160yvz2 = this.AxsJAY.get(str);
            Objects.requireNonNull(c58160yvz2);
            return c58160yvz2;
        }
        if (this.AubY.containsKey(str)) {
            C58160yvz c58160yvz3 = this.AubY.get(str);
            Objects.requireNonNull(c58160yvz3);
            return c58160yvz3;
        }
        C58160yvz c58160yvz4 = new C58160yvz(this.fetchVPNInfo, this.valueOf.getRemoteDevice(str), this.AuCTel, new AbstractC58111yvC.Application(), this.DbNXlk, this.zsXlph);
        this.AubY.put(str, c58160yvz4);
        return c58160yvz4;
    }

    public java.util.List<C58160yvz> valueOf() {
        return new java.util.ArrayList(this.values.values());
    }

    public final boolean AEQbTJ() {
        if (djBIcL() && AhwBna()) {
            return !isConnected();
        }
        return true;
    }

    public final boolean djBIcL() {
        if (this.fetchVPNInfo.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return true;
        }
        C58109yvA.AEQbTJ(AEQbTJ, "BLE not supported");
        return false;
    }

    public boolean AhwBna() {
        if (this.valueOf.isEnabled()) {
            return true;
        }
        C58109yvA.AEQbTJ(AEQbTJ, "Bluetooth disabled");
        return false;
    }

    public final boolean isConnected() {
        int i = this.fetchVPNInfo.getApplicationInfo().targetSdkVersion;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 && i >= 31) {
            if (this.fetchVPNInfo.checkSelfPermission("android.permission.BLUETOOTH_SCAN") != 0) {
                throw new java.lang.SecurityException("app does not have BLUETOOTH_SCAN permission, cannot start scan");
            }
            if (this.fetchVPNInfo.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) {
                return true;
            }
            throw new java.lang.SecurityException("app does not have BLUETOOTH_CONNECT permission, cannot connect");
        }
        if (i2 >= 29 && i >= 29) {
            if (this.fetchVPNInfo.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                return true;
            }
            throw new java.lang.SecurityException("app does not have ACCESS_FINE_LOCATION permission, cannot start scan");
        }
        if (this.fetchVPNInfo.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return true;
        }
        throw new java.lang.SecurityException("app does not have ACCESS_COARSE_LOCATION permission, cannot start scan");
    }

    public final void fetchVPNInfo() {
        OLrzqt();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.yvD.7
            @Override // java.lang.Runnable
            public void run() {
                C58109yvA.KWHzl(C58112yvD.AEQbTJ, "scanning timeout, restarting scan");
                final android.bluetooth.le.ScanCallback scanCallback = C58112yvD.this.ejfBZ;
                final java.util.List listEmptyList = C58112yvD.this.fIwbmz != null ? C58112yvD.this.fIwbmz : Collections.emptyList();
                C58112yvD.this.fIwbmz();
                C58112yvD.this.DbNXlk.postDelayed(new java.lang.Runnable() { // from class: o.yvD.7.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (scanCallback != null) {
                            C58112yvD c58112yvD = C58112yvD.this;
                            c58112yvD.AEQbTJ(listEmptyList, c58112yvD.AuCTelauCTel, scanCallback);
                        }
                    }
                }, 1000L);
            }
        };
        this.wlaJM = runnable;
        this.fARcdN.postDelayed(runnable, 180000L);
    }

    public final void OLrzqt() {
        java.lang.Runnable runnable = this.wlaJM;
        if (runnable != null) {
            this.fARcdN.removeCallbacks(runnable);
            this.wlaJM = null;
        }
    }

    public final void values() {
        EZpvd();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.yvD.9
            @Override // java.lang.Runnable
            public void run() {
                C58109yvA.KWHzl(C58112yvD.AEQbTJ, "autoconnect scan timeout, restarting scan");
                if (C58112yvD.this.gEmmrt != null) {
                    C58112yvD.this.gEmmrt.stopScan(C58112yvD.this.copydefault);
                    C58112yvD.this.gEmmrt = null;
                }
                C58112yvD.this.fARcdN.postDelayed(new java.lang.Runnable() { // from class: o.yvD.9.5
                    @Override // java.lang.Runnable
                    public void run() {
                        C58112yvD.this.DbNXlk();
                    }
                }, 1000L);
            }
        };
        this.KWHzl = runnable;
        this.fARcdN.postDelayed(runnable, 180000L);
    }

    public final void EZpvd() {
        java.lang.Runnable runnable = this.KWHzl;
        if (runnable != null) {
            this.fARcdN.removeCallbacks(runnable);
            this.KWHzl = null;
        }
    }

    public final void KWHzl() {
        C58109yvA.KWHzl(AEQbTJ, "disconnect all peripherals because bluetooth is off");
        java.util.Iterator<C58160yvz> it = this.values.values().iterator();
        while (it.hasNext()) {
            it.next().isConnected();
        }
        this.values.clear();
        java.util.Iterator<C58160yvz> it2 = this.AxsJAY.values().iterator();
        while (it2.hasNext()) {
            it2.next().isConnected();
        }
        this.AxsJAY.clear();
        this.getFieldNames.clear();
        this.uzCIH.clear();
    }

    public final void copydefault(int i) {
        switch (i) {
            case 10:
                if (this.values.size() > 0 || this.AxsJAY.size() > 0) {
                    KWHzl();
                }
                C58109yvA.KWHzl(AEQbTJ, "bluetooth turned off");
                break;
            case 11:
                C58109yvA.KWHzl(AEQbTJ, "bluetooth turning on");
                break;
            case 12:
                C58109yvA.KWHzl(AEQbTJ, "bluetooth turned on");
                this.AYXKKw = this.valueOf.getBluetoothLeScanner();
                if (this.AYXKKw != null && this.ejfBZ != null) {
                    try {
                        this.AYXKKw.stopScan(this.ejfBZ);
                        break;
                    } catch (java.lang.Exception unused) {
                    }
                }
                this.ejfBZ = null;
                this.fIwbmz = null;
                break;
            case 13:
                java.util.Iterator<C58160yvz> it = this.values.values().iterator();
                while (it.hasNext()) {
                    it.next().OLrzqt();
                }
                java.util.Iterator<C58160yvz> it2 = this.AxsJAY.values().iterator();
                while (it2.hasNext()) {
                    it2.next().OLrzqt();
                }
                this.getFieldNames.clear();
                this.uzCIH.clear();
                if (AkhnZx()) {
                    fIwbmz();
                }
                if (AYXKKw()) {
                    fARcdN();
                }
                OLrzqt();
                EZpvd();
                this.gEmmrt = null;
                this.AYXKKw = null;
                C58109yvA.KWHzl(AEQbTJ, "bluetooth turning off");
                break;
        }
    }
}
