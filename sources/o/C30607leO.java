package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedChainListEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedConfirmEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedDefaultListEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedDepthDisplayEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedDepthTierEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitByEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedMyPositionsEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOpenOrderEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderTypeEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSearchListEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedSettingsEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTpslAddStrategyEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTpslEditEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC30561ldV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.leO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30607leO implements InterfaceC30608leP {
    public final C19700gMb KWHzl;
    public final kRI copydefault;

    /* JADX INFO: renamed from: o.leO$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedOrderType.values().length];
            try {
                iArr[AdvancedOrderType.MARKET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedOrderType.LIMIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    @yCM
    public C30607leO(@NotNull kRI kri, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(kri, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.copydefault = kri;
        this.KWHzl = c19700gMb;
    }

    @Override // o.InterfaceC30608leP
    public void KWHzl(@NotNull InterfaceC30619lea interfaceC30619lea, @NotNull kRM krm) {
        Intrinsics.checkNotNullParameter(interfaceC30619lea, "");
        Intrinsics.checkNotNullParameter(krm, "");
        if (interfaceC30619lea instanceof AbstractC30561ldV) {
            this.copydefault.KWHzl(((AbstractC30561ldV) interfaceC30619lea).getValue(), AEQbTJ(krm, interfaceC30619lea));
            return;
        }
        if (interfaceC30619lea instanceof AdvancedOrderTypeEvents) {
            this.copydefault.djBIcL(((AdvancedOrderTypeEvents) interfaceC30619lea).getValue(), getCommonData$default(this, krm, null, 2, null));
            return;
        }
        if (interfaceC30619lea instanceof AdvancedDepthTierEvents) {
            this.copydefault.OLrzqt(((AdvancedDepthTierEvents) interfaceC30619lea).getValue(), getCommonData$default(this, krm, null, 2, null));
            return;
        }
        if (interfaceC30619lea instanceof AdvancedDepthDisplayEvents) {
            this.copydefault.AEQbTJ(((AdvancedDepthDisplayEvents) interfaceC30619lea).getValue(), getCommonData$default(this, krm, null, 2, null));
            return;
        }
        if (interfaceC30619lea instanceof AdvancedOpenOrderEvents) {
            this.copydefault.gEmmrt(((AdvancedOpenOrderEvents) interfaceC30619lea).getValue(), getCommonData$default(this, krm, null, 2, null));
            return;
        }
        if (interfaceC30619lea instanceof C30621lec) {
            C30621lec c30621lec = (C30621lec) interfaceC30619lea;
            this.copydefault.gEmmrt(c30621lec.getValue(), C56424yEw.OLrzqt(c30621lec.OLrzqt(), getCommonData$default(this, krm, null, 2, null)));
            return;
        }
        if (interfaceC30619lea instanceof AdvancedMyPositionsEvents) {
            this.copydefault.AhwBna(((AdvancedMyPositionsEvents) interfaceC30619lea).getValue(), getCommonData$default(this, krm, null, 2, null));
            return;
        }
        if ((interfaceC30619lea instanceof AdvancedDefaultListEvents) || (interfaceC30619lea instanceof AdvancedSearchListEvents) || (interfaceC30619lea instanceof AdvancedChainListEvents)) {
            this.copydefault.OLrzqt(interfaceC30619lea, getCommonData$default(this, krm, null, 2, null));
            return;
        }
        if (interfaceC30619lea instanceof AdvancedConfirmEvents) {
            this.copydefault.EZpvd(((AdvancedConfirmEvents) interfaceC30619lea).getValue(), getCommonData$default(this, krm, null, 2, null));
            return;
        }
        if (interfaceC30619lea instanceof AdvancedSettingsEvents) {
            this.copydefault.AYXKKw(((AdvancedSettingsEvents) interfaceC30619lea).getValue(), getCommonData$default(this, krm, null, 2, null));
            return;
        }
        if (interfaceC30619lea instanceof AdvancedLimitByEvents) {
            this.copydefault.copydefault(((AdvancedLimitByEvents) interfaceC30619lea).getValue(), getCommonData$default(this, krm, null, 2, null));
            return;
        }
        if (interfaceC30619lea instanceof AdvancedTpslEditEvents) {
            this.copydefault.fetchVPNInfo(((AdvancedTpslEditEvents) interfaceC30619lea).getValue(), getCommonData$default(this, krm, null, 2, null));
            return;
        }
        if (interfaceC30619lea instanceof AdvancedTpslAddStrategyEvents) {
            this.copydefault.isConnected(((AdvancedTpslAddStrategyEvents) interfaceC30619lea).getValue(), getCommonData$default(this, krm, null, 2, null));
        } else if (interfaceC30619lea instanceof C30620leb) {
            this.copydefault.EZpvd(((C30620leb) interfaceC30619lea).KWHzl());
        } else if (interfaceC30619lea instanceof C30564ldY) {
            this.copydefault.AEQbTJ(((C30564ldY) interfaceC30619lea).EZpvd());
        }
    }

    @Override // o.InterfaceC30608leP
    public void copydefault(@NotNull java.lang.String str, @NotNull kRM krm) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(krm, "");
        this.copydefault.valueOf(str, getCommonData$default(this, krm, null, 2, null));
    }

    public static /* synthetic */ java.util.Map getCommonData$default(C30607leO c30607leO, kRM krm, InterfaceC30619lea interfaceC30619lea, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC30619lea = null;
        }
        return c30607leO.AEQbTJ(krm, interfaceC30619lea);
    }

    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ(kRM krm, InterfaceC30619lea interfaceC30619lea) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("business_type", "advanced");
        java.lang.String strValues = krm.values();
        java.lang.String str = "";
        if (strValues == null) {
            strValues = "";
        }
        linkedHashMap.put("wallet_address", strValues);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = krm.AEQbTJ();
        java.lang.String chainName = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        linkedHashMap.put("chain_name", chainName);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ2 = krm.AEQbTJ();
        java.lang.String tokenContractAddress = dexMultiTokenInfoBeanAEQbTJ2 != null ? dexMultiTokenInfoBeanAEQbTJ2.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        linkedHashMap.put("from_token_address", tokenContractAddress);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ3 = krm.AEQbTJ();
        java.lang.String tokenSymbol = dexMultiTokenInfoBeanAEQbTJ3 != null ? dexMultiTokenInfoBeanAEQbTJ3.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        linkedHashMap.put("from_token_symbol", tokenSymbol);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw = krm.AYXKKw();
        java.lang.String tokenContractAddress2 = dexMultiTokenInfoBeanAYXKKw != null ? dexMultiTokenInfoBeanAYXKKw.getTokenContractAddress() : null;
        if (tokenContractAddress2 == null) {
            tokenContractAddress2 = "";
        }
        linkedHashMap.put("to_token_address", tokenContractAddress2);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw2 = krm.AYXKKw();
        java.lang.String tokenSymbol2 = dexMultiTokenInfoBeanAYXKKw2 != null ? dexMultiTokenInfoBeanAYXKKw2.getTokenSymbol() : null;
        if (tokenSymbol2 == null) {
            tokenSymbol2 = "";
        }
        linkedHashMap.put("to_token_symbol", tokenSymbol2);
        linkedHashMap.put("from_token_amount", krm.KWHzl());
        linkedHashMap.put("to_token_amount", krm.gEmmrt());
        linkedHashMap.put("from_amount_usdt", krm.OLrzqt());
        linkedHashMap.put("to_amount_usdt", krm.valueOf());
        linkedHashMap.put("trade_direction", krm.EZpvd() == AdvancedTradeType.BUY ? "buy" : "sell");
        linkedHashMap.put("trade_dialog", krm.AkhnZx() ? "yes" : "no");
        linkedHashMap.put("mev_protection", krm.DbNXlk() ? DexTrackEventParameter.ButtonName.ON.getValue() : DexTrackEventParameter.ButtonName.OFF.getValue());
        linkedHashMap.put("priority_fee", krm.AhwBna());
        int i = StateListAnimator.KWHzl[krm.copydefault().ordinal()];
        if (i == 1) {
            str = "swap";
        } else if (i == 2) {
            str = "limit";
        }
        linkedHashMap.put(OtcExtraKeys.CRYPTO_ORDER_TYPE, str);
        if (krm.isConnected() != null) {
            linkedHashMap.put("tp", krm.isConnected());
        }
        if (krm.djBIcL() != null) {
            linkedHashMap.put("sl", krm.djBIcL());
        }
        linkedHashMap.put("is_tpsl", krm.fetchVPNInfo() ? "yes" : "no");
        linkedHashMap.put("is_tee", this.KWHzl.AYXKKw() ? "yes" : "no");
        if (interfaceC30619lea != null && (interfaceC30619lea instanceof AbstractC30561ldV.TaskDescription)) {
            linkedHashMap.put("submit_type", ((AbstractC30561ldV.TaskDescription) interfaceC30619lea).OLrzqt());
        }
        if (interfaceC30619lea != null && (interfaceC30619lea instanceof AbstractC30561ldV.SharedElementCallback)) {
            linkedHashMap.put("qty_amount", ((AbstractC30561ldV.SharedElementCallback) interfaceC30619lea).copydefault());
        }
        return linkedHashMap;
    }
}
