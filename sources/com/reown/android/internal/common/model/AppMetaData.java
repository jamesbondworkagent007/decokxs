package com.reown.android.internal.common.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = true)
public final class AppMetaData {
    public final String description;
    public final List<String> icons;
    public final String name;
    public final Redirect redirect;
    public final String url;
    public final String verifyUrl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.reown.android.internal.common.model.AppMetaData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppMetaData copy$default(AppMetaData appMetaData, String str, String str2, List list, String str3, Redirect redirect, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appMetaData.description;
        }
        if ((i & 2) != 0) {
            str2 = appMetaData.url;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            list = appMetaData.icons;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str3 = appMetaData.name;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            redirect = appMetaData.redirect;
        }
        Redirect redirect2 = redirect;
        if ((i & 32) != 0) {
            str4 = appMetaData.verifyUrl;
        }
        return appMetaData.copy(str, str5, list2, str6, redirect2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Redirect component5() {
        return this.redirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.verifyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppMetaData copy(@Json(name = "description") @NotNull String str, @Json(name = "url") @NotNull String str2, @Json(name = "icons") @NotNull List<String> list, @Json(name = "name") @NotNull String str3, @Json(name = "redirect") Redirect redirect, @Json(name = "verifyUrl") String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AppMetaData(str, str2, list, str3, redirect, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppMetaData)) {
            return false;
        }
        AppMetaData appMetaData = (AppMetaData) obj;
        return Intrinsics.EZpvd((Object) this.description, (Object) appMetaData.description) && Intrinsics.EZpvd((Object) this.url, (Object) appMetaData.url) && Intrinsics.EZpvd(this.icons, appMetaData.icons) && Intrinsics.EZpvd((Object) this.name, (Object) appMetaData.name) && Intrinsics.EZpvd(this.redirect, appMetaData.redirect) && Intrinsics.EZpvd((Object) this.verifyUrl, (Object) appMetaData.verifyUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getIcons() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Redirect getRedirect() {
        return this.redirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVerifyUrl() {
        return this.verifyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.description.hashCode();
        int iHashCode2 = this.url.hashCode();
        int iHashCode3 = this.icons.hashCode();
        int iHashCode4 = this.name.hashCode();
        Redirect redirect = this.redirect;
        int iHashCode5 = redirect == null ? 0 : redirect.hashCode();
        String str = this.verifyUrl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppMetaData(description=" + this.description + ", url=" + this.url + ", icons=" + this.icons + ", name=" + this.name + ", redirect=" + this.redirect + ", verifyUrl=" + this.verifyUrl + ")";
    }

    public AppMetaData(@Json(name = "description") @NotNull String str, @Json(name = "url") @NotNull String str2, @Json(name = "icons") @NotNull List<String> list, @Json(name = "name") @NotNull String str3, @Json(name = "redirect") Redirect redirect, @Json(name = "verifyUrl") String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.description = str;
        this.url = str2;
        this.icons = list;
        this.name = str3;
        this.redirect = redirect;
        this.verifyUrl = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.util.List)
  (r13v0 java.lang.String)
  (wrap:com.reown.android.internal.common.model.Redirect:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.reown.android.internal.common.model.Redirect) : (r14v0 com.reown.android.internal.common.model.Redirect))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, com.reown.android.internal.common.model.Redirect, java.lang.String):void (m)] (LINE:7) call: com.reown.android.internal.common.model.AppMetaData.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, com.reown.android.internal.common.model.Redirect, java.lang.String):void type: THIS */
    public /* synthetic */ AppMetaData(String str, String str2, List list, String str3, Redirect redirect, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, str3, (i & 16) != 0 ? null : redirect, (i & 32) != 0 ? null : str4);
    }
}
