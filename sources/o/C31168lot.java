package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22421hez;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31168lot {
    public static final C31168lot copydefault = new C31168lot();

    private C31168lot() {
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull final DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C32866mlf.onEvent$default("DEXSwap_Mid_Swap_Click", (TrackChannel[]) null, new Function1() { // from class: o.lou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31168lot.AEQbTJ(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str, str2, str3, str4, str5, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_chain", C33129mqd.gEmmrt(dexMultiTokenInfoBean.getChainId()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_chain", C33129mqd.gEmmrt(dexMultiTokenInfoBean2.getChainId()), false, 4, null);
        eventParamsList.put("user_address", C22380heK.OLrzqt.copydefault(str).fARcdN().KWHzl(C33129mqd.gEmmrt(dexMultiTokenInfoBean.getChainId())), false);
        C22877hne c22877hne = C22877hne.OLrzqt;
        eventParamsList.put("business_type", c22877hne.KWHzl(str), true);
        EventParamsList.put$default(eventParamsList, "trade_dialog", c22877hne.AEQbTJ(str), false, 4, null);
        EventParamsList.put$default(eventParamsList, "activity_name", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_token_address", dexMultiTokenInfoBean.getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_token_amount", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_token_address", dexMultiTokenInfoBean2.getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_token_amount", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "to_amount_usdt", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "swap_type", "from", false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", "DEX", false, 4, null);
        EventParamsList.put$default(eventParamsList, "slippage", str5, false, 4, null);
        AbstractC22421hez abstractC22421hezOLrzqt = AbstractC22421hez.Companion.OLrzqt();
        AbstractC22421hez.Activity activity = abstractC22421hezOLrzqt instanceof AbstractC22421hez.Activity ? (AbstractC22421hez.Activity) abstractC22421hezOLrzqt : null;
        if (activity != null) {
            EventParamsList.put$default(eventParamsList, "discover_feed_origin", activity.OLrzqt(), false, 4, null);
        }
        return Unit.INSTANCE;
    }
}
