package com.okinc.debugbox.LDNetDiagnoService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public class LDNetTraceRoute {
    public static LDNetTraceRoute EZpvd;
    public static boolean KWHzl;
    public ActionBar OLrzqt;
    public final String copydefault = "LDNetTraceRoute";
    public boolean AEQbTJ = true;

    public interface ActionBar {
        void AEQbTJ();

        void EZpvd(String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ() {
        if (EZpvd != null) {
            EZpvd = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(ActionBar actionBar) {
        this.OLrzqt = actionBar;
    }

    public native void startJNICTraceRoute(String str);

    private LDNetTraceRoute() {
    }

    public static LDNetTraceRoute EZpvd() {
        if (EZpvd == null) {
            EZpvd = new LDNetTraceRoute();
        }
        return EZpvd;
    }

    public void copydefault(String str) throws Throwable {
        if (this.AEQbTJ && KWHzl) {
            try {
                startJNICTraceRoute(str);
                return;
            } catch (UnsatisfiedLinkError e) {
                pUU.AEQbTJ("tag", e);
                pUU.KWHzl("LDNetTraceRoute", "调用java模拟traceRoute");
                KWHzl(new TaskDescription(str, 1));
                return;
            }
        }
        KWHzl(new TaskDescription(str, 1));
    }

    static {
        try {
            System.loadLibrary("tracepath");
            KWHzl = true;
        } catch (Exception | UnsatisfiedLinkError e) {
            pUU.AEQbTJ("tag", e);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0055 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x0057 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x006e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x0003 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[Catch: Exception -> 0x0073, TRY_ENTER, TryCatch #9 {Exception -> 0x0073, blocks: (B:9:0x0047, B:33:0x0070, B:31:0x006b), top: B:47:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070 A[Catch: Exception -> 0x0073, PHI: r0 r1 r7
  0x0070: PHI (r0v8 java.lang.String) = (r0v6 java.lang.String), (r0v9 java.lang.String) binds: [B:32:0x006e, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]
  0x0070: PHI (r1v5 ??) = (r1v3 ??), (r1v11 ??) binds: [B:32:0x006e, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]
  0x0070: PHI (r7v11 ??) = (r7v9 ??), (r7v14 ??) binds: [B:32:0x006e, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #9 {Exception -> 0x0073, blocks: (B:9:0x0047, B:33:0x0070, B:31:0x006b), top: B:47:0x0003 }] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.okinc.debugbox.LDNetDiagnoService.LDNetTraceRoute$Activity] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String EZpvd(Activity activity) throws Throwable {
        Throwable th;
        Object e;
        BufferedReader bufferedReader;
        String str = "";
        ?? line = 0;
        line = 0;
        line = 0;
        line = 0;
        line = 0;
        try {
            try {
                activity = Runtime.getRuntime().exec("ping -c 1 " + activity.KWHzl());
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(activity.getInputStream()));
                } catch (IOException e2) {
                    e = e2;
                } catch (InterruptedException e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                e = e4;
                e = e;
                activity = 0;
                pUU.AEQbTJ("tag", e);
                if (line != 0) {
                }
                if (activity != 0) {
                    activity.destroy();
                }
                return str;
            } catch (InterruptedException e5) {
                e = e5;
                e = e;
                activity = 0;
                pUU.AEQbTJ("tag", e);
                if (line != 0) {
                }
                if (activity != 0) {
                }
                return str;
            } catch (Throwable th2) {
                th = th2;
                activity = 0;
            }
            while (true) {
                try {
                    line = bufferedReader.readLine();
                    if (line == 0) {
                        break;
                    }
                    str = str + line;
                } catch (IOException e6) {
                    e = e6;
                    e = e;
                    line = bufferedReader;
                    pUU.AEQbTJ("tag", e);
                    if (line != 0) {
                        line.close();
                    }
                    if (activity != 0) {
                    }
                    return str;
                } catch (InterruptedException e7) {
                    e = e7;
                    e = e;
                    line = bufferedReader;
                    pUU.AEQbTJ("tag", e);
                    if (line != 0) {
                    }
                    if (activity != 0) {
                    }
                    return str;
                } catch (Throwable th3) {
                    th = th3;
                    line = bufferedReader;
                    if (line != 0) {
                        try {
                            line.close();
                        } catch (Exception unused) {
                            throw th;
                        }
                    }
                    if (activity != 0) {
                        activity.destroy();
                    }
                    throw th;
                }
                activity.destroy();
                return str;
            }
            activity.waitFor();
            bufferedReader.close();
            activity.destroy();
            return str;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017a A[EXC_TOP_SPLITTER, PHI: r3 r4
  0x017a: PHI (r3v3 java.lang.Process) = (r3v2 java.lang.Process), (r3v7 java.lang.Process) binds: [B:53:0x0178, B:46:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x017a: PHI (r4v4 java.io.BufferedReader) = (r4v3 java.io.BufferedReader), (r4v6 java.io.BufferedReader) binds: [B:53:0x0178, B:46:0x016b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(TaskDescription taskDescription) throws Throwable {
        BufferedReader bufferedReader;
        Pattern patternCompile = Pattern.compile("(?<=From )(?:[0-9]{1,3}\\.){3}[0-9]{1,3}");
        Pattern patternCompile2 = Pattern.compile("(?<=from ).*(?=: icmp_seq=1 ttl=)");
        Pattern patternCompile3 = Pattern.compile("(?<=time=).*?ms");
        pUU.copydefault("Donald", "execTrace route");
        Process processExec = null;
        boolean z = false;
        BufferedReader bufferedReader2 = null;
        while (!z) {
            try {
                try {
                    if (taskDescription.EZpvd() >= 30) {
                        break;
                    }
                    processExec = Runtime.getRuntime().exec("ping -c 1 -t " + taskDescription.EZpvd() + " " + taskDescription.AEQbTJ());
                    bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                    String str = "";
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            str = str + line;
                        } catch (IOException e) {
                            e = e;
                            bufferedReader2 = bufferedReader;
                            pUU.AEQbTJ("tag", e);
                            if (bufferedReader2 != null) {
                            }
                            processExec.destroy();
                            this.OLrzqt.AEQbTJ();
                        } catch (InterruptedException e2) {
                            e = e2;
                            bufferedReader2 = bufferedReader;
                            pUU.AEQbTJ("tag", e);
                            if (bufferedReader2 != null) {
                            }
                            processExec.destroy();
                            this.OLrzqt.AEQbTJ();
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                    throw th;
                                }
                            }
                            processExec.destroy();
                            throw th;
                        }
                    }
                    processExec.waitFor();
                    Matcher matcher = patternCompile.matcher(str);
                    StringBuilder sb = new StringBuilder(256);
                    if (matcher.find()) {
                        String strGroup = matcher.group();
                        String strEZpvd = EZpvd(new Activity(strGroup));
                        if (strEZpvd.length() == 0) {
                            sb.append("unknown host or network error\n");
                            z = true;
                        } else {
                            Matcher matcher2 = patternCompile3.matcher(strEZpvd);
                            if (matcher2.find()) {
                                String strGroup2 = matcher2.group();
                                sb.append(taskDescription.EZpvd());
                                sb.append("\t\t");
                                sb.append(strGroup);
                                sb.append("\t\t");
                                sb.append(strGroup2);
                                sb.append("\t");
                            } else {
                                sb.append(taskDescription.EZpvd());
                                sb.append("\t\t");
                                sb.append(strGroup);
                                sb.append("\t\t timeout \t");
                            }
                            this.OLrzqt.EZpvd(sb.toString());
                            taskDescription.KWHzl(taskDescription.EZpvd() + 1);
                        }
                    } else {
                        Matcher matcher3 = patternCompile2.matcher(str);
                        if (matcher3.find()) {
                            String strGroup3 = matcher3.group();
                            Matcher matcher4 = patternCompile3.matcher(str);
                            if (matcher4.find()) {
                                String strGroup4 = matcher4.group();
                                sb.append(taskDescription.EZpvd());
                                sb.append("\t\t");
                                sb.append(strGroup3);
                                sb.append("\t\t");
                                sb.append(strGroup4);
                                sb.append("\t");
                                this.OLrzqt.EZpvd(sb.toString());
                            }
                            z = true;
                        } else {
                            if (str.length() == 0) {
                                sb.append("unknown host or network error\t");
                                z = true;
                            } else {
                                sb.append(taskDescription.EZpvd());
                                sb.append("\t\t timeout \t");
                                taskDescription.KWHzl(taskDescription.EZpvd() + 1);
                            }
                            this.OLrzqt.EZpvd(sb.toString());
                        }
                    }
                    bufferedReader2 = bufferedReader;
                } catch (IOException e3) {
                    e = e3;
                } catch (InterruptedException e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        }
        if (bufferedReader2 != null) {
            try {
                bufferedReader2.close();
            } catch (Exception unused2) {
            }
        }
        processExec.destroy();
        this.OLrzqt.AEQbTJ();
    }

    public class Activity {
        public String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String KWHzl() {
            return this.EZpvd;
        }

        public Activity(String str) {
            this.EZpvd = str;
            Matcher matcher = Pattern.compile("(?<=\\().*?(?=\\))").matcher(str);
            if (matcher.find()) {
                this.EZpvd = matcher.group();
            }
        }
    }

    public class TaskDescription {
        public final String AEQbTJ;
        public int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void KWHzl(int i) {
            this.EZpvd = i;
        }

        public TaskDescription(String str, int i) {
            this.AEQbTJ = str;
            this.EZpvd = i;
        }
    }
}
