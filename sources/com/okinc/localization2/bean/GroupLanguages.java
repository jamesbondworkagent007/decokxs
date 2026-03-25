package com.okinc.localization2.bean;

/* JADX INFO: loaded from: classes9.dex */
public final class GroupLanguages {
    public static final int $stable = 8;
    private LanguageUnit globalCurrent;
    private LanguageUnit globalDefault;
    private LanguageUnit marketCurrent;
    private LanguageUnit marketDefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguageUnit getGlobalCurrent() {
        return this.globalCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguageUnit getGlobalDefault() {
        return this.globalDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguageUnit getMarketCurrent() {
        return this.marketCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguageUnit getMarketDefault() {
        return this.marketDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGlobalCurrent(LanguageUnit languageUnit) {
        this.globalCurrent = languageUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGlobalDefault(LanguageUnit languageUnit) {
        this.globalDefault = languageUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketCurrent(LanguageUnit languageUnit) {
        this.marketCurrent = languageUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketDefault(LanguageUnit languageUnit) {
        this.marketDefault = languageUnit;
    }

    public String toString() {
        return "GroupLanguages(globalCurrent=" + this.globalCurrent + ", marketCurrent=" + this.marketCurrent + ", marketDefault=" + this.marketDefault + ", globalDefault=" + this.globalDefault + ")";
    }
}
