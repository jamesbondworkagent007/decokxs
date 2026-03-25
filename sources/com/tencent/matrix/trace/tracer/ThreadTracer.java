package com.tencent.matrix.trace.tracer;

import com.tencent.matrix.trace.constants.Constants;
import com.tencent.matrix.util.DeviceUtil;
import o.AbstractC58010ytH;
import o.C57911yrO;
import o.C58009ytG;
import o.C58013ytK;
import o.C58038ytj;
import o.C58041ytm;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ThreadTracer extends AbstractC58010ytH {
    public static boolean AEQbTJ = false;
    public static Activity EZpvd = null;
    public static boolean KWHzl = false;
    public static StateListAnimator OLrzqt;

    public interface Activity {
        void KWHzl(int i, int i2, String str, String str2);

        void OLrzqt(int i, int i2, String str, String str2);
    }

    public interface StateListAnimator {
        void KWHzl(int i, int i2);

        void OLrzqt(long j);
    }

    private static native int nativeGetPthreadKeySeq();

    private static native void nativeInitThreadHook(int i, int i2);

    static {
        System.loadLibrary("trace-canary");
    }

    @Override // o.AbstractC58010ytH
    public void EZpvd() {
        super.EZpvd();
        boolean z = AEQbTJ;
        if (z || KWHzl) {
            nativeInitThreadHook(z ? 1 : 0, KWHzl ? 1 : 0);
        }
    }

    private static void onMainThreadPriorityModified(int i, int i2) {
        StateListAnimator stateListAnimator = OLrzqt;
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl(i, i2);
            return;
        }
        try {
            C58041ytm c58041ytm = (C58041ytm) C57911yrO.EZpvd().copydefault(C58041ytm.class);
            if (c58041ytm == null) {
                return;
            }
            String strOLrzqt = C58009ytG.OLrzqt();
            JSONObject jSONObjectAEQbTJ = DeviceUtil.AEQbTJ(new JSONObject(), C57911yrO.EZpvd().KWHzl());
            jSONObjectAEQbTJ.put("detail", Constants.Type.PRIORITY_MODIFIED);
            jSONObjectAEQbTJ.put("threadStack", strOLrzqt);
            jSONObjectAEQbTJ.put("processPriority", i2);
            C58038ytj c58038ytj = new C58038ytj();
            c58038ytj.AEQbTJ("Trace_EvilMethod");
            c58038ytj.KWHzl(jSONObjectAEQbTJ);
            c58041ytm.OLrzqt(c58038ytj);
            C58013ytK.OLrzqt("ThreadPriorityTracer", "happens MainThreadPriorityModified : %s ", jSONObjectAEQbTJ.toString());
        } catch (Throwable th) {
            C58013ytK.OLrzqt("ThreadPriorityTracer", "onMainThreadPriorityModified error: %s", th.getMessage());
        }
    }

    private static void onMainThreadTimerSlackModified(long j) {
        try {
            StateListAnimator stateListAnimator = OLrzqt;
            if (stateListAnimator != null) {
                stateListAnimator.OLrzqt(j);
                return;
            }
            C58041ytm c58041ytm = (C58041ytm) C57911yrO.EZpvd().copydefault(C58041ytm.class);
            if (c58041ytm == null) {
                return;
            }
            String strOLrzqt = C58009ytG.OLrzqt();
            JSONObject jSONObjectAEQbTJ = DeviceUtil.AEQbTJ(new JSONObject(), C57911yrO.EZpvd().KWHzl());
            jSONObjectAEQbTJ.put("detail", Constants.Type.TIMERSLACK_MODIFIED);
            jSONObjectAEQbTJ.put("threadStack", strOLrzqt);
            jSONObjectAEQbTJ.put("processTimerSlack", j);
            C58038ytj c58038ytj = new C58038ytj();
            c58038ytj.AEQbTJ("Trace_EvilMethod");
            c58038ytj.KWHzl(jSONObjectAEQbTJ);
            c58041ytm.OLrzqt(c58038ytj);
            C58013ytK.OLrzqt("ThreadPriorityTracer", "happens MainThreadPriorityModified : %s ", jSONObjectAEQbTJ.toString());
        } catch (Throwable th) {
            C58013ytK.OLrzqt("ThreadPriorityTracer", "onMainThreadPriorityModified error: %s", th.getMessage());
        }
    }

    private static void pthreadKeyCallback(int i, int i2, int i3, String str, String str2) {
        Activity activity = EZpvd;
        if (activity != null) {
            if (i == 0) {
                activity.OLrzqt(i2, i3, str, str2);
            } else if (i == 1) {
                activity.KWHzl(i2, i3, str, str2);
            }
        }
    }
}
