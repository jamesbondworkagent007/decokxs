package o;

import com.okinc.business.dex.trade.common.reminder.BusinessType;
import com.okinc.business.dex.trade.common.reminder.PreCheckModel;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderTierType;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gPk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19790gPk extends AbstractC19793gPn {
    @Override // o.InterfaceC19785gPf
    public ReminderTierType AEQbTJ() {
        return ReminderTierType.Blocking;
    }

    @Override // o.AbstractC19793gPn, o.InterfaceC19785gPf
    public C19781gPb OLrzqt(@NotNull C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        java.util.List<C19782gPc> listKWHzl = KWHzl();
        if (listKWHzl.isEmpty()) {
            return EZpvd(ReminderTierType.Blocking);
        }
        TradeReminderType tradeReminderTypeKWHzl = KWHzl(listKWHzl, c19783gPd);
        if (tradeReminderTypeKWHzl != null && tradeReminderTypeKWHzl != TradeReminderType.None) {
            return KWHzl(tradeReminderTypeKWHzl);
        }
        return EZpvd(ReminderTierType.Blocking);
    }

    public final TradeReminderType KWHzl(java.util.List<C19782gPc> list, C19783gPd c19783gPd) {
        for (C19782gPc c19782gPc : list) {
            TradeReminderType tradeReminderTypeKWHzl = c19782gPc.KWHzl(c19783gPd);
            if (tradeReminderTypeKWHzl != TradeReminderType.None && c19782gPc.KWHzl().contains(tradeReminderTypeKWHzl) && c19782gPc.copydefault() == ReminderTierType.Blocking) {
                return tradeReminderTypeKWHzl;
            }
        }
        return null;
    }

    public final C19781gPb KWHzl(TradeReminderType tradeReminderType) {
        return new C19781gPb(ReminderTierType.Blocking, C56402yEa.EZpvd(tradeReminderType), C56402yEa.EZpvd(tradeReminderType), tradeReminderType);
    }

    @Override // o.AbstractC19793gPn
    public java.util.List<C19782gPc> KWHzl() {
        ReminderTierType reminderTierType = ReminderTierType.Blocking;
        C19782gPc c19782gPc = new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.PRE_CHECK_ERROR), new Function1() { // from class: o.gPm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.fIwbmz((C19783gPd) obj);
            }
        }, null, 8, null);
        C19782gPc c19782gPc2 = new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.ServiceSuspended), new Function1() { // from class: o.gPx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.ejfBZ((C19783gPd) obj);
            }
        }, null, 8, null);
        C19782gPc c19782gPc3 = new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.WalletBusinessUnsupported), new Function1() { // from class: o.gPu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.uzCIH((C19783gPd) obj);
            }
        }, null, 8, null);
        C19782gPc c19782gPc4 = new C19782gPc(reminderTierType, yDY.gEmmrt(TradeReminderType.WalletStatusAbnormal, TradeReminderType.WalletMPCNeedRefreshed, TradeReminderType.WalletMPCNeedLogin, TradeReminderType.WalletMPCAccountInUse, TradeReminderType.WalletMPCAuthenticateAccount, TradeReminderType.WalletMPCLoggedOutNeedVerify, TradeReminderType.WalletMPCWalletHacked, TradeReminderType.WalletMPCAccountFrozen, TradeReminderType.WalletMPCAccountDeleted), new Function1() { // from class: o.gPv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.iwGUEr((C19783gPd) obj);
            }
        }, null, 8, null);
        C19782gPc c19782gPc5 = new C19782gPc(reminderTierType, yDY.gEmmrt(TradeReminderType.SAException, TradeReminderType.SALimitUnsupportChain), new Function1() { // from class: o.gPw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.getNewProxyInstance((C19783gPd) obj);
            }
        }, new Function1() { // from class: o.gPA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C19790gPk.hDKMBd((C19783gPd) obj));
            }
        });
        C19782gPc c19782gPc6 = new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.ChainNeedUseDapp), new Function1() { // from class: o.gPj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.AuCTelauCTel((C19783gPd) obj);
            }
        }, null, 8, null);
        C19782gPc c19782gPc7 = new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.PresetConfigMiss), new Function1() { // from class: o.gPq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.zsXlph((C19783gPd) obj);
            }
        }, null, 8, null);
        C19782gPc c19782gPc8 = new C19782gPc(reminderTierType, yDY.gEmmrt(TradeReminderType.TokenHighRiskLeverage, TradeReminderType.TokenHoneypot), new Function1() { // from class: o.gPo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.wlaJM((C19783gPd) obj);
            }
        }, null, 8, null);
        C19782gPc c19782gPc9 = new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.MCapEmpty), new Function1() { // from class: o.gPp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.zLjUOn((C19783gPd) obj);
            }
        }, null, 8, null);
        TradeReminderType tradeReminderType = TradeReminderType.QuoteDapp;
        TradeReminderType tradeReminderType2 = TradeReminderType.NoLiquidityForOKX;
        TradeReminderType tradeReminderType3 = TradeReminderType.QuoteNoLiquidityFallback;
        return yDY.gEmmrt(c19782gPc, c19782gPc2, c19782gPc3, c19782gPc4, c19782gPc5, c19782gPc6, c19782gPc7, c19782gPc8, c19782gPc9, new C19782gPc(reminderTierType, yDY.gEmmrt(tradeReminderType, tradeReminderType2, tradeReminderType3, TradeReminderType.ServiceSuspendedRecommendDapp, TradeReminderType.QuoteFailed), new Function1() { // from class: o.gPl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.fARcdN((C19783gPd) obj);
            }
        }, null, 8, null), new C19782gPc(reminderTierType, yDY.gEmmrt(TradeReminderType.QuoteBlackAddress, TradeReminderType.QuoteHoneypot, TradeReminderType.QuoteNoLiquidityServer, tradeReminderType3, TradeReminderType.NoSupportTPLS, tradeReminderType2), new Function1() { // from class: o.gPs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.AuCTel((C19783gPd) obj);
            }
        }, null, 8, null), new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.LimitMiniTradeAmount), new Function1() { // from class: o.gPr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.fJNWhG((C19783gPd) obj);
            }
        }, null, 8, null), new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.RevokeApproval), new Function1() { // from class: o.gPt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19790gPk.getFieldNames((C19783gPd) obj);
            }
        }, null, 8, null));
    }

    public static final TradeReminderType fIwbmz(C19783gPd c19783gPd) {
        TradeReminderType tradeReminderTypeAEQbTJ;
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        PreCheckModel preCheckModelGEmmrt = c19783gPd.gEmmrt();
        return (preCheckModelGEmmrt == null || (tradeReminderTypeAEQbTJ = gON.AEQbTJ(preCheckModelGEmmrt)) == null) ? TradeReminderType.None : tradeReminderTypeAEQbTJ;
    }

    public static final TradeReminderType ejfBZ(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        return c19783gPd.uzCIH() ? TradeReminderType.ServiceSuspended : TradeReminderType.None;
    }

    public static final TradeReminderType uzCIH(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        TradeReminderType tradeReminderTypeCopydefault = c19783gPd.getFieldNames().copydefault(c19783gPd.AEQbTJ());
        return tradeReminderTypeCopydefault == null ? TradeReminderType.None : tradeReminderTypeCopydefault;
    }

    public static final TradeReminderType iwGUEr(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        InterfaceC19780gPa fieldNames = c19783gPd.getFieldNames();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = c19783gPd.OLrzqt();
        TradeReminderType tradeReminderTypeEZpvd = fieldNames.EZpvd(dexMultiTokenInfoBeanOLrzqt != null ? dexMultiTokenInfoBeanOLrzqt.getChainId() : null, c19783gPd.AEQbTJ());
        return tradeReminderTypeEZpvd == null ? TradeReminderType.None : tradeReminderTypeEZpvd;
    }

    public static final TradeReminderType getNewProxyInstance(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        if (!c19783gPd.DbNXlk()) {
            return TradeReminderType.None;
        }
        gLQ glqKWHzl = c19783gPd.isConnected().KWHzl(c19783gPd.KWHzl().getChainId());
        TradeReminderType tradeReminderTypeOLrzqt = (!c19783gPd.AEQbTJ().isAdvanced() || c19783gPd.KWHzl().getChainId().length() <= 0) ? null : c19783gPd.isConnected().OLrzqt(glqKWHzl);
        if (tradeReminderTypeOLrzqt != null && tradeReminderTypeOLrzqt != TradeReminderType.None) {
            return tradeReminderTypeOLrzqt;
        }
        gOT gotIsConnected = c19783gPd.isConnected();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = c19783gPd.OLrzqt();
        TradeReminderType tradeReminderTypeAEQbTJ = gotIsConnected.AEQbTJ(glqKWHzl, dexMultiTokenInfoBeanOLrzqt != null ? dexMultiTokenInfoBeanOLrzqt.getChainId() : null);
        return tradeReminderTypeAEQbTJ == null ? TradeReminderType.None : tradeReminderTypeAEQbTJ;
    }

    public static final boolean hDKMBd(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        return c19783gPd.DbNXlk();
    }

    public static final TradeReminderType AuCTelauCTel(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        if (gOL.EZpvd.OLrzqt(c19783gPd.KWHzl())) {
            return TradeReminderType.ChainNeedUseDapp;
        }
        return TradeReminderType.None;
    }

    public static final TradeReminderType zsXlph(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        if (c19783gPd.AEQbTJ().isSwapMode() && c19783gPd.valueOf() != null) {
            return TradeReminderType.PresetConfigMiss;
        }
        return TradeReminderType.None;
    }

    public static final TradeReminderType wlaJM(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        TradeReminderType tradeReminderTypeKWHzl = gOL.EZpvd.KWHzl(c19783gPd.OLrzqt(), c19783gPd.fJNWhG(), c19783gPd.fetchVPNInfo(), c19783gPd.AkhnZx());
        return tradeReminderTypeKWHzl == null ? TradeReminderType.None : tradeReminderTypeKWHzl;
    }

    public static final TradeReminderType zLjUOn(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        if ((c19783gPd.AEQbTJ() == BusinessType.AdvancedModeLimitBuy || c19783gPd.AEQbTJ() == BusinessType.AdvancedModeLimitSell) && c19783gPd.EZpvd()) {
            return TradeReminderType.MCapEmpty;
        }
        return TradeReminderType.None;
    }

    public static final TradeReminderType fARcdN(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        TradeReminderType tradeReminderTypeCheckQuoteError$OKDex_dex_impl$default = gOL.checkQuoteError$OKDex_dex_impl$default(gOL.EZpvd, c19783gPd.AkhnZx(), c19783gPd.fetchVPNInfo(), c19783gPd.copydefault(), c19783gPd.values(), false, 16, null);
        return tradeReminderTypeCheckQuoteError$OKDex_dex_impl$default == null ? TradeReminderType.None : tradeReminderTypeCheckQuoteError$OKDex_dex_impl$default;
    }

    public static final TradeReminderType AuCTel(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        TradeReminderType tradeReminderTypeCheckQuoteResponse$OKDex_dex_impl$default = gOL.checkQuoteResponse$OKDex_dex_impl$default(gOL.EZpvd, c19783gPd.fetchVPNInfo(), c19783gPd.KWHzl(), c19783gPd.copydefault(), c19783gPd.values(), c19783gPd.hDKMBd(), false, 32, null);
        return tradeReminderTypeCheckQuoteResponse$OKDex_dex_impl$default == null ? TradeReminderType.None : tradeReminderTypeCheckQuoteResponse$OKDex_dex_impl$default;
    }

    public static final TradeReminderType fJNWhG(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        TradeReminderType tradeReminderTypeKWHzl = gOL.EZpvd.KWHzl(c19783gPd.fetchVPNInfo(), c19783gPd.KWHzl(), c19783gPd.AEQbTJ(), c19783gPd.AuCTel());
        return tradeReminderTypeKWHzl == null ? TradeReminderType.None : tradeReminderTypeKWHzl;
    }

    public static final TradeReminderType getFieldNames(C19783gPd c19783gPd) {
        gOU gouFetchVPNInfo;
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        if (c19783gPd.fIwbmz() && (gouFetchVPNInfo = c19783gPd.fetchVPNInfo()) != null && gouFetchVPNInfo.values()) {
            return TradeReminderType.RevokeApproval;
        }
        return TradeReminderType.None;
    }
}
