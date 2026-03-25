package o;

import com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ica, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24371ica {
    public static final C24371ica OLrzqt = new C24371ica();

    /* JADX INFO: renamed from: o.ica$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MemeStrategyType.values().length];
            try {
                iArr[MemeStrategyType.BuyNow.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MemeStrategyType.SellNow.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    private C24371ica() {
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        C32866mlf.onEvent$default("DEXSwap_Mememode_Intro_Click", (TrackChannel[]) null, new Function1() { // from class: o.ici
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24371ica.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C32866mlf.onEvent$default("DEXSwap_Mememode_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.icf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24371ica.AEQbTJ(str, str2, str3, str4, str5, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("token_address", str, true);
        eventParamsList.put("buy_or_sell", str2, true);
        eventParamsList.put("source", str3, true);
        eventParamsList.put("sub_source", str4, true);
        eventParamsList.put("tab_name", str5, true);
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl(MemeStrategyType memeStrategyType) {
        int i = memeStrategyType == null ? -1 : TaskDescription.copydefault[memeStrategyType.ordinal()];
        if (i == -1) {
            return "";
        }
        if (i == 1) {
            return "buy_now";
        }
        if (i == 2) {
            return "sell_now";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, MemeStrategyType memeStrategyType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        final java.lang.String strKWHzl = KWHzl(memeStrategyType);
        C32866mlf.onEvent$default("DEXSwap_Mememode_Full_Click", (TrackChannel[]) null, new Function1() { // from class: o.icg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24371ica.KWHzl(str, str2, str3, str4, str5, strKWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        eventParamsList.put("token_address", str2, true);
        eventParamsList.put("buy_or_sell", str3, true);
        eventParamsList.put("source", str4, true);
        eventParamsList.put("sub_source", str5, true);
        eventParamsList.put(OtcExtraKeys.CRYPTO_ORDER_TYPE, str6, true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("DEXSwap_Mememode_PresetTempModify_Click", (TrackChannel[]) null, new Function1() { // from class: o.ich
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24371ica.copydefault(str, str3, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("buy_or_sell", str, true);
        eventParamsList.put("chain_name", str2, true);
        eventParamsList.put("token_address", str3, true);
        return Unit.INSTANCE;
    }
}
