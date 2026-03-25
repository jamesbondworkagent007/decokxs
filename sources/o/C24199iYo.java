package o;

import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.iYo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24199iYo {
    public final void copydefault(final long j) {
        C27570jxg.investEvent$default("YieldAssetsProtocol_Full_Page_View", null, new Function1() { // from class: o.iYn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24199iYo.KWHzl(j, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(long j, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("analysis_platform_id", C33129mqd.gEmmrt(java.lang.Long.valueOf(j)), false);
        return Unit.INSTANCE;
    }
}
