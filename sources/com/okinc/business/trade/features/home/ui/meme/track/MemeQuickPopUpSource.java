package com.okinc.business.trade.features.home.ui.meme.track;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class MemeQuickPopUpSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MemeQuickPopUpSource[] $VALUES;
    public static final Application Companion;
    public static final MemeQuickPopUpSource MarketMemePump;
    public static final MemeQuickPopUpSource MarketMyPosition;
    public static final MemeQuickPopUpSource MarketSaSurge;
    public static final MemeQuickPopUpSource MarketSearch = new MemeQuickPopUpSource("MarketSearch", 0, "market_search");
    public static final MemeQuickPopUpSource MarketSignalActivity;
    public static final MemeQuickPopUpSource MarketSignalOverview;
    public static final MemeQuickPopUpSource MarketSignalOverviewDetail;
    public static final MemeQuickPopUpSource MarketTokenDetailPage;
    public static final MemeQuickPopUpSource MarketTracker;
    private static MemeQuickPopUpSource currentMemeQuickPopUpSource;
    private final String source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MemeQuickPopUpSource[] $values() {
        return new MemeQuickPopUpSource[]{MarketSearch, MarketTokenDetailPage, MarketMyPosition, MarketSignalOverview, MarketSignalOverviewDetail, MarketSignalActivity, MarketTracker, MarketMemePump, MarketSaSurge};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MemeQuickPopUpSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    private MemeQuickPopUpSource(String str, int i, String str2) {
        this.source = str2;
    }

    static {
        MemeQuickPopUpSource memeQuickPopUpSource = new MemeQuickPopUpSource("MarketTokenDetailPage", 1, "market_token_detail_page");
        MarketTokenDetailPage = memeQuickPopUpSource;
        MarketMyPosition = new MemeQuickPopUpSource("MarketMyPosition", 2, "market_my_position");
        MarketSignalOverview = new MemeQuickPopUpSource("MarketSignalOverview", 3, "signal_overview");
        MarketSignalOverviewDetail = new MemeQuickPopUpSource("MarketSignalOverviewDetail", 4, "signal_summary");
        MarketSignalActivity = new MemeQuickPopUpSource("MarketSignalActivity", 5, "signal_activity");
        MarketTracker = new MemeQuickPopUpSource("MarketTracker", 6, "quick_tracker");
        MarketMemePump = new MemeQuickPopUpSource("MarketMemePump", 7, "market_meme_pump");
        MarketSaSurge = new MemeQuickPopUpSource("MarketSaSurge", 8, "quick_surge");
        MemeQuickPopUpSource[] memeQuickPopUpSourceArr$values = $values();
        $VALUES = memeQuickPopUpSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(memeQuickPopUpSourceArr$values);
        Companion = new Application(null);
        currentMemeQuickPopUpSource = memeQuickPopUpSource;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void copydefault(@NotNull MemeQuickPopUpSource memeQuickPopUpSource) {
            Intrinsics.checkNotNullParameter(memeQuickPopUpSource, "");
            MemeQuickPopUpSource.currentMemeQuickPopUpSource = memeQuickPopUpSource;
        }

        public final MemeQuickPopUpSource EZpvd() {
            return MemeQuickPopUpSource.currentMemeQuickPopUpSource;
        }
    }

    public static MemeQuickPopUpSource valueOf(String str) {
        return (MemeQuickPopUpSource) Enum.valueOf(MemeQuickPopUpSource.class, str);
    }

    public static MemeQuickPopUpSource[] values() {
        return (MemeQuickPopUpSource[]) $VALUES.clone();
    }
}
