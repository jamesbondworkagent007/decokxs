package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.tTL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tTP {
    public static final void OLrzqt(@NotNull final tTL ttl) {
        Intrinsics.checkNotNullParameter(ttl, "");
        C32866mlf.onEvent$default(ttl.djBIcL(), (TrackChannel[]) null, new Function1() { // from class: o.tTU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tTP.EZpvd(ttl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(tTL ttl, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        for (Map.Entry<java.lang.String, tTL.Application> entry : ttl.copydefault().entrySet()) {
            java.lang.String key = entry.getKey();
            tTL.Application value = entry.getValue();
            eventParamsList.put(key, value.OLrzqt(), value.copydefault());
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String KWHzl(java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            return "yes";
        }
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
            return "no";
        }
        if (bool == null) {
            return "na";
        }
        throw new NoWhenBranchMatchedException();
    }
}
