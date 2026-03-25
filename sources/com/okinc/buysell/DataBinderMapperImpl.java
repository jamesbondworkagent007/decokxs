package com.okinc.buysell;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.just.agentweb.DefaultChromeClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C31351lsQ;
import o.C31399ltL;
import o.C31401ltN;
import o.C31403ltP;
import o.C31405ltR;
import o.C31406ltS;
import o.C31408ltU;
import o.C31411ltX;
import o.C31441luA;
import o.C31444luD;
import o.C31446luF;
import o.C31448luH;
import o.C31450luJ;
import o.C31454luN;
import o.C31455luO;
import o.C31458luR;
import o.C31459luS;
import o.C31460luT;
import o.C31461luU;
import o.C31463luW;
import o.C31467lua;
import o.C31468lub;
import o.C31471lue;
import o.C31473lug;
import o.C31474luh;
import o.C31477luk;
import o.C31478lul;
import o.C31485lus;
import o.C31486lut;
import o.C31488luv;
import o.C31491luy;
import o.C31495lvB;
import o.C31498lvE;
import o.C31499lvF;
import o.C31500lvG;
import o.C31504lvK;
import o.C31505lvL;
import o.C31509lvP;
import o.C31510lvQ;
import o.C31511lvR;
import o.C31512lvS;
import o.C31516lvW;
import o.C31519lvZ;
import o.C31521lvb;
import o.C31522lvc;
import o.C31523lvd;
import o.C31524lve;
import o.C31525lvf;
import o.C31529lvj;
import o.C31530lvk;
import o.C31532lvm;
import o.C31534lvo;
import o.C31535lvp;
import o.C31539lvt;
import o.C31542lvw;
import o.C31543lvx;
import o.C31545lvz;
import o.C31547lwA;
import o.C31551lwE;
import o.C31556lwJ;
import o.C31557lwK;
import o.C31559lwM;
import o.C31561lwO;
import o.C31564lwR;
import o.C31566lwT;
import o.C31571lwY;
import o.C31573lwb;
import o.C31574lwc;
import o.C31575lwd;
import o.C31578lwg;
import o.C31581lwj;
import o.C31583lwl;
import o.C31585lwn;
import o.C31586lwo;
import o.C31588lwq;
import o.C31589lwr;
import o.C31592lwu;
import o.C31599lxa;
import o.C31600lxb;
import o.C31602lxd;
import o.C31604lxf;
import o.C31605lxg;
import o.C31609lxk;
import o.C31611lxm;
import o.C31612lxn;
import o.C31614lxp;
import o.C31616lxr;
import o.C31620lxv;
import o.C31621lxw;
import o.C31622lxx;
import o.C31624lxz;
import o.lwZ;
import o.lxB;
import o.lxE;
import o.lxG;
import o.lxH;
import o.lxJ;
import o.lxL;
import o.lxQ;

/* JADX INFO: loaded from: classes7.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray AEQbTJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(98);
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C31351lsQ.ActionBar.OLrzqt, 1);
        sparseIntArray.put(C31351lsQ.ActionBar.copydefault, 2);
        sparseIntArray.put(C31351lsQ.ActionBar.EZpvd, 3);
        sparseIntArray.put(C31351lsQ.ActionBar.AEQbTJ, 4);
        sparseIntArray.put(C31351lsQ.ActionBar.KWHzl, 5);
        sparseIntArray.put(C31351lsQ.ActionBar.gEmmrt, 6);
        sparseIntArray.put(C31351lsQ.ActionBar.valueOf, 7);
        sparseIntArray.put(C31351lsQ.ActionBar.djBIcL, 8);
        sparseIntArray.put(C31351lsQ.ActionBar.AhwBna, 9);
        sparseIntArray.put(C31351lsQ.ActionBar.isConnected, 10);
        sparseIntArray.put(C31351lsQ.ActionBar.DbNXlk, 11);
        sparseIntArray.put(C31351lsQ.ActionBar.values, 12);
        sparseIntArray.put(C31351lsQ.ActionBar.AkhnZx, 13);
        sparseIntArray.put(C31351lsQ.ActionBar.fJNWhG, 14);
        sparseIntArray.put(C31351lsQ.ActionBar.AuCTel, 15);
        sparseIntArray.put(C31351lsQ.ActionBar.ejfBZ, 16);
        sparseIntArray.put(C31351lsQ.ActionBar.getFieldNames, 17);
        sparseIntArray.put(C31351lsQ.ActionBar.uzCIH, 18);
        sparseIntArray.put(C31351lsQ.ActionBar.hDKMBd, 19);
        sparseIntArray.put(C31351lsQ.ActionBar.getNewProxyInstance, 20);
        sparseIntArray.put(C31351lsQ.ActionBar.AubY, 21);
        sparseIntArray.put(C31351lsQ.ActionBar.AuCTelauCTel, 22);
        sparseIntArray.put(C31351lsQ.ActionBar.zLjUOn, 23);
        sparseIntArray.put(C31351lsQ.ActionBar.wlaJM, 24);
        sparseIntArray.put(C31351lsQ.ActionBar.zsXlph, 25);
        sparseIntArray.put(C31351lsQ.ActionBar.AxsJAY, 26);
        sparseIntArray.put(C31351lsQ.ActionBar.gHZMYf, 27);
        sparseIntArray.put(C31351lsQ.ActionBar.sSMYrx, 28);
        sparseIntArray.put(C31351lsQ.ActionBar.zuBGHE, 29);
        sparseIntArray.put(C31351lsQ.ActionBar.AwvSrB, 30);
        sparseIntArray.put(C31351lsQ.ActionBar.OcIXYQ, 31);
        sparseIntArray.put(C31351lsQ.ActionBar.QKVWgx, 32);
        sparseIntArray.put(C31351lsQ.ActionBar.DTwDnp, 33);
        sparseIntArray.put(C31351lsQ.ActionBar.QOLQEE, 34);
        sparseIntArray.put(C31351lsQ.ActionBar.ORxRYg, 35);
        sparseIntArray.put(C31351lsQ.ActionBar.RJOkX, 36);
        sparseIntArray.put(C31351lsQ.ActionBar.QVAiDq, 37);
        sparseIntArray.put(C31351lsQ.ActionBar.QbewEr, 38);
        sparseIntArray.put(C31351lsQ.ActionBar.QUSxYX, 39);
        sparseIntArray.put(C31351lsQ.ActionBar.QfsBiF, 40);
        sparseIntArray.put(C31351lsQ.ActionBar.dNCPSb, 41);
        sparseIntArray.put(C31351lsQ.ActionBar.djSkpj, 42);
        sparseIntArray.put(C31351lsQ.ActionBar.aKErDB, 43);
        sparseIntArray.put(C31351lsQ.ActionBar.RcXXUw, 44);
        sparseIntArray.put(C31351lsQ.ActionBar.UeEOUB, 45);
        sparseIntArray.put(C31351lsQ.ActionBar.finit, 46);
        sparseIntArray.put(C31351lsQ.ActionBar.fFgQHt, 47);
        sparseIntArray.put(C31351lsQ.ActionBar.dvKsVJ, 48);
        sparseIntArray.put(C31351lsQ.ActionBar.fZBcTu, 49);
        sparseIntArray.put(C31351lsQ.ActionBar.gGvvIC, 50);
        sparseIntArray.put(C31351lsQ.ActionBar.flVtFt, 51);
        sparseIntArray.put(C31351lsQ.ActionBar.giSNqX, 52);
        sparseIntArray.put(C31351lsQ.ActionBar.fvQaOB, 53);
        sparseIntArray.put(C31351lsQ.ActionBar.gasjUx, 54);
        sparseIntArray.put(C31351lsQ.ActionBar.gkJEwt, 55);
        sparseIntArray.put(C31351lsQ.ActionBar.AxsJAYaxsJAY, 56);
        sparseIntArray.put(C31351lsQ.ActionBar.iZzfmt, 57);
        sparseIntArray.put(C31351lsQ.ActionBar.iRxXKY, 58);
        sparseIntArray.put(C31351lsQ.ActionBar.hUfVAv, 59);
        sparseIntArray.put(C31351lsQ.ActionBar.DAIeex, 60);
        sparseIntArray.put(C31351lsQ.ActionBar.RlQdEF, 61);
        sparseIntArray.put(C31351lsQ.ActionBar.QKudOq, 62);
        sparseIntArray.put(C31351lsQ.ActionBar.AxsJAYsNCnLh, 63);
        sparseIntArray.put(C31351lsQ.ActionBar.accept, 64);
        sparseIntArray.put(C31351lsQ.ActionBar.ODWQjV, 65);
        sparseIntArray.put(C31351lsQ.ActionBar.DXXBbs, 66);
        sparseIntArray.put(C31351lsQ.ActionBar.DarRvM, 67);
        sparseIntArray.put(C31351lsQ.ActionBar.DCJXGO, 68);
        sparseIntArray.put(C31351lsQ.ActionBar.OqFWZa, 69);
        sparseIntArray.put(C31351lsQ.ActionBar.ffGIBT, 70);
        sparseIntArray.put(C31351lsQ.ActionBar.DCUTEI, 71);
        sparseIntArray.put(C31351lsQ.ActionBar.zuWLRA, 72);
        sparseIntArray.put(C31351lsQ.ActionBar.OuxcSI, 73);
        sparseIntArray.put(C31351lsQ.ActionBar.RKDWNf, 74);
        sparseIntArray.put(C31351lsQ.ActionBar.QHmsKR, 75);
        sparseIntArray.put(C31351lsQ.ActionBar.QSBOWP, 76);
        sparseIntArray.put(C31351lsQ.ActionBar.OBJEWx, 77);
        sparseIntArray.put(C31351lsQ.ActionBar.dHguZz, 78);
        sparseIntArray.put(C31351lsQ.ActionBar.RdAHlO, 79);
        sparseIntArray.put(C31351lsQ.ActionBar.hBpjJd, 80);
        sparseIntArray.put(C31351lsQ.ActionBar.gwTjWJ, 81);
        sparseIntArray.put(C31351lsQ.ActionBar.hrNTAI, 82);
        sparseIntArray.put(C31351lsQ.ActionBar.DLWbHP, 83);
        sparseIntArray.put(C31351lsQ.ActionBar.ODXsMY, 84);
        sparseIntArray.put(C31351lsQ.ActionBar.OHqIaq, 85);
        sparseIntArray.put(C31351lsQ.ActionBar.OFhtUX, 86);
        sparseIntArray.put(C31351lsQ.ActionBar.OJuSTm, 87);
        sparseIntArray.put(C31351lsQ.ActionBar.OxVOHk, 88);
        sparseIntArray.put(C31351lsQ.ActionBar.QVsKAR, 89);
        sparseIntArray.put(C31351lsQ.ActionBar.QSLkRj, 90);
        sparseIntArray.put(C31351lsQ.ActionBar.aUsmxb, 91);
        sparseIntArray.put(C31351lsQ.ActionBar.dUDNAs, 92);
        sparseIntArray.put(C31351lsQ.ActionBar.QwvEab, 93);
        sparseIntArray.put(C31351lsQ.ActionBar.UlJrfe, 94);
        sparseIntArray.put(C31351lsQ.ActionBar.USBtdM, 95);
        sparseIntArray.put(C31351lsQ.ActionBar.htlTjW, 96);
        sparseIntArray.put(C31351lsQ.ActionBar.fdOvFl, 97);
        sparseIntArray.put(C31351lsQ.ActionBar.igXuih, 98);
    }

    private final ViewDataBinding EZpvd(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/activity_bsc_convert_result_0".equals(obj)) {
                    return new C31399ltL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_bsc_convert_result is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_bsc_deeplink_host_0".equals(obj)) {
                    return new C31403ltP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_bsc_deeplink_host is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_bsc_dex_enable_dex_trading_0".equals(obj)) {
                    return new C31401ltN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_bsc_dex_enable_dex_trading is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_bsc_host_level2_0".equals(obj)) {
                    return new C31405ltR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_bsc_host_level2 is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_buy_sell_order_detail_0".equals(obj)) {
                    return new C31406ltS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_buy_sell_order_detail is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_buy_sell_payment_method_list_0".equals(obj)) {
                    return new C31408ltU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_buy_sell_payment_method_list is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_buy_sell_result_0".equals(obj)) {
                    return new C31467lua(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_buy_sell_result is invalid. Received: " + obj);
            case 8:
                if ("layout/activity_dex_brief_0".equals(obj)) {
                    return new C31411ltX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_dex_brief is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_lite_limit_order_details_0".equals(obj)) {
                    return new C31471lue(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_lite_limit_order_details is invalid. Received: " + obj);
            case 10:
                if ("layout/activity_recurring_buy_plan_host_0".equals(obj)) {
                    return new C31468lub(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_recurring_buy_plan_host is invalid. Received: " + obj);
            case 11:
                if ("layout/bottom_sheet_available_balance_0".equals(obj)) {
                    return new C31474luh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_available_balance is invalid. Received: " + obj);
            case 12:
                if ("layout/bottom_sheet_bsc_payment_limits_0".equals(obj)) {
                    return new C31473lug(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_bsc_payment_limits is invalid. Received: " + obj);
            case 13:
                if ("layout/bottom_sheet_bsc_select_payment_method_0".equals(obj)) {
                    return new C31477luk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_bsc_select_payment_method is invalid. Received: " + obj);
            case 14:
                if ("layout/bottom_sheet_insufficient_dialog_0".equals(obj)) {
                    return new C31478lul(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_insufficient_dialog is invalid. Received: " + obj);
            case 15:
                if ("layout/bottom_sheet_legacy_pro_qp_convert_channel_page_0".equals(obj)) {
                    return new C31485lus(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_legacy_pro_qp_convert_channel_page is invalid. Received: " + obj);
            case 16:
                if ("layout/bottom_sheet_recurring_buy_edit_amount_0".equals(obj)) {
                    return new C31486lut(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_recurring_buy_edit_amount is invalid. Received: " + obj);
            case 17:
                if ("layout/bottom_sheet_recurring_frequency_option_0".equals(obj)) {
                    return new C31491luy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottom_sheet_recurring_frequency_option is invalid. Received: " + obj);
            case 18:
                if ("layout/bottomsheet_bsc_add_paypal_preload_0".equals(obj)) {
                    return new C31488luv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottomsheet_bsc_add_paypal_preload is invalid. Received: " + obj);
            case 19:
                if ("layout/bottomsheet_bsc_recurring_buy_0".equals(obj)) {
                    return new C31444luD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottomsheet_bsc_recurring_buy is invalid. Received: " + obj);
            case 20:
                if ("layout/bottomsheet_bsc_transfer_notice_0".equals(obj)) {
                    return new C31441luA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottomsheet_bsc_transfer_notice is invalid. Received: " + obj);
            case 21:
                if ("layout/bottomsheet_buy_sell_account_management_0".equals(obj)) {
                    return new C31446luF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottomsheet_buy_sell_account_management is invalid. Received: " + obj);
            case 22:
                if ("layout/bottomsheet_buy_sell_order_detail_security_hold_0".equals(obj)) {
                    return new C31450luJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottomsheet_buy_sell_order_detail_security_hold is invalid. Received: " + obj);
            case 23:
                if ("layout/bottomsheet_crypto_list_container_0".equals(obj)) {
                    return new C31448luH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottomsheet_crypto_list_container is invalid. Received: " + obj);
            case 24:
                if ("layout/bottomsheet_google_pay_add_card_0".equals(obj)) {
                    return new C31455luO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottomsheet_google_pay_add_card is invalid. Received: " + obj);
            case 25:
                if ("layout/bottomsheet_quick_convert_0".equals(obj)) {
                    return new C31454luN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottomsheet_quick_convert is invalid. Received: " + obj);
            case 26:
                if ("layout/fg_fiat_crypto_order_pager_0".equals(obj)) {
                    return new C31459luS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fg_fiat_crypto_order_pager is invalid. Received: " + obj);
            case 27:
                if ("layout/fg_fiat_crypto_unified_order_pager_0".equals(obj)) {
                    return new C31460luT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fg_fiat_crypto_unified_order_pager is invalid. Received: " + obj);
            case 28:
                if ("layout/fg_order_list_filter_bottomsheet_0".equals(obj)) {
                    return new C31458luR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fg_order_list_filter_bottomsheet is invalid. Received: " + obj);
            case 29:
                if ("layout/fragment_bsc_buy_input_0".equals(obj)) {
                    return new C31461luU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bsc_buy_input is invalid. Received: " + obj);
            case 30:
                if ("layout/fragment_bsc_convert_input_0".equals(obj)) {
                    return new C31463luW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bsc_convert_input is invalid. Received: " + obj);
            case 31:
                if ("layout/fragment_bsc_crypto_list_legacy_0".equals(obj)) {
                    return new C31521lvb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bsc_crypto_list_legacy is invalid. Received: " + obj);
            case 32:
                if ("layout/fragment_bsc_master_input_0".equals(obj)) {
                    return new C31523lvd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bsc_master_input is invalid. Received: " + obj);
            case 33:
                if ("layout/fragment_bsc_pro_container_0".equals(obj)) {
                    return new C31522lvc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bsc_pro_container is invalid. Received: " + obj);
            case 34:
                if ("layout/fragment_bsc_select_payment_method_v3_0".equals(obj)) {
                    return new C31525lvf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bsc_select_payment_method_v3 is invalid. Received: " + obj);
            case 35:
                if ("layout/fragment_bsc_sell_input_0".equals(obj)) {
                    return new C31524lve(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bsc_sell_input is invalid. Received: " + obj);
            case 36:
                if ("layout/fragment_buy_sell_order_detail_0".equals(obj)) {
                    return new C31532lvm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_buy_sell_order_detail is invalid. Received: " + obj);
            case 37:
                if ("layout/fragment_buy_sell_order_detail_v2_0".equals(obj)) {
                    return new C31530lvk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_buy_sell_order_detail_v2 is invalid. Received: " + obj);
            case 38:
                if ("layout/fragment_buy_sell_payment_method_0".equals(obj)) {
                    return new C31529lvj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_buy_sell_payment_method is invalid. Received: " + obj);
            case 39:
                if ("layout/fragment_buy_sell_select_payment_method_0".equals(obj)) {
                    return new C31535lvp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_buy_sell_select_payment_method is invalid. Received: " + obj);
            case 40:
                if ("layout/fragment_crypto_list_0".equals(obj)) {
                    return new C31534lvo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_crypto_list is invalid. Received: " + obj);
            case 41:
                if ("layout/fragment_dex_brief_0".equals(obj)) {
                    return new C31539lvt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dex_brief is invalid. Received: " + obj);
            case 42:
                if ("layout/fragment_quick_convert_0".equals(obj)) {
                    return new C31542lvw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_quick_convert is invalid. Received: " + obj);
            case 43:
                if ("layout/fragment_recurring_buy_plan_detail_0".equals(obj)) {
                    return new C31543lvx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_recurring_buy_plan_detail is invalid. Received: " + obj);
            case 44:
                if ("layout/fragment_recurring_buy_plan_list_0".equals(obj)) {
                    return new C31545lvz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_recurring_buy_plan_list is invalid. Received: " + obj);
            case 45:
                if ("layout/fragment_recurring_buy_plan_order_list_0".equals(obj)) {
                    return new C31495lvB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_recurring_buy_plan_order_list is invalid. Received: " + obj);
            case 46:
                if ("layout/item_bsc_level1_header_0".equals(obj)) {
                    return new C31500lvG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bsc_level1_header is invalid. Received: " + obj);
            case 47:
                if ("layout/item_bsc_payment_bottom_sheet_ach_relink_0".equals(obj)) {
                    return new C31498lvE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bsc_payment_bottom_sheet_ach_relink is invalid. Received: " + obj);
            case 48:
                if ("layout/item_bsc_payment_bottom_sheet_add_payment_method_0".equals(obj)) {
                    return new C31499lvF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bsc_payment_bottom_sheet_add_payment_method is invalid. Received: " + obj);
            case 49:
                if ("layout/item_bsc_payment_bottom_sheet_card_verification_0".equals(obj)) {
                    return new C31505lvL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bsc_payment_bottom_sheet_card_verification is invalid. Received: " + obj);
            case 50:
                if ("layout/item_bsc_payment_bottom_sheet_cash_method_0".equals(obj)) {
                    return new C31504lvK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bsc_payment_bottom_sheet_cash_method is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding OLrzqt(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/item_bsc_payment_bottom_sheet_crypto_method_0".equals(obj)) {
                    return new C31511lvR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bsc_payment_bottom_sheet_crypto_method is invalid. Received: " + obj);
            case 52:
                if ("layout/item_bsc_payment_bottom_sheet_limit_list_item_0".equals(obj)) {
                    return new C31509lvP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bsc_payment_bottom_sheet_limit_list_item is invalid. Received: " + obj);
            case 53:
                if ("layout/item_bsc_payment_bottom_sheet_payment_method_0".equals(obj)) {
                    return new C31510lvQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bsc_payment_bottom_sheet_payment_method is invalid. Received: " + obj);
            case 54:
                if ("layout/item_bsc_payment_bottom_sheet_section_header_0".equals(obj)) {
                    return new C31516lvW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bsc_payment_bottom_sheet_section_header is invalid. Received: " + obj);
            case 55:
                if ("layout/item_bsc_payment_bottom_sheet_stablecoin_method_0".equals(obj)) {
                    return new C31512lvS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bsc_payment_bottom_sheet_stablecoin_method is invalid. Received: " + obj);
            case 56:
                if ("layout/item_bsc_payment_selector_widget_0".equals(obj)) {
                    return new C31573lwb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_bsc_payment_selector_widget is invalid. Received: " + obj);
            case 57:
                if ("layout/item_buy_sell_bsc_input_widget_v3_0".equals(obj)) {
                    return new C31519lvZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_buy_sell_bsc_input_widget_v3 is invalid. Received: " + obj);
            case 58:
                if ("layout/item_buy_sell_change_payment_account_0".equals(obj)) {
                    return new C31575lwd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_buy_sell_change_payment_account is invalid. Received: " + obj);
            case 59:
                if ("layout/item_buy_sell_dex_token_0".equals(obj)) {
                    return new C31578lwg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_buy_sell_dex_token is invalid. Received: " + obj);
            case 60:
                if ("layout/item_buy_sell_select_payment_channel_0".equals(obj)) {
                    return new C31574lwc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_buy_sell_select_payment_channel is invalid. Received: " + obj);
            case 61:
                if ("layout/item_buy_sell_select_payment_method_large_style_0".equals(obj)) {
                    return new C31581lwj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_buy_sell_select_payment_method_large_style is invalid. Received: " + obj);
            case 62:
                if ("layout/item_fiat_crypto_detail_order_empty_0".equals(obj)) {
                    return new C31583lwl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_fiat_crypto_detail_order_empty is invalid. Received: " + obj);
            case 63:
                if ("layout/item_fiat_crypto_third_party_order_0".equals(obj)) {
                    return new C31586lwo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_fiat_crypto_third_party_order is invalid. Received: " + obj);
            case 64:
                if ("layout/item_recurring_buy_frequency_option_0".equals(obj)) {
                    return new C31585lwn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_recurring_buy_frequency_option is invalid. Received: " + obj);
            case 65:
                if ("layout/item_recurring_buy_plan_detail_pnl_block_0".equals(obj)) {
                    return new C31588lwq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_recurring_buy_plan_detail_pnl_block is invalid. Received: " + obj);
            case 66:
                if ("layout/item_recurring_buy_plan_list_0".equals(obj)) {
                    return new C31589lwr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_recurring_buy_plan_list is invalid. Received: " + obj);
            case 67:
                if ("layout/item_recurring_frequency_bottom_sheet_0".equals(obj)) {
                    return new C31592lwu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_recurring_frequency_bottom_sheet is invalid. Received: " + obj);
            case 68:
                if ("layout/large_order_continue_to_chat_bottom_sheet_0".equals(obj)) {
                    return new C31547lwA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for large_order_continue_to_chat_bottom_sheet is invalid. Received: " + obj);
            case 69:
                if ("layout/layout_buy_sell_footer_0".equals(obj)) {
                    return new C31551lwE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_buy_sell_footer is invalid. Received: " + obj);
            case 70:
                if ("layout/layout_legacy_bsc_header_0".equals(obj)) {
                    return new C31556lwJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_legacy_bsc_header is invalid. Received: " + obj);
            case 71:
                if ("layout/layout_otc_agent_deposit_card_0".equals(obj)) {
                    return new C31557lwK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_otc_agent_deposit_card is invalid. Received: " + obj);
            case 72:
                if ("layout/layout_otc_agent_trade_card_0".equals(obj)) {
                    return new C31559lwM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_otc_agent_trade_card is invalid. Received: " + obj);
            case 73:
                if ("layout/layout_recurring_buy_plan_tag_0".equals(obj)) {
                    return new C31561lwO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_recurring_buy_plan_tag is invalid. Received: " + obj);
            case 74:
                if ("layout/layout_recurring_edit_amount_label_0".equals(obj)) {
                    return new C31564lwR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_recurring_edit_amount_label is invalid. Received: " + obj);
            case 75:
                if ("layout/lite_limit_detail_coin_item_0".equals(obj)) {
                    return new C31566lwT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for lite_limit_detail_coin_item is invalid. Received: " + obj);
            case 76:
                if ("layout/lite_limit_detail_transaction_item_0".equals(obj)) {
                    return new C31571lwY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for lite_limit_detail_transaction_item is invalid. Received: " + obj);
            case 77:
                if ("layout/okx_lite_convert_transaction_detail_0".equals(obj)) {
                    return new lwZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for okx_lite_convert_transaction_detail is invalid. Received: " + obj);
            case 78:
                if ("layout/template_buy_sell_history_0".equals(obj)) {
                    return new C31600lxb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for template_buy_sell_history is invalid. Received: " + obj);
            case 79:
                if ("layout/template_footer_text_0".equals(obj)) {
                    return new C31599lxa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for template_footer_text is invalid. Received: " + obj);
            case 80:
                if ("layout/view_bsc_payment_method_amount_view_0".equals(obj)) {
                    return new C31602lxd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_bsc_payment_method_amount_view is invalid. Received: " + obj);
            case 81:
                if ("layout/view_buy_sell_convert_info_0".equals(obj)) {
                    return new C31605lxg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_buy_sell_convert_info is invalid. Received: " + obj);
            case 82:
                if ("layout/view_buy_sell_convert_step_0".equals(obj)) {
                    return new C31604lxf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_buy_sell_convert_step is invalid. Received: " + obj);
            case 83:
                if ("layout/view_buy_sell_order_detail_body_0".equals(obj)) {
                    return new C31609lxk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_buy_sell_order_detail_body is invalid. Received: " + obj);
            case 84:
                if ("layout/view_buy_sell_order_detail_body_two_step_info_0".equals(obj)) {
                    return new C31612lxn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_buy_sell_order_detail_body_two_step_info is invalid. Received: " + obj);
            case 85:
                if ("layout/view_buy_sell_order_detail_footer_0".equals(obj)) {
                    return new C31611lxm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_buy_sell_order_detail_footer is invalid. Received: " + obj);
            case 86:
                if ("layout/view_buy_sell_order_detail_header_0".equals(obj)) {
                    return new C31616lxr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_buy_sell_order_detail_header is invalid. Received: " + obj);
            case 87:
                if ("layout/view_convert_promotion_item_0".equals(obj)) {
                    return new C31614lxp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_convert_promotion_item is invalid. Received: " + obj);
            case 88:
                if ("layout/view_filter_order_status_card_0".equals(obj)) {
                    return new C31622lxx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_filter_order_status_card is invalid. Received: " + obj);
            case 89:
                if ("layout/view_filter_order_status_third_party_0".equals(obj)) {
                    return new C31621lxw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_filter_order_status_third_party is invalid. Received: " + obj);
            case 90:
                if ("layout/view_filter_order_time_0".equals(obj)) {
                    return new C31620lxv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_filter_order_time is invalid. Received: " + obj);
            case 91:
                if ("layout/view_filter_order_type_0".equals(obj)) {
                    return new C31624lxz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_filter_order_type is invalid. Received: " + obj);
            case 92:
                if ("layout/view_legacy_crypto_list_item_buy_0".equals(obj)) {
                    return new lxB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_legacy_crypto_list_item_buy is invalid. Received: " + obj);
            case 93:
                if ("layout/view_legacy_crypto_list_item_header_0".equals(obj)) {
                    return new lxE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_legacy_crypto_list_item_header is invalid. Received: " + obj);
            case 94:
                if ("layout/view_legacy_crypto_list_item_sell_0".equals(obj)) {
                    return new lxH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_legacy_crypto_list_item_sell is invalid. Received: " + obj);
            case 95:
                if ("layout/view_rust_buy_sell_order_detail_body_0".equals(obj)) {
                    return new lxG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_rust_buy_sell_order_detail_body is invalid. Received: " + obj);
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                if ("layout/view_rust_buy_sell_order_detail_body_two_step_info_0".equals(obj)) {
                    return new lxJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_rust_buy_sell_order_detail_body_two_step_info is invalid. Received: " + obj);
            case 97:
                if ("layout/view_rust_buy_sell_order_detail_footer_0".equals(obj)) {
                    return new lxL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_rust_buy_sell_order_detail_footer is invalid. Received: " + obj);
            case 98:
                if ("layout/view_rust_buy_sell_order_detail_header_0".equals(obj)) {
                    return new lxQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_rust_buy_sell_order_detail_header is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = AEQbTJ.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i3 = (i2 - 1) / 50;
        if (i3 == 0) {
            return EZpvd(dataBindingComponent, view, i2, tag);
        }
        if (i3 != 1) {
            return null;
        }
        return OLrzqt(dataBindingComponent, view, i2, tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || AEQbTJ.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = ActionBar.EZpvd.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return Activity.AEQbTJ.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(13);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.cruilib.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okim.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.oksearch.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class Activity {
        public static final SparseArray<String> AEQbTJ;

        private Activity() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(17);
            AEQbTJ = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "expirationTimer");
            sparseArray.put(4, "imageTypes");
            sparseArray.put(5, "item");
            sparseArray.put(6, "itemData");
            sparseArray.put(7, "label");
            sparseArray.put(8, "leftButton");
            sparseArray.put(9, "message");
            sparseArray.put(10, "model");
            sparseArray.put(11, "rightButton");
            sparseArray.put(12, "showCloseButton");
            sparseArray.put(13, "singelButton");
            sparseArray.put(14, "title");
            sparseArray.put(15, "vModel");
            sparseArray.put(16, "viewModel");
        }
    }

    public static class ActionBar {
        public static final HashMap<String, Integer> EZpvd;

        private ActionBar() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(98);
            EZpvd = map;
            map.put("layout/activity_bsc_convert_result_0", Integer.valueOf(C31351lsQ.ActionBar.OLrzqt));
            map.put("layout/activity_bsc_deeplink_host_0", Integer.valueOf(C31351lsQ.ActionBar.copydefault));
            map.put("layout/activity_bsc_dex_enable_dex_trading_0", Integer.valueOf(C31351lsQ.ActionBar.EZpvd));
            map.put("layout/activity_bsc_host_level2_0", Integer.valueOf(C31351lsQ.ActionBar.AEQbTJ));
            map.put("layout/activity_buy_sell_order_detail_0", Integer.valueOf(C31351lsQ.ActionBar.KWHzl));
            map.put("layout/activity_buy_sell_payment_method_list_0", Integer.valueOf(C31351lsQ.ActionBar.gEmmrt));
            map.put("layout/activity_buy_sell_result_0", Integer.valueOf(C31351lsQ.ActionBar.valueOf));
            map.put("layout/activity_dex_brief_0", Integer.valueOf(C31351lsQ.ActionBar.djBIcL));
            map.put("layout/activity_lite_limit_order_details_0", Integer.valueOf(C31351lsQ.ActionBar.AhwBna));
            map.put("layout/activity_recurring_buy_plan_host_0", Integer.valueOf(C31351lsQ.ActionBar.isConnected));
            map.put("layout/bottom_sheet_available_balance_0", Integer.valueOf(C31351lsQ.ActionBar.DbNXlk));
            map.put("layout/bottom_sheet_bsc_payment_limits_0", Integer.valueOf(C31351lsQ.ActionBar.values));
            map.put("layout/bottom_sheet_bsc_select_payment_method_0", Integer.valueOf(C31351lsQ.ActionBar.AkhnZx));
            map.put("layout/bottom_sheet_insufficient_dialog_0", Integer.valueOf(C31351lsQ.ActionBar.fJNWhG));
            map.put("layout/bottom_sheet_legacy_pro_qp_convert_channel_page_0", Integer.valueOf(C31351lsQ.ActionBar.AuCTel));
            map.put("layout/bottom_sheet_recurring_buy_edit_amount_0", Integer.valueOf(C31351lsQ.ActionBar.ejfBZ));
            map.put("layout/bottom_sheet_recurring_frequency_option_0", Integer.valueOf(C31351lsQ.ActionBar.getFieldNames));
            map.put("layout/bottomsheet_bsc_add_paypal_preload_0", Integer.valueOf(C31351lsQ.ActionBar.uzCIH));
            map.put("layout/bottomsheet_bsc_recurring_buy_0", Integer.valueOf(C31351lsQ.ActionBar.hDKMBd));
            map.put("layout/bottomsheet_bsc_transfer_notice_0", Integer.valueOf(C31351lsQ.ActionBar.getNewProxyInstance));
            map.put("layout/bottomsheet_buy_sell_account_management_0", Integer.valueOf(C31351lsQ.ActionBar.AubY));
            map.put("layout/bottomsheet_buy_sell_order_detail_security_hold_0", Integer.valueOf(C31351lsQ.ActionBar.AuCTelauCTel));
            map.put("layout/bottomsheet_crypto_list_container_0", Integer.valueOf(C31351lsQ.ActionBar.zLjUOn));
            map.put("layout/bottomsheet_google_pay_add_card_0", Integer.valueOf(C31351lsQ.ActionBar.wlaJM));
            map.put("layout/bottomsheet_quick_convert_0", Integer.valueOf(C31351lsQ.ActionBar.zsXlph));
            map.put("layout/fg_fiat_crypto_order_pager_0", Integer.valueOf(C31351lsQ.ActionBar.AxsJAY));
            map.put("layout/fg_fiat_crypto_unified_order_pager_0", Integer.valueOf(C31351lsQ.ActionBar.gHZMYf));
            map.put("layout/fg_order_list_filter_bottomsheet_0", Integer.valueOf(C31351lsQ.ActionBar.sSMYrx));
            map.put("layout/fragment_bsc_buy_input_0", Integer.valueOf(C31351lsQ.ActionBar.zuBGHE));
            map.put("layout/fragment_bsc_convert_input_0", Integer.valueOf(C31351lsQ.ActionBar.AwvSrB));
            map.put("layout/fragment_bsc_crypto_list_legacy_0", Integer.valueOf(C31351lsQ.ActionBar.OcIXYQ));
            map.put("layout/fragment_bsc_master_input_0", Integer.valueOf(C31351lsQ.ActionBar.QKVWgx));
            map.put("layout/fragment_bsc_pro_container_0", Integer.valueOf(C31351lsQ.ActionBar.DTwDnp));
            map.put("layout/fragment_bsc_select_payment_method_v3_0", Integer.valueOf(C31351lsQ.ActionBar.QOLQEE));
            map.put("layout/fragment_bsc_sell_input_0", Integer.valueOf(C31351lsQ.ActionBar.ORxRYg));
            map.put("layout/fragment_buy_sell_order_detail_0", Integer.valueOf(C31351lsQ.ActionBar.RJOkX));
            map.put("layout/fragment_buy_sell_order_detail_v2_0", Integer.valueOf(C31351lsQ.ActionBar.QVAiDq));
            map.put("layout/fragment_buy_sell_payment_method_0", Integer.valueOf(C31351lsQ.ActionBar.QbewEr));
            map.put("layout/fragment_buy_sell_select_payment_method_0", Integer.valueOf(C31351lsQ.ActionBar.QUSxYX));
            map.put("layout/fragment_crypto_list_0", Integer.valueOf(C31351lsQ.ActionBar.QfsBiF));
            map.put("layout/fragment_dex_brief_0", Integer.valueOf(C31351lsQ.ActionBar.dNCPSb));
            map.put("layout/fragment_quick_convert_0", Integer.valueOf(C31351lsQ.ActionBar.djSkpj));
            map.put("layout/fragment_recurring_buy_plan_detail_0", Integer.valueOf(C31351lsQ.ActionBar.aKErDB));
            map.put("layout/fragment_recurring_buy_plan_list_0", Integer.valueOf(C31351lsQ.ActionBar.RcXXUw));
            map.put("layout/fragment_recurring_buy_plan_order_list_0", Integer.valueOf(C31351lsQ.ActionBar.UeEOUB));
            map.put("layout/item_bsc_level1_header_0", Integer.valueOf(C31351lsQ.ActionBar.finit));
            map.put("layout/item_bsc_payment_bottom_sheet_ach_relink_0", Integer.valueOf(C31351lsQ.ActionBar.fFgQHt));
            map.put("layout/item_bsc_payment_bottom_sheet_add_payment_method_0", Integer.valueOf(C31351lsQ.ActionBar.dvKsVJ));
            map.put("layout/item_bsc_payment_bottom_sheet_card_verification_0", Integer.valueOf(C31351lsQ.ActionBar.fZBcTu));
            map.put("layout/item_bsc_payment_bottom_sheet_cash_method_0", Integer.valueOf(C31351lsQ.ActionBar.gGvvIC));
            map.put("layout/item_bsc_payment_bottom_sheet_crypto_method_0", Integer.valueOf(C31351lsQ.ActionBar.flVtFt));
            map.put("layout/item_bsc_payment_bottom_sheet_limit_list_item_0", Integer.valueOf(C31351lsQ.ActionBar.giSNqX));
            map.put("layout/item_bsc_payment_bottom_sheet_payment_method_0", Integer.valueOf(C31351lsQ.ActionBar.fvQaOB));
            map.put("layout/item_bsc_payment_bottom_sheet_section_header_0", Integer.valueOf(C31351lsQ.ActionBar.gasjUx));
            map.put("layout/item_bsc_payment_bottom_sheet_stablecoin_method_0", Integer.valueOf(C31351lsQ.ActionBar.gkJEwt));
            map.put("layout/item_bsc_payment_selector_widget_0", Integer.valueOf(C31351lsQ.ActionBar.AxsJAYaxsJAY));
            map.put("layout/item_buy_sell_bsc_input_widget_v3_0", Integer.valueOf(C31351lsQ.ActionBar.iZzfmt));
            map.put("layout/item_buy_sell_change_payment_account_0", Integer.valueOf(C31351lsQ.ActionBar.iRxXKY));
            map.put("layout/item_buy_sell_dex_token_0", Integer.valueOf(C31351lsQ.ActionBar.hUfVAv));
            map.put("layout/item_buy_sell_select_payment_channel_0", Integer.valueOf(C31351lsQ.ActionBar.DAIeex));
            map.put("layout/item_buy_sell_select_payment_method_large_style_0", Integer.valueOf(C31351lsQ.ActionBar.RlQdEF));
            map.put("layout/item_fiat_crypto_detail_order_empty_0", Integer.valueOf(C31351lsQ.ActionBar.QKudOq));
            map.put("layout/item_fiat_crypto_third_party_order_0", Integer.valueOf(C31351lsQ.ActionBar.AxsJAYsNCnLh));
            map.put("layout/item_recurring_buy_frequency_option_0", Integer.valueOf(C31351lsQ.ActionBar.accept));
            map.put("layout/item_recurring_buy_plan_detail_pnl_block_0", Integer.valueOf(C31351lsQ.ActionBar.ODWQjV));
            map.put("layout/item_recurring_buy_plan_list_0", Integer.valueOf(C31351lsQ.ActionBar.DXXBbs));
            map.put("layout/item_recurring_frequency_bottom_sheet_0", Integer.valueOf(C31351lsQ.ActionBar.DarRvM));
            map.put("layout/large_order_continue_to_chat_bottom_sheet_0", Integer.valueOf(C31351lsQ.ActionBar.DCJXGO));
            map.put("layout/layout_buy_sell_footer_0", Integer.valueOf(C31351lsQ.ActionBar.OqFWZa));
            map.put("layout/layout_legacy_bsc_header_0", Integer.valueOf(C31351lsQ.ActionBar.ffGIBT));
            map.put("layout/layout_otc_agent_deposit_card_0", Integer.valueOf(C31351lsQ.ActionBar.DCUTEI));
            map.put("layout/layout_otc_agent_trade_card_0", Integer.valueOf(C31351lsQ.ActionBar.zuWLRA));
            map.put("layout/layout_recurring_buy_plan_tag_0", Integer.valueOf(C31351lsQ.ActionBar.OuxcSI));
            map.put("layout/layout_recurring_edit_amount_label_0", Integer.valueOf(C31351lsQ.ActionBar.RKDWNf));
            map.put("layout/lite_limit_detail_coin_item_0", Integer.valueOf(C31351lsQ.ActionBar.QHmsKR));
            map.put("layout/lite_limit_detail_transaction_item_0", Integer.valueOf(C31351lsQ.ActionBar.QSBOWP));
            map.put("layout/okx_lite_convert_transaction_detail_0", Integer.valueOf(C31351lsQ.ActionBar.OBJEWx));
            map.put("layout/template_buy_sell_history_0", Integer.valueOf(C31351lsQ.ActionBar.dHguZz));
            map.put("layout/template_footer_text_0", Integer.valueOf(C31351lsQ.ActionBar.RdAHlO));
            map.put("layout/view_bsc_payment_method_amount_view_0", Integer.valueOf(C31351lsQ.ActionBar.hBpjJd));
            map.put("layout/view_buy_sell_convert_info_0", Integer.valueOf(C31351lsQ.ActionBar.gwTjWJ));
            map.put("layout/view_buy_sell_convert_step_0", Integer.valueOf(C31351lsQ.ActionBar.hrNTAI));
            map.put("layout/view_buy_sell_order_detail_body_0", Integer.valueOf(C31351lsQ.ActionBar.DLWbHP));
            map.put("layout/view_buy_sell_order_detail_body_two_step_info_0", Integer.valueOf(C31351lsQ.ActionBar.ODXsMY));
            map.put("layout/view_buy_sell_order_detail_footer_0", Integer.valueOf(C31351lsQ.ActionBar.OHqIaq));
            map.put("layout/view_buy_sell_order_detail_header_0", Integer.valueOf(C31351lsQ.ActionBar.OFhtUX));
            map.put("layout/view_convert_promotion_item_0", Integer.valueOf(C31351lsQ.ActionBar.OJuSTm));
            map.put("layout/view_filter_order_status_card_0", Integer.valueOf(C31351lsQ.ActionBar.OxVOHk));
            map.put("layout/view_filter_order_status_third_party_0", Integer.valueOf(C31351lsQ.ActionBar.QVsKAR));
            map.put("layout/view_filter_order_time_0", Integer.valueOf(C31351lsQ.ActionBar.QSLkRj));
            map.put("layout/view_filter_order_type_0", Integer.valueOf(C31351lsQ.ActionBar.aUsmxb));
            map.put("layout/view_legacy_crypto_list_item_buy_0", Integer.valueOf(C31351lsQ.ActionBar.dUDNAs));
            map.put("layout/view_legacy_crypto_list_item_header_0", Integer.valueOf(C31351lsQ.ActionBar.QwvEab));
            map.put("layout/view_legacy_crypto_list_item_sell_0", Integer.valueOf(C31351lsQ.ActionBar.UlJrfe));
            map.put("layout/view_rust_buy_sell_order_detail_body_0", Integer.valueOf(C31351lsQ.ActionBar.USBtdM));
            map.put("layout/view_rust_buy_sell_order_detail_body_two_step_info_0", Integer.valueOf(C31351lsQ.ActionBar.htlTjW));
            map.put("layout/view_rust_buy_sell_order_detail_footer_0", Integer.valueOf(C31351lsQ.ActionBar.fdOvFl));
            map.put("layout/view_rust_buy_sell_order_detail_header_0", Integer.valueOf(C31351lsQ.ActionBar.igXuih));
        }
    }
}
