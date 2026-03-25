package com.tencent.matrix.trace.tracer;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;
import com.tencent.matrix.util.DeviceUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC58010ytH;
import o.AbstractC58053yty;
import o.C57911yrO;
import o.C58001ysz;
import o.C58011ytI;
import o.C58013ytK;
import o.C58014ytL;
import o.C58038ytj;
import o.C58041ytm;
import o.C58043yto;
import o.C58050ytv;
import o.InterfaceC58003ytA;
import o.InterfaceC58049ytu;
import o.InterfaceC58052ytx;
import o.RunnableC58046ytr;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class FrameTracer extends AbstractC58010ytH implements Application.ActivityLifecycleCallbacks {
    public final long DbNXlk;
    public InterfaceC58052ytx OLrzqt;
    public final C58043yto copydefault;

    @Deprecated
    public StateListAnimator ejfBZ;
    public TaskDescription fJNWhG;
    public final long gEmmrt;
    public final long isConnected;
    public final long values;
    public static final int EZpvd = Build.VERSION.SDK_INT;
    public static float AEQbTJ = 60.0f;
    public double valueOf = AudioStats.AUDIO_AMPLITUDE_NONE;

    @Deprecated
    public long AYXKKw = 0;

    @Deprecated
    public final HashSet<C58050ytv> AuCTel = new HashSet<>();

    @Deprecated
    public AbstractC58053yty fetchVPNInfo = new AbstractC58053yty() { // from class: com.tencent.matrix.trace.tracer.FrameTracer.4
        @Override // o.AbstractC58053yty
        public void EZpvd(String str, long j, long j2, boolean z, long j3, long j4, long j5, long j6) throws Throwable {
            if (FrameTracer.this.AYXKKw()) {
                KWHzl(str, j, j2, z, j3, j4, j5, j6);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x011f A[Catch: all -> 0x018c, TryCatch #4 {all -> 0x018c, blocks: (B:31:0x0113, B:33:0x011f, B:47:0x0188, B:38:0x014b), top: B:69:0x0113 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x013d A[SYNTHETIC] */
        @Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void KWHzl(final String str, final long j, final long j2, final boolean z, final long j3, final long j4, final long j5, final long j6) throws Throwable {
            AnonymousClass4 anonymousClass4;
            long jCurrentTimeMillis;
            AnonymousClass4 anonymousClass42;
            Iterator it;
            C58050ytv c58050ytv;
            int i;
            char c;
            AnonymousClass4 anonymousClass43 = this;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j7 = j2 - j3;
            try {
                int i2 = (int) (j7 / FrameTracer.this.AhwBna);
                char c2 = 0;
                if (FrameTracer.this.ejfBZ != null && i2 > FrameTracer.this.KWHzl) {
                    try {
                        if (C58014ytL.copydefault() != null) {
                            FrameTracer.this.ejfBZ.OLrzqt(i2, j7, C58014ytL.copydefault());
                        }
                    } catch (Exception e) {
                        C58013ytK.OLrzqt("Matrix.FrameTracer", "dropFrameListener error e:" + e.getMessage(), new Object[0]);
                    }
                }
                FrameTracer.EZpvd(FrameTracer.this, i2);
                FrameTracer frameTracer = FrameTracer.this;
                FrameTracer.KWHzl(frameTracer, Math.max(j7, frameTracer.AhwBna));
                synchronized (FrameTracer.this.AuCTel) {
                    try {
                        Iterator it2 = FrameTracer.this.AuCTel.iterator();
                        while (it2.hasNext()) {
                            final C58050ytv c58050ytv2 = (C58050ytv) it2.next();
                            if (FrameTracer.this.copydefault.values()) {
                                c58050ytv2.EZpvd = SystemClock.uptimeMillis();
                            }
                            try {
                                if (c58050ytv2.AEQbTJ() != null) {
                                    try {
                                        if (c58050ytv2.OLrzqt() > 0) {
                                            c58050ytv2.OLrzqt(str, j, j2, i2, z, j3, j4, j5, j6);
                                            it = it2;
                                            c58050ytv = c58050ytv2;
                                            i = i2;
                                            c = c2;
                                            anonymousClass4 = anonymousClass43;
                                            if (!FrameTracer.this.copydefault.values()) {
                                                C58050ytv c58050ytv3 = c58050ytv;
                                                long jUptimeMillis = SystemClock.uptimeMillis() - c58050ytv3.EZpvd;
                                                c58050ytv3.EZpvd = jUptimeMillis;
                                                Object[] objArr = new Object[2];
                                                objArr[c] = Long.valueOf(jUptimeMillis);
                                                objArr[1] = c58050ytv3;
                                                C58013ytK.copydefault("Matrix.FrameTracer", "[notifyListener] cost:%sms listener:%s", objArr);
                                            }
                                            anonymousClass43 = anonymousClass4;
                                            it2 = it;
                                            i2 = i;
                                            c2 = c;
                                        } else {
                                            final int i3 = i2;
                                            it = it2;
                                            c58050ytv = c58050ytv2;
                                            i = i2;
                                            c = c2;
                                            c58050ytv2.AEQbTJ().execute(new Runnable() { // from class: com.tencent.matrix.trace.tracer.FrameTracer.4.3
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    c58050ytv2.AEQbTJ(str, j, j2, i3, z, j3, j4, j5, j6);
                                                }
                                            });
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        anonymousClass4 = this;
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                                            if (FrameTracer.this.copydefault.DbNXlk() && jCurrentTimeMillis > FrameTracer.this.AhwBna) {
                                                C58013ytK.AEQbTJ("Matrix.FrameTracer", "[notifyListener] warm! maybe do heavy work in doFrameSync! size:%s cost:%sms", Integer.valueOf(FrameTracer.this.AuCTel.size()), Long.valueOf(jCurrentTimeMillis));
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    it = it2;
                                    c58050ytv = c58050ytv2;
                                    i = i2;
                                    c = c2;
                                    c58050ytv.EZpvd(str, j, j2, i, z, j3, j4, j5, j6);
                                }
                                if (!FrameTracer.this.copydefault.values()) {
                                }
                                anonymousClass43 = anonymousClass4;
                                it2 = it;
                                i2 = i;
                                c2 = c;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                            anonymousClass4 = this;
                        }
                        anonymousClass42 = anonymousClass43;
                    } catch (Throwable th4) {
                        th = th4;
                        anonymousClass4 = anonymousClass43;
                    }
                }
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                if (!FrameTracer.this.copydefault.DbNXlk() || jCurrentTimeMillis3 <= FrameTracer.this.AhwBna) {
                    return;
                }
                C58013ytK.AEQbTJ("Matrix.FrameTracer", "[notifyListener] warm! maybe do heavy work in doFrameSync! size:%s cost:%sms", Integer.valueOf(FrameTracer.this.AuCTel.size()), Long.valueOf(jCurrentTimeMillis3));
            } catch (Throwable th5) {
                th = th5;
                anonymousClass4 = anonymousClass43;
                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                if (FrameTracer.this.copydefault.DbNXlk()) {
                    C58013ytK.AEQbTJ("Matrix.FrameTracer", "[notifyListener] warm! maybe do heavy work in doFrameSync! size:%s cost:%sms", Integer.valueOf(FrameTracer.this.AuCTel.size()), Long.valueOf(jCurrentTimeMillis));
                }
                throw th;
            }
        }
    };
    public int KWHzl = 0;
    public final HashSet<InterfaceC58049ytu> AkhnZx = new HashSet<>();
    public final Map<Integer, Window.OnFrameMetricsAvailableListener> djBIcL = new ConcurrentHashMap();

    @Deprecated
    public long AhwBna = RunnableC58046ytr.AEQbTJ().copydefault();

    /* JADX INFO: loaded from: classes17.dex */
    @Deprecated
    public interface StateListAnimator {
        void OLrzqt(int i, long j, String str);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public static /* synthetic */ double EZpvd(FrameTracer frameTracer, double d) {
        double d2 = frameTracer.valueOf + d;
        frameTracer.valueOf = d2;
        return d2;
    }

    public static /* synthetic */ long KWHzl(FrameTracer frameTracer, long j) {
        long j2 = frameTracer.AYXKKw + j;
        frameTracer.AYXKKw = j2;
        return j2;
    }

    public FrameTracer(C58043yto c58043yto) {
        this.copydefault = c58043yto;
        this.gEmmrt = c58043yto.AEQbTJ();
        this.values = c58043yto.EZpvd();
        this.DbNXlk = c58043yto.djBIcL();
        this.isConnected = c58043yto.AhwBna();
        C58013ytK.EZpvd("Matrix.FrameTracer", "[init] frameIntervalMs:%s isFPSEnable:%s", Long.valueOf(this.AhwBna), Boolean.valueOf(c58043yto.isConnected()));
    }

    public void EZpvd(InterfaceC58049ytu interfaceC58049ytu) {
        synchronized (this.AkhnZx) {
            this.AkhnZx.add(interfaceC58049ytu);
        }
    }

    public void OLrzqt(InterfaceC58003ytA interfaceC58003ytA) {
        TaskDescription taskDescription = this.fJNWhG;
        if (taskDescription != null) {
            taskDescription.EZpvd(interfaceC58003ytA);
        }
    }

    @Override // o.AbstractC58010ytH
    public void EZpvd() {
        super.EZpvd();
        if (this.copydefault.isConnected()) {
            AEQbTJ();
        }
    }

    public void AEQbTJ() {
        C58013ytK.EZpvd("Matrix.FrameTracer", "forceEnable", new Object[0]);
        if (EZpvd >= 24) {
            C57911yrO.EZpvd().KWHzl().registerActivityLifecycleCallbacks(this);
            TaskDescription taskDescription = new TaskDescription();
            this.fJNWhG = taskDescription;
            EZpvd(taskDescription);
            OLrzqt(new ActionBar());
            return;
        }
        RunnableC58046ytr.AEQbTJ().OLrzqt(this.fetchVPNInfo);
    }

    public class TaskDescription implements InterfaceC58049ytu {
        public final Handler AEQbTJ;
        public final HashMap<InterfaceC58003ytA, Application> KWHzl;
        public final HashMap<String, Application> copydefault;

        public TaskDescription() {
            this.AEQbTJ = new Handler(C58011ytI.copydefault().getLooper());
            this.copydefault = new HashMap<>();
            this.KWHzl = new HashMap<>();
        }

        public void EZpvd(@NonNull InterfaceC58003ytA interfaceC58003ytA) {
            synchronized (this) {
                if (interfaceC58003ytA.AEQbTJ() >= 1 && interfaceC58003ytA.KWHzl() >= 0) {
                    String strCopydefault = interfaceC58003ytA.copydefault();
                    Application application = FrameTracer.this.new Application(interfaceC58003ytA);
                    if (strCopydefault == null || strCopydefault.isEmpty()) {
                        this.KWHzl.put(interfaceC58003ytA, application);
                    } else {
                        this.copydefault.put(strCopydefault, application);
                    }
                    return;
                }
                C58013ytK.OLrzqt("Matrix.FrameTracer", "Illegal value, intervalMs=%d, threshold=%d, activity=%s", Integer.valueOf(interfaceC58003ytA.AEQbTJ()), Integer.valueOf(interfaceC58003ytA.KWHzl()), interfaceC58003ytA.getClass().getName());
            }
        }

        public void OLrzqt() {
            synchronized (this) {
                Iterator<Application> it = this.KWHzl.values().iterator();
                while (it.hasNext()) {
                    it.next().OLrzqt();
                }
                Iterator<Application> it2 = this.copydefault.values().iterator();
                while (it2.hasNext()) {
                    it2.next().OLrzqt();
                }
            }
        }

        @Override // o.InterfaceC58049ytu
        public void OLrzqt(final String str, final FrameMetrics frameMetrics, final float f, final float f2) {
            this.AEQbTJ.post(new Runnable() { // from class: com.tencent.matrix.trace.tracer.FrameTracer.TaskDescription.5
                @Override // java.lang.Runnable
                public void run() {
                    String name = str.getClass().getName();
                    synchronized (TaskDescription.this) {
                        Application application = (Application) TaskDescription.this.copydefault.get(name);
                        if (application != null) {
                            application.KWHzl(str, frameMetrics, f, f2);
                        }
                        Iterator it = TaskDescription.this.KWHzl.values().iterator();
                        while (it.hasNext()) {
                            ((Application) it.next()).KWHzl(str, frameMetrics, f, f2);
                        }
                    }
                }
            });
        }
    }

    public enum DropStatus {
        DROPPED_BEST,
        DROPPED_NORMAL,
        DROPPED_MIDDLE,
        DROPPED_HIGH,
        DROPPED_FROZEN;

        public static String stringify(int[] iArr, int[] iArr2) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            for (DropStatus dropStatus : values()) {
                sb.append('(');
                sb.append(dropStatus.name());
                sb.append("_LEVEL=");
                sb.append(iArr[dropStatus.ordinal()]);
                sb.append(" ");
                sb.append(dropStatus.name());
                sb.append("_SUM=");
                sb.append(iArr2[dropStatus.ordinal()]);
                sb.append("); ");
            }
            sb.setLength(sb.length() - 2);
            sb.append("}");
            return sb.toString();
        }
    }

    public enum FrameDuration {
        UNKNOWN_DELAY_DURATION,
        INPUT_HANDLING_DURATION,
        ANIMATION_DURATION,
        LAYOUT_MEASURE_DURATION,
        DRAW_DURATION,
        SYNC_DURATION,
        COMMAND_ISSUE_DURATION,
        SWAP_BUFFERS_DURATION,
        TOTAL_DURATION,
        GPU_DURATION;

        static final int[] indices = {0, 1, 2, 3, 4, 5, 6, 7, 8, 12};

        public static String stringify(long[] jArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            for (FrameDuration frameDuration : values()) {
                sb.append(frameDuration.name());
                sb.append('=');
                sb.append(jArr[frameDuration.ordinal()]);
                sb.append("; ");
            }
            sb.setLength(sb.length() - 2);
            sb.append("}");
            return sb.toString();
        }
    }

    public class Application {
        public long KWHzl;
        public float OLrzqt;
        public InterfaceC58003ytA djBIcL;
        public String gEmmrt;
        public float valueOf;
        public float values;
        public final long[] AYXKKw = new long[FrameDuration.values().length];
        public final int[] AEQbTJ = new int[DropStatus.values().length];
        public final int[] copydefault = new int[DropStatus.values().length];
        public int EZpvd = 0;

        public Application(InterfaceC58003ytA interfaceC58003ytA) {
            this.djBIcL = interfaceC58003ytA;
        }

        public void KWHzl(String str, FrameMetrics frameMetrics, float f, float f2) {
            if (!(this.djBIcL.EZpvd() && frameMetrics.getMetric(9) == 1) && f >= (f2 / 60.0f) * this.djBIcL.KWHzl()) {
                if (this.EZpvd == 0) {
                    this.KWHzl = SystemClock.uptimeMillis();
                }
                for (int iOrdinal = FrameDuration.UNKNOWN_DELAY_DURATION.ordinal(); iOrdinal <= FrameDuration.TOTAL_DURATION.ordinal(); iOrdinal++) {
                    long[] jArr = this.AYXKKw;
                    jArr[iOrdinal] = jArr[iOrdinal] + frameMetrics.getMetric(FrameDuration.indices[iOrdinal]);
                }
                if (FrameTracer.EZpvd >= 31) {
                    long[] jArr2 = this.AYXKKw;
                    int iOrdinal2 = FrameDuration.GPU_DURATION.ordinal();
                    jArr2[iOrdinal2] = jArr2[iOrdinal2] + frameMetrics.getMetric(12);
                }
                this.OLrzqt += f;
                OLrzqt(Math.round(f));
                this.valueOf += f2;
                this.values += Math.max(frameMetrics.getMetric(8), 1.0E9f / f2);
                this.EZpvd++;
                this.gEmmrt = str;
                if (SystemClock.uptimeMillis() - this.KWHzl >= this.djBIcL.AEQbTJ()) {
                    OLrzqt();
                }
            }
        }

        public void OLrzqt() {
            long[] jArr;
            int i = this.EZpvd;
            if (i > 20) {
                float f = i;
                this.OLrzqt /= f;
                this.valueOf /= f;
                this.values /= f;
                int i2 = 0;
                while (true) {
                    jArr = this.AYXKKw;
                    if (i2 >= jArr.length) {
                        break;
                    }
                    jArr[i2] = jArr[i2] / ((long) this.EZpvd);
                    i2++;
                }
                this.djBIcL.EZpvd(this.gEmmrt, jArr, this.AEQbTJ, this.copydefault, this.OLrzqt, this.valueOf, 1.0E9f / this.values);
            }
            EZpvd();
        }

        public final void OLrzqt(int i) {
            long j = i;
            if (j >= FrameTracer.this.gEmmrt) {
                int[] iArr = this.AEQbTJ;
                DropStatus dropStatus = DropStatus.DROPPED_FROZEN;
                int iOrdinal = dropStatus.ordinal();
                iArr[iOrdinal] = iArr[iOrdinal] + 1;
                int[] iArr2 = this.copydefault;
                int iOrdinal2 = dropStatus.ordinal();
                iArr2[iOrdinal2] = iArr2[iOrdinal2] + i;
                return;
            }
            if (j >= FrameTracer.this.values) {
                int[] iArr3 = this.AEQbTJ;
                DropStatus dropStatus2 = DropStatus.DROPPED_HIGH;
                int iOrdinal3 = dropStatus2.ordinal();
                iArr3[iOrdinal3] = iArr3[iOrdinal3] + 1;
                int[] iArr4 = this.copydefault;
                int iOrdinal4 = dropStatus2.ordinal();
                iArr4[iOrdinal4] = iArr4[iOrdinal4] + i;
                return;
            }
            if (j >= FrameTracer.this.isConnected) {
                int[] iArr5 = this.AEQbTJ;
                DropStatus dropStatus3 = DropStatus.DROPPED_MIDDLE;
                int iOrdinal5 = dropStatus3.ordinal();
                iArr5[iOrdinal5] = iArr5[iOrdinal5] + 1;
                int[] iArr6 = this.copydefault;
                int iOrdinal6 = dropStatus3.ordinal();
                iArr6[iOrdinal6] = iArr6[iOrdinal6] + i;
                return;
            }
            if (j >= FrameTracer.this.DbNXlk) {
                int[] iArr7 = this.AEQbTJ;
                DropStatus dropStatus4 = DropStatus.DROPPED_NORMAL;
                int iOrdinal7 = dropStatus4.ordinal();
                iArr7[iOrdinal7] = iArr7[iOrdinal7] + 1;
                int[] iArr8 = this.copydefault;
                int iOrdinal8 = dropStatus4.ordinal();
                iArr8[iOrdinal8] = iArr8[iOrdinal8] + i;
                return;
            }
            int[] iArr9 = this.AEQbTJ;
            DropStatus dropStatus5 = DropStatus.DROPPED_BEST;
            int iOrdinal9 = dropStatus5.ordinal();
            iArr9[iOrdinal9] = iArr9[iOrdinal9] + 1;
            int[] iArr10 = this.copydefault;
            int iOrdinal10 = dropStatus5.ordinal();
            iArr10[iOrdinal10] = iArr10[iOrdinal10] + Math.max(i, 0);
        }

        public final void EZpvd() {
            this.OLrzqt = 0.0f;
            this.valueOf = 0.0f;
            this.values = 0.0f;
            this.EZpvd = 0;
            Arrays.fill(this.AYXKKw, 0L);
            Arrays.fill(this.AEQbTJ, 0);
            Arrays.fill(this.copydefault, 0);
        }
    }

    public final float OLrzqt(Window window) {
        if (EZpvd >= 30) {
            return window.getContext().getDisplay().getRefreshRate();
        }
        return window.getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.djBIcL.containsKey(Integer.valueOf(activity.hashCode()))) {
            return;
        }
        float fOLrzqt = OLrzqt(activity.getWindow());
        AEQbTJ = fOLrzqt;
        C58013ytK.EZpvd("Matrix.FrameTracer", "default refresh rate is %dHz", Integer.valueOf((int) fOLrzqt));
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() { // from class: com.tencent.matrix.trace.tracer.FrameTracer.3
            public float copydefault;
            public float OLrzqt = FrameTracer.AEQbTJ;
            public int EZpvd = -1;
            public int AEQbTJ = -1;
            public WindowManager.LayoutParams KWHzl = null;

            {
                this.copydefault = (FrameTracer.this.KWHzl / 60.0f) * this.OLrzqt;
            }

            public final void OLrzqt(Window window) {
                if (this.KWHzl == null) {
                    this.KWHzl = window.getAttributes();
                }
                if (this.KWHzl.preferredDisplayModeId == this.EZpvd && this.AEQbTJ == FrameTracer.this.KWHzl) {
                    return;
                }
                this.EZpvd = this.KWHzl.preferredDisplayModeId;
                this.AEQbTJ = FrameTracer.this.KWHzl;
                this.OLrzqt = FrameTracer.this.OLrzqt(window);
                this.copydefault = (FrameTracer.this.KWHzl / 60.0f) * this.OLrzqt;
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                if (FrameTracer.this.AYXKKw()) {
                    for (int iOrdinal = FrameDuration.UNKNOWN_DELAY_DURATION.ordinal(); iOrdinal <= FrameDuration.TOTAL_DURATION.ordinal(); iOrdinal++) {
                        long metric = frameMetrics.getMetric(FrameDuration.indices[iOrdinal]);
                        if (metric < 0 || metric >= 4611686018427387903L) {
                            return;
                        }
                    }
                    FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
                    OLrzqt(window);
                    long metric2 = frameMetrics2.getMetric(8);
                    float f = 1.0E9f / this.OLrzqt;
                    float fMax = Math.max(0.0f, (metric2 - f) / f);
                    FrameTracer.EZpvd(FrameTracer.this, fMax);
                    if (FrameTracer.this.OLrzqt != null && fMax >= this.copydefault) {
                        FrameTracer.this.OLrzqt.OLrzqt(C58001ysz.AEQbTJ.AkhnZx(), frameMetrics2, fMax, this.OLrzqt);
                    }
                    synchronized (FrameTracer.this.AkhnZx) {
                        Iterator it = FrameTracer.this.AkhnZx.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC58049ytu) it.next()).OLrzqt(C58001ysz.AEQbTJ.AkhnZx(), frameMetrics2, fMax, this.OLrzqt);
                        }
                    }
                }
            }
        };
        this.djBIcL.put(Integer.valueOf(activity.hashCode()), onFrameMetricsAvailableListener);
        activity.getWindow().addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, C58011ytI.AEQbTJ());
        C58013ytK.EZpvd("Matrix.FrameTracer", "onActivityResumed addOnFrameMetricsAvailableListener", new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.fJNWhG.OLrzqt();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        try {
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.djBIcL.remove(Integer.valueOf(activity.hashCode())));
        } catch (Throwable th) {
            C58013ytK.OLrzqt("Matrix.FrameTracer", "removeOnFrameMetricsAvailableListener error : " + th.getMessage(), new Object[0]);
        }
    }

    public static class ActionBar implements InterfaceC58003ytA {
        @Override // o.InterfaceC58003ytA
        public int AEQbTJ() {
            return 10000;
        }

        @Override // o.InterfaceC58003ytA
        public boolean EZpvd() {
            return false;
        }

        @Override // o.InterfaceC58003ytA
        public int KWHzl() {
            return 0;
        }

        @Override // o.InterfaceC58003ytA
        public String copydefault() {
            return null;
        }

        @Override // o.InterfaceC58003ytA
        public void EZpvd(@NonNull String str, long[] jArr, int[] iArr, int[] iArr2, float f, float f2, float f3) {
            C58013ytK.EZpvd("AllSceneFrameListener", "[report] FPS:%s %s", Float.valueOf(f3), toString());
            try {
                C58041ytm c58041ytm = (C58041ytm) C57911yrO.EZpvd().copydefault(C58041ytm.class);
                if (c58041ytm == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (DropStatus dropStatus : DropStatus.values()) {
                    jSONObject.put(dropStatus.name(), iArr[dropStatus.ordinal()]);
                    jSONObject2.put(dropStatus.name(), iArr2[dropStatus.ordinal()]);
                }
                JSONObject jSONObject3 = new JSONObject();
                DeviceUtil.AEQbTJ(jSONObject3, c58041ytm.AEQbTJ());
                jSONObject3.put("scene", str);
                jSONObject3.put("dropLevel", jSONObject);
                jSONObject3.put("dropSum", jSONObject2);
                jSONObject3.put("fps", f3);
                for (FrameDuration frameDuration : FrameDuration.values()) {
                    jSONObject3.put(frameDuration.name(), jArr[frameDuration.ordinal()]);
                    if (frameDuration.equals(FrameDuration.TOTAL_DURATION)) {
                        break;
                    }
                }
                if (FrameTracer.EZpvd >= 31) {
                    jSONObject3.put("GPU_DURATION", jArr[FrameDuration.GPU_DURATION.ordinal()]);
                }
                jSONObject3.put("DROP_COUNT", Math.round(f));
                jSONObject3.put("REFRESH_RATE", (int) f2);
                C58038ytj c58038ytj = new C58038ytj();
                c58038ytj.AEQbTJ("Trace_FPS");
                c58038ytj.KWHzl(jSONObject3);
                c58041ytm.OLrzqt(c58038ytj);
            } catch (JSONException e) {
                C58013ytK.OLrzqt("AllSceneFrameListener", "json error", e);
            }
        }
    }
}
