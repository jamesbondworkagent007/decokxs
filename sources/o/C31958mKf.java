package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.mKf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C31958mKf {
    public final int EZpvd;
    public Activity copydefault;

    /* JADX INFO: renamed from: o.mKf$Activity */
    public interface Activity {
        void OLrzqt(java.lang.String str);
    }

    public C31958mKf(Activity activity, int i) {
        this.copydefault = activity;
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [69=4] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0069 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0085 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x0099 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x000c */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r2 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r2 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4 A[Catch: Exception -> 0x00a7, TRY_LEAVE, TryCatch #9 {Exception -> 0x00a7, blocks: (B:48:0x009f, B:50:0x00a4), top: B:59:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(TaskDescription taskDescription, boolean z) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.lang.Process processExec;
        java.lang.String bufferedReader = z ? "ping -s 8185 -c  " : "ping -c ";
        java.lang.String str = "";
        java.lang.Process process = null;
         = 0;
        process = null;
        process = null;
        ?? r2 = 0;
        try {
            try {
                try {
                    processExec = java.lang.Runtime.getRuntime().exec(bufferedReader + this.EZpvd + " " + taskDescription.AEQbTJ());
                    try {
                        bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(processExec.getInputStream()));
                    } catch (java.io.IOException e) {
                        process = processExec;
                        e = e;
                        bufferedReader = 0;
                    } catch (java.lang.Exception e2) {
                        process = processExec;
                        e = e2;
                        bufferedReader = 0;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (r2 != 0) {
                            try {
                                r2.close();
                            } catch (java.lang.Exception unused) {
                                throw th;
                            }
                        }
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        throw th;
                    }
                } catch (java.io.IOException e3) {
                    e = e3;
                    bufferedReader = 0;
                } catch (java.lang.Exception e4) {
                    e = e4;
                    bufferedReader = 0;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    processExec = null;
                }
            } catch (java.lang.Exception unused2) {
            }
            while (true) {
                try {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    str = str + line;
                } catch (java.io.IOException e5) {
                    process = processExec;
                    e = e5;
                    bufferedReader = bufferedReader;
                    pUU.AEQbTJ("tag", e);
                    if (bufferedReader != 0) {
                        bufferedReader.close();
                    }
                } catch (java.lang.Exception e6) {
                    process = processExec;
                    e = e6;
                    bufferedReader = bufferedReader;
                    pUU.AEQbTJ("tag", e);
                    if (bufferedReader != 0) {
                        bufferedReader.close();
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    process = processExec;
                    processExec = process;
                    r2 = bufferedReader;
                    th = th;
                    if (r2 != 0) {
                    }
                    if (processExec != null) {
                    }
                    throw th;
                }
                processExec.destroy();
                return str;
            }
            processExec.waitFor();
            bufferedReader.close();
            processExec.destroy();
            return str;
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
    }

    public void EZpvd(java.lang.String str, boolean z) throws java.lang.Throwable {
        TaskDescription taskDescription = new TaskDescription(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(256);
        java.lang.String strEZpvd = EZpvd(taskDescription, z);
        if (Pattern.compile("(?<=from ).*(?=: icmp_seq=1 ttl=)").matcher(strEZpvd).find()) {
            pUU.KWHzl("LDNetPing", "status" + strEZpvd);
            sb.append("\t" + strEZpvd);
        } else if (strEZpvd.length() == 0) {
            sb.append("unknown host or network error");
        } else {
            sb.append("timeout");
        }
        this.copydefault.OLrzqt(C31965mKm.AEQbTJ(str, sb.toString()));
    }

    /* JADX INFO: renamed from: o.mKf$TaskDescription */
    public class TaskDescription {
        public java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        public TaskDescription(java.lang.String str) {
            this.KWHzl = str;
            Matcher matcher = Pattern.compile("(?<=\\().*?(?=\\))").matcher(str);
            if (matcher.find()) {
                this.KWHzl = matcher.group();
            }
        }
    }
}
