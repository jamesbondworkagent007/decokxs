package com.onesignal;

import androidx.annotation.NonNull;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C57762yoY;
import o.C57772yoi;
import o.C57834ypr;
import o.C57837ypu;
import o.C57870yqa;
import o.InterfaceC57738yoA;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class FocusTimeController {
    public InterfaceC57738yoA AEQbTJ;
    public Object EZpvd = new Object();
    public C57772yoi OLrzqt;
    public Long copydefault;

    public enum FocusEventType {
        BACKGROUND,
        END_SESSION
    }

    public FocusTimeController(C57772yoi c57772yoi, InterfaceC57738yoA interfaceC57738yoA) {
        this.OLrzqt = c57772yoi;
        this.AEQbTJ = interfaceC57738yoA;
    }

    public void copydefault() {
        synchronized (this.EZpvd) {
            this.copydefault = Long.valueOf(OneSignal.aKErDB().AEQbTJ());
            this.AEQbTJ.OLrzqt("Application foregrounded focus time: " + this.copydefault);
        }
    }

    public void EZpvd() {
        Long lAEQbTJ = AEQbTJ();
        synchronized (this.EZpvd) {
            this.AEQbTJ.OLrzqt("Application stopped focus time: " + this.copydefault + " timeElapsed: " + lAEQbTJ);
        }
        if (lAEQbTJ == null) {
            return;
        }
        List<C57870yqa> listCopydefault = OneSignal.RJOkX().copydefault();
        this.OLrzqt.OLrzqt(listCopydefault).OLrzqt(lAEQbTJ.longValue(), listCopydefault);
    }

    public void KWHzl() {
        synchronized (this.EZpvd) {
            this.AEQbTJ.OLrzqt("Application backgrounded focus time: " + this.copydefault);
            this.OLrzqt.copydefault().AEQbTJ();
            this.copydefault = null;
        }
    }

    public void OLrzqt() {
        if (OneSignal.iRxXKY()) {
            return;
        }
        this.OLrzqt.copydefault().djBIcL();
    }

    public void KWHzl(@NonNull List<C57870yqa> list) {
        FocusEventType focusEventType = FocusEventType.END_SESSION;
        if (OLrzqt(list, focusEventType)) {
            return;
        }
        this.OLrzqt.OLrzqt(list).KWHzl(focusEventType);
    }

    public final boolean OLrzqt(@NonNull List<C57870yqa> list, @NonNull FocusEventType focusEventType) {
        Long lAEQbTJ = AEQbTJ();
        if (lAEQbTJ == null) {
            return false;
        }
        this.OLrzqt.OLrzqt(list).copydefault(lAEQbTJ.longValue(), list, focusEventType);
        return true;
    }

    public final Long AEQbTJ() {
        synchronized (this.EZpvd) {
            if (this.copydefault == null) {
                return null;
            }
            long jAEQbTJ = (long) (((OneSignal.aKErDB().AEQbTJ() - this.copydefault.longValue()) / 1000.0d) + 0.5d);
            if (jAEQbTJ >= 1 && jAEQbTJ <= 86400) {
                return Long.valueOf(jAEQbTJ);
            }
            return null;
        }
    }

    public static class Application extends TaskDescription {
        @Override // com.onesignal.FocusTimeController.TaskDescription
        public void KWHzl(List<C57870yqa> list) {
        }

        public Application() {
            this.copydefault = 60L;
            this.KWHzl = "GT_UNSENT_ACTIVE_TIME";
        }

        @Override // com.onesignal.FocusTimeController.TaskDescription
        public void copydefault(@NonNull FocusEventType focusEventType) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, getClass().getSimpleName() + " sendTime with: " + focusEventType);
            if (focusEventType.equals(FocusEventType.END_SESSION)) {
                return;
            }
            AhwBna();
        }

        @Override // com.onesignal.FocusTimeController.TaskDescription
        public List<C57870yqa> EZpvd() {
            return new ArrayList();
        }
    }

    public static class Activity extends TaskDescription {
        public Activity() {
            this.copydefault = 1L;
            this.KWHzl = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        }

        @Override // com.onesignal.FocusTimeController.TaskDescription
        public List<C57870yqa> EZpvd() {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = C57834ypr.copydefault(C57834ypr.copydefault, "PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet()).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(new C57870yqa(it.next()));
                } catch (JSONException e) {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, getClass().getSimpleName() + ": error generation OSInfluence from json object: " + e);
                }
            }
            return arrayList;
        }

        @Override // com.onesignal.FocusTimeController.TaskDescription
        public void KWHzl(List<C57870yqa> list) {
            HashSet hashSet = new HashSet();
            Iterator<C57870yqa> it = list.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(it.next().copydefault());
                } catch (JSONException e) {
                    OneSignal.KWHzl(OneSignal.LOG_LEVEL.ERROR, getClass().getSimpleName() + ": error generation json object OSInfluence: " + e);
                }
            }
            C57834ypr.EZpvd(C57834ypr.copydefault, "PREFS_OS_ATTRIBUTED_INFLUENCES", (Set<String>) hashSet);
        }

        @Override // com.onesignal.FocusTimeController.TaskDescription
        public void AEQbTJ(@NonNull JSONObject jSONObject) {
            OneSignal.RJOkX().KWHzl(jSONObject, EZpvd());
        }

        @Override // com.onesignal.FocusTimeController.TaskDescription
        public void copydefault(@NonNull FocusEventType focusEventType) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, getClass().getSimpleName() + " sendTime with: " + focusEventType);
            if (focusEventType.equals(FocusEventType.END_SESSION)) {
                copydefault();
            } else {
                C57762yoY.valueOf().djBIcL(OneSignal.AEQbTJ);
            }
        }
    }

    public static abstract class TaskDescription {
        public String KWHzl;
        public long copydefault;
        public Long OLrzqt = null;
        public final AtomicBoolean AEQbTJ = new AtomicBoolean();

        public void AEQbTJ(@NonNull JSONObject jSONObject) {
        }

        public abstract List<C57870yqa> EZpvd();

        public abstract void KWHzl(List<C57870yqa> list);

        public abstract void copydefault(@NonNull FocusEventType focusEventType);

        public final void OLrzqt(long j, @NonNull List<C57870yqa> list) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list.toString());
            long jKWHzl = KWHzl();
            KWHzl(list);
            EZpvd(jKWHzl + j);
        }

        public final void EZpvd(long j) {
            this.OLrzqt = Long.valueOf(j);
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.OLrzqt);
            C57834ypr.EZpvd(C57834ypr.copydefault, this.KWHzl, j);
        }

        public final long KWHzl() {
            if (this.OLrzqt == null) {
                this.OLrzqt = Long.valueOf(C57834ypr.OLrzqt(C57834ypr.copydefault, this.KWHzl, 0L));
            }
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.OLrzqt);
            return this.OLrzqt.longValue();
        }

        public final void copydefault(long j, @NonNull List<C57870yqa> list, @NonNull FocusEventType focusEventType) {
            OLrzqt(j, list);
            KWHzl(focusEventType);
        }

        public final void AEQbTJ() {
            List<C57870yqa> listEZpvd = EZpvd();
            long jKWHzl = KWHzl();
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + jKWHzl + " and influences: " + listEZpvd.toString());
            KWHzl(FocusEventType.BACKGROUND);
        }

        public final void KWHzl(FocusEventType focusEventType) {
            if (!OneSignal.flVtFt()) {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, getClass().getSimpleName() + ":sendUnsentTimeNow not possible due to user id null");
                return;
            }
            copydefault(focusEventType);
        }

        public final boolean OLrzqt() {
            return KWHzl() >= this.copydefault;
        }

        public void AhwBna() {
            if (OLrzqt()) {
                C57762yoY.valueOf().djBIcL(OneSignal.AEQbTJ);
            }
        }

        public final void djBIcL() {
            if (OLrzqt()) {
                copydefault();
            }
        }

        public void copydefault() {
            if (this.AEQbTJ.get()) {
                return;
            }
            synchronized (this.AEQbTJ) {
                this.AEQbTJ.set(true);
                if (OLrzqt()) {
                    OLrzqt(KWHzl());
                }
                this.AEQbTJ.set(false);
            }
        }

        public final void OLrzqt(@NonNull String str, @NonNull JSONObject jSONObject) {
            C57837ypu.copydefault("players/" + str + "/on_focus", jSONObject, new C57837ypu.TaskDescription() { // from class: com.onesignal.FocusTimeController.TaskDescription.1
                @Override // o.C57837ypu.TaskDescription
                public void OLrzqt(int i, String str2, Throwable th) {
                    OneSignal.AEQbTJ("sending on_focus Failed", i, th, str2);
                }

                @Override // o.C57837ypu.TaskDescription
                public void OLrzqt(String str2) {
                    TaskDescription.this.EZpvd(0L);
                }
            });
        }

        public final JSONObject AEQbTJ(long j) throws JSONException {
            JSONObject jSONObjectPut = new JSONObject().put(HiAnalyticsConstant.BI_KEY_APP_ID, OneSignal.QbewEr()).put("type", 1).put("state", "ping").put("active_time", j).put("device_type", new OSUtils().uzCIH());
            OneSignal.KWHzl(jSONObjectPut);
            return jSONObjectPut;
        }

        public final void OLrzqt(long j) {
            try {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j);
                JSONObject jSONObjectAEQbTJ = AEQbTJ(j);
                AEQbTJ(jSONObjectAEQbTJ);
                OLrzqt(OneSignal.finit(), jSONObjectAEQbTJ);
                if (OneSignal.gGvvIC()) {
                    OLrzqt(OneSignal.AuCTelauCTel(), AEQbTJ(j));
                }
                if (OneSignal.giSNqX()) {
                    OLrzqt(OneSignal.QfsBiF(), AEQbTJ(j));
                }
                KWHzl(new ArrayList());
            } catch (JSONException e) {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Generating on_focus:JSON Failed.", e);
            }
        }
    }
}
