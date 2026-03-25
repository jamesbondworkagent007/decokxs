package com.okinc.localization.bean;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguageItem {
    public static final int $stable = 8;
    private final String cefiDisplayName;
    private final String displayName;
    private final boolean hideInCefiMode;
    private final String languageCode;
    private final Locale locale;
    private final String market;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LanguageItem copy$default(LanguageItem languageItem, Locale locale, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = languageItem.locale;
        }
        if ((i & 2) != 0) {
            str = languageItem.languageCode;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = languageItem.displayName;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = languageItem.cefiDisplayName;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            z = languageItem.hideInCefiMode;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str4 = languageItem.market;
        }
        return languageItem.copy(locale, str5, str6, str7, z2, str4);
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
    public final boolean component5() {
        return this.hideInCefiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.market;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguageItem copy(@NotNull Locale locale, @NotNull String str, @NotNull String str2, String str3, boolean z, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new LanguageItem(locale, str, str2, str3, z, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageItem)) {
            return false;
        }
        LanguageItem languageItem = (LanguageItem) obj;
        return Intrinsics.EZpvd(this.locale, languageItem.locale) && Intrinsics.EZpvd((Object) this.languageCode, (Object) languageItem.languageCode) && Intrinsics.EZpvd((Object) this.displayName, (Object) languageItem.displayName) && Intrinsics.EZpvd((Object) this.cefiDisplayName, (Object) languageItem.cefiDisplayName) && this.hideInCefiMode == languageItem.hideInCefiMode && Intrinsics.EZpvd((Object) this.market, (Object) languageItem.market);
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
    public final boolean getHideInCefiMode() {
        return this.hideInCefiMode;
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
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hideInCefiMode)) * 31) + this.market.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LanguageItem(locale=" + this.locale + ", languageCode=" + this.languageCode + ", displayName=" + this.displayName + ", cefiDisplayName=" + this.cefiDisplayName + ", hideInCefiMode=" + this.hideInCefiMode + ", market=" + this.market + ")";
    }

    public LanguageItem(@NotNull Locale locale, @NotNull String str, @NotNull String str2, String str3, boolean z, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.locale = locale;
        this.languageCode = str;
        this.displayName = str2;
        this.cefiDisplayName = str3;
        this.hideInCefiMode = z;
        this.market = str4;
    }

    public final String getDisplayNameWithType(@NotNull NameType nameType) {
        Intrinsics.checkNotNullParameter(nameType, "");
        String str = this.cefiDisplayName;
        return (str == null || str.length() == 0 || nameType != NameType.CEFI) ? this.displayName : this.cefiDisplayName;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NameType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ NameType[] $VALUES;
        public static final NameType CEFI = new NameType("CEFI", 0);
        public static final NameType OTHERS = new NameType("OTHERS", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ NameType[] $values() {
            return new NameType[]{CEFI, OTHERS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<NameType> getEntries() {
            return $ENTRIES;
        }

        private NameType(String str, int i) {
        }

        static {
            NameType[] nameTypeArr$values = $values();
            $VALUES = nameTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(nameTypeArr$values);
        }

        public static NameType valueOf(String str) {
            return (NameType) Enum.valueOf(NameType.class, str);
        }

        public static NameType[] values() {
            return (NameType[]) $VALUES.clone();
        }
    }
}
