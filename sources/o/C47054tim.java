package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tim, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C47054tim {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public final long EZpvd;
    public final java.lang.String KWHzl;
    public final long OLrzqt;
    public final int copydefault;
    public final java.lang.String djBIcL;
    public final C47050tii fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final long isConnected;
    public final java.lang.String valueOf;
    public final java.util.List<java.lang.String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47054tim copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull C47050tii c47050tii, long j, long j2, int i, @NotNull java.lang.String str7, @NotNull java.lang.String str8, long j3, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(c47050tii, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new C47054tim(str, str2, str3, str4, str5, str6, c47050tii, j, j2, i, str7, str8, j3, list, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47054tim)) {
            return false;
        }
        C47054tim c47054tim = (C47054tim) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c47054tim.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c47054tim.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c47054tim.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c47054tim.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c47054tim.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c47054tim.gEmmrt) && Intrinsics.EZpvd(this.fetchVPNInfo, c47054tim.fetchVPNInfo) && this.OLrzqt == c47054tim.OLrzqt && this.EZpvd == c47054tim.EZpvd && this.copydefault == c47054tim.copydefault && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c47054tim.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c47054tim.AYXKKw) && this.isConnected == c47054tim.isConnected && Intrinsics.EZpvd(this.values, c47054tim.values) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c47054tim.DbNXlk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.valueOf.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + java.lang.Long.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.djBIcL.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + java.lang.Long.hashCode(this.isConnected)) * 31) + this.values.hashCode()) * 31) + this.DbNXlk.hashCode();
    }

    public C47054tim(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull C47050tii c47050tii, long j, long j2, int i, @NotNull java.lang.String str7, @NotNull java.lang.String str8, long j3, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(c47050tii, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.valueOf = str;
        this.KWHzl = str2;
        this.AkhnZx = str3;
        this.AEQbTJ = str4;
        this.AhwBna = str5;
        this.gEmmrt = str6;
        this.fetchVPNInfo = c47050tii;
        this.OLrzqt = j;
        this.EZpvd = j2;
        this.copydefault = i;
        this.djBIcL = str7;
        this.AYXKKw = str8;
        this.isConnected = j3;
        this.values = list;
        this.DbNXlk = str9;
    }

    public final JSONObject EZpvd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pkgName", this.valueOf);
        jSONObject.put("appName", this.KWHzl);
        jSONObject.put("version", this.AkhnZx);
        jSONObject.put(RemoteMessageConst.Notification.ICON, this.AEQbTJ);
        jSONObject.put("permissions", copydefault(this.AhwBna));
        jSONObject.put("services", copydefault(this.gEmmrt));
        jSONObject.put("signatures", this.fetchVPNInfo.OLrzqt());
        jSONObject.put("firstInstallTime", this.OLrzqt);
        jSONObject.put("lastUpdateTime", this.EZpvd);
        jSONObject.put("appUid", this.copydefault);
        jSONObject.put("path", this.djBIcL);
        jSONObject.put("md5", this.AYXKKw);
        jSONObject.put("size", this.isConnected);
        jSONObject.put("soList", new JSONArray((java.util.Collection) this.values));
        jSONObject.put("type", this.DbNXlk);
        return jSONObject;
    }

    public final java.lang.String KWHzl() {
        java.lang.String string = EZpvd().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String string = EZpvd().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public java.lang.String toString() {
        return "AppInfo(package='" + this.valueOf + "', name='" + this.KWHzl + "', version='" + this.AkhnZx + "', size=" + this.isConnected + " bytes)";
    }

    public final JSONArray copydefault(java.lang.String str) {
        try {
            try {
                return new JSONArray(str);
            } catch (java.lang.Exception unused) {
                JSONArray jSONArray = new JSONArray();
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
                java.util.Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) it.next()).toString());
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    if (((java.lang.String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                java.util.Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    jSONArray.put((java.lang.String) it2.next());
                }
                return jSONArray;
            }
        } catch (java.lang.Exception unused2) {
            return new JSONArray();
        }
    }
}
