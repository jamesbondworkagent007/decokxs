package o;

import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.reown.android.pulse.model.ConnectionMethod;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wYG {
    public static final java.util.Map<java.lang.String, java.lang.Integer> EZpvd = C56424yEw.gEmmrt(C56390yDp.OLrzqt("aa_wallet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OLrzqt)), C56390yDp.OLrzqt("accounts_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gEmmrt)), C56390yDp.OLrzqt("add_assets", java.lang.Integer.valueOf(C52761wXj.TaskDescription.AYXKKw)), C56390yDp.OLrzqt("add_to_watchlist", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DbNXlk)), C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, java.lang.Integer.valueOf(C52761wXj.TaskDescription.AkhnZx)), C56390yDp.OLrzqt("adjust_margin_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.values)), C56390yDp.OLrzqt("adjust_margin_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fetchVPNInfo)), C56390yDp.OLrzqt("advanced_selection", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fJNWhG)), C56390yDp.OLrzqt("aed_fiat", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fARcdN)), C56390yDp.OLrzqt("affiliate", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ejfBZ)), C56390yDp.OLrzqt("ai_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getNewProxyInstance)), C56390yDp.OLrzqt("ai_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hDKMBd)), C56390yDp.OLrzqt("airdrop_zone", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iwGUEr)), C56390yDp.OLrzqt("airdrop_zone_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.uzCIH)), C56390yDp.OLrzqt("android", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zLjUOn)), C56390yDp.OLrzqt(EopTrackEvent.ANGLE, java.lang.Integer.valueOf(C52761wXj.TaskDescription.AubY)), C56390yDp.OLrzqt("anti_phishing", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zsXlph)), C56390yDp.OLrzqt("api_keys", java.lang.Integer.valueOf(C52761wXj.TaskDescription.AwvSrB)), C56390yDp.OLrzqt("arbitrage_order", java.lang.Integer.valueOf(C52761wXj.TaskDescription.AxsJAY)), C56390yDp.OLrzqt("arrow", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zuBGHE)), C56390yDp.OLrzqt("assets", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QOLQEE)), C56390yDp.OLrzqt("assets_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OcIXYQ)), C56390yDp.OLrzqt("authorization", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QVAiDq)), C56390yDp.OLrzqt("auto_earn", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QbewEr)), C56390yDp.OLrzqt("bank", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RTWSvT)), C56390yDp.OLrzqt("blockchain_explorer", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gasjUx)), C56390yDp.OLrzqt("book_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iRxXKY)), C56390yDp.OLrzqt("book_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.AxsJAYaxsJAY)), C56390yDp.OLrzqt("bot_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gkJEwt)), C56390yDp.OLrzqt(TabTitleInfo.KEY_BRIDGE, java.lang.Integer.valueOf(C52761wXj.TaskDescription.iZzfmt)), C56390yDp.OLrzqt("bridge_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iZzfmt)), C56390yDp.OLrzqt("brl_fiat", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RlQdEF)), C56390yDp.OLrzqt("broadcast", java.lang.Integer.valueOf(C52761wXj.TaskDescription.AxsJAYsNCnLh)), C56390yDp.OLrzqt("broadcast_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DAIeex)), C56390yDp.OLrzqt("browse_history", java.lang.Integer.valueOf(C52761wXj.TaskDescription.accept)), C56390yDp.OLrzqt("browser_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialROgMPW)), C56390yDp.OLrzqt("browser_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QKudOq)), C56390yDp.OLrzqt("brush", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ODWQjV)), C56390yDp.OLrzqt("btc_yield_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DCJXGO)), C56390yDp.OLrzqt("btc_yield_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DXXBbs)), C56390yDp.OLrzqt("bulb", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ffGIBT)), C56390yDp.OLrzqt("bundler_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zuWLRA)), C56390yDp.OLrzqt("bundler_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OuxcSI)), C56390yDp.OLrzqt("buy_crypto", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getPostValueLengthLimit)), C56390yDp.OLrzqt("calculator", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DCUTEI)), C56390yDp.OLrzqt("candle_chart_indicator", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OHqIaq)), C56390yDp.OLrzqt("candle_spacing", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DLWbHP)), C56390yDp.OLrzqt("candle_stick_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ODXsMY)), C56390yDp.OLrzqt("cash_deposit", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UlJrfe)), C56390yDp.OLrzqt("cash_fiat", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QwvEab)), C56390yDp.OLrzqt("cash_fiat_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aUsmxb)), C56390yDp.OLrzqt("cash_withdrawal", java.lang.Integer.valueOf(C52761wXj.TaskDescription.igXuih)), C56390yDp.OLrzqt("chart_settings", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fdOvFl)), C56390yDp.OLrzqt("chatbot", java.lang.Integer.valueOf(C52761wXj.TaskDescription.htlTjW)), C56390yDp.OLrzqt("checkmark_circle", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ixgjPv)), C56390yDp.OLrzqt("chef_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.WS)), C56390yDp.OLrzqt("chef_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.run)), C56390yDp.OLrzqt("claim", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RVsVBY)), C56390yDp.OLrzqt("claim_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QDqgQU)), C56390yDp.OLrzqt("cloud", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aJFbMH)), C56390yDp.OLrzqt("compare", java.lang.Integer.valueOf(C52761wXj.TaskDescription.apNbdB)), C56390yDp.OLrzqt("compliance", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fXHmeK)), C56390yDp.OLrzqt("computer_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dLBcXg)), C56390yDp.OLrzqt("computer_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fLIjIY)), C56390yDp.OLrzqt("confirm_currency_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gmHjFq)), C56390yDp.OLrzqt("confirm_currency_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gUEfcq)), C56390yDp.OLrzqt("continue_drawing", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gSBher)), C56390yDp.OLrzqt("contract_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hlkKmr)), C56390yDp.OLrzqt("contract_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hvKCwS)), C56390yDp.OLrzqt("convert", java.lang.Integer.valueOf(C52761wXj.TaskDescription.swzYdv)), C56390yDp.OLrzqt("convert_okb", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iPSTqm)), C56390yDp.OLrzqt("convert_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sVXHln)), C56390yDp.OLrzqt("cooling_off_period", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sTzBva)), C56390yDp.OLrzqt("copiers", java.lang.Integer.valueOf(C52761wXj.TaskDescription.vLaW)), C56390yDp.OLrzqt("copiers_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zDUObI)), C56390yDp.OLrzqt("copy_trading", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zlvcHA)), C56390yDp.OLrzqt("copy_trading_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zOIQXb)), C56390yDp.OLrzqt(FirebaseAnalytics.Param.COUPON, java.lang.Integer.valueOf(C52761wXj.TaskDescription.zqTOFw)), C56390yDp.OLrzqt("create_draft_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zYHWMc)), C56390yDp.OLrzqt("create_draft_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zhUgOk)), C56390yDp.OLrzqt("crown", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getLabel)), C56390yDp.OLrzqt("crown_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DGUQLIDGUQLI)), C56390yDp.OLrzqt("crypto_gift", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DTg)), C56390yDp.OLrzqt("crypto_gift_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getPriority)), C56390yDp.OLrzqt("cryptoverse_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zSsVtY)), C56390yDp.OLrzqt("custom_formula", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fBE)), C56390yDp.OLrzqt("dash_line", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DGUQLIekVPG)), C56390yDp.OLrzqt("demo_trading", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DGUQLIdZmdUa)), C56390yDp.OLrzqt("deposit", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DSiOMJ)), C56390yDp.OLrzqt("desktop_key", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DIIpTV)), C56390yDp.OLrzqt("dev_sell_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DUUtXg)), C56390yDp.OLrzqt("diamond_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.frkDMe)), C56390yDp.OLrzqt("diamond_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.awiJhF)), C56390yDp.OLrzqt("dip_sniper", java.lang.Integer.valueOf(C52761wXj.TaskDescription.YqksP)), C56390yDp.OLrzqt("discord", java.lang.Integer.valueOf(C52761wXj.TaskDescription.cBPFI)), C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_DISCOVER, java.lang.Integer.valueOf(C52761wXj.TaskDescription.hrjNmC)), C56390yDp.OLrzqt("discover_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gtdfxv)), C56390yDp.OLrzqt("dollar_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iKEqwx)), C56390yDp.OLrzqt("dollar_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fGQ)), C56390yDp.OLrzqt("dollar_symbol", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DPHNDa)), C56390yDp.OLrzqt("dollar_symbol_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aJZHYI)), C56390yDp.OLrzqt("drops_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iwGUEr)), C56390yDp.OLrzqt("dual_investment", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Swccd)), C56390yDp.OLrzqt("earn_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.geLlBI)), C56390yDp.OLrzqt("earn_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RvdRAu)), C56390yDp.OLrzqt("easy_convert", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DQYQgr)), C56390yDp.OLrzqt("ecohub_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DQzvGN)), C56390yDp.OLrzqt("economic_calendar", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ihnvzI)), C56390yDp.OLrzqt("emphasis_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.isReflectionWorking)), C56390yDp.OLrzqt("emphasis_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fXYAwm)), C56390yDp.OLrzqt("escape_entry_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DQzvGNdrmXxudrmXxu)), C56390yDp.OLrzqt("eth20", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RSDDiY)), C56390yDp.OLrzqt("eth_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RkASWs)), C56390yDp.OLrzqt("euro_fiat", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RbVjfb)), C56390yDp.OLrzqt("exchange", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RTWSvT)), C56390yDp.OLrzqt("exchange_rate", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RzdrRQ)), C56390yDp.OLrzqt("exchange_tab", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RqmePg)), C56390yDp.OLrzqt("exchange_tab_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RqmePg)), C56390yDp.OLrzqt("exchange_vertical_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ggKfIT)), C56390yDp.OLrzqt("exchanges_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UccSpe)), C56390yDp.OLrzqt("expand_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialDPHOMC)), C56390yDp.OLrzqt("explore_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialROgMPW)), C56390yDp.OLrzqt("explore_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialaVhqwO)), C56390yDp.OLrzqt("express_buy", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialaGOrKO)), C56390yDp.OLrzqt("expression_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialRuDPQV)), C56390yDp.OLrzqt("extension_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialhOMIpD)), C56390yDp.OLrzqt("extension_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialatDTRm)), C56390yDp.OLrzqt("facebook", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialsiEkQe)), C56390yDp.OLrzqt("feather_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ROgMPW)), C56390yDp.OLrzqt("feather_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aCSzUz)), C56390yDp.OLrzqt("fee_rule", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aGOrKO)), C56390yDp.OLrzqt("feed", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RuDPQV)), C56390yDp.OLrzqt("fiat_deposit", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fGQ)), C56390yDp.OLrzqt("fibonacci_retracements", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Rtjmuc)), C56390yDp.OLrzqt("fill_colour", java.lang.Integer.valueOf(C52761wXj.TaskDescription.YFmri)), C56390yDp.OLrzqt("fire_flame_12", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dzkkkq)), C56390yDp.OLrzqt("fire_flame_16", java.lang.Integer.valueOf(C52761wXj.TaskDescription.deregisterUser)), C56390yDp.OLrzqt("fire_flame_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getUserContextRegisteredStatus)), C56390yDp.OLrzqt("fire_flame_filled_12", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hlXVux)), C56390yDp.OLrzqt("fire_flame_filled_16", java.lang.Integer.valueOf(C52761wXj.TaskDescription.processStrongAuthMessage)), C56390yDp.OLrzqt("fire_flame_filled_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.init)), C56390yDp.OLrzqt("fireworks", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hOMIpD)), C56390yDp.OLrzqt("flash_deal", java.lang.Integer.valueOf(C52761wXj.TaskDescription.pauseLocationServices)), C56390yDp.OLrzqt("flashotc", java.lang.Integer.valueOf(C52761wXj.TaskDescription.scanPackages)), C56390yDp.OLrzqt("follow", java.lang.Integer.valueOf(C52761wXj.TaskDescription.registerUser)), C56390yDp.OLrzqt("following", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zpGcln)), C56390yDp.OLrzqt("following_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.profile)), C56390yDp.OLrzqt("forward", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fmB)), C56390yDp.OLrzqt("freeze_account", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DMb)), C56390yDp.OLrzqt("freeze_account_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onComplete)), C56390yDp.OLrzqt("futures", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKDCKfqPDCfLja)), C56390yDp.OLrzqt("futures_copy", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKDCKfqP)), C56390yDp.OLrzqt("futures_dca", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKDIADVb)), C56390yDp.OLrzqt("futures_grid", java.lang.Integer.valueOf(C52761wXj.TaskDescription.svY)), C56390yDp.OLrzqt("futures_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKDCKfqPDCfLja)), C56390yDp.OLrzqt("gbp_fiat", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKDDUqPf)), C56390yDp.OLrzqt("github", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sbu)), C56390yDp.OLrzqt("grow", java.lang.Integer.valueOf(C52761wXj.TaskDescription.stopBehavioSecDataCollection)), C56390yDp.OLrzqt("grow_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sendBehavioSecData)), C56390yDp.OLrzqt("h_line", java.lang.Integer.valueOf(C52761wXj.TaskDescription.jh)), C56390yDp.OLrzqt("h_ray", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DsL)), C56390yDp.OLrzqt("h_segment", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKDcMfJK)), C56390yDp.OLrzqt("hamburger", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKOmnske)), C56390yDp.OLrzqt("hamburger_edit", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sCB)), C56390yDp.OLrzqt("hamburger_search", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKdMCrTj)), C56390yDp.OLrzqt("hamburger_settings", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKRKUgwx)), C56390yDp.OLrzqt("hardware", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fbC)), C56390yDp.OLrzqt("headphone_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fcfzuX)), C56390yDp.OLrzqt("headphones", java.lang.Integer.valueOf(C52761wXj.TaskDescription.htlTjW)), C56390yDp.OLrzqt("hide_drawing", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getStatusCode)), C56390yDp.OLrzqt("hide_indicator", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKffREWX)), C56390yDp.OLrzqt("home", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKsfEqpH)), C56390yDp.OLrzqt("home_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKgMxgjU)), C56390yDp.OLrzqt("hot_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKsgNvtZ)), C56390yDp.OLrzqt("hot_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.XW)), C56390yDp.OLrzqt("iceberg", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UJEglR)), C56390yDp.OLrzqt("import_wallet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DRGLNw)), C56390yDp.OLrzqt("infinity_grid", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Dfm)), C56390yDp.OLrzqt("info_line", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sYcwUD)), C56390yDp.OLrzqt("inscription_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fsw)), C56390yDp.OLrzqt("instagram", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dbUqJD)), C56390yDp.OLrzqt("invest_more_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zeUYeG)), C56390yDp.OLrzqt("invest_more_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sILrnl)), C56390yDp.OLrzqt("jumpstart", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GQzpsZ)), C56390yDp.OLrzqt("kakao", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OzhFjl)), C56390yDp.OLrzqt("kline_brush", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QiTXOm)), C56390yDp.OLrzqt("kline_circle", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zLAIeZ)), C56390yDp.OLrzqt("kline_measure", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DQnQnb)), C56390yDp.OLrzqt("kline_rectangle", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OrsvgJ)), C56390yDp.OLrzqt("kline_style", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OgHfcT)), C56390yDp.OLrzqt("kline_triangle", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gAnGwV)), C56390yDp.OLrzqt("kol_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RLmrWm)), C56390yDp.OLrzqt("lead_trader_application", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sRzUNh)), C56390yDp.OLrzqt("lead_trader_management", java.lang.Integer.valueOf(C52761wXj.TaskDescription.inahnb)), C56390yDp.OLrzqt("light_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GQzpsZgQzpsZ)), C56390yDp.OLrzqt("light_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GcnicV)), C56390yDp.OLrzqt(TabTitleInfo.KEY_LIMIT_ORDER, java.lang.Integer.valueOf(C52761wXj.TaskDescription.GhqvEQ)), C56390yDp.OLrzqt("limit_order_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DXd)), C56390yDp.OLrzqt("line", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RckOJh)), C56390yDp.OLrzqt("line_app", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OStAOF)), C56390yDp.OLrzqt("line_draw", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GiPPlL)), C56390yDp.OLrzqt("linkedin", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hgxRZI)), C56390yDp.OLrzqt("liquidity_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OmJATG)), C56390yDp.OLrzqt("liquidity_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QMuEJi)), C56390yDp.OLrzqt("list_filter", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RihMUf)), C56390yDp.OLrzqt("list_filtered", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RcvFxC)), C56390yDp.OLrzqt("loading_icon_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.resume)), C56390yDp.OLrzqt("loading_icon_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sElUiK)), C56390yDp.OLrzqt("loan", java.lang.Integer.valueOf(C52761wXj.TaskDescription.pause)), C56390yDp.OLrzqt("location_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.setLocationManually)), C56390yDp.OLrzqt("location_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GiPPlLQAswws)), C56390yDp.OLrzqt("lock_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GiPPlLRPuVlr)), C56390yDp.OLrzqt("lock_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zvzmfz)), C56390yDp.OLrzqt("loudspeaker", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Dff)), C56390yDp.OLrzqt("loudspeaker_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onReceive)), C56390yDp.OLrzqt("management_fees", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aappFQ)), C56390yDp.OLrzqt("margin", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChP)), C56390yDp.OLrzqt("margin_ratio", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPDXdlte)), C56390yDp.OLrzqt("market_order_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iLWfRf)), C56390yDp.OLrzqt("medium", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hcetpZ)), C56390yDp.OLrzqt("meme_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dXcUrg)), C56390yDp.OLrzqt("message", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Qsauvs)), C56390yDp.OLrzqt("message_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DVmcag)), C56390yDp.OLrzqt("messenger", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OxbLUn)), C56390yDp.OLrzqt("mint", java.lang.Integer.valueOf(C52761wXj.TaskDescription.putInt)), C56390yDp.OLrzqt(ConnectionMethod.MOBILE, java.lang.Integer.valueOf(C52761wXj.TaskDescription.fDu)), C56390yDp.OLrzqt("mobile_key", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPOKBmQNaCIdOM)), C56390yDp.OLrzqt("moon_grid", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPOKBmQN)), C56390yDp.OLrzqt("mpc", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QfZsXX)), C56390yDp.OLrzqt("network_fee_fast", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPQPAeHI)), C56390yDp.OLrzqt("network_fee_fast_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QsIRgs)), C56390yDp.OLrzqt("network_fee_slow", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iWlNch)), C56390yDp.OLrzqt("network_fee_standard", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPQdUnVm)), C56390yDp.OLrzqt("nft", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ibnZAm)), C56390yDp.OLrzqt("nft_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ONJgbh)), C56390yDp.OLrzqt("night_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.itxZVF)), C56390yDp.OLrzqt("night_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RSmiaq)), C56390yDp.OLrzqt("official_website", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ikIEnW)), C56390yDp.OLrzqt("onchain_earn", java.lang.Integer.valueOf(C52761wXj.TaskDescription.BVXAa)), C56390yDp.OLrzqt("onchain_earn_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QSAYLr)), C56390yDp.OLrzqt("options", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPdNQGVJ)), C56390yDp.OLrzqt("options_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPdNQGVJ)), C56390yDp.OLrzqt("overview", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPfvRMlC)), C56390yDp.OLrzqt(OtcRouteConst.P2P, java.lang.Integer.valueOf(C52761wXj.TaskDescription.RZMhtF)), C56390yDp.OLrzqt("paper_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gdwsGQ)), C56390yDp.OLrzqt("party_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iOIMNp)), C56390yDp.OLrzqt("party_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dpErvT)), C56390yDp.OLrzqt("passkey", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hfeTOA)), C56390yDp.OLrzqt("paw_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sanrWj)), C56390yDp.OLrzqt("peak_sniper", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPhFGucI)), C56390yDp.OLrzqt("percentage_airdrop", java.lang.Integer.valueOf(C52761wXj.TaskDescription.izFvvl)), C56390yDp.OLrzqt("percentage_rate_hike", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UCQKYV)), C56390yDp.OLrzqt("perpetual", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DzCpqu)), C56390yDp.OLrzqt("pin", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OqCbbx)), C56390yDp.OLrzqt("pin_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OqCbbx)), C56390yDp.OLrzqt("pointer_up_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DPVBvL)), C56390yDp.OLrzqt("polyline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DzOuPm)), C56390yDp.OLrzqt("pre_market_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OKSWiw)), C56390yDp.OLrzqt("premarket", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OKSWiw)), C56390yDp.OLrzqt("price_line", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DsfknC)), C56390yDp.OLrzqt("price_tag", java.lang.Integer.valueOf(C52761wXj.TaskDescription.setProfilesSinceInitCount)), C56390yDp.OLrzqt("price_tag_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zlzhuY)), C56390yDp.OLrzqt("price_warning_down", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aWJMta)), C56390yDp.OLrzqt("price_warning_to", java.lang.Integer.valueOf(C52761wXj.TaskDescription.apLTlu)), C56390yDp.OLrzqt("price_warning_up", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OCdtug)), C56390yDp.OLrzqt("profit_sharing", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DtnWsU)), C56390yDp.OLrzqt("proof_of_address", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gwwzsY)), C56390yDp.OLrzqt("qq", java.lang.Integer.valueOf(C52761wXj.TaskDescription.IYdWPz)), C56390yDp.OLrzqt("quick", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hpmliR)), C56390yDp.OLrzqt("quick_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fJk)), C56390yDp.OLrzqt("quick_repay", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aWuQzD)), C56390yDp.OLrzqt("radio_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.adevsa)), C56390yDp.OLrzqt("ray", java.lang.Integer.valueOf(C52761wXj.TaskDescription.znKlvJ)), C56390yDp.OLrzqt("recall_message", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OFqMGB)), C56390yDp.OLrzqt("receive", java.lang.Integer.valueOf(C52761wXj.TaskDescription.seuMaA)), C56390yDp.OLrzqt("recurring_buy", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zdxASf)), C56390yDp.OLrzqt("red_note", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zbGDDc)), C56390yDp.OLrzqt("reddit", java.lang.Integer.valueOf(C52761wXj.TaskDescription.avCqka)), C56390yDp.OLrzqt("redeem", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OGitdB)), C56390yDp.OLrzqt("repay", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ORrpqH)), C56390yDp.OLrzqt("reply", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OHsvZP)), C56390yDp.OLrzqt("repost", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dGrqPl)), C56390yDp.OLrzqt("repost_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.uLLnq)), C56390yDp.OLrzqt("reset_2fa", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OeawrH)), C56390yDp.OLrzqt("reverse_replication", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QYNZmZ)), C56390yDp.OLrzqt("reward_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OAUGar)), C56390yDp.OLrzqt("risk_long", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RidNCX)), C56390yDp.OLrzqt("risk_notice", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OeawrHRnVkix)), C56390yDp.OLrzqt("risk_short", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Ohcwxs)), C56390yDp.OLrzqt("rug_pull_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gvFztT)), C56390yDp.OLrzqt("runes_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.isTimeProfileEmpty)), C56390yDp.OLrzqt("sandwich_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DDDCac)), C56390yDp.OLrzqt("scan_code_pay", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OhcwxsRkSIEV)), C56390yDp.OLrzqt("seagull", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OmYuqg)), C56390yDp.OLrzqt("security_key", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QjzqRB)), C56390yDp.OLrzqt("segment", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fGsPTM)), C56390yDp.OLrzqt("send", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aChkwz)), C56390yDp.OLrzqt("setting_currency", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hfFNez)), C56390yDp.OLrzqt("shark_fin", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hBUiXU)), C56390yDp.OLrzqt("show_drawing", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OtZEmZ)), C56390yDp.OLrzqt("show_indicator", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QBiWsm)), C56390yDp.OLrzqt("shrink_window", java.lang.Integer.valueOf(C52761wXj.TaskDescription.PUZqN)), C56390yDp.OLrzqt("signal_bot", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fraLem)), C56390yDp.OLrzqt("simple_earn", java.lang.Integer.valueOf(C52761wXj.TaskDescription.YqksP)), C56390yDp.OLrzqt("smart_portfolio", java.lang.Integer.valueOf(C52761wXj.TaskDescription.SqfPTR)), C56390yDp.OLrzqt("snap_mode", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QSbQqJ)), C56390yDp.OLrzqt("snowball", java.lang.Integer.valueOf(C52761wXj.TaskDescription.setCurrentKeyboardTarget)), C56390yDp.OLrzqt("sol_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.keyboardTargetTextChanged)), C56390yDp.OLrzqt("solid_line_1px", java.lang.Integer.valueOf(C52761wXj.TaskDescription.clearCurrentKeyboardTarget)), C56390yDp.OLrzqt("solid_line_2px", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RcLksq)), C56390yDp.OLrzqt("solid_line_3px", java.lang.Integer.valueOf(C52761wXj.TaskDescription.apNKau)), C56390yDp.OLrzqt("solid_line_4px", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QSusPL)), C56390yDp.OLrzqt("speedometer_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DkGEDn)), C56390yDp.OLrzqt("speedometer_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hdBMmm)), C56390yDp.OLrzqt("spot", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fdazkH)), C56390yDp.OLrzqt("spot_copy", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ruDxL)), C56390yDp.OLrzqt("spot_dca", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QVMIlxQVMIlx)), C56390yDp.OLrzqt("spot_grid", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QYvkLl)), C56390yDp.OLrzqt("spot_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.kcQGz)), C56390yDp.OLrzqt("stay_drawing", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QhsCdE)), C56390yDp.OLrzqt("structured_product", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sFt)), C56390yDp.OLrzqt("subaccount", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fWSAZA)), C56390yDp.OLrzqt("subscribe", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialhrnhsO)), C56390yDp.OLrzqt("subscribed", java.lang.Integer.valueOf(C52761wXj.TaskDescription.addPreRequisiteCollector)), C56390yDp.OLrzqt("suspected_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RIsQag)), C56390yDp.OLrzqt("suspected_phishing_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zFZsbn)), C56390yDp.OLrzqt("swap", java.lang.Integer.valueOf(C52761wXj.TaskDescription.glXhWM)), C56390yDp.OLrzqt("swap_for_gas", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RjCdvpRjCdvp)), C56390yDp.OLrzqt("swap_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RsCxkX)), C56390yDp.OLrzqt("switch_account_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RhlVAI)), C56390yDp.OLrzqt("switch_account_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RjCdvp)), C56390yDp.OLrzqt("switch_view_chart_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.SFHvfSaKzXkR)), C56390yDp.OLrzqt("switch_view_chart_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onLost)), C56390yDp.OLrzqt("switch_view_frame_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onAvailable)), C56390yDp.OLrzqt("switch_view_frame_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hTAtCx)), C56390yDp.OLrzqt("switch_view_list_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.SQPLEi)), C56390yDp.OLrzqt("switch_view_list_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OhRmUC)), C56390yDp.OLrzqt("sync_trader_settings", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DKr)), C56390yDp.OLrzqt("telegram", java.lang.Integer.valueOf(C52761wXj.TaskDescription.SaJVGb)), C56390yDp.OLrzqt("text", java.lang.Integer.valueOf(C52761wXj.TaskDescription.haRtnV)), C56390yDp.OLrzqt("tiktok", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ScLVFT)), C56390yDp.OLrzqt("tips", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RZOtbZ)), C56390yDp.OLrzqt("toggle_units", java.lang.Integer.valueOf(C52761wXj.TaskDescription.SlnMSS)), C56390yDp.OLrzqt("token", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zMXLsR)), C56390yDp.OLrzqt("token_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.SePrCP)), C56390yDp.OLrzqt("token_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zMXLsR)), C56390yDp.OLrzqt("tokens_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Srftgn)), C56390yDp.OLrzqt("tokens_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.SqfPTR)), C56390yDp.OLrzqt("top_down_bottom_up", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Slwtri)), C56390yDp.OLrzqt("topic_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ibrGus)), C56390yDp.OLrzqt("trader_recruitment", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DHEdFZ)), C56390yDp.OLrzqt("trading", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DRuYWY)), C56390yDp.OLrzqt("trading_bot", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DDxOgT)), C56390yDp.OLrzqt("trading_bots_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QWSkGZ)), C56390yDp.OLrzqt("trading_data", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OsDdEf)), C56390yDp.OLrzqt("trading_nmp", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QfgJNx)), C56390yDp.OLrzqt("trading_nmp_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QfgJNx)), C56390yDp.OLrzqt("trading_tutorial", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DvMhtu)), C56390yDp.OLrzqt("trailing_stop_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OTJFaA)), C56390yDp.OLrzqt(ExtJson.BRC20TYPE_TRANSFER, java.lang.Integer.valueOf(C52761wXj.TaskDescription.aSdHwS)), C56390yDp.OLrzqt("transfer_margin", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dPaqAf)), C56390yDp.OLrzqt("translation", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RgaQzq)), C56390yDp.OLrzqt("translation_off", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RAaltf)), C56390yDp.OLrzqt("try_fiat", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hErYDe)), C56390yDp.OLrzqt("tutorial", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iluEmO)), C56390yDp.OLrzqt("twap", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iTrKTi)), C56390yDp.OLrzqt("unfollow", java.lang.Integer.valueOf(C52761wXj.TaskDescription.rsEnD)), C56390yDp.OLrzqt("unknown_contract_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UUsvzUhTFPAC)), C56390yDp.OLrzqt("unknown_contract_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aLnfMH)), C56390yDp.OLrzqt("unpin_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onServiceDisconnected)), C56390yDp.OLrzqt("upgrade_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QUeTTI)), C56390yDp.OLrzqt("upgrade_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QgUVrU)), C56390yDp.OLrzqt("upload_csv", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DYICSh)), C56390yDp.OLrzqt("upload_doc", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OqIZjC)), C56390yDp.OLrzqt("upload_docx", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RXxsjQ)), C56390yDp.OLrzqt("upload_general", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dGgpab)), C56390yDp.OLrzqt("upload_general_outlined", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dGgpab)), C56390yDp.OLrzqt("upload_jpg", java.lang.Integer.valueOf(C52761wXj.TaskDescription.doTurnConnection)), C56390yDp.OLrzqt("upload_pdf", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aRClCA)), C56390yDp.OLrzqt("upload_xls", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aVPvww)), C56390yDp.OLrzqt("upload_xlsx", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gISBfG)), C56390yDp.OLrzqt("usdt_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zCTncp)), C56390yDp.OLrzqt("user_management", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DKr)), C56390yDp.OLrzqt("user_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gxJrGF)), C56390yDp.OLrzqt("verified_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fhwtiV)), C56390yDp.OLrzqt("viber", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DXTac)), C56390yDp.OLrzqt("vip_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DDNONI)), C56390yDp.OLrzqt("vip_support", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UNDaji)), C56390yDp.OLrzqt("vk", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DkIxYv)), C56390yDp.OLrzqt("wallet_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.WFXFk)), C56390yDp.OLrzqt("wallet_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OfWYUE)), C56390yDp.OLrzqt("watch_only", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZNPcth)), C56390yDp.OLrzqt("web3_24h_turnover", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DuQ)), C56390yDp.OLrzqt("web3_aa_wallet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OLrzqt)), C56390yDp.OLrzqt("web3_add_accounts", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sSi)), C56390yDp.OLrzqt("web3_all_transaction", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZGRCNj)), C56390yDp.OLrzqt("web3_analyze_address", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ijmTNW)), C56390yDp.OLrzqt("web3_approvals", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dbAction)), C56390yDp.OLrzqt("web3_approve", java.lang.Integer.valueOf(C52761wXj.TaskDescription.identifier)), C56390yDp.OLrzqt("web3_buy", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZaDspl)), C56390yDp.OLrzqt("web3_caution", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Zpvmxu)), C56390yDp.OLrzqt("web3_caution_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZqidTP)), C56390yDp.OLrzqt("web3_configure", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dHAKvv)), C56390yDp.OLrzqt("web3_content", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DhEJvI)), C56390yDp.OLrzqt("web3_copy", java.lang.Integer.valueOf(C52761wXj.TaskDescription.tIwhY)), C56390yDp.OLrzqt("web3_create_wallet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.AYXKKw)), C56390yDp.OLrzqt("web3_crypto", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zMXLsR)), C56390yDp.OLrzqt("web3_cryptopedia", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zSsVtY)), C56390yDp.OLrzqt("web3_dapp_rankings", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DbvGUJ)), C56390yDp.OLrzqt("web3_defi", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dxTXDv)), C56390yDp.OLrzqt("web3_device_available", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPOKBmQNaCIdOM)), C56390yDp.OLrzqt("web3_device_unavailable", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dESsmu)), C56390yDp.OLrzqt("web3_disable_magnet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dcEsSD)), C56390yDp.OLrzqt("web3_ecohub", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zLAIeZ)), C56390yDp.OLrzqt("web3_ellipsis", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DjzMc)), C56390yDp.OLrzqt("web3_farm_points", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ICustomTabsCallback)), C56390yDp.OLrzqt("web3_faucet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sjbWxX)), C56390yDp.OLrzqt("web3_filter", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dPnHjp)), C56390yDp.OLrzqt("web3_filtered", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GVpNrs)), C56390yDp.OLrzqt("web3_get_token", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ArkbYM)), C56390yDp.OLrzqt("web3_history", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKfNUfqk)), C56390yDp.OLrzqt("web3_inscription", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fsw)), C56390yDp.OLrzqt("web3_inscription_center", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getPostValueLengthLimit)), C56390yDp.OLrzqt("web3_leaderboard", java.lang.Integer.valueOf(C52761wXj.TaskDescription.f1068a)), C56390yDp.OLrzqt("web3_limit", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Slwtri)), C56390yDp.OLrzqt("web3_linked_accounts", java.lang.Integer.valueOf(C52761wXj.TaskDescription.IIEbr)), C56390yDp.OLrzqt("web3_linked_wallet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.wtf)), C56390yDp.OLrzqt("web3_liquidity", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GVpNrsfQMcgE)), C56390yDp.OLrzqt("web3_lock", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hkDICb)), C56390yDp.OLrzqt("web3_loop", java.lang.Integer.valueOf(C52761wXj.TaskDescription.closeSocket)), C56390yDp.OLrzqt("web3_magnet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.addSocket)), C56390yDp.OLrzqt("web3_market", java.lang.Integer.valueOf(C52761wXj.TaskDescription.setProfilesSinceInitCount)), C56390yDp.OLrzqt("web3_meme_mode", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sendSocketRequest)), C56390yDp.OLrzqt("web3_message", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RbMRq)), C56390yDp.OLrzqt("web3_more", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPfvRMlC)), C56390yDp.OLrzqt("web3_multisender", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QYNZmZ)), C56390yDp.OLrzqt("web3_network", java.lang.Integer.valueOf(C52761wXj.TaskDescription.createSocket)), C56390yDp.OLrzqt("web3_newest", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zqaRxl)), C56390yDp.OLrzqt("web3_nft", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getSupportedCipherSuites)), C56390yDp.OLrzqt("web3_open_link", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dNxZaP)), C56390yDp.OLrzqt("web3_orderbook", java.lang.Integer.valueOf(C52761wXj.TaskDescription.apHBvG)), C56390yDp.OLrzqt("web3_pro_trade", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fdazkH)), C56390yDp.OLrzqt("web3_pump", java.lang.Integer.valueOf(C52761wXj.TaskDescription.STbtMW)), C56390yDp.OLrzqt("web3_radar", java.lang.Integer.valueOf(C52761wXj.TaskDescription.extraCallbackWithResult)), C56390yDp.OLrzqt("web3_reduce_token", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fqaWRL)), C56390yDp.OLrzqt("web3_report", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UPzgla)), C56390yDp.OLrzqt("web3_report_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZpNRhN)), C56390yDp.OLrzqt("web3_restore_keyless_wallet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OFnBcz)), C56390yDp.OLrzqt("web3_risk", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QAQCdZ)), C56390yDp.OLrzqt("web3_risk_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zNQIcI)), C56390yDp.OLrzqt("web3_rotate", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gCiISl)), C56390yDp.OLrzqt("web3_runes", java.lang.Integer.valueOf(C52761wXj.TaskDescription.isTimeProfileEmpty)), C56390yDp.OLrzqt("web3_scan", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gezFCt)), C56390yDp.OLrzqt("web3_security", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dhOYXF)), C56390yDp.OLrzqt("web3_security_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hQkvHM)), C56390yDp.OLrzqt("web3_seed_phrase", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OmPrLP)), C56390yDp.OLrzqt("web3_settings", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sJPPOI)), C56390yDp.OLrzqt("web3_share", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OBzZra)), C56390yDp.OLrzqt("web3_shield", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RYPzIz)), C56390yDp.OLrzqt("web3_shield_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.arDRxL)), C56390yDp.OLrzqt("web3_signal", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ddauOi)), C56390yDp.OLrzqt("web3_smart_money", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ICustomTabsCallback)), C56390yDp.OLrzqt("web3_sniper", java.lang.Integer.valueOf(C52761wXj.TaskDescription.extraCallback)), C56390yDp.OLrzqt("web3_strong_magnet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zLnOGN)), C56390yDp.OLrzqt("web3_suspicious", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onRelationshipValidationResult)), C56390yDp.OLrzqt("web3_todo", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onPostMessage)), C56390yDp.OLrzqt("web3_ton_wallet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onMessageChannelReady)), C56390yDp.OLrzqt("web3_toolkit", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onNavigationEvent)), C56390yDp.OLrzqt("web3_tracker", java.lang.Integer.valueOf(C52761wXj.TaskDescription.extraCallbackWithResult)), C56390yDp.OLrzqt("web3_unapprove", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getDefaultImpl)), C56390yDp.OLrzqt("web3_unknown_risks", java.lang.Integer.valueOf(C52761wXj.TaskDescription.asBinder)), C56390yDp.OLrzqt("web3_unknown_risks_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ICustomTabsCallbackStub)), C56390yDp.OLrzqt("web3_unlock", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ICustomTabsCallbackDefault)), C56390yDp.OLrzqt("web3_upgrade", java.lang.Integer.valueOf(C52761wXj.TaskDescription.asInterface)), C56390yDp.OLrzqt("web3_upload_to_icloud", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onTransact)), C56390yDp.OLrzqt("web3_uxto", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ICustomTabsService)), C56390yDp.OLrzqt("web3_volume_medium", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ICustomTabsCallbackStubProxy)), C56390yDp.OLrzqt("web3_volume_off", java.lang.Integer.valueOf(C52761wXj.TaskDescription.setDefaultImpl)), C56390yDp.OLrzqt("web3_volume_on", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getInterfaceDescriptor)), C56390yDp.OLrzqt("web3_volume_small", java.lang.Integer.valueOf(C52761wXj.TaskDescription.newSessionWithExtras)), C56390yDp.OLrzqt("web3_voucher", java.lang.Integer.valueOf(C52761wXj.TaskDescription.mayLaunchUrl)), C56390yDp.OLrzqt("wechat", java.lang.Integer.valueOf(C52761wXj.TaskDescription.postMessage)), C56390yDp.OLrzqt("weibo", java.lang.Integer.valueOf(C52761wXj.TaskDescription.extraCommand)), C56390yDp.OLrzqt("whatsapp", java.lang.Integer.valueOf(C52761wXj.TaskDescription.validateRelationship)), C56390yDp.OLrzqt("white_paper", java.lang.Integer.valueOf(C52761wXj.TaskDescription.receiveFile)), C56390yDp.OLrzqt("wire_transfer", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RqmePg)), C56390yDp.OLrzqt("withdrawal", java.lang.Integer.valueOf(C52761wXj.TaskDescription.requestPostMessageChannel)), C56390yDp.OLrzqt("withdrawing_profits", java.lang.Integer.valueOf(C52761wXj.TaskDescription.warmup)), C56390yDp.OLrzqt("x", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ICustomTabsServiceDefault)), C56390yDp.OLrzqt("xbtc", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ICustomTabsServiceStubProxy)), C56390yDp.OLrzqt("youtube", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ICustomTabsServiceStub)), C56390yDp.OLrzqt("zalo", java.lang.Integer.valueOf(C52761wXj.TaskDescription.IPostMessageService)), C56390yDp.OLrzqt("add_to_shopping_cart", java.lang.Integer.valueOf(C52761wXj.TaskDescription.AhwBna)), C56390yDp.OLrzqt("analysis", java.lang.Integer.valueOf(C52761wXj.TaskDescription.wlaJM)), C56390yDp.OLrzqt("app_authentication", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gHZMYf)), C56390yDp.OLrzqt("app_authentication_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sSMYrx)), C56390yDp.OLrzqt("arrow_up_to_line", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QKVWgx)), C56390yDp.OLrzqt("back_to_top", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QUSxYX)), C56390yDp.OLrzqt("backspace", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RJOkX)), C56390yDp.OLrzqt("backspace_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QfsBiF)), C56390yDp.OLrzqt("bell", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UeEOUB)), C56390yDp.OLrzqt("bell_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.djSkpj)), C56390yDp.OLrzqt("bell_off", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RcXXUw)), C56390yDp.OLrzqt("bell_off_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aKErDB)), C56390yDp.OLrzqt("block", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gGvvIC)), C56390yDp.OLrzqt("calendar", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QSBOWP)), C56390yDp.OLrzqt("calendar_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QkdxfA)), C56390yDp.OLrzqt("calendar_star", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OBJEWx)), C56390yDp.OLrzqt("calendar_star_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RKDWNf)), C56390yDp.OLrzqt(NotificationCompat.CATEGORY_CALL, java.lang.Integer.valueOf(C52761wXj.TaskDescription.QHmsKR)), C56390yDp.OLrzqt("call_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dHguZz)), C56390yDp.OLrzqt("camera", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dmfpNf)), C56390yDp.OLrzqt("camera_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hBpjJd)), C56390yDp.OLrzqt("camera_flip", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gwTjWJ)), C56390yDp.OLrzqt("camera_flip_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RdAHlO)), C56390yDp.OLrzqt("candle_stick", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OFhtUX)), C56390yDp.OLrzqt("candle_stick_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hrNTAI)), C56390yDp.OLrzqt("caret_down_12", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QSLkRj)), C56390yDp.OLrzqt("caret_down_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QVsKAR)), C56390yDp.OLrzqt("caret_up_12", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dUDNAs)), C56390yDp.OLrzqt("caret_up_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.USBtdM)), C56390yDp.OLrzqt("checkbox", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fjfviF)), C56390yDp.OLrzqt("checkbox_blank", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zblBkD)), C56390yDp.OLrzqt("checkbox_blank_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.spnCvw)), C56390yDp.OLrzqt("checkbox_outlined", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DCUTEIdCUTEI)), C56390yDp.OLrzqt("checkmark", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Dmq)), C56390yDp.OLrzqt("chevron_down_12", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DGOPHZ)), C56390yDp.OLrzqt("chevron_down_16", java.lang.Integer.valueOf(C52761wXj.TaskDescription.call)), C56390yDp.OLrzqt("chevron_down_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UrRBLY)), C56390yDp.OLrzqt("chevron_left_12", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcqEDu)), C56390yDp.OLrzqt("chevron_left_16", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DWgRXt)), C56390yDp.OLrzqt("chevron_left_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.KDccX)), C56390yDp.OLrzqt("chevron_left_alignleft", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DBxZfM)), C56390yDp.OLrzqt("chevron_right_12", java.lang.Integer.valueOf(C52761wXj.TaskDescription.heceqZ)), C56390yDp.OLrzqt("chevron_right_16", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DGOPHZDGOPHZ)), C56390yDp.OLrzqt("chevron_right_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hCLrkq)), C56390yDp.OLrzqt("chevron_right_alignright", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DsrFlB)), C56390yDp.OLrzqt("chevron_right_text_button", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DaRZkR)), C56390yDp.OLrzqt("chevron_up_12", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DGgnkA)), C56390yDp.OLrzqt("chevron_up_16", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OTwTPd)), C56390yDp.OLrzqt("chevron_up_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QIZEnU)), C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_CLEAR, java.lang.Integer.valueOf(C52761wXj.TaskDescription.RKcVTr)), C56390yDp.OLrzqt("clear_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.TarCU)), C56390yDp.OLrzqt("clock", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RXzakW)), C56390yDp.OLrzqt("clock_cancellation_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Ufzxmz)), C56390yDp.OLrzqt("clock_cancellation_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ULRxlR)), C56390yDp.OLrzqt("clock_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UhxbNG)), C56390yDp.OLrzqt("clock_stop_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.akftKQ)), C56390yDp.OLrzqt("clock_stop_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UscePu)), C56390yDp.OLrzqt(EopTrackEvent.CLOSE, java.lang.Integer.valueOf(C52761wXj.TaskDescription.alsFma)), C56390yDp.OLrzqt("collapse", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dvImUD)), C56390yDp.OLrzqt("connection_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fsSxsn)), C56390yDp.OLrzqt("copy_16", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zAEkPU)), C56390yDp.OLrzqt("copy_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.tIwhY)), C56390yDp.OLrzqt("copy_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zKcAg)), C56390yDp.OLrzqt("divide", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zzQwtT)), C56390yDp.OLrzqt("document", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DLGVGj)), C56390yDp.OLrzqt("document_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iCPUKe)), C56390yDp.OLrzqt("download", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DrNnAm)), C56390yDp.OLrzqt("draw", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DPhTBN)), C56390yDp.OLrzqt("draw_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DPHsZd)), C56390yDp.OLrzqt("edit", java.lang.Integer.valueOf(C52761wXj.TaskDescription.reset)), C56390yDp.OLrzqt("edit_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DQzvGNdrmXxu)), C56390yDp.OLrzqt("end_call", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Th)), C56390yDp.OLrzqt("end_call_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DTeKQX)), C56390yDp.OLrzqt("expand", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iHkeWl)), C56390yDp.OLrzqt("explorer", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialRtjmuc)), C56390yDp.OLrzqt("explorer_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialaKhcqp)), C56390yDp.OLrzqt("eye_hide", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialgBtXYZ)), C56390yDp.OLrzqt("eye_hide_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialdPnHjp)), C56390yDp.OLrzqt("eye_show", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ODCBUN)), C56390yDp.OLrzqt("eye_show_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DaTmkG)), C56390yDp.OLrzqt("face_id", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DPHOMC)), C56390yDp.OLrzqt("filter", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dPnHjp)), C56390yDp.OLrzqt("filter_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.atDTRm)), C56390yDp.OLrzqt("filtered", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dIjzlO)), C56390yDp.OLrzqt("filtered_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aVhqwO)), C56390yDp.OLrzqt("finger_print", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aKhcqp)), C56390yDp.OLrzqt("globe", java.lang.Integer.valueOf(C52761wXj.TaskDescription.cancel)), C56390yDp.OLrzqt("globe_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKDSqxTE)), C56390yDp.OLrzqt("history", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKfNUfqk)), C56390yDp.OLrzqt("history_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKfNLfdT)), C56390yDp.OLrzqt("id_card", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sVvuFk)), C56390yDp.OLrzqt("id_card_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hbZCHz)), C56390yDp.OLrzqt("information_16", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Dfv)), C56390yDp.OLrzqt("information_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fTEjYi)), C56390yDp.OLrzqt("information_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ORWKdN)), C56390yDp.OLrzqt("insights", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GPCHlQ)), C56390yDp.OLrzqt("intermediate", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OAhWiU)), C56390yDp.OLrzqt("keyboard", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DBAlnt)), C56390yDp.OLrzqt("keyboard_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QnnRaN)), C56390yDp.OLrzqt("landscape", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RXdAnZ)), C56390yDp.OLrzqt("landscape_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.drbYRJ)), C56390yDp.OLrzqt("left_bracket", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zXhzOT)), C56390yDp.OLrzqt("like", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getValue)), C56390yDp.OLrzqt("like_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GQzpsZsQwTVT)), C56390yDp.OLrzqt("line_chart", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zzJhsT)), C56390yDp.OLrzqt("link", java.lang.Integer.valueOf(C52761wXj.TaskDescription.idLUrz)), C56390yDp.OLrzqt("locked", java.lang.Integer.valueOf(C52761wXj.TaskDescription.unregister)), C56390yDp.OLrzqt("locked_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GqbzPL)), C56390yDp.OLrzqt("logout", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fZc)), C56390yDp.OLrzqt("mail", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GiPPlLgiPPlL)), C56390yDp.OLrzqt("mail_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GzAsTt)), C56390yDp.OLrzqt("mic_off", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DeEinT)), C56390yDp.OLrzqt("mic_off_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fAklCm)), C56390yDp.OLrzqt("mic_on", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gFTCsA)), C56390yDp.OLrzqt("mic_on_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hwkNQP)), C56390yDp.OLrzqt("minus", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sZqaRl)), C56390yDp.OLrzqt("minus_circle", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DjwCMv)), C56390yDp.OLrzqt("more", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPOZOJIj)), C56390yDp.OLrzqt("open_link", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dNxZaP)), C56390yDp.OLrzqt("orders", java.lang.Integer.valueOf(C52761wXj.TaskDescription.apHBvG)), C56390yDp.OLrzqt("orders_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPfrwjPh)), C56390yDp.OLrzqt("pause", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iRgjgR)), C56390yDp.OLrzqt("pause_circle_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ilfrrN)), C56390yDp.OLrzqt("pause_circle_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.xxhdY)), C56390yDp.OLrzqt("personal_setting", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPiaHEvk)), C56390yDp.OLrzqt("play", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DGgkXd)), C56390yDp.OLrzqt("play_circle_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DpxfQh)), C56390yDp.OLrzqt("play_circle_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.geAOna)), C56390yDp.OLrzqt("play_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HrFqwD)), C56390yDp.OLrzqt("plus", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onLocationChanged)), C56390yDp.OLrzqt("plus_circle", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fzHEvu)), C56390yDp.OLrzqt("plus_circle_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sEAkxl)), C56390yDp.OLrzqt("pointer_down", java.lang.Integer.valueOf(C52761wXj.TaskDescription.nriSR)), C56390yDp.OLrzqt("pointer_left", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DAgZj)), C56390yDp.OLrzqt("pointer_right_12", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HrMTQN)), C56390yDp.OLrzqt("pointer_right_16", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onStatusChanged)), C56390yDp.OLrzqt("pointer_right_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onProviderEnabled)), C56390yDp.OLrzqt("pointer_up", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QOeQqh)), C56390yDp.OLrzqt(ConnectionMethod.QR_CODE, java.lang.Integer.valueOf(C52761wXj.TaskDescription.sEcTXd)), C56390yDp.OLrzqt("question_mark", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iMXFZQ)), C56390yDp.OLrzqt("question_mark_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.jFiva)), C56390yDp.OLrzqt("refresh", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OKvQBs)), C56390yDp.OLrzqt("report", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gZKUVK)), C56390yDp.OLrzqt("report_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OUcgGI)), C56390yDp.OLrzqt("reversed", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OWSZPf)), C56390yDp.OLrzqt("right_bracket", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OqHLSf)), C56390yDp.OLrzqt("rotate", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gCiISl)), C56390yDp.OLrzqt("scan", java.lang.Integer.valueOf(C52761wXj.TaskDescription.compare)), C56390yDp.OLrzqt("search", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UJpkuA)), C56390yDp.OLrzqt("search_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RIKbBf)), C56390yDp.OLrzqt("security", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcNNRp)), C56390yDp.OLrzqt("security_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QhYuFg)), C56390yDp.OLrzqt("security_off_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OEsIKP)), C56390yDp.OLrzqt("security_off_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dtVxwd)), C56390yDp.OLrzqt("selected", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gqESXP)), C56390yDp.OLrzqt("selected_outlined", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ixgjPv)), C56390yDp.OLrzqt("setting", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sJPPOI)), C56390yDp.OLrzqt("setting_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.isScanInProgress)), C56390yDp.OLrzqt("share", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zEkrwr)), C56390yDp.OLrzqt("single_candle", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hQufeQ)), C56390yDp.OLrzqt("single_candle_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DjWNei)), C56390yDp.OLrzqt("sort", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OVMstZ)), C56390yDp.OLrzqt("sort_down", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aPFruk)), C56390yDp.OLrzqt("sort_up", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QVMIlx)), C56390yDp.OLrzqt("star", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UkCIYP)), C56390yDp.OLrzqt("star_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QezThh)), C56390yDp.OLrzqt("t_chart", java.lang.Integer.valueOf(C52761wXj.TaskDescription.SUwuXE)), C56390yDp.OLrzqt("t_chart_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OFQuKP)), C56390yDp.OLrzqt("thumb_down", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fruYXx)), C56390yDp.OLrzqt("thumb_down_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dXhJGx)), C56390yDp.OLrzqt("thumb_up_16", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hCiIDQ)), C56390yDp.OLrzqt("thumb_up_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ikcuIV)), C56390yDp.OLrzqt("thumb_up_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zagaMW)), C56390yDp.OLrzqt("torch_off_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UPbYzn)), C56390yDp.OLrzqt("torch_on_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DRtzUu)), C56390yDp.OLrzqt("trash", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dTTfOR)), C56390yDp.OLrzqt("trash_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fACtfg)), C56390yDp.OLrzqt("trending_down", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ddhgMB)), C56390yDp.OLrzqt("trending_up", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fObYrO)), C56390yDp.OLrzqt("unlink", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DLl)), C56390yDp.OLrzqt("unlock", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UUsvzU)), C56390yDp.OLrzqt("unlock_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zeUJxr)), C56390yDp.OLrzqt("unselected", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QqiRNA)), C56390yDp.OLrzqt("unselected_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UimiPO)), C56390yDp.OLrzqt("user", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UimiPOhkCVbT)), C56390yDp.OLrzqt("user_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iflRwn)), C56390yDp.OLrzqt("user_protection", java.lang.Integer.valueOf(C52761wXj.TaskDescription.isAvailable)), C56390yDp.OLrzqt("user_protection_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sJqpAA)), C56390yDp.OLrzqt("video_off", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sWlOSi)), C56390yDp.OLrzqt("video_off_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gRtANS)), C56390yDp.OLrzqt("video_on", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UlpNxW)), C56390yDp.OLrzqt("video_on_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sYOsaF)), C56390yDp.OLrzqt("volume_max", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OYuSWK)), C56390yDp.OLrzqt("volume_max_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UnZVfq)), C56390yDp.OLrzqt("volume_medium", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fOrBHg)), C56390yDp.OLrzqt("volume_medium_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UnZVfqExternalSyntheticApiModelOutline0)), C56390yDp.OLrzqt("volume_off", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UkuJRw)), C56390yDp.OLrzqt("volume_off_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UvfnWv)), C56390yDp.OLrzqt("volume_small", java.lang.Integer.valueOf(C52761wXj.TaskDescription.m)), C56390yDp.OLrzqt("volume_small_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UnZVfqExternalSyntheticApiModelOutline0)), C56390yDp.OLrzqt("warning", java.lang.Integer.valueOf(C52761wXj.TaskDescription.FdcJU)), C56390yDp.OLrzqt("warning_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.shErWi)), C56390yDp.OLrzqt("caret_down", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OJuSTm)), C56390yDp.OLrzqt("caret_up", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OxVOHk)), C56390yDp.OLrzqt("chevron_down", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DCUTEIddSDPG)), C56390yDp.OLrzqt("chevron_left", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fHqPtx)), C56390yDp.OLrzqt("chevron_right", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DGUQLI)), C56390yDp.OLrzqt("chevron_up", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DNMMPQ)), C56390yDp.OLrzqt("copy", java.lang.Integer.valueOf(C52761wXj.TaskDescription.tIwhY)), C56390yDp.OLrzqt("fire_flame", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gBtXYZ)), C56390yDp.OLrzqt("fire_flame_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fupbxE)), C56390yDp.OLrzqt(TtmlNode.TAG_INFORMATION, java.lang.Integer.valueOf(C52761wXj.TaskDescription.GGlJim)), C56390yDp.OLrzqt("pointer_right", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onProviderDisabled)), C56390yDp.OLrzqt("thumbs_up", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DtA)), C56390yDp.OLrzqt("thumbs_up_16", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sQOHWT)), C56390yDp.OLrzqt("thumbs_down", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hBORwR)), C56390yDp.OLrzqt("dex_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QfJbVf)), C56390yDp.OLrzqt("dog_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DKtBnz)), C56390yDp.OLrzqt("earn_airdrop_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fkESqH)), C56390yDp.OLrzqt("enlarge_window_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RIuxYh)), C56390yDp.OLrzqt("expand_down_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialDaTmkG)), C56390yDp.OLrzqt("expand_left_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialODCBUN)), C56390yDp.OLrzqt("expand_right_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iqMDAV)), C56390yDp.OLrzqt("protocols_defi_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.icKaHr)), C56390yDp.OLrzqt("web3_dapp_rankings_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sGvRiA)), C56390yDp.OLrzqt("web3_leaderboard_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.isDevMode)), C56390yDp.OLrzqt("web3_rotate_12", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iFnJKK)), C56390yDp.OLrzqt("web3_rotate_24", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gCiISl)), C56390yDp.OLrzqt("cdn_placeholder", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DuR)), C56390yDp.OLrzqt("error_404", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJK)), C56390yDp.OLrzqt("layer_1", java.lang.Integer.valueOf(C52761wXj.TaskDescription.pXZxY)), C56390yDp.OLrzqt("layer_2", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zFtALg)), C56390yDp.OLrzqt("no_network", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPRAkuRW)), C56390yDp.OLrzqt("no_record", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPRGtXKC)), C56390yDp.OLrzqt("no_result", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPRGtXKCDKRTZD)), C56390yDp.OLrzqt("pow", java.lang.Integer.valueOf(C52761wXj.TaskDescription.adwzgZ)), C56390yDp.OLrzqt("quick_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QzqeNH)), C56390yDp.OLrzqt("report_center", java.lang.Integer.valueOf(C52761wXj.TaskDescription.FF)), C56390yDp.OLrzqt("reverse", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OWSZPf)), C56390yDp.OLrzqt("system_error", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QTtQrx)), C56390yDp.OLrzqt("builder_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OqFWZa)), C56390yDp.OLrzqt("candle_volume_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QCjLjM)), C56390yDp.OLrzqt("knowledge_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RFmUsE)), C56390yDp.OLrzqt("lead_trader_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hGuIrQ)), C56390yDp.OLrzqt("rise_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fmdvVn)), C56390yDp.OLrzqt("all_coins_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getFieldNames)), C56390yDp.OLrzqt("all_coins_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.AuCTelauCTel)), C56390yDp.OLrzqt("global_trading_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getSessionID)), C56390yDp.OLrzqt("instagram_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.GLcwwN)), C56390yDp.OLrzqt("invest_less_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.aQtmcU)), C56390yDp.OLrzqt("limit_down_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hKJZrr)), C56390yDp.OLrzqt("limit_up_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fQQVvf)), C56390yDp.OLrzqt("local_trading_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fhUrPt)), C56390yDp.OLrzqt("pin_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPzRXNTw)), C56390yDp.OLrzqt("price_tag_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.IKQXqd)), C56390yDp.OLrzqt("unpin_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onServiceConnected)), C56390yDp.OLrzqt("bluetooth_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hUfVAv)), C56390yDp.OLrzqt("quotation_mark_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OAjjVP)), C56390yDp.OLrzqt("turn_off_speaker_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iSpHlg)), C56390yDp.OLrzqt("turn_off_speaker_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ikEgkI)), C56390yDp.OLrzqt("vertical_screen_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.UkvvWh)), C56390yDp.OLrzqt("external_assets_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.invokespecialhlXVux)), C56390yDp.OLrzqt("nav_wallet", java.lang.Integer.valueOf(C52761wXj.TaskDescription.iLAtSv)), C56390yDp.OLrzqt("nav_wallet_active", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QOjuYg)), C56390yDp.OLrzqt("pin_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPzRXNTw)), C56390yDp.OLrzqt("unpin_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.onServiceConnected)), C56390yDp.OLrzqt("bluetooth_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hUfVAv)), C56390yDp.OLrzqt("quotation_mark_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OAjjVP)), C56390yDp.OLrzqt("ai_edit_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fIwbmz)), C56390yDp.OLrzqt("high_guarantee", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Hx)), C56390yDp.OLrzqt("high_guarantee_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKfbSiEC)), C56390yDp.OLrzqt("high_huarantee", java.lang.Integer.valueOf(C52761wXj.TaskDescription.Hx)), C56390yDp.OLrzqt("high_huarantee_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKfbSiEC)), C56390yDp.OLrzqt("zip_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.IPostMessageServiceStubProxy)), C56390yDp.OLrzqt("flash_earn_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.siEkQe)), C56390yDp.OLrzqt("user_list_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.svUkWZ)), C56390yDp.OLrzqt("orbit_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.isElapsedRealtimeNanosAvailable)), C56390yDp.OLrzqt("paste_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.gLWkOL)), C56390yDp.OLrzqt("adjust_currency_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.isConnected)), C56390yDp.OLrzqt("adjust_price_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.AuCTel)), C56390yDp.OLrzqt("referral_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ardYFU)), C56390yDp.OLrzqt("reward_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OeawrHOeawrH)), C56390yDp.OLrzqt("referral", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OeawrHOeawrH)), C56390yDp.OLrzqt("rewards", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ardYFU)), C56390yDp.OLrzqt("builder_chat_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DarRvM)), C56390yDp.OLrzqt("summary_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hrnhsO)), C56390yDp.OLrzqt("easy_bank_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RAQtXZ)), C56390yDp.OLrzqt("futures_grid_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DcMfJKDGTeJD)), C56390yDp.OLrzqt("summary_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.QhsCdEQhsCdE)), C56390yDp.OLrzqt("rewards_center_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dkJJWw)), C56390yDp.OLrzqt("web3_smart_money_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hijVBL)), C56390yDp.OLrzqt("web3_smart_money_outlined", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sTbpmZ)), C56390yDp.OLrzqt("livestream_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.config)), C56390yDp.OLrzqt("message_unread_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.dSJNDS)), C56390yDp.OLrzqt("creator_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.DGUQLIOvDItG)), C56390yDp.OLrzqt("snake_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.registerKeyboardTarget)), C56390yDp.OLrzqt("rename_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.fGT)), C56390yDp.OLrzqt("rename_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.getConnectivityMgr)), C56390yDp.OLrzqt("at_symbol_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.ORxRYg)), C56390yDp.OLrzqt("premium_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hPlhRW)), C56390yDp.OLrzqt("evening_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RgLUBD)), C56390yDp.OLrzqt("evening_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.RZNAhV)), C56390yDp.OLrzqt("orbit_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.HJWChPdIKEqB)), C56390yDp.OLrzqt("shear_board_off_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zAGdSp)), C56390yDp.OLrzqt("shear_board_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OtRJxF)), C56390yDp.OLrzqt("twitch_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.zUtmHU)), C56390yDp.OLrzqt("unflag_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.validateAndPutInMap)), C56390yDp.OLrzqt("pilot_outline", java.lang.Integer.valueOf(C52761wXj.TaskDescription.hwXsuq)), C56390yDp.OLrzqt("rest_filled", java.lang.Integer.valueOf(C52761wXj.TaskDescription.OeZisf)));

    public static final java.lang.Integer EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd.getOrDefault(str, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [825=16] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.Integer copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1930307182:
                if (str.equals("margin_compact")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.QbewEr);
                }
                return null;
            case -1618693645:
                if (str.equals("xxxxxlg")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.QHmsKR);
                }
                return null;
            case -1618693422:
                if (str.equals("xxxxxsm")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.QkdxfA);
                }
                return null;
            case -1335987024:
                if (str.equals("margin_default")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.QUSxYX);
                }
                return null;
            case -744952965:
                if (str.equals("xxxxlg")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.DCUTEI);
                }
                return null;
            case -744952742:
                if (str.equals("xxxxsm")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.OuxcSI);
                }
                return null;
            case 3451:
                if (str.equals("lg")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.zLjUOn);
                }
                return null;
            case 3479:
                if (str.equals("md")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.QfsBiF);
                }
                return null;
            case 3674:
                if (str.equals("sm")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.AxsJAYaxsJAY);
                }
                return null;
            case 118771:
                if (str.equals("xlg")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.DCJXGO);
                }
                return null;
            case 118994:
                if (str.equals("xsm")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.ODWQjV);
                }
                return null;
            case 3693691:
                if (str.equals("xxlg")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.DarRvM);
                }
                return null;
            case 3693914:
                if (str.equals("xxsm")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.zuWLRA);
                }
                return null;
            case 114516211:
                if (str.equals("xxxlg")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.getPostValueLengthLimit);
                }
                return null;
            case 114516434:
                if (str.equals("xxxsm")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.ffGIBT);
                }
                return null;
            case 987250473:
                if (str.equals("margin_none")) {
                    return java.lang.Integer.valueOf(C52761wXj.StateListAnimator.QVAiDq);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [847=90] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.Integer AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1831397141:
                if (str.equals("white_opacity_005")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.dzkkkq);
                }
                return null;
            case -1831397115:
                if (str.equals("white_opacity_010")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.atDTRm);
                }
                return null;
            case -1831397084:
                if (str.equals("white_opacity_020")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.dIjzlO);
                }
                return null;
            case -1831397053:
                if (str.equals("white_opacity_030")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.gBtXYZ);
                }
                return null;
            case -1831397022:
                if (str.equals("white_opacity_040")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fupbxE);
                }
                return null;
            case -1831396991:
                if (str.equals("white_opacity_050")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.deregisterUser);
                }
                return null;
            case -1831396960:
                if (str.equals("white_opacity_060")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.getUserContextRegisteredStatus);
                }
                return null;
            case -1831396929:
                if (str.equals("white_opacity_070")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.init);
                }
                return null;
            case -1831396898:
                if (str.equals("white_opacity_080")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.processStrongAuthMessage);
                }
                return null;
            case -1831396867:
                if (str.equals("white_opacity_090")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.pauseLocationServices);
                }
                return null;
            case -1041255491:
                if (str.equals("lavender_005")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.heceqZ);
                }
                return null;
            case -1041255465:
                if (str.equals("lavender_010")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.KDccX);
                }
                return null;
            case -1041255434:
                if (str.equals("lavender_020")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.UrRBLY);
                }
                return null;
            case -1041255403:
                if (str.equals("lavender_030")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DGUQLI);
                }
                return null;
            case -1041255372:
                if (str.equals("lavender_040")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.hCLrkq);
                }
                return null;
            case -1041255341:
                if (str.equals("lavender_050")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DBxZfM);
                }
                return null;
            case -1041255310:
                if (str.equals("lavender_060")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DGOPHZDGOPHZ);
                }
                return null;
            case -765414679:
                if (str.equals("lemon_005")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DNMMPQ);
                }
                return null;
            case -765414653:
                if (str.equals("lemon_010")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DsrFlB);
                }
                return null;
            case -765414622:
                if (str.equals("lemon_020")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DGgnkA);
                }
                return null;
            case -765414591:
                if (str.equals("lemon_030")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.OTwTPd);
                }
                return null;
            case -765414560:
                if (str.equals("lemon_040")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DaRZkR);
                }
                return null;
            case -765414529:
                if (str.equals("lemon_050")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.RVsVBY);
                }
                return null;
            case -765414498:
                if (str.equals("lemon_060")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.QDqgQU);
                }
                return null;
            case -153985343:
                if (str.equals("neonLime_005")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.dLBcXg);
                }
                return null;
            case -153985317:
                if (str.equals("neonLime_010")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.aHXSQp);
                }
                return null;
            case -153985286:
                if (str.equals("neonLime_020")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.alsFma);
                }
                return null;
            case -153985255:
                if (str.equals("neonLime_030")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.aJFbMH);
                }
                return null;
            case -153985224:
                if (str.equals("neonLime_040")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fLIjIY);
                }
                return null;
            case -153985193:
                if (str.equals("neonLime_050")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.dvImUD);
                }
                return null;
            case -153985162:
                if (str.equals("neonLime_060")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fXHmeK);
                }
                return null;
            case 1135332289:
                if (str.equals("black_opacity_005")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fJNWhG);
                }
                return null;
            case 1135332315:
                if (str.equals("black_opacity_010")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fetchVPNInfo);
                }
                return null;
            case 1135332346:
                if (str.equals("black_opacity_020")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.values);
                }
                return null;
            case 1135332377:
                if (str.equals("black_opacity_030")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.isConnected);
                }
                return null;
            case 1135332408:
                if (str.equals("black_opacity_040")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.AuCTel);
                }
                return null;
            case 1135332439:
                if (str.equals("black_opacity_050")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fARcdN);
                }
                return null;
            case 1135332470:
                if (str.equals("black_opacity_060")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fIwbmz);
                }
                return null;
            case 1135332501:
                if (str.equals("black_opacity_070")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.ejfBZ);
                }
                return null;
            case 1135332532:
                if (str.equals("black_opacity_080")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.getFieldNames);
                }
                return null;
            case 1135332563:
                if (str.equals("black_opacity_090")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.getNewProxyInstance);
                }
                return null;
            case 1216281427:
                if (str.equals("bluebell_005")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zsXlph);
                }
                return null;
            case 1216281453:
                if (str.equals("bluebell_010")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.uzCIH);
                }
                return null;
            case 1216281484:
                if (str.equals("bluebell_020")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.iwGUEr);
                }
                return null;
            case 1216281515:
                if (str.equals("bluebell_030")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.hDKMBd);
                }
                return null;
            case 1216281546:
                if (str.equals("bluebell_040")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zLjUOn);
                }
                return null;
            case 1216281577:
                if (str.equals("bluebell_050")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.AubY);
                }
                return null;
            case 1216281608:
                if (str.equals("bluebell_060")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.AuCTelauCTel);
                }
                return null;
            case 1422383257:
                if (str.equals("orchid_005")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DrqXHJ);
                }
                return null;
            case 1422383283:
                if (str.equals("orchid_010")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zSsVtY);
                }
                return null;
            case 1422383314:
                if (str.equals("orchid_020")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DGUQLIekVPG);
                }
                return null;
            case 1422383345:
                if (str.equals("orchid_030")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DIIpTV);
                }
                return null;
            case 1422383376:
                if (str.equals("orchid_040")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DGUQLIhJrIAr);
                }
                return null;
            case 1422383407:
                if (str.equals("orchid_050")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DSiOMJ);
                }
                return null;
            case 1422383438:
                if (str.equals("orchid_060")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DUUtXg);
                }
                return null;
            case 1631306958:
                if (str.equals("neonMint_005")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.gmHjFq);
                }
                return null;
            case 1631306984:
                if (str.equals("neonMint_010")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.apNbdB);
                }
                return null;
            case 1631307015:
                if (str.equals("neonMint_020")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.gSBher);
                }
                return null;
            case 1631307046:
                if (str.equals("neonMint_030")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.hlkKmr);
                }
                return null;
            case 1631307077:
                if (str.equals("neonMint_040")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fsSxsn);
                }
                return null;
            case 1631307108:
                if (str.equals("neonMint_050")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.gUEfcq);
                }
                return null;
            case 1631307139:
                if (str.equals("neonMint_060")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.sVXHln);
                }
                return null;
            case 1790430141:
                if (str.equals("neutral_005")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DGUQLIDGUQLI);
                }
                return null;
            case 1790430167:
                if (str.equals("neutral_010")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.sTzBva);
                }
                return null;
            case 1790430198:
                if (str.equals("neutral_020")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zYHWMc);
                }
                return null;
            case 1790430229:
                if (str.equals("neutral_030")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DTg);
                }
                return null;
            case 1790430260:
                if (str.equals("neutral_040")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DGUQLIOvDItG);
                }
                return null;
            case 1790430291:
                if (str.equals("neutral_050")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.getPriority);
                }
                return null;
            case 1790430322:
                if (str.equals("neutral_060")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.getLabel);
                }
                return null;
            case 1790430353:
                if (str.equals("neutral_070")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fBE);
                }
                return null;
            case 1790430384:
                if (str.equals("neutral_080")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.gtCCJH);
                }
                return null;
            case 1790430415:
                if (str.equals("neutral_090")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DGUQLIdZmdUa);
                }
                return null;
            case 1790431097:
                if (str.equals("neutral_100")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.iPSTqm);
                }
                return null;
            case 1790431128:
                if (str.equals("neutral_110")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.swzYdv);
                }
                return null;
            case 1790431159:
                if (str.equals("neutral_120")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.vLaW);
                }
                return null;
            case 1790431190:
                if (str.equals("neutral_130")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zDUObI);
                }
                return null;
            case 1790431221:
                if (str.equals("neutral_140")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zAEkPU);
                }
                return null;
            case 1790431252:
                if (str.equals("neutral_150")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.tIwhY);
                }
                return null;
            case 1790431283:
                if (str.equals("neutral_160")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zKcAg);
                }
                return null;
            case 1790431314:
                if (str.equals("neutral_170")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zhUgOk);
                }
                return null;
            case 1790431345:
                if (str.equals("neutral_180")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zOIQXb);
                }
                return null;
            case 1790431376:
                if (str.equals("neutral_190")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zlvcHA);
                }
                return null;
            case 1790432058:
                if (str.equals("neutral_200")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zqTOFw);
                }
                return null;
            case 1990477283:
                if (str.equals("tangerine_005")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.YFmri);
                }
                return null;
            case 1990477309:
                if (str.equals("tangerine_010")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DaTmkG);
                }
                return null;
            case 1990477340:
                if (str.equals("tangerine_020")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.ROgMPW);
                }
                return null;
            case 1990477371:
                if (str.equals("tangerine_030")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialsiEkQe);
                }
                return null;
            case 1990477402:
                if (str.equals("tangerine_040")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.aGOrKO);
                }
                return null;
            case 1990477433:
                if (str.equals("tangerine_050")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.Rtjmuc);
                }
                return null;
            case 1990477464:
                if (str.equals("tangerine_060")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.aCSzUz);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [943=52] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final android.util.Pair<java.lang.Integer, java.lang.Integer> KWHzl(@NotNull java.lang.String str) {
        android.util.Pair<java.lang.Integer, java.lang.Integer> pair;
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -1979779977:
                if (str.equals("contentInverse")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.fjfviF), java.lang.Integer.valueOf(C52761wXj.Activity.igXuih));
                }
                return null;
            case -1850023042:
                if (str.equals("contentAlwaysDark")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.QVsKAR), java.lang.Integer.valueOf(C52761wXj.Activity.QVsKAR));
                }
                return null;
            case -1681545229:
                if (str.equals("containerTertiary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.OHqIaq), java.lang.Integer.valueOf(C52761wXj.Activity.OFhtUX));
                }
                return null;
            case -1653607266:
                if (str.equals("borderTertiary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.dNCPSb), java.lang.Integer.valueOf(C52761wXj.Activity.aKErDB));
                }
                return null;
            case -1600370155:
                if (str.equals("contentDisabled")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.fERRXa), java.lang.Integer.valueOf(C52761wXj.Activity.dUDNAs));
                }
                return null;
            case -1508523506:
                if (str.equals("contentAlwaysLight")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.OxVOHk), java.lang.Integer.valueOf(C52761wXj.Activity.OxVOHk));
                }
                return null;
            case -1258697998:
                if (str.equals("brandContent")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.dxcTrN), java.lang.Integer.valueOf(C52761wXj.Activity.finit));
                }
                return null;
            case -1236258796:
                if (str.equals("brandContentContrast")) {
                    pair = new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.fZBcTu), java.lang.Integer.valueOf(C52761wXj.Activity.fFgQHt));
                    return pair;
                }
                return null;
            case -1089466593:
                if (str.equals("linkContent")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.UhxbNG), java.lang.Integer.valueOf(C52761wXj.Activity.QXDzTk));
                }
                return null;
            case -1073696093:
                if (str.equals("containerContrast")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.QSBOWP), java.lang.Integer.valueOf(C52761wXj.Activity.QkdxfA));
                }
                return null;
            case -1045758130:
                if (str.equals("borderContrast")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.AxsJAY), java.lang.Integer.valueOf(C52761wXj.Activity.sSMYrx));
                }
                return null;
            case -1025202781:
                if (str.equals("baseSecondary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.AkhnZx), java.lang.Integer.valueOf(C52761wXj.Activity.DbNXlk));
                }
                return null;
            case -972406535:
                if (str.equals("brandTertiary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.hUfVAv), java.lang.Integer.valueOf(C52761wXj.Activity.AxsJAYaxsJAY));
                }
                return null;
            case -769309217:
                if (str.equals("semanticPositive")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.RSDDiY), java.lang.Integer.valueOf(C52761wXj.Activity.RIuxYh));
                }
                return null;
            case -652533710:
                if (str.equals("brandPrimaryAlternative")) {
                    pair = new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.gGvvIC), java.lang.Integer.valueOf(C52761wXj.Activity.gasjUx));
                    return pair;
                }
                return null;
            case -596002789:
                if (str.equals("semanticNegative")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.zLAIeZ), java.lang.Integer.valueOf(C52761wXj.Activity.ihnvzI));
                }
                return null;
            case -556313894:
                if (str.equals("surfaceBrand")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.RZNAhV), java.lang.Integer.valueOf(C52761wXj.Activity.RbVjfb));
                }
                return null;
            case -550288529:
                if (str.equals("containerInverse")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.gwTjWJ), java.lang.Integer.valueOf(C52761wXj.Activity.dmfpNf));
                }
                return null;
            case -467116658:
                if (str.equals("semanticHighlight")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.geLlBI), java.lang.Integer.valueOf(C52761wXj.Activity.Swccd));
                }
                return null;
            case -426603986:
                if (str.equals("tagStatusPendingContent")) {
                    pair = new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialgBtXYZ), java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialatDTRm));
                    return pair;
                }
                return null;
            case -247298075:
                if (str.equals("borderSecondaryAlternative")) {
                    pair = new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.QfsBiF), java.lang.Integer.valueOf(C52761wXj.Activity.QbewEr));
                    return pair;
                }
                return null;
            case 40511305:
                if (str.equals("contentPrimary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.ixgjPv), java.lang.Integer.valueOf(C52761wXj.Activity.zblBkD));
                }
                return null;
            case 67109950:
                if (str.equals("semanticNotice")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.DQzvGNdrmXxu), java.lang.Integer.valueOf(C52761wXj.Activity.isReflectionWorking));
                }
                return null;
            case 590112463:
                if (str.equals("surfaceContrast")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.RzdrRQ), java.lang.Integer.valueOf(C52761wXj.Activity.RqmePg));
                }
                return null;
            case 653051379:
                if (str.equals("containerSecondary")) {
                    pair = new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.DLWbHP), java.lang.Integer.valueOf(C52761wXj.Activity.hrNTAI));
                    return pair;
                }
                return null;
            case 691509063:
                if (str.equals("surfaceSecondary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialaVhqwO), java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialRuDPQV));
                }
                return null;
            case 712761063:
                if (str.equals("borderSelected")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.UeEOUB), java.lang.Integer.valueOf(C52761wXj.Activity.djSkpj));
                }
                return null;
            case 760877660:
                if (str.equals("scrimPrimary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.DrNnAm), java.lang.Integer.valueOf(C52761wXj.Activity.DPHsZd));
                }
                return null;
            case 804981390:
                if (str.equals("contentBrand")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.QSLkRj), java.lang.Integer.valueOf(C52761wXj.Activity.QCjLjM));
                }
                return null;
            case 1141773795:
                if (str.equals("tagStatusPendingStroke")) {
                    pair = new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.DPHOMC), java.lang.Integer.valueOf(C52761wXj.Activity.ODCBUN));
                    return pair;
                }
                return null;
            case 1161514413:
                if (str.equals("brandSecondary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.gkJEwt), java.lang.Integer.valueOf(C52761wXj.Activity.fvQaOB));
                }
                return null;
            case 1248860139:
                if (str.equals("contentTertiary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.run), java.lang.Integer.valueOf(C52761wXj.Activity.WS));
                }
                return null;
            case 1301304571:
                if (str.equals("contentSecondary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.DCUTEIdCUTEI), java.lang.Integer.valueOf(C52761wXj.Activity.spnCvw));
                }
                return null;
            case 1428000329:
                if (str.equals("surfaceDisabled")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialROgMPW), java.lang.Integer.valueOf(C52761wXj.Activity.iHkeWl));
                }
                return null;
            case 1453607319:
                if (str.equals("borderPrimaryAlternative")) {
                    pair = new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.OcIXYQ), java.lang.Integer.valueOf(C52761wXj.Activity.gHZMYf));
                    return pair;
                }
                return null;
            case 1470002753:
                if (str.equals("containerPrimary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.RdAHlO), java.lang.Integer.valueOf(C52761wXj.Activity.hBpjJd));
                }
                return null;
            case 1519128232:
                if (str.equals("borderSecondary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.QUSxYX), java.lang.Integer.valueOf(C52761wXj.Activity.RJOkX));
                }
                return null;
            case 1554544726:
                if (str.equals("semanticInformative")) {
                    pair = new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.reset), java.lang.Integer.valueOf(C52761wXj.Activity.RvdRAu));
                    return pair;
                }
                return null;
            case 1570135292:
                if (str.equals("basePrimaryAlternative")) {
                    pair = new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.AYXKKw), java.lang.Integer.valueOf(C52761wXj.Activity.gEmmrt));
                    return pair;
                }
                return null;
            case 1635963489:
                if (str.equals("surfaceButtonContrast")) {
                    pair = new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.RgLUBD), java.lang.Integer.valueOf(C52761wXj.Activity.RTWSvT));
                    return pair;
                }
                return null;
            case 1769972859:
                if (str.equals("brandPrimary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.flVtFt), java.lang.Integer.valueOf(C52761wXj.Activity.giSNqX));
                }
                return null;
            case 1795382561:
                if (str.equals("semanticNeutral")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.fXYAwm), java.lang.Integer.valueOf(C52761wXj.Activity.Th));
                }
                return null;
            case 1797270197:
                if (str.equals("surfacePressed")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.iqMDAV), java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialDaTmkG));
                }
                return null;
            case 1800768661:
                if (str.equals("surfacePrimary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialRtjmuc), java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialaGOrKO));
                }
                return null;
            case 1856709275:
                if (str.equals("contentContrast")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.USBtdM), java.lang.Integer.valueOf(C52761wXj.Activity.aUsmxb));
                }
                return null;
            case 1886545974:
                if (str.equals("borderPrimary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.QOLQEE), java.lang.Integer.valueOf(C52761wXj.Activity.DTwDnp));
                }
                return null;
            case 1986691569:
                if (str.equals("basePrimary")) {
                    return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.AhwBna), java.lang.Integer.valueOf(C52761wXj.Activity.valueOf));
                }
                return null;
            default:
                switch (iHashCode) {
                    case 1537778914:
                        if (str.equals("category_01")) {
                            return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.AxsJAYsNCnLh), java.lang.Integer.valueOf(C52761wXj.Activity.accept));
                        }
                        return null;
                    case 1537778915:
                        if (str.equals("category_02")) {
                            return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.DXXBbs), java.lang.Integer.valueOf(C52761wXj.Activity.DarRvM));
                        }
                        return null;
                    case 1537778916:
                        if (str.equals("category_03")) {
                            return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.DCJXGO), java.lang.Integer.valueOf(C52761wXj.Activity.ODWQjV));
                        }
                        return null;
                    case 1537778917:
                        if (str.equals("category_04")) {
                            return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.zuWLRA), java.lang.Integer.valueOf(C52761wXj.Activity.getPostValueLengthLimit));
                        }
                        return null;
                    case 1537778918:
                        if (str.equals("category_05")) {
                            return new android.util.Pair<>(java.lang.Integer.valueOf(C52761wXj.Activity.RKDWNf), java.lang.Integer.valueOf(C52761wXj.Activity.ffGIBT));
                        }
                        return null;
                    default:
                        return null;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1044=120] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.Integer gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2047783659:
                if (str.equals("surfaceInteractiveDestructivePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.QnnRaN);
                }
                return null;
            case -2045151431:
                if (str.equals("contentInteractivePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zEHIKV);
                }
                return null;
            case -1875405322:
                if (str.equals("globalFixedAlwaysLight")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.dbUqJD);
                }
                return null;
            case -1873803578:
                if (str.equals("surfaceInfoDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DBAlnt);
                }
                return null;
            case -1860341768:
                if (str.equals("surfaceInteractiveUnselectedDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.GQzpsZgQzpsZ);
                }
                return null;
            case -1859344940:
                if (str.equals("contentStaticSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.v);
                }
                return null;
            case -1805118178:
                if (str.equals("contentStaticSubtler")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.FQNKFG);
                }
                return null;
            case -1788758883:
                if (str.equals("borderWarningSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fVjYLc);
                }
                return null;
            case -1750258095:
                if (str.equals("surfaceInteractiveEmphasisPressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.pXZxY);
                }
                return null;
            case -1722953147:
                if (str.equals("contentInteractiveDisabled")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.hfdhUn);
                }
                return null;
            case -1681271364:
                if (str.equals("surfaceWarningSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.config);
                }
                return null;
            case -1661611692:
                if (str.equals("surfaceStructuralElevatedLayer1")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fQQVvf);
                }
                return null;
            case -1612524250:
                if (str.equals("surfaceInteractiveHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.hGuIrQ);
                }
                return null;
            case -1495586666:
                if (str.equals("globalAlphaFeature1")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fdt);
                }
                return null;
            case -1462387438:
                if (str.equals("surfaceWarningDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.OmJATG);
                }
                return null;
            case -1392510393:
                if (str.equals("borderInfoSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.getAdvertisingId);
                }
                return null;
            case -1345713369:
                if (str.equals("borderStaticDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.iUnTnt);
                }
                return null;
            case -1278900856:
                if (str.equals("surfaceInfoSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zeUYeG);
                }
                return null;
            case -1205822467:
                if (str.equals("surfaceDangerSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.OzhFjl);
                }
                return null;
            case -1171194323:
                if (str.equals("surfaceInteractiveEmphasisDisabled")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.gAnGwV);
                }
                return null;
            case -1168755572:
                if (str.equals("surfaceInteractiveDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.GQzpsZ);
                }
                return null;
            case -1100731929:
                if (str.equals("borderInfoDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.bindToGooglePlayService);
                }
                return null;
            case -1057848667:
                if (str.equals("contentDangerDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.gsvlRV);
                }
                return null;
            case -1033136504:
                if (str.equals("borderNeutralSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fiXcQa);
                }
                return null;
            case -948352399:
                if (str.equals("surfaceInteractiveSelectedDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.GQzpsZsQwTVT);
                }
                return null;
            case -868018254:
                if (str.equals("borderInteractiveDisabled")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DlABUU);
                }
                return null;
            case -834361138:
                if (str.equals("borderInteractiveOnColor")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.glVQsU);
                }
                return null;
            case -824841012:
                if (str.equals("surfaceInteractiveOnColorHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zFtALg);
                }
                return null;
            case -802321820:
                if (str.equals("contentInteractiveSelected")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.FQMcgEfQMcgE);
                }
                return null;
            case -799224997:
                if (str.equals("surfaceStructuralBase")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.RckOJh);
                }
                return null;
            case -728638616:
                if (str.equals("surfaceInteractiveDestructiveSubtlePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.drbYRJ);
                }
                return null;
            case -714988524:
                if (str.equals("globalAlphaInverse10")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.GFUIi);
                }
                return null;
            case -714988519:
                if (str.equals("globalAlphaInverse15")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.NRYds);
                }
                return null;
            case -714988493:
                if (str.equals("globalAlphaInverse20")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.dlRikr);
                }
                return null;
            case -714988462:
                if (str.equals("globalAlphaInverse30")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.UJEglR);
                }
                return null;
            case -714988431:
                if (str.equals("globalAlphaInverse40")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.hbZCHz);
                }
                return null;
            case -714988400:
                if (str.equals("globalAlphaInverse50")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.gVEiQJ);
                }
                return null;
            case -714988369:
                if (str.equals("globalAlphaInverse60")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fMBJsc);
                }
                return null;
            case -714988338:
                if (str.equals("globalAlphaInverse70")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.sVvuFk);
                }
                return null;
            case -714988307:
                if (str.equals("globalAlphaInverse80")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.Dfm);
                }
                return null;
            case -714988276:
                if (str.equals("globalAlphaInverse90")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DRGLNw);
                }
                return null;
            case -714657609:
                if (str.equals("globalAlphaMatching10")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.sYcwUD);
                }
                return null;
            case -714657578:
                if (str.equals("globalAlphaMatching20")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.GCXiNH);
                }
                return null;
            case -714657547:
                if (str.equals("globalAlphaMatching30")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.FhERFw);
                }
                return null;
            case -714657516:
                if (str.equals("globalAlphaMatching40")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.GGlJim);
                }
                return null;
            case -714657485:
                if (str.equals("globalAlphaMatching50")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fTEjYi);
                }
                return null;
            case -714657454:
                if (str.equals("globalAlphaMatching60")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.ORWKdN);
                }
                return null;
            case -714657423:
                if (str.equals("globalAlphaMatching70")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.fsw);
                }
                return null;
            case -714657392:
                if (str.equals("globalAlphaMatching80")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.OAhWiU);
                }
                return null;
            case -714657361:
                if (str.equals("globalAlphaMatching90")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.GPCHlQ);
                }
                return null;
            case -689807716:
                if (str.equals("globalAlphaInverse100")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DuXjdv);
                }
                return null;
            case -628484146:
                if (str.equals("surfaceInteractiveDestructiveHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DQnQnb);
                }
                return null;
            case -625851918:
                if (str.equals("contentInteractiveHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.Dap);
                }
                return null;
            case -585286965:
                if (str.equals("surfaceSuccessDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.RihMUf);
                }
                return null;
            case -577253472:
                if (str.equals("globalAlphaInverse5")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.gbIfDn);
                }
                return null;
            case -499533231:
                if (str.equals("borderWarningDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.gGNlxh);
                }
                return null;
            case -476384618:
                if (str.equals("globalFixedAlwaysDark")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.GLcwwN);
                }
                return null;
            case -415542682:
                if (str.equals("surfaceStructuralInverse")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DXd);
                }
                return null;
            case -381072334:
                if (str.equals("surfaceInteractiveOnColorDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.inahnb);
                }
                return null;
            case -330958582:
                if (str.equals("surfaceInteractiveEmphasisHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.RLmrWm);
                }
                return null;
            case -184715468:
                if (str.equals("surfaceInteractiveDestructiveDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.QiTXOm);
                }
                return null;
            case -182083240:
                if (str.equals("contentInteractiveDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.dPkBzA);
                }
                return null;
            case -173592703:
                if (str.equals("borderInteractiveFocused")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.abAflu);
                }
                return null;
            case -2121603:
                if (str.equals("surfaceInteractiveSelectedSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zXhzOT);
                }
                return null;
            case 24127354:
                if (str.equals("contentInfoDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.apAOXX);
                }
                return null;
            case 50393778:
                if (str.equals("borderInteractiveEmphasis")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DlmWDR);
                }
                return null;
            case 50434151:
                if (str.equals("surfaceStructuralSubBase")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.GiPPlL);
                }
                return null;
            case 52613073:
                if (str.equals("borderInteractiveSelected")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.QFTsTN);
                }
                return null;
            case 112810096:
                if (str.equals("surfaceInteractiveEmphasisDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.RFmUsE);
                }
                return null;
            case 199184428:
                if (str.equals("borderInteractivePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DDjfYY);
                }
                return null;
            case 224139948:
                if (str.equals("contentStaticPlaceholder")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.aeJQwa);
                }
                return null;
            case 284138962:
                if (str.equals("borderDangerDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DcMfJKgMxgjU);
                }
                return null;
            case 313162038:
                if (str.equals("borderStaticOverlay")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.QKDJJA);
                }
                return null;
            case 377567242:
                if (str.equals("borderSuccessDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.jNexW);
                }
                return null;
            case 391626481:
                if (str.equals("surfaceDangerDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.sILrnl);
                }
                return null;
            case 439121631:
                if (str.equals("contentInteractiveError")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.UfveVb);
                }
                return null;
            case 444890708:
                if (str.equals("contentInfoSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.gqOnQv);
                }
                return null;
            case 450001140:
                if (str.equals("surfaceInteractiveSelectedOnColor")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.getValue);
                }
                return null;
            case 499777687:
                if (str.equals("contentSuccessSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.setPageName);
                }
                return null;
            case 599553295:
                if (str.equals("contentInteractiveActive")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.OijiEz);
                }
                return null;
            case 690660897:
                if (str.equals("surfaceInteractiveDestructiveSubtleHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.OgHfcT);
                }
                return null;
            case 828226438:
                if (str.equals("surfaceStructuralOverlay")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zzJhsT);
                }
                return null;
            case 848523230:
                if (str.equals("contentWarningDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.FSMca);
                }
                return null;
            case 1067111832:
                if (str.equals("contentIllustrationDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DztXDE);
                }
                return null;
            case 1130975414:
                if (str.equals("contentInteractiveSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.zDGrpR);
                }
                return null;
            case 1134429575:
                if (str.equals("surfaceInteractiveDestructiveSubtleDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.OrsvgJ);
                }
                return null;
            case 1164220784:
                if (str.equals("contentWarningSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.FYtjSf);
                }
                return null;
            case 1263143533:
                if (str.equals("surfaceInteractivePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.GcnicV);
                }
                return null;
            case 1267660305:
                if (str.equals("globalFixedShadow")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.aQtmcU);
                }
                return null;
            case 1284562172:
                if (str.equals("borderDangerSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DcMfJKsuEgdN);
                }
                return null;
            case 1449924038:
                if (str.equals("borderNeutralDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DzkRMH);
                }
                return null;
            case 1482218119:
                if (str.equals("contentIllustrationInverse")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.FQMcgE);
                }
                return null;
            case 1490280580:
                if (str.equals("borderStaticDotted")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.QWpYiD);
                }
                return null;
            case 1607266298:
                if (str.equals("contentStaticDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.svhCHd);
                }
                return null;
            case 1616405613:
                if (str.equals("surfaceStructuralElevatedDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.GhqvEQ);
                }
                return null;
            case 1618483941:
                if (str.equals("borderInteractiveHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DwQSDd);
                }
                return null;
            case 1652705878:
                if (str.equals("surfaceStructuralElevatedContrast")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.hKJZrr);
                }
                return null;
            case 1725623703:
                if (str.equals("contentSuccessDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.finishInit);
                }
                return null;
            case 1777630550:
                if (str.equals("borderStaticEmphasis")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DGGHxk);
                }
                return null;
            case 1795461577:
                if (str.equals("contentDangerSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.dbwnZN);
                }
                return null;
            case 1841765316:
                if (str.equals("borderSuccessSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.QslYrK);
                }
                return null;
            case 1882823378:
                if (str.equals("contentStaticNotification")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.clearRegistrations);
                }
                return null;
            case 1916609181:
                if (str.equals("globalAlphaMatching5")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.Dfv);
                }
                return null;
            case 1924722951:
                if (str.equals("borderStaticSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.ExKek);
                }
                return null;
            case 1949252835:
                if (str.equals("surfaceSuccessSubtle")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.QMuEJi);
                }
                return null;
            case 2022372585:
                if (str.equals("contentStaticInverse")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.sIqKDg);
                }
                return null;
            case 2036986002:
                if (str.equals("borderInteractiveError")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DxnCrt);
                }
                return null;
            case 2049942929:
                if (str.equals("surfaceInteractiveDisabled")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.RXdAnZ);
                }
                return null;
            case 2050826771:
                if (str.equals("surfaceInteractiveOnColorPressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.sRzUNh);
                }
                return null;
            case 2062252619:
                if (str.equals("borderInteractiveDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.Activity.DfrfUJ);
                }
                return null;
            default:
                switch (iHashCode) {
                    case 1030397706:
                        if (str.equals("surfaceStructuralLayer1")) {
                            return java.lang.Integer.valueOf(C52761wXj.Activity.hgxRZI);
                        }
                        return null;
                    case 1030397707:
                        if (str.equals("surfaceStructuralLayer2")) {
                            return java.lang.Integer.valueOf(C52761wXj.Activity.idLUrz);
                        }
                        return null;
                    case 1030397708:
                        if (str.equals("surfaceStructuralLayer3")) {
                            return java.lang.Integer.valueOf(C52761wXj.Activity.OStAOF);
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case 1587353526:
                                if (str.equals("contentDatavizCategorical2")) {
                                    return java.lang.Integer.valueOf(C52761wXj.Activity.hdpuIA);
                                }
                                return null;
                            case 1587353527:
                                if (str.equals("contentDatavizCategorical3")) {
                                    return java.lang.Integer.valueOf(C52761wXj.Activity.hNurIN);
                                }
                                return null;
                            case 1587353528:
                                if (str.equals("contentDatavizCategorical4")) {
                                    return java.lang.Integer.valueOf(C52761wXj.Activity.gkZNMa);
                                }
                                return null;
                            case 1587353529:
                                if (str.equals("contentDatavizCategorical5")) {
                                    return java.lang.Integer.valueOf(C52761wXj.Activity.FHvxmb);
                                }
                                return null;
                            case 1587353530:
                                if (str.equals("contentDatavizCategorical6")) {
                                    return java.lang.Integer.valueOf(C52761wXj.Activity.gCZUJG);
                                }
                                return null;
                            case 1587353531:
                                if (str.equals("contentDatavizCategorical7")) {
                                    return java.lang.Integer.valueOf(C52761wXj.Activity.OEgNct);
                                }
                                return null;
                            case 1587353532:
                                if (str.equals("contentDatavizCategorical8")) {
                                    return java.lang.Integer.valueOf(C52761wXj.Activity.DFbvW);
                                }
                                return null;
                            default:
                                return null;
                        }
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1231=40] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.Integer AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2055922388:
                if (str.equals("surfaceInteractiveFeatureInverseHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.UeEOUB);
                }
                return null;
            case -1829419774:
                if (str.equals("borderInteractiveFeaturePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.AhwBna);
                }
                return null;
            case -1821481316:
                if (str.equals("surfaceInteractiveExperienceHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QbewEr);
                }
                return null;
            case -1783462221:
                if (str.equals("contentIllustrationExperience")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.fJNWhG);
                }
                return null;
            case -1748990635:
                if (str.equals("contentInteractiveFeaturePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.zLjUOn);
                }
                return null;
            case -1705089350:
                if (str.equals("contentInteractiveExperienceAlternative")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.ejfBZ);
                }
                return null;
            case -1686359356:
                if (str.equals("borderStaticExperience")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.fetchVPNInfo);
                }
                return null;
            case -1612153710:
                if (str.equals("surfaceInteractiveFeatureInverseDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.RcXXUw);
                }
                return null;
            case -1534297681:
                if (str.equals("contentInteractiveExperiencePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.hDKMBd);
                }
                return null;
            case -1456899507:
                if (str.equals("contentIllustrationFeature")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.AuCTel);
                }
                return null;
            case -1377712638:
                if (str.equals("surfaceInteractiveExperienceDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QVAiDq);
                }
                return null;
            case -1007026462:
                if (str.equals("borderInteractiveExperiencePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.EZpvd);
                }
                return null;
            case -916745041:
                if (str.equals("contentStaticFeature")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.OcIXYQ);
                }
                return null;
            case -784393171:
                if (str.equals("contentStaticHighlight")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QfsBiF);
                }
                return null;
            case -410120261:
                if (str.equals("borderInteractiveFeatureHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.OLrzqt);
                }
                return null;
            case -329691122:
                if (str.equals("contentInteractiveFeatureHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.AubY);
                }
                return null;
            case -181792181:
                if (str.equals("contentIllustrationHighlight")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.fIwbmz);
                }
                return null;
            case -114998168:
                if (str.equals("contentInteractiveExperienceHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.getNewProxyInstance);
                }
                return null;
            case 18311743:
                if (str.equals("contentInteractiveFeatureInversePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.AuCTelauCTel);
                }
                return null;
            case 33648417:
                if (str.equals("borderInteractiveFeatureDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.copydefault);
                }
                return null;
            case 51490721:
                if (str.equals("surfaceInteractiveFeaturePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.fFgQHt);
                }
                return null;
            case 114077556:
                if (str.equals("contentInteractiveFeatureDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.getFieldNames);
                }
                return null;
            case 328770510:
                if (str.equals("contentInteractiveExperienceDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.iwGUEr);
                }
                return null;
            case 375529498:
                if (str.equals("borderStaticHighlight")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.AkhnZx);
                }
                return null;
            case 412273051:
                if (str.equals("borderInteractiveExperienceHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.AEQbTJ);
                }
                return null;
            case 425242588:
                if (str.equals("borderStaticFeature")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DbNXlk);
                }
                return null;
            case 743876797:
                if (str.equals("contentInteractiveExperienceInverse")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.uzCIH);
                }
                return null;
            case 819745395:
                if (str.equals("surfaceInteractiveFeatureInversePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.dvKsVJ);
                }
                return null;
            case 856041729:
                if (str.equals("borderInteractiveExperienceDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.KWHzl);
                }
                return null;
            case 940306988:
                if (str.equals("surfaceStructuralFeature")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DarRvM);
                }
                return null;
            case 973999732:
                if (str.equals("surfaceStructuralExperience")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DXXBbs);
                }
                return null;
            case 1010743569:
                if (str.equals("contentStaticExperience")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QKVWgx);
                }
                return null;
            case 1054186467:
                if (str.equals("surfaceInteractiveExperiencePressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.dNCPSb);
                }
                return null;
            case 1431178858:
                if (str.equals("surfaceStructuralHighlight")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.OqFWZa);
                }
                return null;
            case 1437611256:
                if (str.equals("contentInteractiveFeatureInverseHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.zsXlph);
                }
                return null;
            case 1446805917:
                if (str.equals("contentInteractiveExperienceAccent")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.fARcdN);
                }
                return null;
            case 1470790234:
                if (str.equals("surfaceInteractiveFeatureHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.djSkpj);
                }
                return null;
            case 1587353525:
                if (str.equals("contentDatavizCategorical1")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.values);
                }
                return null;
            case 1881379934:
                if (str.equals("contentInteractiveFeatureInverseDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.wlaJM);
                }
                return null;
            case 1914558912:
                if (str.equals("surfaceInteractiveFeatureDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.aKErDB);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1296=35] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.Integer AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1877823830:
                if (str.equals("surfacePnlLossGraph")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.gasjUx);
                }
                return null;
            case -1668460727:
                if (str.equals("borderPnlNeutralGraph")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.valueOf);
                }
                return null;
            case -1452170072:
                if (str.equals("surfacePnlNeutralGraph")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.AxsJAYaxsJAY);
                }
                return null;
            case -1422028951:
                if (str.equals("contentPnlLossDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.AxsJAY);
                }
                return null;
            case -1325150808:
                if (str.equals("borderPnlProfitGraph")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.isConnected);
                }
                return null;
            case -1301040514:
                if (str.equals("surfacePnlLossPressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.gGvvIC);
                }
                return null;
            case -1094653717:
                if (str.equals("contentPnlProfitOnColor")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QOLQEE);
                }
                return null;
            case -994294958:
                if (str.equals("contentPnlNeutralOnColor")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.gHZMYf);
                }
                return null;
            case -895142885:
                if (str.equals("borderPnlProfitDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.gEmmrt);
                }
                return null;
            case -806897937:
                if (str.equals("surfacePnlProfitGradientMax")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QKudOq);
                }
                return null;
            case -806897699:
                if (str.equals("surfacePnlProfitGradientMin")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.RlQdEF);
                }
                return null;
            case -475837921:
                if (str.equals("surfacePnlLossTint")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.fvQaOB);
                }
                return null;
            case -350522240:
                if (str.equals("surfacePnlProfitTint")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.ODWQjV);
                }
                return null;
            case -348168067:
                if (str.equals("surfacePnlProfitPressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DCJXGO);
                }
                return null;
            case -269672196:
                if (str.equals("surfacePnlNeutralPressed")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.iRxXKY);
                }
                return null;
            case -23675412:
                if (str.equals("contentPnlLossOnColor")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.zuBGHE);
                }
                return null;
            case 118258999:
                if (str.equals("surfacePnlLossHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.giSNqX);
                }
                return null;
            case 196833878:
                if (str.equals("globalAlphaPnLLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.RJOkX);
                }
                return null;
            case 262335617:
                if (str.equals("surfacePnlProfitEmphasis")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.accept);
                }
                return null;
            case 295954615:
                if (str.equals("globalAlphaPnLProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QUSxYX);
                }
                return null;
            case 562027677:
                if (str.equals("surfacePnlLossDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.fZBcTu);
                }
                return null;
            case 612560809:
                if (str.equals("borderPnlLossGraph")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.AYXKKw);
                }
                return null;
            case 788060832:
                if (str.equals("surfacePnlLossEmphasis")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.dxcTrN);
                }
                return null;
            case 1071131446:
                if (str.equals("surfacePnlProfitHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DAIeex);
                }
                return null;
            case 1149627317:
                if (str.equals("surfacePnlNeutralHovered")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.iZzfmt);
                }
                return null;
            case 1303146165:
                if (str.equals("contentPnlLossOnColorDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.AwvSrB);
                }
                return null;
            case 1424668374:
                if (str.equals("contentPnlProfitOnColorDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.ORxRYg);
                }
                return null;
            case 1514900124:
                if (str.equals("surfacePnlProfitDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.hUfVAv);
                }
                return null;
            case 1524881884:
                if (str.equals("borderPnlLossDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.djBIcL);
                }
                return null;
            case 1593395995:
                if (str.equals("surfacePnlNeutralDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.gkJEwt);
                }
                return null;
            case 1622220912:
                if (str.equals("surfacePnlLossGradientMax")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.finit);
                }
                return null;
            case 1622221150:
                if (str.equals("surfacePnlLossGradientMin")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.flVtFt);
                }
                return null;
            case 1801960040:
                if (str.equals("contentPnlProfitDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DTwDnp);
                }
                return null;
            case 1902318799:
                if (str.equals("contentPnlNeutralDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.sSMYrx);
                }
                return null;
            case 2006962281:
                if (str.equals("surfacePnlProfitGraph")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.AxsJAYsNCnLh);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1357=55] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.Integer OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2081446608:
                if (str.equals("tradeRiseTagFill")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.zlvcHA);
                }
                return null;
            case -2023776000:
                if (str.equals("tagFillLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.alsFma);
                }
                return null;
            case -1891640212:
                if (str.equals("preferenceNeutral")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.OTwTPd);
                }
                return null;
            case -1868416255:
                if (str.equals("tradeRiseGraph")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.swzYdv);
                }
                return null;
            case -1752025980:
                if (str.equals("tradeRiseShaded")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.zKcAg);
                }
                return null;
            case -1722070649:
                if (str.equals("tradeRiseTinted")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.zYHWMc);
                }
                return null;
            case -1543439345:
                if (str.equals("tradeRiseHighlightsFill")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.zAEkPU);
                }
                return null;
            case -1504026629:
                if (str.equals("tradeFallHighlightsContent")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.dLBcXg);
                }
                return null;
            case -1338708930:
                if (str.equals("tradeFallTagFill")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.hlkKmr);
                }
                return null;
            case -1222088348:
                if (str.equals("tradeFallHighlightsInteractive")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.fsSxsn);
                }
                return null;
            case -1173903983:
                if (str.equals("graphLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.zuWLRA);
                }
                return null;
            case -1170206099:
                if (str.equals("tradeRiseHighlightsContent")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.vLaW);
                }
                return null;
            case -925625018:
                if (str.equals("highlightsFillProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.dmfpNf);
                }
                return null;
            case -899973154:
                if (str.equals("tradeFallTagContent")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.gUEfcq);
                }
                return null;
            case -770824443:
                if (str.equals("highlightsFillNeutral")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.RdAHlO);
                }
                return null;
            case -690769107:
                if (str.equals("highlightsContentNeutral")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QSBOWP);
                }
                return null;
            case -659128167:
                if (str.equals("graphNeutral")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QHmsKR);
                }
                return null;
            case -546138369:
                if (str.equals("preferenceProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DGgnkA);
                }
                return null;
            case -472691086:
                if (str.equals("preferenceTintedNeutral")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.RKcVTr);
                }
                return null;
            case -464363730:
                if (str.equals("tradeFallAlternative")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.UscePu);
                }
                return null;
            case -446528442:
                if (str.equals("defaultNeutral")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.getPostValueLengthLimit);
                }
                return null;
            case -437188348:
                if (str.equals("defaultLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.OuxcSI);
                }
                return null;
            case -272641818:
                if (str.equals("highlightsInteractiveLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.gwTjWJ);
                }
                return null;
            case -133567089:
                if (str.equals("tradeFallGraph")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.fLIjIY);
                }
                return null;
            case -126629460:
                if (str.equals("tradeRiseTagContent")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.zDUObI);
                }
                return null;
            case -55720586:
                if (str.equals("preferenceShadedProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.RVsVBY);
                }
                return null;
            case 76913533:
                if (str.equals("highlightsContentLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QkdxfA);
                }
                return null;
            case 101376839:
                if (str.equals("highlightsInteractiveProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.hBpjJd);
                }
                return null;
            case 182154917:
                if (str.equals("highlightsFillLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.dHguZz);
                }
                return null;
            case 415462101:
                if (str.equals("preferenceShadedLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QIZEnU);
                }
                return null;
            case 426409173:
                if (str.equals("preferenceShadedNeutral")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QDqgQU);
                }
                return null;
            case 483561282:
                if (str.equals("tagContentLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.UhxbNG);
                }
                return null;
            case 488690614:
                if (str.equals("tradeFallShaded")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.gSBher);
                }
                return null;
            case 518645945:
                if (str.equals("tradeFallTinted")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.gmHjFq);
                }
                return null;
            case 532369421:
                if (str.equals("preferenceBackgroundProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DGOPHZDGOPHZ);
                }
                return null;
            case 590058198:
                if (str.equals("tradeRiseHighlightsInteractive")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.tIwhY);
                }
                return null;
            case 752478975:
                if (str.equals("tradeFall")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.aJFbMH);
                }
                return null;
            case 752844365:
                if (str.equals("tradeRise")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.sTzBva);
                }
                return null;
            case 812716702:
                if (str.equals("preferenceLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DaRZkR);
                }
                return null;
            case 836651329:
                if (str.equals("tradeFallHighlightsFill")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.fXHmeK);
                }
                return null;
            case 875932045:
                if (str.equals("tradeFallBackground")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.apNbdB);
                }
                return null;
            case 885951461:
                if (str.equals("defaultProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DCUTEI);
                }
                return null;
            case 888607969:
                if (str.equals("tagFillProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.akftKQ);
                }
                return null;
            case 908349016:
                if (str.equals("preferenceTintedLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.QXDzTk);
                }
                return null;
            case 963082915:
                if (str.equals("tagContentProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.TarCU);
                }
                return null;
            case 1012772660:
                if (str.equals("tradeRiseDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.iPSTqm);
                }
                return null;
            case 1016620062:
                if (str.equals("highlightsContentProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.RKDWNf);
                }
                return null;
            case 1162202169:
                if (str.equals("preferenceTintedProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.ULRxlR);
                }
                return null;
            case 1511044908:
                if (str.equals("preferenceBackgroundLoss")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.hCLrkq);
                }
                return null;
            case 1571830066:
                if (str.equals("graphProfit")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.OBJEWx);
                }
                return null;
            case 1649275739:
                if (str.equals("tradeRiseBackground")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.hvKCwS);
                }
                return null;
            case 1675791919:
                if (str.equals("preferenceLossAlternative")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DsrFlB);
                }
                return null;
            case 1755510338:
                if (str.equals("tradeFallDefault")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.dvImUD);
                }
                return null;
            case 2034454304:
                if (str.equals("tradeRiseAlternative")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.sVXHln);
                }
                return null;
            case 2111189806:
                if (str.equals("preferenceProfitAlternative")) {
                    return java.lang.Integer.valueOf(C52761wXj.ActionBar.DNMMPQ);
                }
                return null;
            default:
                return null;
        }
    }
}
