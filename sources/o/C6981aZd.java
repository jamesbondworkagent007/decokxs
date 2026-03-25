package o;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: o.aZd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6981aZd {
    public static final C6981aZd OLrzqt = new C6981aZd();

    private C6981aZd() {
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0042 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0044 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.lang.StringBuilder */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: java.lang.Process */
    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: java.lang.Process */
    /* JADX DEBUG: Multi-variable search result rejected for r8v6, resolved type: java.lang.Process */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0063: MOVE (r6 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:31:0x0063 */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Process] */
    public final java.lang.String OLrzqt(java.lang.String str) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.IOException e;
        java.io.BufferedReader bufferedReader;
        java.io.BufferedReader bufferedReader2;
        java.io.BufferedReader bufferedReader3 = null;
        try {
            try {
                str = java.lang.Runtime.getRuntime().exec(str);
            } catch (java.io.IOException e2) {
                e = e2;
                str = 0;
                bufferedReader = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                str = 0;
            }
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(str.getInputStream()));
            } catch (java.io.IOException e3) {
                e = e3;
                bufferedReader = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (bufferedReader3 != null) {
                    bufferedReader3.close();
                }
                if (str != 0) {
                    str.destroy();
                }
                throw th;
            }
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                int i = 0;
                while (true) {
                    ?? line = bufferedReader.readLine();
                    objectRef.element = line;
                    if (line != 0) {
                        sb.append((java.lang.String) line);
                        i++;
                        if (i > 1) {
                            sb.append("\n");
                        }
                    } else {
                        java.lang.String string = sb.toString();
                        bufferedReader.close();
                        str.destroy();
                        return string;
                    }
                }
            } catch (java.io.IOException e4) {
                e = e4;
                pUU.AEQbTJ("tag", e);
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (str != 0) {
                    str.destroy();
                }
                return null;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            bufferedReader3 = bufferedReader2;
        }
    }

    public final java.lang.String copydefault() {
        java.lang.String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(java.lang.System.currentTimeMillis() - (android.os.SystemClock.elapsedRealtimeNanos() / ((long) 1000000))));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
