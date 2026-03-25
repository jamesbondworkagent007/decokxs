package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pZI {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(int i) {
        return (i == 0 || i == 1) ? "before_join" : i != 2 ? i != 3 ? i != 4 ? i != 6 ? "" : "- ended" : "claiming" : "before_claim" : "joining";
    }

    public static final void copydefault(final boolean z, final boolean z2, final boolean z3, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("Explore_Boost_Module_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pZI.AEQbTJ(z, z2, z3, str, str2, i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("list_click", z ? "1" : "0", true);
        eventParamsList.put("card_click", z2 ? "1" : "0", true);
        eventParamsList.put("button_click", z3 ? "1" : "0", true);
        eventParamsList.put("campaign_id", str, false);
        eventParamsList.put("campaign_status", str2, true);
        eventParamsList.put("campaign_number", java.lang.String.valueOf(i), false);
        return Unit.INSTANCE;
    }
}
