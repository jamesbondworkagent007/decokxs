package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.onesignal.CallbackThreadManager;
import com.onesignal.OSInAppMessageAction;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.WebViewManager;
import java.util.Date;
import o.C57710ynZ;
import o.C57761yoX;
import o.C57783yot;
import o.C57792ypB;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57774yok extends C57709ynY implements C57710ynZ.ActionBar, C57761yoX.StateListAnimator {
    public AbstractC57775yol AhwBna;
    public final java.util.ArrayList<C57776yom> DbNXlk;
    public final java.util.Set<java.lang.String> KWHzl;
    public final java.util.Set<java.lang.String> copydefault;
    public final C57817ypa fARcdN;
    public C57761yoX fIwbmz;
    public C57820ypd fJNWhG;
    public final InterfaceC57738yoA fetchVPNInfo;
    public final java.util.Set<java.lang.String> gEmmrt;
    public final java.util.Set<java.lang.String> getFieldNames;
    public Date isConnected;
    public C57783yot valueOf;
    public final C57872yqc values;
    public static final java.lang.Object OLrzqt = new java.lang.Object();
    public static java.util.ArrayList<java.lang.String> AEQbTJ = new java.util.ArrayList<java.lang.String>() { // from class: com.onesignal.OSInAppMessageController$1
        {
            add("android");
            add("app");
            add("all");
        }
    };
    public java.util.List<C57776yom> AuCTel = null;
    public AbstractC57779yop EZpvd = null;
    public boolean djBIcL = true;
    public boolean AYXKKw = false;
    public java.lang.String hDKMBd = "";
    public C57770yog ejfBZ = null;
    public boolean iwGUEr = false;
    public java.util.ArrayList<C57776yom> AkhnZx = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.EZpvd != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.AYXKKw;
    }

    public C57774yok(C57830ypn c57830ypn, C57817ypa c57817ypa, InterfaceC57738yoA interfaceC57738yoA, InterfaceC57757yoT interfaceC57757yoT, C57872yqc c57872yqc) {
        this.isConnected = null;
        this.fARcdN = c57817ypa;
        java.util.Set<java.lang.String> setAuCTel = OSUtils.AuCTel();
        this.copydefault = setAuCTel;
        this.DbNXlk = new java.util.ArrayList<>();
        java.util.Set<java.lang.String> setAuCTel2 = OSUtils.AuCTel();
        this.gEmmrt = setAuCTel2;
        java.util.Set<java.lang.String> setAuCTel3 = OSUtils.AuCTel();
        this.getFieldNames = setAuCTel3;
        java.util.Set<java.lang.String> setAuCTel4 = OSUtils.AuCTel();
        this.KWHzl = setAuCTel4;
        this.fJNWhG = new C57820ypd(this);
        this.fIwbmz = new C57761yoX(this);
        this.values = c57872yqc;
        this.fetchVPNInfo = interfaceC57738yoA;
        C57783yot c57783yotCopydefault = copydefault(c57830ypn, interfaceC57738yoA, interfaceC57757yoT);
        this.valueOf = c57783yotCopydefault;
        java.util.Set<java.lang.String> setAEQbTJ = c57783yotCopydefault.AEQbTJ();
        if (setAEQbTJ != null) {
            setAuCTel.addAll(setAEQbTJ);
        }
        java.util.Set<java.lang.String> setKWHzl = this.valueOf.KWHzl();
        if (setKWHzl != null) {
            setAuCTel2.addAll(setKWHzl);
        }
        java.util.Set<java.lang.String> setDjBIcL = this.valueOf.djBIcL();
        if (setDjBIcL != null) {
            setAuCTel3.addAll(setDjBIcL);
        }
        java.util.Set<java.lang.String> setOLrzqt = this.valueOf.OLrzqt();
        if (setOLrzqt != null) {
            setAuCTel4.addAll(setOLrzqt);
        }
        Date dateGEmmrt = this.valueOf.gEmmrt();
        if (dateGEmmrt != null) {
            this.isConnected = dateGEmmrt;
        }
        gEmmrt();
    }

    public C57783yot copydefault(C57830ypn c57830ypn, InterfaceC57738yoA interfaceC57738yoA, InterfaceC57757yoT interfaceC57757yoT) {
        if (this.valueOf == null) {
            this.valueOf = new C57783yot(c57830ypn, interfaceC57738yoA, interfaceC57757yoT);
        }
        return this.valueOf;
    }

    public void gEmmrt() {
        this.fARcdN.KWHzl(new RunnableC57717yng() { // from class: o.yok.10
            @Override // o.RunnableC57717yng, java.lang.Runnable
            public void run() {
                super.run();
                synchronized (C57774yok.OLrzqt) {
                    C57774yok c57774yok = C57774yok.this;
                    c57774yok.AuCTel = c57774yok.valueOf.copydefault();
                    C57774yok.this.fetchVPNInfo.OLrzqt("Retrieved IAMs from DB redisplayedInAppMessages: " + C57774yok.this.AuCTel.toString());
                }
            }
        });
        this.fARcdN.copydefault();
    }

    public boolean fetchVPNInfo() {
        boolean z;
        synchronized (OLrzqt) {
            z = this.AuCTel == null && this.fARcdN.OLrzqt();
        }
        return z;
    }

    public void EZpvd(java.lang.Runnable runnable) {
        synchronized (OLrzqt) {
            if (fetchVPNInfo()) {
                this.fetchVPNInfo.OLrzqt("Delaying task due to redisplay data not retrieved yet");
                this.fARcdN.KWHzl(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public void AhwBna() {
        C57710ynZ.KWHzl();
    }

    public void AYXKKw() {
        if (!this.AkhnZx.isEmpty()) {
            this.fetchVPNInfo.OLrzqt("initWithCachedInAppMessages with already in memory messages: " + this.AkhnZx);
            return;
        }
        java.lang.String strAYXKKw = this.valueOf.AYXKKw();
        this.fetchVPNInfo.OLrzqt("initWithCachedInAppMessages: " + strAYXKKw);
        if (strAYXKKw == null || strAYXKKw.isEmpty()) {
            return;
        }
        synchronized (OLrzqt) {
            try {
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (this.AkhnZx.isEmpty()) {
                copydefault(new JSONArray(strAYXKKw));
            }
        }
    }

    public void KWHzl(@androidx.annotation.NonNull final JSONArray jSONArray) throws JSONException {
        this.valueOf.EZpvd(jSONArray.toString());
        EZpvd(new java.lang.Runnable() { // from class: o.yok.7
            @Override // java.lang.Runnable
            public void run() {
                C57774yok.this.djBIcL();
                try {
                    C57774yok.this.copydefault(jSONArray);
                } catch (JSONException e) {
                    C57774yok.this.fetchVPNInfo.KWHzl("ERROR processing InAppMessageJson JSON Response.", e);
                }
            }
        });
    }

    public final void djBIcL() {
        java.util.Iterator<C57776yom> it = this.AuCTel.iterator();
        while (it.hasNext()) {
            it.next().EZpvd(false);
        }
    }

    public final void copydefault(@androidx.annotation.NonNull JSONArray jSONArray) throws JSONException {
        synchronized (OLrzqt) {
            java.util.ArrayList<C57776yom> arrayList = new java.util.ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                C57776yom c57776yom = new C57776yom(jSONArray.getJSONObject(i));
                if (c57776yom.copydefault != null) {
                    arrayList.add(c57776yom);
                }
            }
            this.AkhnZx = arrayList;
        }
        AEQbTJ();
    }

    public final void AEQbTJ() {
        this.fetchVPNInfo.OLrzqt("Starting evaluateInAppMessages");
        if (fetchVPNInfo()) {
            this.fARcdN.KWHzl(new java.lang.Runnable() { // from class: o.yok.6
                @Override // java.lang.Runnable
                public void run() {
                    C57774yok.this.fetchVPNInfo.OLrzqt("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
                    C57774yok.this.AEQbTJ();
                }
            });
            return;
        }
        for (C57776yom c57776yom : this.AkhnZx) {
            if (this.fJNWhG.EZpvd(c57776yom)) {
                isConnected(c57776yom);
                if (!this.copydefault.contains(c57776yom.copydefault) && !c57776yom.gEmmrt()) {
                    AkhnZx(c57776yom);
                }
            }
        }
    }

    public final java.lang.String fetchVPNInfo(@androidx.annotation.NonNull C57776yom c57776yom) {
        java.lang.String strOLrzqt = this.values.OLrzqt();
        for (java.lang.String str : AEQbTJ) {
            if (c57776yom.AkhnZx.containsKey(str)) {
                java.util.HashMap<java.lang.String, java.lang.String> map = c57776yom.AkhnZx.get(str);
                if (map.containsKey(strOLrzqt)) {
                    return map.get(strOLrzqt);
                }
                return map.get("default");
            }
        }
        return null;
    }

    public void valueOf(@androidx.annotation.NonNull final C57776yom c57776yom) {
        djBIcL(c57776yom);
        if (c57776yom.AhwBna || this.gEmmrt.contains(c57776yom.copydefault)) {
            return;
        }
        this.gEmmrt.add(c57776yom.copydefault);
        java.lang.String strFetchVPNInfo = fetchVPNInfo(c57776yom);
        if (strFetchVPNInfo == null) {
            return;
        }
        this.valueOf.EZpvd(OneSignal.AhwBna, OneSignal.finit(), strFetchVPNInfo, new OSUtils().uzCIH(), c57776yom.copydefault, this.gEmmrt, new C57783yot.TaskDescription() { // from class: o.yok.9
            @Override // o.C57783yot.TaskDescription
            public void OLrzqt(java.lang.String str) {
            }

            @Override // o.C57783yot.TaskDescription
            public void KWHzl(java.lang.String str) {
                C57774yok.this.gEmmrt.remove(c57776yom.copydefault);
            }
        });
    }

    public void EZpvd(@androidx.annotation.NonNull C57776yom c57776yom, @androidx.annotation.NonNull JSONObject jSONObject) {
        C57778yoo c57778yoo = new C57778yoo(jSONObject);
        if (c57776yom.AhwBna) {
            return;
        }
        OLrzqt(c57776yom, c57778yoo);
    }

    public void OLrzqt(@androidx.annotation.NonNull C57776yom c57776yom, @androidx.annotation.NonNull JSONObject jSONObject) throws JSONException {
        OSInAppMessageAction oSInAppMessageAction = new OSInAppMessageAction(jSONObject);
        oSInAppMessageAction.KWHzl(c57776yom.djBIcL());
        OLrzqt(c57776yom.copydefault, oSInAppMessageAction);
        KWHzl(c57776yom, oSInAppMessageAction.copydefault());
        OLrzqt(oSInAppMessageAction);
        KWHzl(c57776yom, oSInAppMessageAction);
        KWHzl(oSInAppMessageAction);
        copydefault(c57776yom.copydefault, oSInAppMessageAction.AEQbTJ());
    }

    public void AEQbTJ(@androidx.annotation.NonNull C57776yom c57776yom, @androidx.annotation.NonNull JSONObject jSONObject) throws JSONException {
        OSInAppMessageAction oSInAppMessageAction = new OSInAppMessageAction(jSONObject);
        oSInAppMessageAction.KWHzl(c57776yom.djBIcL());
        OLrzqt(c57776yom.copydefault, oSInAppMessageAction);
        KWHzl(c57776yom, oSInAppMessageAction.copydefault());
        OLrzqt(oSInAppMessageAction);
        AEQbTJ(oSInAppMessageAction);
    }

    public void gEmmrt(@androidx.annotation.NonNull C57776yom c57776yom) {
        AbstractC57775yol abstractC57775yol = this.AhwBna;
        if (abstractC57775yol == null) {
            this.fetchVPNInfo.EZpvd("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
        } else {
            abstractC57775yol.AEQbTJ(c57776yom);
        }
    }

    public void djBIcL(@androidx.annotation.NonNull C57776yom c57776yom) {
        AbstractC57775yol abstractC57775yol = this.AhwBna;
        if (abstractC57775yol == null) {
            this.fetchVPNInfo.EZpvd("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
        } else {
            abstractC57775yol.EZpvd(c57776yom);
        }
    }

    public void AhwBna(@androidx.annotation.NonNull C57776yom c57776yom) {
        AbstractC57775yol abstractC57775yol = this.AhwBna;
        if (abstractC57775yol == null) {
            this.fetchVPNInfo.EZpvd("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
        } else {
            abstractC57775yol.OLrzqt(c57776yom);
        }
    }

    public void AEQbTJ(@androidx.annotation.NonNull C57776yom c57776yom) {
        AbstractC57775yol abstractC57775yol = this.AhwBna;
        if (abstractC57775yol == null) {
            this.fetchVPNInfo.EZpvd("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
        } else {
            abstractC57775yol.KWHzl(c57776yom);
        }
    }

    public final void AEQbTJ(OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.KWHzl() != null) {
            this.fetchVPNInfo.OLrzqt("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + oSInAppMessageAction.KWHzl().toString());
        }
        if (oSInAppMessageAction.AEQbTJ().size() > 0) {
            this.fetchVPNInfo.OLrzqt("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + oSInAppMessageAction.AEQbTJ().toString());
        }
    }

    public final void KWHzl(C57776yom c57776yom, java.util.List<AbstractC57779yop> list) {
        if (list.size() > 0) {
            this.fetchVPNInfo.OLrzqt("IAM showing prompts from IAM: " + c57776yom.toString());
            WebViewManager.EZpvd();
            OLrzqt(c57776yom, list);
        }
    }

    public final void OLrzqt(final C57776yom c57776yom, final java.util.List<AbstractC57779yop> list) {
        java.util.Iterator<AbstractC57779yop> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC57779yop next = it.next();
            if (!next.AEQbTJ()) {
                this.EZpvd = next;
                break;
            }
        }
        if (this.EZpvd != null) {
            this.fetchVPNInfo.OLrzqt("IAM prompt to handle: " + this.EZpvd.toString());
            this.EZpvd.OLrzqt(true);
            this.EZpvd.copydefault(new OneSignal.TaskStackBuilder() { // from class: o.yok.15
                @Override // com.onesignal.OneSignal.TaskStackBuilder
                public void KWHzl(OneSignal.PromptActionResult promptActionResult) {
                    C57774yok.this.EZpvd = null;
                    C57774yok.this.fetchVPNInfo.OLrzqt("IAM prompt to handle finished with result: " + promptActionResult);
                    C57776yom c57776yom2 = c57776yom;
                    if (!c57776yom2.AhwBna || promptActionResult != OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                        C57774yok.this.OLrzqt(c57776yom2, (java.util.List<AbstractC57779yop>) list);
                    } else {
                        C57774yok.this.copydefault(c57776yom2, (java.util.List<AbstractC57779yop>) list);
                    }
                }
            });
            return;
        }
        this.fetchVPNInfo.OLrzqt("No IAM prompt to handle, dismiss message: " + c57776yom.copydefault);
        copydefault(c57776yom);
    }

    public final void copydefault(final C57776yom c57776yom, final java.util.List<AbstractC57779yop> list) {
        java.lang.String string = OneSignal.AEQbTJ.getString(C57792ypB.ActionBar.OLrzqt);
        new AlertDialog.Builder(OneSignal.getNewProxyInstance()).setTitle(string).setMessage(OneSignal.AEQbTJ.getString(C57792ypB.ActionBar.AEQbTJ)).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: o.yok.14
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                C57774yok.this.OLrzqt(c57776yom, (java.util.List<AbstractC57779yop>) list);
            }
        }).show();
    }

    public final void copydefault(java.lang.String str, @androidx.annotation.NonNull java.util.List<C57781yor> list) {
        OneSignal.RJOkX().AEQbTJ(str);
        OneSignal.copydefault(list);
    }

    public final void KWHzl(@androidx.annotation.NonNull OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.KWHzl() != null) {
            C57786yow c57786yowKWHzl = oSInAppMessageAction.KWHzl();
            if (c57786yowKWHzl.KWHzl() != null) {
                OneSignal.AEQbTJ(c57786yowKWHzl.KWHzl());
            }
            if (c57786yowKWHzl.EZpvd() != null) {
                OneSignal.OLrzqt(c57786yowKWHzl.EZpvd(), (OneSignal.TaskDescription) null);
            }
        }
    }

    public final void OLrzqt(@androidx.annotation.NonNull final java.lang.String str, @androidx.annotation.NonNull final OSInAppMessageAction oSInAppMessageAction) {
        if (OneSignal.getFieldNames == null) {
            return;
        }
        CallbackThreadManager.Companion.AEQbTJ(new java.lang.Runnable() { // from class: o.yok.12
            @Override // java.lang.Runnable
            public void run() {
                OneSignal.RJOkX().AEQbTJ(str);
                OneSignal.getFieldNames.OLrzqt(oSInAppMessageAction);
            }
        });
    }

    public final void OLrzqt(@androidx.annotation.NonNull OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.OLrzqt() == null || oSInAppMessageAction.OLrzqt().isEmpty()) {
            return;
        }
        if (oSInAppMessageAction.AYXKKw() == OSInAppMessageAction.OSInAppMessageActionUrlType.BROWSER) {
            OSUtils.copydefault(oSInAppMessageAction.OLrzqt());
        } else if (oSInAppMessageAction.AYXKKw() == OSInAppMessageAction.OSInAppMessageActionUrlType.IN_APP_WEBVIEW) {
            C57829ypm.copydefault(oSInAppMessageAction.OLrzqt(), true);
        }
    }

    public final void OLrzqt(@androidx.annotation.NonNull C57776yom c57776yom, @androidx.annotation.NonNull C57778yoo c57778yoo) {
        java.lang.String strFetchVPNInfo = fetchVPNInfo(c57776yom);
        if (strFetchVPNInfo == null) {
            return;
        }
        java.lang.String strKWHzl = c57778yoo.KWHzl();
        final java.lang.String str = c57776yom.copydefault + strKWHzl;
        if (this.getFieldNames.contains(str)) {
            this.fetchVPNInfo.EZpvd("Already sent page impression for id: " + strKWHzl);
            return;
        }
        this.getFieldNames.add(str);
        this.valueOf.OLrzqt(OneSignal.AhwBna, OneSignal.finit(), strFetchVPNInfo, new OSUtils().uzCIH(), c57776yom.copydefault, strKWHzl, this.getFieldNames, new C57783yot.TaskDescription() { // from class: o.yok.11
            @Override // o.C57783yot.TaskDescription
            public void OLrzqt(java.lang.String str2) {
            }

            @Override // o.C57783yot.TaskDescription
            public void KWHzl(java.lang.String str2) {
                C57774yok.this.getFieldNames.remove(str);
            }
        });
    }

    public final void KWHzl(@androidx.annotation.NonNull final C57776yom c57776yom, @androidx.annotation.NonNull OSInAppMessageAction oSInAppMessageAction) {
        java.lang.String strFetchVPNInfo = fetchVPNInfo(c57776yom);
        if (strFetchVPNInfo == null) {
            return;
        }
        final java.lang.String strEZpvd = oSInAppMessageAction.EZpvd();
        if (!(c57776yom.OLrzqt().EZpvd() && c57776yom.KWHzl(strEZpvd)) && this.KWHzl.contains(strEZpvd)) {
            return;
        }
        this.KWHzl.add(strEZpvd);
        c57776yom.OLrzqt(strEZpvd);
        this.valueOf.AEQbTJ(OneSignal.AhwBna, OneSignal.finit(), strFetchVPNInfo, new OSUtils().uzCIH(), c57776yom.copydefault, strEZpvd, oSInAppMessageAction.valueOf(), this.KWHzl, new C57783yot.TaskDescription() { // from class: o.yok.1
            @Override // o.C57783yot.TaskDescription
            public void OLrzqt(java.lang.String str) {
            }

            @Override // o.C57783yot.TaskDescription
            public void KWHzl(java.lang.String str) {
                C57774yok.this.KWHzl.remove(strEZpvd);
                c57776yom.copydefault(strEZpvd);
            }
        });
    }

    public final void isConnected(C57776yom c57776yom) {
        boolean zContains = this.copydefault.contains(c57776yom.copydefault);
        int iIndexOf = this.AuCTel.indexOf(c57776yom);
        if (!zContains || iIndexOf == -1) {
            return;
        }
        C57776yom c57776yom2 = this.AuCTel.get(iIndexOf);
        c57776yom.OLrzqt().copydefault(c57776yom2.OLrzqt());
        c57776yom.EZpvd(c57776yom2.valueOf());
        boolean zKWHzl = KWHzl(c57776yom);
        this.fetchVPNInfo.OLrzqt("setDataForRedisplay: " + c57776yom.toString() + " triggerHasChanged: " + zKWHzl);
        if (zKWHzl && c57776yom.OLrzqt().KWHzl() && c57776yom.OLrzqt().djBIcL()) {
            this.fetchVPNInfo.OLrzqt("setDataForRedisplay message available for redisplay: " + c57776yom.copydefault);
            this.copydefault.remove(c57776yom.copydefault);
            this.gEmmrt.remove(c57776yom.copydefault);
            this.getFieldNames.clear();
            this.valueOf.gEmmrt(this.getFieldNames);
            c57776yom.AEQbTJ();
        }
    }

    public final boolean KWHzl(C57776yom c57776yom) {
        if (this.fJNWhG.OLrzqt(c57776yom)) {
            return !c57776yom.valueOf();
        }
        return c57776yom.AYXKKw() || (!c57776yom.valueOf() && c57776yom.fetchVPNInfo.isEmpty());
    }

    public final void AkhnZx(@androidx.annotation.NonNull C57776yom c57776yom) {
        synchronized (this.DbNXlk) {
            if (!this.DbNXlk.contains(c57776yom)) {
                this.DbNXlk.add(c57776yom);
                this.fetchVPNInfo.OLrzqt("In app message with id: " + c57776yom.copydefault + ", added to the queue");
            }
            EZpvd();
        }
    }

    public final void EZpvd() {
        synchronized (this.DbNXlk) {
            if (!this.fIwbmz.KWHzl()) {
                this.fetchVPNInfo.AEQbTJ("In app message not showing due to system condition not correct");
                return;
            }
            this.fetchVPNInfo.OLrzqt("displayFirstIAMOnQueue: " + this.DbNXlk);
            if (this.DbNXlk.size() > 0 && !valueOf()) {
                this.fetchVPNInfo.OLrzqt("No IAM showing currently, showing first item in the queue!");
                EZpvd(this.DbNXlk.get(0));
                return;
            }
            this.fetchVPNInfo.OLrzqt("In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: " + valueOf());
        }
    }

    public void copydefault(@androidx.annotation.NonNull C57776yom c57776yom) {
        copydefault(c57776yom, false);
    }

    public void copydefault(@androidx.annotation.NonNull C57776yom c57776yom, boolean z) {
        if (!c57776yom.AhwBna) {
            this.copydefault.add(c57776yom.copydefault);
            if (!z) {
                this.valueOf.KWHzl(this.copydefault);
                this.isConnected = new Date();
                AYXKKw(c57776yom);
            }
            this.fetchVPNInfo.OLrzqt("OSInAppMessageController messageWasDismissed dismissedMessages: " + this.copydefault.toString());
        }
        if (!DbNXlk()) {
            AEQbTJ(c57776yom);
        }
        OLrzqt(c57776yom);
    }

    public final void OLrzqt(@androidx.annotation.Nullable C57776yom c57776yom) {
        OneSignal.RJOkX().EZpvd();
        if (DbNXlk()) {
            this.fetchVPNInfo.OLrzqt("Stop evaluateMessageDisplayQueue because prompt is currently displayed");
            return;
        }
        this.AYXKKw = false;
        synchronized (this.DbNXlk) {
            if (c57776yom != null) {
                if (!c57776yom.AhwBna && this.DbNXlk.size() > 0) {
                    if (!this.DbNXlk.contains(c57776yom)) {
                        this.fetchVPNInfo.OLrzqt("Message already removed from the queue!");
                        return;
                    }
                    java.lang.String str = this.DbNXlk.remove(0).copydefault;
                    this.fetchVPNInfo.OLrzqt("In app message with id: " + str + ", dismissed (removed) from the queue!");
                }
            }
            if (this.DbNXlk.size() > 0) {
                this.fetchVPNInfo.OLrzqt("In app message on queue available: " + this.DbNXlk.get(0).copydefault);
                EZpvd(this.DbNXlk.get(0));
            } else {
                this.fetchVPNInfo.OLrzqt("In app message dismissed evaluating messages");
                AEQbTJ();
            }
        }
    }

    public final void AYXKKw(final C57776yom c57776yom) {
        c57776yom.OLrzqt().OLrzqt(OneSignal.aKErDB().KWHzl() / 1000);
        c57776yom.OLrzqt().AEQbTJ();
        c57776yom.copydefault(false);
        c57776yom.EZpvd(true);
        AEQbTJ(new RunnableC57717yng() { // from class: o.yok.3
            @Override // o.RunnableC57717yng, java.lang.Runnable
            public void run() {
                super.run();
                C57774yok.this.valueOf.OLrzqt(c57776yom);
                C57774yok.this.valueOf.EZpvd(C57774yok.this.isConnected);
            }
        }, "OS_IAM_DB_ACCESS");
        int iIndexOf = this.AuCTel.indexOf(c57776yom);
        if (iIndexOf != -1) {
            this.AuCTel.set(iIndexOf, c57776yom);
        } else {
            this.AuCTel.add(c57776yom);
        }
        this.fetchVPNInfo.OLrzqt("persistInAppMessageForRedisplay: " + c57776yom.toString() + " with msg array data: " + this.AuCTel.toString());
    }

    public final void OLrzqt(@androidx.annotation.NonNull final C57776yom c57776yom, final boolean z) {
        this.iwGUEr = false;
        if (z || c57776yom.EZpvd()) {
            this.iwGUEr = true;
            OneSignal.KWHzl(new OneSignal.Dialog() { // from class: o.yok.5
                @Override // com.onesignal.OneSignal.Dialog
                public void EZpvd(JSONObject jSONObject) {
                    C57774yok.this.iwGUEr = false;
                    if (jSONObject != null) {
                        C57774yok.this.hDKMBd = jSONObject.toString();
                    }
                    if (C57774yok.this.ejfBZ != null) {
                        if (!z) {
                            OneSignal.RJOkX().copydefault(c57776yom.copydefault);
                        }
                        C57770yog c57770yog = C57774yok.this.ejfBZ;
                        C57774yok c57774yok = C57774yok.this;
                        c57770yog.copydefault(c57774yok.KWHzl(c57774yok.ejfBZ.OLrzqt()));
                        WebViewManager.EZpvd(c57776yom, C57774yok.this.ejfBZ);
                        C57774yok.this.ejfBZ = null;
                    }
                }
            });
        }
    }

    public final C57770yog AEQbTJ(JSONObject jSONObject, C57776yom c57776yom) {
        C57770yog c57770yog = new C57770yog(jSONObject);
        c57776yom.AEQbTJ(c57770yog.copydefault().doubleValue());
        return c57770yog;
    }

    public final void EZpvd(@androidx.annotation.NonNull final C57776yom c57776yom) {
        if (!this.djBIcL) {
            this.fetchVPNInfo.EZpvd("In app messaging is currently paused, in app messages will not be shown!");
            return;
        }
        this.AYXKKw = true;
        OLrzqt(c57776yom, false);
        this.valueOf.OLrzqt(OneSignal.AhwBna, c57776yom.copydefault, fetchVPNInfo(c57776yom), new C57783yot.TaskDescription() { // from class: o.yok.4
            @Override // o.C57783yot.TaskDescription
            public void OLrzqt(java.lang.String str) {
                try {
                    C57770yog c57770yogAEQbTJ = C57774yok.this.AEQbTJ(new JSONObject(str), c57776yom);
                    if (c57770yogAEQbTJ.OLrzqt() == null) {
                        C57774yok.this.fetchVPNInfo.OLrzqt("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                        return;
                    }
                    if (C57774yok.this.iwGUEr) {
                        C57774yok.this.ejfBZ = c57770yogAEQbTJ;
                        return;
                    }
                    OneSignal.RJOkX().copydefault(c57776yom.copydefault);
                    C57774yok.this.gEmmrt(c57776yom);
                    c57770yogAEQbTJ.copydefault(C57774yok.this.KWHzl(c57770yogAEQbTJ.OLrzqt()));
                    WebViewManager.EZpvd(c57776yom, c57770yogAEQbTJ);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override // o.C57783yot.TaskDescription
            public void KWHzl(java.lang.String str) {
                C57774yok.this.AYXKKw = false;
                try {
                    if (new JSONObject(str).getBoolean("retry")) {
                        C57774yok.this.AkhnZx(c57776yom);
                    } else {
                        C57774yok.this.copydefault(c57776yom, true);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public java.lang.String KWHzl(@androidx.annotation.NonNull java.lang.String str) {
        return str + java.lang.String.format("\n\n<script>\n    setPlayerTags(%s);\n</script>", this.hDKMBd);
    }

    public void EZpvd(@androidx.annotation.NonNull java.lang.String str) {
        this.AYXKKw = true;
        final C57776yom c57776yom = new C57776yom(true);
        OLrzqt(c57776yom, true);
        this.valueOf.OLrzqt(OneSignal.AhwBna, str, new C57783yot.TaskDescription() { // from class: o.yok.2
            @Override // o.C57783yot.TaskDescription
            public void OLrzqt(java.lang.String str2) {
                try {
                    C57770yog c57770yogAEQbTJ = C57774yok.this.AEQbTJ(new JSONObject(str2), c57776yom);
                    if (c57770yogAEQbTJ.OLrzqt() == null) {
                        C57774yok.this.fetchVPNInfo.OLrzqt("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                    } else {
                        if (C57774yok.this.iwGUEr) {
                            C57774yok.this.ejfBZ = c57770yogAEQbTJ;
                            return;
                        }
                        C57774yok.this.gEmmrt(c57776yom);
                        c57770yogAEQbTJ.copydefault(C57774yok.this.KWHzl(c57770yogAEQbTJ.OLrzqt()));
                        WebViewManager.EZpvd(c57776yom, c57770yogAEQbTJ);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override // o.C57783yot.TaskDescription
            public void KWHzl(java.lang.String str2) {
                C57774yok.this.OLrzqt((C57776yom) null);
            }
        });
    }

    public void KWHzl() {
        AEQbTJ(new RunnableC57717yng() { // from class: o.yok.8
            @Override // o.RunnableC57717yng, java.lang.Runnable
            public void run() {
                super.run();
                C57774yok.this.valueOf.EZpvd();
            }
        }, "OS_IAM_DB_ACCESS");
    }

    @Override // o.C57710ynZ.ActionBar
    public void copydefault(java.lang.String str) {
        this.fetchVPNInfo.OLrzqt("messageDynamicTriggerCompleted called with triggerId: " + str);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(str);
        KWHzl(hashSet);
    }

    @Override // o.C57710ynZ.ActionBar
    public void copydefault() {
        this.fetchVPNInfo.OLrzqt("messageTriggerConditionChanged called");
        AEQbTJ();
    }

    @Override // o.C57761yoX.StateListAnimator
    public void isConnected() {
        EZpvd();
    }

    public final void KWHzl(java.util.Collection<java.lang.String> collection) {
        for (C57776yom c57776yom : this.AkhnZx) {
            if (!c57776yom.AYXKKw() && this.AuCTel.contains(c57776yom) && this.fJNWhG.KWHzl(c57776yom, collection)) {
                this.fetchVPNInfo.OLrzqt("Trigger changed for message: " + c57776yom.toString());
                c57776yom.copydefault(true);
            }
        }
    }
}
