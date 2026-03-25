package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.asf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7906asf {
    public static final void copydefault(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("app_lua_bundle_load_result", (TrackChannel[]) null, new Function1() { // from class: o.ase
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7906asf.KWHzl(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("result", str, true);
        if (str2 != null) {
            eventParamsList.put("msg", str2, false);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("app_lua_bundle_download", (TrackChannel[]) null, new Function1() { // from class: o.asc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7906asf.OLrzqt(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("appId", str, false);
        eventParamsList.put("version", str2, false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackMlnInit$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        KWHzl(str, str2);
    }

    public static final void KWHzl(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("app_mln_init", (TrackChannel[]) null, new Function1() { // from class: o.asb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7906asf.AhwBna(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AhwBna(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("result", str, true);
        if (str2 != null) {
            eventParamsList.put("msg", str2, false);
        }
        return Unit.INSTANCE;
    }
}
