package com.okinc.unify_trade.bot.mapper;

import com.google.android.exoplayer2.C;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.BotShareResult;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.mapper.SignalBotShareDataMapper;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33069mpW;
import o.C33070mpX;
import o.C55688xof;
import o.C55886xsR;
import o.C56029xvB;
import o.C56033xvF;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.InterfaceC54501xKt;
import o.InterfaceC55881xsM;
import o.InterfaceC56445yFq;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignalBotShareDataMapper implements InterfaceC54501xKt<List<? extends BotShareResult>, TacticsData> {
    public SignalDetails AEQbTJ;
    public final TacticsData EZpvd;
    public final SignalSharePath copydefault;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignalSharePath.values().length];
            try {
                iArr[SignalSharePath.SIGNAL_DETAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(SignalDetails signalDetails) {
        this.AEQbTJ = signalDetails;
    }

    public SignalBotShareDataMapper(@NotNull TacticsData tacticsData, @NotNull SignalSharePath signalSharePath) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(signalSharePath, "");
        this.EZpvd = tacticsData;
        this.copydefault = signalSharePath;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ TacticsData KWHzl(List<? extends BotShareResult> list) {
        return EZpvd((List<BotShareResult>) list);
    }

    public final String copydefault(String str, String str2) throws UnsupportedEncodingException {
        return str + URLEncoder.encode(str2, C.UTF8_NAME);
    }

    public final String KWHzl(String str, String str2) {
        Pair pairOLrzqt;
        if (Intrinsics.EZpvd((Object) str2, (Object) "published")) {
            pairOLrzqt = C56390yDp.OLrzqt("pro/trade_bot/signal_detail/page", C56423yEv.EZpvd(C56390yDp.OLrzqt("signalChanId", str)));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt("pro/trade_bot/order/page", C56423yEv.EZpvd(C56390yDp.OLrzqt("squareType", "2")));
        }
        return "OKX://" + ((String) pairOLrzqt.component1()) + C56029xvB.KWHzl.copydefault((Map) pairOLrzqt.component2());
    }

    public TacticsData EZpvd(@NotNull List<BotShareResult> list) {
        String signalChanId;
        String signalChanName;
        List<String> instIds;
        String instIds2;
        InterfaceC55881xsM interfaceC55881xsMCopydefault;
        Intrinsics.checkNotNullParameter(list, "");
        BotShareResult botShareResult = (BotShareResult) CollectionsKt___CollectionsKt.firstOrNull(list);
        SignalDetails signalDetails = this.AEQbTJ;
        if (signalDetails == null || (signalChanId = signalDetails.getSignalChanId()) == null) {
            signalChanId = this.EZpvd.getSignalChanId();
        }
        String signalApprovalStatus = botShareResult != null ? botShareResult.getSignalApprovalStatus() : null;
        if (signalApprovalStatus == null) {
            signalApprovalStatus = "";
        }
        String strKWHzl = KWHzl(signalChanId, signalApprovalStatus);
        AEQbTJ(this.EZpvd.getShareData());
        TacticsData tacticsData = this.EZpvd;
        tacticsData.setInstType("SWAP");
        tacticsData.setDeeplink(strKWHzl);
        SignalDetails signalDetails2 = this.AEQbTJ;
        if (signalDetails2 == null || (signalChanName = signalDetails2.getSignalChanName()) == null) {
            signalChanName = this.EZpvd.getSignalChanName();
        }
        tacticsData.setStgyName(signalChanName);
        tacticsData.setCopyType((this.copydefault == SignalSharePath.SIGNAL_DETAIL || ((interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault()) != null && interfaceC55881xsMCopydefault.OLrzqt())) ? "3" : "");
        tacticsData.setOrderType("signal_bot");
        SignalDetails signalDetails3 = this.AEQbTJ;
        if (signalDetails3 == null || (instIds2 = signalDetails3.getInstIds()) == null || (instIds = StringsKt__StringsKt.split$default((CharSequence) instIds2, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            instIds = this.EZpvd.getInstIds();
        }
        tacticsData.setInstIds(instIds);
        ShareData shareData = tacticsData.getShareData();
        String url = botShareResult != null ? botShareResult.getUrl() : null;
        shareData.setQrCode(copydefault(url != null ? url : "", strKWHzl));
        SignalDetails signalDetails4 = this.AEQbTJ;
        shareData.setAdditionalParams(C56423yEv.EZpvd(C56390yDp.OLrzqt("signal_bot_share_inst_id_count", signalDetails4 != null ? signalDetails4.getInstIdsCount() : null)));
        return tacticsData;
    }

    public final void AEQbTJ(ShareData shareData) {
        String strAYXKKw;
        strAYXKKw = "";
        if (TaskDescription.AEQbTJ[this.copydefault.ordinal()] == 1) {
            SignalDetails signalDetails = this.AEQbTJ;
            String ccy = signalDetails != null ? signalDetails.getCcy() : null;
            if (ccy == null) {
                ccy = "";
            }
            shareData.setPriceUnit(ccy);
            shareData.setBotDataTitle1(C33070mpX.AYXKKw(C55688xof.Application.QYvkLl));
            xMR xmr = xMR.copydefault;
            SignalDetails signalDetails2 = this.AEQbTJ;
            String followerWinRate = signalDetails2 != null ? signalDetails2.getFollowerWinRate() : null;
            shareData.setBotDataValue1(xMR.formatPercent$default(xmr, followerWinRate == null ? "" : followerWinRate, 0, null, 6, null));
            int i = C55688xof.Application.RjCdvp;
            SignalDetails signalDetails3 = this.AEQbTJ;
            String ccy2 = signalDetails3 != null ? signalDetails3.getCcy() : null;
            if (ccy2 == null) {
                ccy2 = "";
            }
            shareData.setBotDataTitle2(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, ccy2))));
            SignalDetails signalDetails4 = this.AEQbTJ;
            String totalFollowerAssets = signalDetails4 != null ? signalDetails4.getTotalFollowerAssets() : null;
            if (totalFollowerAssets == null) {
                totalFollowerAssets = "";
            }
            shareData.setBotDataValue2(xMR.formatDownToFixed$default(xmr, totalFollowerAssets, 0, 2, null));
            SignalDetails signalDetails5 = this.AEQbTJ;
            String avatar = signalDetails5 != null ? signalDetails5.getAvatar() : null;
            if (avatar == null) {
                avatar = "";
            }
            shareData.setAvatar(avatar);
            SignalDetails signalDetails6 = this.AEQbTJ;
            String username = signalDetails6 != null ? signalDetails6.getUsername() : null;
            shareData.setNickName(username != null ? username : "");
            shareData.setTradeTag(C33070mpX.AYXKKw(C55688xof.Application.fruYXx));
            return;
        }
        String totalPnlRatio = this.EZpvd.getTotalPnlRatio();
        if (totalPnlRatio == null) {
            totalPnlRatio = "";
        }
        shareData.setMainDataValue(totalPnlRatio);
        shareData.setAltDataValue(this.EZpvd.getTotalPnl());
        shareData.setBotDataTitle1(C33070mpX.AYXKKw(C55688xof.Application.UPbYzn));
        List<String> instIds = this.EZpvd.getInstIds();
        shareData.setBotDataValue1(instIds != null ? CollectionsKt___CollectionsKt.joinToString$default(instIds, null, null, null, 2, null, new Function1() { // from class: o.xtx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SignalBotShareDataMapper.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        }, 23, null) : null);
        shareData.setBotDataTitle2(C33070mpX.AYXKKw(C55688xof.Application.getSupportedCipherSuites));
        xMR xmr2 = xMR.copydefault;
        String signalCount = this.EZpvd.getSignalCount();
        if (signalCount == null) {
            signalCount = "";
        }
        shareData.setBotDataValue2(xmr2.copydefault(signalCount));
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.OLrzqt()) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.fruYXx);
        }
        shareData.setTradeTag(strAYXKKw);
    }

    public static final CharSequence EZpvd(SignalBotShareDataMapper signalBotShareDataMapper, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56033xvF.getCoinTitle$default(signalBotShareDataMapper.EZpvd.getInstType(), str, false, null, null, 28, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SignalSharePath {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SignalSharePath[] $VALUES;
        public static final SignalSharePath SIGNAL_DETAIL = new SignalSharePath("SIGNAL_DETAIL", 0);
        public static final SignalSharePath BOT_LIST = new SignalSharePath("BOT_LIST", 1);
        public static final SignalSharePath BOT_DETAIL = new SignalSharePath("BOT_DETAIL", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SignalSharePath[] $values() {
            return new SignalSharePath[]{SIGNAL_DETAIL, BOT_LIST, BOT_DETAIL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SignalSharePath> getEntries() {
            return $ENTRIES;
        }

        private SignalSharePath(String str, int i) {
        }

        static {
            SignalSharePath[] signalSharePathArr$values = $values();
            $VALUES = signalSharePathArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(signalSharePathArr$values);
        }

        public static SignalSharePath valueOf(String str) {
            return (SignalSharePath) Enum.valueOf(SignalSharePath.class, str);
        }

        public static SignalSharePath[] values() {
            return (SignalSharePath[]) $VALUES.clone();
        }
    }
}
