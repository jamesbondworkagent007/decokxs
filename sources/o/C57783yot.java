package o;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import java.text.SimpleDateFormat;
import java.util.Date;
import o.C57837ypu;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57783yot {
    public final InterfaceC57757yoT AEQbTJ;
    public final C57830ypn EZpvd;
    public final InterfaceC57738yoA KWHzl;
    public int OLrzqt = 0;

    /* JADX INFO: renamed from: o.yot$TaskDescription */
    public interface TaskDescription {
        void KWHzl(java.lang.String str);

        void OLrzqt(java.lang.String str);
    }

    public static /* synthetic */ int EZpvd(C57783yot c57783yot) {
        int i = c57783yot.OLrzqt;
        c57783yot.OLrzqt = i + 1;
        return i;
    }

    public C57783yot(C57830ypn c57830ypn, InterfaceC57738yoA interfaceC57738yoA, InterfaceC57757yoT interfaceC57757yoT) {
        this.EZpvd = c57830ypn;
        this.KWHzl = interfaceC57738yoA;
        this.AEQbTJ = interfaceC57757yoT;
    }

    public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4, java.lang.String str5, boolean z, final java.util.Set<java.lang.String> set, final TaskDescription taskDescription) {
        try {
            C57837ypu.KWHzl("in_app_messages/" + str4 + "/click", new JSONObject(str, i, str2, str5, str3, z) { // from class: o.yot.4
                public final /* synthetic */ boolean AEQbTJ;
                public final /* synthetic */ java.lang.String KWHzl;
                public final /* synthetic */ java.lang.String OLrzqt;
                public final /* synthetic */ int copydefault;
                public final /* synthetic */ java.lang.String djBIcL;
                public final /* synthetic */ java.lang.String gEmmrt;

                {
                    this.KWHzl = str;
                    this.copydefault = i;
                    this.djBIcL = str2;
                    this.OLrzqt = str5;
                    this.gEmmrt = str3;
                    this.AEQbTJ = z;
                    put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                    put("device_type", i);
                    put("player_id", str2);
                    put("click_id", str5);
                    put("variant_id", str3);
                    if (z) {
                        put("first_click", true);
                    }
                }
            }, new C57837ypu.TaskDescription() { // from class: o.yot.3
                @Override // o.C57837ypu.TaskDescription
                public void OLrzqt(java.lang.String str6) {
                    C57783yot.this.copydefault("engagement", str6);
                    C57783yot.this.AEQbTJ(set);
                }

                @Override // o.C57837ypu.TaskDescription
                public void OLrzqt(int i2, java.lang.String str6, java.lang.Throwable th) {
                    C57783yot.this.KWHzl("engagement", i2, str6);
                    taskDescription.KWHzl(str6);
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            this.KWHzl.KWHzl("Unable to execute in-app message action HTTP request due to invalid JSON");
        }
    }

    public void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4, java.lang.String str5, final java.util.Set<java.lang.String> set, final TaskDescription taskDescription) {
        try {
            C57837ypu.KWHzl("in_app_messages/" + str4 + "/pageImpression", new JSONObject(str, str2, str3, i, str5) { // from class: o.yot.2
                public final /* synthetic */ java.lang.String AhwBna;
                public final /* synthetic */ java.lang.String EZpvd;
                public final /* synthetic */ int KWHzl;
                public final /* synthetic */ java.lang.String OLrzqt;
                public final /* synthetic */ java.lang.String copydefault;

                {
                    this.OLrzqt = str;
                    this.EZpvd = str2;
                    this.AhwBna = str3;
                    this.KWHzl = i;
                    this.copydefault = str5;
                    put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                    put("player_id", str2);
                    put("variant_id", str3);
                    put("device_type", i);
                    put("page_id", str5);
                }
            }, new C57837ypu.TaskDescription() { // from class: o.yot.5
                @Override // o.C57837ypu.TaskDescription
                public void OLrzqt(java.lang.String str6) {
                    C57783yot.this.copydefault("page impression", str6);
                    C57783yot.this.gEmmrt(set);
                }

                @Override // o.C57837ypu.TaskDescription
                public void OLrzqt(int i2, java.lang.String str6, java.lang.Throwable th) {
                    C57783yot.this.KWHzl("page impression", i2, str6);
                    taskDescription.KWHzl(str6);
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            this.KWHzl.KWHzl("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    public void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4, final java.util.Set<java.lang.String> set, final TaskDescription taskDescription) {
        try {
            C57837ypu.KWHzl("in_app_messages/" + str4 + "/impression", new JSONObject(str, str2, str3, i) { // from class: o.yot.1
                public final /* synthetic */ java.lang.String EZpvd;
                public final /* synthetic */ int KWHzl;
                public final /* synthetic */ java.lang.String OLrzqt;
                public final /* synthetic */ java.lang.String copydefault;

                {
                    this.EZpvd = str;
                    this.OLrzqt = str2;
                    this.copydefault = str3;
                    this.KWHzl = i;
                    put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                    put("player_id", str2);
                    put("variant_id", str3);
                    put("device_type", i);
                    put("first_impression", true);
                }
            }, new C57837ypu.TaskDescription() { // from class: o.yot.6
                @Override // o.C57837ypu.TaskDescription
                public void OLrzqt(java.lang.String str5) {
                    C57783yot.this.copydefault("impression", str5);
                    C57783yot.this.EZpvd((java.util.Set<java.lang.String>) set);
                }

                @Override // o.C57837ypu.TaskDescription
                public void OLrzqt(int i2, java.lang.String str5, java.lang.Throwable th) {
                    C57783yot.this.KWHzl("impression", i2, str5);
                    taskDescription.KWHzl(str5);
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            this.KWHzl.KWHzl("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    public void OLrzqt(java.lang.String str, java.lang.String str2, final TaskDescription taskDescription) {
        C57837ypu.AEQbTJ("in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, new C57837ypu.TaskDescription() { // from class: o.yot.10
            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(int i, java.lang.String str3, java.lang.Throwable th) {
                C57783yot.this.KWHzl("html", i, str3);
                taskDescription.KWHzl(str3);
            }

            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(java.lang.String str3) {
                taskDescription.OLrzqt(str3);
            }
        }, (java.lang.String) null);
    }

    public void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, final TaskDescription taskDescription) {
        C57837ypu.AEQbTJ(KWHzl(str2, str3, str), new C57837ypu.TaskDescription() { // from class: o.yot.7
            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(int i, java.lang.String str4, java.lang.Throwable th) {
                C57783yot.this.KWHzl("html", i, str4);
                JSONObject jSONObject = new JSONObject();
                if (!OSUtils.AEQbTJ(i) || C57783yot.this.OLrzqt >= OSUtils.copydefault) {
                    C57783yot.this.OLrzqt = 0;
                    try {
                        jSONObject.put("retry", false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else {
                    C57783yot.EZpvd(C57783yot.this);
                    try {
                        jSONObject.put("retry", true);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                taskDescription.KWHzl(jSONObject.toString());
            }

            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(java.lang.String str4) {
                C57783yot.this.OLrzqt = 0;
                taskDescription.OLrzqt(str4);
            }
        }, (java.lang.String) null);
    }

    public void OLrzqt(C57776yom c57776yom) {
        synchronized (this) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(Constants.MessagePayloadKeys.MSGID_SERVER, c57776yom.copydefault);
            contentValues.put("display_quantity", java.lang.Integer.valueOf(c57776yom.OLrzqt().OLrzqt()));
            contentValues.put("last_display", java.lang.Long.valueOf(c57776yom.OLrzqt().copydefault()));
            contentValues.put("click_ids", c57776yom.copydefault().toString());
            contentValues.put("displayed_in_session", java.lang.Boolean.valueOf(c57776yom.valueOf()));
            if (this.EZpvd.AEQbTJ("in_app_message", contentValues, "message_id = ?", new java.lang.String[]{c57776yom.copydefault}) == 0) {
                this.EZpvd.EZpvd("in_app_message", null, contentValues);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[Catch: all -> 0x0098, PHI: r1
  0x0087: PHI (r1v3 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:22:0x0085, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:13:0x006e, B:23:0x0087, B:27:0x008e, B:29:0x0094, B:30:0x0097, B:21:0x0081, B:5:0x0007, B:7:0x001b, B:11:0x0052, B:19:0x0078), top: B:36:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<C57776yom> copydefault() {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList();
            android.database.Cursor cursorKWHzl = null;
            try {
                try {
                    cursorKWHzl = this.EZpvd.KWHzl("in_app_message", null, null, null, null, null, null);
                    if (cursorKWHzl.moveToFirst()) {
                        do {
                            java.lang.String string = cursorKWHzl.getString(cursorKWHzl.getColumnIndex(Constants.MessagePayloadKeys.MSGID_SERVER));
                            java.lang.String string2 = cursorKWHzl.getString(cursorKWHzl.getColumnIndex("click_ids"));
                            int i = cursorKWHzl.getInt(cursorKWHzl.getColumnIndex("display_quantity"));
                            long j = cursorKWHzl.getLong(cursorKWHzl.getColumnIndex("last_display"));
                            boolean z = true;
                            if (cursorKWHzl.getInt(cursorKWHzl.getColumnIndex("displayed_in_session")) != 1) {
                                z = false;
                            }
                            arrayList.add(new C57776yom(string, OSUtils.copydefault(new JSONArray(string2)), z, new C57784you(i, j)));
                        } while (cursorKWHzl.moveToNext());
                    }
                } catch (JSONException e) {
                    OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Generating JSONArray from iam click ids:JSON Failed.", e);
                    if (cursorKWHzl != null && !cursorKWHzl.isClosed()) {
                    }
                }
                if (!cursorKWHzl.isClosed()) {
                    cursorKWHzl.close();
                }
            } catch (java.lang.Throwable th) {
                if (cursorKWHzl != null && !cursorKWHzl.isClosed()) {
                    cursorKWHzl.close();
                }
                throw th;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, IF, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [288=5] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x00b9, PHI: r11
  0x0099: PHI (r11v1 android.database.Cursor) = (r11v0 android.database.Cursor), (r11v2 android.database.Cursor) binds: [B:31:0x0097, B:16:0x0074] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:4:0x0002, B:15:0x0070, B:33:0x009c, B:32:0x0099, B:20:0x0080, B:22:0x0086, B:37:0x00af, B:39:0x00b5, B:40:0x00b8, B:30:0x0093, B:6:0x002a, B:8:0x003a, B:11:0x0041, B:13:0x0047, B:18:0x0077, B:28:0x008e), top: B:44:0x0002, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void EZpvd() {
        synchronized (this) {
            java.lang.String[] strArr = {Constants.MessagePayloadKeys.MSGID_SERVER, "click_ids"};
            java.lang.String[] strArr2 = {java.lang.String.valueOf((java.lang.System.currentTimeMillis() / 1000) - 15552000)};
            java.util.Set<java.lang.String> setAuCTel = OSUtils.AuCTel();
            java.util.Set<java.lang.String> setAuCTel2 = OSUtils.AuCTel();
            android.database.Cursor cursorKWHzl = null;
            try {
                try {
                    cursorKWHzl = this.EZpvd.KWHzl("in_app_message", strArr, "last_display < ?", strArr2, null, null, null);
                } catch (JSONException e) {
                    e.printStackTrace();
                    if (0 != 0 && !cursorKWHzl.isClosed()) {
                    }
                }
                if (cursorKWHzl != null && cursorKWHzl.getCount() != 0) {
                    if (cursorKWHzl.moveToFirst()) {
                        do {
                            java.lang.String string = cursorKWHzl.getString(cursorKWHzl.getColumnIndex(Constants.MessagePayloadKeys.MSGID_SERVER));
                            java.lang.String string2 = cursorKWHzl.getString(cursorKWHzl.getColumnIndex("click_ids"));
                            setAuCTel.add(string);
                            setAuCTel2.addAll(OSUtils.copydefault(new JSONArray(string2)));
                        } while (cursorKWHzl.moveToNext());
                    }
                    if (!cursorKWHzl.isClosed()) {
                        cursorKWHzl.close();
                    }
                    this.EZpvd.AEQbTJ("in_app_message", "last_display < ?", strArr2);
                    copydefault(setAuCTel);
                    OLrzqt(setAuCTel2);
                    return;
                }
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "Attempted to clean 6 month old IAM data, but none exists!");
            } finally {
                if (0 != 0 && !cursorKWHzl.isClosed()) {
                    cursorKWHzl.close();
                }
            }
        }
    }

    public final void copydefault(java.util.Set<java.lang.String> set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        java.lang.String str = C57834ypr.copydefault;
        java.util.Set<java.lang.String> setCopydefault = C57834ypr.copydefault(str, "PREFS_OS_DISPLAYED_IAMS", (java.util.Set<java.lang.String>) null);
        java.util.Set<java.lang.String> setCopydefault2 = C57834ypr.copydefault(str, "PREFS_OS_IMPRESSIONED_IAMS", (java.util.Set<java.lang.String>) null);
        if (setCopydefault != null && setCopydefault.size() > 0) {
            setCopydefault.removeAll(set);
            C57834ypr.EZpvd(str, "PREFS_OS_DISPLAYED_IAMS", setCopydefault);
        }
        if (setCopydefault2 == null || setCopydefault2.size() <= 0) {
            return;
        }
        setCopydefault2.removeAll(set);
        C57834ypr.EZpvd(str, "PREFS_OS_IMPRESSIONED_IAMS", setCopydefault2);
    }

    public final void OLrzqt(java.util.Set<java.lang.String> set) {
        java.lang.String str;
        java.util.Set<java.lang.String> setCopydefault;
        if (set == null || set.size() <= 0 || (setCopydefault = C57834ypr.copydefault((str = C57834ypr.copydefault), "PREFS_OS_CLICKED_CLICK_IDS_IAMS", (java.util.Set<java.lang.String>) null)) == null || setCopydefault.size() <= 0) {
            return;
        }
        setCopydefault.removeAll(set);
        C57834ypr.EZpvd(str, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", setCopydefault);
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str2 == null) {
            this.KWHzl.KWHzl("Unable to find a variant for in-app message " + str);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    public java.util.Set<java.lang.String> OLrzqt() {
        return this.AEQbTJ.KWHzl(C57834ypr.copydefault, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", (java.util.Set<java.lang.String>) null);
    }

    public final void AEQbTJ(java.util.Set<java.lang.String> set) {
        this.AEQbTJ.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    public java.util.Set<java.lang.String> KWHzl() {
        return this.AEQbTJ.KWHzl(C57834ypr.copydefault, "PREFS_OS_IMPRESSIONED_IAMS", (java.util.Set<java.lang.String>) null);
    }

    public final void EZpvd(java.util.Set<java.lang.String> set) {
        this.AEQbTJ.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_IMPRESSIONED_IAMS", set);
    }

    public java.util.Set<java.lang.String> djBIcL() {
        return this.AEQbTJ.KWHzl(C57834ypr.copydefault, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", (java.util.Set<java.lang.String>) null);
    }

    public void gEmmrt(java.util.Set<java.lang.String> set) {
        this.AEQbTJ.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }

    public java.util.Set<java.lang.String> AEQbTJ() {
        return this.AEQbTJ.KWHzl(C57834ypr.copydefault, "PREFS_OS_DISPLAYED_IAMS", (java.util.Set<java.lang.String>) null);
    }

    public void KWHzl(java.util.Set<java.lang.String> set) {
        this.AEQbTJ.AEQbTJ(C57834ypr.copydefault, "PREFS_OS_DISPLAYED_IAMS", set);
    }

    public java.lang.String AYXKKw() {
        return this.AEQbTJ.OLrzqt(C57834ypr.copydefault, "PREFS_OS_CACHED_IAMS", null);
    }

    public void EZpvd(java.lang.String str) {
        this.AEQbTJ.KWHzl(C57834ypr.copydefault, "PREFS_OS_CACHED_IAMS", str);
    }

    public void EZpvd(Date date) {
        this.AEQbTJ.KWHzl(C57834ypr.copydefault, "PREFS_OS_LAST_TIME_IAM_DISMISSED", date != null ? date.toString() : null);
    }

    public Date gEmmrt() {
        java.lang.String strOLrzqt = this.AEQbTJ.OLrzqt(C57834ypr.copydefault, "PREFS_OS_LAST_TIME_IAM_DISMISSED", null);
        if (strOLrzqt == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", java.util.Locale.ENGLISH).parse(strOLrzqt);
        } catch (java.text.ParseException e) {
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.ERROR, e.getLocalizedMessage());
            return null;
        }
    }

    public final void copydefault(java.lang.String str, java.lang.String str2) {
        this.KWHzl.OLrzqt("Successful post for in-app message " + str + " request: " + str2);
    }

    public final void KWHzl(java.lang.String str, int i, java.lang.String str2) {
        this.KWHzl.KWHzl("Encountered a " + i + " error while attempting in-app message " + str + " request: " + str2);
    }
}
