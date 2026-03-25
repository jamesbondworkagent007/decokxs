package o;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.aif, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7376aif implements InterfaceC7341ahx {
    public java.io.File AEQbTJ;
    public JSONObject EZpvd;

    @Override // o.InterfaceC7341ahx
    public void EZpvd(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        copydefault();
        try {
            if (android.text.TextUtils.equals(this.EZpvd.optString(str, null), str2)) {
                return;
            }
            this.EZpvd.put(str, str2);
            C7864arq.copydefault(this.AEQbTJ, this.EZpvd.toString().getBytes());
        } catch (JSONException unused) {
        }
    }

    @Override // o.InterfaceC7341ahx
    public java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        copydefault();
        return this.EZpvd.optString(str, str2);
    }

    public final void copydefault() throws java.lang.Throwable {
        if (this.AEQbTJ == null) {
            java.io.File file = new java.io.File(C7864arq.OLrzqt(), "lua-kv-cache");
            this.AEQbTJ = file;
            if (!file.exists()) {
                try {
                    this.AEQbTJ.createNewFile();
                } catch (java.io.IOException | JSONException unused) {
                }
            } else {
                byte[] bArrCopydefault = C7864arq.copydefault(this.AEQbTJ);
                if (bArrCopydefault != null && bArrCopydefault.length > 0) {
                    this.EZpvd = new JSONObject(new java.lang.String(bArrCopydefault));
                }
            }
        }
        if (this.EZpvd == null) {
            this.EZpvd = new JSONObject();
        }
    }
}
