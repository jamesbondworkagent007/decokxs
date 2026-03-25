package com.okinc.business.invest_biz;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C23726iHa;
import o.C23727iHb;
import o.C23728iHc;
import o.C23749iHx;
import o.C23754iIb;
import o.C23775iIw;
import o.C23778iIz;
import o.C23782iJc;
import o.C23783iJd;
import o.C23786iJg;
import o.C23789iJj;
import o.C23808iKb;
import o.C23811iKe;
import o.C23818iKl;
import o.C23825iKs;
import o.C23826iKt;
import o.C23828iKv;
import o.C23830iKx;
import o.C23832iKz;
import o.C23834iLa;
import o.C23848iLo;
import o.C23850iLq;
import o.C23856iLw;
import o.C23857iLx;
import o.C23862iMb;
import o.C23864iMd;
import o.C23867iMg;
import o.C23868iMh;
import o.C23870iMj;
import o.C23874iMn;
import o.C23875iMo;
import o.C23877iMq;
import o.C23879iMs;
import o.C23882iMv;
import o.C23886iMz;
import o.C23896iNi;
import o.C23901iNn;
import o.C23902iNo;
import o.C25493ixk;
import o.iHA;
import o.iHD;
import o.iHI;
import o.iHJ;
import o.iHL;
import o.iHO;
import o.iHR;
import o.iHU;
import o.iHW;
import o.iIE;
import o.iII;
import o.iIL;
import o.iIR;
import o.iKH;
import o.iKI;
import o.iKN;
import o.iKT;
import o.iKX;
import o.iKY;
import o.iLA;
import o.iLB;
import o.iLD;
import o.iLJ;
import o.iLO;
import o.iLR;
import o.iLS;
import o.iLT;
import o.iLU;
import o.iLX;
import o.iMC;
import o.iMD;
import o.iME;
import o.iMH;
import o.iMI;

/* JADX INFO: loaded from: classes6.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray OLrzqt;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(72);
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C25493ixk.Activity.AhwBna, 1);
        sparseIntArray.put(C25493ixk.Activity.djBIcL, 2);
        sparseIntArray.put(C25493ixk.Activity.AkhnZx, 3);
        sparseIntArray.put(C25493ixk.Activity.AwvSrB, 4);
        sparseIntArray.put(C25493ixk.Activity.zuBGHE, 5);
        sparseIntArray.put(C25493ixk.Activity.QKVWgx, 6);
        sparseIntArray.put(C25493ixk.Activity.OcIXYQ, 7);
        sparseIntArray.put(C25493ixk.Activity.QOLQEE, 8);
        sparseIntArray.put(C25493ixk.Activity.QUSxYX, 9);
        sparseIntArray.put(C25493ixk.Activity.RJOkX, 10);
        sparseIntArray.put(C25493ixk.Activity.QfsBiF, 11);
        sparseIntArray.put(C25493ixk.Activity.QbewEr, 12);
        sparseIntArray.put(C25493ixk.Activity.UeEOUB, 13);
        sparseIntArray.put(C25493ixk.Activity.dxcTrN, 14);
        sparseIntArray.put(C25493ixk.Activity.ODWQjV, 15);
        sparseIntArray.put(C25493ixk.Activity.DCJXGO, 16);
        sparseIntArray.put(C25493ixk.Activity.DCUTEI, 17);
        sparseIntArray.put(C25493ixk.Activity.QHmsKR, 18);
        sparseIntArray.put(C25493ixk.Activity.RKDWNf, 19);
        sparseIntArray.put(C25493ixk.Activity.dHguZz, 20);
        sparseIntArray.put(C25493ixk.Activity.OxVOHk, 21);
        sparseIntArray.put(C25493ixk.Activity.QSLkRj, 22);
        sparseIntArray.put(C25493ixk.Activity.OJuSTm, 23);
        sparseIntArray.put(C25493ixk.Activity.aUsmxb, 24);
        sparseIntArray.put(C25493ixk.Activity.aHXSQp, 25);
        sparseIntArray.put(C25493ixk.Activity.UscePu, 26);
        sparseIntArray.put(C25493ixk.Activity.fXHmeK, 27);
        sparseIntArray.put(C25493ixk.Activity.fsSxsn, 28);
        sparseIntArray.put(C25493ixk.Activity.gUEfcq, 29);
        sparseIntArray.put(C25493ixk.Activity.sTzBva, 30);
        sparseIntArray.put(C25493ixk.Activity.iPSTqm, 31);
        sparseIntArray.put(C25493ixk.Activity.hvKCwS, 32);
        sparseIntArray.put(C25493ixk.Activity.zDUObI, 33);
        sparseIntArray.put(C25493ixk.Activity.zOIQXb, 34);
        sparseIntArray.put(C25493ixk.Activity.zhUgOk, 35);
        sparseIntArray.put(C25493ixk.Activity.getPriority, 36);
        sparseIntArray.put(C25493ixk.Activity.getLabel, 37);
        sparseIntArray.put(C25493ixk.Activity.DGUQLIOvDItG, 38);
        sparseIntArray.put(C25493ixk.Activity.gtCCJH, 39);
        sparseIntArray.put(C25493ixk.Activity.gtdfxv, 40);
        sparseIntArray.put(C25493ixk.Activity.hrjNmC, 41);
        sparseIntArray.put(C25493ixk.Activity.zzQwtT, 42);
        sparseIntArray.put(C25493ixk.Activity.fGQ, 43);
        sparseIntArray.put(C25493ixk.Activity.DKtBnz, 44);
        sparseIntArray.put(C25493ixk.Activity.iKEqwx, 45);
        sparseIntArray.put(C25493ixk.Activity.DrNnAm, 46);
        sparseIntArray.put(C25493ixk.Activity.RAQtXZ, 47);
        sparseIntArray.put(C25493ixk.Activity.geLlBI, 48);
        sparseIntArray.put(C25493ixk.Activity.DQzvGN, 49);
        sparseIntArray.put(C25493ixk.Activity.ihnvzI, 50);
        sparseIntArray.put(C25493ixk.Activity.DQYQgr, 51);
        sparseIntArray.put(C25493ixk.Activity.reset, 52);
        sparseIntArray.put(C25493ixk.Activity.zLAIeZ, 53);
        sparseIntArray.put(C25493ixk.Activity.DQzvGNdrmXxu, 54);
        sparseIntArray.put(C25493ixk.Activity.isReflectionWorking, 55);
        sparseIntArray.put(C25493ixk.Activity.gdmIOq, 56);
        sparseIntArray.put(C25493ixk.Activity.DQzvGNdrmXxudrmXxu, 57);
        sparseIntArray.put(C25493ixk.Activity.DTeKQX, 58);
        sparseIntArray.put(C25493ixk.Activity.RSDDiY, 59);
        sparseIntArray.put(C25493ixk.Activity.RIuxYh, 60);
        sparseIntArray.put(C25493ixk.Activity.DcMfJK, 61);
        sparseIntArray.put(C25493ixk.Activity.RTWSvT, 62);
        sparseIntArray.put(C25493ixk.Activity.RkASWs, 63);
        sparseIntArray.put(C25493ixk.Activity.RgLUBD, 64);
        sparseIntArray.put(C25493ixk.Activity.RqmePg, 65);
        sparseIntArray.put(C25493ixk.Activity.UccSpe, 66);
        sparseIntArray.put(C25493ixk.Activity.RzdrRQ, 67);
        sparseIntArray.put(C25493ixk.Activity.invokespecialODCBUN, 68);
        sparseIntArray.put(C25493ixk.Activity.invokespecialROgMPW, 69);
        sparseIntArray.put(C25493ixk.Activity.dIjzlO, 70);
        sparseIntArray.put(C25493ixk.Activity.gBtXYZ, 71);
        sparseIntArray.put(C25493ixk.Activity.fupbxE, 72);
    }

    private final ViewDataBinding AEQbTJ(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/activity_invest_order_list_0".equals(obj)) {
                    return new C23726iHa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_invest_order_list is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_invest_subscription_0".equals(obj)) {
                    return new C23727iHb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_invest_subscription is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_swap_slippage_0".equals(obj)) {
                    return new C23728iHc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_swap_slippage is invalid. Received: " + obj);
            case 4:
                if ("layout/fragment_invest_base_bottom_0".equals(obj)) {
                    return new C23749iHx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_invest_base_bottom is invalid. Received: " + obj);
            case 5:
                if ("layout/fragment_invest_common_placeorder_keypad_0".equals(obj)) {
                    return new iHA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_invest_common_placeorder_keypad is invalid. Received: " + obj);
            case 6:
                if ("layout/fragment_invest_redeem_pool_choose_0".equals(obj)) {
                    return new iHD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_invest_redeem_pool_choose is invalid. Received: " + obj);
            case 7:
                if ("layout/fragment_invest_slip_confirm_0".equals(obj)) {
                    return new iHI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_invest_slip_confirm is invalid. Received: " + obj);
            case 8:
                if ("layout/fragment_invest_subscription_content_new_0".equals(obj)) {
                    return new iHJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_invest_subscription_content_new is invalid. Received: " + obj);
            case 9:
                if ("layout/fragment_invest_subscription_v2_0".equals(obj)) {
                    return new iHO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_invest_subscription_v2 is invalid. Received: " + obj);
            case 10:
                if ("layout/fragment_redeem_transaction_0".equals(obj)) {
                    return new iHL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_redeem_transaction is invalid. Received: " + obj);
            case 11:
                if ("layout/fragment_redeem_transaction_v2_0".equals(obj)) {
                    return new iHU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_redeem_transaction_v2 is invalid. Received: " + obj);
            case 12:
                if ("layout/fragment_redeem_transaction_v3_0".equals(obj)) {
                    return new iHR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_redeem_transaction_v3 is invalid. Received: " + obj);
            case 13:
                if ("layout/fragment_single_redeem_transaction_0".equals(obj)) {
                    return new iHW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_single_redeem_transaction is invalid. Received: " + obj);
            case 14:
                if ("layout/invest_validator_item_0".equals(obj)) {
                    return new C23754iIb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for invest_validator_item is invalid. Received: " + obj);
            case 15:
                if ("layout/item_invest_babylon_redeem_position_0".equals(obj)) {
                    return new C23775iIw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_babylon_redeem_position is invalid. Received: " + obj);
            case 16:
                if ("layout/item_invest_bottomsheet_batch_claim_0".equals(obj)) {
                    return new C23778iIz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_bottomsheet_batch_claim is invalid. Received: " + obj);
            case 17:
                if ("layout/item_invest_expiry_position_select_0".equals(obj)) {
                    return new iIE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_expiry_position_select is invalid. Received: " + obj);
            case 18:
                if ("layout/item_invest_filter_window_0".equals(obj)) {
                    return new iII(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_filter_window is invalid. Received: " + obj);
            case 19:
                if ("layout/item_invest_finality_provider_0".equals(obj)) {
                    return new iIL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_finality_provider is invalid. Received: " + obj);
            case 20:
                if ("layout/item_invest_network_fee_0".equals(obj)) {
                    return new iIR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_network_fee is invalid. Received: " + obj);
            case 21:
                if ("layout/item_invest_order_list_0".equals(obj)) {
                    return new C23782iJc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_order_list is invalid. Received: " + obj);
            case 22:
                if ("layout/item_invest_pool_type_choose_dialog_0".equals(obj)) {
                    return new C23786iJg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_pool_type_choose_dialog is invalid. Received: " + obj);
            case 23:
                if ("layout/item_invest_position_select_0".equals(obj)) {
                    return new C23783iJd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_position_select is invalid. Received: " + obj);
            case 24:
                if ("layout/item_invest_search_protocol_0".equals(obj)) {
                    return new C23789iJj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_invest_search_protocol is invalid. Received: " + obj);
            case 25:
                if ("layout/layout_invest_multi_tab_activity_header_0".equals(obj)) {
                    return new C23811iKe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_multi_tab_activity_header is invalid. Received: " + obj);
            case 26:
                if ("layout/layout_invest_network_fees_0".equals(obj)) {
                    return new C23808iKb(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_invest_network_fees is invalid. Received: " + obj);
            case 27:
                if ("layout/layout_invest_redeem_process_dialog_0".equals(obj)) {
                    return new C23818iKl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_redeem_process_dialog is invalid. Received: " + obj);
            case 28:
                if ("layout/layout_invest_risk_grade_dialog_0".equals(obj)) {
                    return new C23826iKt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_risk_grade_dialog is invalid. Received: " + obj);
            case 29:
                if ("layout/layout_invest_security_score_dialog_0".equals(obj)) {
                    return new C23825iKs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_security_score_dialog is invalid. Received: " + obj);
            case 30:
                if ("layout/layout_invest_subscription_gains_more_dialog_0".equals(obj)) {
                    return new C23830iKx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_subscription_gains_more_dialog is invalid. Received: " + obj);
            case 31:
                if ("layout/layout_invest_subscription_process_dialog_0".equals(obj)) {
                    return new C23832iKz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_subscription_process_dialog is invalid. Received: " + obj);
            case 32:
                if ("layout/layout_invest_subscription_process_invest_item_0".equals(obj)) {
                    return new C23828iKv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_subscription_process_invest_item is invalid. Received: " + obj);
            case 33:
                if ("layout/layout_invest_univ3_amount_input_view_0".equals(obj)) {
                    return new iKI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_univ3_amount_input_view is invalid. Received: " + obj);
            case 34:
                if ("layout/layout_invest_univ3_depth_chart_0".equals(obj)) {
                    return new iKH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_univ3_depth_chart is invalid. Received: " + obj);
            case 35:
                if ("layout/layout_invest_univ3_depth_flag_0".equals(obj)) {
                    return new iKN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_univ3_depth_flag is invalid. Received: " + obj);
            case 36:
                if ("layout/layout_invest_univ3_price_chart_0".equals(obj)) {
                    return new iKT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_univ3_price_chart is invalid. Received: " + obj);
            case 37:
                if ("layout/layout_invest_univ3_price_flag_0".equals(obj)) {
                    return new iKX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_univ3_price_flag is invalid. Received: " + obj);
            case 38:
                if ("layout/layout_invest_univ3_price_input_view_0".equals(obj)) {
                    return new iKY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_univ3_price_input_view is invalid. Received: " + obj);
            case 39:
                if ("layout/layout_invest_validator_dialog_0".equals(obj)) {
                    return new C23834iLa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_invest_validator_dialog is invalid. Received: " + obj);
            case 40:
                if ("layout/redeem_validator_item_0".equals(obj)) {
                    return new C23848iLo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for redeem_validator_item is invalid. Received: " + obj);
            case 41:
                if ("layout/view_invest_confirm_bottom_0".equals(obj)) {
                    return new C23850iLq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_invest_confirm_bottom is invalid. Received: " + obj);
            case 42:
                if ("layout/view_invest_widget_single_left_right_input_0".equals(obj)) {
                    return new C23857iLx(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_invest_widget_single_left_right_input is invalid. Received: " + obj);
            case 43:
                if ("layout/widget_available_balance_layout_0".equals(obj)) {
                    return new C23856iLw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_available_balance_layout is invalid. Received: " + obj);
            case 44:
                if ("layout/widget_custom_double_view_0".equals(obj)) {
                    return new iLB(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for widget_custom_double_view is invalid. Received: " + obj);
            case 45:
                if ("layout/widget_custom_sub_view_0".equals(obj)) {
                    return new iLA(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for widget_custom_sub_view is invalid. Received: " + obj);
            case 46:
                if ("layout/widget_invest_common_load_fail_0".equals(obj)) {
                    return new iLD(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for widget_invest_common_load_fail is invalid. Received: " + obj);
            case 47:
                if ("layout/widget_invest_detail_info_more_token_0".equals(obj)) {
                    return new iLJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_detail_info_more_token is invalid. Received: " + obj);
            case 48:
                if ("layout/widget_invest_exchange_rate_0".equals(obj)) {
                    return new iLR(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for widget_invest_exchange_rate is invalid. Received: " + obj);
            case 49:
                if ("layout/widget_invest_filter_window_0".equals(obj)) {
                    return new iLO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_filter_window is invalid. Received: " + obj);
            case 50:
                if ("layout/widget_invest_gains_item_0".equals(obj)) {
                    return new iLS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_gains_item is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding KWHzl(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/widget_invest_gains_item_v2_0".equals(obj)) {
                    return new iLT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_gains_item_v2 is invalid. Received: " + obj);
            case 52:
                if ("layout/widget_invest_gains_more_item_0".equals(obj)) {
                    return new iLU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_gains_more_item is invalid. Received: " + obj);
            case 53:
                if ("layout/widget_invest_gains_view_0".equals(obj)) {
                    return new C23862iMb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_gains_view is invalid. Received: " + obj);
            case 54:
                if ("layout/widget_invest_gains_view_v2_0".equals(obj)) {
                    return new iLX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_gains_view_v2 is invalid. Received: " + obj);
            case 55:
                if ("layout/widget_invest_input_gains_item_0".equals(obj)) {
                    return new C23864iMd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_input_gains_item is invalid. Received: " + obj);
            case 56:
                if ("layout/widget_invest_input_gains_item_v2_0".equals(obj)) {
                    return new C23867iMg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_input_gains_item_v2 is invalid. Received: " + obj);
            case 57:
                if ("layout/widget_invest_input_gains_view_0".equals(obj)) {
                    return new C23870iMj(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for widget_invest_input_gains_view is invalid. Received: " + obj);
            case 58:
                if ("layout/widget_invest_input_points_item_0".equals(obj)) {
                    return new C23868iMh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_input_points_item is invalid. Received: " + obj);
            case 59:
                if ("layout/widget_invest_load_fail_0".equals(obj)) {
                    return new C23874iMn(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for widget_invest_load_fail is invalid. Received: " + obj);
            case 60:
                if ("layout/widget_invest_multi_pool_input_layout_0".equals(obj)) {
                    return new C23875iMo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_multi_pool_input_layout is invalid. Received: " + obj);
            case 61:
                if ("layout/widget_invest_no_data_0".equals(obj)) {
                    return new C23877iMq(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for widget_invest_no_data is invalid. Received: " + obj);
            case 62:
                if ("layout/widget_invest_redeem_input_receive_item_0".equals(obj)) {
                    return new C23882iMv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_redeem_input_receive_item is invalid. Received: " + obj);
            case 63:
                if ("layout/widget_invest_redeem_input_receive_item_v2_0".equals(obj)) {
                    return new C23879iMs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_redeem_input_receive_item_v2 is invalid. Received: " + obj);
            case 64:
                if ("layout/widget_invest_redeem_input_receive_view_0".equals(obj)) {
                    return new C23886iMz(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for widget_invest_redeem_input_receive_view is invalid. Received: " + obj);
            case 65:
                if ("layout/widget_invest_redeem_receive_item_0".equals(obj)) {
                    return new iME(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_redeem_receive_item is invalid. Received: " + obj);
            case 66:
                if ("layout/widget_invest_redeem_receive_item_v2_0".equals(obj)) {
                    return new iMC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_redeem_receive_item_v2 is invalid. Received: " + obj);
            case 67:
                if ("layout/widget_invest_redeem_receive_view_0".equals(obj)) {
                    return new iMD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_redeem_receive_view is invalid. Received: " + obj);
            case 68:
                if ("layout/widget_invest_redeem_receive_view_v2_0".equals(obj)) {
                    return new iMI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_redeem_receive_view_v2 is invalid. Received: " + obj);
            case 69:
                if ("layout/widget_invest_redeem_warning_message_item_0".equals(obj)) {
                    return new iMH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_redeem_warning_message_item is invalid. Received: " + obj);
            case 70:
                if ("layout/widget_invest_with_view_0".equals(obj)) {
                    return new C23896iNi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_invest_with_view is invalid. Received: " + obj);
            case 71:
                if ("layout/widget_redeem_double_token_display_0".equals(obj)) {
                    return new C23901iNn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_redeem_double_token_display is invalid. Received: " + obj);
            case 72:
                if ("layout/widget_redeem_single_token_display_0".equals(obj)) {
                    return new C23902iNo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_redeem_single_token_display is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = OLrzqt.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i3 = (i2 - 1) / 50;
        if (i3 == 0) {
            return AEQbTJ(dataBindingComponent, view, i2, tag);
        }
        if (i3 != 1) {
            return null;
        }
        return KWHzl(dataBindingComponent, view, i2, tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr == null || viewArr.length == 0 || (i2 = OLrzqt.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 26) {
            if ("layout/layout_invest_network_fees_0".equals(tag)) {
                return new C23808iKb(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for layout_invest_network_fees is invalid. Received: " + tag);
        }
        if (i2 == 42) {
            if ("layout/view_invest_widget_single_left_right_input_0".equals(tag)) {
                return new C23857iLx(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for view_invest_widget_single_left_right_input is invalid. Received: " + tag);
        }
        if (i2 == 48) {
            if ("layout/widget_invest_exchange_rate_0".equals(tag)) {
                return new iLR(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for widget_invest_exchange_rate is invalid. Received: " + tag);
        }
        if (i2 == 57) {
            if ("layout/widget_invest_input_gains_view_0".equals(tag)) {
                return new C23870iMj(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for widget_invest_input_gains_view is invalid. Received: " + tag);
        }
        if (i2 == 59) {
            if ("layout/widget_invest_load_fail_0".equals(tag)) {
                return new C23874iMn(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for widget_invest_load_fail is invalid. Received: " + tag);
        }
        if (i2 == 61) {
            if ("layout/widget_invest_no_data_0".equals(tag)) {
                return new C23877iMq(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for widget_invest_no_data is invalid. Received: " + tag);
        }
        if (i2 != 64) {
            switch (i2) {
                case 44:
                    if ("layout/widget_custom_double_view_0".equals(tag)) {
                        return new iLB(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for widget_custom_double_view is invalid. Received: " + tag);
                case 45:
                    if ("layout/widget_custom_sub_view_0".equals(tag)) {
                        return new iLA(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for widget_custom_sub_view is invalid. Received: " + tag);
                case 46:
                    if ("layout/widget_invest_common_load_fail_0".equals(tag)) {
                        return new iLD(dataBindingComponent, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for widget_invest_common_load_fail is invalid. Received: " + tag);
                default:
                    return null;
            }
        }
        if ("layout/widget_invest_redeem_input_receive_view_0".equals(tag)) {
            return new C23886iMz(dataBindingComponent, viewArr);
        }
        throw new IllegalArgumentException("The tag for widget_invest_redeem_input_receive_view is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = Application.copydefault.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return StateListAnimator.copydefault.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3Uilib.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class StateListAnimator {
        public static final SparseArray<String> copydefault;

        private StateListAnimator() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(11);
            copydefault = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "item");
            sparseArray.put(4, "itemData");
            sparseArray.put(5, "leftButton");
            sparseArray.put(6, "model");
            sparseArray.put(7, "rightButton");
            sparseArray.put(8, "showCloseButton");
            sparseArray.put(9, "singelButton");
            sparseArray.put(10, "title");
        }
    }

    public static class Application {
        public static final HashMap<String, Integer> copydefault;

        private Application() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(72);
            copydefault = map;
            map.put("layout/activity_invest_order_list_0", Integer.valueOf(C25493ixk.Activity.AhwBna));
            map.put("layout/activity_invest_subscription_0", Integer.valueOf(C25493ixk.Activity.djBIcL));
            map.put("layout/activity_swap_slippage_0", Integer.valueOf(C25493ixk.Activity.AkhnZx));
            map.put("layout/fragment_invest_base_bottom_0", Integer.valueOf(C25493ixk.Activity.AwvSrB));
            map.put("layout/fragment_invest_common_placeorder_keypad_0", Integer.valueOf(C25493ixk.Activity.zuBGHE));
            map.put("layout/fragment_invest_redeem_pool_choose_0", Integer.valueOf(C25493ixk.Activity.QKVWgx));
            map.put("layout/fragment_invest_slip_confirm_0", Integer.valueOf(C25493ixk.Activity.OcIXYQ));
            map.put("layout/fragment_invest_subscription_content_new_0", Integer.valueOf(C25493ixk.Activity.QOLQEE));
            map.put("layout/fragment_invest_subscription_v2_0", Integer.valueOf(C25493ixk.Activity.QUSxYX));
            map.put("layout/fragment_redeem_transaction_0", Integer.valueOf(C25493ixk.Activity.RJOkX));
            map.put("layout/fragment_redeem_transaction_v2_0", Integer.valueOf(C25493ixk.Activity.QfsBiF));
            map.put("layout/fragment_redeem_transaction_v3_0", Integer.valueOf(C25493ixk.Activity.QbewEr));
            map.put("layout/fragment_single_redeem_transaction_0", Integer.valueOf(C25493ixk.Activity.UeEOUB));
            map.put("layout/invest_validator_item_0", Integer.valueOf(C25493ixk.Activity.dxcTrN));
            map.put("layout/item_invest_babylon_redeem_position_0", Integer.valueOf(C25493ixk.Activity.ODWQjV));
            map.put("layout/item_invest_bottomsheet_batch_claim_0", Integer.valueOf(C25493ixk.Activity.DCJXGO));
            map.put("layout/item_invest_expiry_position_select_0", Integer.valueOf(C25493ixk.Activity.DCUTEI));
            map.put("layout/item_invest_filter_window_0", Integer.valueOf(C25493ixk.Activity.QHmsKR));
            map.put("layout/item_invest_finality_provider_0", Integer.valueOf(C25493ixk.Activity.RKDWNf));
            map.put("layout/item_invest_network_fee_0", Integer.valueOf(C25493ixk.Activity.dHguZz));
            map.put("layout/item_invest_order_list_0", Integer.valueOf(C25493ixk.Activity.OxVOHk));
            map.put("layout/item_invest_pool_type_choose_dialog_0", Integer.valueOf(C25493ixk.Activity.QSLkRj));
            map.put("layout/item_invest_position_select_0", Integer.valueOf(C25493ixk.Activity.OJuSTm));
            map.put("layout/item_invest_search_protocol_0", Integer.valueOf(C25493ixk.Activity.aUsmxb));
            map.put("layout/layout_invest_multi_tab_activity_header_0", Integer.valueOf(C25493ixk.Activity.aHXSQp));
            map.put("layout/layout_invest_network_fees_0", Integer.valueOf(C25493ixk.Activity.UscePu));
            map.put("layout/layout_invest_redeem_process_dialog_0", Integer.valueOf(C25493ixk.Activity.fXHmeK));
            map.put("layout/layout_invest_risk_grade_dialog_0", Integer.valueOf(C25493ixk.Activity.fsSxsn));
            map.put("layout/layout_invest_security_score_dialog_0", Integer.valueOf(C25493ixk.Activity.gUEfcq));
            map.put("layout/layout_invest_subscription_gains_more_dialog_0", Integer.valueOf(C25493ixk.Activity.sTzBva));
            map.put("layout/layout_invest_subscription_process_dialog_0", Integer.valueOf(C25493ixk.Activity.iPSTqm));
            map.put("layout/layout_invest_subscription_process_invest_item_0", Integer.valueOf(C25493ixk.Activity.hvKCwS));
            map.put("layout/layout_invest_univ3_amount_input_view_0", Integer.valueOf(C25493ixk.Activity.zDUObI));
            map.put("layout/layout_invest_univ3_depth_chart_0", Integer.valueOf(C25493ixk.Activity.zOIQXb));
            map.put("layout/layout_invest_univ3_depth_flag_0", Integer.valueOf(C25493ixk.Activity.zhUgOk));
            map.put("layout/layout_invest_univ3_price_chart_0", Integer.valueOf(C25493ixk.Activity.getPriority));
            map.put("layout/layout_invest_univ3_price_flag_0", Integer.valueOf(C25493ixk.Activity.getLabel));
            map.put("layout/layout_invest_univ3_price_input_view_0", Integer.valueOf(C25493ixk.Activity.DGUQLIOvDItG));
            map.put("layout/layout_invest_validator_dialog_0", Integer.valueOf(C25493ixk.Activity.gtCCJH));
            map.put("layout/redeem_validator_item_0", Integer.valueOf(C25493ixk.Activity.gtdfxv));
            map.put("layout/view_invest_confirm_bottom_0", Integer.valueOf(C25493ixk.Activity.hrjNmC));
            map.put("layout/view_invest_widget_single_left_right_input_0", Integer.valueOf(C25493ixk.Activity.zzQwtT));
            map.put("layout/widget_available_balance_layout_0", Integer.valueOf(C25493ixk.Activity.fGQ));
            map.put("layout/widget_custom_double_view_0", Integer.valueOf(C25493ixk.Activity.DKtBnz));
            map.put("layout/widget_custom_sub_view_0", Integer.valueOf(C25493ixk.Activity.iKEqwx));
            map.put("layout/widget_invest_common_load_fail_0", Integer.valueOf(C25493ixk.Activity.DrNnAm));
            map.put("layout/widget_invest_detail_info_more_token_0", Integer.valueOf(C25493ixk.Activity.RAQtXZ));
            map.put("layout/widget_invest_exchange_rate_0", Integer.valueOf(C25493ixk.Activity.geLlBI));
            map.put("layout/widget_invest_filter_window_0", Integer.valueOf(C25493ixk.Activity.DQzvGN));
            map.put("layout/widget_invest_gains_item_0", Integer.valueOf(C25493ixk.Activity.ihnvzI));
            map.put("layout/widget_invest_gains_item_v2_0", Integer.valueOf(C25493ixk.Activity.DQYQgr));
            map.put("layout/widget_invest_gains_more_item_0", Integer.valueOf(C25493ixk.Activity.reset));
            map.put("layout/widget_invest_gains_view_0", Integer.valueOf(C25493ixk.Activity.zLAIeZ));
            map.put("layout/widget_invest_gains_view_v2_0", Integer.valueOf(C25493ixk.Activity.DQzvGNdrmXxu));
            map.put("layout/widget_invest_input_gains_item_0", Integer.valueOf(C25493ixk.Activity.isReflectionWorking));
            map.put("layout/widget_invest_input_gains_item_v2_0", Integer.valueOf(C25493ixk.Activity.gdmIOq));
            map.put("layout/widget_invest_input_gains_view_0", Integer.valueOf(C25493ixk.Activity.DQzvGNdrmXxudrmXxu));
            map.put("layout/widget_invest_input_points_item_0", Integer.valueOf(C25493ixk.Activity.DTeKQX));
            map.put("layout/widget_invest_load_fail_0", Integer.valueOf(C25493ixk.Activity.RSDDiY));
            map.put("layout/widget_invest_multi_pool_input_layout_0", Integer.valueOf(C25493ixk.Activity.RIuxYh));
            map.put("layout/widget_invest_no_data_0", Integer.valueOf(C25493ixk.Activity.DcMfJK));
            map.put("layout/widget_invest_redeem_input_receive_item_0", Integer.valueOf(C25493ixk.Activity.RTWSvT));
            map.put("layout/widget_invest_redeem_input_receive_item_v2_0", Integer.valueOf(C25493ixk.Activity.RkASWs));
            map.put("layout/widget_invest_redeem_input_receive_view_0", Integer.valueOf(C25493ixk.Activity.RgLUBD));
            map.put("layout/widget_invest_redeem_receive_item_0", Integer.valueOf(C25493ixk.Activity.RqmePg));
            map.put("layout/widget_invest_redeem_receive_item_v2_0", Integer.valueOf(C25493ixk.Activity.UccSpe));
            map.put("layout/widget_invest_redeem_receive_view_0", Integer.valueOf(C25493ixk.Activity.RzdrRQ));
            map.put("layout/widget_invest_redeem_receive_view_v2_0", Integer.valueOf(C25493ixk.Activity.invokespecialODCBUN));
            map.put("layout/widget_invest_redeem_warning_message_item_0", Integer.valueOf(C25493ixk.Activity.invokespecialROgMPW));
            map.put("layout/widget_invest_with_view_0", Integer.valueOf(C25493ixk.Activity.dIjzlO));
            map.put("layout/widget_redeem_double_token_display_0", Integer.valueOf(C25493ixk.Activity.gBtXYZ));
            map.put("layout/widget_redeem_single_token_display_0", Integer.valueOf(C25493ixk.Activity.fupbxE));
        }
    }
}
