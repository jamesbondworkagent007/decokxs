package o;

import com.okinc.business.defi.common.password.SilentSignErrorCode;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.dmc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14499dmc {
    public static final void AEQbTJ(final SilentSignErrorCode silentSignErrorCode, final java.lang.String str) {
        C32866mlf.onEvent$default("Web3_Wallet_SilentSignErr_View", (TrackChannel[]) null, new Function1() { // from class: o.dmd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14499dmc.EZpvd(silentSignErrorCode, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(SilentSignErrorCode silentSignErrorCode, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "code", java.lang.String.valueOf(silentSignErrorCode.getCode()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "msg", str, false, 4, null);
        return Unit.INSTANCE;
    }
}
