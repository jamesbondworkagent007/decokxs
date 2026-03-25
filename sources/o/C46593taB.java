package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.taB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46593taB {
    public void OLrzqt() {
        C32866mlf.onEvent$default("HomePage_MarketOverview_Module_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("HomePage_MarketOverview_Module_Click", (TrackChannel[]) null, new Function1() { // from class: o.taG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46593taB.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "component", str, false, 4, null);
        return Unit.INSTANCE;
    }
}
