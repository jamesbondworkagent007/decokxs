package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ytn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58042ytn implements InterfaceC58036yth {
    public android.app.Application EZpvd;
    public InterfaceC58039ytk copydefault;
    public boolean AEQbTJ = true;
    public int KWHzl = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.app.Application AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AYXKKw() {
        this.AEQbTJ = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.KWHzl == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.KWHzl == 8;
    }

    @Override // o.InterfaceC58036yth
    public void copydefault(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.AEQbTJ;
    }

    public void AEQbTJ(android.app.Application application, InterfaceC58039ytk interfaceC58039ytk) {
        if (this.EZpvd != null || this.copydefault != null) {
            throw new java.lang.RuntimeException("plugin duplicate init, application or plugin listener is not null");
        }
        this.KWHzl = 1;
        this.EZpvd = application;
        this.copydefault = interfaceC58039ytk;
        interfaceC58039ytk.copydefault(this);
        C58001ysz.AEQbTJ.KWHzl(this);
    }

    public void OLrzqt(C58038ytj c58038ytj) {
        if (c58038ytj.EZpvd() == null) {
            c58038ytj.AEQbTJ(EZpvd());
        }
        c58038ytj.AEQbTJ(this);
        JSONObject jSONObjectOLrzqt = c58038ytj.OLrzqt();
        try {
            if (c58038ytj.EZpvd() != null) {
                jSONObjectOLrzqt.put("tag", c58038ytj.EZpvd());
            }
            if (c58038ytj.copydefault() != 0) {
                jSONObjectOLrzqt.put("type", c58038ytj.copydefault());
            }
            jSONObjectOLrzqt.put("process", C58014ytL.OLrzqt(this.EZpvd));
            jSONObjectOLrzqt.put(CrashHianalyticsData.TIME, java.lang.System.currentTimeMillis());
        } catch (JSONException e) {
            C58013ytK.OLrzqt("Matrix.Plugin", "json error", e);
        }
        this.copydefault.copydefault(c58038ytj);
    }

    public void djBIcL() {
        if (OLrzqt()) {
            throw new java.lang.RuntimeException("plugin start, but plugin has been already destroyed");
        }
        if (KWHzl()) {
            throw new java.lang.RuntimeException("plugin start, but plugin has been already started");
        }
        this.KWHzl = 2;
        InterfaceC58039ytk interfaceC58039ytk = this.copydefault;
        if (interfaceC58039ytk == null) {
            throw new java.lang.RuntimeException("plugin start, plugin listener is null");
        }
        interfaceC58039ytk.OLrzqt(this);
    }

    public java.lang.String EZpvd() {
        return getClass().getName();
    }
}
