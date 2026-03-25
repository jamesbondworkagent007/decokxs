package o;

import com.okinc.business.dex.trade.common.reminder.BusinessType;
import com.okinc.business.dex.trade.common.reminder.PreCheckModel;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC30503lcQ;
import o.C28145kQo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28137kQg {
    public final C19700gMb AEQbTJ;
    public final C28142kQl EZpvd;
    public final C28145kQo.StateListAnimator KWHzl;
    public final C28165kRh OLrzqt;
    public final kQX copydefault;

    /* JADX INFO: renamed from: o.kQg$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedOrderType.values().length];
            try {
                iArr[AdvancedOrderType.MARKET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public C28137kQg(@NotNull C28165kRh c28165kRh, @NotNull kQX kqx, @NotNull C28142kQl c28142kQl, @NotNull C28145kQo.StateListAnimator stateListAnimator, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(c28165kRh, "");
        Intrinsics.checkNotNullParameter(kqx, "");
        Intrinsics.checkNotNullParameter(c28142kQl, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.OLrzqt = c28165kRh;
        this.copydefault = kqx;
        this.EZpvd = c28142kQl;
        this.KWHzl = stateListAnimator;
        this.AEQbTJ = c19700gMb;
    }

    public final ReminderListConfig AEQbTJ(@NotNull C28139kQi c28139kQi) {
        java.lang.String strAEQbTJ;
        DefiChainInfo defiChainInfoEZpvd;
        SlippageMode slippageModeAYXKKw;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFJNWhG;
        CommonDexInfo commonDexInfo;
        CommonDexInfo commonDexInfo2;
        SlippageMode slippageModeAYXKKw2;
        java.lang.String strCopydefault;
        DefiChainInfo defiChainInfoPrevious;
        CommonDexInfo commonDexInfo3;
        DexMultiTokenInfoBean fromToken;
        Intrinsics.checkNotNullParameter(c28139kQi, "");
        V6BaseQuoteResponse v6BaseQuoteResponseIsConnected = c28139kQi.isConnected();
        if ((v6BaseQuoteResponseIsConnected == null || (commonDexInfo3 = v6BaseQuoteResponseIsConnected.getCommonDexInfo()) == null || (fromToken = commonDexInfo3.getFromToken()) == null || (strAEQbTJ = fromToken.getChainId()) == null) && (strAEQbTJ = c28139kQi.AEQbTJ()) == null) {
            return null;
        }
        if (c28139kQi.DbNXlk() == AdvancedOrderType.LIMIT) {
            java.util.List<DefiChainInfo> value = this.OLrzqt.copydefault().getValue();
            java.util.ListIterator<DefiChainInfo> listIterator = value.listIterator(value.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    defiChainInfoPrevious = null;
                    break;
                }
                defiChainInfoPrevious = listIterator.previous();
                if (Intrinsics.EZpvd((java.lang.Object) defiChainInfoPrevious.getChainId(), (java.lang.Object) strAEQbTJ)) {
                    break;
                }
            }
            defiChainInfoEZpvd = defiChainInfoPrevious;
        } else {
            defiChainInfoEZpvd = this.OLrzqt.EZpvd(strAEQbTJ);
        }
        DefiChainInfo defiChainInfo = defiChainInfoEZpvd;
        if (defiChainInfo == null) {
            return null;
        }
        if (c28139kQi.DbNXlk() == AdvancedOrderType.LIMIT) {
            gOL gol = gOL.EZpvd;
            PreCheckBean preCheckBeanFetchVPNInfo = c28139kQi.fetchVPNInfo();
            PreCheckModel preCheckModelKWHzl = preCheckBeanFetchVPNInfo != null ? gol.KWHzl(preCheckBeanFetchVPNInfo) : null;
            BusinessType businessTypeEZpvd = C28140kQj.EZpvd(c28139kQi);
            TokenPairRateQuote tokenPairRateQuoteDjBIcL = c28139kQi.djBIcL();
            java.lang.Throwable thValues = c28139kQi.values();
            C30808liD c30808liDFIwbmz = c28139kQi.fIwbmz();
            if (c30808liDFIwbmz == null || (slippageModeAYXKKw2 = c30808liDFIwbmz.AYXKKw()) == null) {
                slippageModeAYXKKw2 = SlippageMode.Dynamic;
            }
            SlippageMode slippageMode = slippageModeAYXKKw2;
            C30808liD c30808liDFIwbmz2 = c28139kQi.fIwbmz();
            java.lang.String strAkhnZx = c30808liDFIwbmz2 != null ? c30808liDFIwbmz2.AkhnZx() : null;
            C30808liD c30808liDFIwbmz3 = c28139kQi.fIwbmz();
            java.lang.String strKWHzl = c30808liDFIwbmz3 != null ? c30808liDFIwbmz3.KWHzl() : null;
            C30808liD c30808liDFIwbmz4 = c28139kQi.fIwbmz();
            return gol.KWHzl(preCheckModelKWHzl, businessTypeEZpvd, defiChainInfo, tokenPairRateQuoteDjBIcL, thValues, null, slippageMode, strAkhnZx, strKWHzl, c30808liDFIwbmz4 != null ? c30808liDFIwbmz4.KWHzl() : null, c28139kQi.OLrzqt(), c28139kQi.fJNWhG(), c28139kQi.AYXKKw(), c28139kQi.AkhnZx(), 1, c28139kQi.isConnected() != null && c28139kQi.EZpvd() == AdvancedApproveState.CANCEL_APPROVE && C33129mqd.AEQbTJ(c28139kQi.AuCTel(), 0), true, c28139kQi.djBIcL() != null && c28139kQi.gEmmrt() == AdvancedLimitBy.MCap && ((strCopydefault = c28139kQi.copydefault()) == null || !C30565ldZ.EZpvd(strCopydefault)), !this.copydefault.AEQbTJ(), this.EZpvd, this.KWHzl.EZpvd(c28139kQi), !Intrinsics.EZpvd(c28139kQi.KWHzl(), AbstractC30503lcQ.Activity.AEQbTJ), c28139kQi.AuCTel(), c28139kQi.valueOf(), this.AEQbTJ.KWHzl());
        }
        gOL gol2 = gOL.EZpvd;
        PreCheckBean preCheckBeanFetchVPNInfo2 = c28139kQi.fetchVPNInfo();
        PreCheckModel preCheckModelKWHzl2 = preCheckBeanFetchVPNInfo2 != null ? gol2.KWHzl(preCheckBeanFetchVPNInfo2) : null;
        BusinessType businessTypeEZpvd2 = C28140kQj.EZpvd(c28139kQi);
        V6BaseQuoteResponse v6BaseQuoteResponseIsConnected2 = c28139kQi.isConnected();
        java.lang.Throwable thValues2 = c28139kQi.values();
        C30808liD c30808liDFIwbmz5 = c28139kQi.fIwbmz();
        if (c30808liDFIwbmz5 == null || (slippageModeAYXKKw = c30808liDFIwbmz5.AYXKKw()) == null) {
            slippageModeAYXKKw = SlippageMode.Dynamic;
        }
        SlippageMode slippageMode2 = slippageModeAYXKKw;
        C30808liD c30808liDFIwbmz6 = c28139kQi.fIwbmz();
        java.lang.String strAkhnZx2 = c30808liDFIwbmz6 != null ? c30808liDFIwbmz6.AkhnZx() : null;
        C30808liD c30808liDFIwbmz7 = c28139kQi.fIwbmz();
        java.lang.String strKWHzl2 = c30808liDFIwbmz7 != null ? c30808liDFIwbmz7.KWHzl() : null;
        C30808liD c30808liDFIwbmz8 = c28139kQi.fIwbmz();
        java.lang.String strKWHzl3 = c30808liDFIwbmz8 != null ? c30808liDFIwbmz8.KWHzl() : null;
        V6BaseQuoteResponse v6BaseQuoteResponseIsConnected3 = c28139kQi.isConnected();
        if (v6BaseQuoteResponseIsConnected3 == null || (commonDexInfo2 = v6BaseQuoteResponseIsConnected3.getCommonDexInfo()) == null || (dexMultiTokenInfoBeanOLrzqt = commonDexInfo2.getFromToken()) == null) {
            dexMultiTokenInfoBeanOLrzqt = c28139kQi.OLrzqt();
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean = dexMultiTokenInfoBeanOLrzqt;
        V6BaseQuoteResponse v6BaseQuoteResponseIsConnected4 = c28139kQi.isConnected();
        if (v6BaseQuoteResponseIsConnected4 == null || (commonDexInfo = v6BaseQuoteResponseIsConnected4.getCommonDexInfo()) == null || (dexMultiTokenInfoBeanFJNWhG = commonDexInfo.getToToken()) == null) {
            dexMultiTokenInfoBeanFJNWhG = c28139kQi.fJNWhG();
        }
        return gol2.KWHzl(preCheckModelKWHzl2, businessTypeEZpvd2, defiChainInfo, v6BaseQuoteResponseIsConnected2, thValues2, null, slippageMode2, strAkhnZx2, strKWHzl2, strKWHzl3, dexMultiTokenInfoBean, dexMultiTokenInfoBeanFJNWhG, c28139kQi.AYXKKw(), c28139kQi.AkhnZx(), TaskDescription.copydefault[c28139kQi.DbNXlk().ordinal()] == 1 ? C28140kQj.copydefault(c28139kQi) + 1 : 1, c28139kQi.isConnected() != null && c28139kQi.EZpvd() == AdvancedApproveState.CANCEL_APPROVE && C33129mqd.AEQbTJ(c28139kQi.AuCTel(), 0), !(c28139kQi.KWHzl() instanceof AbstractC30503lcQ.Activity), false, !this.copydefault.AEQbTJ(), this.EZpvd, this.KWHzl.EZpvd(c28139kQi), !Intrinsics.EZpvd(c28139kQi.KWHzl(), AbstractC30503lcQ.Activity.AEQbTJ));
    }
}
