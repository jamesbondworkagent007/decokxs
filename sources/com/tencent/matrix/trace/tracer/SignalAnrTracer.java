package com.tencent.matrix.trace.tracer;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.tencent.matrix.AppActiveMatrixDelegate;
import com.tencent.matrix.trace.constants.Constants;
import com.tencent.matrix.trace.util.AppForegroundUtil;
import com.tencent.matrix.util.DeviceUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC58010ytH;
import o.C57911yrO;
import o.C58009ytG;
import o.C58013ytK;
import o.C58014ytL;
import o.C58038ytj;
import o.C58041ytm;
import o.C58043yto;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class SignalAnrTracer extends AbstractC58010ytH {
    public static String AEQbTJ = "";
    public static long AYXKKw = 0;
    public static long AhwBna = 0;
    public static String AkhnZx = "";
    public static android.app.Application DbNXlk = null;
    public static String EZpvd = "";
    public static long KWHzl = 0;
    public static boolean OLrzqt = false;
    public static long copydefault = 20000;
    public static String djBIcL = "";
    public static String fetchVPNInfo = "";
    public static boolean gEmmrt = false;
    public static String isConnected = "";
    public static boolean valueOf = false;
    public static TaskDescription values;

    /* JADX INFO: loaded from: classes17.dex */
    public interface TaskDescription {
        void AEQbTJ(String str, String str2, long j, boolean z);

        void KWHzl(String str, String str2, String str3, Map.Entry<int[], String[]> entry);

        void OLrzqt(String str, String str2, long j, boolean z, String str3);

        void copydefault(String str);
    }

    private static native void nativeFreeSignalAnrDetective();

    private static native void nativeInitSignalAnrDetective(String str, String str2);

    private static native void nativePrintTrace();

    static {
        System.loadLibrary("trace-canary");
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class Application {
        public final Pattern AEQbTJ;
        public final Pattern AYXKKw;
        public final HashMap<Integer, TaskDescription> AhwBna;
        public boolean EZpvd;
        public String KWHzl;
        public TaskDescription OLrzqt;
        public final StringBuilder copydefault;
        public LinkedList<TaskDescription> djBIcL;

        /* JADX INFO: loaded from: classes24.dex */
        public static class TaskDescription {
            public int EZpvd;
            public String OLrzqt;
            public String copydefault;
            public int KWHzl = -1;
            public int AEQbTJ = 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String KWHzl() {
            return this.KWHzl;
        }

        private Application() {
            this.AYXKKw = Pattern.compile("^\"(.*?)\" .*? tid=(\\d+) \\w+$");
            this.AEQbTJ = Pattern.compile("^  - .*?\\(a (.*?)\\) held by thread (\\d+)$");
            this.copydefault = new StringBuilder();
            this.AhwBna = new HashMap<>();
            this.djBIcL = new LinkedList<>();
            this.KWHzl = "";
            this.EZpvd = false;
            this.OLrzqt = new TaskDescription();
        }

        public void copydefault(String str) {
            if (str.isEmpty()) {
                this.EZpvd = false;
                if (this.copydefault.length() <= 0 || this.OLrzqt.KWHzl < 0) {
                    return;
                }
                String string = this.copydefault.toString();
                TaskDescription taskDescription = this.OLrzqt;
                int i = taskDescription.EZpvd;
                if (i == 1) {
                    this.KWHzl = string;
                }
                taskDescription.copydefault = string;
                this.AhwBna.put(Integer.valueOf(i), this.OLrzqt);
                this.OLrzqt = new TaskDescription();
                return;
            }
            if (!this.EZpvd) {
                Matcher matcher = this.AYXKKw.matcher(str);
                if (matcher.find()) {
                    this.EZpvd = true;
                    this.copydefault.setLength(0);
                    StringBuilder sb = this.copydefault;
                    sb.append(str);
                    sb.append('\n');
                    try {
                        TaskDescription taskDescription2 = this.OLrzqt;
                        String strGroup = matcher.group(2);
                        Objects.requireNonNull(strGroup);
                        taskDescription2.EZpvd = Integer.parseInt(strGroup);
                        return;
                    } catch (Exception e) {
                        C58013ytK.OLrzqt("SignalAnrTracer", e.toString(), new Object[0]);
                        return;
                    }
                }
                return;
            }
            Matcher matcher2 = this.AEQbTJ.matcher(str);
            if (matcher2.find()) {
                try {
                    this.OLrzqt.OLrzqt = matcher2.group(1);
                    TaskDescription taskDescription3 = this.OLrzqt;
                    String strGroup2 = matcher2.group(2);
                    Objects.requireNonNull(strGroup2);
                    taskDescription3.KWHzl = Integer.parseInt(strGroup2);
                } catch (Exception e2) {
                    C58013ytK.OLrzqt("SignalAnrTracer", e2.toString(), new Object[0]);
                }
            }
            StringBuilder sb2 = this.copydefault;
            sb2.append(str);
            sb2.append('\n');
        }

        public boolean djBIcL() {
            copydefault("");
            return OLrzqt();
        }

        public String AEQbTJ() {
            LinkedList<TaskDescription> linkedList = this.djBIcL;
            if (linkedList != null && linkedList.size() != 0) {
                TaskDescription taskDescription = this.AhwBna.get(Integer.valueOf(this.djBIcL.get(0).EZpvd));
                if (taskDescription != null) {
                    return taskDescription.copydefault;
                }
            }
            return "";
        }

        public String copydefault() {
            LinkedList<TaskDescription> linkedList = this.djBIcL;
            if (linkedList != null && linkedList.size() != 0) {
                TaskDescription taskDescription = this.AhwBna.get(Integer.valueOf(this.djBIcL.get(r0.size() - 1).EZpvd));
                if (taskDescription != null) {
                    return taskDescription.copydefault;
                }
            }
            return "";
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static class ActionBar<F, S> implements Map.Entry<F, S> {
            public F EZpvd;
            public S OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Map.Entry
            public F getKey() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Map.Entry
            public S getValue() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Map.Entry
            public S setValue(S s) {
                this.OLrzqt = s;
                return s;
            }

            public ActionBar(F f, S s) {
                this.EZpvd = f;
                this.OLrzqt = s;
            }

            public String toString() {
                return "Pair{f=" + this.EZpvd + ", s=" + this.OLrzqt + AbstractJsonLexerKt.END_OBJ;
            }
        }

        public Map.Entry<int[], String[]> EZpvd() {
            if (this.djBIcL.size() == 0) {
                return new ActionBar(null, null);
            }
            int[] iArr = new int[this.djBIcL.size()];
            String[] strArr = new String[this.djBIcL.size()];
            int i = 0;
            for (TaskDescription taskDescription : this.djBIcL) {
                iArr[i] = taskDescription.EZpvd;
                strArr[i] = taskDescription.OLrzqt;
                i++;
            }
            return new ActionBar(iArr, strArr);
        }

        public final boolean OLrzqt() {
            TaskDescription taskDescriptionEZpvd;
            this.djBIcL.clear();
            Iterator<Map.Entry<Integer, TaskDescription>> it = this.AhwBna.entrySet().iterator();
            while (it.hasNext()) {
                TaskDescription value = it.next().getValue();
                if (value.AEQbTJ == 0 && (taskDescriptionEZpvd = EZpvd(value)) != null) {
                    while (this.djBIcL.size() > 0 && this.djBIcL.getFirst() != taskDescriptionEZpvd) {
                        this.djBIcL.removeFirst();
                    }
                    return true;
                }
            }
            return false;
        }

        public final TaskDescription EZpvd(TaskDescription taskDescription) {
            TaskDescription taskDescriptionEZpvd;
            this.djBIcL.addLast(taskDescription);
            taskDescription.AEQbTJ = 1;
            TaskDescription taskDescription2 = this.AhwBna.get(Integer.valueOf(taskDescription.KWHzl));
            if (taskDescription2 != null) {
                int i = taskDescription2.AEQbTJ;
                if (i == 1) {
                    return taskDescription2;
                }
                if (i == 0 && (taskDescriptionEZpvd = EZpvd(taskDescription2)) != null) {
                    return taskDescriptionEZpvd;
                }
            }
            taskDescription.AEQbTJ = 2;
            this.djBIcL.removeLast();
            return null;
        }
    }

    @Override // o.AbstractC58010ytH
    public void EZpvd() {
        super.EZpvd();
        if (gEmmrt) {
            return;
        }
        nativeInitSignalAnrDetective(isConnected, fetchVPNInfo);
        AppForegroundUtil.INSTANCE.init();
        gEmmrt = true;
    }

    public SignalAnrTracer(C58043yto c58043yto) {
        valueOf = true;
        isConnected = c58043yto.AEQbTJ;
        fetchVPNInfo = c58043yto.fJNWhG;
    }

    public static String valueOf() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/cgroup")));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append("\n");
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public static void AhwBna(final boolean z) {
        C58013ytK.EZpvd("SignalAnrTracer", "confirmRealAnr, isSigQuit = " + z, new Object[0]);
        if (OLrzqt()) {
            AEQbTJ(false, z);
        } else {
            new Thread(new Runnable() { // from class: com.tencent.matrix.trace.tracer.SignalAnrTracer.4
                @Override // java.lang.Runnable
                public void run() {
                    SignalAnrTracer.EZpvd(z);
                }
            }, "Check-ANR-State-Thread").start();
        }
    }

    private static void onANRDumped() {
        synchronized (SignalAnrTracer.class) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new Runnable() { // from class: com.tencent.matrix.trace.tracer.SignalAnrTracer.1
                @Override // java.lang.Runnable
                public void run() {
                    long unused = SignalAnrTracer.AYXKKw = System.currentTimeMillis();
                    C58013ytK.EZpvd("SignalAnrTracer", "onANRDumped", new Object[0]);
                    String unused2 = SignalAnrTracer.AkhnZx = C58009ytG.OLrzqt();
                    C58013ytK.EZpvd("SignalAnrTracer", "onANRDumped, stackTrace = %s, duration = %d", SignalAnrTracer.AkhnZx, Long.valueOf(System.currentTimeMillis() - SignalAnrTracer.AYXKKw));
                    String unused3 = SignalAnrTracer.AEQbTJ = SignalAnrTracer.valueOf();
                    C58013ytK.EZpvd("SignalAnrTracer", "onANRDumped, read cgroup duration = %d", Long.valueOf(System.currentTimeMillis() - SignalAnrTracer.AYXKKw));
                    boolean unused4 = SignalAnrTracer.OLrzqt = AppForegroundUtil.isInterestingToUser();
                    C58013ytK.EZpvd("SignalAnrTracer", "onANRDumped, isInterestingToUser duration = %d", Long.valueOf(System.currentTimeMillis() - SignalAnrTracer.AYXKKw));
                    SignalAnrTracer.AhwBna(true);
                    countDownLatch.countDown();
                }
            }, "ANR-Dump-Thread").start();
            try {
                countDownLatch.await(copydefault, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    private static void onANRDumpTrace() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(isConnected)), C.UTF8_NAME));
            try {
                Application application = new Application();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    application.copydefault(line);
                    C58013ytK.EZpvd("SignalAnrTracer", line, new Object[0]);
                }
                if (values != null) {
                    if (application.djBIcL()) {
                        values.KWHzl(application.KWHzl(), application.AEQbTJ(), application.copydefault(), application.EZpvd());
                    } else if (application.KWHzl().contains("android.os.MessageQueue.nativePollOnce")) {
                        values.copydefault(application.KWHzl());
                    }
                }
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                C58013ytK.OLrzqt("SignalAnrTracer", "printFileByLine failed e : " + th.getMessage(), new Object[0]);
            } catch (Throwable th2) {
                C58013ytK.OLrzqt("SignalAnrTracer", "onANRDumpTrace error: %s", th2.getMessage());
            }
        }
    }

    private static void onPrintTrace() {
        try {
            C58014ytL.KWHzl("SignalAnrTracer", fetchVPNInfo);
        } catch (Throwable th) {
            C58013ytK.OLrzqt("SignalAnrTracer", "onPrintTrace error: %s", th.getMessage());
        }
    }

    private static void onNativeBacktraceDumped() {
        C58013ytK.EZpvd("SignalAnrTracer", "happens onNativeBacktraceDumped", new Object[0]);
        if (System.currentTimeMillis() - AhwBna < SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US) {
            C58013ytK.EZpvd("SignalAnrTracer", "report SIGQUIT recently, just return", new Object[0]);
            return;
        }
        djBIcL = C58009ytG.OLrzqt();
        C58013ytK.EZpvd("SignalAnrTracer", "happens onNativeBacktraceDumped, mainThreadStackTrace = " + AkhnZx, new Object[0]);
        AhwBna(false);
    }

    public static void AEQbTJ(boolean z, boolean z2) {
        TaskDescription taskDescription;
        try {
            try {
                taskDescription = values;
            } catch (JSONException e) {
                C58013ytK.OLrzqt("SignalAnrTracer", "[JSONException error: %s", e);
            }
            if (taskDescription == null) {
                C58041ytm c58041ytm = (C58041ytm) C57911yrO.EZpvd().copydefault(C58041ytm.class);
                if (c58041ytm != null) {
                    String visibleScene = AppActiveMatrixDelegate.INSTANCE.getVisibleScene();
                    JSONObject jSONObjectAEQbTJ = DeviceUtil.AEQbTJ(new JSONObject(), C57911yrO.EZpvd().KWHzl());
                    if (z2) {
                        jSONObjectAEQbTJ.put("detail", Constants.Type.SIGNAL_ANR);
                        jSONObjectAEQbTJ.put("threadStack", AkhnZx);
                    } else {
                        jSONObjectAEQbTJ.put("detail", Constants.Type.SIGNAL_ANR_NATIVE_BACKTRACE);
                        jSONObjectAEQbTJ.put("threadStack", djBIcL);
                    }
                    jSONObjectAEQbTJ.put("scene", visibleScene);
                    jSONObjectAEQbTJ.put("isProcessForeground", OLrzqt);
                    C58038ytj c58038ytj = new C58038ytj();
                    c58038ytj.AEQbTJ("Trace_EvilMethod");
                    c58038ytj.KWHzl(jSONObjectAEQbTJ);
                    c58041ytm.OLrzqt(c58038ytj);
                    C58013ytK.OLrzqt("SignalAnrTracer", "happens real ANR : %s ", jSONObjectAEQbTJ.toString());
                }
            } else if (z2) {
                taskDescription.OLrzqt(AkhnZx, EZpvd, KWHzl, z, AEQbTJ);
            } else {
                taskDescription.AEQbTJ(djBIcL, EZpvd, KWHzl, z);
            }
        } finally {
            AhwBna = System.currentTimeMillis();
        }
    }

    public static boolean OLrzqt() {
        Message message;
        try {
            MessageQueue queue = Looper.getMainLooper().getQueue();
            Field declaredField = queue.getClass().getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            message = (Message) declaredField.get(queue);
        } catch (Exception unused) {
        }
        if (message != null) {
            EZpvd = message.toString();
            C58013ytK.EZpvd("SignalAnrTracer", "anrMessageString = " + EZpvd, new Object[0]);
            long when = message.getWhen();
            if (when == 0) {
                return false;
            }
            long jUptimeMillis = when - SystemClock.uptimeMillis();
            KWHzl = jUptimeMillis;
            return jUptimeMillis < (OLrzqt ? -2000L : -10000L);
        }
        C58013ytK.EZpvd("SignalAnrTracer", "mMessage is null", new Object[0]);
        return false;
    }

    public static void EZpvd(boolean z) {
        int i = 0;
        while (i < 40) {
            i++;
            try {
                if (KWHzl()) {
                    AEQbTJ(true, z);
                    return;
                }
                Thread.sleep(500L);
            } catch (Throwable th) {
                C58013ytK.OLrzqt("SignalAnrTracer", "checkErrorStateCycle error, e : " + th.getMessage(), new Object[0]);
                return;
            }
        }
    }

    public static boolean KWHzl() {
        try {
            C58013ytK.EZpvd("SignalAnrTracer", "[checkErrorState] start", new Object[0]);
            android.app.Application applicationKWHzl = DbNXlk;
            if (applicationKWHzl == null) {
                applicationKWHzl = C57911yrO.EZpvd().KWHzl();
            }
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = ((ActivityManager) applicationKWHzl.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY)).getProcessesInErrorState();
            if (processesInErrorState == null) {
                C58013ytK.EZpvd("SignalAnrTracer", "[checkErrorState] procs == null", new Object[0]);
                return false;
            }
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                C58013ytK.EZpvd("SignalAnrTracer", "[checkErrorState] found Error State proccessName = %s, proc.condition = %d", processErrorStateInfo.processName, Integer.valueOf(processErrorStateInfo.condition));
                if (processErrorStateInfo.uid != Process.myUid() && processErrorStateInfo.condition == 2) {
                    C58013ytK.EZpvd("SignalAnrTracer", "maybe received other apps ANR signal", new Object[0]);
                    return false;
                }
                if (processErrorStateInfo.pid == Process.myPid() && processErrorStateInfo.condition == 2) {
                    C58013ytK.EZpvd("SignalAnrTracer", "error sate longMsg = %s", processErrorStateInfo.longMsg);
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C58013ytK.OLrzqt("SignalAnrTracer", "[checkErrorState] error : %s", th.getMessage());
            return false;
        }
    }
}
