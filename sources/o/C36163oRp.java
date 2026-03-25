package o;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oRp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36163oRp {
    public static final C36163oRp AEQbTJ = new C36163oRp();

    private C36163oRp() {
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        C32866mlf.onEvent$default("KlineBotCreate_Kline_Dragbar_View", (TrackChannel[]) null, new Function1() { // from class: o.oRq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36163oRp.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        C32866mlf.onEvent$default("KlineBotCreate_Kline_Dragbar_Click", (TrackChannel[]) null, new Function1() { // from class: o.oRm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36163oRp.copydefault((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("KlineBotCreate_Kline_SetChart_Click", (TrackChannel[]) null, new Function1() { // from class: o.oRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36163oRp.AEQbTJ(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "button", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, false, 4, null);
        return Unit.INSTANCE;
    }
}
