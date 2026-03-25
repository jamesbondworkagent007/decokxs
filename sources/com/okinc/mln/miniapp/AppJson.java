package com.okinc.mln.miniapp;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class AppJson {
    public static final int $stable = 8;
    private final Config appConfig;
    private final String minFrameworkVersion;
    private final Map<String, Config> pageConfig;
    private final Map<String, String> pages;
    private final String version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.mln.miniapp.AppJson */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppJson copy$default(AppJson appJson, String str, String str2, Map map, Config config, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appJson.version;
        }
        if ((i & 2) != 0) {
            str2 = appJson.minFrameworkVersion;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            map = appJson.pages;
        }
        Map map3 = map;
        if ((i & 8) != 0) {
            config = appJson.appConfig;
        }
        Config config2 = config;
        if ((i & 16) != 0) {
            map2 = appJson.pageConfig;
        }
        return appJson.copy(str, str3, map3, config2, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minFrameworkVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.pages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Config component4() {
        return this.appConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Config> component5() {
        return this.pageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppJson copy(@NotNull String str, String str2, Map<String, String> map, Config config, Map<String, Config> map2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AppJson(str, str2, map, config, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppJson)) {
            return false;
        }
        AppJson appJson = (AppJson) obj;
        return Intrinsics.EZpvd((Object) this.version, (Object) appJson.version) && Intrinsics.EZpvd((Object) this.minFrameworkVersion, (Object) appJson.minFrameworkVersion) && Intrinsics.EZpvd(this.pages, appJson.pages) && Intrinsics.EZpvd(this.appConfig, appJson.appConfig) && Intrinsics.EZpvd(this.pageConfig, appJson.pageConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Config getAppConfig() {
        return this.appConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinFrameworkVersion() {
        return this.minFrameworkVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Config> getPageConfig() {
        return this.pageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getPages() {
        return this.pages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.version.hashCode();
        String str = this.minFrameworkVersion;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Map<String, String> map = this.pages;
        int iHashCode3 = map == null ? 0 : map.hashCode();
        Config config = this.appConfig;
        int iHashCode4 = config == null ? 0 : config.hashCode();
        Map<String, Config> map2 = this.pageConfig;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppJson(version=" + this.version + ", minFrameworkVersion=" + this.minFrameworkVersion + ", pages=" + this.pages + ", appConfig=" + this.appConfig + ", pageConfig=" + this.pageConfig + ")";
    }

    public AppJson(@NotNull String str, String str2, Map<String, String> map, Config config, Map<String, Config> map2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.version = str;
        this.minFrameworkVersion = str2;
        this.pages = map;
        this.appConfig = config;
        this.pageConfig = map2;
    }
}
