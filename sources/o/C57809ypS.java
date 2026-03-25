package o;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57809ypS extends AbstractC57810ypT {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57810ypT
    public java.lang.String AEQbTJ() {
        return "sms_number";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57810ypT
    public java.lang.String KWHzl() {
        return "sms_auth_hash";
    }

    @Override // o.AbstractC57810ypT
    public int OLrzqt() {
        return 14;
    }

    public C57809ypS() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.SMS);
    }

    @Override // o.AbstractC57808ypR
    public AbstractC57803ypM copydefault(java.lang.String str, boolean z) {
        return new C57811ypU(str, z);
    }

    @Override // o.AbstractC57810ypT, o.AbstractC57808ypR
    public java.lang.String EZpvd() {
        return OneSignal.QfsBiF();
    }

    public void AEQbTJ(java.lang.String str) {
        OneSignal.AYXKKw(str);
    }

    @Override // o.AbstractC57810ypT
    public void OLrzqt(JSONObject jSONObject) {
        OneSignal.copydefault(jSONObject);
    }

    @Override // o.AbstractC57810ypT
    public void copydefault() {
        OneSignal.ejfBZ();
    }

    @Override // o.AbstractC57808ypR
    public void OLrzqt(java.lang.String str) {
        OneSignal.values(str);
    }
}
