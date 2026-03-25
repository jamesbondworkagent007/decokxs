package o;

import com.tencent.matrix.AppActiveMatrixDelegate;
import com.tencent.matrix.trace.constants.Constants;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.util.DeviceUtil;
import java.util.LinkedList;
import o.C58007ytE;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ytB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58004ytB extends AbstractC58010ytH implements InterfaceC58051ytw {
    public long AEQbTJ;
    public final boolean EZpvd;
    public final C58043yto KWHzl;
    public AppMethodBeat.TaskDescription OLrzqt;

    @Override // o.InterfaceC58051ytw
    public boolean OLrzqt() {
        return true;
    }

    public C58004ytB(C58043yto c58043yto) {
        this.KWHzl = c58043yto;
        this.AEQbTJ = c58043yto.copydefault();
        this.EZpvd = c58043yto.fetchVPNInfo();
    }

    @Override // o.AbstractC58010ytH
    public void EZpvd() {
        super.EZpvd();
        if (this.EZpvd) {
            C58044ytp.AEQbTJ(this);
        }
    }

    @Override // o.InterfaceC58051ytw
    public void KWHzl(java.lang.String str) {
        this.OLrzqt = AppMethodBeat.getInstance().maskIndex("EvilMethodTracer#dispatchBegin");
    }

    @Override // o.InterfaceC58051ytw
    public void KWHzl(java.lang.String str, long j, long j2) {
        long j3 = (j2 - j) / 1000000;
        try {
            if (j3 >= this.AEQbTJ) {
                long[] jArrCopyData = AppMethodBeat.getInstance().copyData(this.OLrzqt);
                C58011ytI.AEQbTJ().post(new ActionBar(AYXKKw(), AppActiveMatrixDelegate.INSTANCE.getVisibleScene(), jArrCopyData, j3, j2));
            }
        } finally {
            this.OLrzqt.OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.ytB$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static class ActionBar implements java.lang.Runnable {
        public long AEQbTJ;
        public java.lang.String EZpvd;
        public boolean KWHzl;
        public long OLrzqt;
        public long[] copydefault;

        public ActionBar(boolean z, java.lang.String str, long[] jArr, long j, long j2) {
            this.KWHzl = z;
            this.EZpvd = str;
            this.OLrzqt = j;
            this.copydefault = jArr;
            this.AEQbTJ = j2;
        }

        public void AEQbTJ() {
            int[] iArrEZpvd = C58009ytG.EZpvd(android.os.Process.myPid());
            LinkedList linkedList = new LinkedList();
            long[] jArr = this.copydefault;
            if (jArr.length > 0) {
                C58007ytE.AEQbTJ(jArr, linkedList, true, this.AEQbTJ);
                C58007ytE.KWHzl(linkedList, 30, new C58007ytE.Application() { // from class: o.ytB.ActionBar.2
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
                        C58013ytK.AEQbTJ("Matrix.EvilMethodTracer", "[fallback] size:%s targetSize:%s stack:%s", java.lang.Integer.valueOf(i), 30, list);
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
            long jMax = java.lang.Math.max(this.OLrzqt, C58007ytE.AEQbTJ(linkedList, sb, sb2));
            java.lang.String strCopydefault = C58007ytE.copydefault(linkedList, jMax);
            C58013ytK.AEQbTJ("Matrix.EvilMethodTracer", "%s", OLrzqt(this.EZpvd, iArrEZpvd, this.KWHzl, sb2, linkedList.size(), strCopydefault, this.OLrzqt));
            try {
                C58041ytm c58041ytm = (C58041ytm) C57911yrO.EZpvd().copydefault(C58041ytm.class);
                if (c58041ytm == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                DeviceUtil.AEQbTJ(jSONObject, C57911yrO.EZpvd().KWHzl());
                jSONObject.put("detail", Constants.Type.NORMAL);
                jSONObject.put("cost", jMax);
                jSONObject.put("scene", this.EZpvd);
                jSONObject.put("stack", sb.toString());
                jSONObject.put("stackKey", strCopydefault);
                C58038ytj c58038ytj = new C58038ytj();
                c58038ytj.AEQbTJ("Trace_EvilMethod");
                c58038ytj.KWHzl(jSONObject);
                c58041ytm.OLrzqt(c58038ytj);
            } catch (JSONException e) {
                C58013ytK.OLrzqt("Matrix.EvilMethodTracer", "[JSONException error: %s", e);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AEQbTJ();
        }

        public final java.lang.String OLrzqt(java.lang.String str, int[] iArr, boolean z, java.lang.StringBuilder sb, long j, java.lang.String str2, long j2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.String.format("-\n>>>>>>>>>>>>>>>>>>>>> maybe happens Jankiness!(%sms) <<<<<<<<<<<<<<<<<<<<<\n", java.lang.Long.valueOf(j2)));
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
}
