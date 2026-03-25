package o;

import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: renamed from: o.ynz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57736ynz {
    public final java.lang.Class KWHzl;
    public final GoogleApiClient copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GoogleApiClient AEQbTJ() {
        return this.copydefault;
    }

    public C57736ynz(GoogleApiClient googleApiClient) {
        this.copydefault = googleApiClient;
        this.KWHzl = googleApiClient.getClass();
    }

    public void KWHzl() {
        try {
            this.KWHzl.getMethod("connect", new java.lang.Class[0]).invoke(this.copydefault, new java.lang.Object[0]);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public void OLrzqt() {
        try {
            this.KWHzl.getMethod("disconnect", new java.lang.Class[0]).invoke(this.copydefault, new java.lang.Object[0]);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }
}
