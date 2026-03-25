package com.onesignal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.onesignal.LocationController;
import com.onesignal.OSNotificationAction;
import com.onesignal.OneSignalStateSynchronizer;
import j$.time.ZoneId;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import o.AbstractC57808ypR;
import o.C57690ynF;
import o.C57692ynH;
import o.C57705ynU;
import o.C57712ynb;
import o.C57714ynd;
import o.C57719yni;
import o.C57721ynk;
import o.C57724ynn;
import o.C57733ynw;
import o.C57734ynx;
import o.C57740yoC;
import o.C57742yoE;
import o.C57745yoH;
import o.C57746yoI;
import o.C57747yoJ;
import o.C57748yoK;
import o.C57749yoL;
import o.C57750yoM;
import o.C57751yoN;
import o.C57752yoO;
import o.C57753yoP;
import o.C57755yoR;
import o.C57758yoU;
import o.C57759yoV;
import o.C57760yoW;
import o.C57762yoY;
import o.C57763yoZ;
import o.C57766yoc;
import o.C57767yod;
import o.C57769yof;
import o.C57772yoi;
import o.C57773yoj;
import o.C57774yok;
import o.C57781yor;
import o.C57785yov;
import o.C57788yoy;
import o.C57789yoz;
import o.C57791ypA;
import o.C57793ypC;
import o.C57794ypD;
import o.C57796ypF;
import o.C57798ypH;
import o.C57799ypI;
import o.C57800ypJ;
import o.C57807ypQ;
import o.C57817ypa;
import o.C57818ypb;
import o.C57822ypf;
import o.C57830ypn;
import o.C57834ypr;
import o.C57835yps;
import o.C57837ypu;
import o.C57838ypv;
import o.C57839ypw;
import o.C57870yqa;
import o.C57872yqc;
import o.C57873yqd;
import o.C57875yqf;
import o.C57876yqg;
import o.InterfaceC57738yoA;
import o.InterfaceC57756yoS;
import o.InterfaceC57757yoT;
import o.InterfaceC57812ypV;
import o.InterfaceC57821ype;
import o.InterfaceC57827ypk;
import o.InterfaceC57841ypy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class OneSignal {
    public static Context AEQbTJ;
    public static OSSubscriptionState AYXKKw;
    public static String AhwBna;
    public static ActionBar AkhnZx;
    public static String AuCTelauCTel;
    public static LocationController.ActionBar AubY;
    public static boolean AxsJAY;
    public static C57799ypI AxsJAYaxsJAY;
    public static VoiceInteractor DTwDnp;
    public static C57749yoL<Object, C57769yof> DbNXlk;
    public static boolean EZpvd;
    public static WeakReference<android.app.Activity> OLrzqt;
    public static InterfaceC57841ypy ORxRYg;
    public static C57788yoy OcIXYQ;
    public static C57873yqd QKVWgx;
    public static C57759yoV QOLQEE;
    public static PictureInPictureParams QUSxYX;
    public static C57748yoK QbewEr;
    public static C57876yqg RJOkX;
    public static boolean RcXXUw;
    public static boolean accept;
    public static C57753yoP djBIcL;
    public static C57749yoL<Object, C57755yoR> djSkpj;
    public static FragmentManager ejfBZ;
    public static String fARcdN;
    public static FocusTimeController fIwbmz;
    public static boolean fJNWhG;
    public static C57724ynn fetchVPNInfo;
    public static SharedElementCallback finit;
    public static C57749yoL<Object, C57758yoU> flVtFt;
    public static C57766yoc gEmmrt;
    public static ComponentCallbacks2 gGvvIC;
    public static LoaderManager getFieldNames;
    public static boolean getNewProxyInstance;
    public static C57749yoL<InterfaceC57756yoS, C57763yoZ> giSNqX;
    public static C57798ypH hUfVAv;
    public static C57800ypJ iRxXKY;
    public static ActionBar isConnected;
    public static boolean iwGUEr;
    public static OSSubscriptionState sSMYrx;
    public static C57751yoN valueOf;
    public static C57753yoP wlaJM;
    public static C57766yoc zLjUOn;
    public static C57751yoN zsXlph;
    public static List<Application> AuCTel = new ArrayList();
    public static LOG_LEVEL QKudOq = LOG_LEVEL.NONE;
    public static LOG_LEVEL gHZMYf = LOG_LEVEL.WARN;
    public static String AxsJAYsNCnLh = null;
    public static String values = null;
    public static String dvKsVJ = null;
    public static int gasjUx = Integer.MAX_VALUE;
    public static C57872yqc hDKMBd = null;
    public static AppEntryAction KWHzl = AppEntryAction.APP_CLOSE;
    public static InterfaceC57738yoA AwvSrB = new C57785yov();
    public static C57759yoV.ActionBar fZBcTu = new C57759yoV.ActionBar() { // from class: com.onesignal.OneSignal.3
        @Override // o.C57759yoV.ActionBar
        public void copydefault(@NonNull List<C57870yqa> list) {
            if (OneSignal.QbewEr == null) {
                OneSignal.KWHzl(LOG_LEVEL.WARN, "OneSignal onSessionEnding called before init!");
            }
            if (OneSignal.QbewEr != null) {
                OneSignal.QbewEr.OLrzqt();
            }
            OneSignal.wlaJM().KWHzl(list);
        }
    };
    public static C57773yoj uzCIH = new C57773yoj();
    public static InterfaceC57821ype iZzfmt = new C57822ypf();
    public static C57752yoO fFgQHt = new C57752yoO();
    public static C57817ypa fvQaOB = new C57817ypa(AwvSrB);
    public static C57818ypb gkJEwt = new C57818ypb(fFgQHt, AwvSrB);
    public static InterfaceC57827ypk copydefault = new C57838ypv();
    public static InterfaceC57757yoT UeEOUB = new C57760yoW();
    public static final Object QfsBiF = new Object() { // from class: com.onesignal.OneSignal.8
    };
    public static String dxcTrN = "native";
    public static OSUtils QVAiDq = new OSUtils();
    public static Collection<JSONArray> RlQdEF = new ArrayList();
    public static HashSet<String> dNCPSb = new HashSet<>();
    public static final ArrayList<Dialog> aKErDB = new ArrayList<>();
    public static final List<InterfaceC57812ypV> zuBGHE = new CopyOnWriteArrayList();

    public interface ActionBar {
        void KWHzl(Activity activity);

        void OLrzqt();
    }

    public interface Application {
        void EZpvd(AppEntryAction appEntryAction);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public interface BroadcastReceiver {
        void copydefault(boolean z);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public interface ClipData {
        void EZpvd(@Nullable C57750yoM c57750yoM);
    }

    public interface ComponentCallbacks {
        void AEQbTJ(String str);

        void copydefault(AssistContent assistContent);
    }

    public interface ComponentCallbacks2 {
        void OLrzqt(JSONObject jSONObject);

        void copydefault(ComponentName componentName);
    }

    public interface Dialog {
        void EZpvd(JSONObject jSONObject);
    }

    public enum EmailErrorType {
        VALIDATION,
        REQUIRES_EMAIL_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    public enum ExternalIdErrorType {
        REQUIRES_EXTERNAL_ID_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    public interface Fragment {
        void AEQbTJ(JSONObject jSONObject);

        void copydefault(StateListAnimator stateListAnimator);
    }

    public enum LOG_LEVEL {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        VERBOSE
    }

    /* JADX INFO: loaded from: classes17.dex */
    public interface LoaderManager {
        void OLrzqt(OSInAppMessageAction oSInAppMessageAction);
    }

    public interface PendingIntent {
        void OLrzqt(String str, boolean z);
    }

    public interface PictureInPictureParams {
        void AEQbTJ(C57746yoI c57746yoI);
    }

    public enum PromptActionResult {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    public enum SMSErrorType {
        VALIDATION,
        REQUIRES_SMS_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    public interface SharedElementCallback {
        void remoteNotificationReceived(Context context, C57746yoI c57746yoI);
    }

    public interface TaskDescription {
        void EZpvd(JSONObject jSONObject);

        void copydefault(ContextWrapper contextWrapper);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public interface TaskStackBuilder {
        void KWHzl(PromptActionResult promptActionResult);
    }

    public interface VoiceInteractor {
        void EZpvd(C57747yoJ c57747yoJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC57738yoA AxsJAY() {
        return AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void EZpvd(LOG_LEVEL log_level, LOG_LEVEL log_level2) {
        gHZMYf = log_level;
        QKudOq = log_level2;
    }

    public static boolean EZpvd(int i) {
        return i < -6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void OLrzqt(SharedElementCallback sharedElementCallback) {
        if (finit == null) {
            finit = sharedElementCallback;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C57752yoO QOLQEE() {
        return fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String QUSxYX() {
        return "040812";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean RlQdEF() {
        return gasjUx == -999;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC57757yoT UeEOUB() {
        return UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC57821ype aKErDB() {
        return iZzfmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void copydefault(@Nullable PictureInPictureParams pictureInPictureParams) {
        QUSxYX = pictureInPictureParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void djBIcL(boolean z) {
        iwGUEr = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AppEntryAction fJNWhG() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean iRxXKY() {
        return iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean iZzfmt() {
        return getNewProxyInstance;
    }

    public enum AppEntryAction {
        NOTIFICATION_CLICK,
        APP_OPEN,
        APP_CLOSE;

        public boolean isNotificationClick() {
            return equals(NOTIFICATION_CLICK);
        }

        public boolean isAppOpen() {
            return equals(APP_OPEN);
        }

        public boolean isAppClose() {
            return equals(APP_CLOSE);
        }
    }

    public static class ContextWrapper {
        public String EZpvd;
        public int KWHzl;

        public ContextWrapper(int i, String str) {
            this.EZpvd = str;
            this.KWHzl = i;
        }
    }

    public static class AssistContent {
        public String AEQbTJ;
        public int KWHzl;

        public AssistContent(int i, String str) {
            this.KWHzl = i;
            this.AEQbTJ = str;
        }
    }

    public static class StateListAnimator {
        public ExternalIdErrorType AEQbTJ;
        public String OLrzqt;

        public StateListAnimator(ExternalIdErrorType externalIdErrorType, String str) {
            this.AEQbTJ = externalIdErrorType;
            this.OLrzqt = str;
        }
    }

    public static class ComponentName {
        public String AEQbTJ;
        public SMSErrorType EZpvd;

        public ComponentName(SMSErrorType sMSErrorType, String str) {
            this.EZpvd = sMSErrorType;
            this.AEQbTJ = str;
        }
    }

    public static class Activity {
        public EmailErrorType AEQbTJ;
        public String EZpvd;

        public Activity(EmailErrorType emailErrorType, String str) {
            this.AEQbTJ = emailErrorType;
            this.EZpvd = str;
        }
    }

    public static void AEQbTJ(AppEntryAction appEntryAction) {
        Iterator it = new ArrayList(AuCTel).iterator();
        while (it.hasNext()) {
            ((Application) it.next()).EZpvd(appEntryAction);
        }
    }

    public static void OLrzqt(Application application, AppEntryAction appEntryAction) {
        if (appEntryAction.equals(AppEntryAction.NOTIFICATION_CLICK)) {
            return;
        }
        AuCTel.add(application);
    }

    public static void KWHzl(Application application) {
        AuCTel.remove(application);
    }

    public static android.app.Activity getNewProxyInstance() {
        C57712ynb c57712ynbCopydefault = C57714ynd.copydefault();
        if (c57712ynbCopydefault != null) {
            return c57712ynbCopydefault.copydefault();
        }
        return null;
    }

    public static C57774yok sSMYrx() {
        return uzCIH.AEQbTJ(getFieldNames(), fvQaOB, AxsJAY(), UeEOUB(), hDKMBd);
    }

    public static C57873yqd dvKsVJ() {
        if (QKVWgx == null) {
            QKVWgx = new C57873yqd(UeEOUB, AwvSrB, iZzfmt);
        }
        return QKVWgx;
    }

    public static C57759yoV gHZMYf() {
        if (QOLQEE == null) {
            QOLQEE = new C57759yoV(fZBcTu, dvKsVJ(), AwvSrB);
        }
        return QOLQEE;
    }

    public static C57748yoK zuBGHE() {
        if (QbewEr == null) {
            synchronized (QfsBiF) {
                if (QbewEr == null) {
                    if (RJOkX == null) {
                        RJOkX = new C57876yqg(AwvSrB, copydefault, getFieldNames(), UeEOUB);
                    }
                    QbewEr = new C57748yoK(gHZMYf(), RJOkX);
                }
            }
        }
        return QbewEr;
    }

    public static C57751yoN OLrzqt(Context context) {
        if (context == null) {
            return null;
        }
        if (valueOf == null) {
            C57751yoN c57751yoN = new C57751yoN(false);
            valueOf = c57751yoN;
            c57751yoN.KWHzl().EZpvd(new OSPermissionChangedInternalObserver());
        }
        return valueOf;
    }

    public static C57749yoL<Object, C57755yoR> OcIXYQ() {
        if (djSkpj == null) {
            djSkpj = new C57749yoL<>("onOSPermissionChanged", true);
        }
        return djSkpj;
    }

    public static OSSubscriptionState EZpvd(Context context) {
        if (context == null) {
            return null;
        }
        if (AYXKKw == null) {
            AYXKKw = new OSSubscriptionState(false, OLrzqt(context).EZpvd());
            OLrzqt(context).KWHzl().AEQbTJ(AYXKKw);
            AYXKKw.AEQbTJ().EZpvd(new OSSubscriptionChangedInternalObserver());
        }
        return AYXKKw;
    }

    public static OSSubscriptionState AhwBna(Context context) {
        if (context == null) {
            return null;
        }
        if (sSMYrx == null) {
            sSMYrx = new OSSubscriptionState(true, false);
        }
        return sSMYrx;
    }

    public static C57749yoL<InterfaceC57756yoS, C57763yoZ> RcXXUw() {
        if (giSNqX == null) {
            giSNqX = new C57749yoL<>("onOSSubscriptionChanged", true);
        }
        return giSNqX;
    }

    public static C57766yoc AEQbTJ(Context context) {
        if (context == null) {
            return null;
        }
        if (gEmmrt == null) {
            C57766yoc c57766yoc = new C57766yoc(false);
            gEmmrt = c57766yoc;
            c57766yoc.KWHzl().EZpvd(new OSEmailSubscriptionChangedInternalObserver());
        }
        return gEmmrt;
    }

    public static C57749yoL<Object, C57769yof> AubY() {
        if (DbNXlk == null) {
            DbNXlk = new C57749yoL<>("onOSEmailSubscriptionChanged", true);
        }
        return DbNXlk;
    }

    public static C57753yoP copydefault(Context context) {
        if (context == null) {
            return null;
        }
        if (djBIcL == null) {
            C57753yoP c57753yoP = new C57753yoP(false);
            djBIcL = c57753yoP;
            c57753yoP.AEQbTJ().EZpvd(new OSSMSSubscriptionChangedInternalObserver());
        }
        return djBIcL;
    }

    public static C57749yoL<Object, C57758yoU> QVAiDq() {
        if (flVtFt == null) {
            flVtFt = new C57749yoL<>("onSMSSubscriptionChanged", true);
        }
        return flVtFt;
    }

    public static C57767yod hDKMBd() {
        Context context = AEQbTJ;
        if (context == null) {
            AwvSrB.KWHzl("OneSignal.initWithContext has not been called. Could not get OSDeviceState");
            return null;
        }
        return new C57767yod(EZpvd(context), OLrzqt(AEQbTJ), AEQbTJ(AEQbTJ), copydefault(AEQbTJ));
    }

    public static class FragmentManager {
        public JSONArray AEQbTJ;
        public C57837ypu.TaskDescription OLrzqt;
        public boolean copydefault;

        public FragmentManager(JSONArray jSONArray) {
            this.AEQbTJ = jSONArray;
        }
    }

    public static void gEmmrt(@NonNull String str) {
        if (str == null || str.isEmpty()) {
            AwvSrB.AEQbTJ("setAppId called with id: " + str + ", ignoring!");
            return;
        }
        if (!str.equals(AhwBna)) {
            getNewProxyInstance = false;
            AwvSrB.EZpvd("setAppId called with id: " + str + " changing id from: " + AhwBna);
        }
        AhwBna = str;
        if (AEQbTJ == null) {
            AwvSrB.AEQbTJ("appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!");
            return;
        }
        WeakReference<android.app.Activity> weakReference = OLrzqt;
        if (weakReference != null && weakReference.get() != null) {
            DbNXlk(OLrzqt.get());
        } else {
            DbNXlk(AEQbTJ);
        }
    }

    public static void fetchVPNInfo(@NonNull Context context) {
        if (context == null) {
            AwvSrB.AEQbTJ("initWithContext called with null context, ignoring!");
            return;
        }
        if (context instanceof android.app.Activity) {
            OLrzqt = new WeakReference<>((android.app.Activity) context);
        }
        boolean z = AEQbTJ == null;
        AEQbTJ = context.getApplicationContext();
        valueOf(z);
        isConnected(AEQbTJ);
        if (AhwBna == null) {
            String strQbewEr = QbewEr();
            if (strQbewEr == null) {
                AwvSrB.AEQbTJ("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
                return;
            }
            AwvSrB.EZpvd("appContext set and cached app id found, calling setAppId with: " + strQbewEr);
            gEmmrt(strQbewEr);
            return;
        }
        AwvSrB.EZpvd("initWithContext called with: " + context);
        DbNXlk(context);
    }

    public static void AEQbTJ(@Nullable VoiceInteractor voiceInteractor) {
        DTwDnp = voiceInteractor;
        if (!getNewProxyInstance || voiceInteractor == null) {
            return;
        }
        AuCTel();
    }

    public static void DbNXlk(Context context) {
        synchronized (OneSignal.class) {
            AwvSrB.EZpvd("Starting OneSignal initialization!");
            C57740yoC.KWHzl(AEQbTJ);
            if (!getPostValueLengthLimit() && fFgQHt.fetchVPNInfo()) {
                int iEZpvd = gasjUx;
                if (iEZpvd == Integer.MAX_VALUE) {
                    iEZpvd = QVAiDq.EZpvd(AEQbTJ, AhwBna);
                }
                gasjUx = iEZpvd;
                if (RlQdEF()) {
                    return;
                }
                if (getNewProxyInstance) {
                    if (DTwDnp != null) {
                        AuCTel();
                    }
                    AwvSrB.OLrzqt("OneSignal SDK initialization already completed.");
                    return;
                }
                djBIcL(context);
                OLrzqt = null;
                OneSignalStateSynchronizer.values();
                fZBcTu();
                dxcTrN();
                OSPermissionChangedInternalObserver.copydefault(OLrzqt(AEQbTJ));
                values();
                if (DTwDnp != null) {
                    AuCTel();
                }
                if (C57798ypH.KWHzl(AEQbTJ)) {
                    hUfVAv = new C57798ypH(AEQbTJ);
                }
                if (C57799ypI.copydefault()) {
                    AxsJAYaxsJAY = new C57799ypI(AEQbTJ);
                }
                getNewProxyInstance = true;
                KWHzl(LOG_LEVEL.VERBOSE, "OneSignal SDK initialization done.");
                zuBGHE().AEQbTJ();
                gkJEwt.copydefault();
                return;
            }
            if (!fFgQHt.fetchVPNInfo()) {
                AwvSrB.EZpvd("OneSignal SDK initialization delayed, waiting for remote params.");
            } else {
                AwvSrB.EZpvd("OneSignal SDK initialization delayed, waiting for privacy consent to be set.");
            }
            fetchVPNInfo = new C57724ynn(AEQbTJ, AhwBna);
            String str = AhwBna;
            AhwBna = null;
            if (str != null && context != null) {
                OLrzqt(str, finit(), false);
            }
        }
    }

    public static void OqFWZa() {
        if (DCJXGO() || !iwGUEr) {
            return;
        }
        QKudOq();
    }

    public static void valueOf(boolean z) {
        C57714ynd.AEQbTJ((android.app.Application) AEQbTJ);
        if (z) {
            hDKMBd = new C57872yqc(UeEOUB);
            C57834ypr.AEQbTJ();
            C57830ypn fieldNames = getFieldNames();
            C57788yoy c57788yoy = new C57788yoy(fieldNames, AwvSrB);
            OcIXYQ = c57788yoy;
            c57788yoy.EZpvd();
            sSMYrx().KWHzl();
            if (RJOkX == null) {
                RJOkX = new C57876yqg(AwvSrB, copydefault, fieldNames, UeEOUB);
            }
            gHZMYf().OLrzqt();
            zuBGHE().EZpvd();
        }
    }

    public static void isConnected(Context context) {
        String string;
        ApplicationInfo applicationInfoKWHzl = C57721ynk.Companion.KWHzl(context);
        if (applicationInfoKWHzl == null || (string = applicationInfoKWHzl.metaData.getString("com.onesignal.PrivacyConsent")) == null) {
            return;
        }
        AhwBna("ENABLE".equalsIgnoreCase(string));
    }

    public static void fZBcTu() {
        String strQbewEr = QbewEr();
        if (strQbewEr != null) {
            if (strQbewEr.equals(AhwBna)) {
                return;
            }
            KWHzl(LOG_LEVEL.DEBUG, "App id has changed:\nFrom: " + strQbewEr + "\n To: " + AhwBna + "\nClearing the user id, app state, and remoteParams as they are no longer valid");
            copydefault(AhwBna);
            OneSignalStateSynchronizer.isConnected();
            fFgQHt.copydefault();
            return;
        }
        KWHzl(LOG_LEVEL.DEBUG, "App id set for first time:  " + AhwBna);
        C57719yni.AEQbTJ(0, AEQbTJ);
        copydefault(AhwBna);
    }

    public static boolean QkdxfA() {
        return fFgQHt.EZpvd();
    }

    public static void djBIcL(Context context) {
        C57712ynb c57712ynbCopydefault = C57714ynd.copydefault();
        boolean z = context instanceof android.app.Activity;
        boolean z2 = getNewProxyInstance() == null;
        djBIcL(!z2 || z);
        AwvSrB.OLrzqt("OneSignal handleActivityLifecycleHandler inForeground: " + iwGUEr);
        if (!iwGUEr) {
            if (c57712ynbCopydefault != null) {
                c57712ynbCopydefault.KWHzl(true);
                return;
            }
            return;
        }
        if (z2 && z && c57712ynbCopydefault != null) {
            c57712ynbCopydefault.AhwBna((android.app.Activity) context);
            c57712ynbCopydefault.KWHzl(true);
        }
        OSNotificationRestoreWorkManager.OLrzqt(context, false);
        wlaJM().copydefault();
    }

    public static void dxcTrN() {
        try {
            Class.forName("com.amazon.device.iap.PurchasingListener");
            iRxXKY = new C57800ypJ(AEQbTJ);
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void values() {
        if (RKDWNf()) {
            AwvSrB.OLrzqt("Starting new session with appEntryState: " + fJNWhG());
            OneSignalStateSynchronizer.AkhnZx();
            zuBGHE().OLrzqt();
            gHZMYf().AEQbTJ(fJNWhG());
            sSMYrx().AhwBna();
            EZpvd(iZzfmt.KWHzl());
        } else if (iRxXKY()) {
            AwvSrB.OLrzqt("Continue on same session with appEntryState: " + fJNWhG());
            gHZMYf().KWHzl(fJNWhG());
        }
        sSMYrx().AYXKKw();
        if (!iwGUEr && flVtFt()) {
            AwvSrB.OLrzqt("doSessionInit on background with already registered user");
        }
        OBJEWx();
    }

    public static void OBJEWx() {
        if (accept) {
            return;
        }
        accept = true;
        if (iwGUEr && OneSignalStateSynchronizer.valueOf()) {
            AxsJAY = false;
        }
        QSBOWP();
        RcXXUw = false;
        if (DTwDnp() != null) {
            ODWQjV();
        } else {
            OLrzqt(AhwBna, finit(), true);
        }
    }

    public static void QSBOWP() {
        LocationController.OLrzqt(AEQbTJ, false, false, new LocationController.StateListAnimator() { // from class: com.onesignal.OneSignal.17
            @Override // com.onesignal.LocationController.StateListAnimator
            public LocationController.PermissionType OLrzqt() {
                return LocationController.PermissionType.STARTUP;
            }

            @Override // com.onesignal.LocationController.StateListAnimator
            public void EZpvd(LocationController.ActionBar actionBar) {
                LocationController.ActionBar unused = OneSignal.AubY = actionBar;
                boolean unused2 = OneSignal.AxsJAY = true;
                OneSignal.OuxcSI();
            }
        });
    }

    public static InterfaceC57841ypy QKVWgx() {
        InterfaceC57841ypy interfaceC57841ypy = ORxRYg;
        if (interfaceC57841ypy != null) {
            return interfaceC57841ypy;
        }
        if (OSUtils.fetchVPNInfo()) {
            ORxRYg = new C57839ypw();
        } else if (OSUtils.DbNXlk()) {
            if (OSUtils.OLrzqt()) {
                ORxRYg = ORxRYg();
            }
        } else {
            ORxRYg = new C57793ypC();
        }
        return ORxRYg;
    }

    public static C57796ypF ORxRYg() {
        C57835yps.StateListAnimator stateListAnimator = fFgQHt.OLrzqt().KWHzl;
        return new C57796ypF(AEQbTJ, stateListAnimator != null ? new C57796ypF.TaskDescription(stateListAnimator.KWHzl, stateListAnimator.AEQbTJ, stateListAnimator.copydefault) : null);
    }

    public static void ODWQjV() {
        QKVWgx().EZpvd(AEQbTJ, fARcdN, new InterfaceC57841ypy.Activity() { // from class: com.onesignal.OneSignal.19
            @Override // o.InterfaceC57841ypy.Activity
            public void copydefault(String str, int i) {
                OneSignal.AwvSrB.OLrzqt("registerForPushToken completed with id: " + str + " status: " + i);
                if (i >= 1) {
                    if (OneSignal.EZpvd(OneSignal.gasjUx)) {
                        int unused = OneSignal.gasjUx = i;
                    }
                } else if (OneSignalStateSynchronizer.AhwBna() == null && (OneSignal.gasjUx == 1 || OneSignal.EZpvd(OneSignal.gasjUx))) {
                    int unused2 = OneSignal.gasjUx = i;
                }
                String unused3 = OneSignal.AuCTelauCTel = str;
                boolean unused4 = OneSignal.RcXXUw = true;
                OneSignal.EZpvd(OneSignal.AEQbTJ).KWHzl(str);
                OneSignal.OuxcSI();
            }
        });
    }

    public static void OLrzqt(String str, String str2, final boolean z) {
        if (DTwDnp() != null || EZpvd) {
            return;
        }
        EZpvd = true;
        C57835yps.OLrzqt(str, str2, new C57835yps.Activity() { // from class: com.onesignal.OneSignal.20
            @Override // o.C57835yps.Activity
            public void OLrzqt(C57835yps.Application application) {
                boolean unused = OneSignal.EZpvd = false;
                String str3 = application.AhwBna;
                if (str3 != null) {
                    OneSignal.fARcdN = str3;
                }
                OneSignal.fFgQHt.OLrzqt(application, OneSignal.dvKsVJ(), OneSignal.UeEOUB, OneSignal.AwvSrB);
                OneSignal.OqFWZa();
                C57690ynF.KWHzl(OneSignal.AEQbTJ, application.AYXKKw);
                if (z) {
                    OneSignal.ODWQjV();
                }
            }
        });
    }

    public static void AuCTel() {
        Iterator<JSONArray> it = RlQdEF.iterator();
        while (it.hasNext()) {
            EZpvd(it.next());
        }
        RlQdEF.clear();
    }

    public static void AEQbTJ(LOG_LEVEL log_level, String str) {
        KWHzl(log_level, str);
    }

    public static boolean DCJXGO() {
        String strOLrzqt;
        Context contextCopydefault;
        if (getNewProxyInstance) {
            return false;
        }
        C57724ynn c57724ynn = fetchVPNInfo;
        if (c57724ynn == null) {
            strOLrzqt = QbewEr();
            contextCopydefault = AEQbTJ;
            AwvSrB.KWHzl("Trying to continue OneSignal with null delayed params");
        } else {
            strOLrzqt = c57724ynn.OLrzqt();
            contextCopydefault = fetchVPNInfo.copydefault();
        }
        AwvSrB.OLrzqt("reassignDelayedInitParams with appContext: " + AEQbTJ);
        fetchVPNInfo = null;
        gEmmrt(strOLrzqt);
        if (getNewProxyInstance) {
            return true;
        }
        if (contextCopydefault == null) {
            AwvSrB.KWHzl("Trying to continue OneSignal with null delayed params context");
            return false;
        }
        fetchVPNInfo(contextCopydefault);
        return true;
    }

    public static C57835yps.Application DTwDnp() {
        return fFgQHt.OLrzqt();
    }

    public static boolean getPostValueLengthLimit() {
        return AEQbTJ == null || (accept() && !QkdxfA());
    }

    public static void AhwBna(boolean z) {
        if (QOLQEE().AhwBna()) {
            AwvSrB.AEQbTJ("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
        } else if (getPostValueLengthLimit() && !z) {
            KWHzl(LOG_LEVEL.ERROR, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
        } else {
            QOLQEE().OLrzqt(z);
        }
    }

    public static boolean DbNXlk(String str) {
        if (!getPostValueLengthLimit()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        KWHzl(LOG_LEVEL.WARN, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
        return true;
    }

    public static boolean copydefault(LOG_LEVEL log_level) {
        return log_level.compareTo(QKudOq) < 1 || log_level.compareTo(gHZMYf) < 1;
    }

    public static void KWHzl(@NonNull LOG_LEVEL log_level, @NonNull String str) {
        OLrzqt(log_level, str, (Throwable) null);
    }

    public static void OLrzqt(@NonNull final LOG_LEVEL log_level, @NonNull String str, @Nullable Throwable th) {
        if (log_level.compareTo(gHZMYf) < 1 && log_level != LOG_LEVEL.VERBOSE && log_level != LOG_LEVEL.DEBUG && log_level != LOG_LEVEL.INFO && log_level != LOG_LEVEL.WARN && log_level != LOG_LEVEL.ERROR) {
            LOG_LEVEL log_level2 = LOG_LEVEL.FATAL;
        }
        if (log_level.compareTo(QKudOq) < 1 && getNewProxyInstance() != null) {
            try {
                final String str2 = str + "\n";
                if (th != null) {
                    String str3 = str2 + th.getMessage();
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    str2 = str3 + stringWriter.toString();
                }
                OSUtils.EZpvd(new Runnable() { // from class: com.onesignal.OneSignal.25
                    @Override // java.lang.Runnable
                    public void run() {
                        if (OneSignal.getNewProxyInstance() != null) {
                            new AlertDialog.Builder(OneSignal.getNewProxyInstance()).setTitle(log_level.toString()).setMessage(str2).show();
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
        copydefault(log_level, str, th);
    }

    public static void copydefault(@NonNull LOG_LEVEL log_level, @NonNull String str, @Nullable Throwable th) {
        if (th != null) {
            str = str + "\n" + Log.getStackTraceString(th);
        }
        Iterator<InterfaceC57812ypV> it = zuBGHE.iterator();
        while (it.hasNext()) {
            it.next().AEQbTJ(new C57807ypQ(log_level, str));
        }
    }

    public static void copydefault(@NonNull InterfaceC57812ypV interfaceC57812ypV) {
        zuBGHE.add(interfaceC57812ypV);
    }

    public static void AEQbTJ(String str, int i, Throwable th, String str2) {
        String str3;
        if (str2 == null || !copydefault(LOG_LEVEL.INFO)) {
            str3 = "";
        } else {
            str3 = "\n" + str2 + "\n";
        }
        OLrzqt(LOG_LEVEL.WARN, "HTTP code: " + i + " " + str + str3, th);
    }

    public static void AxsJAYsNCnLh() {
        KWHzl(LOG_LEVEL.DEBUG, "Application lost focus initDone: " + getNewProxyInstance);
        djBIcL(false);
        KWHzl = AppEntryAction.APP_CLOSE;
        EZpvd(aKErDB().KWHzl());
        LocationController.isConnected();
        if (!getNewProxyInstance) {
            if (gkJEwt.copydefault("onAppLostFocus()")) {
                AwvSrB.KWHzl("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
                gkJEwt.KWHzl(new Runnable() { // from class: com.onesignal.OneSignal.24
                    @Override // java.lang.Runnable
                    public void run() {
                        OneSignal.AwvSrB.OLrzqt("Running onAppLostFocus() operation from a pending task queue.");
                        OneSignal.fetchVPNInfo();
                    }
                });
                return;
            }
            return;
        }
        fetchVPNInfo();
    }

    public static void fetchVPNInfo() {
        if (iwGUEr) {
            return;
        }
        C57800ypJ c57800ypJ = iRxXKY;
        if (c57800ypJ != null) {
            c57800ypJ.AEQbTJ();
        }
        wlaJM().KWHzl();
        QHmsKR();
    }

    public static boolean QHmsKR() {
        boolean zDbNXlk = OneSignalStateSynchronizer.DbNXlk();
        AwvSrB.OLrzqt("OneSignal scheduleSyncService unsyncedChanges: " + zDbNXlk);
        if (zDbNXlk) {
            C57762yoY.valueOf().djBIcL(AEQbTJ);
        }
        boolean zCopydefault = LocationController.copydefault(AEQbTJ);
        AwvSrB.OLrzqt("OneSignal scheduleSyncService locationScheduled: " + zCopydefault);
        return zCopydefault || zDbNXlk;
    }

    public static void DAIeex() {
        LOG_LEVEL log_level = LOG_LEVEL.DEBUG;
        KWHzl(log_level, "Application on focus");
        djBIcL(true);
        AppEntryAction appEntryAction = KWHzl;
        AppEntryAction appEntryAction2 = AppEntryAction.NOTIFICATION_CLICK;
        if (!appEntryAction.equals(appEntryAction2)) {
            AEQbTJ(KWHzl);
            if (!KWHzl.equals(appEntryAction2)) {
                KWHzl = AppEntryAction.APP_OPEN;
            }
        }
        LocationController.isConnected();
        C57705ynU.OLrzqt.EZpvd();
        if (OSUtils.djBIcL(AhwBna)) {
            return;
        }
        if (!fFgQHt.fetchVPNInfo()) {
            KWHzl(log_level, "Delay onAppFocus logic due to missing remote params");
            OLrzqt(AhwBna, finit(), false);
        } else {
            QKudOq();
        }
    }

    public static void DarRvM() {
        DXXBbs();
    }

    public static void DXXBbs() {
        OLrzqt(AEQbTJ).AEQbTJ();
    }

    public static void QKudOq() {
        if (DbNXlk("onAppFocus")) {
            return;
        }
        wlaJM().copydefault();
        values();
        C57798ypH c57798ypH = hUfVAv;
        if (c57798ypH != null) {
            c57798ypH.copydefault();
        }
        OSNotificationRestoreWorkManager.OLrzqt(AEQbTJ, false);
        DXXBbs();
        if (AxsJAYaxsJAY != null && zsXlph()) {
            AxsJAYaxsJAY.AEQbTJ();
        }
        C57762yoY.valueOf().copydefault(AEQbTJ);
    }

    public static void KWHzl(JSONObject jSONObject) {
        try {
            jSONObject.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, QVAiDq.iwGUEr());
        } catch (Throwable unused) {
        }
    }

    public static int djSkpj() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }

    public static String dNCPSb() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ZoneId.systemDefault().getId();
        }
        return TimeZone.getDefault().getID();
    }

    public static void OuxcSI() {
        AwvSrB.OLrzqt("registerUser:registerForPushFired:" + RcXXUw + ", locationFired: " + AxsJAY + ", remoteParams: " + DTwDnp() + ", appId: " + AhwBna);
        if (!RcXXUw || !AxsJAY || DTwDnp() == null || AhwBna == null) {
            AwvSrB.OLrzqt("registerUser not possible");
        } else {
            OSUtils.KWHzl(new Thread(new Runnable() { // from class: com.onesignal.OneSignal.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        OneSignal.zuWLRA();
                    } catch (JSONException e) {
                        OneSignal.OLrzqt(LOG_LEVEL.FATAL, "FATAL Error registering device!", e);
                    }
                }
            }, "OS_REG_USER"));
        }
    }

    public static void zuWLRA() throws JSONException {
        LocationController.ActionBar actionBar;
        String packageName = AEQbTJ.getPackageName();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HiAnalyticsConstant.BI_KEY_APP_ID, QbewEr());
        jSONObject.put("device_os", Build.VERSION.RELEASE);
        jSONObject.put("timezone", djSkpj());
        jSONObject.put("timezone_id", dNCPSb());
        jSONObject.put("language", hDKMBd.OLrzqt());
        jSONObject.put("sdk", "040812");
        jSONObject.put(HianalyticsBaseData.SDK_TYPE, dxcTrN);
        jSONObject.put("android_package", packageName);
        jSONObject.put("device_model", Build.MODEL);
        Integer numIwGUEr = iwGUEr();
        if (numIwGUEr != null) {
            jSONObject.put("game_version", numIwGUEr);
        }
        jSONObject.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, QVAiDq.iwGUEr());
        jSONObject.put("carrier", QVAiDq.ejfBZ());
        jSONObject.put("rooted", C57794ypD.EZpvd());
        OneSignalStateSynchronizer.KWHzl(jSONObject, (OneSignalStateSynchronizer.TaskDescription) null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("identifier", AuCTelauCTel);
        jSONObject2.put("subscribableStatus", gasjUx);
        jSONObject2.put("androidPermission", AkhnZx());
        jSONObject2.put("device_type", QVAiDq.uzCIH());
        OneSignalStateSynchronizer.AEQbTJ(jSONObject2);
        if (hUfVAv() && (actionBar = AubY) != null) {
            OneSignalStateSynchronizer.EZpvd(actionBar);
        }
        AwvSrB.OLrzqt("registerUserTask calling readyToUpdate");
        OneSignalStateSynchronizer.KWHzl(true);
        accept = false;
    }

    public static Integer iwGUEr() {
        C57733ynw c57733ynwEZpvd = C57791ypA.Companion.EZpvd(AEQbTJ, AEQbTJ.getPackageName(), 0);
        if (!c57733ynwEZpvd.EZpvd() || c57733ynwEZpvd.OLrzqt() == null) {
            return null;
        }
        return Integer.valueOf(c57733ynwEZpvd.OLrzqt().versionCode);
    }

    public static void djBIcL(@NonNull String str) {
        OLrzqt(str, (ComponentCallbacks) null);
    }

    public static void OLrzqt(@NonNull final String str, @Nullable final ComponentCallbacks componentCallbacks) {
        if (gkJEwt.copydefault("setLanguage()")) {
            AwvSrB.KWHzl("Waiting for remote params. Moving setLanguage() operation to a pending task queue.");
            gkJEwt.KWHzl(new Runnable() { // from class: com.onesignal.OneSignal.5
                @Override // java.lang.Runnable
                public void run() {
                    OneSignal.AwvSrB.OLrzqt("Running setLanguage() operation from pending task queue.");
                    OneSignal.OLrzqt(str, componentCallbacks);
                }
            });
            return;
        }
        OneSignalStateSynchronizer.TaskDescription taskDescription = componentCallbacks != null ? new OneSignalStateSynchronizer.TaskDescription() { // from class: com.onesignal.OneSignal.1
            @Override // com.onesignal.OneSignalStateSynchronizer.TaskDescription
            public void EZpvd(String str2) {
                componentCallbacks.AEQbTJ(str2);
            }

            @Override // com.onesignal.OneSignalStateSynchronizer.TaskDescription
            public void AEQbTJ(OneSignalStateSynchronizer.ActionBar actionBar) {
                componentCallbacks.copydefault(new AssistContent(actionBar.KWHzl, actionBar.EZpvd));
            }
        } : null;
        if (DbNXlk("setLanguage()")) {
            return;
        }
        C57875yqf c57875yqf = new C57875yqf(UeEOUB);
        c57875yqf.copydefault(str);
        hDKMBd.KWHzl(c57875yqf);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("language", hDKMBd.OLrzqt());
            OneSignalStateSynchronizer.KWHzl(jSONObject, taskDescription);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void valueOf(@NonNull String str) {
        KWHzl(str, (String) null, (Fragment) null);
    }

    public static void AEQbTJ(@NonNull String str, @Nullable Fragment fragment) {
        KWHzl(str, (String) null, fragment);
    }

    public static void KWHzl(@NonNull final String str, @Nullable final String str2, @Nullable final Fragment fragment) {
        if (gkJEwt.copydefault("setExternalUserId()")) {
            AwvSrB.KWHzl("Waiting for remote params. Moving setExternalUserId() operation to a pending task queue.");
            gkJEwt.KWHzl(new Runnable() { // from class: com.onesignal.OneSignal.2
                @Override // java.lang.Runnable
                public void run() {
                    OneSignal.AwvSrB.OLrzqt("Running setExternalUserId() operation from pending task queue.");
                    OneSignal.KWHzl(str, str2, fragment);
                }
            });
            return;
        }
        if (DbNXlk("setExternalUserId()")) {
            return;
        }
        if (str == null) {
            AwvSrB.AEQbTJ("External id can't be null, set an empty string to remove an external id");
            return;
        }
        if (!str.isEmpty() && DTwDnp() != null && DTwDnp().ejfBZ && (str2 == null || str2.length() == 0)) {
            if (fragment != null) {
                fragment.copydefault(new StateListAnimator(ExternalIdErrorType.REQUIRES_EXTERNAL_ID_AUTH, "External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
            }
            AwvSrB.KWHzl("External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            return;
        }
        if (str2 != null) {
            str2 = str2.toLowerCase();
        }
        try {
            OneSignalStateSynchronizer.OLrzqt(str, str2, fragment);
        } catch (JSONException e) {
            String str3 = str.equals("") ? "remove" : "set";
            AwvSrB.KWHzl("Attempted to " + str3 + " external ID but encountered a JSON exception");
            e.printStackTrace();
        }
    }

    public static void ffGIBT() {
        if (DbNXlk("removeExternalUserId()")) {
            return;
        }
        AEQbTJ((Fragment) null);
    }

    public static void AEQbTJ(Fragment fragment) {
        if (DbNXlk("removeExternalUserId()")) {
            return;
        }
        AEQbTJ("", fragment);
    }

    public static void EZpvd(final String str, final String str2) {
        if (gkJEwt.copydefault("sendTag()")) {
            AwvSrB.KWHzl("Waiting for remote params. Moving sendTag() operation to a pending task queue.");
            gkJEwt.KWHzl(new Runnable() { // from class: com.onesignal.OneSignal.7
                @Override // java.lang.Runnable
                public void run() {
                    OneSignal.AwvSrB.OLrzqt("Running sendTag() operation from pending task queue.");
                    OneSignal.EZpvd(str, str2);
                }
            });
        } else {
            if (DbNXlk("sendTag()")) {
                return;
            }
            try {
                AEQbTJ(new JSONObject().put(str, str2));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static void AEQbTJ(JSONObject jSONObject) {
        copydefault(jSONObject, (TaskDescription) null);
    }

    public static void copydefault(final JSONObject jSONObject, final TaskDescription taskDescription) {
        if (gkJEwt.copydefault("sendTags()")) {
            AwvSrB.KWHzl("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            gkJEwt.KWHzl(new Runnable() { // from class: com.onesignal.OneSignal.10
                @Override // java.lang.Runnable
                public void run() {
                    OneSignal.AwvSrB.OLrzqt("Running sendTags() operation from pending task queue.");
                    OneSignal.copydefault(jSONObject, taskDescription);
                }
            });
        } else {
            if (DbNXlk("sendTags()")) {
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.onesignal.OneSignal.9
                @Override // java.lang.Runnable
                public void run() {
                    if (jSONObject == null) {
                        OneSignal.AwvSrB.KWHzl("Attempted to send null tags");
                        TaskDescription taskDescription2 = taskDescription;
                        if (taskDescription2 != null) {
                            taskDescription2.copydefault(new ContextWrapper(-1, "Attempted to send null tags"));
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject2 = OneSignalStateSynchronizer.copydefault(false).copydefault;
                    JSONObject jSONObject3 = new JSONObject();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            Object objOpt = jSONObject.opt(next);
                            if ((objOpt instanceof JSONArray) || (objOpt instanceof JSONObject)) {
                                OneSignal.KWHzl(LOG_LEVEL.ERROR, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!");
                            } else if (jSONObject.isNull(next) || "".equals(objOpt)) {
                                if (jSONObject2 != null && jSONObject2.has(next)) {
                                    jSONObject3.put(next, "");
                                }
                            } else {
                                jSONObject3.put(next, objOpt.toString());
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (!jSONObject3.toString().equals("{}")) {
                        OneSignal.AwvSrB.OLrzqt("Available tags to send: " + jSONObject3.toString());
                        OneSignalStateSynchronizer.EZpvd(jSONObject3, taskDescription);
                        return;
                    }
                    OneSignal.AwvSrB.OLrzqt("Send tags ended successfully");
                    TaskDescription taskDescription3 = taskDescription;
                    if (taskDescription3 != null) {
                        taskDescription3.EZpvd(jSONObject2);
                    }
                }
            };
            if (gkJEwt.OLrzqt()) {
                AwvSrB.OLrzqt("Sending sendTags() operation to pending task queue.");
                gkJEwt.KWHzl(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public static void KWHzl(final Dialog dialog) {
        if (gkJEwt.copydefault("getTags()")) {
            AwvSrB.KWHzl("Waiting for remote params. Moving getTags() operation to a pending queue.");
            gkJEwt.KWHzl(new Runnable() { // from class: com.onesignal.OneSignal.6
                @Override // java.lang.Runnable
                public void run() {
                    OneSignal.AwvSrB.OLrzqt("Running getTags() operation from pending queue.");
                    OneSignal.KWHzl(dialog);
                }
            });
        } else {
            if (DbNXlk("getTags()")) {
                return;
            }
            if (dialog == null) {
                AwvSrB.KWHzl("getTags called with null GetTagsHandler!");
            } else {
                new Thread(new Runnable() { // from class: com.onesignal.OneSignal.11
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (OneSignal.aKErDB) {
                            OneSignal.aKErDB.add(dialog);
                            if (OneSignal.aKErDB.size() > 1) {
                                return;
                            }
                            OneSignal.DCUTEI();
                        }
                    }
                }, "OS_GETTAGS").start();
            }
        }
    }

    public static void DCUTEI() {
        if (finit() == null) {
            AwvSrB.AEQbTJ("getTags called under a null user!");
        } else {
            gasjUx();
        }
    }

    public static void gasjUx() {
        ArrayList<Dialog> arrayList = aKErDB;
        synchronized (arrayList) {
            if (arrayList.size() == 0) {
                return;
            }
            new Thread(new Runnable() { // from class: com.onesignal.OneSignal.13
                @Override // java.lang.Runnable
                public void run() {
                    AbstractC57808ypR.Application applicationCopydefault = OneSignalStateSynchronizer.copydefault(!OneSignal.fJNWhG);
                    if (applicationCopydefault.AEQbTJ) {
                        boolean unused = OneSignal.fJNWhG = true;
                    }
                    synchronized (OneSignal.aKErDB) {
                        Iterator it = OneSignal.aKErDB.iterator();
                        while (it.hasNext()) {
                            ((Dialog) it.next()).EZpvd((applicationCopydefault.copydefault == null || applicationCopydefault.toString().equals("{}")) ? null : applicationCopydefault.copydefault);
                        }
                        OneSignal.aKErDB.clear();
                    }
                }
            }, "OS_GETTAGS_CALLBACK").start();
        }
    }

    public static void KWHzl(String str) {
        KWHzl(str, (TaskDescription) null);
    }

    public static void KWHzl(String str, TaskDescription taskDescription) {
        if (DbNXlk("deleteTag()")) {
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        copydefault(arrayList, taskDescription);
    }

    public static void copydefault(Collection<String> collection, TaskDescription taskDescription) {
        if (DbNXlk("deleteTags()")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                jSONObject.put(it.next(), "");
            }
            copydefault(jSONObject, taskDescription);
        } catch (Throwable th) {
            OLrzqt(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", th);
        }
    }

    public static void OLrzqt(JSONArray jSONArray, TaskDescription taskDescription) {
        if (DbNXlk("deleteTags()")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < jSONArray.length(); i++) {
                jSONObject.put(jSONArray.getString(i), "");
            }
            copydefault(jSONObject, taskDescription);
        } catch (Throwable th) {
            OLrzqt(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", th);
        }
    }

    public static void OLrzqt(JSONArray jSONArray, boolean z, C57837ypu.TaskDescription taskDescription) {
        if (DbNXlk("sendPurchases()")) {
            return;
        }
        if (finit() == null) {
            FragmentManager fragmentManager = new FragmentManager(jSONArray);
            ejfBZ = fragmentManager;
            fragmentManager.copydefault = z;
            fragmentManager.OLrzqt = taskDescription;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HiAnalyticsConstant.BI_KEY_APP_ID, QbewEr());
            if (z) {
                jSONObject.put("existing", true);
            }
            jSONObject.put("purchases", jSONArray);
            OneSignalStateSynchronizer.KWHzl(jSONObject, taskDescription);
        } catch (Throwable th) {
            OLrzqt(LOG_LEVEL.ERROR, "Failed to generate JSON for sendPurchases.", th);
        }
    }

    public static void EZpvd(JSONArray jSONArray) {
        if (DTwDnp == null) {
            RlQdEF.add(jSONArray);
            return;
        }
        C57747yoJ c57747yoJAEQbTJ = AEQbTJ(jSONArray);
        OLrzqt(c57747yoJAEQbTJ, KWHzl);
        AEQbTJ(c57747yoJAEQbTJ);
    }

    public static C57747yoJ AEQbTJ(JSONArray jSONArray) {
        int length = jSONArray.length();
        int iOptInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        String strOptString = null;
        JSONObject jSONObject = null;
        for (int i = 0; i < length; i++) {
            try {
                jSONObject = jSONArray.getJSONObject(i);
                if (strOptString == null && jSONObject.has("actionId")) {
                    strOptString = jSONObject.optString("actionId", null);
                }
                if (z) {
                    z = false;
                } else {
                    arrayList.add(new C57789yoz(jSONObject));
                }
            } catch (Throwable th) {
                OLrzqt(LOG_LEVEL.ERROR, "Error parsing JSON item " + i + "/" + length + " for callback.", th);
            }
        }
        return new C57747yoJ(new C57789yoz(arrayList, jSONObject, iOptInt), new OSNotificationAction(strOptString != null ? OSNotificationAction.ActionType.ActionTaken : OSNotificationAction.ActionType.Opened, strOptString));
    }

    public static void AEQbTJ(final C57747yoJ c57747yoJ) {
        CallbackThreadManager.Companion.AEQbTJ(new Runnable() { // from class: com.onesignal.OneSignal.15
            @Override // java.lang.Runnable
            public void run() {
                OneSignal.DTwDnp.EZpvd(c57747yoJ);
            }
        });
    }

    public static void KWHzl(C57745yoH c57745yoH) {
        try {
            JSONObject jSONObject = new JSONObject(c57745yoH.OLrzqt().toString());
            jSONObject.put("androidNotificationId", c57745yoH.AEQbTJ());
            C57747yoJ c57747yoJAEQbTJ = AEQbTJ(C57692ynH.EZpvd(jSONObject));
            if (AxsJAYaxsJAY == null || !zsXlph()) {
                return;
            }
            AxsJAYaxsJAY.AEQbTJ(c57747yoJAEQbTJ);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean AEQbTJ(C57745yoH c57745yoH) {
        if (!iRxXKY()) {
            AEQbTJ(LOG_LEVEL.INFO, "App is in background, show notification");
            return false;
        }
        if (QUSxYX == null) {
            AEQbTJ(LOG_LEVEL.INFO, "No NotificationWillShowInForegroundHandler setup, show notification");
            return false;
        }
        if (!c57745yoH.values()) {
            return true;
        }
        AEQbTJ(LOG_LEVEL.INFO, "Not firing notificationWillShowInForegroundHandler for restored notifications");
        return false;
    }

    public static void OLrzqt(C57740yoC c57740yoC) {
        AEQbTJ(LOG_LEVEL.INFO, "Fire notificationWillShowInForegroundHandler");
        C57746yoI c57746yoICopydefault = c57740yoC.copydefault();
        try {
            QUSxYX.AEQbTJ(c57746yoICopydefault);
        } catch (Throwable th) {
            AEQbTJ(LOG_LEVEL.ERROR, "Exception thrown while notification was being processed for display by notificationWillShowInForegroundHandler, showing notification in foreground!");
            c57746yoICopydefault.EZpvd(c57746yoICopydefault.KWHzl());
            throw th;
        }
    }

    public static void EZpvd(android.app.Activity activity, JSONArray jSONArray, @Nullable String str) {
        if (DbNXlk((String) null)) {
            return;
        }
        EZpvd(activity, jSONArray);
        if (AxsJAYaxsJAY != null && zsXlph()) {
            AxsJAYaxsJAY.EZpvd(AEQbTJ(jSONArray));
        }
        if (copydefault(activity, jSONArray)) {
            AEQbTJ(str);
        }
        KWHzl(activity, jSONArray);
        EZpvd(jSONArray);
    }

    public static void KWHzl(@NonNull android.app.Activity activity, @NonNull JSONArray jSONArray) {
        try {
            Intent intentEZpvd = C57734ynx.copydefault.EZpvd(activity, jSONArray.getJSONObject(0)).EZpvd();
            if (intentEZpvd != null) {
                AwvSrB.copydefault("SDK running startActivity with Intent: " + intentEZpvd);
                activity.startActivity(intentEZpvd);
            } else {
                AwvSrB.copydefault("SDK not showing an Activity automatically due to it's settings.");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean copydefault(android.app.Activity activity, JSONArray jSONArray) {
        if (iwGUEr) {
            return false;
        }
        try {
            return new C57742yoE(activity, jSONArray.getJSONObject(0)).KWHzl();
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    public static void AEQbTJ(@Nullable String str) {
        KWHzl = AppEntryAction.NOTIFICATION_CLICK;
        gHZMYf().OLrzqt(KWHzl, str);
    }

    public static void EZpvd(Context context, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String strOptString = new JSONObject(jSONArray.getJSONObject(i).optString("custom", null)).optString("i", null);
                if (!dNCPSb.contains(strOptString)) {
                    dNCPSb.add(strOptString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(HiAnalyticsConstant.BI_KEY_APP_ID, AYXKKw(context));
                    jSONObject.put("player_id", gEmmrt(context));
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", QVAiDq.uzCIH());
                    C57837ypu.OLrzqt("notifications/" + strOptString, jSONObject, new C57837ypu.TaskDescription() { // from class: com.onesignal.OneSignal.12
                        @Override // o.C57837ypu.TaskDescription
                        public void OLrzqt(int i2, String str, Throwable th) {
                            OneSignal.AEQbTJ("sending Notification Opened Failed", i2, th, str);
                        }
                    });
                }
            } catch (Throwable th) {
                OLrzqt(LOG_LEVEL.ERROR, "Failed to generate JSON to send notification opened.", th);
            }
        }
    }

    public static void copydefault(String str) {
        if (AEQbTJ == null) {
            return;
        }
        C57834ypr.copydefault(C57834ypr.copydefault, "GT_APP_ID", str);
    }

    public static String QbewEr() {
        return AYXKKw(AEQbTJ);
    }

    public static String AYXKKw(Context context) {
        if (context == null) {
            return null;
        }
        return C57834ypr.AEQbTJ(C57834ypr.copydefault, "GT_APP_ID", (String) null);
    }

    public static String gEmmrt(Context context) {
        if (context == null) {
            return null;
        }
        return C57834ypr.AEQbTJ(C57834ypr.copydefault, "GT_PLAYER_ID", (String) null);
    }

    public static boolean flVtFt() {
        return finit() != null;
    }

    public static String finit() {
        Context context;
        if (AxsJAYsNCnLh == null && (context = AEQbTJ) != null) {
            AxsJAYsNCnLh = gEmmrt(context);
        }
        return AxsJAYsNCnLh;
    }

    public static void AhwBna(String str) {
        AxsJAYsNCnLh = str;
        if (AEQbTJ == null) {
            return;
        }
        C57834ypr.copydefault(C57834ypr.copydefault, "GT_PLAYER_ID", AxsJAYsNCnLh);
    }

    public static boolean gGvvIC() {
        return !TextUtils.isEmpty(values);
    }

    public static String AuCTelauCTel() {
        if (values == null && AEQbTJ != null) {
            values = C57834ypr.AEQbTJ(C57834ypr.copydefault, "OS_EMAIL_ID", (String) null);
        }
        if (TextUtils.isEmpty(values)) {
            return null;
        }
        return values;
    }

    public static void EZpvd(String str) {
        values = str;
        if (AEQbTJ == null) {
            return;
        }
        C57834ypr.copydefault(C57834ypr.copydefault, "OS_EMAIL_ID", "".equals(values) ? null : values);
    }

    public static boolean giSNqX() {
        return !TextUtils.isEmpty(dvKsVJ);
    }

    public static String QfsBiF() {
        if (dvKsVJ == null && AEQbTJ != null) {
            dvKsVJ = C57834ypr.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_SMS_ID", (String) null);
        }
        if (TextUtils.isEmpty(dvKsVJ)) {
            return null;
        }
        return dvKsVJ;
    }

    public static void AYXKKw(String str) {
        dvKsVJ = str;
        if (AEQbTJ == null) {
            return;
        }
        C57834ypr.copydefault(C57834ypr.copydefault, "PREFS_OS_SMS_ID", "".equals(dvKsVJ) ? null : dvKsVJ);
    }

    public static void AkhnZx(String str) {
        AhwBna(str);
        gasjUx();
        EZpvd(AEQbTJ).copydefault(str);
        FragmentManager fragmentManager = ejfBZ;
        if (fragmentManager != null) {
            OLrzqt(fragmentManager.AEQbTJ, fragmentManager.copydefault, fragmentManager.OLrzqt);
            ejfBZ = null;
        }
        OneSignalStateSynchronizer.fetchVPNInfo();
    }

    public static void isConnected(String str) {
        EZpvd(str);
        AEQbTJ(AEQbTJ).EZpvd(str);
        try {
            OneSignalStateSynchronizer.AEQbTJ(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void values(String str) {
        AYXKKw(str);
        copydefault(AEQbTJ).AEQbTJ(str);
    }

    public static boolean zsXlph() {
        return fFgQHt.AEQbTJ();
    }

    public static boolean uzCIH() {
        return fFgQHt.KWHzl();
    }

    public static boolean zLjUOn() {
        return fFgQHt.valueOf();
    }

    public static boolean hUfVAv() {
        return fFgQHt.gEmmrt();
    }

    public static boolean accept() {
        return fFgQHt.djBIcL();
    }

    public static void EZpvd(long j) {
        AwvSrB.OLrzqt("Last session time set to: " + j);
        C57834ypr.EZpvd(C57834ypr.copydefault, "OS_LAST_SESSION_TIME", j);
    }

    public static long AwvSrB() {
        return C57834ypr.OLrzqt(C57834ypr.copydefault, "OS_LAST_SESSION_TIME", -31000L);
    }

    public static void EZpvd(boolean z) {
        if (QOLQEE().AYXKKw()) {
            return;
        }
        QOLQEE().EZpvd(z);
    }

    public static void gEmmrt(boolean z) {
        AwvSrB.OLrzqt("OneSignal startLocationShared: " + z);
        QOLQEE().KWHzl(z);
        if (z) {
            return;
        }
        AwvSrB.OLrzqt("OneSignal is shareLocation set false, clearing last location!");
        OneSignalStateSynchronizer.EZpvd();
    }

    public static void EZpvd(@Nullable final TaskStackBuilder taskStackBuilder, final boolean z) {
        if (gkJEwt.copydefault("promptLocation()")) {
            AwvSrB.KWHzl("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            gkJEwt.KWHzl(new Runnable() { // from class: com.onesignal.OneSignal.14
                @Override // java.lang.Runnable
                public void run() {
                    OneSignal.AwvSrB.OLrzqt("Running promptLocation() operation from pending queue.");
                    OneSignal.EZpvd(taskStackBuilder, z);
                }
            });
        } else {
            if (DbNXlk("promptLocation()")) {
                return;
            }
            LocationController.OLrzqt(AEQbTJ, true, z, new LocationController.Activity() { // from class: com.onesignal.OneSignal.18
                @Override // com.onesignal.LocationController.StateListAnimator
                public LocationController.PermissionType OLrzqt() {
                    return LocationController.PermissionType.PROMPT_LOCATION;
                }

                @Override // com.onesignal.LocationController.StateListAnimator
                public void EZpvd(LocationController.ActionBar actionBar) {
                    if (OneSignal.DbNXlk("promptLocation()") || actionBar == null) {
                        return;
                    }
                    OneSignalStateSynchronizer.EZpvd(actionBar);
                }

                @Override // com.onesignal.LocationController.Activity
                public void AEQbTJ(PromptActionResult promptActionResult) {
                    super.AEQbTJ(promptActionResult);
                    TaskStackBuilder taskStackBuilder2 = taskStackBuilder;
                    if (taskStackBuilder2 != null) {
                        taskStackBuilder2.KWHzl(promptActionResult);
                    }
                }
            });
        }
    }

    public static void copydefault(boolean z, @Nullable BroadcastReceiver broadcastReceiver) {
        C57705ynU.OLrzqt.KWHzl(z, broadcastReceiver);
    }

    public static void AEQbTJ(final int i) {
        if (gkJEwt.copydefault("removeNotification()") || OcIXYQ == null) {
            AwvSrB.KWHzl("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
            gkJEwt.KWHzl(new Runnable() { // from class: com.onesignal.OneSignal.16
                @Override // java.lang.Runnable
                public void run() {
                    OneSignal.AwvSrB.OLrzqt("Running removeNotification() operation from pending queue.");
                    OneSignal.AEQbTJ(i);
                }
            });
        } else {
            if (DbNXlk("removeNotification()")) {
                return;
            }
            OcIXYQ.EZpvd(i, new WeakReference<>(AEQbTJ));
        }
    }

    public static void KWHzl(InterfaceC57756yoS interfaceC57756yoS) {
        if (AEQbTJ == null) {
            AwvSrB.KWHzl("OneSignal.initWithContext has not been called. Could not add subscription observer");
            return;
        }
        RcXXUw().AEQbTJ(interfaceC57756yoS);
        if (EZpvd(AEQbTJ).copydefault(AhwBna(AEQbTJ))) {
            OSSubscriptionChangedInternalObserver.KWHzl(EZpvd(AEQbTJ));
        }
    }

    public static void KWHzl(Context context, JSONObject jSONObject, @NonNull C57788yoy.Application application) {
        if (OcIXYQ == null) {
            OcIXYQ = new C57788yoy(valueOf(context), AwvSrB);
        }
        OcIXYQ.EZpvd(jSONObject, application);
    }

    public static String EZpvd(@Nullable JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(jSONObject.getString("custom"));
        } catch (JSONException unused) {
            AwvSrB.OLrzqt("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
        }
        if (jSONObject2.has("i")) {
            return jSONObject2.optString("i", null);
        }
        AwvSrB.OLrzqt("Not a OneSignal formatted FCM message. No 'i' field in custom.");
        return null;
    }

    public static boolean AxsJAYaxsJAY() {
        return getNewProxyInstance && iRxXKY();
    }

    public static boolean RKDWNf() {
        return iRxXKY() && gkJEwt();
    }

    public static boolean gkJEwt() {
        long jKWHzl = aKErDB().KWHzl();
        long jAwvSrB = AwvSrB();
        long j = jKWHzl - jAwvSrB;
        AwvSrB.OLrzqt("isPastOnSessionTime currentTimeMillis: " + jKWHzl + " lastSessionTime: " + jAwvSrB + " difference: " + j);
        return j >= 30000;
    }

    public static boolean AkhnZx() {
        if (fFgQHt.AkhnZx()) {
            return OSUtils.AEQbTJ(AEQbTJ);
        }
        return true;
    }

    public static void fvQaOB() {
        ActionBar actionBar = AkhnZx;
        if (actionBar != null) {
            actionBar.OLrzqt();
            AkhnZx = null;
        }
    }

    public static void fFgQHt() {
        ActionBar actionBar = AkhnZx;
        if (actionBar != null) {
            actionBar.KWHzl(new Activity(EmailErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            AkhnZx = null;
        }
    }

    public static void fARcdN() {
        ActionBar actionBar = isConnected;
        if (actionBar != null) {
            actionBar.OLrzqt();
            isConnected = null;
        }
    }

    public static void fIwbmz() {
        ActionBar actionBar = isConnected;
        if (actionBar != null) {
            actionBar.KWHzl(new Activity(EmailErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            isConnected = null;
        }
    }

    public static void copydefault(JSONObject jSONObject) {
        ComponentCallbacks2 componentCallbacks2 = gGvvIC;
        if (componentCallbacks2 != null) {
            componentCallbacks2.OLrzqt(jSONObject);
            gGvvIC = null;
        }
    }

    public static void ejfBZ() {
        ComponentCallbacks2 componentCallbacks2 = gGvvIC;
        if (componentCallbacks2 != null) {
            componentCallbacks2.copydefault(new ComponentName(SMSErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            gGvvIC = null;
        }
    }

    public static C57830ypn getFieldNames() {
        return C57830ypn.KWHzl(AEQbTJ);
    }

    public static C57830ypn valueOf(Context context) {
        return C57830ypn.KWHzl(context);
    }

    public static FocusTimeController wlaJM() {
        if (fIwbmz == null) {
            fIwbmz = new FocusTimeController(new C57772yoi(), AwvSrB);
        }
        return fIwbmz;
    }

    public static C57759yoV RJOkX() {
        return gHZMYf();
    }

    public static void copydefault(@NonNull List<C57781yor> list) {
        C57748yoK c57748yoK = QbewEr;
        if (c57748yoK == null || AhwBna == null) {
            KWHzl(LOG_LEVEL.ERROR, "Make sure OneSignal.init is called first");
        } else {
            c57748yoK.EZpvd(list);
        }
    }
}
