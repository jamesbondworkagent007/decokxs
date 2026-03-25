package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.uaP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48686uaP {
    public static final C48686uaP KWHzl = new C48686uaP();

    private C48686uaP() {
    }

    public final void copydefault(final int i) {
        C32866mlf.EZpvd("AllFunctions_Function_Entry_Click", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.uaO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48686uaP.AEQbTJ(i, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("entry_id", java.lang.String.valueOf(i), true);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        C32866mlf.onEvent$default("AllFunctions_Full_Page_View", new TrackChannel[]{TrackChannel.All}, (Function1) null, 2, (java.lang.Object) null);
    }
}
