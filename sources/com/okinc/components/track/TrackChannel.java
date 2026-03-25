package com.okinc.components.track;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TrackChannel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TrackChannel[] $VALUES;
    private final String trackerName;
    public static final TrackChannel All = new TrackChannel("All", 0, "All");
    public static final TrackChannel OKStatistics = new TrackChannel("OKStatistics", 1, "OKStatistics");
    public static final TrackChannel Appsflyer = new TrackChannel("Appsflyer", 2, "Appsflyer");
    public static final TrackChannel Amplitude = new TrackChannel("Amplitude", 3, "Amplitude");
    public static final TrackChannel DataFinder = new TrackChannel("DataFinder", 4, "DataFinder");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TrackChannel[] $values() {
        return new TrackChannel[]{All, OKStatistics, Appsflyer, Amplitude, DataFinder};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TrackChannel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackerName() {
        return this.trackerName;
    }

    private TrackChannel(String str, int i, String str2) {
        this.trackerName = str2;
    }

    static {
        TrackChannel[] trackChannelArr$values = $values();
        $VALUES = trackChannelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(trackChannelArr$values);
    }

    public final String getLowerTrackerName() {
        if (Intrinsics.EZpvd((Object) this.trackerName, (Object) DataFinder.trackerName)) {
            String lowerCase = Amplitude.trackerName.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return lowerCase;
        }
        String lowerCase2 = this.trackerName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return lowerCase2;
    }

    public static TrackChannel valueOf(String str) {
        return (TrackChannel) Enum.valueOf(TrackChannel.class, str);
    }

    public static TrackChannel[] values() {
        return (TrackChannel[]) $VALUES.clone();
    }
}
