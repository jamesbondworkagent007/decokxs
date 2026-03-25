package o;

import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.jvm.internal.Intrinsics;
import o.C57835yps;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: o.ypZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57816ypZ {
    public final InterfaceC57757yoT KWHzl;

    public C57816ypZ(@NotNull InterfaceC57757yoT interfaceC57757yoT) {
        Intrinsics.checkNotNullParameter(interfaceC57757yoT, "");
        this.KWHzl = interfaceC57757yoT;
    }

    public final void AEQbTJ(@NotNull OSInfluenceType oSInfluenceType) {
        Intrinsics.checkNotNullParameter(oSInfluenceType, "");
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        interfaceC57757yoT.KWHzl(interfaceC57757yoT.copydefault(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", oSInfluenceType.toString());
    }

    public final OSInfluenceType AhwBna() {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        return OSInfluenceType.Companion.AEQbTJ(interfaceC57757yoT.OLrzqt(interfaceC57757yoT.copydefault(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", OSInfluenceType.UNATTRIBUTED.toString()));
    }

    public final void copydefault(@NotNull OSInfluenceType oSInfluenceType) {
        Intrinsics.checkNotNullParameter(oSInfluenceType, "");
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        interfaceC57757yoT.KWHzl(interfaceC57757yoT.copydefault(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", oSInfluenceType.toString());
    }

    public final OSInfluenceType OLrzqt() {
        java.lang.String string = OSInfluenceType.UNATTRIBUTED.toString();
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        return OSInfluenceType.Companion.AEQbTJ(interfaceC57757yoT.OLrzqt(interfaceC57757yoT.copydefault(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", string));
    }

    public final void KWHzl(java.lang.String str) {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        interfaceC57757yoT.KWHzl(interfaceC57757yoT.copydefault(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", str);
    }

    public final java.lang.String EZpvd() {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        return interfaceC57757yoT.OLrzqt(interfaceC57757yoT.copydefault(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", null);
    }

    public final void OLrzqt(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        interfaceC57757yoT.KWHzl(interfaceC57757yoT.copydefault(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray.toString());
    }

    public final void copydefault(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        interfaceC57757yoT.KWHzl(interfaceC57757yoT.copydefault(), "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray.toString());
    }

    public final JSONArray gEmmrt() throws JSONException {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        java.lang.String strOLrzqt = interfaceC57757yoT.OLrzqt(interfaceC57757yoT.copydefault(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        JSONArray jSONArray = strOLrzqt == null ? null : new JSONArray(strOLrzqt);
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public final JSONArray KWHzl() throws JSONException {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        java.lang.String strOLrzqt = interfaceC57757yoT.OLrzqt(interfaceC57757yoT.copydefault(), "PREFS_OS_LAST_IAMS_RECEIVED", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        JSONArray jSONArray = strOLrzqt == null ? null : new JSONArray(strOLrzqt);
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public final int valueOf() {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        return interfaceC57757yoT.EZpvd(interfaceC57757yoT.copydefault(), "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    public final int AEQbTJ() {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        return interfaceC57757yoT.EZpvd(interfaceC57757yoT.copydefault(), "PREFS_OS_IAM_LIMIT", 10);
    }

    public final int djBIcL() {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        return interfaceC57757yoT.EZpvd(interfaceC57757yoT.copydefault(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public final int copydefault() {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        return interfaceC57757yoT.EZpvd(interfaceC57757yoT.copydefault(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public final boolean AYXKKw() {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        return interfaceC57757yoT.KWHzl(interfaceC57757yoT.copydefault(), "PREFS_OS_DIRECT_ENABLED", false);
    }

    public final boolean values() {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        return interfaceC57757yoT.KWHzl(interfaceC57757yoT.copydefault(), "PREFS_OS_INDIRECT_ENABLED", false);
    }

    public final boolean isConnected() {
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        return interfaceC57757yoT.KWHzl(interfaceC57757yoT.copydefault(), "PREFS_OS_UNATTRIBUTED_ENABLED", false);
    }

    public final void EZpvd(@NotNull C57835yps.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        InterfaceC57757yoT interfaceC57757yoT = this.KWHzl;
        interfaceC57757yoT.copydefault(interfaceC57757yoT.copydefault(), "PREFS_OS_DIRECT_ENABLED", taskDescription.OLrzqt());
        InterfaceC57757yoT interfaceC57757yoT2 = this.KWHzl;
        interfaceC57757yoT2.copydefault(interfaceC57757yoT2.copydefault(), "PREFS_OS_INDIRECT_ENABLED", taskDescription.valueOf());
        InterfaceC57757yoT interfaceC57757yoT3 = this.KWHzl;
        interfaceC57757yoT3.copydefault(interfaceC57757yoT3.copydefault(), "PREFS_OS_UNATTRIBUTED_ENABLED", taskDescription.AhwBna());
        InterfaceC57757yoT interfaceC57757yoT4 = this.KWHzl;
        interfaceC57757yoT4.copydefault(interfaceC57757yoT4.copydefault(), "PREFS_OS_NOTIFICATION_LIMIT", taskDescription.AEQbTJ());
        InterfaceC57757yoT interfaceC57757yoT5 = this.KWHzl;
        interfaceC57757yoT5.copydefault(interfaceC57757yoT5.copydefault(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", taskDescription.KWHzl());
        InterfaceC57757yoT interfaceC57757yoT6 = this.KWHzl;
        interfaceC57757yoT6.copydefault(interfaceC57757yoT6.copydefault(), "PREFS_OS_IAM_LIMIT", taskDescription.EZpvd());
        InterfaceC57757yoT interfaceC57757yoT7 = this.KWHzl;
        interfaceC57757yoT7.copydefault(interfaceC57757yoT7.copydefault(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", taskDescription.copydefault());
    }
}
