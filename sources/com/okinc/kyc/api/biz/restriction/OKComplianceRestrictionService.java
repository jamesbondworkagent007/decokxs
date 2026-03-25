package com.okinc.kyc.api.biz.restriction;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ibm.icu.text.DateFormat;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.p2p.api.OtcRouteConst;
import o.C56444yFp;
import o.InterfaceC43217rlC;
import o.InterfaceC56445yFq;
import o.pHH;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes9.dex */
public interface OKComplianceRestrictionService extends pHH, InterfaceC43217rlC {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Feature {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Feature[] $VALUES;
        private final int code;
        private final String type;
        public static final Feature BASICINFO = new Feature("BASICINFO", 0, -1, "basicInfo");
        public static final Feature SPOT = new Feature("SPOT", 1, 1, "spot");
        public static final Feature MARGIN = new Feature("MARGIN", 2, 2, "margin");
        public static final Feature FUTURE = new Feature("FUTURE", 3, 3, "future");
        public static final Feature PERPETUAL = new Feature("PERPETUAL", 4, 4, "perpetual");
        public static final Feature OPTION = new Feature("OPTION", 5, 5, "option");
        public static final Feature CEFI = new Feature("CEFI", 6, 6, "cefi");
        public static final Feature DEFI = new Feature("DEFI", 7, 7, "web3");
        public static final Feature REGISTER = new Feature("REGISTER", 8, 8, "register");
        public static final Feature FINANCIAL_PRODUCT = new Feature("FINANCIAL_PRODUCT", 9, 9, "financialProduct");
        public static final Feature DEPOSIT = new Feature("DEPOSIT", 10, 10, "deposit");
        public static final Feature P2P = new Feature(CustomMessageData.SERVICE_NAME_P2P, 11, 12, OtcRouteConst.P2P);
        public static final Feature COPY_TRADING = new Feature("COPY_TRADING", 12, 14, "copyTrading");
        public static final Feature TRADING_BOT = new Feature("TRADING_BOT", 13, 15, "tradingBot");
        public static final Feature CONVERT = new Feature("CONVERT", 14, 16, "convert");
        public static final Feature FIAT_PAYMENT = new Feature("FIAT_PAYMENT", 15, 17, "fiatPayment");
        public static final Feature SIMPLE_EARN = new Feature("SIMPLE_EARN", 16, 18, "simpleEarn");
        public static final Feature STRUCTURED_EARN = new Feature("STRUCTURED_EARN", 17, 19, "structuredEarn");
        public static final Feature ON_CHAIN_POS_STAKING = new Feature("ON_CHAIN_POS_STAKING", 18, 20, "onChainPosStaking");
        public static final Feature ON_CHAIN_DEFI = new Feature("ON_CHAIN_DEFI", 19, 21, "onChainDeFi");
        public static final Feature LOAN = new Feature("LOAN", 20, 22, "loan");
        public static final Feature JUMPSTART = new Feature("JUMPSTART", 21, 23, "jumpstart");
        public static final Feature MODE = new Feature("MODE", 22, 24, OtcExtraKeys.MODE);
        public static final Feature LANGUAGE = new Feature("LANGUAGE", 23, 25, "language");
        public static final Feature KYB = new Feature("KYB", 24, 26, "kyb");
        public static final Feature NITRO = new Feature("NITRO", 25, 27, "nitro");
        public static final Feature RFQ = new Feature("RFQ", 26, 28, "rfq");
        public static final Feature WEB3PERPETUAL = new Feature("WEB3PERPETUAL", 27, 29, "web3Perpetual");
        public static final Feature WEB3DEFI = new Feature("WEB3DEFI", 28, 30, "web3Defi");
        public static final Feature WEB3DEX = new Feature("WEB3DEX", 29, 31, "web3Dex");
        public static final Feature WEB3NFT = new Feature("WEB3NFT", 30, 32, "web3Nft");
        public static final Feature WEB3DISCOVER = new Feature("WEB3DISCOVER", 31, 33, "web3Discover");
        public static final Feature REDPACKET = new Feature("REDPACKET", 32, 34, "redPacket");
        public static final Feature REFERRAL = new Feature("REFERRAL", 33, 35, "referral");
        public static final Feature REWARDS = new Feature("REWARDS", 34, 36, "rewards");
        public static final Feature AFFILIATE = new Feature("AFFILIATE", 35, 37, "affiliate");
        public static final Feature BANNER = new Feature("BANNER", 36, 38, "banner");
        public static final Feature SITE = new Feature("SITE", 37, 39, "site");
        public static final Feature REROUTPOPUP = new Feature("REROUTPOPUP", 38, 40, "reroutPopup");
        public static final Feature INTERNALTRANSFER = new Feature("INTERNALTRANSFER", 39, 41, "internalTransfer");
        public static final Feature THIRDPARTY = new Feature("THIRDPARTY", 40, 42, "thirdParty");
        public static final Feature IMCHAT = new Feature("IMCHAT", 41, 43, "imChat");
        public static final Feature ASSET_MULTI_ACCOUNT = new Feature("ASSET_MULTI_ACCOUNT", 42, 44, "assetMultiAccount");
        public static final Feature LOGIN = new Feature("LOGIN", 43, 45, FirebaseAnalytics.Event.LOGIN);
        public static final Feature INSTITUTIONAL = new Feature("INSTITUTIONAL", 44, 48, "institutional");
        public static final Feature WEB3POPUP = new Feature("WEB3POPUP", 45, 49, "web3Popup");
        public static final Feature ONCHAINDUALCURRENCY = new Feature("ONCHAINDUALCURRENCY", 46, 50, "onChainDualCurrency");
        public static final Feature ONCHAINETHSTAKING = new Feature("ONCHAINETHSTAKING", 47, 51, "onChainEthStaking");
        public static final Feature BROKERPROGRAM = new Feature("BROKERPROGRAM", 48, 52, "brokerProgram");
        public static final Feature OPTIONS_COPILOT = new Feature("OPTIONS_COPILOT", 49, 53, "optionsCopilot");
        public static final Feature CR_TRADING_MODE = new Feature("CR_TRADING_MODE", 50, 54, "crTradingMode");
        public static final Feature VIPLOAN = new Feature("VIPLOAN", 51, 55, "vipLoan");
        public static final Feature HOMEPAGEMIDDLEVIDEO = new Feature("HOMEPAGEMIDDLEVIDEO", 52, 56, "homepageMiddleVideo");
        public static final Feature WEB3SPOT = new Feature("WEB3SPOT", 53, 58, "web3Spot");
        public static final Feature HIDE_DERIVATIVES_SURVEY_ENTRY = new Feature("HIDE_DERIVATIVES_SURVEY_ENTRY", 54, 59, "hideDerivativesSurveyEntry");
        public static final Feature EASY_CONVERT = new Feature("EASY_CONVERT", 55, 60, "easyConvert");
        public static final Feature ONE_CLICK_REPAY = new Feature("ONE_CLICK_REPAY", 56, 61, "oneClickRepay");
        public static final Feature NEWUSERBONUS = new Feature("NEWUSERBONUS", 57, 62, "newUserBonus");
        public static final Feature RANDOMREWARD = new Feature("RANDOMREWARD", 58, 63, "randomReward");
        public static final Feature XLAYERBRIDGE = new Feature("XLAYERBRIDGE", 59, 64, "xLayerBridge");
        public static final Feature XLAYERSWAP = new Feature("XLAYERSWAP", 60, 65, "xLayerSwap");
        public static final Feature POR = new Feature("POR", 61, 66, "por");
        public static final Feature oklinkAPI = new Feature("oklinkAPI", 62, 67, "oklinkAPI");
        public static final Feature HIDE_PORTFOLIO_PRICE_CONTENT = new Feature("HIDE_PORTFOLIO_PRICE_CONTENT", 63, 68, "hidePortfolioPriceContent");
        public static final Feature HIDEDISCLAIMER = new Feature("HIDEDISCLAIMER", 64, 69, "hideDisclaimer");
        public static final Feature RISK_BANNER = new Feature("RISK_BANNER", 65, 70, "riskBanner");
        public static final Feature PRIORCONFIRMATION = new Feature("PRIORCONFIRMATION", 66, 71, "priorConfirmation");
        public static final Feature PRICECHANGECONTENT = new Feature("PRICECHANGECONTENT", 67, 72, "priceChangeContent");
        public static final Feature WEBVIEW = new Feature("WEBVIEW", 68, 73, "webView");
        public static final Feature XBOTCHATBOT = new Feature("XBOTCHATBOT", 69, 74, "xbotChatbot");
        public static final Feature BUYCRYPTO = new Feature("BUYCRYPTO", 70, 75, TradeType.BUY_CRYPTO_TRADE_TYPE);
        public static final Feature CAMPAIGN = new Feature("CAMPAIGN", 71, 76, "campaign");
        public static final Feature COPY_TRADING_SPOT = new Feature("COPY_TRADING_SPOT", 72, 77, "copyTradingSpot");
        public static final Feature COPY_TRADING_PERPETUAL = new Feature("COPY_TRADING_PERPETUAL", 73, 78, "copyTradingPerpetual");
        public static final Feature COPY_TRADING_FEEDS = new Feature("COPY_TRADING_FEEDS", 74, 79, "copyTradingFeeds");
        public static final Feature PRE_MARKET = new Feature("PRE_MARKET", 75, 80, "preMarket");
        public static final Feature CR_TRADING_PAGE = new Feature("CR_TRADING_PAGE", 76, 81, "crTradingPage");
        public static final Feature IM_HOMEPAGE = new Feature("IM_HOMEPAGE", 77, 82, "imHomepage");
        public static final Feature DISCOVER_TAB = new Feature("DISCOVER_TAB", 78, 85, "discoverTab");
        public static final Feature TRADING_BUTTON = new Feature("TRADING_BUTTON", 79, 86, "tradingButton");
        public static final Feature SLICING_BOT = new Feature("SLICING_BOT", 80, 87, "slicingBot");
        public static final Feature AI_BOT = new Feature("AI_BOT", 81, 88, "aiBot");
        public static final Feature COMMUNITY = new Feature("COMMUNITY", 82, 89, "community");
        public static final Feature JAILBREAK_POPUP = new Feature("JAILBREAK_POPUP", 83, 90, "jailbreakPopUp");
        public static final Feature TRADING_BOT_PRO_LANDING = new Feature("TRADING_BOT_PRO_LANDING", 84, 91, "tradingBotProLanding");
        public static final Feature SMART_ACCOUNT = new Feature("SMART_ACCOUNT", 85, 92, "smartAccount");
        public static final Feature CHASE_ORDER = new Feature("CHASE_ORDER", 86, 93, "chaseOrder");
        public static final Feature SIMPLE_NEWS = new Feature("SIMPLE_NEWS", 87, 94, "simpleNews");
        public static final Feature CEFI_DEX = new Feature("CEFI_DEX", 88, 95, "cefiDex");
        public static final Feature REBATE_CARD = new Feature("REBATE_CARD", 89, 96, "rebateCard");
        public static final Feature CR_TWITTER = new Feature("CR_TWITTER", 90, 100, "crTwitter");
        public static final Feature SMART_PICKS = new Feature("SMART_PICKS", 91, 101, "smartPicks");
        public static final Feature CEFI_TASK = new Feature("CEFI_TASK", 92, 103, "cefiTask");
        public static final Feature DEX_AFFILIATE = new Feature("DEX_AFFILIATE", 93, 104, "dexAffiliate");
        public static final Feature PRE_TRANSACTION_DISCLOSURE = new Feature("PRE_TRANSACTION_DISCLOSURE", 94, 105, "preTransactionDisclosure");
        public static final Feature CALL_AUCTION = new Feature("CALL_AUCTION", 95, 106, "callAuction");
        public static final Feature DEX_TRADING = new Feature("DEX_TRADING", 96, 107, "dexTrading");
        public static final Feature DEX_MARKET = new Feature("DEX_MARKET", 97, 108, "dexMarket");
        public static final Feature DISCOVER_REVAMP = new Feature("DISCOVER_REVAMP", 98, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, "discoverRevamp");
        public static final Feature EASY_CONNECT = new Feature("EASY_CONNECT", 99, WalletImportError.ERROR_CODE_AA_EXIST, "easyConnect");
        public static final Feature MERCHANT_COUPON = new Feature("MERCHANT_COUPON", 100, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, "merchantCoupon");
        public static final Feature PAY_WITH = new Feature("PAY_WITH", 101, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, "payWith");
        public static final Feature NUB_PHASE = new Feature("NUB_PHASE", 102, 117, "nubPhase");
        public static final Feature BTC_YIELD = new Feature("BTC_YIELD", 103, 118, "btcYield");
        public static final Feature OKX_CARD = new Feature("OKX_CARD", 104, 120, "okxCard");
        public static final Feature WEB3_MODULE_ENTRY = new Feature("WEB3_MODULE_ENTRY", 105, 122, "web3ModuleEntry");
        public static final Feature OKX_BUILDER = new Feature("OKX_BUILDER", 106, 123, "okxBuilder");
        public static final Feature AUTO_EARN = new Feature("AUTO_EARN", 107, 124, "autoEarn");
        public static final Feature IM_PAID = new Feature("IM_PAID", 108, WebSocketProtocol.PAYLOAD_SHORT, "imPaid");
        public static final Feature VIP_PROGRAM = new Feature("VIP_PROGRAM", 109, 127, "vipProgram");
        public static final Feature NEW_ONSHORE_IA = new Feature("NEW_ONSHORE_IA", WalletImportError.ERROR_CODE_AA_CREATE_KEY, 128, "newOnshoreIA");
        public static final Feature VIP_DUAL_INVESTMENT = new Feature("VIP_DUAL_INVESTMENT", WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, 129, "vipDualinvestment");
        public static final Feature VIP_BTC_YIELD = new Feature("VIP_BTC_YIELD", WalletImportError.ERROR_CODE_AA_EXIST, 130, "vipBTCyield");
        public static final Feature VIP_TRIAL = new Feature("VIP_TRIAL", WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, DateFormat.RELATIVE_SHORT, "vipTrial");
        public static final Feature VIP_AUTO_EARN = new Feature("VIP_AUTO_EARN", 114, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, "vipAutoearn");
        public static final Feature CE_DEFI = new Feature("CE_DEFI", 115, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, "ceDefi");
        public static final Feature VIDEO_MESSAGE = new Feature("VIDEO_MESSAGE", AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 134, "videoMessage");
        public static final Feature IMAGE_MESSAGE = new Feature("IMAGE_MESSAGE", 117, 135, "imageMessage");
        public static final Feature VOICE_MESSAGE = new Feature("VOICE_MESSAGE", 118, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, "voiceMessage");
        public static final Feature CR_FEED_PUBLISHER = new Feature("CR_FEED_PUBLISHER", 119, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, "crFeedPublisher");
        public static final Feature PAY_C2B = new Feature("PAY_C2B", 120, 138, "payC2b");
        public static final Feature PAY_YIELD = new Feature("PAY_YIELD", 121, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, "payYield");
        public static final Feature BOTS_LANDING_PAGE = new Feature("BOTS_LANDING_PAGE", 122, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, "botsLandingPage");
        public static final Feature PM_TRADING_ACCOUNT = new Feature("PM_TRADING_ACCOUNT", 123, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, "pmTradingAccount");
        public static final Feature DISCLAIMER = new Feature("DISCLAIMER", 124, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, "disclaimer");
        public static final Feature BOT_SIMPLE_EARN = new Feature("BOT_SIMPLE_EARN", 125, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, "botSimpleEarn");
        public static final Feature PAY_TRAVEL = new Feature("PAY_TRAVEL", WebSocketProtocol.PAYLOAD_SHORT, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, "payTravel");
        public static final Feature DEFI_LENDING = new Feature("DEFI_LENDING", 127, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, "defiLending");
        public static final Feature TRADE_BACK_VOUCHER = new Feature("TRADE_BACK_VOUCHER", 128, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, "tradeBackVoucher");
        public static final Feature DEMO_TRADING = new Feature("DEMO_TRADING", 129, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, "demoTrading");
        public static final Feature X_DROPS_CLUB = new Feature("X_DROPS_CLUB", 130, 150, "xDropsClub");
        public static final Feature QUICK_WITHDRAW = new Feature("QUICK_WITHDRAW", DateFormat.RELATIVE_SHORT, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA, "quickWithdraw");
        public static final Feature OTC_AGENT = new Feature("OTC_AGENT", CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, "otcAgent");
        public static final Feature RECOMMENDED_PORTFOLIO = new Feature("RECOMMENDED_PORTFOLIO", CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA, "recommendedPortfolio");
        public static final Feature LIVE_STREAMING = new Feature("LIVE_STREAMING", 134, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, "liveStreaming");
        public static final Feature WEB3_USDG_AUTO_EARN = new Feature("WEB3_USDG_AUTO_EARN", 135, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, "web3UsdgAutoEarn");
        public static final Feature SIMPLE_PAY = new Feature("SIMPLE_PAY", CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, "simplePay");
        public static final Feature VIP_SERVICE_GROUP = new Feature("VIP_SERVICE_GROUP", CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, "vipServiceGroup");
        public static final Feature BUIDL_REWARDS = new Feature("BUIDL_REWARDS", 138, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, "buidlRewards");
        public static final Feature DEPOSIT_MATCH = new Feature("DEPOSIT_MATCH", CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, "depositMatch");
        public static final Feature VIP_REFERRAL = new Feature("VIP_REFERRAL", CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, "vipReferral");
        public static final Feature VIP_RM = new Feature("VIP_RM", CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, "vipRM");
        public static final Feature VIP_PARTNER_PRIVILEGES = new Feature("VIP_PARTNER_PRIVILEGES", CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, "vipPartnerPrivileges");
        public static final Feature SENTIMENT_SUMMARY = new Feature("SENTIMENT_SUMMARY", CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, "sentimentSummary");
        public static final Feature US_STOCK_PERP = new Feature("US_STOCK_PERP", CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, "usStockPerp");
        public static final Feature HOLD_CENTER = new Feature("HOLD_CENTER", CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, "holdCenter");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Feature[] $values() {
            return new Feature[]{BASICINFO, SPOT, MARGIN, FUTURE, PERPETUAL, OPTION, CEFI, DEFI, REGISTER, FINANCIAL_PRODUCT, DEPOSIT, P2P, COPY_TRADING, TRADING_BOT, CONVERT, FIAT_PAYMENT, SIMPLE_EARN, STRUCTURED_EARN, ON_CHAIN_POS_STAKING, ON_CHAIN_DEFI, LOAN, JUMPSTART, MODE, LANGUAGE, KYB, NITRO, RFQ, WEB3PERPETUAL, WEB3DEFI, WEB3DEX, WEB3NFT, WEB3DISCOVER, REDPACKET, REFERRAL, REWARDS, AFFILIATE, BANNER, SITE, REROUTPOPUP, INTERNALTRANSFER, THIRDPARTY, IMCHAT, ASSET_MULTI_ACCOUNT, LOGIN, INSTITUTIONAL, WEB3POPUP, ONCHAINDUALCURRENCY, ONCHAINETHSTAKING, BROKERPROGRAM, OPTIONS_COPILOT, CR_TRADING_MODE, VIPLOAN, HOMEPAGEMIDDLEVIDEO, WEB3SPOT, HIDE_DERIVATIVES_SURVEY_ENTRY, EASY_CONVERT, ONE_CLICK_REPAY, NEWUSERBONUS, RANDOMREWARD, XLAYERBRIDGE, XLAYERSWAP, POR, oklinkAPI, HIDE_PORTFOLIO_PRICE_CONTENT, HIDEDISCLAIMER, RISK_BANNER, PRIORCONFIRMATION, PRICECHANGECONTENT, WEBVIEW, XBOTCHATBOT, BUYCRYPTO, CAMPAIGN, COPY_TRADING_SPOT, COPY_TRADING_PERPETUAL, COPY_TRADING_FEEDS, PRE_MARKET, CR_TRADING_PAGE, IM_HOMEPAGE, DISCOVER_TAB, TRADING_BUTTON, SLICING_BOT, AI_BOT, COMMUNITY, JAILBREAK_POPUP, TRADING_BOT_PRO_LANDING, SMART_ACCOUNT, CHASE_ORDER, SIMPLE_NEWS, CEFI_DEX, REBATE_CARD, CR_TWITTER, SMART_PICKS, CEFI_TASK, DEX_AFFILIATE, PRE_TRANSACTION_DISCLOSURE, CALL_AUCTION, DEX_TRADING, DEX_MARKET, DISCOVER_REVAMP, EASY_CONNECT, MERCHANT_COUPON, PAY_WITH, NUB_PHASE, BTC_YIELD, OKX_CARD, WEB3_MODULE_ENTRY, OKX_BUILDER, AUTO_EARN, IM_PAID, VIP_PROGRAM, NEW_ONSHORE_IA, VIP_DUAL_INVESTMENT, VIP_BTC_YIELD, VIP_TRIAL, VIP_AUTO_EARN, CE_DEFI, VIDEO_MESSAGE, IMAGE_MESSAGE, VOICE_MESSAGE, CR_FEED_PUBLISHER, PAY_C2B, PAY_YIELD, BOTS_LANDING_PAGE, PM_TRADING_ACCOUNT, DISCLAIMER, BOT_SIMPLE_EARN, PAY_TRAVEL, DEFI_LENDING, TRADE_BACK_VOUCHER, DEMO_TRADING, X_DROPS_CLUB, QUICK_WITHDRAW, OTC_AGENT, RECOMMENDED_PORTFOLIO, LIVE_STREAMING, WEB3_USDG_AUTO_EARN, SIMPLE_PAY, VIP_SERVICE_GROUP, BUIDL_REWARDS, DEPOSIT_MATCH, VIP_REFERRAL, VIP_RM, VIP_PARTNER_PRIVILEGES, SENTIMENT_SUMMARY, US_STOCK_PERP, HOLD_CENTER};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Feature> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        private Feature(String str, int i, int i2, String str2) {
            this.code = i2;
            this.type = str2;
        }

        static {
            Feature[] featureArr$values = $values();
            $VALUES = featureArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(featureArr$values);
        }

        public static Feature valueOf(String str) {
            return (Feature) Enum.valueOf(Feature.class, str);
        }

        public static Feature[] values() {
            return (Feature[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FeatureAction {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ FeatureAction[] $VALUES;
        public static final FeatureAction QUESTION = new FeatureAction("QUESTION", 0);
        public static final FeatureAction UK_QUESTION = new FeatureAction("UK_QUESTION", 1);
        public static final FeatureAction NO_FEATURE = new FeatureAction("NO_FEATURE", 2);
        public static final FeatureAction REDIRECT_OKX_WALLET = new FeatureAction("REDIRECT_OKX_WALLET", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ FeatureAction[] $values() {
            return new FeatureAction[]{QUESTION, UK_QUESTION, NO_FEATURE, REDIRECT_OKX_WALLET};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<FeatureAction> getEntries() {
            return $ENTRIES;
        }

        private FeatureAction(String str, int i) {
        }

        static {
            FeatureAction[] featureActionArr$values = $values();
            $VALUES = featureActionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(featureActionArr$values);
        }

        public static FeatureAction valueOf(String str) {
            return (FeatureAction) Enum.valueOf(FeatureAction.class, str);
        }

        public static FeatureAction[] values() {
            return (FeatureAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class UserEvent {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ UserEvent[] $VALUES;
        public static final UserEvent Login = new UserEvent("Login", 0);
        public static final UserEvent Logout = new UserEvent("Logout", 1);
        public static final UserEvent Switched = new UserEvent("Switched", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ UserEvent[] $values() {
            return new UserEvent[]{Login, Logout, Switched};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<UserEvent> getEntries() {
            return $ENTRIES;
        }

        private UserEvent(String str, int i) {
        }

        static {
            UserEvent[] userEventArr$values = $values();
            $VALUES = userEventArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(userEventArr$values);
        }

        public static UserEvent valueOf(String str) {
            return (UserEvent) Enum.valueOf(UserEvent.class, str);
        }

        public static UserEvent[] values() {
            return (UserEvent[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CefiMode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CefiMode[] $VALUES;
        public static final CefiMode LITE = new CefiMode("LITE", 0, "lite");
        public static final CefiMode PRO = new CefiMode("PRO", 1, "pro");
        private final String modeName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CefiMode[] $values() {
            return new CefiMode[]{LITE, PRO};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CefiMode> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getModeName() {
            return this.modeName;
        }

        private CefiMode(String str, int i, String str2) {
            this.modeName = str2;
        }

        static {
            CefiMode[] cefiModeArr$values = $values();
            $VALUES = cefiModeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(cefiModeArr$values);
        }

        public static CefiMode valueOf(String str) {
            return (CefiMode) Enum.valueOf(CefiMode.class, str);
        }

        public static CefiMode[] values() {
            return (CefiMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AppMode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AppMode[] $VALUES;
        public static final AppMode CEFI = new AppMode("CEFI", 0, "cefi");
        public static final AppMode WEB3 = new AppMode("WEB3", 1, "web3");
        private final String modeName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AppMode[] $values() {
            return new AppMode[]{CEFI, WEB3};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AppMode> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getModeName() {
            return this.modeName;
        }

        private AppMode(String str, int i, String str2) {
            this.modeName = str2;
        }

        static {
            AppMode[] appModeArr$values = $values();
            $VALUES = appModeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(appModeArr$values);
        }

        public static AppMode valueOf(String str) {
            return (AppMode) Enum.valueOf(AppMode.class, str);
        }

        public static AppMode[] values() {
            return (AppMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        private final String modeName;
        public static final Mode CefiMode = new Mode("CefiMode", 0, "CefiMode");
        public static final Mode AppMode = new Mode("AppMode", 1, "AppMode");
        public static final Mode CrTradingModes = new Mode("CrTradingModes", 2, "crTradingModes");
        public static final Mode CrTradingPage = new Mode("CrTradingPage", 3, "crTradingPage");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{CefiMode, AppMode, CrTradingModes, CrTradingPage};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Mode> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getModeName() {
            return this.modeName;
        }

        private Mode(String str, int i, String str2) {
            this.modeName = str2;
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(modeArr$values);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }
}
