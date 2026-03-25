package o;

import androidx.core.view.PointerIconCompat;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.SpotDcaInvestTypeData;
import com.okinc.unify_trade.bot.constant.TacticsForbiddenFunctions;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.util.StrategyInfoOperatorBean;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xuX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55998xuX {
    public static final C55998xuX copydefault = new C55998xuX();

    private C55998xuX() {
    }

    public final java.util.List<java.lang.String> KWHzl() {
        return yDY.gEmmrt("infinite_grid", "lvf_buy", "lvf_sell");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [81=16] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01bd, code lost:
    
        if (r1.equals("lvf_buy") == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0208, code lost:
    
        if (r1.equals("lvf_sell") == false) goto L171;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.util.List<TacticsListButtonItem>, java.util.List<TacticsListButtonItem>> AkhnZx(@NotNull final StrategyInfoOperatorBean strategyInfoOperatorBean) {
        Intrinsics.checkNotNullParameter(strategyInfoOperatorBean, "");
        TacticsListButtonItem tacticsListButtonItemOLrzqt = OLrzqt(strategyInfoOperatorBean.KWHzl());
        java.util.List listFARcdN = null;
        if (tacticsListButtonItemOLrzqt != null) {
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.add(tacticsListButtonItemOLrzqt);
            if (!strategyInfoOperatorBean.AhwBna() && !Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "stopping")) {
                listOLrzqt.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
            return C56390yDp.OLrzqt(C56402yEa.fARcdN(listOLrzqt), null);
        }
        java.lang.String strCopydefault = strategyInfoOperatorBean.copydefault();
        switch (strCopydefault.hashCode()) {
            case -1831183611:
                if (strCopydefault.equals("spot_dca")) {
                    if (strategyInfoOperatorBean.AhwBna()) {
                        return C56390yDp.OLrzqt(fJNWhG(strategyInfoOperatorBean), null);
                    }
                    TacticsListButtonItem[] tacticsListButtonItemArr = new TacticsListButtonItem[3];
                    tacticsListButtonItemArr[0] = new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    tacticsListButtonItemArr[1] = new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    tacticsListButtonItemArr[2] = strategyInfoOperatorBean.fetchVPNInfo() ? new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null) : new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    java.util.List listGEmmrt = yDY.gEmmrt(tacticsListButtonItemArr);
                    java.util.ArrayList<TacticsListButtonItem> arrayListFJNWhG = fJNWhG(strategyInfoOperatorBean);
                    C56406yEe.AEQbTJ(arrayListFJNWhG, new Function1() { // from class: o.xuV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C55998xuX.AuCTel(strategyInfoOperatorBean, (TacticsListButtonItem) obj));
                        }
                    });
                    return C56390yDp.OLrzqt(listGEmmrt, arrayListFJNWhG);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case -1574173039:
                if (strCopydefault.equals("infinite_grid")) {
                    if (strategyInfoOperatorBean.AhwBna()) {
                        return C56390yDp.OLrzqt(valueOf(strategyInfoOperatorBean), null);
                    }
                    TacticsListButtonItem[] tacticsListButtonItemArr2 = new TacticsListButtonItem[3];
                    tacticsListButtonItemArr2[0] = new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    tacticsListButtonItemArr2[1] = new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    tacticsListButtonItemArr2[2] = strategyInfoOperatorBean.fetchVPNInfo() ? new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null) : new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    java.util.List listGEmmrt2 = yDY.gEmmrt(tacticsListButtonItemArr2);
                    java.util.ArrayList<TacticsListButtonItem> arrayListValueOf = valueOf(strategyInfoOperatorBean);
                    C56406yEe.AEQbTJ(arrayListValueOf, new Function1() { // from class: o.xuY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C55998xuX.DbNXlk(strategyInfoOperatorBean, (TacticsListButtonItem) obj));
                        }
                    });
                    return C56390yDp.OLrzqt(listGEmmrt2, arrayListValueOf);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case -1402017003:
                if (strCopydefault.equals("contract_dca")) {
                    if (strategyInfoOperatorBean.AhwBna()) {
                        return C56390yDp.OLrzqt(KWHzl(strategyInfoOperatorBean), null);
                    }
                    TacticsListButtonItem[] tacticsListButtonItemArr3 = new TacticsListButtonItem[3];
                    tacticsListButtonItemArr3[0] = new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    tacticsListButtonItemArr3[1] = new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    tacticsListButtonItemArr3[2] = strategyInfoOperatorBean.fetchVPNInfo() ? new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null) : new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    java.util.List listGEmmrt3 = yDY.gEmmrt(tacticsListButtonItemArr3);
                    java.util.ArrayList<TacticsListButtonItem> arrayListKWHzl = KWHzl(strategyInfoOperatorBean);
                    C56406yEe.AEQbTJ(arrayListKWHzl, new Function1() { // from class: o.xuZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C55998xuX.isConnected(strategyInfoOperatorBean, (TacticsListButtonItem) obj));
                        }
                    });
                    return C56390yDp.OLrzqt(listGEmmrt3, arrayListKWHzl);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case -1216369070:
                if (strCopydefault.equals("smart_portfolio")) {
                    if (strategyInfoOperatorBean.AhwBna()) {
                        return C56390yDp.OLrzqt(EZpvd(strategyInfoOperatorBean), null);
                    }
                    TacticsListButtonItem[] tacticsListButtonItemArr4 = new TacticsListButtonItem[3];
                    tacticsListButtonItemArr4[0] = new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    tacticsListButtonItemArr4[1] = new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    tacticsListButtonItemArr4[2] = strategyInfoOperatorBean.fetchVPNInfo() ? new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null) : new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    java.util.List listGEmmrt4 = yDY.gEmmrt(tacticsListButtonItemArr4);
                    java.util.ArrayList<TacticsListButtonItem> arrayListEZpvd = EZpvd(strategyInfoOperatorBean);
                    C56406yEe.AEQbTJ(arrayListEZpvd, new Function1() { // from class: o.xvb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C55998xuX.fARcdN(strategyInfoOperatorBean, (TacticsListButtonItem) obj));
                        }
                    });
                    return C56390yDp.OLrzqt(listGEmmrt4, arrayListEZpvd);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case -1148661171:
                if (strCopydefault.equals("smart_iceberg")) {
                    if (strategyInfoOperatorBean.fetchVPNInfo()) {
                        java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
                        if (!strategyInfoOperatorBean.AhwBna()) {
                            listOLrzqt2.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                        }
                        return C56390yDp.OLrzqt(C56402yEa.fARcdN(listOLrzqt2), null);
                    }
                    java.util.List listOLrzqt3 = C56402yEa.OLrzqt();
                    if (!strategyInfoOperatorBean.AhwBna()) {
                        listOLrzqt3.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "pending_signal")) {
                        listOLrzqt3.add(new TacticsListButtonItem("strategy_button_start", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                        if (strategyInfoOperatorBean.AhwBna()) {
                            listOLrzqt3.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                        }
                    } else {
                        listOLrzqt3.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    }
                    listOLrzqt3.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    java.util.List listFARcdN2 = C56402yEa.fARcdN(listOLrzqt3);
                    if (Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "pending_signal") && !strategyInfoOperatorBean.AhwBna()) {
                        java.util.List listOLrzqt4 = C56402yEa.OLrzqt();
                        listOLrzqt4.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                        listFARcdN = C56402yEa.fARcdN(listOLrzqt4);
                    }
                    return C56390yDp.OLrzqt(listFARcdN2, listFARcdN);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case -1086683216:
                if (strCopydefault.equals("signal_bot")) {
                    if (strategyInfoOperatorBean.AhwBna()) {
                        return C56390yDp.OLrzqt(values(strategyInfoOperatorBean), null);
                    }
                    java.util.List listOLrzqt5 = C56402yEa.OLrzqt();
                    listOLrzqt5.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    listOLrzqt5.add(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    if (!strategyInfoOperatorBean.fetchVPNInfo()) {
                        listOLrzqt5.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    }
                    java.util.List listFARcdN3 = C56402yEa.fARcdN(listOLrzqt5);
                    java.util.ArrayList<TacticsListButtonItem> arrayListValues = values(strategyInfoOperatorBean);
                    C56406yEe.AEQbTJ(arrayListValues, new Function1() { // from class: o.xvd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C55998xuX.AkhnZx(strategyInfoOperatorBean, (TacticsListButtonItem) obj));
                        }
                    });
                    return C56390yDp.OLrzqt(listFARcdN3, arrayListValues);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case -591806012:
                if (strCopydefault.equals("moon_grid")) {
                    if (strategyInfoOperatorBean.AhwBna()) {
                        return C56390yDp.OLrzqt(gEmmrt(strategyInfoOperatorBean), null);
                    }
                    TacticsListButtonItem[] tacticsListButtonItemArr5 = new TacticsListButtonItem[3];
                    tacticsListButtonItemArr5[0] = new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    tacticsListButtonItemArr5[1] = new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    tacticsListButtonItemArr5[2] = strategyInfoOperatorBean.fetchVPNInfo() ? new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null) : new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                    java.util.List listGEmmrt5 = yDY.gEmmrt(tacticsListButtonItemArr5);
                    java.util.ArrayList<TacticsListButtonItem> arrayListGEmmrt = gEmmrt(strategyInfoOperatorBean);
                    C56406yEe.AEQbTJ(arrayListGEmmrt, new Function1() { // from class: o.xuW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C55998xuX.fJNWhG(strategyInfoOperatorBean, (TacticsListButtonItem) obj));
                        }
                    });
                    return C56390yDp.OLrzqt(listGEmmrt5, arrayListGEmmrt);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case -557961837:
                if (strCopydefault.equals("smart_arbitrage")) {
                    return fetchVPNInfo(strategyInfoOperatorBean);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case -512749997:
                if (strCopydefault.equals("contract_grid")) {
                    return OLrzqt(strategyInfoOperatorBean);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case -392358507:
                break;
            case 3181382:
                if (strCopydefault.equals("grid")) {
                    return copydefault(strategyInfoOperatorBean);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case 3573234:
                if (strCopydefault.equals("twap")) {
                    java.util.ArrayList<TacticsListButtonItem> arrayListEjfBZ = ejfBZ(strategyInfoOperatorBean);
                    java.util.List listOLrzqt6 = C56402yEa.OLrzqt();
                    if (!strategyInfoOperatorBean.AhwBna()) {
                        listOLrzqt6.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    }
                    return C56390yDp.OLrzqt(arrayListEjfBZ, C56402yEa.fARcdN(listOLrzqt6));
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case 541516771:
                break;
            case 1165749981:
                if (strCopydefault.equals("recurring")) {
                    java.util.List listOLrzqt7 = C56402yEa.OLrzqt();
                    if (!strategyInfoOperatorBean.AhwBna()) {
                        listOLrzqt7.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    }
                    listOLrzqt7.add(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    if (!strategyInfoOperatorBean.fetchVPNInfo()) {
                        listOLrzqt7.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    }
                    java.util.List listFARcdN4 = C56402yEa.fARcdN(listOLrzqt7);
                    java.util.ArrayList<TacticsListButtonItem> arrayListDbNXlk = DbNXlk(strategyInfoOperatorBean);
                    C56406yEe.AEQbTJ(arrayListDbNXlk, new Function1() { // from class: o.xvc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C55998xuX.fetchVPNInfo(strategyInfoOperatorBean, (TacticsListButtonItem) obj));
                        }
                    });
                    return C56390yDp.OLrzqt(listFARcdN4, arrayListDbNXlk);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case 1485620813:
                if (strCopydefault.equals("dcd_bot")) {
                    if (strategyInfoOperatorBean.AhwBna()) {
                        java.util.ArrayList<TacticsListButtonItem> arrayListAYXKKw = AYXKKw(strategyInfoOperatorBean);
                        if (!strategyInfoOperatorBean.fetchVPNInfo()) {
                            arrayListAYXKKw.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                        }
                        return C56390yDp.OLrzqt(arrayListAYXKKw, null);
                    }
                    java.util.List listOLrzqt8 = C56402yEa.OLrzqt();
                    listOLrzqt8.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    listOLrzqt8.add(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    if (!strategyInfoOperatorBean.fetchVPNInfo()) {
                        listOLrzqt8.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    }
                    java.util.List listFARcdN5 = C56402yEa.fARcdN(listOLrzqt8);
                    java.util.List listOLrzqt9 = C56402yEa.OLrzqt();
                    if (!strategyInfoOperatorBean.fetchVPNInfo()) {
                        if (strategyInfoOperatorBean.AkhnZx()) {
                            listOLrzqt9.add(new TacticsListButtonItem("strategy_reserve_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                        } else {
                            listOLrzqt9.add(new TacticsListButtonItem("strategy_cancel_reserve", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                        }
                    }
                    return C56390yDp.OLrzqt(listFARcdN5, C56402yEa.fARcdN(listOLrzqt9));
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case 1629187779:
                if (strCopydefault.equals("iceberg")) {
                    if (strategyInfoOperatorBean.AhwBna()) {
                        return C56390yDp.OLrzqt(fIwbmz(strategyInfoOperatorBean), null);
                    }
                    java.util.List listOLrzqt10 = C56402yEa.OLrzqt();
                    listOLrzqt10.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    if (!strategyInfoOperatorBean.fetchVPNInfo()) {
                        listOLrzqt10.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                    }
                    return C56390yDp.OLrzqt(C56402yEa.fARcdN(listOLrzqt10), null);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            case 1780188297:
                if (strCopydefault.equals("arbitrage")) {
                    return C56390yDp.OLrzqt(AuCTel(strategyInfoOperatorBean), null);
                }
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
            default:
                return C56390yDp.OLrzqt(yDY.AhwBna(), null);
        }
        return C56390yDp.OLrzqt(isConnected(strategyInfoOperatorBean), null);
    }

    public static final boolean DbNXlk(StrategyInfoOperatorBean strategyInfoOperatorBean, TacticsListButtonItem tacticsListButtonItem) {
        Intrinsics.checkNotNullParameter(tacticsListButtonItem, "");
        return !strategyInfoOperatorBean.fetchVPNInfo() ? !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_more") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "MORE_FUNC")) : !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_recreate"));
    }

    public static final boolean fJNWhG(StrategyInfoOperatorBean strategyInfoOperatorBean, TacticsListButtonItem tacticsListButtonItem) {
        Intrinsics.checkNotNullParameter(tacticsListButtonItem, "");
        return !strategyInfoOperatorBean.fetchVPNInfo() ? !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_more") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "MORE_FUNC")) : !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_recreate"));
    }

    public static final boolean AuCTel(StrategyInfoOperatorBean strategyInfoOperatorBean, TacticsListButtonItem tacticsListButtonItem) {
        Intrinsics.checkNotNullParameter(tacticsListButtonItem, "");
        return !strategyInfoOperatorBean.fetchVPNInfo() ? !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_more") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "MORE_FUNC")) : !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_recreate"));
    }

    public static final boolean fARcdN(StrategyInfoOperatorBean strategyInfoOperatorBean, TacticsListButtonItem tacticsListButtonItem) {
        Intrinsics.checkNotNullParameter(tacticsListButtonItem, "");
        return !strategyInfoOperatorBean.fetchVPNInfo() ? !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_more") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "MORE_FUNC")) : !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_recreate"));
    }

    public static final boolean isConnected(StrategyInfoOperatorBean strategyInfoOperatorBean, TacticsListButtonItem tacticsListButtonItem) {
        Intrinsics.checkNotNullParameter(tacticsListButtonItem, "");
        return !strategyInfoOperatorBean.fetchVPNInfo() ? !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_more") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "MORE_FUNC")) : !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_recreate"));
    }

    public static final boolean fetchVPNInfo(StrategyInfoOperatorBean strategyInfoOperatorBean, TacticsListButtonItem tacticsListButtonItem) {
        Intrinsics.checkNotNullParameter(tacticsListButtonItem, "");
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            return Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details");
        }
        return Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_more") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "MORE_FUNC");
    }

    public static final boolean AkhnZx(StrategyInfoOperatorBean strategyInfoOperatorBean, TacticsListButtonItem tacticsListButtonItem) {
        Intrinsics.checkNotNullParameter(tacticsListButtonItem, "");
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            return Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details");
        }
        return Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_more") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "MORE_FUNC");
    }

    public final kotlin.Pair<java.util.List<TacticsListButtonItem>, java.util.List<TacticsListButtonItem>> fetchVPNInfo(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        if (strategyInfoOperatorBean.AhwBna()) {
            return C56390yDp.OLrzqt(C56402yEa.EZpvd(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null)), null);
        }
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        listOLrzqt.add(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        if (!strategyInfoOperatorBean.fetchVPNInfo()) {
            listOLrzqt.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
        listOLrzqt2.add(new TacticsListButtonItem("strategy_button_adjust_withdrawal", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        if (Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "running")) {
            listOLrzqt2.add(new TacticsListButtonItem("SMART_ARB_REDUCE_POSITION", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        listOLrzqt2.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        return C56390yDp.OLrzqt(listFARcdN, C56402yEa.fARcdN(listOLrzqt2));
    }

    public final kotlin.Pair<java.util.List<TacticsListButtonItem>, java.util.List<TacticsListButtonItem>> copydefault(final StrategyInfoOperatorBean strategyInfoOperatorBean) {
        if (strategyInfoOperatorBean.AhwBna()) {
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.add(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            if (!strategyInfoOperatorBean.fetchVPNInfo() && !Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "stopped")) {
                listOLrzqt.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            } else if (!Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.OLrzqt(), (java.lang.Object) "2")) {
                listOLrzqt.add(new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
            java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
            java.util.ArrayList<TacticsListButtonItem> arrayListValueOf = valueOf(strategyInfoOperatorBean);
            C56406yEe.AEQbTJ(arrayListValueOf, new Function1() { // from class: o.xva
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C55998xuX.AhwBna(strategyInfoOperatorBean, (TacticsListButtonItem) obj));
                }
            });
            return C56390yDp.OLrzqt(listFARcdN, arrayListValueOf);
        }
        java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
        listOLrzqt2.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        listOLrzqt2.add(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            if (!Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.OLrzqt(), (java.lang.Object) "2")) {
                listOLrzqt2.add(new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
        } else {
            listOLrzqt2.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        java.util.List listFARcdN2 = C56402yEa.fARcdN(listOLrzqt2);
        java.util.ArrayList<TacticsListButtonItem> arrayListValueOf2 = valueOf(strategyInfoOperatorBean);
        C56406yEe.AEQbTJ(arrayListValueOf2, new Function1() { // from class: o.xvh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C55998xuX.values(strategyInfoOperatorBean, (TacticsListButtonItem) obj));
            }
        });
        return C56390yDp.OLrzqt(listFARcdN2, arrayListValueOf2);
    }

    public static final boolean AhwBna(StrategyInfoOperatorBean strategyInfoOperatorBean, TacticsListButtonItem tacticsListButtonItem) {
        Intrinsics.checkNotNullParameter(tacticsListButtonItem, "");
        return !strategyInfoOperatorBean.fetchVPNInfo() ? !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_more") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "MORE_FUNC")) : !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_recreate"));
    }

    public static final boolean values(StrategyInfoOperatorBean strategyInfoOperatorBean, TacticsListButtonItem tacticsListButtonItem) {
        Intrinsics.checkNotNullParameter(tacticsListButtonItem, "");
        return !strategyInfoOperatorBean.fetchVPNInfo() ? !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_more") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "MORE_FUNC")) : !(Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_details") || Intrinsics.EZpvd((java.lang.Object) tacticsListButtonItem.AEQbTJ(), (java.lang.Object) "strategy_button_recreate"));
    }

    public final kotlin.Pair<java.util.List<TacticsListButtonItem>, java.util.List<TacticsListButtonItem>> OLrzqt(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        if (strategyInfoOperatorBean.AhwBna()) {
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.add(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            if (!strategyInfoOperatorBean.fetchVPNInfo() && !Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "stopped")) {
                listOLrzqt.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            } else if (!Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.OLrzqt(), (java.lang.Object) "2")) {
                listOLrzqt.add(new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
            return C56390yDp.OLrzqt(C56402yEa.fARcdN(listOLrzqt), AhwBna(strategyInfoOperatorBean));
        }
        java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
        listOLrzqt2.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        listOLrzqt2.add(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            if (!Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.OLrzqt(), (java.lang.Object) "2")) {
                listOLrzqt2.add(new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
        } else {
            listOLrzqt2.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        return C56390yDp.OLrzqt(C56402yEa.fARcdN(listOLrzqt2), AhwBna(strategyInfoOperatorBean));
    }

    public final java.util.ArrayList<TacticsListButtonItem> AYXKKw(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        java.util.ArrayList<TacticsListButtonItem> arrayList = new java.util.ArrayList<>();
        if (!strategyInfoOperatorBean.fetchVPNInfo()) {
            if (strategyInfoOperatorBean.AkhnZx()) {
                arrayList.add(new TacticsListButtonItem("strategy_reserve_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            } else {
                arrayList.add(new TacticsListButtonItem("strategy_cancel_reserve", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
        }
        arrayList.addAll(djBIcL(strategyInfoOperatorBean));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<TacticsListButtonItem> DbNXlk(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        java.lang.String str;
        java.util.ArrayList<TacticsListButtonItem> arrayList = new java.util.ArrayList<>();
        if (!strategyInfoOperatorBean.fetchVPNInfo()) {
            java.lang.String strKWHzl = strategyInfoOperatorBean.KWHzl();
            int iHashCode = strKWHzl.hashCode();
            if (iHashCode != 3322092) {
                if (iHashCode != 106440182) {
                    if (iHashCode == 1550783935 && strKWHzl.equals("running")) {
                        str = "strategy_button_pause";
                    }
                } else if (strKWHzl.equals("pause")) {
                    str = "strategy_button_restart";
                }
                str = "";
            } else if (!strKWHzl.equals("live")) {
                str = "";
            }
            java.lang.String str2 = str;
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
                arrayList.add(new TacticsListButtonItem(str2, false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
            arrayList.addAll(fIwbmz(strategyInfoOperatorBean));
        }
        return arrayList;
    }

    public final java.util.ArrayList<TacticsListButtonItem> values(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        java.util.ArrayList<TacticsListButtonItem> arrayList = new java.util.ArrayList<>();
        if (!strategyInfoOperatorBean.fetchVPNInfo()) {
            arrayList.add(new TacticsListButtonItem("strategy_button_more", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            if (strategyInfoOperatorBean.AEQbTJ() == 1) {
                arrayList.add(new TacticsListButtonItem("strategy_button_manual_order", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            } else {
                arrayList.add(new TacticsListButtonItem("strategy_button_adjust_margin", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
            arrayList.add(copydefault.fARcdN(strategyInfoOperatorBean));
        }
        return arrayList;
    }

    public final java.util.ArrayList<TacticsListButtonItem> isConnected(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        int iKWHzl = C54795xVp.KWHzl(C33129mqd.AhwBna(strategyInfoOperatorBean.djBIcL()));
        if (strategyInfoOperatorBean.fetchVPNInfo() || !strategyInfoOperatorBean.gEmmrt() || C33129mqd.AhwBna(java.lang.Integer.valueOf(iKWHzl), 1)) {
            return new java.util.ArrayList<>();
        }
        TacticsListButtonItem[] tacticsListButtonItemArr = new TacticsListButtonItem[1];
        tacticsListButtonItemArr[0] = new TacticsListButtonItem(Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.valueOf(), (java.lang.Object) "Buy") ? "lvf_early_fill_buy" : "lvf_early_fill_sell", true, (java.lang.String) null, 4, (DefaultConstructorMarker) null);
        return yDY.copydefault(tacticsListButtonItemArr);
    }

    public final java.util.ArrayList<TacticsListButtonItem> valueOf(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            if (!Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.OLrzqt(), (java.lang.Object) "2") && !KWHzl().contains(strategyInfoOperatorBean.copydefault())) {
                return yDY.copydefault(new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
            return new java.util.ArrayList<>();
        }
        if (Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.OLrzqt(), (java.lang.Object) "2")) {
            return fIwbmz(strategyInfoOperatorBean);
        }
        return yDY.copydefault(AEQbTJ(strategyInfoOperatorBean));
    }

    public static final TacticsListButtonItem AEQbTJ(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        if (Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "pending_signal")) {
            return new TacticsListButtonItem("strategy_button_start", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
        }
        java.util.ArrayList<java.lang.String> arrayListEZpvd = strategyInfoOperatorBean.EZpvd();
        boolean z = arrayListEZpvd != null && arrayListEZpvd.contains(TacticsForbiddenFunctions.IncreasePosition.getCode());
        return new TacticsListButtonItem("STRATEGY_SPOT_GRID__ADD_INVESTMENT", !z, (Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "pause") && z) ? C33070mpX.AYXKKw(C55688xof.Application.getBitmap) : "");
    }

    public final java.util.List<TacticsListButtonItem> AhwBna(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        if (Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.OLrzqt(), (java.lang.Object) "2")) {
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.add(new TacticsListButtonItem("strategy_button_adjust_margin", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            if (!strategyInfoOperatorBean.fetchVPNInfo()) {
                listOLrzqt.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
            return C56402yEa.fARcdN(listOLrzqt);
        }
        java.lang.String strKWHzl = strategyInfoOperatorBean.KWHzl();
        if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "pending_signal")) {
            java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
            listOLrzqt2.add(new TacticsListButtonItem("strategy_button_start", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            if (!strategyInfoOperatorBean.fetchVPNInfo()) {
                listOLrzqt2.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
            return C56402yEa.fARcdN(listOLrzqt2);
        }
        if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "no_close_position")) {
            java.util.List listOLrzqt3 = C56402yEa.OLrzqt();
            if (!strategyInfoOperatorBean.AhwBna()) {
                listOLrzqt3.add(new TacticsListButtonItem("strategy_button_related_position", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
            if (!strategyInfoOperatorBean.AYXKKw()) {
                listOLrzqt3.add(new TacticsListButtonItem("strategy_button_tpsl", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                listOLrzqt3.add(new TacticsListButtonItem("strategy_button_adjust_margin", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                listOLrzqt3.add(new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
            return C56402yEa.fARcdN(listOLrzqt3);
        }
        java.util.List listOLrzqt4 = C56402yEa.OLrzqt();
        listOLrzqt4.add(new TacticsListButtonItem("strategy_button_adjust_margin", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        if (!strategyInfoOperatorBean.fetchVPNInfo()) {
            listOLrzqt4.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        return C56402yEa.fARcdN(listOLrzqt4);
    }

    public final java.util.ArrayList<TacticsListButtonItem> fJNWhG(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            return yDY.copydefault(new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "running");
        java.util.ArrayList<TacticsListButtonItem> arrayList = new java.util.ArrayList<>();
        if (strategyInfoOperatorBean.AEQbTJ() != 1) {
            arrayList.add(new TacticsListButtonItem("strategy_button_more", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            arrayList.add(new TacticsListButtonItem("STRATEGY_SPOT_DCA_ADD_INVESTMENT", zEZpvd, (java.lang.String) null, 4, (DefaultConstructorMarker) null));
            arrayList.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            return arrayList;
        }
        arrayList.add(new TacticsListButtonItem("strategy_button_more", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        arrayList.add(new TacticsListButtonItem("STRATEGY_SPOT_DCA_ADD_INVESTMENT", zEZpvd, (java.lang.String) null, 4, (DefaultConstructorMarker) null));
        arrayList.addAll(copydefault.fIwbmz(strategyInfoOperatorBean));
        return arrayList;
    }

    public final java.util.ArrayList<TacticsListButtonItem> EZpvd(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            return yDY.copydefault(new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        java.util.ArrayList<TacticsListButtonItem> arrayListCopydefault = yDY.copydefault(new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        arrayListCopydefault.addAll(copydefault.fIwbmz(strategyInfoOperatorBean));
        return arrayListCopydefault;
    }

    public final java.util.ArrayList<TacticsListButtonItem> KWHzl(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        java.util.ArrayList<TacticsListButtonItem> arrayList = new java.util.ArrayList<>();
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            if (!Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.OLrzqt(), (java.lang.Object) "2")) {
                arrayList.add(new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
        } else {
            arrayList.add(new TacticsListButtonItem("strategy_button_more", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            arrayList.add(new TacticsListButtonItem("strategy_button_add_order", Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "running"), (java.lang.String) null, 4, (DefaultConstructorMarker) null));
            if (!strategyInfoOperatorBean.AhwBna()) {
                arrayList.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                if (Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "no_close_position")) {
                    arrayList.add(new TacticsListButtonItem("strategy_button_related_position", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                }
            } else if (!Intrinsics.EZpvd((java.lang.Object) strategyInfoOperatorBean.KWHzl(), (java.lang.Object) "no_close_position")) {
                arrayList.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList<TacticsListButtonItem> gEmmrt(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            return new java.util.ArrayList<>();
        }
        return yDY.copydefault(new TacticsListButtonItem("strategy_button_adjust_withdrawal", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null), new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
    }

    public final java.util.ArrayList<TacticsListButtonItem> ejfBZ(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        java.util.ArrayList<TacticsListButtonItem> arrayList;
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            arrayList = new java.util.ArrayList<>();
            if (!strategyInfoOperatorBean.AhwBna()) {
                arrayList.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
        } else {
            arrayList = new java.util.ArrayList<>();
            if (!strategyInfoOperatorBean.AhwBna()) {
                arrayList.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                arrayList.add(new TacticsListButtonItem("strategy_button_modify", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                arrayList.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            } else {
                arrayList.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                arrayList.add(new TacticsListButtonItem("strategy_button_modify", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
                arrayList.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList<TacticsListButtonItem> AuCTel(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            return new java.util.ArrayList<>();
        }
        return yDY.copydefault(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
    }

    public final TacticsListButtonItem fARcdN(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        return new TacticsListButtonItem(strategyInfoOperatorBean.AEQbTJ() == 1 ? "strategy_button_stop" : "strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
    }

    public final java.util.ArrayList<TacticsListButtonItem> fIwbmz(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        java.util.ArrayList<TacticsListButtonItem> arrayList = new java.util.ArrayList<>();
        if (strategyInfoOperatorBean.fetchVPNInfo()) {
            return arrayList;
        }
        arrayList.add(new TacticsListButtonItem("strategy_button_stop", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        if (strategyInfoOperatorBean.AEQbTJ() != 1) {
            arrayList.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    public final java.util.ArrayList<TacticsListButtonItem> djBIcL(StrategyInfoOperatorBean strategyInfoOperatorBean) {
        java.util.ArrayList<TacticsListButtonItem> arrayList = new java.util.ArrayList<>();
        if (!strategyInfoOperatorBean.fetchVPNInfo() && strategyInfoOperatorBean.AEQbTJ() != 1) {
            arrayList.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    public final TacticsListButtonItem OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != 1211762355) {
            if (iHashCode != 1316806720) {
                if (iHashCode == 1715648628 && str.equals("stopping")) {
                    return new TacticsListButtonItem("strategy_button_stopping", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
                }
            } else if (str.equals("starting")) {
                return new TacticsListButtonItem("strategy_button_starting", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
            }
        } else if (str.equals("risking")) {
            return new TacticsListButtonItem("strategy_button_risking", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null);
        }
        return null;
    }

    public final StrategyInfoOperatorBean OLrzqt(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo) {
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        return new StrategyInfoOperatorBean(bizTradeStrategyInfo.isHistoryOrder(), bizTradeStrategyInfo.getOrdCopyType(), bizTradeStrategyInfo.getOrderType(), bizTradeStrategyInfo.getOrderState(), bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId(), bizTradeStrategyInfo.getProfitValue(), bizTradeStrategyInfo.status(), bizTradeStrategyInfo.tradeSide(), 0, bizTradeStrategyInfo.supportEarlyFill(), false, bizTradeStrategyInfo.getDcdBotState(), bizTradeStrategyInfo.getReinvestmentInfo(), bizTradeStrategyInfo.getForbiddenFunctions(), 2560, null);
    }

    public final StrategyInfoOperatorBean KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        return new StrategyInfoOperatorBean(strategyDetailsResponse.isHistory(), strategyDetailsResponse.getCopyType(), strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getState(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getProfit(), "", "", 0, false, false, "", false, strategyDetailsResponse.getForbidden(), 2560, null);
    }

    public final StrategyInfoOperatorBean KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse, boolean z) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        return new StrategyInfoOperatorBean(strategyDetailsResponse.isHistory(), strategyDetailsResponse.getCopyType(), strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getState(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getProfit(), null, null, 1, false, z, null, false, strategyDetailsResponse.getForbidden(), 13696, null);
    }

    public final BotTradeData KWHzl(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        java.lang.String minPx = tacticsData.getMinPx();
        java.lang.String maxPx = tacticsData.getMaxPx();
        java.lang.String runType = tacticsData.getRunType();
        java.lang.String gridNum = tacticsData.getGridNum();
        boolean basePos = tacticsData.getBasePos();
        java.lang.String originalLevel = tacticsData.getOriginalLevel();
        java.lang.String str = originalLevel == null ? "" : originalLevel;
        java.lang.String direction = tacticsData.getDirection();
        java.lang.String profitSharingRatio = tacticsData.getProfitSharingRatio();
        return new BotTradeData(tacticsData.getOrderType(), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) "") ? tacticsData.getInstId() : "", StringsKt__StringsKt.fARcdN((java.lang.CharSequence) "") ? tacticsData.getInstType() : "", (android.os.Parcelable) new AIData((java.lang.String) null, gridNum, maxPx, minPx, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, runType, direction, (java.lang.String) null, str, (java.util.ArrayList) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, basePos, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParam) null, (java.lang.String) null, profitSharingRatio == null ? "" : profitSharingRatio, (java.lang.String) null, true, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, tacticsData.getActualMarginSz(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Boolean.FALSE, tacticsData.getExtraMarginSz(), -139494799, 0, (DefaultConstructorMarker) null), true, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, LivenessCoordinator.TARGET_WIDTH, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [801=6] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: T */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0354  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BotTradeData copydefault(@NotNull TacticsData tacticsData) {
        android.os.Parcelable aIData;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        java.lang.String orderType = tacticsData.getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                aIData = !orderType.equals("spot_dca") ? new AIData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, false, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, -1, 3, (DefaultConstructorMarker) null) : new DcaOrderReq((java.lang.String) null, (java.lang.String) null, tacticsData.getReserveFunds(), (java.lang.String) null, tacticsData.getMaxSafetyOrds(), tacticsData.getPxSteps(), tacticsData.getPxStepsMult(), tacticsData.getVolMult(), tacticsData.getTpPct(), tacticsData.getSlPct(), "long", SpotDcaInvestTypeData.MANUAL.getMode(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) tacticsData.getTriggerParams(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AutoVipProfitInfo) null, -8523765, 15, (DefaultConstructorMarker) null);
                break;
            case -1574173039:
                if (orderType.equals("infinite_grid")) {
                    aIData = new AIData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, tacticsData.getMinPx(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) OLrzqt(tacticsData.getSignParams()), (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, false, tacticsData.getTpTriggerPx(), tacticsData.getSlTriggerPx(), (TpSlTriggerParam) null, tacticsData.getPerGridProfitRatio(), (java.lang.String) null, (java.lang.String) null, true, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, -4917257, 3, (DefaultConstructorMarker) null);
                    break;
                }
                break;
            case -1402017003:
                if (orderType.equals("contract_dca")) {
                    BizInstrument bizInstrumentIsConnected = C56059xvf.EZpvd.isConnected();
                    if (bizInstrumentIsConnected != null) {
                        java.lang.String instId = tacticsData.getInstId();
                        boolean zFARcdN = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) instId);
                        T instId2 = instId;
                        if (zFARcdN) {
                            instId2 = bizInstrumentIsConnected.getInstId();
                        }
                        objectRef.element = instId2;
                        java.lang.String instType = tacticsData.getInstType();
                        boolean zFARcdN2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) instType);
                        T instType2 = instType;
                        if (zFARcdN2) {
                            instType2 = bizInstrumentIsConnected.getInstType();
                        }
                        objectRef2.element = instType2;
                    }
                    java.util.List<DcaTriggerParam> triggerParams = tacticsData.getTriggerParams();
                    DcaTriggerParam dcaTriggerParam = null;
                    if (triggerParams != null) {
                        java.util.Iterator<T> it = triggerParams.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) next;
                                if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerAction() : null), (java.lang.Object) TtmlNode.START)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        DcaTriggerParam dcaTriggerParam3 = (DcaTriggerParam) next;
                        if (dcaTriggerParam3 != null) {
                            java.lang.String triggerStrategy = dcaTriggerParam3.getTriggerStrategy();
                            if (Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) ContractDcaTriggerType.INSTANT.getMode())) {
                                dcaTriggerParam3.setTriggerStrategy("--");
                            } else if (Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) ContractDcaTriggerType.PRICE.getMode())) {
                                dcaTriggerParam3.setTriggerPx(null);
                            }
                            dcaTriggerParam = dcaTriggerParam3;
                        }
                    }
                    DcaTriggerParam dcaTriggerParam4 = new DcaTriggerParam("stop", "--", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null);
                    java.lang.String instId3 = tacticsData.getInstId();
                    java.lang.String instType3 = tacticsData.getInstType();
                    java.lang.Boolean reserveFunds = tacticsData.getReserveFunds();
                    java.lang.String maxSafetyOrds = tacticsData.getMaxSafetyOrds();
                    java.lang.String pxSteps = tacticsData.getPxSteps();
                    java.lang.String pxStepsMult = tacticsData.getPxStepsMult();
                    java.lang.String volMult = tacticsData.getVolMult();
                    java.lang.String tpPct = tacticsData.getTpPct();
                    java.lang.String slPct = tacticsData.getSlPct();
                    java.lang.String direction = tacticsData.getDirection();
                    java.lang.String mode = SpotDcaInvestTypeData.MANUAL.getMode();
                    java.lang.String originalLevel = tacticsData.getOriginalLevel();
                    aIData = new DcaOrderReq(instId3, (java.lang.String) null, reserveFunds, (java.lang.String) null, maxSafetyOrds, pxSteps, pxStepsMult, volMult, tpPct, slPct, direction, mode, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, originalLevel == null ? "" : originalLevel, tacticsData.getSlMode(), yDY.gEmmrt(dcaTriggerParam, dcaTriggerParam4), (java.lang.String) null, tacticsData.getTrackingMode(), tacticsData.getProfitSharingRatio(), (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, (java.lang.String) null, instType3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AutoVipProfitInfo) null, -144412662, 15, (DefaultConstructorMarker) null);
                    break;
                }
                break;
            case -1216369070:
                if (orderType.equals("smart_portfolio")) {
                    aIData = new SmartPortfolioReq(tacticsData.getStgyName(), (java.util.List) null, copydefault(tacticsData.getHoardItemList()), tacticsData.getBalType(), tacticsData.getInterval(), tacticsData.getDeltaRatio(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 16322, (DefaultConstructorMarker) null);
                    break;
                }
                break;
            case -512749997:
                if (orderType.equals("contract_grid")) {
                    java.lang.String minPx = tacticsData.getMinPx();
                    java.lang.String maxPx = tacticsData.getMaxPx();
                    java.lang.String runType = tacticsData.getRunType();
                    java.lang.String gridNum = tacticsData.getGridNum();
                    java.lang.String tpTriggerPx = tacticsData.getTpTriggerPx();
                    java.lang.String slTriggerPx = tacticsData.getSlTriggerPx();
                    java.lang.String tpRatio = tacticsData.getTpRatio();
                    java.lang.String slRatio = tacticsData.getSlRatio();
                    boolean basePos = tacticsData.getBasePos();
                    java.lang.String originalLevel2 = tacticsData.getOriginalLevel();
                    java.lang.String str = originalLevel2 == null ? "" : originalLevel2;
                    java.lang.String direction2 = tacticsData.getDirection();
                    java.util.ArrayList<AdvancedTriggerSign> arrayListOLrzqt = OLrzqt(tacticsData.getSignParams());
                    java.lang.String profitSharingRatio = tacticsData.getProfitSharingRatio();
                    aIData = new AIData((java.lang.String) null, gridNum, maxPx, minPx, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, runType, direction2, (java.lang.String) null, str, (java.util.ArrayList) arrayListOLrzqt, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, basePos, tpTriggerPx, slTriggerPx, (TpSlTriggerParam) null, (java.lang.String) null, profitSharingRatio == null ? "" : profitSharingRatio, (java.lang.String) null, true, tpRatio, slRatio, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, -30641551, 3, (DefaultConstructorMarker) null);
                    break;
                }
                break;
            case 3181382:
                if (orderType.equals("grid")) {
                    java.lang.String minPx2 = tacticsData.getMinPx();
                    java.lang.String maxPx2 = tacticsData.getMaxPx();
                    java.lang.String runType2 = tacticsData.getRunType();
                    java.lang.String gridNum2 = tacticsData.getGridNum();
                    TrailingConfig trailingUpConfig = tacticsData.getTrailingUpConfig();
                    TrailingConfig trailingDownConfig = tacticsData.getTrailingDownConfig();
                    java.lang.Boolean reserveFunds2 = tacticsData.getReserveFunds();
                    java.lang.String tpTriggerPx2 = tacticsData.getTpTriggerPx();
                    java.lang.String slTriggerPx2 = tacticsData.getSlTriggerPx();
                    TpSlTriggerParam tpslTriggerParam = tacticsData.getTpslTriggerParam();
                    java.util.ArrayList<AdvancedTriggerSign> arrayListOLrzqt2 = OLrzqt(tacticsData.getSignParams());
                    java.lang.String profitSharingRatio2 = tacticsData.getProfitSharingRatio();
                    aIData = new AIData((java.lang.String) null, gridNum2, maxPx2, minPx2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, runType2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) arrayListOLrzqt2, reserveFunds2, trailingUpConfig, trailingDownConfig, false, tpTriggerPx2, slTriggerPx2, tpslTriggerParam, (java.lang.String) null, profitSharingRatio2 == null ? "" : profitSharingRatio2, (java.lang.String) null, true, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, -5732495, 3, (DefaultConstructorMarker) null);
                    break;
                }
                break;
        }
        android.os.Parcelable parcelable = aIData;
        java.lang.String orderType2 = tacticsData.getOrderType();
        java.lang.CharSequence instId4 = (java.lang.CharSequence) objectRef.element;
        if (StringsKt__StringsKt.fARcdN(instId4)) {
            instId4 = tacticsData.getInstId();
        }
        java.lang.String str2 = (java.lang.String) instId4;
        java.lang.CharSequence instType4 = (java.lang.CharSequence) objectRef2.element;
        if (StringsKt__StringsKt.fARcdN(instType4)) {
            instType4 = tacticsData.getInstType();
        }
        return new BotTradeData(orderType2, str2, (java.lang.String) instType4, parcelable, true, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, LivenessCoordinator.TARGET_WIDTH, (DefaultConstructorMarker) null);
    }

    public final java.util.ArrayList<AdvancedTriggerSign> OLrzqt(java.util.List<SignParamItem> list) {
        java.util.ArrayList<AdvancedTriggerSign> arrayList = new java.util.ArrayList<>();
        if (list != null) {
            for (SignParamItem signParamItem : list) {
                arrayList.add(new AdvancedTriggerSign(signParamItem.getTriggerAction(), signParamItem.getIndicator(), (java.lang.String) null, signParamItem.getTriggerPx(), signParamItem.getDelaySeconds(), signParamItem.getTimePeriod(), signParamItem.getTimeframe(), signParamItem.getTriggerCond(), signParamItem.getThold(), (java.lang.String) null, signParamItem.getStopType(), (java.lang.String) null, 2564, (DefaultConstructorMarker) null));
            }
        }
        return arrayList;
    }

    public final java.util.List<CoinRatioParam> copydefault(java.util.ArrayList<SmartPortfolioListItem> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (arrayList != null) {
            for (SmartPortfolioListItem smartPortfolioListItem : arrayList) {
                arrayList2.add(new CoinRatioParam(smartPortfolioListItem.getCcy(), smartPortfolioListItem.getRatio(), (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
            }
        }
        return arrayList2;
    }

    public final DcaOrderReq EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        return new DcaOrderReq((java.lang.String) null, tacticsData.getEffectiveInitOrdAmt(), tacticsData.getEffectiveReserveFunds(), tacticsData.getEffectiveSafetyOrdAmt(), tacticsData.getEffectiveMaxSafetyOrds(), tacticsData.getEffectivePxSteps(), tacticsData.getEffectivePxStepsMult(), tacticsData.getEffectiveVolMult(), tacticsData.getEffectiveTpPct(), tacticsData.getEffectiveSlPct(), "long", SpotDcaInvestTypeData.MANUAL.getMode(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) tacticsData.getEffectiveTriggerParams(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, true, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (AutoVipProfitInfo) null, -8523775, 15, (DefaultConstructorMarker) null);
    }

    public final boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "no_close_position") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "stopping") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "stop_delay_trigger")) ? false : true;
    }
}
