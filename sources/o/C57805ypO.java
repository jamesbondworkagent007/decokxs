package o;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import o.AbstractC57808ypR;
import o.C57837ypu;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57805ypO extends AbstractC57808ypR {
    public static boolean copydefault;

    @Override // o.AbstractC57808ypR
    public void KWHzl(JSONObject jSONObject) {
    }

    @Override // o.AbstractC57808ypR
    public void a_(JSONObject jSONObject) {
    }

    public C57805ypO() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.PUSH);
    }

    @Override // o.AbstractC57808ypR
    public AbstractC57803ypM copydefault(java.lang.String str, boolean z) {
        return new C57804ypN(str, z);
    }

    @Override // o.AbstractC57808ypR
    public OneSignal.LOG_LEVEL bK_() {
        return OneSignal.LOG_LEVEL.ERROR;
    }

    public void copydefault(java.lang.String str) {
        OneSignal.AhwBna(str);
    }

    public AbstractC57808ypR.Application AEQbTJ(boolean z) {
        AbstractC57808ypR.Application application;
        if (z) {
            C57837ypu.copydefault("players/" + OneSignal.finit() + "?app_id=" + OneSignal.QbewEr(), new C57837ypu.TaskDescription() { // from class: o.ypO.2
                @Override // o.C57837ypu.TaskDescription
                public void OLrzqt(java.lang.String str) {
                    boolean unused = C57805ypO.copydefault = true;
                    if (str == null || str.isEmpty()) {
                        str = "{}";
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("tags")) {
                            synchronized (C57805ypO.this.OLrzqt) {
                                C57805ypO c57805ypO = C57805ypO.this;
                                JSONObject jSONObjectEZpvd = c57805ypO.EZpvd(c57805ypO.DbNXlk().copydefault().AEQbTJ("tags"), C57805ypO.this.AuCTel().copydefault().AEQbTJ("tags"), null, null);
                                C57805ypO.this.DbNXlk().EZpvd("tags", jSONObject.optJSONObject("tags"));
                                C57805ypO.this.DbNXlk().valueOf();
                                C57805ypO.this.AuCTel().KWHzl(jSONObject, jSONObjectEZpvd);
                                C57805ypO.this.AuCTel().valueOf();
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }, "CACHE_KEY_GET_TAGS");
        }
        synchronized (this.OLrzqt) {
            application = new AbstractC57808ypR.Application(copydefault, C57685ynA.copydefault(AuCTel().copydefault(), "tags"));
        }
        return application;
    }

    @Override // o.AbstractC57808ypR
    public void bL_() {
        copydefault((java.lang.Integer) 0).copydefault();
    }

    public void EZpvd(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", null));
            ejfBZ().OLrzqt(jSONObject2, (java.util.Set<java.lang.String>) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            ejfBZ().EZpvd(jSONObject3, (java.util.Set<java.lang.String>) null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public boolean OLrzqt() {
        return AuCTel().AEQbTJ().copydefault("userSubscribePref", true);
    }

    public java.lang.String copydefault() {
        return AuCTel().AEQbTJ().copydefault("language", (java.lang.String) null);
    }

    public void copydefault(boolean z) {
        try {
            ejfBZ().OLrzqt("androidPermission", java.lang.Boolean.valueOf(z));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // o.AbstractC57808ypR
    public java.lang.String EZpvd() {
        return OneSignal.finit();
    }

    @Override // o.AbstractC57808ypR
    public void OLrzqt(java.lang.String str) {
        OneSignal.AkhnZx(str);
    }

    @Override // o.AbstractC57808ypR
    public void copydefault(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            OneSignal.fIwbmz();
        }
        if (jSONObject.has("sms_number")) {
            OneSignal.ejfBZ();
        }
    }
}
