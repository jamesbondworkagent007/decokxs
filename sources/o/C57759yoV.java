package o;

import com.onesignal.OneSignal;
import com.onesignal.influence.domain.OSInfluenceType;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57759yoV {
    public InterfaceC57738yoA AEQbTJ;
    public C57873yqd KWHzl;
    public ActionBar copydefault;

    /* JADX INFO: renamed from: o.yoV$ActionBar */
    public interface ActionBar {
        void copydefault(@androidx.annotation.NonNull java.util.List<C57870yqa> list);
    }

    public C57759yoV(@androidx.annotation.NonNull ActionBar actionBar, C57873yqd c57873yqd, InterfaceC57738yoA interfaceC57738yoA) {
        this.copydefault = actionBar;
        this.KWHzl = c57873yqd;
        this.AEQbTJ = interfaceC57738yoA;
    }

    public void OLrzqt() {
        this.KWHzl.valueOf();
    }

    public void KWHzl(@androidx.annotation.NonNull JSONObject jSONObject, java.util.List<C57870yqa> list) {
        this.AEQbTJ.OLrzqt("OneSignal SessionManager addSessionData with influences: " + list.toString());
        this.KWHzl.KWHzl(jSONObject, list);
        this.AEQbTJ.OLrzqt("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject);
    }

    public void AEQbTJ(OneSignal.AppEntryAction appEntryAction) {
        boolean zOLrzqt;
        java.util.List<AbstractC57813ypW> listAEQbTJ = this.KWHzl.AEQbTJ(appEntryAction);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.AEQbTJ.OLrzqt("OneSignal SessionManager restartSessionIfNeeded with entryAction: " + appEntryAction + "\n channelTrackers: " + listAEQbTJ.toString());
        for (AbstractC57813ypW abstractC57813ypW : listAEQbTJ) {
            JSONArray jSONArrayIsConnected = abstractC57813ypW.isConnected();
            this.AEQbTJ.OLrzqt("OneSignal SessionManager restartSessionIfNeeded lastIds: " + jSONArrayIsConnected);
            C57870yqa c57870yqaOLrzqt = abstractC57813ypW.OLrzqt();
            if (jSONArrayIsConnected.length() > 0) {
                zOLrzqt = OLrzqt(abstractC57813ypW, OSInfluenceType.INDIRECT, null, jSONArrayIsConnected);
            } else {
                zOLrzqt = OLrzqt(abstractC57813ypW, OSInfluenceType.UNATTRIBUTED, null, null);
            }
            if (zOLrzqt) {
                arrayList.add(c57870yqaOLrzqt);
            }
        }
        EZpvd(arrayList);
    }

    public void copydefault(@androidx.annotation.NonNull java.lang.String str) {
        this.AEQbTJ.OLrzqt("OneSignal SessionManager onInAppMessageReceived messageId: " + str);
        AbstractC57813ypW abstractC57813ypWKWHzl = this.KWHzl.KWHzl();
        abstractC57813ypWKWHzl.copydefault(str);
        abstractC57813ypWKWHzl.ejfBZ();
    }

    public void AEQbTJ(@androidx.annotation.NonNull java.lang.String str) {
        this.AEQbTJ.OLrzqt("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: " + str);
        OLrzqt(this.KWHzl.KWHzl(), OSInfluenceType.DIRECT, str, null);
    }

    public void EZpvd() {
        this.AEQbTJ.OLrzqt("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        this.KWHzl.KWHzl().ejfBZ();
    }

    public void KWHzl(@androidx.annotation.Nullable java.lang.String str) {
        this.AEQbTJ.OLrzqt("OneSignal SessionManager onNotificationReceived notificationId: " + str);
        if (str == null || str.isEmpty()) {
            return;
        }
        this.KWHzl.EZpvd().copydefault(str);
    }

    public void OLrzqt(OneSignal.AppEntryAction appEntryAction, @androidx.annotation.Nullable java.lang.String str) {
        this.AEQbTJ.OLrzqt("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: " + str);
        if (str == null || str.isEmpty()) {
            return;
        }
        AEQbTJ(appEntryAction, str);
    }

    public java.util.List<C57870yqa> AEQbTJ() {
        return this.KWHzl.AEQbTJ();
    }

    public java.util.List<C57870yqa> copydefault() {
        return this.KWHzl.copydefault();
    }

    public void KWHzl(OneSignal.AppEntryAction appEntryAction) {
        AEQbTJ(appEntryAction, null);
    }

    public final void AEQbTJ(OneSignal.AppEntryAction appEntryAction, @androidx.annotation.Nullable java.lang.String str) {
        boolean zOLrzqt;
        C57870yqa c57870yqaOLrzqt;
        this.AEQbTJ.OLrzqt("OneSignal SessionManager attemptSessionUpgrade with entryAction: " + appEntryAction);
        AbstractC57813ypW abstractC57813ypWOLrzqt = this.KWHzl.OLrzqt(appEntryAction);
        java.util.List<AbstractC57813ypW> listAEQbTJ = this.KWHzl.AEQbTJ(appEntryAction);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (abstractC57813ypWOLrzqt != null) {
            c57870yqaOLrzqt = abstractC57813ypWOLrzqt.OLrzqt();
            OSInfluenceType oSInfluenceType = OSInfluenceType.DIRECT;
            if (str == null) {
                str = abstractC57813ypWOLrzqt.AhwBna();
            }
            zOLrzqt = OLrzqt(abstractC57813ypWOLrzqt, oSInfluenceType, str, null);
        } else {
            zOLrzqt = false;
            c57870yqaOLrzqt = null;
        }
        if (zOLrzqt) {
            this.AEQbTJ.OLrzqt("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + listAEQbTJ);
            arrayList.add(c57870yqaOLrzqt);
            for (AbstractC57813ypW abstractC57813ypW : listAEQbTJ) {
                if (abstractC57813ypW.gEmmrt().isDirect()) {
                    arrayList.add(abstractC57813ypW.OLrzqt());
                    abstractC57813ypW.ejfBZ();
                }
            }
        }
        this.AEQbTJ.OLrzqt("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for (AbstractC57813ypW abstractC57813ypW2 : listAEQbTJ) {
            if (abstractC57813ypW2.gEmmrt().isUnattributed()) {
                JSONArray jSONArrayIsConnected = abstractC57813ypW2.isConnected();
                if (jSONArrayIsConnected.length() > 0 && !appEntryAction.isAppClose()) {
                    C57870yqa c57870yqaOLrzqt2 = abstractC57813ypW2.OLrzqt();
                    if (OLrzqt(abstractC57813ypW2, OSInfluenceType.INDIRECT, null, jSONArrayIsConnected)) {
                        arrayList.add(c57870yqaOLrzqt2);
                    }
                }
            }
        }
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "Trackers after update attempt: " + this.KWHzl.OLrzqt().toString());
        EZpvd(arrayList);
    }

    public final boolean OLrzqt(@androidx.annotation.NonNull AbstractC57813ypW abstractC57813ypW, @androidx.annotation.NonNull OSInfluenceType oSInfluenceType, @androidx.annotation.Nullable java.lang.String str, @androidx.annotation.Nullable JSONArray jSONArray) {
        if (!KWHzl(abstractC57813ypW, oSInfluenceType, str, jSONArray)) {
            return false;
        }
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.KWHzl(log_level, "OSChannelTracker changed: " + abstractC57813ypW.AYXKKw() + "\nfrom:\ninfluenceType: " + abstractC57813ypW.gEmmrt() + ", directNotificationId: " + abstractC57813ypW.AhwBna() + ", indirectNotificationIds: " + abstractC57813ypW.valueOf() + "\nto:\ninfluenceType: " + oSInfluenceType + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray);
        abstractC57813ypW.EZpvd(oSInfluenceType);
        abstractC57813ypW.AEQbTJ(str);
        abstractC57813ypW.AEQbTJ(jSONArray);
        abstractC57813ypW.EZpvd();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Trackers changed to: ");
        sb.append(this.KWHzl.OLrzqt().toString());
        OneSignal.KWHzl(log_level, sb.toString());
        return true;
    }

    public final boolean KWHzl(@androidx.annotation.NonNull AbstractC57813ypW abstractC57813ypW, @androidx.annotation.NonNull OSInfluenceType oSInfluenceType, @androidx.annotation.Nullable java.lang.String str, @androidx.annotation.Nullable JSONArray jSONArray) {
        if (!oSInfluenceType.equals(abstractC57813ypW.gEmmrt())) {
            return true;
        }
        OSInfluenceType oSInfluenceTypeGEmmrt = abstractC57813ypW.gEmmrt();
        if (!oSInfluenceTypeGEmmrt.isDirect() || abstractC57813ypW.AhwBna() == null || abstractC57813ypW.AhwBna().equals(str)) {
            return oSInfluenceTypeGEmmrt.isIndirect() && abstractC57813ypW.valueOf() != null && abstractC57813ypW.valueOf().length() > 0 && !C57685ynA.KWHzl(abstractC57813ypW.valueOf(), jSONArray);
        }
        return true;
    }

    public final void EZpvd(final java.util.List<C57870yqa> list) {
        this.AEQbTJ.OLrzqt("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + list);
        if (list.size() > 0) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: o.yoV.3
                @Override // java.lang.Runnable
                public void run() {
                    java.lang.Thread.currentThread().setPriority(10);
                    C57759yoV.this.copydefault.copydefault(list);
                }
            }, "OS_END_CURRENT_SESSION").start();
        }
    }
}
