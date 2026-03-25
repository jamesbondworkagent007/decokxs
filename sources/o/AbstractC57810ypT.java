package o;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57810ypT extends AbstractC57808ypR {
    public abstract java.lang.String AEQbTJ();

    @Override // o.AbstractC57808ypR
    public abstract java.lang.String EZpvd();

    public abstract java.lang.String KWHzl();

    public abstract int OLrzqt();

    public abstract void OLrzqt(JSONObject jSONObject);

    public abstract void copydefault();

    public AbstractC57810ypT(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        super(userStateSynchronizerType);
    }

    @Override // o.AbstractC57808ypR
    public OneSignal.LOG_LEVEL bK_() {
        return OneSignal.LOG_LEVEL.INFO;
    }

    public void AYXKKw() {
        bL_();
    }

    @Override // o.AbstractC57808ypR
    public void bL_() {
        if ((EZpvd() == null && values() == null) || OneSignal.finit() == null) {
            return;
        }
        copydefault((java.lang.Integer) 0).copydefault();
    }

    @Override // o.AbstractC57808ypR
    public void a_(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", OLrzqt());
            jSONObject.putOpt("device_player_id", OneSignal.finit());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // o.AbstractC57808ypR
    public void copydefault(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            copydefault();
        }
    }

    @Override // o.AbstractC57808ypR
    public void KWHzl(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(AEQbTJ(), jSONObject.get("identifier"));
                if (jSONObject.has(KWHzl())) {
                    jSONObject2.put(KWHzl(), jSONObject.get(KWHzl()));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            OLrzqt(jSONObject2);
        }
    }
}
