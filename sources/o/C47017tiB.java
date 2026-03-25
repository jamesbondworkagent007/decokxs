package o;

import com.okinc.okrisk.collection.sensors.SensorType;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tiB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47017tiB implements InterfaceC47020tiE {
    public ArrayDeque<C47063tiv> AhwBna;
    public ArrayDeque<C47063tiv> AkhnZx;
    public android.hardware.SensorManager DbNXlk;
    public android.hardware.Sensor EZpvd;
    public ArrayDeque<C47063tiv> OLrzqt;
    public android.hardware.Sensor copydefault;
    public android.hardware.Sensor djBIcL;
    public ArrayDeque<C47063tiv> gEmmrt;
    public android.hardware.Sensor valueOf;
    public C47064tiw values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public final ReentrantReadWriteLock AYXKKw = new ReentrantReadWriteLock();
    public final java.util.Map<SensorType, java.lang.Integer> KWHzl = new LinkedHashMap();

    /* JADX INFO: renamed from: o.tiB$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SensorType.values().length];
            try {
                iArr[SensorType.ACCELEROMETER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SensorType.GYROSCOPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SensorType.MAGNETOMETER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SensorType.GRAVITY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SensorType.ALL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<SensorType, java.lang.Integer> KWHzl() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.tiB$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tiB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public void OLrzqt(@NotNull android.hardware.SensorManager sensorManager, @NotNull C47064tiw c47064tiw) {
        Intrinsics.checkNotNullParameter(sensorManager, "");
        Intrinsics.checkNotNullParameter(c47064tiw, "");
        ReentrantReadWriteLock reentrantReadWriteLock = this.AYXKKw;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            EZpvd();
            this.DbNXlk = sensorManager;
            this.values = c47064tiw;
            int i3 = Activity.OLrzqt[c47064tiw.AEQbTJ().ordinal()];
            if (i3 == 1) {
                copydefault(sensorManager, c47064tiw);
            } else if (i3 == 2) {
                AEQbTJ(sensorManager, c47064tiw);
            } else if (i3 == 3) {
                AYXKKw(sensorManager, c47064tiw);
            } else if (i3 == 4) {
                EZpvd(sensorManager, c47064tiw);
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                KWHzl(sensorManager, c47064tiw);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void copydefault(android.hardware.SensorManager sensorManager, C47064tiw c47064tiw) {
        this.OLrzqt = new ArrayDeque<>();
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.EZpvd = defaultSensor;
        if (defaultSensor == null) {
            this.KWHzl.put(SensorType.ACCELEROMETER, -2);
            pUU.valueOf("SensorServiceImpl", "Accelerometer sensor not available");
        } else if (!sensorManager.registerListener(this, defaultSensor, c47064tiw.KWHzl(), new android.os.Handler(android.os.Looper.getMainLooper()))) {
            this.KWHzl.put(SensorType.ACCELEROMETER, -1);
            pUU.copydefault("SensorServiceImpl", "Failed to register accelerometer listener");
        } else {
            this.KWHzl.put(SensorType.ACCELEROMETER, 0);
            pUU.KWHzl("SensorServiceImpl", "Accelerometer collection started");
        }
    }

    public final void AEQbTJ(android.hardware.SensorManager sensorManager, C47064tiw c47064tiw) {
        this.gEmmrt = new ArrayDeque<>();
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        this.valueOf = defaultSensor;
        if (defaultSensor == null) {
            this.KWHzl.put(SensorType.GYROSCOPE, -2);
            pUU.valueOf("SensorServiceImpl", "Gyroscope sensor not available");
        } else if (!sensorManager.registerListener(this, defaultSensor, c47064tiw.KWHzl(), new android.os.Handler(android.os.Looper.getMainLooper()))) {
            this.KWHzl.put(SensorType.GYROSCOPE, -1);
            pUU.copydefault("SensorServiceImpl", "Failed to register gyroscope listener");
        } else {
            this.KWHzl.put(SensorType.GYROSCOPE, 0);
            pUU.KWHzl("SensorServiceImpl", "Gyroscope collection started");
        }
    }

    public final void AYXKKw(android.hardware.SensorManager sensorManager, C47064tiw c47064tiw) {
        this.AkhnZx = new ArrayDeque<>();
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(2);
        this.djBIcL = defaultSensor;
        if (defaultSensor == null) {
            this.KWHzl.put(SensorType.MAGNETOMETER, -2);
            pUU.valueOf("SensorServiceImpl", "Magnetometer sensor not available");
        } else if (!sensorManager.registerListener(this, defaultSensor, c47064tiw.KWHzl(), new android.os.Handler(android.os.Looper.getMainLooper()))) {
            this.KWHzl.put(SensorType.MAGNETOMETER, -1);
            pUU.copydefault("SensorServiceImpl", "Failed to register magnetometer listener");
        } else {
            this.KWHzl.put(SensorType.MAGNETOMETER, 0);
            pUU.KWHzl("SensorServiceImpl", "Magnetometer collection started");
        }
    }

    public final void EZpvd(android.hardware.SensorManager sensorManager, C47064tiw c47064tiw) {
        this.AhwBna = new ArrayDeque<>();
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(9);
        this.copydefault = defaultSensor;
        if (defaultSensor == null) {
            this.KWHzl.put(SensorType.GRAVITY, -2);
            pUU.valueOf("SensorServiceImpl", "Gravity sensor not available");
        } else if (!sensorManager.registerListener(this, defaultSensor, c47064tiw.KWHzl(), new android.os.Handler(android.os.Looper.getMainLooper()))) {
            this.KWHzl.put(SensorType.GRAVITY, -1);
            pUU.copydefault("SensorServiceImpl", "Failed to register gravity sensor listener");
        } else {
            this.KWHzl.put(SensorType.GRAVITY, 0);
            pUU.KWHzl("SensorServiceImpl", "Gravity sensor collection started");
        }
    }

    public final void KWHzl(android.hardware.SensorManager sensorManager, C47064tiw c47064tiw) {
        copydefault(sensorManager, c47064tiw);
        AEQbTJ(sensorManager, c47064tiw);
        AYXKKw(sensorManager, c47064tiw);
        EZpvd(sensorManager, c47064tiw);
    }

    public void copydefault() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.AYXKKw;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            EZpvd();
            Unit unit = Unit.INSTANCE;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void EZpvd() {
        android.hardware.SensorManager sensorManager = this.DbNXlk;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.DbNXlk = null;
        this.values = null;
        this.EZpvd = null;
        this.valueOf = null;
        this.copydefault = null;
        this.djBIcL = null;
        pUU.KWHzl("SensorServiceImpl", "Sensor collection stopped and cleaned up");
    }

    public java.util.List<C47063tiv> OLrzqt(@NotNull SensorType sensorType) {
        java.util.List<C47063tiv> listAhwBna;
        Intrinsics.checkNotNullParameter(sensorType, "");
        ReentrantReadWriteLock.ReadLock lock = this.AYXKKw.readLock();
        lock.lock();
        try {
            int i = Activity.OLrzqt[sensorType.ordinal()];
            if (i == 1) {
                ArrayDeque<C47063tiv> arrayDeque = this.OLrzqt;
                if (arrayDeque == null || (listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayDeque)) == null) {
                    listAhwBna = yDY.AhwBna();
                }
            } else if (i == 2) {
                ArrayDeque<C47063tiv> arrayDeque2 = this.gEmmrt;
                if (arrayDeque2 == null || (listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayDeque2)) == null) {
                    listAhwBna = yDY.AhwBna();
                }
            } else if (i == 3) {
                ArrayDeque<C47063tiv> arrayDeque3 = this.AkhnZx;
                if (arrayDeque3 == null || (listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayDeque3)) == null) {
                    listAhwBna = yDY.AhwBna();
                }
            } else if (i == 4) {
                ArrayDeque<C47063tiv> arrayDeque4 = this.AhwBna;
                if (arrayDeque4 == null || (listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayDeque4)) == null) {
                    listAhwBna = yDY.AhwBna();
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                ArrayDeque<C47063tiv> arrayDeque5 = this.OLrzqt;
                if (arrayDeque5 != null) {
                    arrayList.addAll(arrayDeque5);
                }
                ArrayDeque<C47063tiv> arrayDeque6 = this.gEmmrt;
                if (arrayDeque6 != null) {
                    arrayList.addAll(arrayDeque6);
                }
                ArrayDeque<C47063tiv> arrayDeque7 = this.AkhnZx;
                if (arrayDeque7 != null) {
                    arrayList.addAll(arrayDeque7);
                }
                ArrayDeque<C47063tiv> arrayDeque8 = this.AhwBna;
                if (arrayDeque8 != null) {
                    arrayList.addAll(arrayDeque8);
                }
                listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            }
            return listAhwBna;
        } finally {
            lock.unlock();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent == null) {
            return;
        }
        if (sensorEvent.values.length < 3) {
            pUU.valueOf("SensorServiceImpl", "Invalid sensor event: insufficient values");
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        ReentrantReadWriteLock reentrantReadWriteLock = this.AYXKKw;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                float[] fArr = sensorEvent.values;
                copydefault(this.OLrzqt, new C47063tiv(fArr[0], fArr[1], fArr[2], SensorType.ACCELEROMETER, jCurrentTimeMillis));
            } else if (type == 2) {
                float[] fArr2 = sensorEvent.values;
                copydefault(this.AkhnZx, new C47063tiv(fArr2[0], fArr2[1], fArr2[2], SensorType.MAGNETOMETER, jCurrentTimeMillis));
            } else if (type == 4) {
                float[] fArr3 = sensorEvent.values;
                copydefault(this.gEmmrt, new C47063tiv(fArr3[0], fArr3[1], fArr3[2], SensorType.GYROSCOPE, jCurrentTimeMillis));
            } else if (type == 9) {
                float[] fArr4 = sensorEvent.values;
                copydefault(this.AhwBna, new C47063tiv(fArr4[0], fArr4[1], fArr4[2], SensorType.GRAVITY, jCurrentTimeMillis));
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void copydefault(ArrayDeque<C47063tiv> arrayDeque, C47063tiv c47063tiv) {
        if (arrayDeque != null) {
            arrayDeque.addLast(c47063tiv);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
        if (sensor != null) {
            pUU.EZpvd("SensorServiceImpl", "Sensor accuracy changed: " + sensor.getName() + ", accuracy: " + i);
        }
    }
}
