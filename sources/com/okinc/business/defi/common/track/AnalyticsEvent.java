package com.okinc.business.defi.common.track;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32872mll;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class AnalyticsEvent {
    public static final int $stable = 8;
    private final String name;
    private final List<EventParam> params;
    private final TrackChannel[] trackChannel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EventParam> getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackChannel[] getTrackChannel() {
        return this.trackChannel;
    }

    public AnalyticsEvent(@NotNull String str, @NotNull List<EventParam> list, @NotNull TrackChannel... trackChannelArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        this.name = str;
        this.params = list;
        this.trackChannel = trackChannelArr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:14) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
  (wrap:com.okinc.components.track.TrackChannel[]:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.components.track.TrackChannel[]:0x000f: INVOKE (wrap:o.mll:0x000d: SGET  A[WRAPPED] (LINE:15) o.mll.OLrzqt o.mll) VIRTUAL call: o.mll.EZpvd():com.okinc.components.track.TrackChannel[] A[MD:():com.okinc.components.track.TrackChannel[] (m), WRAPPED] (LINE:15)) : (r3v0 com.okinc.components.track.TrackChannel[]))
 A[MD:(java.lang.String, java.util.List<com.okinc.components.track.bean.EventParam>, com.okinc.components.track.TrackChannel[]):void VARARG (m), VARARG_CALL] (LINE:12) call: com.okinc.business.defi.common.track.AnalyticsEvent.<init>(java.lang.String, java.util.List, com.okinc.components.track.TrackChannel[]):void type: THIS */
    public /* synthetic */ AnalyticsEvent(String str, List list, TrackChannel[] trackChannelArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? C32872mll.OLrzqt.EZpvd() : trackChannelArr);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnalyticsEvent) {
            AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
            if (Intrinsics.EZpvd((Object) this.name, (Object) analyticsEvent.name) && Intrinsics.EZpvd(this.params, analyticsEvent.params)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.params.hashCode();
    }
}
