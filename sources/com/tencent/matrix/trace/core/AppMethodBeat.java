package com.tencent.matrix.trace.core;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.C58001ysz;
import o.C58009ytG;
import o.C58011ytI;
import o.C58013ytK;
import o.C58044ytp;
import o.C58045ytq;
import o.InterfaceC58048ytt;
import o.InterfaceC58051ytw;

/* JADX INFO: loaded from: classes12.dex */
public class AppMethodBeat {
    public static final int METHOD_ID_DISPATCH = 1048574;
    private static final int METHOD_ID_MAX = 1048575;
    private static final int STATUS_DEFAULT = Integer.MAX_VALUE;
    private static final int STATUS_EXPIRED_START = -2;
    private static final int STATUS_OUT_RELEASE = -3;
    private static final int STATUS_READY = 1;
    private static final int STATUS_STARTED = 2;
    private static final int STATUS_STOPPED = -1;
    private static final String TAG = "Matrix.AppMethodBeat";
    public static boolean isDev = false;
    private static TaskDescription sIndexRecordHead;
    public static StateListAnimator sMethodEnterListener;
    private static Runnable sUpdateDiffTimeRunnable;
    private static AppMethodBeat sInstance = new AppMethodBeat();
    private static volatile int status = Integer.MAX_VALUE;
    private static final Object statusLock = new Object();
    private static long[] sBuffer = new long[1000000];
    private static int sIndex = 0;
    private static int sLastIndex = -1;
    private static boolean assertIn = false;
    private static volatile long sCurrentDiffTime = SystemClock.uptimeMillis();
    private static volatile long sDiffTime = sCurrentDiffTime;
    private static long sMainThreadId = Looper.getMainLooper().getThread().getId();
    private static HandlerThread sTimerUpdateThread = C58011ytI.AEQbTJ("matrix_time_update_thread", 3);
    private static Handler sHandler = new Handler(sTimerUpdateThread.getLooper());
    private static Set<String> sFocusActivitySet = new HashSet();
    private static final HashSet<InterfaceC58048ytt> listeners = new HashSet<>();
    private static final Object updateTimeLock = new Object();
    private static volatile boolean isPauseUpdateTime = false;
    private static Runnable checkStartExpiredRunnable = null;
    private static InterfaceC58051ytw looperMonitorListener = new InterfaceC58051ytw() { // from class: com.tencent.matrix.trace.core.AppMethodBeat.4
        @Override // o.InterfaceC58051ytw
        public boolean OLrzqt() {
            return AppMethodBeat.status >= 1;
        }

        @Override // o.InterfaceC58051ytw
        public void KWHzl(String str) {
            AppMethodBeat.dispatchBegin();
        }

        @Override // o.InterfaceC58051ytw
        public void KWHzl(String str, long j, long j2) {
            AppMethodBeat.dispatchEnd();
        }
    };
    private static Runnable realReleaseRunnable = new Runnable() { // from class: com.tencent.matrix.trace.core.AppMethodBeat.5
        @Override // java.lang.Runnable
        public void run() {
            AppMethodBeat.realRelease();
        }
    };

    /* JADX INFO: loaded from: classes17.dex */
    public interface StateListAnimator {
        void EZpvd(int i, long j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void dispatchEnd() {
        isPauseUpdateTime = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long getDiffTime() {
        return sDiffTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AppMethodBeat getInstance() {
        return sInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isRealTrace() {
        return status >= 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAlive() {
        return status >= 2;
    }

    static {
        C58011ytI.AEQbTJ().postDelayed(realReleaseRunnable, WorkRequest.MIN_BACKOFF_MILLIS);
        sUpdateDiffTimeRunnable = new Runnable() { // from class: com.tencent.matrix.trace.core.AppMethodBeat.3
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        if (!AppMethodBeat.isPauseUpdateTime && AppMethodBeat.status > -1) {
                            long unused = AppMethodBeat.sCurrentDiffTime = SystemClock.uptimeMillis() - AppMethodBeat.sDiffTime;
                            SystemClock.sleep(5L);
                        } else {
                            synchronized (AppMethodBeat.updateTimeLock) {
                                AppMethodBeat.updateTimeLock.wait();
                            }
                        }
                    } catch (Exception e) {
                        C58013ytK.OLrzqt(AppMethodBeat.TAG, "" + e.toString(), new Object[0]);
                        return;
                    }
                }
            }
        };
        sIndexRecordHead = null;
    }

    public void onStart() {
        synchronized (statusLock) {
            if (status >= 2 || status < -2) {
                C58013ytK.AEQbTJ(TAG, "[onStart] current status:%s", Integer.valueOf(status));
            } else {
                sHandler.removeCallbacks(checkStartExpiredRunnable);
                C58011ytI.AEQbTJ().removeCallbacks(realReleaseRunnable);
                if (sBuffer == null) {
                    throw new RuntimeException("Matrix.AppMethodBeat sBuffer == null");
                }
                C58013ytK.EZpvd(TAG, "[onStart] preStatus:%s", Integer.valueOf(status), C58009ytG.AEQbTJ());
                status = 2;
            }
        }
    }

    public void onStop() {
        synchronized (statusLock) {
            if (status == 2) {
                C58013ytK.EZpvd(TAG, "[onStop] %s", C58009ytG.AEQbTJ());
                status = -1;
            } else {
                C58013ytK.AEQbTJ(TAG, "[onStop] current status:%s", Integer.valueOf(status));
            }
        }
    }

    public void forceStop() {
        synchronized (statusLock) {
            status = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void realRelease() {
        synchronized (statusLock) {
            if (status == Integer.MAX_VALUE || status <= 1) {
                C58013ytK.EZpvd(TAG, "[realRelease] timestamp:%s", Long.valueOf(System.currentTimeMillis()));
                sHandler.removeCallbacksAndMessages(null);
                C58044ytp.copydefault(looperMonitorListener);
                sTimerUpdateThread.quit();
                sBuffer = null;
                status = -3;
            }
        }
    }

    private static void realExecute() {
        C58013ytK.EZpvd(TAG, "[realExecute] timestamp:%s", Long.valueOf(System.currentTimeMillis()));
        sCurrentDiffTime = SystemClock.uptimeMillis() - sDiffTime;
        sHandler.removeCallbacksAndMessages(null);
        sHandler.postDelayed(sUpdateDiffTimeRunnable, 5L);
        Handler handler = sHandler;
        Runnable runnable = new Runnable() { // from class: com.tencent.matrix.trace.core.AppMethodBeat.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (AppMethodBeat.statusLock) {
                    C58013ytK.EZpvd(AppMethodBeat.TAG, "[startExpired] timestamp:%s status:%s", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(AppMethodBeat.status));
                    if (AppMethodBeat.status == Integer.MAX_VALUE || AppMethodBeat.status == 1) {
                        int unused = AppMethodBeat.status = -2;
                    }
                }
            }
        };
        checkStartExpiredRunnable = runnable;
        handler.postDelayed(runnable, WorkRequest.MIN_BACKOFF_MILLIS);
        C58045ytq.AEQbTJ();
        C58044ytp.AEQbTJ(looperMonitorListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dispatchBegin() {
        sCurrentDiffTime = SystemClock.uptimeMillis() - sDiffTime;
        isPauseUpdateTime = false;
        Object obj = updateTimeLock;
        synchronized (obj) {
            obj.notify();
        }
    }

    public static void i(int i) {
        if (status > -1 && i < METHOD_ID_MAX) {
            if (status == Integer.MAX_VALUE) {
                synchronized (statusLock) {
                    if (status == Integer.MAX_VALUE) {
                        realExecute();
                        status = 1;
                    }
                }
            }
            long id = Thread.currentThread().getId();
            StateListAnimator stateListAnimator = sMethodEnterListener;
            if (stateListAnimator != null) {
                stateListAnimator.EZpvd(i, id);
            }
            if (id != sMainThreadId || assertIn) {
                return;
            }
            assertIn = true;
            int i2 = sIndex;
            if (i2 < 1000000) {
                mergeData(i, i2, true);
            } else {
                sIndex = 0;
                mergeData(i, 0, true);
            }
            sIndex++;
            assertIn = false;
        }
    }

    public static void o(int i) {
        if (status > -1 && i < METHOD_ID_MAX && Thread.currentThread().getId() == sMainThreadId) {
            int i2 = sIndex;
            if (i2 < 1000000) {
                mergeData(i, i2, false);
            } else {
                sIndex = 0;
                mergeData(i, 0, false);
            }
            sIndex++;
        }
    }

    public static void at(Activity activity, boolean z) {
        String name = activity.getClass().getName();
        if (z) {
            if (sFocusActivitySet.add(name)) {
                HashSet<InterfaceC58048ytt> hashSet = listeners;
                synchronized (hashSet) {
                    Iterator<InterfaceC58048ytt> it = hashSet.iterator();
                    while (it.hasNext()) {
                        it.next().copydefault(activity);
                    }
                }
                C58013ytK.EZpvd(TAG, "[at] visibleScene[%s] has %s focus!", getVisibleScene(), "attach");
                return;
            }
            return;
        }
        if (sFocusActivitySet.remove(name)) {
            C58013ytK.EZpvd(TAG, "[at] visibleScene[%s] has %s focus!", getVisibleScene(), "detach");
        }
    }

    public static String getVisibleScene() {
        return C58001ysz.AEQbTJ.AkhnZx();
    }

    private static void mergeData(int i, int i2, boolean z) {
        if (i == 1048574) {
            sCurrentDiffTime = SystemClock.uptimeMillis() - sDiffTime;
        }
        try {
            sBuffer[i2] = (z ? Long.MIN_VALUE : 0L) | (((long) i) << 43) | (8796093022207L & sCurrentDiffTime);
            checkPileup(i2);
            sLastIndex = i2;
        } catch (Throwable th) {
            C58013ytK.OLrzqt(TAG, th.getMessage(), new Object[0]);
        }
    }

    public void addListener(InterfaceC58048ytt interfaceC58048ytt) {
        HashSet<InterfaceC58048ytt> hashSet = listeners;
        synchronized (hashSet) {
            hashSet.add(interfaceC58048ytt);
        }
    }

    public void removeListener(InterfaceC58048ytt interfaceC58048ytt) {
        HashSet<InterfaceC58048ytt> hashSet = listeners;
        synchronized (hashSet) {
            hashSet.remove(interfaceC58048ytt);
        }
    }

    public TaskDescription maskIndex(String str) {
        if (sIndexRecordHead == null) {
            TaskDescription taskDescription = new TaskDescription(sIndex - 1);
            sIndexRecordHead = taskDescription;
            taskDescription.OLrzqt = str;
            return taskDescription;
        }
        TaskDescription taskDescription2 = new TaskDescription(sIndex - 1);
        taskDescription2.OLrzqt = str;
        TaskDescription taskDescription3 = null;
        for (TaskDescription taskDescription4 = sIndexRecordHead; taskDescription4 != null; taskDescription4 = taskDescription4.KWHzl) {
            if (taskDescription2.copydefault <= taskDescription4.copydefault) {
                if (taskDescription3 == null) {
                    TaskDescription taskDescription5 = sIndexRecordHead;
                    sIndexRecordHead = taskDescription2;
                    taskDescription2.KWHzl = taskDescription5;
                } else {
                    TaskDescription taskDescription6 = taskDescription3.KWHzl;
                    taskDescription3.KWHzl = taskDescription2;
                    taskDescription2.KWHzl = taskDescription6;
                }
                return taskDescription2;
            }
            taskDescription3 = taskDescription4;
        }
        taskDescription3.KWHzl = taskDescription2;
        return taskDescription2;
    }

    private static void checkPileup(int i) {
        TaskDescription taskDescription = sIndexRecordHead;
        while (taskDescription != null) {
            int i2 = taskDescription.copydefault;
            if (i2 != i && (i2 != -1 || sLastIndex != 999999)) {
                return;
            }
            taskDescription.EZpvd = false;
            C58013ytK.AEQbTJ(TAG, "[checkPileup] %s", taskDescription.toString());
            taskDescription = taskDescription.KWHzl;
            sIndexRecordHead = taskDescription;
        }
    }

    public static final class TaskDescription {
        public boolean EZpvd = false;
        public TaskDescription KWHzl;
        public String OLrzqt;
        public int copydefault;

        public TaskDescription(int i) {
            this.copydefault = i;
        }

        public TaskDescription() {
        }

        public void OLrzqt() {
            this.EZpvd = false;
            TaskDescription taskDescription = null;
            for (TaskDescription taskDescription2 = AppMethodBeat.sIndexRecordHead; taskDescription2 != null; taskDescription2 = taskDescription2.KWHzl) {
                if (taskDescription2 == this) {
                    if (taskDescription != null) {
                        taskDescription.KWHzl = taskDescription2.KWHzl;
                    } else {
                        TaskDescription unused = AppMethodBeat.sIndexRecordHead = taskDescription2.KWHzl;
                    }
                    taskDescription2.KWHzl = null;
                    return;
                }
                taskDescription = taskDescription2;
            }
        }

        public String toString() {
            return "index:" + this.copydefault + ",\tisValid:" + this.EZpvd + " source:" + this.OLrzqt;
        }
    }

    public long[] copyData(TaskDescription taskDescription) {
        return copyData(taskDescription, new TaskDescription(sIndex - 1));
    }

    private long[] copyData(TaskDescription taskDescription, TaskDescription taskDescription2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long[] jArr = new long[0];
        try {
            if (!taskDescription.EZpvd || !taskDescription2.EZpvd) {
                C58013ytK.EZpvd(TAG, "[copyData] [%s:%s] length:%s cost:%sms", Integer.valueOf(Math.max(0, taskDescription.copydefault)), Integer.valueOf(taskDescription2.copydefault), 0, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                return jArr;
            }
            int iMax = Math.max(0, taskDescription.copydefault);
            int iMax2 = Math.max(0, taskDescription2.copydefault);
            if (iMax2 > iMax) {
                int i = (iMax2 - iMax) + 1;
                jArr = new long[i];
                System.arraycopy(sBuffer, iMax, jArr, 0, i);
            } else if (iMax2 < iMax) {
                int i2 = iMax2 + 1;
                long[] jArr2 = sBuffer;
                jArr = new long[(jArr2.length - iMax) + i2];
                System.arraycopy(jArr2, iMax, jArr, 0, jArr2.length - iMax);
                long[] jArr3 = sBuffer;
                System.arraycopy(jArr3, 0, jArr, jArr3.length - iMax, i2);
            }
            return jArr;
        } catch (Throwable th) {
            try {
                C58013ytK.OLrzqt(TAG, th.toString(), new Object[0]);
                return jArr;
            } finally {
                C58013ytK.EZpvd(TAG, "[copyData] [%s:%s] length:%s cost:%sms", Integer.valueOf(Math.max(0, taskDescription.copydefault)), Integer.valueOf(taskDescription2.copydefault), Integer.valueOf(jArr.length), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }
        }
    }

    public void printIndexRecord() {
        StringBuilder sb = new StringBuilder(" \n");
        for (TaskDescription taskDescription = sIndexRecordHead; taskDescription != null; taskDescription = taskDescription.KWHzl) {
            sb.append(taskDescription);
            sb.append("\n");
        }
        C58013ytK.EZpvd(TAG, "[printIndexRecord] %s", sb.toString());
    }
}
