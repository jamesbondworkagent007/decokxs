package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kiP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28840kiP {
    public static final void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DEXMarket_Memefactory_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.kiN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28840kiP.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", "false", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "memepump", false, 4, null);
        EventParamsList.put$default(eventParamsList, "product_type", "memepump", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "token_detail_preview", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }
}
