package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.rTq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42459rTq {
    public static final C42459rTq KWHzl = new C42459rTq();

    private C42459rTq() {
    }

    public final boolean values() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "kyc_fd_so_not_load_again", null, 2, null), (java.lang.Object) "treatment");
    }

    public final boolean djBIcL() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "kyc_camera_aspect_ratio_fix_flag", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final boolean AYXKKw() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "kyc_camera_fixed_zoom_flag", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final boolean isConnected() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "efr-liveness-config", null, 2, null), (java.lang.Object) "treatment");
    }

    public final int EZpvd() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "efr-init-retry-times", null, 2, null);
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Integer.valueOf(value$default != null ? java.lang.Integer.parseInt(value$default) : 0));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = 0;
        }
        return ((java.lang.Number) objM7377constructorimpl).intValue();
    }

    public final java.lang.String AEQbTJ() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.String.valueOf((JSONObject) ABTestManager.getPayload$default(ABTestManager.AEQbTJ, "kyc_id_capture_threshold_value", null, 2, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.String) (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : null);
    }

    public final boolean KWHzl() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "compliance_deprecate_upload_callback_api", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final boolean gEmmrt() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "updatedcalendarpickerflag", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final boolean AhwBna() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "kyc_recall_config", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final java.lang.String valueOf() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string;
        try {
            Result.Application application = Result.Companion;
            java.lang.Object payload$default = ABTestManager.getPayload$default(ABTestManager.AEQbTJ, "kyc_recall_config", null, 2, null);
            if (payload$default instanceof JSONObject) {
                string = ((JSONObject) payload$default).toString();
            } else {
                string = payload$default instanceof java.lang.String ? (java.lang.String) payload$default : null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(string);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final java.util.List<Activity> OLrzqt() {
        java.lang.Object objM7377constructorimpl;
        java.util.List<Activity> listOLrzqt;
        try {
            Result.Application application = Result.Companion;
            java.lang.Object payload$default = ABTestManager.getPayload$default(ABTestManager.AEQbTJ, "kyc_rapidfire_config", null, 2, null);
            if (payload$default instanceof JSONArray) {
                listOLrzqt = copydefault((JSONArray) payload$default);
            } else if (payload$default instanceof JSONObject) {
                listOLrzqt = copydefault((JSONObject) payload$default);
            } else {
                listOLrzqt = payload$default instanceof java.lang.String ? OLrzqt((java.lang.String) payload$default) : yDY.AhwBna();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(listOLrzqt);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = yDY.AhwBna();
        }
        return (java.util.List) objM7377constructorimpl;
    }

    public final Activity EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String lowerCase;
        java.lang.String lowerCase2;
        java.lang.String string;
        java.lang.String string2;
        java.lang.Object obj = null;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        java.lang.String strEZpvd = EZpvd(str4);
        java.util.Iterator<T> it = OLrzqt().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            Activity activity = (Activity) next;
            if (activity.AEQbTJ() && Intrinsics.EZpvd((java.lang.Object) activity.EZpvd(), (java.lang.Object) str)) {
                C42459rTq c42459rTq = KWHzl;
                java.lang.String strGEmmrt = activity.gEmmrt();
                if (str2 == null || (string2 = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str2).toString()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = string2.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                }
                if (c42459rTq.copydefault(strGEmmrt, lowerCase)) {
                    java.util.List<java.lang.String> listKWHzl = activity.KWHzl();
                    if (str3 == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str3).toString()) == null) {
                        lowerCase2 = null;
                    } else {
                        lowerCase2 = string.toLowerCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    }
                    if (c42459rTq.OLrzqt(listKWHzl, lowerCase2) && c42459rTq.OLrzqt(activity.OLrzqt(), strEZpvd)) {
                        obj = next;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return (Activity) obj;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object payload$default = ABTestManager.getPayload$default(ABTestManager.AEQbTJ, "kyc_rapidfire_exp_" + str, null, 2, null);
        if (payload$default instanceof JSONObject) {
            return ((JSONObject) payload$default).toString();
        }
        if (payload$default instanceof java.lang.String) {
            return (java.lang.String) payload$default;
        }
        return null;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        java.lang.Object payload$default = ABTestManager.getPayload$default(ABTestManager.AEQbTJ, str, null, 2, null);
        if (payload$default instanceof JSONObject) {
            return ((JSONObject) payload$default).toString();
        }
        if (payload$default instanceof java.lang.String) {
            return (java.lang.String) payload$default;
        }
        return null;
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String lowerCase;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String str5 = null;
        if (str == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        if (lowerCase != null && lowerCase.length() != 0) {
            str5 = lowerCase;
        }
        if (str5 == null) {
            str5 = "unknown";
        }
        return str5 + "_" + EZpvd(str2) + "_" + str4;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.String string;
        if (str == null || (string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString()) == null) {
            return "en";
        }
        if (string.length() == 0) {
            string = null;
        }
        if (string == null) {
            return "en";
        }
        java.lang.String strReplace$default = C59449zhJ.replace$default(string, '_', '-', false, 4, (java.lang.Object) null);
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = strReplace$default.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String language = java.util.Locale.forLanguageTag(lowerCase).getLanguage();
        Intrinsics.copydefault((java.lang.Object) language);
        if (language.length() > 0) {
            return language;
        }
        java.lang.String lowerCase2 = C59454zhO.AkhnZx(string, 2).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return lowerCase2;
    }

    public final boolean OLrzqt(java.util.List<java.lang.String> list, java.lang.String str) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) it.next()).toString().toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.util.List<Activity> copydefault(JSONObject jSONObject) {
        java.util.List<Activity> listEZpvd;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray != null) {
            return copydefault(jSONArrayOptJSONArray);
        }
        Activity activityOLrzqt = OLrzqt(jSONObject);
        return (activityOLrzqt == null || (listEZpvd = C56402yEa.EZpvd(activityOLrzqt)) == null) ? yDY.AhwBna() : listEZpvd;
    }

    public final java.util.List<Activity> OLrzqt(java.lang.String str) {
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        return string.length() == 0 ? yDY.AhwBna() : C59449zhJ.startsWith$default(string, "[", false, 2, null) ? copydefault(new JSONArray(string)) : C59449zhJ.startsWith$default(string, "{", false, 2, null) ? copydefault(new JSONObject(string)) : yDY.AhwBna();
    }

    public final java.util.List<Activity> copydefault(JSONArray jSONArray) {
        Activity activityOLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (activityOLrzqt = OLrzqt(jSONObjectOptJSONObject)) != null) {
                arrayList.add(activityOLrzqt);
            }
        }
        return arrayList;
    }

    public final Activity OLrzqt(JSONObject jSONObject) {
        java.lang.String strOptString = jSONObject.optString("pageID", jSONObject.optString("pageId", ""));
        Intrinsics.checkNotNullExpressionValue(strOptString, "");
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strOptString).toString();
        if (string.length() == 0) {
            return null;
        }
        boolean zOptBoolean = jSONObject.optBoolean("enabled", true);
        java.lang.String strOptString2 = jSONObject.optString("pageType", jSONObject.optString(EopTrackEvent.KEY_PAGE_TYPE, ""));
        Intrinsics.checkNotNullExpressionValue(strOptString2, "");
        java.lang.String string2 = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strOptString2).toString();
        java.lang.String str = string2.length() == 0 ? null : string2;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(EopTrackEvent.KEY_COR);
        java.util.List<java.lang.String> listAEQbTJ = jSONArrayOptJSONArray != null ? AEQbTJ(jSONArrayOptJSONArray) : null;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("languages");
        java.util.List<java.lang.String> listAEQbTJ2 = jSONArrayOptJSONArray2 != null ? AEQbTJ(jSONArrayOptJSONArray2) : null;
        java.lang.String strOptString3 = jSONObject.optString("basePlaybook", jSONObject.optString("base_playbook", ""));
        Intrinsics.checkNotNullExpressionValue(strOptString3, "");
        java.lang.String string3 = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strOptString3).toString();
        java.lang.String str2 = string3.length() == 0 ? null : string3;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("typesToSkipReplacement");
        return new Activity(string, zOptBoolean, str, listAEQbTJ, listAEQbTJ2, str2, jSONArrayOptJSONArray3 != null ? AEQbTJ(jSONArrayOptJSONArray3) : null);
    }

    public final java.util.List<java.lang.String> AEQbTJ(JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            java.lang.String strOptString = jSONArray.optString(i);
            Intrinsics.copydefault((java.lang.Object) strOptString);
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOptString)) {
                arrayList.add(strOptString);
            }
        }
        return arrayList;
    }

    public final boolean copydefault(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return true;
        }
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) str2);
    }

    /* JADX INFO: renamed from: o.rTq$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.util.List<java.lang.String> AYXKKw;
        public final java.lang.String AhwBna;
        public final boolean EZpvd;
        public final java.util.List<java.lang.String> KWHzl;
        public final java.lang.String OLrzqt;
        public final java.util.List<java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.rTq$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, boolean z, java.lang.String str2, java.util.List list, java.util.List list2, java.lang.String str3, java.util.List list3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = activity.EZpvd;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                str2 = activity.AhwBna;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                list = activity.copydefault;
            }
            java.util.List list4 = list;
            if ((i & 16) != 0) {
                list2 = activity.KWHzl;
            }
            java.util.List list5 = list2;
            if ((i & 32) != 0) {
                str3 = activity.OLrzqt;
            }
            java.lang.String str5 = str3;
            if ((i & 64) != 0) {
                list3 = activity.AYXKKw;
            }
            return activity.EZpvd(str, z2, str4, list4, list5, str5, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, boolean z, java.lang.String str2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.String str3, java.util.List<java.lang.String> list3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, z, str2, list, list2, str3, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && this.EZpvd == activity.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) activity.AhwBna) && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd(this.AYXKKw, activity.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = java.lang.Boolean.hashCode(this.EZpvd);
            java.lang.String str = this.AhwBna;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            java.util.List<java.lang.String> list = this.copydefault;
            int iHashCode4 = list == null ? 0 : list.hashCode();
            java.util.List<java.lang.String> list2 = this.KWHzl;
            int iHashCode5 = list2 == null ? 0 : list2.hashCode();
            java.lang.String str2 = this.OLrzqt;
            int iHashCode6 = str2 == null ? 0 : str2.hashCode();
            java.util.List<java.lang.String> list3 = this.AYXKKw;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list3 != null ? list3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PageExperimentGate(pageId=" + this.AEQbTJ + ", enabled=" + this.EZpvd + ", pageType=" + this.AhwBna + ", cor=" + this.copydefault + ", language=" + this.KWHzl + ", basePlaybook=" + this.OLrzqt + ", typesToSkipReplacement=" + this.AYXKKw + ")";
        }

        public Activity(@NotNull java.lang.String str, boolean z, java.lang.String str2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.String str3, java.util.List<java.lang.String> list3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.EZpvd = z;
            this.AhwBna = str2;
            this.copydefault = list;
            this.KWHzl = list2;
            this.OLrzqt = str3;
            this.AYXKKw = list3;
        }
    }

    public final boolean AkhnZx() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "kyc_camera_flexible_resolution", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final boolean AuCTel() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "kyc_cache_user_risk_status", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final boolean fetchVPNInfo() {
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "e2e_disable_kisa_compliance_pop_up", null, 2, null);
        pUU.EZpvd("ComplianceABTestManager", "e2e_disable_kisa_compliance_pop_up -> " + value$default);
        return Intrinsics.EZpvd((java.lang.Object) value$default, (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final boolean DbNXlk() {
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "e2e_disable_restricted_location_pop_up", null, 2, null);
        pUU.EZpvd("ComplianceAbTestManager", "e2e_disable_restricted_location_pop_up -> " + value$default);
        return Intrinsics.EZpvd((java.lang.Object) value$default, (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final boolean ejfBZ() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "kyc_id_scan_ok_core_switch", null, 2, null), (java.lang.Object) "true");
    }

    public final boolean fIwbmz() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "kyc_lca_socket_use_custom_header", null, 2, null), (java.lang.Object) "true")));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = java.lang.Boolean.FALSE;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    public final java.lang.String copydefault() {
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "country_restriction_dialog_hyperlink_path", null, 2, null);
        pUU.EZpvd("ComplianceABTestManager", "country_restriction_dialog_hyperlink_path -> " + value$default);
        return value$default;
    }
}
