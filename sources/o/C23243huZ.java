package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.huZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23243huZ {
    public static final void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("app_swap_transaction_success_toast", (TrackChannel[]) null, new Function1() { // from class: o.huY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23243huZ.AEQbTJ(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", str, false);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("app_swap_transaction_failed_toast", (TrackChannel[]) null, new Function1() { // from class: o.huX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23243huZ.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", str, false);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DEXTrade_TxToast_Status_View", (TrackChannel[]) null, new Function1() { // from class: o.huW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23243huZ.AhwBna(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AhwBna(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tx_status", str, false, 4, null);
        return Unit.INSTANCE;
    }
}
