package o;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57806ypP extends AbstractC57810ypT {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57810ypT
    public java.lang.String AEQbTJ() {
        return "email";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57810ypT
    public java.lang.String KWHzl() {
        return "email_auth_hash";
    }

    @Override // o.AbstractC57810ypT
    public int OLrzqt() {
        return 11;
    }

    public C57806ypP() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.EMAIL);
    }

    @Override // o.AbstractC57808ypR
    public AbstractC57803ypM copydefault(java.lang.String str, boolean z) {
        return new C57802ypL(str, z);
    }

    @Override // o.AbstractC57810ypT, o.AbstractC57808ypR
    public java.lang.String EZpvd() {
        return OneSignal.AuCTelauCTel();
    }

    public void EZpvd(java.lang.String str) {
        OneSignal.EZpvd(str);
    }

    @Override // o.AbstractC57810ypT
    public void OLrzqt(JSONObject jSONObject) {
        OneSignal.fARcdN();
    }

    @Override // o.AbstractC57810ypT
    public void copydefault() {
        OneSignal.fIwbmz();
    }

    @Override // o.AbstractC57808ypR
    public void OLrzqt(java.lang.String str) {
        OneSignal.isConnected(str);
    }
}
