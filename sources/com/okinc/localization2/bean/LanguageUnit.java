package com.okinc.localization2.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguageUnit {
    public static final int $stable = 0;
    private final String languageCode;
    private final String market;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LanguageUnit copy$default(LanguageUnit languageUnit, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = languageUnit.market;
        }
        if ((i & 2) != 0) {
            str2 = languageUnit.languageCode;
        }
        return languageUnit.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.market;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.languageCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguageUnit copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LanguageUnit(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageUnit)) {
            return false;
        }
        LanguageUnit languageUnit = (LanguageUnit) obj;
        return Intrinsics.EZpvd((Object) this.market, (Object) languageUnit.market) && Intrinsics.EZpvd((Object) this.languageCode, (Object) languageUnit.languageCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarket() {
        return this.market;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.market.hashCode() * 31) + this.languageCode.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LanguageUnit(market=" + this.market + ", languageCode=" + this.languageCode + ")";
    }

    public LanguageUnit(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.market = str;
        this.languageCode = str2;
    }
}
