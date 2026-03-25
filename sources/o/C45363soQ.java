package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45363soQ {
    public static /* synthetic */ void onSessionIdEvent$default(java.lang.String str, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        KWHzl(str, z, function1);
    }

    public static final void KWHzl(@NotNull final java.lang.String str, final boolean z, final Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.EZpvd(str, new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.soN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45363soQ.OLrzqt(z, function1, str, (EventParamsList) obj);
            }
        });
        C45366soT.KWHzl.AhwBna();
    }

    public static final Unit OLrzqt(boolean z, Function1 function1, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "support_session_id", C45359soM.copydefault.copydefault(z), false, 4, null);
        eventParamsList.put("support_session_type", "app", true);
        if (function1 != null) {
            function1.invoke(eventParamsList);
        }
        C45362soP c45362soP = C45362soP.copydefault;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(eventParamsList, 10)), 16));
        for (EventParam eventParam : eventParamsList) {
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(eventParam.copydefault(), eventParam.KWHzl());
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        c45362soP.copydefault(str, linkedHashMap);
        return Unit.INSTANCE;
    }
}
