package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52560wPy {
    public static final C52560wPy copydefault = new C52560wPy();

    private C52560wPy() {
    }

    public final void EZpvd(java.lang.String str, @NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        OLrzqt(str, tacticsData);
        AEQbTJ(str, tacticsData);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(java.lang.String str, final TacticsData tacticsData) {
        final java.lang.String str2;
        final java.lang.String str3;
        if (str != null) {
            switch (str.hashCode()) {
                case -1773919395:
                    str2 = !str.equals("strategy_button_adjust_margin") ? null : "margin";
                    break;
                case -1366787209:
                    str2 = !str.equals("strategy_modify_stop_condition") ? null : "stop_condition";
                    break;
                case -918420701:
                    str2 = !str.equals("strategy_button_trading_view_signal") ? null : "tv_signal";
                    break;
                case -266229020:
                    str2 = !str.equals("strategy_button_adjust_withdrawal") ? null : "withdraw_profits";
                    break;
                case -210118047:
                    str2 = !str.equals("strategy_button_start") ? null : "start_bot";
                    break;
                case 13978130:
                    str2 = !str.equals("strategy_button_add_investment") ? null : "increase_investment";
                    break;
                case 149470789:
                    str2 = !str.equals("strategy_modify_start_condition") ? null : "start_condition";
                    break;
                case 270133622:
                    str2 = !str.equals("strategy_button_more") ? null : "more";
                    break;
                case 270317091:
                    str2 = !str.equals("strategy_button_stop") ? null : "stop_bot";
                    break;
                case 270343158:
                    str2 = !str.equals("strategy_button_tpsl") ? null : "tp_sl";
                    break;
                case 322024080:
                    str2 = !str.equals("strategy_button_recreate") ? null : "recreate";
                    break;
                case 665232559:
                    str2 = !str.equals("strategy_button_add_order") ? null : "add";
                    break;
                case 700833347:
                    if (!str.equals("strategy_cancel_reserve")) {
                        str2 = null;
                        break;
                    }
                    break;
                case 1677034225:
                    if (!str.equals("strategy_reserve_stop")) {
                        str2 = null;
                        break;
                    }
                    break;
                default:
                    str2 = null;
                    break;
            }
        } else {
            str2 = null;
        }
        if (str2 != null) {
            if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getCopyType(), (java.lang.Object) "3")) {
                str3 = "lead";
            } else if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getCopyType(), (java.lang.Object) "2")) {
                str3 = "follow";
            } else {
                str3 = C33129mqd.OLrzqt((java.lang.CharSequence) tacticsData.getSourceAlgoId()) ? "copy" : "manual";
            }
            C32866mlf.onEvent$default(tacticsData.getLocatePage() != 1 ? "BotDashboard_Full_Button_Click" : "BotDetails_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.wPz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52560wPy.OLrzqt(str2, str3, tacticsData, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, TacticsData tacticsData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        eventParamsList.put("createbot_type", str2, true);
        eventParamsList.put("bot_type", tacticsData.getOrderType(), true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str, TacticsData tacticsData) {
        java.lang.String orderType = tacticsData.getOrderType();
        if ((Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "contract_grid")) && tacticsData.getLocatePage() != 1) {
            kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = AEQbTJ(str);
            C55867xrz.KWHzl.AEQbTJ(tacticsData.getOrderType(), pairAEQbTJ.component1(), pairAEQbTJ.component2());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = null;
        if (str != null) {
            switch (str.hashCode()) {
                case -1773919395:
                    if (!str.equals("strategy_button_adjust_margin")) {
                        str2 = null;
                    } else {
                        str3 = "margin";
                        str4 = str3;
                        str2 = null;
                    }
                    break;
                case -1366787209:
                    str2 = !str.equals("strategy_modify_stop_condition") ? null : "stop_condition";
                    break;
                case -900037503:
                    if (!str.equals("strategy_button_details")) {
                        str2 = null;
                    } else {
                        str3 = "details";
                        str4 = str3;
                        str2 = null;
                    }
                    break;
                case -266229020:
                    if (!str.equals("strategy_button_adjust_withdrawal")) {
                        str2 = null;
                    } else {
                        str3 = "profits";
                        str4 = str3;
                        str2 = null;
                    }
                    break;
                case 13978130:
                    str2 = !str.equals("strategy_button_add_investment") ? null : "increase_positions";
                    break;
                case 270133622:
                    if (!str.equals("strategy_button_more")) {
                        str2 = null;
                    } else {
                        str3 = "more";
                        str4 = str3;
                        str2 = null;
                    }
                    break;
                case 270317091:
                    str2 = !str.equals("strategy_button_stop") ? null : "stop";
                    break;
                case 270343158:
                    str2 = !str.equals("strategy_button_tpsl") ? null : "tp_sl";
                    break;
                case 322024080:
                    str2 = !str.equals("strategy_button_recreate") ? null : "replicate";
                    break;
                case 1605383006:
                    str2 = !str.equals("strategy_edit_price_range") ? null : "edit";
                    break;
                default:
                    str2 = null;
                    break;
            }
        } else {
            str2 = null;
        }
        return new kotlin.Pair<>(str4, str2);
    }
}
