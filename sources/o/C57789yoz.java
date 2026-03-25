package o;

import androidx.core.app.NotificationCompat;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
import com.onesignal.OneSignal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57789yoz {
    public JSONObject AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public int AkhnZx;
    public long AuCTel;
    public int AuCTelauCTel;
    public java.lang.String DbNXlk;
    public Application EZpvd;
    public int KWHzl;
    public java.lang.String OLrzqt;
    public java.util.List<TaskDescription> copydefault;
    public java.lang.String djBIcL;
    public int ejfBZ;
    public NotificationCompat.Extender fARcdN;
    public java.lang.String fIwbmz;
    public java.lang.String fJNWhG;
    public java.util.List<C57789yoz> fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String getFieldNames;
    public java.lang.String getNewProxyInstance;
    public java.lang.String hDKMBd;
    public java.lang.String isConnected;
    public java.lang.String iwGUEr;
    public java.lang.String uzCIH;
    public java.lang.String valueOf;
    public java.lang.String values;
    public java.lang.String zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.String str) {
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.util.List<TaskDescription> list) {
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(JSONObject jSONObject) {
        this.AEQbTJ = jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AYXKKw() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AYXKKw(java.lang.String str) {
        this.fJNWhG = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AhwBna() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AhwBna(java.lang.String str) {
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AkhnZx() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AkhnZx(java.lang.String str) {
        this.getFieldNames = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String DbNXlk() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void DbNXlk(java.lang.String str) {
        this.iwGUEr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(int i) {
        this.ejfBZ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JSONObject KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.AuCTelauCTel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(long j) {
        this.AuCTel = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(NotificationCompat.Extender extender) {
        this.fARcdN = extender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(java.lang.String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(Application application) {
        this.EZpvd = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.AkhnZx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(java.lang.String str) {
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@androidx.annotation.Nullable java.util.List<C57789yoz> list) {
        this.fetchVPNInfo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long djBIcL() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void djBIcL(java.lang.String str) {
        this.values = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fARcdN(java.lang.String str) {
        this.uzCIH = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fJNWhG(java.lang.String str) {
        this.zLjUOn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String fetchVPNInfo() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fetchVPNInfo(java.lang.String str) {
        this.fIwbmz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String gEmmrt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gEmmrt(java.lang.String str) {
        this.isConnected = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void isConnected(java.lang.String str) {
        this.getNewProxyInstance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isConnected() {
        return this.KWHzl != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationCompat.Extender valueOf() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void valueOf(java.lang.String str) {
        this.DbNXlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void values(java.lang.String str) {
        this.hDKMBd = str;
    }

    public C57789yoz() {
        this.AkhnZx = 1;
    }

    public C57789yoz(@androidx.annotation.NonNull JSONObject jSONObject) {
        this(null, jSONObject, 0);
    }

    public C57789yoz(@androidx.annotation.Nullable java.util.List<C57789yoz> list, @androidx.annotation.NonNull JSONObject jSONObject, int i) {
        this.AkhnZx = 1;
        KWHzl(jSONObject);
        this.fetchVPNInfo = list;
        this.KWHzl = i;
    }

    public C57789yoz(C57789yoz c57789yoz) {
        this.AkhnZx = 1;
        this.fARcdN = c57789yoz.fARcdN;
        this.fetchVPNInfo = c57789yoz.fetchVPNInfo;
        this.KWHzl = c57789yoz.KWHzl;
        this.fJNWhG = c57789yoz.fJNWhG;
        this.uzCIH = c57789yoz.uzCIH;
        this.hDKMBd = c57789yoz.hDKMBd;
        this.zLjUOn = c57789yoz.zLjUOn;
        this.valueOf = c57789yoz.valueOf;
        this.AEQbTJ = c57789yoz.AEQbTJ;
        this.getFieldNames = c57789yoz.getFieldNames;
        this.isConnected = c57789yoz.isConnected;
        this.OLrzqt = c57789yoz.OLrzqt;
        this.getNewProxyInstance = c57789yoz.getNewProxyInstance;
        this.values = c57789yoz.values;
        this.iwGUEr = c57789yoz.iwGUEr;
        this.DbNXlk = c57789yoz.DbNXlk;
        this.AkhnZx = c57789yoz.AkhnZx;
        this.AYXKKw = c57789yoz.AYXKKw;
        this.djBIcL = c57789yoz.djBIcL;
        this.copydefault = c57789yoz.copydefault;
        this.gEmmrt = c57789yoz.gEmmrt;
        this.EZpvd = c57789yoz.EZpvd;
        this.AhwBna = c57789yoz.AhwBna;
        this.ejfBZ = c57789yoz.ejfBZ;
        this.fIwbmz = c57789yoz.fIwbmz;
        this.AuCTel = c57789yoz.AuCTel;
        this.AuCTelauCTel = c57789yoz.AuCTelauCTel;
    }

    public final void KWHzl(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOLrzqt = C57692ynH.OLrzqt(jSONObject);
            long jKWHzl = OneSignal.aKErDB().KWHzl();
            if (jSONObject.has(Constants.MessagePayloadKeys.TTL)) {
                this.AuCTel = jSONObject.optLong(Constants.MessagePayloadKeys.SENT_TIME, jKWHzl) / 1000;
                this.AuCTelauCTel = jSONObject.optInt(Constants.MessagePayloadKeys.TTL, 259200);
            } else if (jSONObject.has("hms.ttl")) {
                this.AuCTel = jSONObject.optLong("hms.sent_time", jKWHzl) / 1000;
                this.AuCTelauCTel = jSONObject.optInt("hms.ttl", 259200);
            } else {
                this.AuCTel = jKWHzl / 1000;
                this.AuCTelauCTel = 259200;
            }
            this.fJNWhG = jSONObjectOLrzqt.optString("i");
            this.hDKMBd = jSONObjectOLrzqt.optString("ti");
            this.uzCIH = jSONObjectOLrzqt.optString("tn");
            this.fIwbmz = jSONObject.toString();
            this.AEQbTJ = jSONObjectOLrzqt.optJSONObject(IEncryptorType.DEFAULT_ENCRYPTOR);
            this.values = jSONObjectOLrzqt.optString("u", null);
            this.valueOf = jSONObject.optString(ProductMatrixRemoteConfig.ALERT, null);
            this.zLjUOn = jSONObject.optString("title", null);
            this.getFieldNames = jSONObject.optString("sicon", null);
            this.OLrzqt = jSONObject.optString("bicon", null);
            this.isConnected = jSONObject.optString("licon", null);
            this.iwGUEr = jSONObject.optString(RemoteMessageConst.Notification.SOUND, null);
            this.AYXKKw = jSONObject.optString("grp", null);
            this.djBIcL = jSONObject.optString("grp_msg", null);
            this.getNewProxyInstance = jSONObject.optString("bgac", null);
            this.DbNXlk = jSONObject.optString("ledc", null);
            java.lang.String strOptString = jSONObject.optString("vis", null);
            if (strOptString != null) {
                this.AkhnZx = java.lang.Integer.parseInt(strOptString);
            }
            this.gEmmrt = jSONObject.optString("from", null);
            this.ejfBZ = jSONObject.optInt("pri", 0);
            java.lang.String strOptString2 = jSONObject.optString(Constants.MessagePayloadKeys.COLLAPSE_KEY, null);
            if (!"do_not_collapse".equals(strOptString2)) {
                this.AhwBna = strOptString2;
            }
            try {
                AuCTel();
            } catch (java.lang.Throwable th) {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                EZpvd(jSONObject);
            } catch (java.lang.Throwable th2) {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (java.lang.Throwable th3) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent payload values!", th3);
        }
    }

    public final void AuCTel() throws java.lang.Throwable {
        JSONObject jSONObject = this.AEQbTJ;
        if (jSONObject == null || !jSONObject.has("actionButtons")) {
            return;
        }
        JSONArray jSONArray = this.AEQbTJ.getJSONArray("actionButtons");
        this.copydefault = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            TaskDescription taskDescription = new TaskDescription();
            taskDescription.EZpvd = jSONObject2.optString("id", null);
            taskDescription.OLrzqt = jSONObject2.optString("text", null);
            taskDescription.copydefault = jSONObject2.optString(RemoteMessageConst.Notification.ICON, null);
            this.copydefault.add(taskDescription);
        }
        this.AEQbTJ.remove("actionId");
        this.AEQbTJ.remove("actionButtons");
    }

    public final void EZpvd(JSONObject jSONObject) throws java.lang.Throwable {
        java.lang.String strOptString = jSONObject.optString("bg_img", null);
        if (strOptString != null) {
            JSONObject jSONObject2 = new JSONObject(strOptString);
            Application application = new Application();
            this.EZpvd = application;
            application.OLrzqt = jSONObject2.optString("img");
            this.EZpvd.EZpvd = jSONObject2.optString("tc");
            this.EZpvd.copydefault = jSONObject2.optString("bc");
        }
    }

    public C57739yoB values() {
        return new C57739yoB(this);
    }

    public C57789yoz OLrzqt() {
        return new Activity().copydefault(this.fARcdN).EZpvd(this.fetchVPNInfo).AEQbTJ(this.KWHzl).AhwBna(this.fJNWhG).ejfBZ(this.uzCIH).values(this.hDKMBd).fJNWhG(this.zLjUOn).AEQbTJ(this.valueOf).KWHzl(this.AEQbTJ).DbNXlk(this.getFieldNames).AYXKKw(this.isConnected).KWHzl(this.OLrzqt).isConnected(this.getNewProxyInstance).gEmmrt(this.values).fetchVPNInfo(this.iwGUEr).djBIcL(this.DbNXlk).OLrzqt(this.AkhnZx).OLrzqt(this.AYXKKw).valueOf(this.djBIcL).KWHzl(this.copydefault).EZpvd(this.gEmmrt).copydefault(this.EZpvd).copydefault(this.AhwBna).KWHzl(this.ejfBZ).AkhnZx(this.fIwbmz).KWHzl(this.AuCTel).copydefault(this.AuCTelauCTel).EZpvd();
    }

    public java.lang.String toString() {
        return "OSNotification{notificationExtender=" + this.fARcdN + ", groupedNotifications=" + this.fetchVPNInfo + ", androidNotificationId=" + this.KWHzl + ", notificationId='" + this.fJNWhG + "', templateName='" + this.uzCIH + "', templateId='" + this.hDKMBd + "', title='" + this.zLjUOn + "', body='" + this.valueOf + "', additionalData=" + this.AEQbTJ + ", smallIcon='" + this.getFieldNames + "', largeIcon='" + this.isConnected + "', bigPicture='" + this.OLrzqt + "', smallIconAccentColor='" + this.getNewProxyInstance + "', launchURL='" + this.values + "', sound='" + this.iwGUEr + "', ledColor='" + this.DbNXlk + "', lockScreenVisibility=" + this.AkhnZx + ", groupKey='" + this.AYXKKw + "', groupMessage='" + this.djBIcL + "', actionButtons=" + this.copydefault + ", fromProjectNumber='" + this.gEmmrt + "', backgroundImageLayout=" + this.EZpvd + ", collapseId='" + this.AhwBna + "', priority=" + this.ejfBZ + ", rawPayload='" + this.fIwbmz + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: renamed from: o.yoz$TaskDescription */
    public static class TaskDescription {
        public java.lang.String EZpvd;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        public TaskDescription() {
        }

        public TaskDescription(JSONObject jSONObject) {
            this.EZpvd = jSONObject.optString("id");
            this.OLrzqt = jSONObject.optString("text");
            this.copydefault = jSONObject.optString(RemoteMessageConst.Notification.ICON);
        }
    }

    /* JADX INFO: renamed from: o.yoz$Application */
    public static class Application {
        public java.lang.String EZpvd;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
    }

    /* JADX INFO: renamed from: o.yoz$Activity */
    public static class Activity {
        public int AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String AkhnZx;
        public long AuCTel;
        public int DbNXlk = 1;
        public Application EZpvd;
        public java.lang.String KWHzl;
        public java.util.List<TaskDescription> OLrzqt;
        public JSONObject copydefault;
        public java.lang.String djBIcL;
        public int ejfBZ;
        public java.lang.String fARcdN;
        public NotificationCompat.Extender fIwbmz;
        public java.lang.String fJNWhG;
        public java.util.List<C57789yoz> fetchVPNInfo;
        public java.lang.String gEmmrt;
        public java.lang.String getFieldNames;
        public java.lang.String getNewProxyInstance;
        public java.lang.String hDKMBd;
        public java.lang.String isConnected;
        public java.lang.String iwGUEr;
        public java.lang.String uzCIH;
        public java.lang.String valueOf;
        public java.lang.String values;
        public java.lang.String wlaJM;
        public int zsXlph;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity AEQbTJ(int i) {
            this.AEQbTJ = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity AEQbTJ(java.lang.String str) {
            this.AYXKKw = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity AYXKKw(java.lang.String str) {
            this.AkhnZx = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity AhwBna(java.lang.String str) {
            this.fJNWhG = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity AkhnZx(java.lang.String str) {
            this.fARcdN = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity DbNXlk(java.lang.String str) {
            this.getNewProxyInstance = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity EZpvd(java.lang.String str) {
            this.valueOf = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity EZpvd(java.util.List<C57789yoz> list) {
            this.fetchVPNInfo = list;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity KWHzl(int i) {
            this.ejfBZ = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity KWHzl(long j) {
            this.AuCTel = j;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity KWHzl(java.lang.String str) {
            this.KWHzl = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity KWHzl(java.util.List<TaskDescription> list) {
            this.OLrzqt = list;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity KWHzl(JSONObject jSONObject) {
            this.copydefault = jSONObject;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity OLrzqt(int i) {
            this.DbNXlk = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity OLrzqt(java.lang.String str) {
            this.gEmmrt = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity copydefault(int i) {
            this.zsXlph = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity copydefault(NotificationCompat.Extender extender) {
            this.fIwbmz = extender;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity copydefault(java.lang.String str) {
            this.AhwBna = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity copydefault(Application application) {
            this.EZpvd = application;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity djBIcL(java.lang.String str) {
            this.isConnected = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity ejfBZ(java.lang.String str) {
            this.uzCIH = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity fJNWhG(java.lang.String str) {
            this.wlaJM = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity fetchVPNInfo(java.lang.String str) {
            this.getFieldNames = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity gEmmrt(java.lang.String str) {
            this.values = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity isConnected(java.lang.String str) {
            this.hDKMBd = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity valueOf(java.lang.String str) {
            this.djBIcL = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity values(java.lang.String str) {
            this.iwGUEr = str;
            return this;
        }

        public C57789yoz EZpvd() {
            C57789yoz c57789yoz = new C57789yoz();
            c57789yoz.KWHzl(this.fIwbmz);
            c57789yoz.copydefault(this.fetchVPNInfo);
            c57789yoz.OLrzqt(this.AEQbTJ);
            c57789yoz.AYXKKw(this.fJNWhG);
            c57789yoz.fARcdN(this.uzCIH);
            c57789yoz.values(this.iwGUEr);
            c57789yoz.fJNWhG(this.wlaJM);
            c57789yoz.copydefault(this.AYXKKw);
            c57789yoz.AEQbTJ(this.copydefault);
            c57789yoz.AkhnZx(this.getNewProxyInstance);
            c57789yoz.gEmmrt(this.AkhnZx);
            c57789yoz.KWHzl(this.KWHzl);
            c57789yoz.isConnected(this.hDKMBd);
            c57789yoz.djBIcL(this.values);
            c57789yoz.DbNXlk(this.getFieldNames);
            c57789yoz.valueOf(this.isConnected);
            c57789yoz.copydefault(this.DbNXlk);
            c57789yoz.OLrzqt(this.gEmmrt);
            c57789yoz.AhwBna(this.djBIcL);
            c57789yoz.AEQbTJ(this.OLrzqt);
            c57789yoz.AEQbTJ(this.valueOf);
            c57789yoz.OLrzqt(this.EZpvd);
            c57789yoz.EZpvd(this.AhwBna);
            c57789yoz.EZpvd(this.ejfBZ);
            c57789yoz.fetchVPNInfo(this.fARcdN);
            c57789yoz.KWHzl(this.AuCTel);
            c57789yoz.KWHzl(this.zsXlph);
            return c57789yoz;
        }
    }
}
