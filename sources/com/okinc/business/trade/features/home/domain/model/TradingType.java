package com.okinc.business.trade.features.home.domain.model;

import androidx.camera.video.AudioStats;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment;
import com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22380heK;
import o.C22416heu;
import o.C23274hvD;
import o.C28248kUj;
import o.C28255kUq;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC28261kUw;
import o.InterfaceC56445yFq;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TradingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradingType[] $VALUES;
    public static final TradingType Advanced;
    public static final TradingType Bridge;
    public static final TaskDescription Companion;
    public static final TradingType Meme;
    public static final TradingType Swap;
    private final String accessibilityId;
    private final TradingCategory category;
    private final boolean needCache;
    private final InterfaceC28261kUw tradingModeProvider;
    private final String typeValue;
    public static final TradingType None = new TradingType("None", 0, "", new InterfaceC28261kUw() { // from class: o.kUu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC28261kUw
        public java.lang.String EZpvd() {
            return "";
        }

        @Override // o.InterfaceC28261kUw
        public int KWHzl() {
            return 0;
        }

        @Override // o.InterfaceC28261kUw
        public java.lang.Object AEQbTJ(@NotNull android.content.Context context, TradeParam tradeParam, @NotNull Continuation<? super java.lang.Boolean> continuation) {
            return InterfaceC28261kUw.StateListAnimator.AEQbTJ(this, context, tradeParam, continuation);
        }

        @Override // o.InterfaceC28261kUw
        public androidx.fragment.app.Fragment copydefault(@NotNull android.content.Context context, @NotNull C28251kUm c28251kUm) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(c28251kUm, "");
            return new androidx.fragment.app.Fragment();
        }
    }, false, "", null, 16, null);
    public static final TradingType CopyTrading = new TradingType("CopyTrading", 5, "CopyTrading", new InterfaceC28261kUw() { // from class: o.kUi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC28261kUw
        public int KWHzl() {
            return C52761wXj.TaskDescription.zlvcHA;
        }

        @Override // o.InterfaceC28261kUw
        public java.lang.String EZpvd() {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.idLUrz);
        }

        @Override // o.InterfaceC28261kUw
        public androidx.fragment.app.Fragment copydefault(@NotNull android.content.Context context, @NotNull C28251kUm c28251kUm) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(c28251kUm, "");
            android.os.Bundle bundleAEQbTJ = c28251kUm.AEQbTJ();
            return gUV.Companion.copydefault(bundleAEQbTJ != null ? bundleAEQbTJ.getInt("tab", 0) : 0);
        }

        @Override // o.InterfaceC28261kUw
        public java.lang.Object AEQbTJ(@NotNull android.content.Context context, TradeParam tradeParam, @NotNull Continuation<? super java.lang.Boolean> continuation) {
            return C56443yFo.KWHzl(C22416heu.fetchVPNInfo());
        }
    }, true, "web3_dex_trade_tab_pop_cell_OKDEXTradeTypeCopyTrading", TradingCategory.Tools);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradingType[] $values() {
        return new TradingType[]{None, Meme, Swap, Bridge, Advanced, CopyTrading};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradingType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessibilityId() {
        return this.accessibilityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingCategory getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedCache() {
        return this.needCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC28261kUw getTradingModeProvider() {
        return this.tradingModeProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeValue() {
        return this.typeValue;
    }

    private TradingType(String str, int i, String str2, InterfaceC28261kUw interfaceC28261kUw, boolean z, String str3, TradingCategory tradingCategory) {
        this.typeValue = str2;
        this.tradingModeProvider = interfaceC28261kUw;
        this.needCache = z;
        this.accessibilityId = str3;
        this.category = tradingCategory;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 int)
  (r12v0 java.lang.String)
  (r13v0 o.kUw)
  (r14v0 boolean)
  (r15v0 java.lang.String)
  (wrap:com.okinc.business.trade.features.home.domain.model.TradingCategory:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:28) com.okinc.business.trade.features.home.domain.model.TradingCategory.Modes com.okinc.business.trade.features.home.domain.model.TradingCategory) : (r16v0 com.okinc.business.trade.features.home.domain.model.TradingCategory))
 A[MD:(java.lang.String, int, java.lang.String, o.kUw, boolean, java.lang.String, com.okinc.business.trade.features.home.domain.model.TradingCategory):void (m)] (LINE:23) call: com.okinc.business.trade.features.home.domain.model.TradingType.<init>(java.lang.String, int, java.lang.String, o.kUw, boolean, java.lang.String, com.okinc.business.trade.features.home.domain.model.TradingCategory):void type: THIS */
    public /* synthetic */ TradingType(String str, int i, String str2, InterfaceC28261kUw interfaceC28261kUw, boolean z, String str3, TradingCategory tradingCategory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, interfaceC28261kUw, z, str3, (i2 & 16) != 0 ? TradingCategory.Modes : tradingCategory);
    }

    static {
        TradingCategory tradingCategory = null;
        int i = 16;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Meme = new TradingType("Meme", 1, "Meme", C28255kUq.OLrzqt, true, "web3_dex_trade_tab_pop_cell_OKDEXTradeTypeMeme", tradingCategory, i, defaultConstructorMarker);
        boolean z = true;
        TradingCategory tradingCategory2 = null;
        int i2 = 16;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        Swap = new TradingType("Swap", 2, "Swap", new InterfaceC28261kUw() { // from class: o.kUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC28261kUw
            public int KWHzl() {
                return C52761wXj.TaskDescription.glXhWM;
            }

            @Override // o.InterfaceC28261kUw
            public java.lang.Object AEQbTJ(@NotNull android.content.Context context, TradeParam tradeParam, @NotNull Continuation<? super java.lang.Boolean> continuation) {
                return InterfaceC28261kUw.StateListAnimator.AEQbTJ(this, context, tradeParam, continuation);
            }

            @Override // o.InterfaceC28261kUw
            public java.lang.String EZpvd() {
                return C33070mpX.AYXKKw(C23274hvD.Fragment.OKvQBs);
            }

            @Override // o.InterfaceC28261kUw
            public androidx.fragment.app.Fragment copydefault(@NotNull android.content.Context context, @NotNull C28251kUm c28251kUm) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(c28251kUm, "");
                return SingleSwapAdvanceFragment.Companion.AEQbTJ(c28251kUm.KWHzl(), c28251kUm.EZpvd());
            }
        }, z, "web3_dex_trade_tab_pop_cell_OKDEXTradeTypeSwap", tradingCategory2, i2, defaultConstructorMarker2);
        Bridge = new TradingType("Bridge", 3, "Bridge", C28248kUj.copydefault, false, "web3_dex_trade_tab_pop_cell_OKDEXTradeTypeBridge", tradingCategory, i, defaultConstructorMarker);
        Advanced = new TradingType("Advanced", 4, "Advanced", new InterfaceC28261kUw() { // from class: o.kUk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC28261kUw
            public int KWHzl() {
                return C52761wXj.TaskDescription.fdazkH;
            }

            @Override // o.InterfaceC28261kUw
            public java.lang.String EZpvd() {
                return C33070mpX.AYXKKw(C23274hvD.Fragment.reset);
            }

            @Override // o.InterfaceC28261kUw
            public androidx.fragment.app.Fragment copydefault(@NotNull android.content.Context context, @NotNull C28251kUm c28251kUm) {
                CoinInfo toCoinInfo;
                CoinInfo toCoinInfo2;
                CoinInfo fromCoinInfo;
                CoinInfo fromCoinInfo2;
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(c28251kUm, "");
                android.os.Bundle bundleAEQbTJ = c28251kUm.AEQbTJ();
                boolean z2 = bundleAEQbTJ != null ? bundleAEQbTJ.getBoolean("extra_transaction_dialog_style") : false;
                android.os.Bundle bundleAEQbTJ2 = c28251kUm.AEQbTJ();
                int i3 = bundleAEQbTJ2 != null ? bundleAEQbTJ2.getInt("index", 0) : 0;
                android.os.Bundle bundleAEQbTJ3 = c28251kUm.AEQbTJ();
                java.lang.String tokenAddress = null;
                java.lang.String string = bundleAEQbTJ3 != null ? bundleAEQbTJ3.getString("extra_universal_3") : null;
                java.lang.String str = string == null ? "" : string;
                TradeParam tradeParamEZpvd = c28251kUm.EZpvd();
                java.lang.String chainId = (tradeParamEZpvd == null || (fromCoinInfo2 = tradeParamEZpvd.getFromCoinInfo()) == null) ? null : fromCoinInfo2.getChainId();
                java.lang.String str2 = chainId == null ? "" : chainId;
                java.lang.String tokenAddress2 = (tradeParamEZpvd == null || (fromCoinInfo = tradeParamEZpvd.getFromCoinInfo()) == null) ? null : fromCoinInfo.getTokenAddress();
                DexMultiTokenInfoBean dexMultiTokenInfoBean = new DexMultiTokenInfoBean((java.lang.String) null, str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, tokenAddress2 == null ? "" : tokenAddress2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -67, 134217727, (DefaultConstructorMarker) null);
                java.lang.String chainId2 = (tradeParamEZpvd == null || (toCoinInfo2 = tradeParamEZpvd.getToCoinInfo()) == null) ? null : toCoinInfo2.getChainId();
                java.lang.String str3 = chainId2 == null ? "" : chainId2;
                if (tradeParamEZpvd != null && (toCoinInfo = tradeParamEZpvd.getToCoinInfo()) != null) {
                    tokenAddress = toCoinInfo.getTokenAddress();
                }
                return AdvancedMainFragment.Companion.KWHzl(c28251kUm.KWHzl(), z2, new AdvancedModeParams(dexMultiTokenInfoBean, new DexMultiTokenInfoBean((java.lang.String) null, str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, tokenAddress == null ? "" : tokenAddress, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -67, 134217727, (DefaultConstructorMarker) null), TxDirection.Companion.KWHzl(i3), str, null, 0 == true ? 1 : 0, 48, 0 == true ? 1 : 0));
            }

            @Override // o.InterfaceC28261kUw
            public java.lang.Object AEQbTJ(@NotNull android.content.Context context, TradeParam tradeParam, @NotNull Continuation<? super java.lang.Boolean> continuation) {
                return C56443yFo.KWHzl(C22416heu.gEmmrt());
            }
        }, z, "web3_dex_trade_tab_pop_cell_OKDEXTradeTypeAdvance", tradingCategory2, i2, defaultConstructorMarker2);
        TradingType[] tradingTypeArr$values = $values();
        $VALUES = tradingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradingTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.domain.model.TradingType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final List<TradingType> AEQbTJ() {
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault("default_trade").fARcdN().AEQbTJ();
            boolean fieldNames = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.getFieldNames() : false;
            ArrayList arrayList = new ArrayList();
            if (C22416heu.uzCIH() && !fieldNames) {
                arrayList.add(TradingType.Meme);
            }
            arrayList.add(TradingType.Swap);
            if (C22416heu.gEmmrt()) {
                arrayList.add(TradingType.Advanced);
            }
            arrayList.add(TradingType.Bridge);
            if (C22416heu.fetchVPNInfo()) {
                arrayList.add(TradingType.CopyTrading);
            }
            return arrayList;
        }

        public final List<TradingType> OLrzqt() {
            List<TradingType> listAEQbTJ = AEQbTJ();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAEQbTJ) {
                if (((TradingType) obj).getCategory() == TradingCategory.Modes) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final List<TradingType> copydefault() {
            List<TradingType> listAEQbTJ = AEQbTJ();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAEQbTJ) {
                if (((TradingType) obj).getCategory() == TradingCategory.Tools) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final TradingType KWHzl(@NotNull String str) {
            TradingType tradingType;
            Intrinsics.checkNotNullParameter(str, "");
            TradingType[] tradingTypeArrValues = TradingType.values();
            int length = tradingTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tradingType = null;
                    break;
                }
                tradingType = tradingTypeArrValues[i];
                if (Intrinsics.EZpvd((Object) tradingType.getTypeValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return tradingType == null ? TradingType.Swap : tradingType;
        }
    }

    public static TradingType valueOf(String str) {
        return (TradingType) Enum.valueOf(TradingType.class, str);
    }

    public static TradingType[] values() {
        return (TradingType[]) $VALUES.clone();
    }
}
