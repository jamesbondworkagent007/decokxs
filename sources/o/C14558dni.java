package o;

import com.okinc.business.defi.biz.core.error.WalletPasswordError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.wallet.core.encrypt.KeyCreationException;
import com.okinc.wallet.core.encrypt.KeyLostException;
import com.okinc.wallet.core.encrypt.KeyRetrievalException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14558dni {
    public static /* synthetic */ void trackPasswordEvent$default(boolean z, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        OLrzqt(z, str, th);
    }

    public static final void OLrzqt(final boolean z, @NotNull final java.lang.String str, java.lang.Throwable th) {
        final java.lang.String failReason;
        final int i;
        int i2;
        Intrinsics.checkNotNullParameter(str, "");
        if (th == null) {
            i = 0;
            failReason = "success";
        } else if (th instanceof KeyRetrievalException) {
            KeyRetrievalException keyRetrievalException = (KeyRetrievalException) th;
            java.lang.String message = keyRetrievalException.getMessage();
            if (message == null) {
                message = "";
            }
            java.lang.Throwable cause = keyRetrievalException.getCause();
            java.lang.String message2 = cause != null ? cause.getMessage() : null;
            failReason = "[message]" + message + "-[originMessage]" + (message2 != null ? message2 : "");
            i = -2;
        } else if (th instanceof KeyLostException) {
            java.lang.String message3 = ((KeyLostException) th).getMessage();
            failReason = message3 != null ? message3 : "";
            i = -3;
        } else if (th instanceof KeyCreationException) {
            KeyCreationException keyCreationException = (KeyCreationException) th;
            java.lang.String message4 = keyCreationException.getMessage();
            if (message4 == null) {
                message4 = "";
            }
            java.lang.Throwable cause2 = keyCreationException.getCause();
            java.lang.String message5 = cause2 != null ? cause2.getMessage() : null;
            failReason = "[message]" + message4 + "-[originMessage]" + (message5 != null ? message5 : "");
            i = -4;
        } else if (th instanceof WalletPasswordError) {
            WalletPasswordError walletPasswordError = (WalletPasswordError) th;
            switch (walletPasswordError.getCode()) {
                case 100:
                    i2 = -5;
                    break;
                case 101:
                    i2 = -6;
                    break;
                case 102:
                    i2 = -7;
                    break;
                case 103:
                    i2 = -8;
                    break;
                case 104:
                    i2 = -9;
                    break;
                case 105:
                    i2 = -10;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            int i3 = i2;
            failReason = walletPasswordError.getFailReason();
            i = i3;
        } else {
            java.lang.String message6 = th.getMessage();
            if (message6 == null) {
                message6 = "";
            }
            java.lang.Throwable cause3 = th.getCause();
            java.lang.String message7 = cause3 != null ? cause3.getMessage() : null;
            failReason = "[message]" + message6 + "-[originMessage]" + (message7 != null ? message7 : "");
            i = -1;
        }
        C32866mlf.onEvent$default("Web3WalletPassword_MigrateV2_Event_View", (TrackChannel[]) null, new Function1() { // from class: o.dnj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14558dni.AEQbTJ(z, str, failReason, i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.components.track.bean.EventParamsList.put$default(com.okinc.components.track.bean.EventParamsList, java.lang.String, java.lang.String, boolean, int, java.lang.Object):void */
    public static final Unit AEQbTJ(boolean z, java.lang.String str, java.lang.String str2, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("result", z ? "success" : EopTrackEvent.KEY_RESULT_FAILED, true);
        EventParamsList.put$default(eventParamsList, "status", "yes", false, 4, null);
        EventParamsList.put$default(eventParamsList, "scene", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "message", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "code", java.lang.String.valueOf(i), false, 4, null);
        return Unit.INSTANCE;
    }
}
