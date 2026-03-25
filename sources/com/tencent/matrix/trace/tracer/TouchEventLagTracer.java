package com.tencent.matrix.trace.tracer;

import com.tencent.matrix.AppActiveMatrixDelegate;
import com.tencent.matrix.trace.constants.Constants;
import com.tencent.matrix.trace.util.AppForegroundUtil;
import com.tencent.matrix.util.DeviceUtil;
import o.AbstractC58010ytH;
import o.C57911yrO;
import o.C58009ytG;
import o.C58011ytI;
import o.C58013ytK;
import o.C58038ytj;
import o.C58041ytm;
import o.C58043yto;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class TouchEventLagTracer extends AbstractC58010ytH {
    public static long EZpvd;
    public static C58043yto OLrzqt;
    public static String copydefault;

    public static native void nativeInitTouchEventLagDetective(int i);

    static {
        System.loadLibrary("trace-canary");
    }

    public TouchEventLagTracer(C58043yto c58043yto) {
        OLrzqt = c58043yto;
    }

    @Override // o.AbstractC58010ytH
    public void EZpvd() {
        synchronized (this) {
            super.EZpvd();
            if (OLrzqt.ejfBZ()) {
                nativeInitTouchEventLagDetective(OLrzqt.getFieldNames);
            }
        }
    }

    private static void onTouchEventLagDumpTrace(int i) {
        C58013ytK.OLrzqt("Matrix.TouchEventLagTracer", "onTouchEventLagDumpTrace, fd = " + i, new Object[0]);
        copydefault = C58009ytG.OLrzqt();
    }

    private static void onTouchEventLag(int i) {
        C58013ytK.OLrzqt("Matrix.TouchEventLagTracer", "onTouchEventLag, fd = " + i, new Object[0]);
        C58011ytI.AEQbTJ().post(new Runnable() { // from class: com.tencent.matrix.trace.tracer.TouchEventLagTracer.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (System.currentTimeMillis() - TouchEventLagTracer.EZpvd < 4000) {
                        return;
                    }
                    C58013ytK.EZpvd("Matrix.TouchEventLagTracer", "onTouchEventLag report", new Object[0]);
                    long unused = TouchEventLagTracer.EZpvd = System.currentTimeMillis();
                    C58041ytm c58041ytm = (C58041ytm) C57911yrO.EZpvd().copydefault(C58041ytm.class);
                    if (c58041ytm == null) {
                        return;
                    }
                    String str = TouchEventLagTracer.copydefault;
                    boolean zIsInterestingToUser = AppForegroundUtil.isInterestingToUser();
                    String visibleScene = AppActiveMatrixDelegate.INSTANCE.getVisibleScene();
                    JSONObject jSONObjectAEQbTJ = DeviceUtil.AEQbTJ(new JSONObject(), C57911yrO.EZpvd().KWHzl());
                    jSONObjectAEQbTJ.put("detail", Constants.Type.LAG_TOUCH);
                    jSONObjectAEQbTJ.put("scene", visibleScene);
                    jSONObjectAEQbTJ.put("threadStack", str);
                    jSONObjectAEQbTJ.put("isProcessForeground", zIsInterestingToUser);
                    C58038ytj c58038ytj = new C58038ytj();
                    c58038ytj.AEQbTJ("Trace_EvilMethod");
                    c58038ytj.KWHzl(jSONObjectAEQbTJ);
                    c58041ytm.OLrzqt(c58038ytj);
                } catch (Throwable th) {
                    C58013ytK.OLrzqt("Matrix.TouchEventLagTracer", "Matrix error, error = " + th.getMessage(), new Object[0]);
                }
            }
        });
    }
}
