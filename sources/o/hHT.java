package o;

import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexui.main.dappredirect.DAppRedirectFrom;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hHT {
    public static final hHT KWHzl = new hHT();

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DAppRedirectFrom.values().length];
            try {
                iArr[DAppRedirectFrom.SWAP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DAppRedirectFrom.BRIDGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DAppRedirectFrom.LIMIT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[DAppRedirectFrom.MEME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[DAppRedirectFrom.QUICK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[DAppRedirectFrom.EASY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            EZpvd = iArr;
        }
    }

    private hHT() {
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        EZpvd(str, str2, str3, str4, str5, str6, "DEXMarket_Token_Dapp_Selection");
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        EZpvd(str, str2, str3, str4, str5, str6, "DEXMarket_Token_Dapp_Jump");
    }

    public final void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DEXSwap_Tokeninfo_Copy_Click", (TrackChannel[]) null, new Function1() { // from class: o.hHY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hHT.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_or_to", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("DEXSwap_Tokeninfo_Trade_Click", (TrackChannel[]) null, new Function1() { // from class: o.hHX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hHT.OLrzqt(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "dapp_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "dapp_id", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final java.lang.String str6, java.lang.String str7) {
        C32866mlf.onEvent$default(str7, (TrackChannel[]) null, new Function1() { // from class: o.hHW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hHT.AEQbTJ(str, str2, str4, str3, str5, str6, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "dapp_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "dapp_id", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_id", str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str6, false, 4, null);
        return Unit.INSTANCE;
    }

    public final C22404hei EZpvd(C21697hIz c21697hIz, C21697hIz c21697hIz2) {
        java.lang.String strEZpvd = c21697hIz != null ? c21697hIz.EZpvd() : null;
        java.lang.String str = strEZpvd == null ? "" : strEZpvd;
        java.lang.String strKWHzl = c21697hIz != null ? c21697hIz.KWHzl() : null;
        java.lang.String str2 = strKWHzl == null ? "" : strKWHzl;
        java.lang.String strKWHzl2 = c21697hIz2 != null ? c21697hIz2.KWHzl() : null;
        java.lang.String str3 = strKWHzl2 == null ? "" : strKWHzl2;
        java.lang.String strAYXKKw = c21697hIz != null ? c21697hIz.AYXKKw() : null;
        java.lang.String str4 = strAYXKKw == null ? "" : strAYXKKw;
        java.lang.String strAYXKKw2 = c21697hIz2 != null ? c21697hIz2.AYXKKw() : null;
        return new C22404hei(str, "", str2, str3, str4, strAYXKKw2 == null ? "" : strAYXKKw2, null, null, null, null, 960, null);
    }

    public final java.lang.String AEQbTJ(DAppRedirectFrom dAppRedirectFrom) {
        switch (dAppRedirectFrom == null ? -1 : Application.EZpvd[dAppRedirectFrom.ordinal()]) {
        }
        return BusinessType.SWAP.getValue();
    }

    public final java.lang.String AEQbTJ(DAppRedirectFrom dAppRedirectFrom, int i) {
        int i2 = dAppRedirectFrom == null ? -1 : Application.EZpvd[dAppRedirectFrom.ordinal()];
        if (i2 == 3 || i2 == 4 || i2 == 6) {
            return (i == 0 ? TrackTransactionDirection.BUY : TrackTransactionDirection.SELL).getValue();
        }
        return "NA";
    }
}
