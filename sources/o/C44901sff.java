package o;

import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44901sff {
    public static final C44901sff copydefault = new C44901sff();

    private C44901sff() {
    }

    public final void OLrzqt() {
        C45363soQ.KWHzl("SupportCenter_MyTickets_Entry_Click", true, new Function1() { // from class: o.sfb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44901sff.copydefault((EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", "landing", true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C45363soQ.KWHzl("SupportCenter_Recommendation_Card_View", true, new Function1() { // from class: o.sfe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44901sff.OLrzqt(str, str2, str3, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "scenario", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "index", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "status", str3, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void eventOnRecommendationCardClicked$default(C44901sff c44901sff, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        c44901sff.KWHzl(str, str2, str3, str4, str5);
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C45363soQ.KWHzl("SupportCenter_Recommendation_Card_Click", true, new Function1() { // from class: o.sfc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44901sff.copydefault(str, str2, str3, str4, str5, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "scenario", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "index", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "status", str3, false, 4, null);
        eventParamsList.put("click_area", str4, true);
        EventParamsList.put$default(eventParamsList, "cta_button_index", str5 != null ? str5 : "", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        C45363soQ.onSessionIdEvent$default("SupportCenter_QuickToolsViewAll_Entry_Click", true, null, 2, null);
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C45363soQ.KWHzl(z2 ? "SupportCenter_QuickTools_Tool_View" : "SupportCenter_QuickTools_Tool_Click", true, new Function1() { // from class: o.sfd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44901sff.OLrzqt(str, z, str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, boolean z, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "scenario", str, false, 4, null);
        eventParamsList.put("page", z ? "landing" : "ss_tool_list", true);
        EventParamsList.put$default(eventParamsList, "index", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        C45363soQ.onSessionIdEvent$default("SupportCenter_RecentActivitiesViewAll_Entry_Click", true, null, 2, null);
    }
}
