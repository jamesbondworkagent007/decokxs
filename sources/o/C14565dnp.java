package o;

import com.okinc.business.defi.common.track.AnalyticsEvent;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dnp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14565dnp implements InterfaceC14563dnn {
    @Override // o.InterfaceC14563dnn
    public void KWHzl(@NotNull final AnalyticsEvent analyticsEvent) {
        Intrinsics.checkNotNullParameter(analyticsEvent, "");
        java.lang.String name = analyticsEvent.getName();
        TrackChannel[] trackChannel = analyticsEvent.getTrackChannel();
        C32866mlf.EZpvd(name, (TrackChannel[]) java.util.Arrays.copyOf(trackChannel, trackChannel.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.dnt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14565dnp.AEQbTJ(analyticsEvent, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(AnalyticsEvent analyticsEvent, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.addAll(analyticsEvent.getParams());
        return Unit.INSTANCE;
    }
}
