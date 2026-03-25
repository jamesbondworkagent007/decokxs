package o;

import androidx.camera.core.RetryPolicy;
import com.tencent.matrix.AppActiveMatrixDelegate;
import com.tencent.matrix.trace.constants.Constants;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.util.DeviceUtil;
import java.lang.Thread;
import java.util.LinkedList;
import o.C58007ytE;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ytC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58005ytC extends AbstractC58010ytH implements InterfaceC58051ytw {
    public final boolean AEQbTJ;
    public final C58043yto AhwBna;
    public android.os.Handler EZpvd;
    public android.os.Handler copydefault;
    public final Activity OLrzqt = new Activity();
    public final TaskDescription KWHzl = new TaskDescription();

    @Override // o.InterfaceC58051ytw
    public boolean OLrzqt() {
        return true;
    }

    public C58005ytC(C58043yto c58043yto) {
        this.AhwBna = c58043yto;
        this.AEQbTJ = c58043yto.gEmmrt();
    }

    @Override // o.AbstractC58010ytH
    public void EZpvd() {
        super.EZpvd();
        if (this.AEQbTJ) {
            C58044ytp.AEQbTJ(this);
            this.copydefault = new android.os.Handler(C58011ytI.AEQbTJ().getLooper());
            this.EZpvd = new android.os.Handler(C58011ytI.AEQbTJ().getLooper());
        }
    }

    @Override // o.InterfaceC58051ytw
    public void KWHzl(java.lang.String str) {
        this.OLrzqt.KWHzl = AppMethodBeat.getInstance().maskIndex("AnrTracer#dispatchBegin");
        if (this.AhwBna.values()) {
            C58013ytK.KWHzl("Matrix.AnrTracer", "* [dispatchBegin] index:%s", java.lang.Integer.valueOf(this.OLrzqt.KWHzl.copydefault));
        }
        this.copydefault.postDelayed(this.OLrzqt, 5000L);
        this.EZpvd.postDelayed(this.KWHzl, 2000L);
    }

    @Override // o.InterfaceC58051ytw
    public void KWHzl(java.lang.String str, long j, long j2) {
        if (this.AhwBna.values()) {
            C58013ytK.KWHzl("Matrix.AnrTracer", "[dispatchEnd] beginNs:%s endNs:%s cost:%sms", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Long.valueOf((j2 - j) / 1000000));
        }
        this.OLrzqt.KWHzl().OLrzqt();
        this.copydefault.removeCallbacks(this.OLrzqt);
        this.EZpvd.removeCallbacks(this.KWHzl);
    }

    /* JADX INFO: renamed from: o.ytC$TaskDescription */
    public class TaskDescription implements java.lang.Runnable {
        public TaskDescription() {
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.String visibleScene = AppActiveMatrixDelegate.INSTANCE.getVisibleScene();
            boolean zAYXKKw = C58005ytC.this.AYXKKw();
            try {
                C58041ytm c58041ytm = (C58041ytm) C57911yrO.EZpvd().copydefault(C58041ytm.class);
                if (c58041ytm == null) {
                    return;
                }
                java.lang.String strOLrzqt = C58009ytG.OLrzqt(android.os.Looper.getMainLooper().getThread().getStackTrace());
                JSONObject jSONObject = new JSONObject();
                DeviceUtil.AEQbTJ(jSONObject, C57911yrO.EZpvd().KWHzl());
                jSONObject.put("detail", Constants.Type.LAG);
                jSONObject.put("scene", visibleScene);
                jSONObject.put("threadStack", strOLrzqt);
                jSONObject.put("isProcessForeground", zAYXKKw);
                C58038ytj c58038ytj = new C58038ytj();
                c58038ytj.AEQbTJ("Trace_EvilMethod");
                c58038ytj.KWHzl(jSONObject);
                c58041ytm.OLrzqt(c58038ytj);
                C58013ytK.OLrzqt("Matrix.AnrTracer", "happens lag : %s, scene : %s ", strOLrzqt, visibleScene);
            } catch (JSONException e) {
                C58013ytK.OLrzqt("Matrix.AnrTracer", "[JSONException error: %s", e);
            }
        }
    }

    /* JADX INFO: renamed from: o.ytC$Activity */
    public class Activity implements java.lang.Runnable {
        public AppMethodBeat.TaskDescription KWHzl;
        public long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AppMethodBeat.TaskDescription KWHzl() {
            return this.KWHzl;
        }

        public Activity() {
        }

        @Override // java.lang.Runnable
        public void run() {
            java.lang.String strCopydefault;
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            boolean zAYXKKw = C58005ytC.this.AYXKKw();
            int[] iArrEZpvd = C58009ytG.EZpvd(android.os.Process.myPid());
            long[] jArrCopyData = AppMethodBeat.getInstance().copyData(this.KWHzl);
            this.KWHzl.OLrzqt();
            java.lang.String visibleScene = AppActiveMatrixDelegate.INSTANCE.getVisibleScene();
            long[] jArrKWHzl = C58005ytC.this.KWHzl();
            Thread.State state = android.os.Looper.getMainLooper().getThread().getState();
            int iOLrzqt = C58005ytC.this.AhwBna.OLrzqt();
            if (iOLrzqt == 1) {
                strCopydefault = C58009ytG.copydefault(android.os.Looper.getMainLooper().getThread().getStackTrace(), "|*\t\t");
            } else if (iOLrzqt == 2) {
                strCopydefault = C58009ytG.OLrzqt();
            } else {
                strCopydefault = C58009ytG.copydefault(android.os.Looper.getMainLooper().getThread().getStackTrace(), "|*\t\t", 12);
            }
            java.lang.String str = strCopydefault;
            LinkedList linkedList = new LinkedList();
            if (jArrCopyData.length > 0) {
                C58007ytE.AEQbTJ(jArrCopyData, linkedList, true, jUptimeMillis);
                C58007ytE.KWHzl(linkedList, 30, new C58007ytE.Application() { // from class: o.ytC.Activity.1
                    @Override // o.C58007ytE.Application
                    public int EZpvd() {
                        return 60;
                    }

                    @Override // o.C58007ytE.Application
                    public boolean KWHzl(long j, int i) {
                        return j < ((long) i) * 5;
                    }

                    @Override // o.C58007ytE.Application
                    public void EZpvd(java.util.List<C58047yts> list, int i) {
                        C58013ytK.AEQbTJ("Matrix.AnrTracer", "[fallback] size:%s targetSize:%s stack:%s", java.lang.Integer.valueOf(i), 30, list);
                        java.util.ListIterator<C58047yts> listIterator = list.listIterator(java.lang.Math.min(i, 30));
                        while (listIterator.hasNext()) {
                            listIterator.next();
                            listIterator.remove();
                        }
                    }
                });
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            long jMax = java.lang.Math.max(5000L, C58007ytE.AEQbTJ(linkedList, sb, sb2));
            java.lang.String strCopydefault2 = C58007ytE.copydefault(linkedList, jMax);
            C58013ytK.AEQbTJ("Matrix.AnrTracer", "%s \npostTime:%s curTime:%s", KWHzl(visibleScene, iArrEZpvd, jArrKWHzl, state, sb2, zAYXKKw, linkedList.size(), strCopydefault2, str, jMax), java.lang.Long.valueOf(this.copydefault / 1000000), java.lang.Long.valueOf(jUptimeMillis));
            if (jMax >= RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS) {
                C58013ytK.AEQbTJ("Matrix.AnrTracer", "The checked anr task was not executed on time. The possible reason is that the current process has a low priority. just pass this report", new java.lang.Object[0]);
                return;
            }
            try {
                C58041ytm c58041ytm = (C58041ytm) C57911yrO.EZpvd().copydefault(C58041ytm.class);
                if (c58041ytm == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                DeviceUtil.AEQbTJ(jSONObject, C57911yrO.EZpvd().KWHzl());
                jSONObject.put("detail", Constants.Type.ANR);
                jSONObject.put("cost", jMax);
                jSONObject.put("stackKey", strCopydefault2);
                jSONObject.put("scene", visibleScene);
                jSONObject.put("stack", sb.toString());
                jSONObject.put("threadStack", str);
                jSONObject.put("processPriority", iArrEZpvd[0]);
                jSONObject.put("processNice", iArrEZpvd[1]);
                jSONObject.put("isProcessForeground", zAYXKKw);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("dalvik_heap", jArrKWHzl[0]);
                jSONObject2.put("native_heap", jArrKWHzl[1]);
                jSONObject2.put("vm_size", jArrKWHzl[2]);
                jSONObject.put("memory", jSONObject2);
                C58038ytj c58038ytj = new C58038ytj();
                c58038ytj.KWHzl(this.copydefault + "");
                c58038ytj.AEQbTJ("Trace_EvilMethod");
                c58038ytj.KWHzl(jSONObject);
                c58041ytm.OLrzqt(c58038ytj);
            } catch (JSONException e) {
                C58013ytK.OLrzqt("Matrix.AnrTracer", "[JSONException error: %s", e);
            }
        }

        public final java.lang.String KWHzl(java.lang.String str, int[] iArr, long[] jArr, Thread.State state, java.lang.StringBuilder sb, boolean z, long j, java.lang.String str2, java.lang.String str3, long j2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.String.format("-\n>>>>>>>>>>>>>>>>>>>>>>> maybe happens ANR(%s ms)! <<<<<<<<<<<<<<<<<<<<<<<\n", java.lang.Long.valueOf(j2)));
            sb2.append("|* [Status]");
            sb2.append("\n");
            sb2.append("|*\t\tScene: ");
            sb2.append(str);
            sb2.append("\n");
            sb2.append("|*\t\tForeground: ");
            sb2.append(z);
            sb2.append("\n");
            sb2.append("|*\t\tPriority: ");
            sb2.append(iArr[0]);
            sb2.append("\tNice: ");
            sb2.append(iArr[1]);
            sb2.append("\n");
            sb2.append("|*\t\tis64BitRuntime: ");
            sb2.append(DeviceUtil.AhwBna());
            sb2.append("\n");
            sb2.append("|* [Memory]");
            sb2.append("\n");
            sb2.append("|*\t\tDalvikHeap: ");
            sb2.append(jArr[0]);
            sb2.append("kb\n");
            sb2.append("|*\t\tNativeHeap: ");
            sb2.append(jArr[1]);
            sb2.append("kb\n");
            sb2.append("|*\t\tVmSize: ");
            sb2.append(jArr[2]);
            sb2.append("kb\n");
            sb2.append("|* [Thread]");
            sb2.append("\n");
            sb2.append(java.lang.String.format("|*\t\tStack(%s): ", state));
            sb2.append(str3);
            sb2.append("|* [Trace]");
            sb2.append("\n");
            if (j > 0) {
                sb2.append("|*\t\tStackKey: ");
                sb2.append(str2);
                sb2.append("\n");
                sb2.append(sb.toString());
            } else {
                sb2.append(java.lang.String.format("AppMethodBeat is close[%s].", java.lang.Boolean.valueOf(AppMethodBeat.getInstance().isAlive())));
                sb2.append("\n");
            }
            sb2.append("=========================================================================");
            return sb2.toString();
        }
    }

    public final long[] KWHzl() {
        return new long[]{DeviceUtil.EZpvd(), DeviceUtil.KWHzl(), DeviceUtil.gEmmrt()};
    }
}
