package o;

import com.okinc.business.defi.wallet.jwt.WalletJwtErrorCode;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fiW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18443fiW {
    public static /* synthetic */ void trackWalletJwtError$default(WalletJwtErrorCode walletJwtErrorCode, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        AEQbTJ(walletJwtErrorCode, str, i);
    }

    public static final void AEQbTJ(@NotNull final WalletJwtErrorCode walletJwtErrorCode, @NotNull final java.lang.String str, final int i) {
        Intrinsics.checkNotNullParameter(walletJwtErrorCode, "");
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Web3Wallet_JWT_Event_View", (TrackChannel[]) null, new Function1() { // from class: o.fiU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18443fiW.copydefault(walletJwtErrorCode, str, i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(WalletJwtErrorCode walletJwtErrorCode, java.lang.String str, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "code", java.lang.String.valueOf(walletJwtErrorCode.getCode()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "msg", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "validate_error_code", java.lang.String.valueOf(i), false, 4, null);
        return Unit.INSTANCE;
    }
}
