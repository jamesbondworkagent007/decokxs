package o;

import com.immomo.mls.fun.ud.net.ErrorKey;
import com.immomo.mls.fun.ud.net.ResponseKey;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ajg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7430ajg {
    public java.lang.String AEQbTJ;
    public int KWHzl;
    public java.lang.String copydefault;
    public java.util.Map djBIcL;
    public boolean EZpvd = false;
    public boolean OLrzqt = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Map EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return !this.OLrzqt;
    }

    public void KWHzl(java.lang.String str) {
        this.copydefault = str;
        try {
            this.djBIcL = C7869arv.KWHzl(new JSONObject(this.copydefault));
            AEQbTJ(this.EZpvd);
            EZpvd(this.AEQbTJ);
        } catch (java.lang.Throwable unused) {
            java.util.HashMap map = new java.util.HashMap();
            this.djBIcL = map;
            map.put(ErrorKey.MSG, str);
            this.djBIcL.put(ErrorKey.CODE, java.lang.Integer.valueOf(this.KWHzl));
            this.OLrzqt = true;
        }
    }

    public void AEQbTJ(boolean z) {
        this.EZpvd = z;
        java.util.Map map = this.djBIcL;
        if (map != null) {
            map.put(ResponseKey.Cache, java.lang.Boolean.valueOf(z));
        }
    }

    public void EZpvd(java.lang.String str) {
        this.AEQbTJ = str;
        if (this.djBIcL == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.djBIcL.put(ResponseKey.Path, str);
    }
}
