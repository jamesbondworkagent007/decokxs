package com.okinc.localization2.bean;

import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class AppLocale {
    private final String cefiDisplayName;
    private final String displayName;
    private final String languageCode;
    private final Locale locale;
    private final String market;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AppLocale copy$default(AppLocale appLocale, Locale locale, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = appLocale.locale;
        }
        if ((i & 2) != 0) {
            str = appLocale.languageCode;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = appLocale.displayName;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = appLocale.cefiDisplayName;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = appLocale.market;
        }
        return appLocale.copy(locale, str5, str6, str7, str4);
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
    public final AppLocale copy(@NotNull Locale locale, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AppLocale(locale, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLocale)) {
            return false;
        }
        AppLocale appLocale = (AppLocale) obj;
        return Intrinsics.EZpvd(this.locale, appLocale.locale) && Intrinsics.EZpvd((Object) this.languageCode, (Object) appLocale.languageCode) && Intrinsics.EZpvd((Object) this.displayName, (Object) appLocale.displayName) && Intrinsics.EZpvd((Object) this.cefiDisplayName, (Object) appLocale.cefiDisplayName) && Intrinsics.EZpvd((Object) this.market, (Object) appLocale.market);
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
        return "AppLocale(locale=" + this.locale + ", languageCode=" + this.languageCode + ", displayName=" + this.displayName + ", cefiDisplayName=" + this.cefiDisplayName + ", market=" + this.market + ")";
    }

    public AppLocale(@NotNull Locale locale, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4) {
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization2.bean.AppLocale.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AppLocale OLrzqt(@NotNull AppLocaleInfo appLocaleInfo) {
            Intrinsics.checkNotNullParameter(appLocaleInfo, "");
            return new AppLocale(appLocaleInfo.getLocale(), appLocaleInfo.getLanguageCode(), appLocaleInfo.getDisplayName(), appLocaleInfo.getCefiDisplayName(), appLocaleInfo.getMarket());
        }
    }
}
