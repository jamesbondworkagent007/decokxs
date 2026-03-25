package o;

import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.ImageTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.track.beans.Slippage;
import com.okinc.business.dexlogic.track.beans.SwapButtonAnalytics;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexlogic.track.enums.DexSwapPopConfirmClick;
import com.okinc.business.dexlogic.track.enums.SwapType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22877hne {
    public static final C22877hne OLrzqt = new C22877hne();

    private C22877hne() {
    }

    public final SwapButtonAnalytics OLrzqt(boolean z, boolean z2, @NotNull AbstractC23101hrq abstractC23101hrq) {
        java.lang.String value;
        EditTextData editData;
        ConsumeData<java.lang.String> originPrice;
        EditTextData editData2;
        EditTextData editData3;
        EditTextData editData4;
        ConsumeData<java.lang.String> originPrice2;
        ImageTextData coinData;
        DexMultiTokenInfoBean data;
        ImageTextData coinData2;
        DexMultiTokenInfoBean data2;
        TradeInputGroup data3;
        ConsumeData<TradeInputData> toData;
        TradeInputGroup data4;
        ConsumeData<TradeInputData> fromData;
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        ConsumeData<TradeInputGroup> value2 = abstractC23101hrq.dmfpNf().getValue();
        java.lang.String data5 = null;
        TradeInputData data6 = (value2 == null || (data4 = value2.getData()) == null || (fromData = data4.getFromData()) == null) ? null : fromData.getData();
        ConsumeData<TradeInputGroup> value3 = abstractC23101hrq.dmfpNf().getValue();
        TradeInputData data7 = (value3 == null || (data3 = value3.getData()) == null || (toData = data3.getToData()) == null) ? null : toData.getData();
        if (abstractC23101hrq.QUSxYX().AkhnZx()) {
            value = (z2 ? SwapType.DISCOVER_SWAP : SwapType.SWAP).getValue();
        } else {
            value = (z2 ? SwapType.DISCOVER_CROSS_CHAIN_SWAP : SwapType.CROSS_CHAIN_SWAP).getValue();
        }
        java.lang.String str = value;
        java.lang.String strEZpvd = (abstractC23101hrq.QUSxYX().AkhnZx() && C22372heC.AEQbTJ(abstractC23101hrq.ffGIBT())) ? C24695iig.EZpvd(abstractC23101hrq.ffGIBT(), z) : "";
        java.lang.String str2 = abstractC23101hrq.DCUTEI().EZpvd() ? "custom" : DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        C25416iwM c25416iwMDCUTEI = abstractC23101hrq.DCUTEI();
        QuotePriceRes quotePriceResAxsJAYsNCnLh = abstractC23101hrq.AxsJAYsNCnLh();
        java.lang.String strOLrzqt = c25416iwMDCUTEI.OLrzqt(quotePriceResAxsJAYsNCnLh != null ? quotePriceResAxsJAYsNCnLh.autoSlippage() : null);
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        Slippage slippage = new Slippage(str2, strOLrzqt);
        java.lang.String strFARcdN = abstractC23101hrq.fARcdN();
        java.lang.String originContractAddress = (data6 == null || (coinData2 = data6.getCoinData()) == null || (data2 = coinData2.getData()) == null) ? null : data2.getOriginContractAddress();
        java.lang.String str3 = originContractAddress == null ? "" : originContractAddress;
        java.lang.String originContractAddress2 = (data7 == null || (coinData = data7.getCoinData()) == null || (data = coinData.getData()) == null) ? null : data.getOriginContractAddress();
        java.lang.String str4 = originContractAddress2 == null ? "" : originContractAddress2;
        java.lang.String data8 = (data6 == null || (editData4 = data6.getEditData()) == null || (originPrice2 = editData4.getOriginPrice()) == null) ? null : originPrice2.getData();
        java.lang.String str5 = data8 == null ? "" : data8;
        java.lang.String data9 = (data6 == null || (editData3 = data6.getEditData()) == null) ? null : editData3.getData();
        java.lang.String str6 = data9 == null ? "" : data9;
        java.lang.String data10 = (data7 == null || (editData2 = data7.getEditData()) == null) ? null : editData2.getData();
        java.lang.String str7 = data10 == null ? "" : data10;
        if (data7 != null && (editData = data7.getEditData()) != null && (originPrice = editData.getOriginPrice()) != null) {
            data5 = originPrice.getData();
        }
        return new SwapButtonAnalytics(str3, str6, str5, str4, str7, data5 == null ? "" : data5, str, abstractC23101hrq.finit().AhwBna(), slippage, strEZpvd, strFARcdN);
    }

    public static /* synthetic */ void trackSwapDexFullPageView$default(C22877hne c22877hne, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        c22877hne.KWHzl(str, str2, str3, str4);
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("DEX_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.hnk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22877hne.KWHzl(str2, str, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "source", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_dialog", C22372heC.AEQbTJ(str2) ? "no" : "yes", false, 4, null);
        EventParamsList.put$default(eventParamsList, "business_type", C22372heC.AEQbTJ(str2) ? str3 : C22370heA.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "activity_name", "", false, 4, null);
        java.lang.String str5 = (java.lang.String) C32935mmv.KWHzl.get("channel_id");
        EventParamsList.put$default(eventParamsList, "channel_id", str5 == null ? "" : str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, "wallet_address", str4, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackDexSwapFullClick$default(C22877hne c22877hne, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        c22877hne.EZpvd(str, str2, z, str3);
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final boolean z, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("DEXSwap_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.hng
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22877hne.OLrzqt(str, z, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C22877hne c22877hne = OLrzqt;
        eventParamsList.put("business_type", c22877hne.AEQbTJ(str, z), true);
        EventParamsList.put$default(eventParamsList, "trade_dialog", c22877hne.AEQbTJ(str), false, 4, null);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str2, true);
        if (str3.length() > 0) {
            EventParamsList.put$default(eventParamsList, "wallet_address", str3, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        C32866mlf.onEvent$default("DEXSwap_Pop_Confirm_Click", (TrackChannel[]) null, new Function1() { // from class: o.hnb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22877hne.OLrzqt(str, str2, str3, str4, str5, str6, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, DexSwapPopConfirmClick.ButtonName.CANCEL.getValue(), false);
        C22877hne c22877hne = OLrzqt;
        EventParamsList.put$default(eventParamsList, "business_type", getBusinessType$default(c22877hne, str, false, 2, null), false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_dialog", c22877hne.AEQbTJ(str), false, 4, null);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str2, false);
        EventParamsList.put$default(eventParamsList, "pop_type", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "receive_value", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "paid_value", str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, "value_diff", str6, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DEXSwap_Mid_ConnectWallet_Click", (TrackChannel[]) null, new Function1() { // from class: o.hnd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22877hne.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C22877hne c22877hne = OLrzqt;
        EventParamsList.put$default(eventParamsList, "business_type", getBusinessType$default(c22877hne, str, false, 2, null), false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_dialog", c22877hne.AEQbTJ(str), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final AbstractC23101hrq abstractC23101hrq, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("DEXSwap_Mid_Authorize_Click", (TrackChannel[]) null, new Function1() { // from class: o.hnh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22877hne.EZpvd(str, str3, str2, abstractC23101hrq, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, AbstractC23101hrq abstractC23101hrq, EventParamsList eventParamsList) {
        QuotePriceRes quotePriceResAxsJAYsNCnLh;
        DeFiPlatformForSwap selectedDeFiPlatform;
        java.util.List<DeFiPlatformForSwap> defiPlatformInfoList;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("wallet_address", str, false);
        C22877hne c22877hne = OLrzqt;
        java.lang.Integer numValueOf = null;
        eventParamsList.put("business_type", getBusinessType$default(c22877hne, str2, false, 2, null), true);
        EventParamsList.put$default(eventParamsList, "source", str3, false, 4, null);
        eventParamsList.put("activity_name", "", false);
        EventParamsList.put$default(eventParamsList, "trade_dialog", c22877hne.AEQbTJ(str2), false, 4, null);
        if (abstractC23101hrq != null && (quotePriceResAxsJAYsNCnLh = abstractC23101hrq.AxsJAYsNCnLh()) != null && (selectedDeFiPlatform = quotePriceResAxsJAYsNCnLh.getSelectedDeFiPlatform()) != null) {
            QuotePriceRes quotePriceResAxsJAYsNCnLh2 = abstractC23101hrq.AxsJAYsNCnLh();
            if (quotePriceResAxsJAYsNCnLh2 != null && (defiPlatformInfoList = quotePriceResAxsJAYsNCnLh2.getDefiPlatformInfoList()) != null) {
                numValueOf = java.lang.Integer.valueOf(defiPlatformInfoList.indexOf(selectedDeFiPlatform));
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() + 1 : -1;
            java.lang.String name = selectedDeFiPlatform.getName();
            EventParamsList.put$default(eventParamsList, "provider_name", name == null ? "" : name, false, 4, null);
            EventParamsList.put$default(eventParamsList, "best_price", (numValueOf != null && numValueOf.intValue() == 0) ? "yes" : "no", false, 4, null);
            java.lang.String reducePercent = selectedDeFiPlatform.getReducePercent();
            if (reducePercent != null) {
                EventParamsList.put$default(eventParamsList, "price_difference", C23311hvo.formatPercent$default(reducePercent, false, 0, 0, null, null, 30, null), false, 4, null);
            }
            EventParamsList.put$default(eventParamsList, "price_ranking", java.lang.String.valueOf(iIntValue), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String getBusinessType$default(C22877hne c22877hne, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c22877hne.AEQbTJ(str, z);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return z ? "" : KWHzl(str);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C22372heC.AEQbTJ(str) ? "no" : "yes";
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [234=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C22372heC.AEQbTJ(str)) {
            return C22370heA.OLrzqt();
        }
        java.lang.String strOLrzqt = C23317hvu.OLrzqt();
        switch (strOLrzqt.hashCode()) {
            case -1380801655:
                if (strOLrzqt.equals(TabTitleInfo.KEY_BRIDGE)) {
                    return BusinessType.BRIDGE.getValue();
                }
                break;
            case -902286926:
                if (strOLrzqt.equals("simple")) {
                    return BusinessType.SIMPLE.getValue();
                }
                break;
            case 3347760:
                if (strOLrzqt.equals(TabTitleInfo.KEY_MEME)) {
                    return BusinessType.MEME.getValue();
                }
                break;
            case 3543443:
                if (strOLrzqt.equals("swap")) {
                    return BusinessType.SWAP.getValue();
                }
                break;
            case 1608138186:
                if (strOLrzqt.equals(TabTitleInfo.KEY_LIMIT_ORDER)) {
                    return BusinessType.LIMIT.getValue();
                }
                break;
        }
        return BusinessType.SWAP.getValue();
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C32866mlf.onEvent$default("DEXSwap_Trade_Simpletoast_View", (TrackChannel[]) null, new Function1() { // from class: o.hnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22877hne.EZpvd(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "chain_id", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tx_hash", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_mode", str3, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("DEXSwap_Trade_Longtoast_View", (TrackChannel[]) null, new Function1() { // from class: o.hnj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22877hne.OLrzqt(str, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "chain_id", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tx_hash", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "trade_mode", str4, false, 4, null);
        return Unit.INSTANCE;
    }
}
