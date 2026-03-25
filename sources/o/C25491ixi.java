package o;

import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25491ixi {
    public static final C25491ixi copydefault = new C25491ixi();

    private C25491ixi() {
    }

    public final void OLrzqt() {
        C27570jxg.investEvent$default("YielddetailConnectPopup_Full_Page_View", null, null, 3, null);
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C27570jxg.investEvent$default("YieldDetails_Full_Button_Click", null, new Function1() { // from class: o.ixh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25491ixi.copydefault(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "investment_id", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str3, false, 4, null);
        return Unit.INSTANCE;
    }
}
