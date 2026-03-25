package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C57837ypu;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57808ypR {
    public OneSignalStateSynchronizer.UserStateSynchronizerType AEQbTJ;
    public boolean EZpvd;
    public AbstractC57803ypM KWHzl;
    public AbstractC57803ypM values;
    public final java.lang.Object OLrzqt = new java.lang.Object();
    public AtomicBoolean djBIcL = new AtomicBoolean();
    public final Queue<OneSignal.TaskDescription> AkhnZx = new LinkedBlockingQueue();
    public final Queue<OneSignal.PendingIntent> AYXKKw = new LinkedBlockingQueue();
    public final Queue<OneSignalStateSynchronizer.TaskDescription> gEmmrt = new LinkedBlockingQueue();
    public java.util.HashMap<java.lang.Integer, Activity> AhwBna = new java.util.HashMap<>();
    public final java.lang.Object valueOf = new java.lang.Object() { // from class: o.ypR.2
    };
    public boolean fetchVPNInfo = false;

    public abstract java.lang.String EZpvd();

    public abstract void KWHzl(JSONObject jSONObject);

    public abstract void OLrzqt(java.lang.String str);

    public abstract void a_(JSONObject jSONObject);

    public abstract OneSignal.LOG_LEVEL bK_();

    public abstract void bL_();

    public abstract AbstractC57803ypM copydefault(java.lang.String str, boolean z);

    public abstract void copydefault(JSONObject jSONObject);

    public AbstractC57808ypR(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        this.AEQbTJ = userStateSynchronizerType;
    }

    public java.lang.String fetchVPNInfo() {
        return this.AEQbTJ.name().toLowerCase();
    }

    /* JADX INFO: renamed from: o.ypR$Application */
    public static class Application {
        public boolean AEQbTJ;
        public JSONObject copydefault;

        public Application(boolean z, JSONObject jSONObject) {
            this.AEQbTJ = z;
            this.copydefault = jSONObject;
        }
    }

    public java.lang.String values() {
        return AuCTel().copydefault().copydefault("identifier", (java.lang.String) null);
    }

    public boolean fARcdN() {
        return this.AYXKKw.size() > 0;
    }

    /* JADX INFO: renamed from: o.ypR$Activity */
    public class Activity extends android.os.HandlerThread {
        public int AEQbTJ;
        public android.os.Handler KWHzl;
        public int copydefault;

        public Activity(int i) {
            super("OSH_NetworkHandlerThread_" + AbstractC57808ypR.this.AEQbTJ);
            this.copydefault = i;
            start();
            this.KWHzl = new android.os.Handler(getLooper());
        }

        public void copydefault() {
            if (AbstractC57808ypR.this.EZpvd) {
                synchronized (this.KWHzl) {
                    this.AEQbTJ = 0;
                    this.KWHzl.removeCallbacksAndMessages(null);
                    this.KWHzl.postDelayed(AEQbTJ(), 5000L);
                }
            }
        }

        public final java.lang.Runnable AEQbTJ() {
            if (this.copydefault != 0) {
                return null;
            }
            return new java.lang.Runnable() { // from class: o.ypR.Activity.4
                @Override // java.lang.Runnable
                public void run() {
                    if (!AbstractC57808ypR.this.djBIcL.get()) {
                        AbstractC57808ypR.this.AYXKKw(false);
                    }
                }
            };
        }

        public boolean KWHzl() {
            boolean zHasMessages;
            synchronized (this.KWHzl) {
                boolean z = this.AEQbTJ < 3;
                boolean zHasMessages2 = this.KWHzl.hasMessages(0);
                if (z && !zHasMessages2) {
                    this.AEQbTJ++;
                    this.KWHzl.postDelayed(AEQbTJ(), this.AEQbTJ * 15000);
                }
                zHasMessages = this.KWHzl.hasMessages(0);
            }
            return zHasMessages;
        }
    }

    public JSONObject EZpvd(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, java.util.Set<java.lang.String> set) {
        JSONObject jSONObjectEZpvd;
        synchronized (this.OLrzqt) {
            jSONObjectEZpvd = C57685ynA.EZpvd(jSONObject, jSONObject2, jSONObject3, set);
        }
        return jSONObjectEZpvd;
    }

    public AbstractC57803ypM DbNXlk() {
        if (this.KWHzl == null) {
            synchronized (this.OLrzqt) {
                if (this.KWHzl == null) {
                    this.KWHzl = copydefault("CURRENT_STATE", true);
                }
            }
        }
        return this.KWHzl;
    }

    public AbstractC57803ypM AuCTel() {
        if (this.values == null) {
            synchronized (this.OLrzqt) {
                if (this.values == null) {
                    this.values = copydefault("TOSYNC_STATE", true);
                }
            }
        }
        return this.values;
    }

    public void fIwbmz() {
        if (this.KWHzl == null) {
            synchronized (this.OLrzqt) {
                if (this.KWHzl == null) {
                    this.KWHzl = copydefault("CURRENT_STATE", true);
                }
            }
        }
        AuCTel();
    }

    public void gEmmrt() {
        AuCTel().OLrzqt();
        AuCTel().valueOf();
    }

    public boolean getNewProxyInstance() {
        boolean z;
        if (this.values == null) {
            return false;
        }
        synchronized (this.OLrzqt) {
            z = DbNXlk().EZpvd(this.values, hDKMBd()) != null;
            this.values.valueOf();
        }
        return z;
    }

    public final boolean hDKMBd() {
        return (AuCTel().AEQbTJ().copydefault("session") || EZpvd() == null) && !this.fetchVPNInfo;
    }

    public final boolean AuCTelauCTel() {
        return AuCTel().AEQbTJ().copydefault("logoutEmail", false);
    }

    public void AYXKKw(boolean z) {
        this.djBIcL.set(true);
        EZpvd(z);
        this.djBIcL.set(false);
    }

    public final void EZpvd(boolean z) {
        java.lang.String strEZpvd = EZpvd();
        if (AuCTelauCTel() && strEZpvd != null) {
            KWHzl(strEZpvd);
            return;
        }
        if (this.KWHzl == null) {
            fIwbmz();
        }
        boolean z2 = !z && hDKMBd();
        synchronized (this.OLrzqt) {
            JSONObject jSONObjectEZpvd = DbNXlk().EZpvd(AuCTel(), z2);
            JSONObject jSONObjectEZpvd2 = DbNXlk().EZpvd(AuCTel(), (java.util.Set<java.lang.String>) null);
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "UserStateSynchronizer internalSyncUserState from session call: " + z2 + " jsonBody: " + jSONObjectEZpvd);
            if (jSONObjectEZpvd == null) {
                DbNXlk().EZpvd(jSONObjectEZpvd2, (JSONObject) null);
                iwGUEr();
                valueOf();
                AhwBna();
                return;
            }
            AuCTel().valueOf();
            if (!z2) {
                OLrzqt(strEZpvd, jSONObjectEZpvd, jSONObjectEZpvd2);
            } else {
                EZpvd(strEZpvd, jSONObjectEZpvd, jSONObjectEZpvd2);
            }
        }
    }

    public final void KWHzl(java.lang.String str) {
        java.lang.String str2 = "players/" + str + "/email_logout";
        JSONObject jSONObject = new JSONObject();
        try {
            C57686ynB c57686ynBAEQbTJ = DbNXlk().AEQbTJ();
            if (c57686ynBAEQbTJ.KWHzl("email_auth_hash")) {
                jSONObject.put("email_auth_hash", c57686ynBAEQbTJ.EZpvd("email_auth_hash"));
            }
            C57686ynB c57686ynBCopydefault = DbNXlk().copydefault();
            if (c57686ynBCopydefault.KWHzl("parent_player_id")) {
                jSONObject.put("parent_player_id", c57686ynBCopydefault.EZpvd("parent_player_id"));
            }
            jSONObject.put(HiAnalyticsConstant.BI_KEY_APP_ID, c57686ynBCopydefault.EZpvd(HiAnalyticsConstant.BI_KEY_APP_ID));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C57837ypu.copydefault(str2, jSONObject, new C57837ypu.TaskDescription() { // from class: o.ypR.4
            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(int i, java.lang.String str3, java.lang.Throwable th) {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "Failed last request. statusCode: " + i + "\nresponse: " + str3);
                if (AbstractC57808ypR.this.copydefault(i, str3, "already logged out of email")) {
                    AbstractC57808ypR.this.getFieldNames();
                } else if (AbstractC57808ypR.this.copydefault(i, str3, "not a valid device_type")) {
                    AbstractC57808ypR.this.fJNWhG();
                } else {
                    AbstractC57808ypR.this.copydefault(i);
                }
            }

            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(java.lang.String str3) {
                AbstractC57808ypR.this.getFieldNames();
            }
        });
    }

    public final void getFieldNames() {
        AuCTel().KWHzl("logoutEmail");
        this.values.KWHzl("email_auth_hash");
        this.values.copydefault("parent_player_id");
        this.values.copydefault("email");
        this.values.valueOf();
        DbNXlk().KWHzl("email_auth_hash");
        DbNXlk().copydefault("parent_player_id");
        java.lang.String strEZpvd = DbNXlk().copydefault().EZpvd("email");
        DbNXlk().copydefault("email");
        OneSignalStateSynchronizer.AuCTel();
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "Device successfully logged out of email: " + strEZpvd);
        OneSignal.fvQaOB();
    }

    public final void OLrzqt(java.lang.String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (str == null) {
            OneSignal.AEQbTJ(bK_(), "Error updating the user record because of the null user id");
            copydefault(new OneSignal.ContextWrapper(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            djBIcL();
            EZpvd(new OneSignalStateSynchronizer.ActionBar(-1, "Unable to set Language: the current user is not registered with OneSignal"));
            return;
        }
        C57837ypu.AEQbTJ("players/" + str, jSONObject, new C57837ypu.TaskDescription() { // from class: o.ypR.5
            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(int i, java.lang.String str2, java.lang.Throwable th) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                OneSignal.KWHzl(log_level, "Failed PUT sync request with status code: " + i + " and response: " + str2);
                synchronized (AbstractC57808ypR.this.OLrzqt) {
                    if (AbstractC57808ypR.this.copydefault(i, str2, "No user with this id found")) {
                        AbstractC57808ypR.this.fJNWhG();
                    } else {
                        AbstractC57808ypR.this.copydefault(i);
                    }
                }
                if (jSONObject.has("tags")) {
                    AbstractC57808ypR.this.copydefault(new OneSignal.ContextWrapper(i, str2));
                }
                if (jSONObject.has("external_user_id")) {
                    OneSignal.AEQbTJ(log_level, "Error setting external user id for push with status code: " + i + " and message: " + str2);
                    AbstractC57808ypR.this.djBIcL();
                }
                if (jSONObject.has("language")) {
                    AbstractC57808ypR.this.EZpvd(new OneSignalStateSynchronizer.ActionBar(i, str2));
                }
            }

            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(java.lang.String str2) {
                synchronized (AbstractC57808ypR.this.OLrzqt) {
                    AbstractC57808ypR.this.DbNXlk().EZpvd(jSONObject2, jSONObject);
                    AbstractC57808ypR.this.KWHzl(jSONObject);
                }
                if (jSONObject.has("tags")) {
                    AbstractC57808ypR.this.iwGUEr();
                }
                if (jSONObject.has("external_user_id")) {
                    AbstractC57808ypR.this.valueOf();
                }
                if (jSONObject.has("language")) {
                    AbstractC57808ypR.this.AhwBna();
                }
            }
        });
    }

    public final void EZpvd(final java.lang.String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        java.lang.String str2;
        if (str == null) {
            str2 = "players";
        } else {
            str2 = "players/" + str + "/on_session";
        }
        this.fetchVPNInfo = true;
        a_(jSONObject);
        C57837ypu.copydefault(str2, jSONObject, new C57837ypu.TaskDescription() { // from class: o.ypR.3
            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(int i, java.lang.String str3, java.lang.Throwable th) {
                synchronized (AbstractC57808ypR.this.OLrzqt) {
                    AbstractC57808ypR.this.fetchVPNInfo = false;
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "Failed last request. statusCode: " + i + "\nresponse: " + str3);
                    if (AbstractC57808ypR.this.copydefault(i, str3, "not a valid device_type")) {
                        AbstractC57808ypR.this.fJNWhG();
                    } else {
                        AbstractC57808ypR.this.copydefault(i);
                    }
                }
            }

            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(java.lang.String str3) {
                synchronized (AbstractC57808ypR.this.OLrzqt) {
                    AbstractC57808ypR abstractC57808ypR = AbstractC57808ypR.this;
                    abstractC57808ypR.fetchVPNInfo = false;
                    abstractC57808ypR.DbNXlk().EZpvd(jSONObject2, jSONObject);
                    try {
                        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "doCreateOrNewSession:response: " + str3);
                        JSONObject jSONObject3 = new JSONObject(str3);
                        if (jSONObject3.has("id")) {
                            java.lang.String strOptString = jSONObject3.optString("id");
                            AbstractC57808ypR.this.OLrzqt(strOptString);
                            OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "Device registered, UserId = " + strOptString);
                        } else {
                            OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "session sent, UserId = " + str);
                        }
                        AbstractC57808ypR.this.ejfBZ().OLrzqt("session", java.lang.Boolean.FALSE);
                        AbstractC57808ypR.this.ejfBZ().valueOf();
                        if (jSONObject3.has("in_app_messages")) {
                            OneSignal.sSMYrx().KWHzl(jSONObject3.getJSONArray("in_app_messages"));
                        }
                        AbstractC57808ypR.this.KWHzl(jSONObject);
                    } catch (JSONException e) {
                        OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "ERROR parsing on_session or create JSON Response.", e);
                    }
                }
            }
        });
    }

    public final void copydefault(int i) {
        if (i == 403) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.FATAL, "403 error updating player, omitting further retries!");
            AkhnZx();
        } else {
            if (copydefault((java.lang.Integer) 0).KWHzl()) {
                return;
            }
            AkhnZx();
        }
    }

    public final void AkhnZx() {
        JSONObject jSONObjectEZpvd = DbNXlk().EZpvd(this.values, false);
        if (jSONObjectEZpvd != null) {
            copydefault(jSONObjectEZpvd);
        }
        if (AuCTel().AEQbTJ().copydefault("logoutEmail", false)) {
            OneSignal.fFgQHt();
        }
    }

    public final boolean copydefault(int i, java.lang.String str, java.lang.String str2) {
        if (i == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("errors")) {
                    return jSONObject.optString("errors").contains(str2);
                }
                return false;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public Activity copydefault(java.lang.Integer num) {
        Activity activity;
        synchronized (this.valueOf) {
            if (!this.AhwBna.containsKey(num)) {
                this.AhwBna.put(num, new Activity(num.intValue()));
            }
            activity = this.AhwBna.get(num);
        }
        return activity;
    }

    public AbstractC57803ypM ejfBZ() {
        if (this.values == null) {
            this.values = DbNXlk().EZpvd("TOSYNC_STATE");
        }
        bL_();
        return this.values;
    }

    public void OLrzqt(JSONObject jSONObject, @androidx.annotation.Nullable OneSignalStateSynchronizer.TaskDescription taskDescription) {
        if (taskDescription != null) {
            this.gEmmrt.add(taskDescription);
        }
        ejfBZ().OLrzqt(jSONObject, (java.util.Set<java.lang.String>) null);
    }

    public void AubY() {
        try {
            synchronized (this.OLrzqt) {
                ejfBZ().OLrzqt("session", java.lang.Boolean.TRUE);
                ejfBZ().valueOf();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public boolean isConnected() {
        return ejfBZ().AEQbTJ().copydefault("session");
    }

    public void EZpvd(JSONObject jSONObject, @androidx.annotation.Nullable OneSignal.TaskDescription taskDescription) {
        if (taskDescription != null) {
            this.AkhnZx.add(taskDescription);
        }
        ejfBZ().OLrzqt(jSONObject, (java.util.Set<java.lang.String>) null);
    }

    public void copydefault(java.lang.String str, java.lang.String str2, OneSignal.PendingIntent pendingIntent) throws JSONException {
        if (pendingIntent != null) {
            this.AYXKKw.add(pendingIntent);
        }
        AbstractC57803ypM abstractC57803ypMEjfBZ = ejfBZ();
        abstractC57803ypMEjfBZ.EZpvd("external_user_id", str);
        if (str2 != null) {
            abstractC57803ypMEjfBZ.EZpvd("external_user_id_auth_hash", str2);
        }
    }

    public final void fJNWhG() {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "Creating new player based on missing player_id noted above.");
        OneSignal.fvQaOB();
        uzCIH();
        OLrzqt((java.lang.String) null);
        bL_();
    }

    public void uzCIH() {
        DbNXlk().copydefault(new JSONObject());
        DbNXlk().valueOf();
    }

    public void AEQbTJ(LocationController.ActionBar actionBar) {
        ejfBZ().AEQbTJ(actionBar);
    }

    public void copydefault(JSONObject jSONObject, C57837ypu.TaskDescription taskDescription) {
        C57837ypu.KWHzl("players/" + EZpvd() + "/on_purchase", jSONObject, taskDescription);
    }

    public void KWHzl(boolean z) {
        boolean z2 = this.EZpvd != z;
        this.EZpvd = z;
        if (z2 && z) {
            bL_();
        }
    }

    public final void iwGUEr() {
        JSONObject jSONObject = OneSignalStateSynchronizer.copydefault(false).copydefault;
        while (true) {
            OneSignal.TaskDescription taskDescriptionPoll = this.AkhnZx.poll();
            if (taskDescriptionPoll == null) {
                return;
            } else {
                taskDescriptionPoll.EZpvd(jSONObject);
            }
        }
    }

    public final void copydefault(OneSignal.ContextWrapper contextWrapper) {
        while (true) {
            OneSignal.TaskDescription taskDescriptionPoll = this.AkhnZx.poll();
            if (taskDescriptionPoll == null) {
                return;
            } else {
                taskDescriptionPoll.copydefault(contextWrapper);
            }
        }
    }

    public final void valueOf() {
        while (true) {
            OneSignal.PendingIntent pendingIntentPoll = this.AYXKKw.poll();
            if (pendingIntentPoll == null) {
                return;
            } else {
                pendingIntentPoll.OLrzqt(fetchVPNInfo(), true);
            }
        }
    }

    public final void djBIcL() {
        while (true) {
            OneSignal.PendingIntent pendingIntentPoll = this.AYXKKw.poll();
            if (pendingIntentPoll == null) {
                return;
            } else {
                pendingIntentPoll.OLrzqt(fetchVPNInfo(), false);
            }
        }
    }

    public final void AhwBna() {
        java.lang.String strAEQbTJ = OneSignalStateSynchronizer.AEQbTJ();
        while (true) {
            OneSignalStateSynchronizer.TaskDescription taskDescriptionPoll = this.gEmmrt.poll();
            if (taskDescriptionPoll == null) {
                return;
            } else {
                taskDescriptionPoll.EZpvd(strAEQbTJ);
            }
        }
    }

    public final void EZpvd(OneSignalStateSynchronizer.ActionBar actionBar) {
        while (true) {
            OneSignalStateSynchronizer.TaskDescription taskDescriptionPoll = this.gEmmrt.poll();
            if (taskDescriptionPoll == null) {
                return;
            } else {
                taskDescriptionPoll.AEQbTJ(actionBar);
            }
        }
    }
}
