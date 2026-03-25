package o;

import com.okinc.okimcore.model.im.BaseOKPayMessage;
import com.okinc.okimcore.model.im.OKCanceledPayMessage;
import com.okinc.okimcore.model.im.OKContractAddressMessage;
import com.okinc.okimcore.model.im.OKDeclinedPayMessage;
import com.okinc.okimcore.model.im.OKExpiredPayMessage;
import com.okinc.okimcore.model.im.OKFailedAcceptPayMessage;
import com.okinc.okimcore.model.im.OKFailedCancelPayMessage;
import com.okinc.okimcore.model.im.OKFullyClaimedRedPacketMessage;
import com.okinc.okimcore.model.im.OKGroupVoiceCallMessage;
import com.okinc.okimcore.model.im.OKLiveModeratorInvitationMessage;
import com.okinc.okimcore.model.im.OKOpenFailedRedPacketMessage;
import com.okinc.okimcore.model.im.OKOpenedRedPacketMessage;
import com.okinc.okimcore.model.im.OKPayMessage;
import com.okinc.okimcore.model.im.OKReceiverOpenedRedPacketMessage;
import com.okinc.okimcore.model.im.OKRedPacketMessage;
import com.okinc.okimcore.model.im.OKTradingDaysPriorCompetitionMessage;
import com.okinc.okimcore.model.im.OKTradingEndCompetitionMessage;
import com.okinc.okimcore.model.im.OKTradingRankingChangeLeaderboardMessage;
import com.okinc.okimcore.model.im.OKTradingStartCompetitionMessage;
import com.okinc.okimcore.model.im.OKVipAccessMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import kotlin.Result;
import kotlin.Unit;

/* JADX INFO: renamed from: o.nub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35398nub {
    public static final C35398nub EZpvd = new C35398nub();

    private C35398nub() {
    }

    public final void KWHzl() {
        djBIcL();
        gEmmrt();
        AhwBna();
        valueOf();
        AYXKKw();
        EZpvd();
        AEQbTJ();
        OLrzqt();
        copydefault();
    }

    public final void EZpvd() {
        java.lang.Object objM7377constructorimpl;
        Unit unit;
        try {
            Result.Application application = Result.Companion;
            sKH skhFARcdN = sDZ.AEQbTJ.fARcdN();
            java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC35178nqS.class);
            if (listKWHzl != null) {
                java.util.Iterator it = listKWHzl.iterator();
                while (it.hasNext()) {
                    for (C35244nrf c35244nrf : ((InterfaceC35178nqS) it.next()).copydefault()) {
                        pUU.KWHzl("IMCustomMessageConverterRegisterUtil", "register converter from extension, serviceName=" + c35244nrf.EZpvd() + ", bizName:" + c35244nrf.AEQbTJ() + " converter:" + c35244nrf.KWHzl().getCanonicalName());
                        java.util.List<java.lang.String> listAEQbTJ = c35244nrf.AEQbTJ();
                        if (listAEQbTJ != null) {
                            skhFARcdN.KWHzl(c35244nrf.EZpvd(), listAEQbTJ, c35244nrf.KWHzl());
                        }
                    }
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("IMCustomMessageConverterRegisterUtil", "initCustomMessageConvertersFromExtension exception: " + thM7380exceptionOrNullimpl);
        }
    }

    public final void OLrzqt() {
        java.lang.Object objM7377constructorimpl;
        Unit unit;
        try {
            Result.Application application = Result.Companion;
            sKH skhFARcdN = sDZ.AEQbTJ.fARcdN();
            java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC35178nqS.class);
            if (listKWHzl != null) {
                java.util.Iterator it = listKWHzl.iterator();
                while (it.hasNext()) {
                    for (C35244nrf c35244nrf : ((InterfaceC35178nqS) it.next()).OLrzqt()) {
                        pUU.KWHzl("IMCustomMessageConverterRegisterUtil", "register default converter from extension, serviceName=" + c35244nrf.EZpvd() + ", bizName:" + c35244nrf.AEQbTJ() + " converter:" + c35244nrf.KWHzl().getCanonicalName());
                        skhFARcdN.KWHzl(c35244nrf.EZpvd(), c35244nrf.KWHzl());
                    }
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl("IMCustomMessageConverterRegisterUtil", "initDefaultCustomMessageFromExtension exception: " + thM7380exceptionOrNullimpl);
        }
    }

    public final void gEmmrt() {
        sDZ.AEQbTJ.fARcdN().KWHzl(CustomMessageData.SERVICE_NAME_LIVE_STREAM, C56402yEa.EZpvd(CustomMessageData.BIZ_NAME_MODERATOR_INVITATION), OKLiveModeratorInvitationMessage.class);
    }

    public final void djBIcL() {
        sDZ.AEQbTJ.fARcdN().KWHzl(CustomMessageData.SERVICE_NAME_GROUP_VOICE_CALL, yDY.gEmmrt(OKGroupVoiceCallMessage.BIZ_NAME_AGORA_CALL_ONGOING, OKGroupVoiceCallMessage.BIZ_NAME_AGORA_CALL_END), OKGroupVoiceCallMessage.class);
    }

    public final void AhwBna() {
        sKH skhFARcdN = sDZ.AEQbTJ.fARcdN();
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_CRYPTO_GIFT, yDY.gEmmrt(OKRedPacketMessage.BIZ_NAME_CRYPTO_GIFT_PROCESSING, OKRedPacketMessage.BIZ_NAME_CRYPTO_GIFT_SEND_SUCCESS, OKRedPacketMessage.BIZ_NAME_CRYPTO_GIFT_SEND_FAILED, OKRedPacketMessage.BIZ_NAME_CRYPTO_GIFT_OPEN_PROCESSING, OKRedPacketMessage.BIZ_NAME_CRYPTO_GIFT_EXPIRED, OKRedPacketMessage.BIZ_NAME_CRYPTO_GIFT_FULLY_CLAIMED), OKRedPacketMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_CRYPTO_GIFT, C56402yEa.EZpvd(OKRedPacketMessage.BIZ_NAME_CRYPTO_GIFT_OPENED), OKOpenedRedPacketMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_CRYPTO_GIFT, C56402yEa.EZpvd(OKRedPacketMessage.BIZ_NAME_CRYPTO_GIFT_OPEN_FAILED), OKOpenFailedRedPacketMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_CRYPTO_GIFT, C56402yEa.EZpvd(OKRedPacketMessage.BIZ_NAME_CRYPTO_GIFT_FULLY_CLAIMED_SYSTEM), OKFullyClaimedRedPacketMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_CRYPTO_GIFT, C56402yEa.EZpvd(OKRedPacketMessage.BIZ_NAME_CRYPTO_GIFT_RECEIVER_OPENED), OKReceiverOpenedRedPacketMessage.class);
    }

    public final void valueOf() {
        sKH skhFARcdN = sDZ.AEQbTJ.fARcdN();
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_CAMPAIGN, C56402yEa.EZpvd("TRADING_COMPETITION_START"), OKTradingStartCompetitionMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_CAMPAIGN, C56402yEa.EZpvd("TRADING_COMPETITION_END"), OKTradingEndCompetitionMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_CAMPAIGN, C56402yEa.EZpvd("TRADING_COMPETITION_DAYS_PRIOR_TO_END"), OKTradingDaysPriorCompetitionMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_CAMPAIGN, C56402yEa.EZpvd("TRADING_COMPETITION_RANKING_CHANGE"), OKTradingRankingChangeLeaderboardMessage.class);
    }

    public final void AEQbTJ() {
        sDZ.AEQbTJ.fARcdN().KWHzl(CustomMessageData.SERVICE_NAME_CONTRACT_ADDRESS, C56402yEa.EZpvd("ContractAddress"), OKContractAddressMessage.class);
    }

    public final void AYXKKw() {
        sKH skhFARcdN = sDZ.AEQbTJ.fARcdN();
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_ONE_TO_ONE_PAYMENT, yDY.gEmmrt(BaseOKPayMessage.BIZ_NAME_ONE_TO_ONE_PAYMENT_PROCESSING, BaseOKPayMessage.BIZ_NAME_ONE_TO_ONE_PAYMENT_SENT, BaseOKPayMessage.BIZ_NAME_ONE_TO_ONE_PAYMENT_FAILED, BaseOKPayMessage.BIZ_NAME_ONE_TO_ONE_PAYMENT_ACCEPTED, BaseOKPayMessage.BIZ_NAME_ONE_TO_ONE_PAYMENT_ACCEPT_PROCESSING), OKPayMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_ONE_TO_ONE_PAYMENT, C56402yEa.EZpvd(BaseOKPayMessage.BIZ_NAME_ONE_TO_ONE_PAYMENT_CANCELLED), OKCanceledPayMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_ONE_TO_ONE_PAYMENT, C56402yEa.EZpvd(BaseOKPayMessage.BIZ_NAME_ONE_TO_ONE_PAYMENT_CANCEL_FAILED), OKFailedCancelPayMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_ONE_TO_ONE_PAYMENT, C56402yEa.EZpvd(BaseOKPayMessage.BIZ_NAME_ONE_TO_ONE_PAYMENT_EXPIRED), OKExpiredPayMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_ONE_TO_ONE_PAYMENT, C56402yEa.EZpvd(BaseOKPayMessage.BIZ_NAME_ONE_TO_ONE_PAYMENT_FAILED_TO_ACCEPT), OKFailedAcceptPayMessage.class);
        skhFARcdN.KWHzl(CustomMessageData.SERVICE_NAME_ONE_TO_ONE_PAYMENT, C56402yEa.EZpvd(BaseOKPayMessage.BIZ_NAME_ONE_TO_ONE_PAYMENT_DECLINED), OKDeclinedPayMessage.class);
    }

    public final void copydefault() {
        sDZ.AEQbTJ.fARcdN().KWHzl(CustomMessageData.SERVICE_NAME_VIP_ACCESS, yDY.gEmmrt("VipGainAccess", "VipLostAccess"), OKVipAccessMessage.class);
    }
}
