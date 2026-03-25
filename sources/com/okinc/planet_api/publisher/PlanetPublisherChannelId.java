package com.okinc.planet_api.publisher;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class PlanetPublisherChannelId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetPublisherChannelId[] $VALUES;
    public static final Activity Companion;
    private final String description;
    private final String fromPage;
    private final String tab;
    private final String value;
    public static final PlanetPublisherChannelId FEED_FOR_YOU = new PlanetPublisherChannelId("FEED_FOR_YOU", 0, "1001", "Feed-for you", "planet", "for_you");
    public static final PlanetPublisherChannelId FEED_NEWS = new PlanetPublisherChannelId("FEED_NEWS", 1, "1002", "Feed-news", "planet", "news");
    public static final PlanetPublisherChannelId FEED_FOLLOWING = new PlanetPublisherChannelId("FEED_FOLLOWING", 2, "1003", "Feed-following", "planet", "following");
    public static final PlanetPublisherChannelId KLINE_INSIGHT = new PlanetPublisherChannelId("KLINE_INSIGHT", 3, "1004", "Kline-Insight", "kline", "insights");
    public static final PlanetPublisherChannelId KLINE_NEWS = new PlanetPublisherChannelId("KLINE_NEWS", 4, "1005", "Kline-News", "kline", "news");
    public static final PlanetPublisherChannelId KLINE_DISCUSSION = new PlanetPublisherChannelId("KLINE_DISCUSSION", 5, "1006", "Kline-Discussion", "kline", "discussion");
    public static final PlanetPublisherChannelId PERSONAL_HOMEPAGE = new PlanetPublisherChannelId("PERSONAL_HOMEPAGE", 6, "1007", "Planet-Profile", "profile_page", "profilepage");
    public static final PlanetPublisherChannelId SHARE_TRADING_COMPETITION = new PlanetPublisherChannelId("SHARE_TRADING_COMPETITION", 7, "1008", "Share-Competitor Event", "share_function", "share_function");
    public static final PlanetPublisherChannelId DEEPLINK_POST = new PlanetPublisherChannelId("DEEPLINK_POST", 8, "1009", "Deeplink Post", "deeplink", "deeplink");
    public static final PlanetPublisherChannelId FOLLOW_FROM_INNER = new PlanetPublisherChannelId("FOLLOW_FROM_INNER", 9, "5001", "follow from inner side", "inner", "follow");
    public static final PlanetPublisherChannelId FOLLOW_FROM_IM = new PlanetPublisherChannelId("FOLLOW_FROM_IM", 10, "5002", "follow from im side", "im", "follow");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetPublisherChannelId[] $values() {
        return new PlanetPublisherChannelId[]{FEED_FOR_YOU, FEED_NEWS, FEED_FOLLOWING, KLINE_INSIGHT, KLINE_NEWS, KLINE_DISCUSSION, PERSONAL_HOMEPAGE, SHARE_TRADING_COMPETITION, DEEPLINK_POST, FOLLOW_FROM_INNER, FOLLOW_FROM_IM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetPublisherChannelId> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromPage() {
        return this.fromPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTab() {
        return this.tab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PlanetPublisherChannelId(String str, int i, String str2, String str3, String str4, String str5) {
        this.value = str2;
        this.description = str3;
        this.fromPage = str4;
        this.tab = str5;
    }

    static {
        PlanetPublisherChannelId[] planetPublisherChannelIdArr$values = $values();
        $VALUES = planetPublisherChannelIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetPublisherChannelIdArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.publisher.PlanetPublisherChannelId.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final PlanetPublisherChannelId AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            for (PlanetPublisherChannelId planetPublisherChannelId : PlanetPublisherChannelId.values()) {
                if (Intrinsics.EZpvd((Object) planetPublisherChannelId.getValue(), (Object) str)) {
                    return planetPublisherChannelId;
                }
            }
            return null;
        }
    }

    public static PlanetPublisherChannelId valueOf(String str) {
        return (PlanetPublisherChannelId) Enum.valueOf(PlanetPublisherChannelId.class, str);
    }

    public static PlanetPublisherChannelId[] values() {
        return (PlanetPublisherChannelId[]) $VALUES.clone();
    }
}
