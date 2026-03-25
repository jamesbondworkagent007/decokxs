package o;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.tracer.FrameTracer;
import com.tencent.matrix.trace.tracer.IdleHandlerLagTracer;
import com.tencent.matrix.trace.tracer.SignalAnrTracer;
import com.tencent.matrix.trace.tracer.TouchEventLagTracer;

/* JADX INFO: renamed from: o.ytm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58041ytm extends AbstractC58042ytn {
    public SignalAnrTracer AYXKKw;
    public final int AhwBna = Build.VERSION.SDK_INT;
    public C58006ytD AkhnZx;
    public TouchEventLagTracer DbNXlk;
    public C58004ytB OLrzqt;
    public C58005ytC djBIcL;
    public final C58043yto fetchVPNInfo;
    public FrameTracer gEmmrt;
    public IdleHandlerLagTracer valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC58042ytn
    public java.lang.String EZpvd() {
        return "Trace";
    }

    public C58041ytm(C58043yto c58043yto) {
        this.fetchVPNInfo = c58043yto;
    }

    @Override // o.AbstractC58042ytn
    public void AEQbTJ(android.app.Application application, InterfaceC58039ytk interfaceC58039ytk) {
        super.AEQbTJ(application, interfaceC58039ytk);
        C58013ytK.EZpvd("Matrix.TracePlugin", "trace plugin init, trace config: %s", this.fetchVPNInfo.toString());
        if (this.AhwBna < 16) {
            C58013ytK.OLrzqt("Matrix.TracePlugin", "[FrameBeat] API is low Build.VERSION_CODES.JELLY_BEAN(16), TracePlugin is not supported", new java.lang.Object[0]);
            AYXKKw();
        } else {
            this.djBIcL = new C58005ytC(this.fetchVPNInfo);
            this.gEmmrt = new FrameTracer(this.fetchVPNInfo);
            this.OLrzqt = new C58004ytB(this.fetchVPNInfo);
            this.AkhnZx = new C58006ytD(this.fetchVPNInfo);
        }
    }

    @Override // o.AbstractC58042ytn
    public void djBIcL() {
        super.djBIcL();
        if (!copydefault()) {
            C58013ytK.AEQbTJ("Matrix.TracePlugin", "[start] Plugin is unSupported!", new java.lang.Object[0]);
            return;
        }
        C58013ytK.AEQbTJ("Matrix.TracePlugin", "start!", new java.lang.Object[0]);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.ytm.3
            @Override // java.lang.Runnable
            public void run() {
                if (C58041ytm.this.AhwBna < 24) {
                    C58041ytm c58041ytm = C58041ytm.this;
                    if (c58041ytm.EZpvd(c58041ytm.fetchVPNInfo) && !RunnableC58046ytr.AEQbTJ().EZpvd()) {
                        try {
                            RunnableC58046ytr.AEQbTJ().EZpvd(C58041ytm.this.fetchVPNInfo);
                        } catch (java.lang.RuntimeException e) {
                            C58013ytK.OLrzqt("Matrix.TracePlugin", "[start] RuntimeException:%s", e);
                            return;
                        }
                    }
                }
                if (C58041ytm.this.fetchVPNInfo.AkhnZx()) {
                    AppMethodBeat.getInstance().onStart();
                } else {
                    AppMethodBeat.getInstance().forceStop();
                }
                RunnableC58046ytr.AEQbTJ().valueOf();
                if (C58041ytm.this.fetchVPNInfo.gEmmrt()) {
                    C58041ytm.this.djBIcL.djBIcL();
                }
                if (C58041ytm.this.fetchVPNInfo.fIwbmz()) {
                    C58041ytm c58041ytm2 = C58041ytm.this;
                    c58041ytm2.valueOf = new IdleHandlerLagTracer(c58041ytm2.fetchVPNInfo);
                    C58041ytm.this.valueOf.djBIcL();
                }
                if (C58041ytm.this.fetchVPNInfo.ejfBZ()) {
                    C58041ytm.this.DbNXlk = new TouchEventLagTracer(C58041ytm.this.fetchVPNInfo);
                    C58041ytm.this.DbNXlk.djBIcL();
                }
                if (C58041ytm.this.fetchVPNInfo.AuCTel() && !SignalAnrTracer.valueOf) {
                    C58041ytm.this.AYXKKw = new SignalAnrTracer(C58041ytm.this.fetchVPNInfo);
                    C58041ytm.this.AYXKKw.djBIcL();
                }
                if (C58041ytm.this.fetchVPNInfo.isConnected()) {
                    C58041ytm.this.gEmmrt.djBIcL();
                }
                if (C58041ytm.this.fetchVPNInfo.fetchVPNInfo()) {
                    C58041ytm.this.OLrzqt.djBIcL();
                }
                if (C58041ytm.this.fetchVPNInfo.fARcdN()) {
                    C58041ytm.this.AkhnZx.djBIcL();
                }
            }
        };
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            C58013ytK.AEQbTJ("Matrix.TracePlugin", "start TracePlugin in Thread[%s] but not in mainThread!", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            C58011ytI.OLrzqt().post(runnable);
        }
    }

    @Override // o.AbstractC58042ytn, o.InterfaceC58036yth
    public void copydefault(boolean z) {
        super.copydefault(z);
        if (copydefault()) {
            FrameTracer frameTracer = this.gEmmrt;
            if (frameTracer != null) {
                frameTracer.copydefault(z);
            }
            C58005ytC c58005ytC = this.djBIcL;
            if (c58005ytC != null) {
                c58005ytC.copydefault(z);
            }
            C58004ytB c58004ytB = this.OLrzqt;
            if (c58004ytB != null) {
                c58004ytB.copydefault(z);
            }
            C58006ytD c58006ytD = this.AkhnZx;
            if (c58006ytD != null) {
                c58006ytD.copydefault(z);
            }
        }
    }

    public final boolean EZpvd(C58043yto c58043yto) {
        return c58043yto.fetchVPNInfo() || c58043yto.gEmmrt() || c58043yto.isConnected();
    }
}
