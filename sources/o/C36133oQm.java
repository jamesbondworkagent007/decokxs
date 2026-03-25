package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oQm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36133oQm {
    public static final C36133oQm copydefault = new C36133oQm();

    private C36133oQm() {
    }

    public final void AEQbTJ(final java.lang.String str, final java.lang.String str2) {
        C32866mlf.onEvent$default("Token_Detail_Eventpage_View", (TrackChannel[]) null, new Function1() { // from class: o.oQr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36133oQm.copydefault(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "token", str, false, 4, null);
        }
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "biz_type", str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.String str, final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("Token_Detail_Eventdetail_View", (TrackChannel[]) null, new Function1() { // from class: o.oQs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36133oQm.AEQbTJ(str, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "token", str, false, 4, null);
        }
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "biz_type", str2, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "event_type", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "evnet_id", str4, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final java.lang.String str, final java.lang.String str2) {
        C32866mlf.onEvent$default("Token_Detail_Eventrefresh_Click", (TrackChannel[]) null, new Function1() { // from class: o.oQq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36133oQm.EZpvd(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "token", str, false, 4, null);
        }
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "biz_type", str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.lang.String str, final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("Token_Detail_Eventsharebutton_Click", (TrackChannel[]) null, new Function1() { // from class: o.oQp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36133oQm.KWHzl(str, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "token", str, false, 4, null);
        }
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "biz_type", str2, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "event_type", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "evnet_id", str4, false, 4, null);
        return Unit.INSTANCE;
    }
}
