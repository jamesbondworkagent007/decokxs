package com.onesignal;

import androidx.annotation.Nullable;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.AbstractC57808ypR;
import o.C57805ypO;
import o.C57806ypP;
import o.C57809ypS;
import o.C57837ypu;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class OneSignalStateSynchronizer {
    public static final Object KWHzl = new Object();
    public static HashMap<UserStateSynchronizerType, AbstractC57808ypR> OLrzqt = new HashMap<>();

    public interface TaskDescription {
        void AEQbTJ(ActionBar actionBar);

        void EZpvd(String str);
    }

    public enum UserStateSynchronizerType {
        PUSH,
        EMAIL,
        SMS;

        public boolean isPush() {
            return equals(PUSH);
        }

        public boolean isEmail() {
            return equals(EMAIL);
        }

        public boolean isSMS() {
            return equals(SMS);
        }
    }

    public static class ActionBar {
        public String EZpvd;
        public int KWHzl;

        public ActionBar(int i, String str) {
            this.KWHzl = i;
            this.EZpvd = str;
        }
    }

    public static C57805ypO copydefault() {
        HashMap<UserStateSynchronizerType, AbstractC57808ypR> map = OLrzqt;
        UserStateSynchronizerType userStateSynchronizerType = UserStateSynchronizerType.PUSH;
        if (!map.containsKey(userStateSynchronizerType) || OLrzqt.get(userStateSynchronizerType) == null) {
            synchronized (KWHzl) {
                if (OLrzqt.get(userStateSynchronizerType) == null) {
                    OLrzqt.put(userStateSynchronizerType, new C57805ypO());
                }
            }
        }
        return (C57805ypO) OLrzqt.get(userStateSynchronizerType);
    }

    public static C57806ypP OLrzqt() {
        HashMap<UserStateSynchronizerType, AbstractC57808ypR> map = OLrzqt;
        UserStateSynchronizerType userStateSynchronizerType = UserStateSynchronizerType.EMAIL;
        if (!map.containsKey(userStateSynchronizerType) || OLrzqt.get(userStateSynchronizerType) == null) {
            synchronized (KWHzl) {
                if (OLrzqt.get(userStateSynchronizerType) == null) {
                    OLrzqt.put(userStateSynchronizerType, new C57806ypP());
                }
            }
        }
        return (C57806ypP) OLrzqt.get(userStateSynchronizerType);
    }

    public static C57809ypS AYXKKw() {
        HashMap<UserStateSynchronizerType, AbstractC57808ypR> map = OLrzqt;
        UserStateSynchronizerType userStateSynchronizerType = UserStateSynchronizerType.SMS;
        if (!map.containsKey(userStateSynchronizerType) || OLrzqt.get(userStateSynchronizerType) == null) {
            synchronized (KWHzl) {
                if (OLrzqt.get(userStateSynchronizerType) == null) {
                    OLrzqt.put(userStateSynchronizerType, new C57809ypS());
                }
            }
        }
        return (C57809ypS) OLrzqt.get(userStateSynchronizerType);
    }

    public static List<AbstractC57808ypR> djBIcL() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(copydefault());
        if (OneSignal.gGvvIC()) {
            arrayList.add(OLrzqt());
        }
        if (OneSignal.giSNqX()) {
            arrayList.add(AYXKKw());
        }
        return arrayList;
    }

    public static boolean DbNXlk() {
        boolean newProxyInstance = copydefault().getNewProxyInstance();
        boolean newProxyInstance2 = OLrzqt().getNewProxyInstance();
        boolean newProxyInstance3 = AYXKKw().getNewProxyInstance();
        if (newProxyInstance2) {
            newProxyInstance2 = OLrzqt().values() != null;
        }
        if (newProxyInstance3) {
            newProxyInstance3 = AYXKKw().values() != null;
        }
        return newProxyInstance || newProxyInstance2 || newProxyInstance3;
    }

    public static void EZpvd() {
        copydefault().gEmmrt();
        OLrzqt().gEmmrt();
        AYXKKw().gEmmrt();
    }

    public static void values() {
        copydefault().fIwbmz();
        OLrzqt().fIwbmz();
        AYXKKw().fIwbmz();
    }

    public static void EZpvd(boolean z) {
        copydefault().AYXKKw(z);
        OLrzqt().AYXKKw(z);
        AYXKKw().AYXKKw(z);
    }

    public static void EZpvd(JSONObject jSONObject, @Nullable OneSignal.TaskDescription taskDescription) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("tags", jSONObject);
            copydefault().EZpvd(jSONObjectPut, taskDescription);
            OLrzqt().EZpvd(jSONObjectPut, taskDescription);
            AYXKKw().EZpvd(jSONObjectPut, taskDescription);
        } catch (JSONException e) {
            if (taskDescription != null) {
                taskDescription.copydefault(new OneSignal.ContextWrapper(-1, "Encountered an error attempting to serialize your tags into JSON: " + e.getMessage() + "\n" + e.getStackTrace()));
            }
            e.printStackTrace();
        }
    }

    public static boolean gEmmrt() {
        return copydefault().OLrzqt();
    }

    public static String AEQbTJ() {
        return copydefault().copydefault();
    }

    public static void AEQbTJ(boolean z) {
        copydefault().copydefault(z);
    }

    public static void EZpvd(LocationController.ActionBar actionBar) {
        copydefault().AEQbTJ(actionBar);
        OLrzqt().AEQbTJ(actionBar);
        AYXKKw().AEQbTJ(actionBar);
    }

    public static String AhwBna() {
        return copydefault().values();
    }

    public static AbstractC57808ypR.Application copydefault(boolean z) {
        return copydefault().AEQbTJ(z);
    }

    public static void isConnected() {
        copydefault().uzCIH();
        OLrzqt().uzCIH();
        AYXKKw().uzCIH();
        copydefault().copydefault((String) null);
        OLrzqt().EZpvd((String) null);
        AYXKKw().AEQbTJ((String) null);
        OneSignal.EZpvd(-3660L);
    }

    public static void KWHzl(JSONObject jSONObject, TaskDescription taskDescription) {
        copydefault().OLrzqt(jSONObject, taskDescription);
        OLrzqt().OLrzqt(jSONObject, taskDescription);
        AYXKKw().OLrzqt(jSONObject, taskDescription);
    }

    public static void AEQbTJ(JSONObject jSONObject) {
        copydefault().EZpvd(jSONObject);
    }

    public static void fetchVPNInfo() {
        OLrzqt().AYXKKw();
        AYXKKw().AYXKKw();
    }

    public static void AkhnZx() {
        copydefault().AubY();
        OLrzqt().AubY();
        AYXKKw().AubY();
    }

    public static boolean valueOf() {
        return copydefault().isConnected() || OLrzqt().isConnected() || AYXKKw().isConnected();
    }

    public static void AuCTel() {
        OLrzqt().AubY();
    }

    public static void OLrzqt(String str, String str2, final OneSignal.Fragment fragment) throws JSONException {
        final JSONObject jSONObject = new JSONObject();
        OneSignal.PendingIntent pendingIntent = new OneSignal.PendingIntent() { // from class: com.onesignal.OneSignalStateSynchronizer.4
            @Override // com.onesignal.OneSignal.PendingIntent
            public void OLrzqt(String str3, boolean z) {
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.VERBOSE, "Completed request to update external user id for channel: " + str3 + " and success: " + z);
                try {
                    jSONObject.put(str3, new JSONObject().put("success", z));
                } catch (JSONException e) {
                    OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.ERROR, "Error while adding the success status of external id for channel: " + str3);
                    e.printStackTrace();
                }
                for (AbstractC57808ypR abstractC57808ypR : OneSignalStateSynchronizer.OLrzqt.values()) {
                    if (abstractC57808ypR.fARcdN()) {
                        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.VERBOSE, "External user id handlers are still being processed for channel: " + abstractC57808ypR.fetchVPNInfo() + " , wait until finished before proceeding");
                        return;
                    }
                }
                CallbackThreadManager.Companion.AEQbTJ(new Runnable() { // from class: com.onesignal.OneSignalStateSynchronizer.4.3
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        OneSignal.Fragment fragment2 = fragment;
                        if (fragment2 != null) {
                            fragment2.AEQbTJ(jSONObject);
                        }
                    }
                });
            }
        };
        Iterator<AbstractC57808ypR> it = djBIcL().iterator();
        while (it.hasNext()) {
            it.next().copydefault(str, str2, pendingIntent);
        }
    }

    public static void KWHzl(JSONObject jSONObject, C57837ypu.TaskDescription taskDescription) {
        Iterator<AbstractC57808ypR> it = djBIcL().iterator();
        while (it.hasNext()) {
            it.next().copydefault(jSONObject, taskDescription);
        }
    }

    public static void KWHzl(boolean z) {
        copydefault().KWHzl(z);
        OLrzqt().KWHzl(z);
        AYXKKw().KWHzl(z);
    }
}
