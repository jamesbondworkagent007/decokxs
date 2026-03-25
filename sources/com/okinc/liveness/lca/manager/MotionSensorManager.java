package com.okinc.liveness.lca.manager;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class MotionSensorManager implements SensorEventListener {
    public static final int $stable = 8;
    public final MutableSharedFlow<SensorReading> _sensorReadingFlow;
    public final Sensor accelerometer;
    public final SensorValues currentValues;
    public final Sensor gravity;
    public final Sensor gyroscope;
    public final Sensor magnetometer;
    public final SensorManager sensorManager;
    public final SharedFlow<SensorReading> sensorReadingFlow;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<SensorReading> getSensorReadingFlow() {
        return this.sensorReadingFlow;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public MotionSensorManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.copydefault(systemService, "");
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.gyroscope = sensorManager.getDefaultSensor(4);
        this.accelerometer = sensorManager.getDefaultSensor(1);
        this.gravity = sensorManager.getDefaultSensor(9);
        this.magnetometer = sensorManager.getDefaultSensor(2);
        this.currentValues = new SensorValues(null, null, null, null, 15, null);
        MutableSharedFlow<SensorReading> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 100, null, 4, null);
        this._sensorReadingFlow = mutableSharedFlowMutableSharedFlow$default;
        this.sensorReadingFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static final class SensorReading {
        public static final int $stable = 8;
        public final List<Float> accelerometer;
        public String event;
        public final List<Float> geomagnetic;
        public final List<Float> gravity;
        public final List<Float> gyroscope;
        public final long timestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Float> component2() {
            return this.accelerometer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Float> component3() {
            return this.gyroscope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Float> component4() {
            return this.gravity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Float> component5() {
            return this.geomagnetic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.event;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SensorReading copy(long j, List<Float> list, List<Float> list2, List<Float> list3, List<Float> list4, String str) {
            return new SensorReading(j, list, list2, list3, list4, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SensorReading)) {
                return false;
            }
            SensorReading sensorReading = (SensorReading) obj;
            return this.timestamp == sensorReading.timestamp && Intrinsics.EZpvd(this.accelerometer, sensorReading.accelerometer) && Intrinsics.EZpvd(this.gyroscope, sensorReading.gyroscope) && Intrinsics.EZpvd(this.gravity, sensorReading.gravity) && Intrinsics.EZpvd(this.geomagnetic, sensorReading.geomagnetic) && Intrinsics.EZpvd((Object) this.event, (Object) sensorReading.event);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Float> getAccelerometer() {
            return this.accelerometer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEvent() {
            return this.event;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Float> getGeomagnetic() {
            return this.geomagnetic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Float> getGravity() {
            return this.gravity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Float> getGyroscope() {
            return this.gyroscope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.timestamp);
            List<Float> list = this.accelerometer;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            List<Float> list2 = this.gyroscope;
            int iHashCode3 = list2 == null ? 0 : list2.hashCode();
            List<Float> list3 = this.gravity;
            int iHashCode4 = list3 == null ? 0 : list3.hashCode();
            List<Float> list4 = this.geomagnetic;
            int iHashCode5 = list4 == null ? 0 : list4.hashCode();
            String str = this.event;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setEvent(String str) {
            this.event = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SensorReading(timestamp=" + this.timestamp + ", accelerometer=" + this.accelerometer + ", gyroscope=" + this.gyroscope + ", gravity=" + this.gravity + ", geomagnetic=" + this.geomagnetic + ", event=" + this.event + ")";
        }

        public SensorReading(long j, List<Float> list, List<Float> list2, List<Float> list3, List<Float> list4, String str) {
            this.timestamp = j;
            this.accelerometer = list;
            this.gyroscope = list2;
            this.gravity = list3;
            this.geomagnetic = list4;
            this.event = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r10v0 long)
  (r12v0 java.util.List)
  (r13v0 java.util.List)
  (r14v0 java.util.List)
  (r15v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
 A[MD:(long, java.util.List<java.lang.Float>, java.util.List<java.lang.Float>, java.util.List<java.lang.Float>, java.util.List<java.lang.Float>, java.lang.String):void (m)] (LINE:30) call: com.okinc.liveness.lca.manager.MotionSensorManager.SensorReading.<init>(long, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String):void type: THIS */
        public /* synthetic */ SensorReading(long j, List list, List list2, List list3, List list4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, list, list2, list3, list4, (i & 32) != 0 ? null : str);
        }
    }

    public static final class SensorValues {
        public float[] accelerometer;
        public float[] geomagnetic;
        public float[] gravity;
        public float[] gyroscope;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SensorValues() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SensorValues copy$default(SensorValues sensorValues, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int i, Object obj) {
            if ((i & 1) != 0) {
                fArr = sensorValues.accelerometer;
            }
            if ((i & 2) != 0) {
                fArr2 = sensorValues.gyroscope;
            }
            if ((i & 4) != 0) {
                fArr3 = sensorValues.gravity;
            }
            if ((i & 8) != 0) {
                fArr4 = sensorValues.geomagnetic;
            }
            return sensorValues.copy(fArr, fArr2, fArr3, fArr4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float[] component1() {
            return this.accelerometer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float[] component2() {
            return this.gyroscope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float[] component3() {
            return this.gravity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float[] component4() {
            return this.geomagnetic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SensorValues copy(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
            return new SensorValues(fArr, fArr2, fArr3, fArr4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SensorValues)) {
                return false;
            }
            SensorValues sensorValues = (SensorValues) obj;
            return Intrinsics.EZpvd(this.accelerometer, sensorValues.accelerometer) && Intrinsics.EZpvd(this.gyroscope, sensorValues.gyroscope) && Intrinsics.EZpvd(this.gravity, sensorValues.gravity) && Intrinsics.EZpvd(this.geomagnetic, sensorValues.geomagnetic);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float[] getAccelerometer() {
            return this.accelerometer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float[] getGeomagnetic() {
            return this.geomagnetic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float[] getGravity() {
            return this.gravity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float[] getGyroscope() {
            return this.gyroscope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            float[] fArr = this.accelerometer;
            int iHashCode = fArr == null ? 0 : Arrays.hashCode(fArr);
            float[] fArr2 = this.gyroscope;
            int iHashCode2 = fArr2 == null ? 0 : Arrays.hashCode(fArr2);
            float[] fArr3 = this.gravity;
            int iHashCode3 = fArr3 == null ? 0 : Arrays.hashCode(fArr3);
            float[] fArr4 = this.geomagnetic;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (fArr4 != null ? Arrays.hashCode(fArr4) : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAccelerometer(float[] fArr) {
            this.accelerometer = fArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setGeomagnetic(float[] fArr) {
            this.geomagnetic = fArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setGravity(float[] fArr) {
            this.gravity = fArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setGyroscope(float[] fArr) {
            this.gyroscope = fArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SensorValues(accelerometer=" + Arrays.toString(this.accelerometer) + ", gyroscope=" + Arrays.toString(this.gyroscope) + ", gravity=" + Arrays.toString(this.gravity) + ", geomagnetic=" + Arrays.toString(this.geomagnetic) + ")";
        }

        public SensorValues(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
            this.accelerometer = fArr;
            this.gyroscope = fArr2;
            this.gravity = fArr3;
            this.geomagnetic = fArr4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:float[]:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null float[]) : (r2v0 float[]))
  (wrap:float[]:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null float[]) : (r3v0 float[]))
  (wrap:float[]:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null float[]) : (r4v0 float[]))
  (wrap:float[]:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null float[]) : (r5v0 float[]))
 A[MD:(float[], float[], float[], float[]):void (m)] (LINE:39) call: com.okinc.liveness.lca.manager.MotionSensorManager.SensorValues.<init>(float[], float[], float[], float[]):void type: THIS */
        public /* synthetic */ SensorValues(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : fArr, (i & 2) != 0 ? null : fArr2, (i & 4) != 0 ? null : fArr3, (i & 8) != 0 ? null : fArr4);
        }
    }

    public static /* synthetic */ void startCollecting$default(MotionSensorManager motionSensorManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        motionSensorManager.startCollecting(i);
    }

    public final void startCollecting(int i) {
        Sensor sensor = this.gyroscope;
        if (sensor != null) {
            this.sensorManager.registerListener(this, sensor, i);
        }
        Sensor sensor2 = this.accelerometer;
        if (sensor2 != null) {
            this.sensorManager.registerListener(this, sensor2, i);
        }
        Sensor sensor3 = this.gravity;
        if (sensor3 != null) {
            this.sensorManager.registerListener(this, sensor3, i);
        }
        Sensor sensor4 = this.magnetometer;
        if (sensor4 != null) {
            this.sensorManager.registerListener(this, sensor4, i);
        }
    }

    public final void stopCollecting() {
        this.sensorManager.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                SensorValues sensorValues = this.currentValues;
                float[] fArr = sensorEvent.values;
                Intrinsics.checkNotNullExpressionValue(fArr, "");
                float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
                sensorValues.setAccelerometer(fArrCopyOf);
            } else if (type == 2) {
                SensorValues sensorValues2 = this.currentValues;
                float[] fArr2 = sensorEvent.values;
                Intrinsics.checkNotNullExpressionValue(fArr2, "");
                float[] fArrCopyOf2 = Arrays.copyOf(fArr2, fArr2.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf2, "");
                sensorValues2.setGeomagnetic(fArrCopyOf2);
            } else if (type == 4) {
                SensorValues sensorValues3 = this.currentValues;
                float[] fArr3 = sensorEvent.values;
                Intrinsics.checkNotNullExpressionValue(fArr3, "");
                float[] fArrCopyOf3 = Arrays.copyOf(fArr3, fArr3.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf3, "");
                sensorValues3.setGyroscope(fArrCopyOf3);
            } else if (type == 9) {
                SensorValues sensorValues4 = this.currentValues;
                float[] fArr4 = sensorEvent.values;
                Intrinsics.checkNotNullExpressionValue(fArr4, "");
                float[] fArrCopyOf4 = Arrays.copyOf(fArr4, fArr4.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf4, "");
                sensorValues4.setGravity(fArrCopyOf4);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            float[] accelerometer = this.currentValues.getAccelerometer();
            List listAkhnZx = accelerometer != null ? yDV.AkhnZx(accelerometer) : null;
            float[] gyroscope = this.currentValues.getGyroscope();
            List listAkhnZx2 = gyroscope != null ? yDV.AkhnZx(gyroscope) : null;
            float[] gravity = this.currentValues.getGravity();
            List listAkhnZx3 = gravity != null ? yDV.AkhnZx(gravity) : null;
            float[] geomagnetic = this.currentValues.getGeomagnetic();
            this._sensorReadingFlow.tryEmit(new SensorReading(jCurrentTimeMillis, listAkhnZx, listAkhnZx2, listAkhnZx3, geomagnetic != null ? yDV.AkhnZx(geomagnetic) : null, null, 32, null));
        }
    }
}
