package com.okinc.core.ok_app.security;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Config {
    public static final int $stable = 8;
    private final List<String> appNameOnly;
    private final List<String> appNameRegex;
    private final Map<String, List<String>> appPackageName;
    private final List<String> packageNameOnly;
    private final List<String> packageNameRegex;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.core.ok_app.security.Config */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Config copy$default(Config config, List list, List list2, Map map, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = config.appNameOnly;
        }
        if ((i & 2) != 0) {
            list2 = config.packageNameOnly;
        }
        List list5 = list2;
        if ((i & 4) != 0) {
            map = config.appPackageName;
        }
        Map map2 = map;
        if ((i & 8) != 0) {
            list3 = config.appNameRegex;
        }
        List list6 = list3;
        if ((i & 16) != 0) {
            list4 = config.packageNameRegex;
        }
        return config.copy(list, list5, map2, list6, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.appNameOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.packageNameOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<String>> component3() {
        return this.appPackageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.appNameRegex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.packageNameRegex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Config copy(@NotNull List<String> list, @NotNull List<String> list2, @NotNull Map<String, ? extends List<String>> map, @NotNull List<String> list3, @NotNull List<String> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new Config(list, list2, map, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return Intrinsics.EZpvd(this.appNameOnly, config.appNameOnly) && Intrinsics.EZpvd(this.packageNameOnly, config.packageNameOnly) && Intrinsics.EZpvd(this.appPackageName, config.appPackageName) && Intrinsics.EZpvd(this.appNameRegex, config.appNameRegex) && Intrinsics.EZpvd(this.packageNameRegex, config.packageNameRegex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAppNameOnly() {
        return this.appNameOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAppNameRegex() {
        return this.appNameRegex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<String>> getAppPackageName() {
        return this.appPackageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPackageNameOnly() {
        return this.packageNameOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPackageNameRegex() {
        return this.packageNameRegex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.appNameOnly.hashCode() * 31) + this.packageNameOnly.hashCode()) * 31) + this.appPackageName.hashCode()) * 31) + this.appNameRegex.hashCode()) * 31) + this.packageNameRegex.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Config(appNameOnly=" + this.appNameOnly + ", packageNameOnly=" + this.packageNameOnly + ", appPackageName=" + this.appPackageName + ", appNameRegex=" + this.appNameRegex + ", packageNameRegex=" + this.packageNameRegex + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public Config(@NotNull List<String> list, @NotNull List<String> list2, @NotNull Map<String, ? extends List<String>> map, @NotNull List<String> list3, @NotNull List<String> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.appNameOnly = list;
        this.packageNameOnly = list2;
        this.appPackageName = map;
        this.appNameRegex = list3;
        this.packageNameRegex = list4;
    }
}
