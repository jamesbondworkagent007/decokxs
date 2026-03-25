package com.okinc.market.common.constants;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes9.dex */
public final class ExperienceRouteConst {
    public static final ExperienceRouteConst AEQbTJ = new ExperienceRouteConst();

    private ExperienceRouteConst() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MiniAppRoute {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MiniAppRoute[] $VALUES;
        public static final MiniAppRoute COMMUNITY_DETAIL = new MiniAppRoute("COMMUNITY_DETAIL", 0, "/feed/detail", "6.100.0");
        public static final MiniAppRoute COMMUNITY_PROFILE = new MiniAppRoute("COMMUNITY_PROFILE", 1, "/feed/profile", "6.100.0");
        private final String minAppVersion;
        private final String url;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MiniAppRoute[] $values() {
            return new MiniAppRoute[]{COMMUNITY_DETAIL, COMMUNITY_PROFILE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MiniAppRoute> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMinAppVersion() {
            return this.minAppVersion;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUrl() {
            return this.url;
        }

        private MiniAppRoute(String str, int i, String str2, String str3) {
            this.url = str2;
            this.minAppVersion = str3;
        }

        static {
            MiniAppRoute[] miniAppRouteArr$values = $values();
            $VALUES = miniAppRouteArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(miniAppRouteArr$values);
        }

        public static MiniAppRoute valueOf(String str) {
            return (MiniAppRoute) Enum.valueOf(MiniAppRoute.class, str);
        }

        public static MiniAppRoute[] values() {
            return (MiniAppRoute[]) $VALUES.clone();
        }
    }
}
