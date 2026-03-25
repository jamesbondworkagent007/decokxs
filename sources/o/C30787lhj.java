package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC30395laO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C30787lhj {

    /* JADX INFO: renamed from: o.lhj$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedLimitBy.values().length];
            try {
                iArr[AdvancedLimitBy.Price.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedLimitBy.MCap.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[AdvancedOrderType.values().length];
            try {
                iArr2[AdvancedOrderType.MARKET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[AdvancedOrderType.LIMIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ() {
        return "--";
    }

    public static /* synthetic */ C30516lcd buildOrderType$default(C30787lhj c30787lhj, AdvancedOrderType advancedOrderType, AdvancedLimitBy advancedLimitBy, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildOrderType");
        }
        if ((i & 2) != 0) {
            advancedLimitBy = AdvancedLimitBy.Price;
        }
        return c30787lhj.AEQbTJ(advancedOrderType, advancedLimitBy);
    }

    public final C30516lcd AEQbTJ(@NotNull AdvancedOrderType advancedOrderType, @NotNull AdvancedLimitBy advancedLimitBy) {
        int i;
        Intrinsics.checkNotNullParameter(advancedOrderType, "");
        Intrinsics.checkNotNullParameter(advancedLimitBy, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.zLAIeZ);
        int i2 = ActionBar.KWHzl[advancedOrderType.ordinal()];
        if (i2 == 1 || i2 != 2) {
            i = C23274hvD.Fragment.update;
        } else {
            int i3 = ActionBar.copydefault[advancedLimitBy.ordinal()];
            if (i3 != 1 && i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23274hvD.Fragment.addCustomAction;
        }
        return new C30516lcd(strAYXKKw, C33070mpX.AYXKKw(i), ConfirmOrderTag.ORDER_TYPE, null, null, false, null, null, 248, null);
    }

    public final C30516lcd OLrzqt(ServiceFeeInfo serviceFeeInfo) {
        java.lang.CharSequence percent$default;
        if (serviceFeeInfo != null && !serviceFeeInfo.isDisplay()) {
            return new C30516lcd(null, null, null, null, null, false, null, null, 255, null);
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.sendVolumeInfoChanged);
        if (serviceFeeInfo == null || (percent$default = C25404iwA.AEQbTJ(serviceFeeInfo)) == null) {
            percent$default = C23311hvo.formatPercent$default("0", false, 0, 0, null, null, 31, null);
        }
        return new C30516lcd(strAYXKKw, percent$default, ConfirmOrderTag.SERVICE_FEE, new InterfaceC30395laO.TaskDescription(serviceFeeInfo), null, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public final C30516lcd copydefault(java.lang.String str) {
        java.lang.String strKWHzl = C31256lqb.KWHzl(str == null ? "" : str, (Function0<java.lang.String>) new Function0() { // from class: o.lhh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30787lhj.AEQbTJ();
            }
        });
        if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "--") || (C33129mqd.gEmmrt(strKWHzl, java.lang.Double.valueOf(0.001d)) && C33129mqd.AEQbTJ(strKWHzl, java.lang.Double.valueOf(-0.001d)))) {
            return new C30516lcd(null, null, null, null, null, false, null, null, 255, null);
        }
        return new C30516lcd(C33070mpX.AYXKKw(C23274hvD.Fragment.isActive), strKWHzl, ConfirmOrderTag.VALUE_DIFF, new InterfaceC30395laO.Activity(new C30454lbU(C33070mpX.AYXKKw(C23274hvD.Fragment.isActive), C33070mpX.AYXKKw(C23274hvD.Fragment.SFHvfSaKzXkR))), null, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public final java.lang.String EZpvd(@NotNull AdvancedQuoteResponse advancedQuoteResponse, @NotNull AdvancedTradeType advancedTradeType) {
        Intrinsics.checkNotNullParameter(advancedQuoteResponse, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        return C30565ldZ.getFmtSymbol$default(copydefault(advancedQuoteResponse, advancedTradeType).getTokenSymbol(), 0, 1, null);
    }

    public final java.lang.String copydefault(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull AdvancedTradeType advancedTradeType) {
        java.lang.String tokenSymbol;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = AEQbTJ(v6BaseQuoteResponse, advancedTradeType);
        java.lang.String fmtSymbol$default = null;
        if (dexMultiTokenInfoBeanAEQbTJ != null && (tokenSymbol = dexMultiTokenInfoBeanAEQbTJ.getTokenSymbol()) != null) {
            fmtSymbol$default = C30565ldZ.getFmtSymbol$default(tokenSymbol, 0, 1, null);
        }
        return fmtSymbol$default == null ? "" : fmtSymbol$default;
    }

    public final java.lang.String AEQbTJ(@NotNull AdvancedQuoteResponse advancedQuoteResponse, @NotNull AdvancedTradeType advancedTradeType) {
        Intrinsics.checkNotNullParameter(advancedQuoteResponse, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault(advancedQuoteResponse, advancedTradeType);
        return dexMultiTokenInfoBeanCopydefault.isMainChainCoin() ? "" : C25352ivB.formatAddress$default(dexMultiTokenInfoBeanCopydefault.getTokenContractAddress(), 6, 4, null, 4, null);
    }

    public final java.lang.String EZpvd(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull AdvancedTradeType advancedTradeType) {
        java.lang.String address$default;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = AEQbTJ(v6BaseQuoteResponse, advancedTradeType);
        if (dexMultiTokenInfoBeanAEQbTJ != null) {
            address$default = dexMultiTokenInfoBeanAEQbTJ.isMainChainCoin() ? "" : C25352ivB.formatAddress$default(dexMultiTokenInfoBeanAEQbTJ.getTokenContractAddress(), 6, 4, null, 4, null);
        } else {
            address$default = null;
        }
        return address$default == null ? "" : address$default;
    }

    public final java.lang.String OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull AdvancedTradeType advancedTradeType) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = AEQbTJ(v6BaseQuoteResponse, advancedTradeType);
        java.lang.String chainBWLogoUrl = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getChainBWLogoUrl() : null;
        return chainBWLogoUrl == null ? "" : chainBWLogoUrl;
    }

    public final DexMultiTokenInfoBean copydefault(AdvancedQuoteResponse advancedQuoteResponse, AdvancedTradeType advancedTradeType) {
        return advancedTradeType == AdvancedTradeType.BUY ? advancedQuoteResponse.getCommonDexInfo().getToToken() : advancedQuoteResponse.getCommonDexInfo().getFromToken();
    }

    public final DexMultiTokenInfoBean AEQbTJ(V6BaseQuoteResponse v6BaseQuoteResponse, AdvancedTradeType advancedTradeType) {
        if (advancedTradeType == AdvancedTradeType.BUY) {
            CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
            if (commonDexInfo != null) {
                return commonDexInfo.getToToken();
            }
        } else {
            CommonDexInfo commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo();
            if (commonDexInfo2 != null) {
                return commonDexInfo2.getFromToken();
            }
        }
        return null;
    }
}
