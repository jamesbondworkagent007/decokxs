package com.okinc.localization2.bean;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33488mxR;
import o.C33490mxT;
import o.pTG;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class AppLocaleInfo {
    public static final String KEY_CEFI_DISPLAY_NAME = "cefiDisplayName";
    public static final String KEY_DISPLAY_NAME = "displayName";
    public static final String KEY_LANGUAGE_CODE = "languageCode";
    public static final String KEY_MARKET = "market";
    private final String cefiDisplayName;
    private final String displayName;
    private final String languageCode;
    private final Locale locale;
    private final String market;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AppLocaleInfo copy$default(AppLocaleInfo appLocaleInfo, Locale locale, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = appLocaleInfo.locale;
        }
        if ((i & 2) != 0) {
            str = appLocaleInfo.languageCode;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = appLocaleInfo.displayName;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = appLocaleInfo.cefiDisplayName;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = appLocaleInfo.market;
        }
        return appLocaleInfo.copy(locale, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Locale component1() {
        return this.locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.languageCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cefiDisplayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.market;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLocaleInfo copy(@NotNull Locale locale, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AppLocaleInfo(locale, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLocaleInfo)) {
            return false;
        }
        AppLocaleInfo appLocaleInfo = (AppLocaleInfo) obj;
        return Intrinsics.EZpvd(this.locale, appLocaleInfo.locale) && Intrinsics.EZpvd((Object) this.languageCode, (Object) appLocaleInfo.languageCode) && Intrinsics.EZpvd((Object) this.displayName, (Object) appLocaleInfo.displayName) && Intrinsics.EZpvd((Object) this.cefiDisplayName, (Object) appLocaleInfo.cefiDisplayName) && Intrinsics.EZpvd((Object) this.market, (Object) appLocaleInfo.market);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCefiDisplayName() {
        return this.cefiDisplayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Locale getLocale() {
        return this.locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarket() {
        return this.market;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.locale.hashCode();
        int iHashCode2 = this.languageCode.hashCode();
        int iHashCode3 = this.displayName.hashCode();
        String str = this.cefiDisplayName;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.market.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppLocaleInfo(locale=" + this.locale + ", languageCode=" + this.languageCode + ", displayName=" + this.displayName + ", cefiDisplayName=" + this.cefiDisplayName + ", market=" + this.market + ")";
    }

    public AppLocaleInfo(@NotNull Locale locale, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.locale = locale;
        this.languageCode = str;
        this.displayName = str2;
        this.cefiDisplayName = str3;
        this.market = str4;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization2.bean.AppLocaleInfo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AppLocaleInfo AEQbTJ(@NotNull String str) {
            String strCopydefault;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(str);
                if (jsonObjectOLrzqt == null) {
                    return null;
                }
                String asString = jsonObjectOLrzqt.get(AppLocaleInfo.KEY_LANGUAGE_CODE).getAsString();
                String asString2 = jsonObjectOLrzqt.get(AppLocaleInfo.KEY_DISPLAY_NAME).getAsString();
                JsonElement jsonElement = jsonObjectOLrzqt.get(AppLocaleInfo.KEY_CEFI_DISPLAY_NAME);
                String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = jsonObjectOLrzqt.get("market");
                if (jsonElement2 == null || (strCopydefault = jsonElement2.getAsString()) == null) {
                    strCopydefault = pTG.OLrzqt.copydefault();
                }
                String str2 = strCopydefault;
                Locale localeForLanguageTag = Locale.forLanguageTag(asString);
                Intrinsics.checkNotNullExpressionValue(localeForLanguageTag, "");
                Intrinsics.copydefault((Object) asString);
                Intrinsics.copydefault((Object) asString2);
                return new AppLocaleInfo(localeForLanguageTag, asString, asString2, asString3, str2);
            } catch (Exception e) {
                pUU.AEQbTJ("AppLocale", "fromSerialized failed.", e);
                return null;
            }
        }
    }

    public final String toSerialized$OKLocalization_localization() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(KEY_LANGUAGE_CODE, this.languageCode);
        linkedHashMap.put(KEY_DISPLAY_NAME, this.displayName);
        linkedHashMap.put(KEY_CEFI_DISPLAY_NAME, this.cefiDisplayName);
        linkedHashMap.put("market", this.market);
        return C33488mxR.EZpvd(linkedHashMap);
    }
}
