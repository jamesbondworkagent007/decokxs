package o;

import android.content.SharedPreferences;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC22824hme;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class kQX {
    public final InterfaceC25414iwK AEQbTJ;
    public final android.content.SharedPreferences KWHzl;
    public boolean copydefault;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradingType.values().length];
            try {
                iArr[TradingType.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradingType.Meme.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TradingType.Advanced.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return !this.copydefault;
    }

    public kQX(@NotNull android.content.SharedPreferences sharedPreferences, @NotNull InterfaceC25414iwK interfaceC25414iwK) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        this.KWHzl = sharedPreferences;
        this.AEQbTJ = interfaceC25414iwK;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @yCM
    public kQX(@NotNull android.content.Context context, @NotNull InterfaceC25414iwK interfaceC25414iwK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("dex_trading_local_config", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this(sharedPreferences, interfaceC25414iwK);
    }

    public final AdvancedModeParams EZpvd(@NotNull java.lang.String str, @NotNull AdvancedTradeType advancedTradeType, @NotNull TradingType tradingType) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        Intrinsics.checkNotNullParameter(tradingType, "");
        C22374heE c22374heECopydefault = C22380heK.OLrzqt.copydefault(str);
        C22830hmk c22830hmkFJNWhG = c22374heECopydefault.fJNWhG();
        int i = TaskDescription.EZpvd[tradingType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            int iIsConnected = c22374heECopydefault.fetchVPNInfo().isConnected();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ2 = c22830hmkFJNWhG.AEQbTJ();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = c22830hmkFJNWhG.valueOf();
            TxDirection txDirection = TxDirection.BUY;
            return new AdvancedModeParams(dexMultiTokenInfoBeanAEQbTJ2, dexMultiTokenInfoBeanValueOf, iIsConnected == txDirection.getValue() ? txDirection : TxDirection.SELL, null, KWHzl(), AdvancedLimitBy.Companion.OLrzqt(this.KWHzl.getInt("key_dex_advanced_limit_by", AdvancedLimitBy.Price.getValue())), 8, null);
        }
        AdvancedTradeType advancedTradeType2 = AdvancedTradeType.BUY;
        if (advancedTradeType == advancedTradeType2) {
            dexMultiTokenInfoBeanAEQbTJ = c22830hmkFJNWhG.valueOf();
        } else {
            dexMultiTokenInfoBeanAEQbTJ = c22830hmkFJNWhG.AEQbTJ();
        }
        return new AdvancedModeParams(advancedTradeType == advancedTradeType2 ? null : dexMultiTokenInfoBeanAEQbTJ, advancedTradeType == advancedTradeType2 ? dexMultiTokenInfoBeanAEQbTJ : null, advancedTradeType == advancedTradeType2 ? TxDirection.BUY : TxDirection.SELL, null, KWHzl(), AdvancedLimitBy.Companion.OLrzqt(this.KWHzl.getInt("key_dex_advanced_limit_by", AdvancedLimitBy.Price.getValue())), 8, null);
    }

    public final AdvancedOrderType KWHzl() {
        if (this.AEQbTJ.valueOf()) {
            return AdvancedOrderType.Companion.copydefault(this.KWHzl.getInt("key_dex_advanced_order_type", AdvancedOrderType.MARKET.getValue()));
        }
        return AdvancedOrderType.MARKET;
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull AdvancedModeParams advancedModeParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(advancedModeParams, "");
        if (advancedModeParams.AhwBna() == null && advancedModeParams.AEQbTJ() == null) {
            return;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna = advancedModeParams.AhwBna();
        java.lang.String chainId = dexMultiTokenInfoBeanAhwBna != null ? dexMultiTokenInfoBeanAhwBna.getChainId() : null;
        if (chainId == null || chainId.length() == 0) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = advancedModeParams.AEQbTJ();
            java.lang.String chainId2 = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getChainId() : null;
            if (chainId2 == null || chainId2.length() == 0) {
                return;
            }
        }
        if (advancedModeParams.EZpvd() == TxDirection.BUY) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna2 = advancedModeParams.AhwBna();
            if (dexMultiTokenInfoBeanAhwBna2 != null) {
                InterfaceC22824hme.ActionBar.setCurrentToCoin$default(C22380heK.OLrzqt.copydefault(str).OLrzqt(true), dexMultiTokenInfoBeanAhwBna2, false, 2, null);
            }
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ2 = advancedModeParams.AEQbTJ();
            if (dexMultiTokenInfoBeanAEQbTJ2 != null) {
                InterfaceC22824hme.ActionBar.setCurrentFromCoin$default(C22380heK.OLrzqt.copydefault(str).OLrzqt(true), dexMultiTokenInfoBeanAEQbTJ2, false, 2, null);
            }
            C22380heK.OLrzqt.copydefault(str).fJNWhG().AhwBna().EZpvd(4, advancedModeParams.AEQbTJ(), advancedModeParams.AhwBna());
        } else {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna3 = advancedModeParams.AhwBna();
            if (dexMultiTokenInfoBeanAhwBna3 != null) {
                InterfaceC22824hme.ActionBar.setCurrentFromCoin$default(C22380heK.OLrzqt.copydefault(str).OLrzqt(true), dexMultiTokenInfoBeanAhwBna3, false, 2, null);
            }
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ3 = advancedModeParams.AEQbTJ();
            if (dexMultiTokenInfoBeanAEQbTJ3 != null) {
                InterfaceC22824hme.ActionBar.setCurrentToCoin$default(C22380heK.OLrzqt.copydefault(str).OLrzqt(true), dexMultiTokenInfoBeanAEQbTJ3, false, 2, null);
            }
            C22380heK.OLrzqt.copydefault(str).fJNWhG().AhwBna().EZpvd(4, advancedModeParams.AhwBna(), advancedModeParams.AEQbTJ());
        }
        C22380heK.OLrzqt.copydefault(str).fetchVPNInfo().KWHzl(advancedModeParams.EZpvd() != TxDirection.SELL ? 0 : 1);
        SharedPreferences.Editor editorEdit = this.KWHzl.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "");
        editorEdit.putInt("key_dex_advanced_order_type", advancedModeParams.AYXKKw().getValue());
        editorEdit.putInt("key_dex_advanced_limit_by", advancedModeParams.KWHzl().getValue());
        editorEdit.apply();
    }
}
