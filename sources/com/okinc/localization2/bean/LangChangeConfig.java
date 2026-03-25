package com.okinc.localization2.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LangChangeConfig {
    public static final int $stable = 0;
    private final boolean fromUpdateCurrentLanguage;
    private final LanguageListConfig langListConfig;
    private final LanguagePackConfig langPackConfig;
    private final LanguagePackType langPackType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LangChangeConfig() {
        this(null, null, null, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LangChangeConfig copy$default(LangChangeConfig langChangeConfig, LanguageListConfig languageListConfig, LanguagePackConfig languagePackConfig, LanguagePackType languagePackType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            languageListConfig = langChangeConfig.langListConfig;
        }
        if ((i & 2) != 0) {
            languagePackConfig = langChangeConfig.langPackConfig;
        }
        if ((i & 4) != 0) {
            languagePackType = langChangeConfig.langPackType;
        }
        if ((i & 8) != 0) {
            z = langChangeConfig.fromUpdateCurrentLanguage;
        }
        return langChangeConfig.copy(languageListConfig, languagePackConfig, languagePackType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguageListConfig component1() {
        return this.langListConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguagePackConfig component2() {
        return this.langPackConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguagePackType component3() {
        return this.langPackType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.fromUpdateCurrentLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LangChangeConfig copy(@NotNull LanguageListConfig languageListConfig, @NotNull LanguagePackConfig languagePackConfig, @NotNull LanguagePackType languagePackType, boolean z) {
        Intrinsics.checkNotNullParameter(languageListConfig, "");
        Intrinsics.checkNotNullParameter(languagePackConfig, "");
        Intrinsics.checkNotNullParameter(languagePackType, "");
        return new LangChangeConfig(languageListConfig, languagePackConfig, languagePackType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LangChangeConfig)) {
            return false;
        }
        LangChangeConfig langChangeConfig = (LangChangeConfig) obj;
        return this.langListConfig == langChangeConfig.langListConfig && this.langPackConfig == langChangeConfig.langPackConfig && this.langPackType == langChangeConfig.langPackType && this.fromUpdateCurrentLanguage == langChangeConfig.fromUpdateCurrentLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFromUpdateCurrentLanguage() {
        return this.fromUpdateCurrentLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguageListConfig getLangListConfig() {
        return this.langListConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguagePackConfig getLangPackConfig() {
        return this.langPackConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LanguagePackType getLangPackType() {
        return this.langPackType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.langListConfig.hashCode() * 31) + this.langPackConfig.hashCode()) * 31) + this.langPackType.hashCode()) * 31) + Boolean.hashCode(this.fromUpdateCurrentLanguage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LangChangeConfig(langListConfig=" + this.langListConfig + ", langPackConfig=" + this.langPackConfig + ", langPackType=" + this.langPackType + ", fromUpdateCurrentLanguage=" + this.fromUpdateCurrentLanguage + ")";
    }

    public LangChangeConfig(@NotNull LanguageListConfig languageListConfig, @NotNull LanguagePackConfig languagePackConfig, @NotNull LanguagePackType languagePackType, boolean z) {
        Intrinsics.checkNotNullParameter(languageListConfig, "");
        Intrinsics.checkNotNullParameter(languagePackConfig, "");
        Intrinsics.checkNotNullParameter(languagePackType, "");
        this.langListConfig = languageListConfig;
        this.langPackConfig = languagePackConfig;
        this.langPackType = languagePackType;
        this.fromUpdateCurrentLanguage = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:com.okinc.localization2.bean.LanguageListConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.localization2.bean.LanguageListConfig:0x0004: SGET  A[WRAPPED] (LINE:12) com.okinc.localization2.bean.LanguageListConfig.NO_CHECK com.okinc.localization2.bean.LanguageListConfig) : (r1v0 com.okinc.localization2.bean.LanguageListConfig))
  (wrap:com.okinc.localization2.bean.LanguagePackConfig:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.localization2.bean.LanguagePackConfig:0x000a: SGET  A[WRAPPED] (LINE:13) com.okinc.localization2.bean.LanguagePackConfig.NEED_LATEST com.okinc.localization2.bean.LanguagePackConfig) : (r2v0 com.okinc.localization2.bean.LanguagePackConfig))
  (wrap:com.okinc.localization2.bean.LanguagePackType:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.localization2.bean.LanguagePackType:0x0010: SGET  A[WRAPPED] (LINE:14) com.okinc.localization2.bean.LanguagePackType.NORMAL com.okinc.localization2.bean.LanguagePackType) : (r3v0 com.okinc.localization2.bean.LanguagePackType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(com.okinc.localization2.bean.LanguageListConfig, com.okinc.localization2.bean.LanguagePackConfig, com.okinc.localization2.bean.LanguagePackType, boolean):void (m)] (LINE:11) call: com.okinc.localization2.bean.LangChangeConfig.<init>(com.okinc.localization2.bean.LanguageListConfig, com.okinc.localization2.bean.LanguagePackConfig, com.okinc.localization2.bean.LanguagePackType, boolean):void type: THIS */
    public /* synthetic */ LangChangeConfig(LanguageListConfig languageListConfig, LanguagePackConfig languagePackConfig, LanguagePackType languagePackType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LanguageListConfig.NO_CHECK : languageListConfig, (i & 2) != 0 ? LanguagePackConfig.NEED_LATEST : languagePackConfig, (i & 4) != 0 ? LanguagePackType.NORMAL : languagePackType, (i & 8) != 0 ? false : z);
    }
}
