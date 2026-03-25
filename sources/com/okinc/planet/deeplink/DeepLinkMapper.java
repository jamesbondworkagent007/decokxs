package com.okinc.planet.deeplink;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class DeepLinkMapper {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DeepLinkMapper[] $VALUES;

    /* JADX INFO: renamed from: new, reason: not valid java name */
    private final String f82new;
    private final String old;
    public static final DeepLinkMapper PERSONAL_HOMEPAGE = new DeepLinkMapper("PERSONAL_HOMEPAGE", 0, "social/trade/personal", "planet/personal");
    public static final DeepLinkMapper COPY_PERSONAL_HOMEPAGE = new DeepLinkMapper("COPY_PERSONAL_HOMEPAGE", 1, "social/trade/copy/leader_profile_page", "planet/personal");
    public static final DeepLinkMapper PROFILE_BIO = new DeepLinkMapper("PROFILE_BIO", 2, "social/trade/profile/bio", "planet/profile/bio");
    public static final DeepLinkMapper MAIN_FEED = new DeepLinkMapper("MAIN_FEED", 3, "main/market/feeds", "main/planet/feeds");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DeepLinkMapper[] $values() {
        return new DeepLinkMapper[]{PERSONAL_HOMEPAGE, COPY_PERSONAL_HOMEPAGE, PROFILE_BIO, MAIN_FEED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DeepLinkMapper> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNew() {
        return this.f82new;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOld() {
        return this.old;
    }

    private DeepLinkMapper(String str, int i, String str2, String str3) {
        this.old = str2;
        this.f82new = str3;
    }

    static {
        DeepLinkMapper[] deepLinkMapperArr$values = $values();
        $VALUES = deepLinkMapperArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(deepLinkMapperArr$values);
    }

    public static DeepLinkMapper valueOf(String str) {
        return (DeepLinkMapper) Enum.valueOf(DeepLinkMapper.class, str);
    }

    public static DeepLinkMapper[] values() {
        return (DeepLinkMapper[]) $VALUES.clone();
    }
}
