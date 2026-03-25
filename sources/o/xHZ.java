package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.BotWebHook;
import com.okinc.unify_trade.manager.PlaceOrderResult;
import com.okinc.unify_trade.manager.QuickOrderStatus;
import com.okinc.unify_trade.manager.UserOperationInfo;
import com.okinc.unify_trade.manager.UserQuickOrderOperation;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xHZ {
    public static java.lang.Boolean AYXKKw;
    public static TradeType EZpvd;
    public static long djBIcL;
    public static UserQuickOrderOperation fIwbmz;
    public static int fJNWhG;
    public static boolean fetchVPNInfo;
    public static java.lang.String gEmmrt;
    public static UserOperationInfo hDKMBd;
    public static java.lang.String uzCIH;
    public static boolean valueOf;
    public static java.util.ArrayList<java.lang.String> values;
    public static final xHZ KWHzl = new xHZ();
    public static java.util.ArrayList<PlaceOrderResult> AkhnZx = new java.util.ArrayList<>();
    public static java.lang.String AuCTel = "";
    public static final java.util.Set<java.lang.String> isConnected = new LinkedHashSet();
    public static QuickOrderStatus fARcdN = QuickOrderStatus.NONE;
    public static java.lang.String DbNXlk = "buy";
    public static java.lang.String ejfBZ = "";
    public static java.lang.String getNewProxyInstance = "";
    public static java.lang.String AhwBna = "NONE";
    public static java.lang.String AEQbTJ = "NONE";
    public static java.lang.String OLrzqt = "unknown";
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean OLrzqt() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserOperationInfo AkhnZx() {
        return hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        OLrzqt = "dex_trade_home_pop";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        OLrzqt = "unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean isConnected() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return valueOf;
    }

    private xHZ() {
    }

    public final void fJNWhG() {
        fetchVPNInfo = false;
        uzCIH = null;
        gEmmrt = null;
        AuCTel = "";
        AkhnZx.clear();
        djBIcL = 0L;
        hDKMBd = null;
        fIwbmz = null;
        fJNWhG = 0;
        EZpvd = null;
        AYXKKw = null;
        values = null;
        fARcdN = QuickOrderStatus.NONE;
        valueOf = false;
        if (!Intrinsics.EZpvd((java.lang.Object) AhwBna, (java.lang.Object) "setting")) {
            C54516xLh.EZpvd.OLrzqt();
        }
        AhwBna = "NONE";
        AEQbTJ = "NONE";
        isConnected.clear();
    }

    public static /* synthetic */ void setQuickOrderSource$default(xHZ xhz, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        xhz.EZpvd(str, z);
    }

    public final void EZpvd(java.lang.String str, boolean z) {
        java.lang.String str2;
        if (z || (str2 = uzCIH) == null || str2.length() == 0) {
            uzCIH = str;
        }
    }

    public final java.lang.String valueOf() {
        return C33129mqd.OLrzqt((java.lang.CharSequence) uzCIH) ? java.lang.String.valueOf(uzCIH) : "unknown";
    }

    public final java.lang.String copydefault() {
        return CollectionsKt___CollectionsKt.joinToString$default(isConnected, null, null, null, 0, null, null, 63, null);
    }

    public static /* synthetic */ void updateTradeSource$default(xHZ xhz, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        xhz.copydefault(str, str2, str3, str4);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        C49402unq.clickTrack$default("go_to_trade", C56424yEw.gEmmrt(C56390yDp.OLrzqt("source", C33129mqd.gEmmrt(str)), C56390yDp.OLrzqt("subSource", C33129mqd.gEmmrt(str3))), null, 4, null);
        fetchVPNInfo = false;
        uzCIH = str;
        gEmmrt = str2;
        ejfBZ = str3;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            AuCTel = C33129mqd.gEmmrt(str4);
        } else {
            AuCTel = C33129mqd.gEmmrt(UUID.randomUUID());
        }
        hDKMBd = new UserOperationInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, null);
        values = new java.util.ArrayList<>();
        if (!Intrinsics.EZpvd((java.lang.Object) uzCIH, (java.lang.Object) "trade_tab")) {
            SPUtils.put("key_last_enter_trade_from-" + C54589xNz.EZpvd.DbNXlk(), C33129mqd.gEmmrt(str));
        } else {
            uzCIH = SPUtils.getString("key_last_enter_trade_from-" + C54589xNz.EZpvd.DbNXlk(), "");
        }
        djBIcL = java.lang.System.currentTimeMillis();
    }

    public final void KWHzl(java.lang.String str) {
        ejfBZ();
        updateTradeSource$default(this, str, null, null, null, 14, null);
    }

    public final java.lang.String AhwBna() {
        return djBIcL == 0 ? "0" : C33129mqd.subS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(djBIcL), null, null, null, 14, null);
    }

    public final void ejfBZ() {
        java.lang.String str = uzCIH;
        if (str == null || str.length() == 0) {
            uzCIH = "unknown";
        }
        java.util.ArrayList<java.lang.String> arrayList = values;
        java.lang.String str2 = null;
        java.lang.String strJoinToString$default = arrayList != null ? CollectionsKt___CollectionsKt.joinToString$default(arrayList, "-", null, null, 0, null, null, 62, null) : null;
        if (strJoinToString$default != null && C59449zhJ.endsWith$default(strJoinToString$default, "placeOrder", false, 2, null)) {
            str2 = strJoinToString$default;
        }
        C54515xLg.OLrzqt.copydefault(C33129mqd.gEmmrt(uzCIH), AuCTel, str2);
        fJNWhG();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [416=42] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        UserOperationInfo userOperationInfo;
        UserOperationInfo userOperationInfo2;
        UserOperationInfo userOperationInfo3;
        UserOperationInfo userOperationInfo4;
        UserQuickOrderOperation userQuickOrderOperation;
        UserOperationInfo userOperationInfo5;
        UserOperationInfo userOperationInfo6;
        UserOperationInfo userOperationInfo7;
        UserOperationInfo userOperationInfo8;
        UserOperationInfo userOperationInfo9;
        UserQuickOrderOperation userQuickOrderOperation2;
        UserOperationInfo userOperationInfo10;
        UserOperationInfo userOperationInfo11;
        UserOperationInfo userOperationInfo12;
        UserQuickOrderOperation userQuickOrderOperation3;
        UserOperationInfo userOperationInfo13;
        UserOperationInfo userOperationInfo14;
        UserOperationInfo userOperationInfo15;
        UserOperationInfo userOperationInfo16;
        UserOperationInfo userOperationInfo17;
        UserOperationInfo userOperationInfo18;
        UserQuickOrderOperation userQuickOrderOperation4;
        UserOperationInfo userOperationInfo19;
        UserOperationInfo userOperationInfo20;
        UserQuickOrderOperation userQuickOrderOperation5;
        UserOperationInfo userOperationInfo21;
        UserOperationInfo userOperationInfo22;
        UserQuickOrderOperation userQuickOrderOperation6;
        UserOperationInfo userOperationInfo23;
        UserOperationInfo userOperationInfo24;
        UserQuickOrderOperation userQuickOrderOperation7;
        UserQuickOrderOperation userQuickOrderOperation8;
        UserOperationInfo userOperationInfo25;
        UserOperationInfo userOperationInfo26;
        UserOperationInfo userOperationInfo27;
        UserOperationInfo userOperationInfo28;
        java.util.ArrayList<java.lang.String> arrayList;
        Intrinsics.checkNotNullParameter(map, "");
        if (hDKMBd == null) {
            hDKMBd = new UserOperationInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, null);
        }
        if (fIwbmz == null) {
            fIwbmz = new UserQuickOrderOperation(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1023, null);
        }
        java.lang.String str = map.get("extra_params");
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = map.get("event_type");
        if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "view_click")) {
            if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "view_dialog")) {
                java.lang.String str4 = map.get("page");
                java.lang.String str5 = map.get(BotWebHook.KEY_ACTION);
                if ((Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "OrderConfirmNewFragment") || Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "OrderConfirmFragment")) && Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) EopTrackEvent.EXIT) && OLrzqt() && StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "isClickConfrim:false", false, 2, (java.lang.Object) null)) {
                    fARcdN = QuickOrderStatus.CANCEL_CONFIRM;
                }
                return;
            }
            return;
        }
        java.lang.String str6 = map.get("button_type");
        java.lang.String strAEQbTJ = AEQbTJ(str6, EZpvd(str2));
        if (strAEQbTJ != null) {
            java.util.ArrayList<java.lang.String> arrayList2 = values;
            if (C33129mqd.gEmmrt(arrayList2 != null ? java.lang.Integer.valueOf(arrayList2.size()) : null, 15) && (arrayList = values) != null) {
                arrayList.add(strAEQbTJ);
            }
        }
        if (str6 != null) {
            switch (str6.hashCode()) {
                case -2131445451:
                    if (str6.equals("leverage") && (userOperationInfo = hDKMBd) != null) {
                        userOperationInfo.clickPositionList();
                    }
                    break;
                case -2036129209:
                    if (str6.equals("asset_list_tpsl") && (userOperationInfo2 = hDKMBd) != null) {
                        userOperationInfo2.clickAssetList();
                    }
                    break;
                case -2027745761:
                    if (str6.equals("reduce_only_checked_state") && (userOperationInfo3 = hDKMBd) != null) {
                        userOperationInfo3.clickReduceOnly();
                    }
                    break;
                case -1977109322:
                    if (str6.equals("click_depth_mode") && (userOperationInfo4 = hDKMBd) != null) {
                        userOperationInfo4.clickDepthMode();
                    }
                    break;
                case -1549391929:
                    if (str6.equals("seek_bar_drag")) {
                        UserOperationInfo userOperationInfo29 = hDKMBd;
                        if (userOperationInfo29 != null) {
                            userOperationInfo29.dragSeekBar();
                        }
                        if (OLrzqt() && (userQuickOrderOperation = fIwbmz) != null) {
                            userQuickOrderOperation.dragSeekBar();
                            break;
                        }
                    }
                    break;
                case -1416502435:
                    if (str6.equals("asset_list_transfer") && (userOperationInfo5 = hDKMBd) != null) {
                        userOperationInfo5.clickAssetList();
                    }
                    break;
                case -1379119044:
                    if (str6.equals("modify_order_entry") && (userOperationInfo6 = hDKMBd) != null) {
                        userOperationInfo6.modifyOrder();
                    }
                    break;
                case -1107802228:
                    if (str6.equals("tpslAll") && (userOperationInfo7 = hDKMBd) != null) {
                        userOperationInfo7.clickPositionList();
                    }
                    break;
                case -1081309778:
                    if (str6.equals("margin") && (userOperationInfo8 = hDKMBd) != null) {
                        userOperationInfo8.clickPositionList();
                    }
                    break;
                case -889661244:
                    if (str6.equals("switch_sell_buy")) {
                        UserOperationInfo userOperationInfo30 = hDKMBd;
                        if (userOperationInfo30 != null) {
                            userOperationInfo30.switchBuySell();
                        }
                        if (OLrzqt()) {
                            UserQuickOrderOperation userQuickOrderOperation9 = fIwbmz;
                            if (userQuickOrderOperation9 != null) {
                                userQuickOrderOperation9.switchBuySell();
                            }
                            DbNXlk = StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "current_side:SELL_CLOSE", false, 2, (java.lang.Object) null) ? "sell" : "buy";
                        }
                        break;
                    }
                    break;
                case -805995103:
                    if (str6.equals("goToTrade") && (userOperationInfo9 = hDKMBd) != null) {
                        userOperationInfo9.clickPositionList();
                    }
                    break;
                case -727972886:
                    if (str6.equals("oppo_price")) {
                        UserOperationInfo userOperationInfo31 = hDKMBd;
                        if (userOperationInfo31 != null) {
                            userOperationInfo31.oppoPrice();
                        }
                        if (OLrzqt() && (userQuickOrderOperation2 = fIwbmz) != null) {
                            userQuickOrderOperation2.oppoPrice();
                            break;
                        }
                    }
                    break;
                case -709826908:
                    if (str6.equals("select_bottom_tab") && (userOperationInfo10 = hDKMBd) != null) {
                        userOperationInfo10.changeBottomTab();
                    }
                    break;
                case -489721649:
                    if (str6.equals("switch_order_type_enter") && (userOperationInfo11 = hDKMBd) != null) {
                        userOperationInfo11.clickOrderType();
                    }
                    break;
                case -398393218:
                    if (str6.equals("kline_state_change")) {
                        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "state:open", false, 2, (java.lang.Object) null)) {
                            UserOperationInfo userOperationInfo32 = hDKMBd;
                            if (userOperationInfo32 != null) {
                                userOperationInfo32.hideKline();
                            }
                        } else {
                            UserOperationInfo userOperationInfo33 = hDKMBd;
                            if (userOperationInfo33 != null) {
                                userOperationInfo33.showKline();
                            }
                        }
                        break;
                    }
                    break;
                case -322951825:
                    if (str6.equals("manualRepay") && (userOperationInfo12 = hDKMBd) != null) {
                        userOperationInfo12.clickPositionList();
                    }
                    break;
                case -148956933:
                    if (str6.equals("price_input_change")) {
                        UserOperationInfo userOperationInfo34 = hDKMBd;
                        if (userOperationInfo34 != null) {
                            userOperationInfo34.changeInputPrice();
                        }
                        if (OLrzqt() && OLrzqt(str2) && (userQuickOrderOperation3 = fIwbmz) != null) {
                            userQuickOrderOperation3.changeInputPrice();
                            break;
                        }
                    }
                    break;
                case -53142656:
                    if (str6.equals("asset_list_modify_cost") && (userOperationInfo13 = hDKMBd) != null) {
                        userOperationInfo13.clickAssetList();
                    }
                    break;
                case 96425:
                    if (str6.equals("adl") && (userOperationInfo14 = hDKMBd) != null) {
                        userOperationInfo14.clickPositionList();
                    }
                    break;
                case 94756344:
                    if (str6.equals(EopTrackEvent.CLOSE) && (userOperationInfo15 = hDKMBd) != null) {
                        userOperationInfo15.clickPositionList();
                    }
                    break;
                case 109400031:
                    if (str6.equals("share") && (userOperationInfo16 = hDKMBd) != null) {
                        userOperationInfo16.clickPositionList();
                    }
                    break;
                case 145676342:
                    if (str6.equals("modify_depth_level_entry") && (userOperationInfo17 = hDKMBd) != null) {
                        userOperationInfo17.clickDephtLevel();
                    }
                    break;
                case 377561393:
                    if (str6.equals("close_mkt_all") && (userOperationInfo18 = hDKMBd) != null) {
                        userOperationInfo18.clickPositionList();
                    }
                    break;
                case 544855332:
                    if (str6.equals("margin_swtch")) {
                        UserOperationInfo userOperationInfo35 = hDKMBd;
                        if (userOperationInfo35 != null) {
                            userOperationInfo35.clickMarginSwitch();
                        }
                        if (OLrzqt() && (userQuickOrderOperation4 = fIwbmz) != null) {
                            userQuickOrderOperation4.clickMarginSwitch();
                            break;
                        }
                    }
                    break;
                case 578922585:
                    if (str6.equals("switchAccount") && (userOperationInfo19 = hDKMBd) != null) {
                        userOperationInfo19.clickPositionList();
                    }
                    break;
                case 596919741:
                    if (str6.equals("make_order") && OLrzqt()) {
                        fARcdN = fARcdN.nextStep(QuickOrderStatus.ORDER_CHECK_PASS);
                        DbNXlk = StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "side=buy", false, 2, (java.lang.Object) null) ? "buy" : "sell";
                    }
                    break;
                case 613439709:
                    if (str6.equals("asset_list_buy_sell") && (userOperationInfo20 = hDKMBd) != null) {
                        userOperationInfo20.clickAssetList();
                    }
                    break;
                case 623094428:
                    if (str6.equals("switch_mgn_mode_entrance")) {
                        UserOperationInfo userOperationInfo36 = hDKMBd;
                        if (userOperationInfo36 != null) {
                            userOperationInfo36.clickMarginMode();
                        }
                        if (OLrzqt() && (userQuickOrderOperation5 = fIwbmz) != null) {
                            userQuickOrderOperation5.clickMarginMode();
                            break;
                        }
                    }
                    break;
                case 830604816:
                    if (str6.equals("manualTransferAll") && (userOperationInfo21 = hDKMBd) != null) {
                        userOperationInfo21.clickPositionList();
                    }
                    break;
                case 1032977564:
                    if (str6.equals("confirm_make_order") && OLrzqt()) {
                        fARcdN = fARcdN.nextStep(QuickOrderStatus.MAKE_CONFIRM);
                    }
                    break;
                case 1162888463:
                    if (str6.equals("tpsl_checked_state") && (userOperationInfo22 = hDKMBd) != null) {
                        userOperationInfo22.clickTpsl();
                    }
                    break;
                case 1280882667:
                    if (str6.equals(ExtJson.BRC20TYPE_TRANSFER)) {
                        UserOperationInfo userOperationInfo37 = hDKMBd;
                        if (userOperationInfo37 != null) {
                            userOperationInfo37.clickTransfer();
                        }
                        if (OLrzqt() && (userQuickOrderOperation6 = fIwbmz) != null) {
                            userQuickOrderOperation6.clickTransfer();
                            break;
                        }
                    }
                    break;
                case 1303325101:
                    if (str6.equals("asset_list_share") && (userOperationInfo23 = hDKMBd) != null) {
                        userOperationInfo23.clickAssetList();
                    }
                    break;
                case 1316714563:
                    if (str6.equals("asset_list_detail") && (userOperationInfo24 = hDKMBd) != null) {
                        userOperationInfo24.clickAssetList();
                    }
                    break;
                case 1346218572:
                    if (str6.equals("amount_input_change") && !EZpvd(str2)) {
                        UserOperationInfo userOperationInfo38 = hDKMBd;
                        if (userOperationInfo38 != null) {
                            userOperationInfo38.changeInputAmount();
                        }
                        if (OLrzqt() && OLrzqt(str2) && (userQuickOrderOperation7 = fIwbmz) != null) {
                            userQuickOrderOperation7.changeInputAmount();
                            break;
                        }
                    }
                    break;
                case 1578663615:
                    if (str6.equals("switch_lever")) {
                        UserOperationInfo userOperationInfo39 = hDKMBd;
                        if (userOperationInfo39 != null) {
                            userOperationInfo39.clickLeverage();
                        }
                        if (OLrzqt() && (userQuickOrderOperation8 = fIwbmz) != null) {
                            userQuickOrderOperation8.clickLeverage();
                            break;
                        }
                    }
                    break;
                case 1615282284:
                    if (str6.equals("stopOrder") && (userOperationInfo25 = hDKMBd) != null) {
                        userOperationInfo25.clickPositionList();
                    }
                    break;
                case 1671081292:
                    if (str6.equals("click_depth")) {
                        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "isClickAmount:true", false, 2, (java.lang.Object) null)) {
                            UserOperationInfo userOperationInfo40 = hDKMBd;
                            if (userOperationInfo40 != null) {
                                userOperationInfo40.clickDepthPrice();
                            }
                        } else {
                            UserOperationInfo userOperationInfo41 = hDKMBd;
                            if (userOperationInfo41 != null) {
                                userOperationInfo41.clickDepthAmount();
                            }
                        }
                        break;
                    }
                    break;
                case 1704360404:
                    if (str6.equals("cancel_order_list") && (userOperationInfo26 = hDKMBd) != null) {
                        userOperationInfo26.cancelOrder();
                    }
                    break;
                case 1799974499:
                    if (str6.equals("order_list_item") && (userOperationInfo27 = hDKMBd) != null) {
                        userOperationInfo27.orderItem();
                    }
                    break;
                case 1873267594:
                    if (str6.equals("make_order_before_check")) {
                        UserOperationInfo userOperationInfo42 = hDKMBd;
                        if (userOperationInfo42 != null) {
                            userOperationInfo42.makeOrderClick();
                        }
                        if (OLrzqt()) {
                            UserQuickOrderOperation userQuickOrderOperation10 = fIwbmz;
                            if (userQuickOrderOperation10 != null) {
                                userQuickOrderOperation10.makeOrderClick();
                            }
                            fARcdN = fARcdN.nextStep(QuickOrderStatus.CLICK_ORDER);
                        }
                        break;
                    }
                    break;
                case 2010493754:
                    if (str6.equals("asset_list_cost_type") && (userOperationInfo28 = hDKMBd) != null) {
                        userOperationInfo28.clickAssetList();
                    }
                    break;
            }
        }
    }

    public static final boolean OLrzqt(java.lang.String str) {
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "isFocus:true", false, 2, (java.lang.Object) null);
    }

    public static final boolean EZpvd(java.lang.String str) {
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "isPercentSelect:true", false, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String AEQbTJ(java.lang.String str, boolean z) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2027745761:
                    if (str.equals("reduce_only_checked_state")) {
                        return "reduceOnly";
                    }
                    break;
                case -1549391929:
                    if (str.equals("seek_bar_drag")) {
                        return "seekBar";
                    }
                    break;
                case -889661244:
                    if (str.equals("switch_sell_buy")) {
                        return "buySell";
                    }
                    break;
                case -727972886:
                    if (str.equals("oppo_price")) {
                        return "oppoPrice";
                    }
                    break;
                case -489721649:
                    if (str.equals("switch_order_type_enter")) {
                        return "orderType";
                    }
                    break;
                case -148956933:
                    if (str.equals("price_input_change")) {
                        return FirebaseAnalytics.Param.PRICE;
                    }
                    break;
                case 544855332:
                    if (str.equals("margin_swtch")) {
                        return "marginSwitch";
                    }
                    break;
                case 623094428:
                    if (str.equals("switch_mgn_mode_entrance")) {
                        return "mgnMode";
                    }
                    break;
                case 1162888463:
                    if (str.equals("tpsl_checked_state")) {
                        return "tpslCb";
                    }
                    break;
                case 1280882667:
                    if (str.equals(ExtJson.BRC20TYPE_TRANSFER)) {
                        return ExtJson.BRC20TYPE_TRANSFER;
                    }
                    break;
                case 1346218572:
                    if (str.equals("amount_input_change") && !z) {
                        return OtcExtraKeys.AMOUNT;
                    }
                    break;
                case 1578663615:
                    if (str.equals("switch_lever")) {
                        return "leverage";
                    }
                    break;
                case 1699352971:
                    if (str.equals("tpsl_advance_entry")) {
                        return "tpslAdvance";
                    }
                    break;
                case 1873267594:
                    if (str.equals("make_order_before_check")) {
                        return "placeOrder";
                    }
                    break;
            }
        }
        return null;
    }

    public final java.lang.String gEmmrt() {
        if (!Intrinsics.EZpvd((java.lang.Object) uzCIH, (java.lang.Object) "trade_tab")) {
            return gEmmrt;
        }
        return SPUtils.getString("key_last_enter_trade_from-" + C54589xNz.EZpvd.DbNXlk(), "");
    }
}
