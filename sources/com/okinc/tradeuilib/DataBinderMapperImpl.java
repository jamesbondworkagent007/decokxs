package com.okinc.tradeuilib;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C49511upt;
import o.C49519uqA;
import o.C49521uqC;
import o.C49523uqE;
import o.C49525uqG;
import o.C49528uqJ;
import o.C49529uqK;
import o.C49532uqN;
import o.C49535uqQ;
import o.C49537uqS;
import o.C49538uqT;
import o.C49543uqY;
import o.C49544uqZ;
import o.C49564uqt;
import o.C49566uqv;
import o.C49568uqx;
import o.C49573urB;
import o.C49599urb;
import o.C49603urf;
import o.C49604urg;
import o.C49606uri;
import o.C49609url;
import o.C49610urm;
import o.C49613urp;
import o.C49615urr;
import o.C49618uru;
import o.C49620urw;

/* JADX INFO: loaded from: classes11.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(26);
        copydefault = sparseIntArray;
        sparseIntArray.put(C49511upt.StateListAnimator.copydefault, 1);
        sparseIntArray.put(C49511upt.StateListAnimator.EZpvd, 2);
        sparseIntArray.put(C49511upt.StateListAnimator.KWHzl, 3);
        sparseIntArray.put(C49511upt.StateListAnimator.OLrzqt, 4);
        sparseIntArray.put(C49511upt.StateListAnimator.AEQbTJ, 5);
        sparseIntArray.put(C49511upt.StateListAnimator.djBIcL, 6);
        sparseIntArray.put(C49511upt.StateListAnimator.valueOf, 7);
        sparseIntArray.put(C49511upt.StateListAnimator.AYXKKw, 8);
        sparseIntArray.put(C49511upt.StateListAnimator.isConnected, 9);
        sparseIntArray.put(C49511upt.StateListAnimator.AkhnZx, 10);
        sparseIntArray.put(C49511upt.StateListAnimator.DbNXlk, 11);
        sparseIntArray.put(C49511upt.StateListAnimator.values, 12);
        sparseIntArray.put(C49511upt.StateListAnimator.fetchVPNInfo, 13);
        sparseIntArray.put(C49511upt.StateListAnimator.AuCTel, 14);
        sparseIntArray.put(C49511upt.StateListAnimator.getNewProxyInstance, 15);
        sparseIntArray.put(C49511upt.StateListAnimator.zsXlph, 16);
        sparseIntArray.put(C49511upt.StateListAnimator.zLjUOn, 17);
        sparseIntArray.put(C49511upt.StateListAnimator.AwvSrB, 18);
        sparseIntArray.put(C49511upt.StateListAnimator.sSMYrx, 19);
        sparseIntArray.put(C49511upt.StateListAnimator.AxsJAY, 20);
        sparseIntArray.put(C49511upt.StateListAnimator.DTwDnp, 21);
        sparseIntArray.put(C49511upt.StateListAnimator.OcIXYQ, 22);
        sparseIntArray.put(C49511upt.StateListAnimator.ORxRYg, 23);
        sparseIntArray.put(C49511upt.StateListAnimator.QfsBiF, 24);
        sparseIntArray.put(C49511upt.StateListAnimator.QUSxYX, 25);
        sparseIntArray.put(C49511upt.StateListAnimator.QVAiDq, 26);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = copydefault.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i2) {
            case 1:
                if ("layout/available_setting_layout_0".equals(tag)) {
                    return new C49564uqt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for available_setting_layout is invalid. Received: " + tag);
            case 2:
                if ("layout/dfragment_adjust_leverage_0".equals(tag)) {
                    return new C49568uqx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_adjust_leverage is invalid. Received: " + tag);
            case 3:
                if ("layout/dfragment_adjust_leverage_contract_exp_0".equals(tag)) {
                    return new C49566uqv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_adjust_leverage_contract_exp is invalid. Received: " + tag);
            case 4:
                if ("layout/dfragment_trade_bottom_sheet_header_0".equals(tag)) {
                    return new C49521uqC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_trade_bottom_sheet_header is invalid. Received: " + tag);
            case 5:
                if ("layout/dialog_simple_borrow_agreement_0".equals(tag)) {
                    return new C49523uqE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_simple_borrow_agreement is invalid. Received: " + tag);
            case 6:
                if ("layout/dialog_trade_with_select_crypto_0".equals(tag)) {
                    return new C49519uqA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_trade_with_select_crypto is invalid. Received: " + tag);
            case 7:
                if ("layout/fragment_half_kline_setting_0".equals(tag)) {
                    return new C49528uqJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_half_kline_setting is invalid. Received: " + tag);
            case 8:
                if ("layout/item_adjust_leverage_0".equals(tag)) {
                    return new C49525uqG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_adjust_leverage is invalid. Received: " + tag);
            case 9:
                if ("layout/layout_ok_menu_chip_view_0".equals(tag)) {
                    return new C49529uqK(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_ok_menu_chip_view is invalid. Received: " + tag);
            case 10:
                if ("layout/layout_open_auto_loan_sheet_0".equals(tag)) {
                    return new C49532uqN(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for layout_open_auto_loan_sheet is invalid. Received: " + tag);
            case 11:
                if ("layout/layout_panel_limit_coins_0".equals(tag)) {
                    return new C49537uqS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_panel_limit_coins is invalid. Received: " + tag);
            case 12:
                if ("layout/lr_view_bottom_select_0".equals(tag)) {
                    return new C49535uqQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for lr_view_bottom_select is invalid. Received: " + tag);
            case 13:
                if ("layout/okt_dex_header_view_refactored_0".equals(tag)) {
                    return new C49538uqT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for okt_dex_header_view_refactored is invalid. Received: " + tag);
            case 14:
                if ("layout/sheet_contract_double_adjust_leverage_0".equals(tag)) {
                    return new C49543uqY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for sheet_contract_double_adjust_leverage is invalid. Received: " + tag);
            case 15:
                if ("layout/trade_impl_switch_margin_mode_layout_0".equals(tag)) {
                    return new C49599urb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_impl_switch_margin_mode_layout is invalid. Received: " + tag);
            case 16:
                if ("layout/trade_item_trade_switch_biz_setting_0".equals(tag)) {
                    return new C49544uqZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_item_trade_switch_biz_setting is invalid. Received: " + tag);
            case 17:
                if ("layout/view_contract_lever_single_item_0".equals(tag)) {
                    return new C49604urg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_contract_lever_single_item is invalid. Received: " + tag);
            case 18:
                if ("layout/view_input_layout_add_minus_0".equals(tag)) {
                    return new C49603urf(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_input_layout_add_minus is invalid. Received: " + tag);
            case 19:
                if ("layout/view_margin_model_and_leverage_v2_0".equals(tag)) {
                    return new C49606uri(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_margin_model_and_leverage_v2 is invalid. Received: " + tag);
            case 20:
                if ("layout/view_market_close_confirm_0".equals(tag)) {
                    return new C49609url(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_market_close_confirm is invalid. Received: " + tag);
            case 21:
                if ("layout/view_simple_borrow_switch_view_0".equals(tag)) {
                    return new C49610urm(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_simple_borrow_switch_view is invalid. Received: " + tag);
            case 22:
                if ("layout/view_spot_loan_switch_0".equals(tag)) {
                    return new C49615urr(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_spot_loan_switch is invalid. Received: " + tag);
            case 23:
                if ("layout/view_spot_margin_switch_view_0".equals(tag)) {
                    return new C49613urp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_spot_margin_switch_view is invalid. Received: " + tag);
            case 24:
                if ("layout/view_trade_input_basic_0".equals(tag)) {
                    return new C49618uru(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_trade_input_basic is invalid. Received: " + tag);
            case 25:
                if ("layout/view_trade_with_select_coin_item_0".equals(tag)) {
                    return new C49620urw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_trade_with_select_coin_item is invalid. Received: " + tag);
            case 26:
                if ("layout/view_trade_with_switch_view_0".equals(tag)) {
                    return new C49573urB(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for view_trade_with_switch_view is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr == null || viewArr.length == 0 || (i2 = copydefault.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 9) {
            if ("layout/layout_ok_menu_chip_view_0".equals(tag)) {
                return new C49529uqK(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for layout_ok_menu_chip_view is invalid. Received: " + tag);
        }
        if (i2 == 10) {
            if ("layout/layout_open_auto_loan_sheet_0".equals(tag)) {
                return new C49532uqN(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for layout_open_auto_loan_sheet is invalid. Received: " + tag);
        }
        if (i2 == 18) {
            if ("layout/view_input_layout_add_minus_0".equals(tag)) {
                return new C49603urf(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for view_input_layout_add_minus is invalid. Received: " + tag);
        }
        if (i2 == 19) {
            if ("layout/view_margin_model_and_leverage_v2_0".equals(tag)) {
                return new C49606uri(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for view_margin_model_and_leverage_v2 is invalid. Received: " + tag);
        }
        if (i2 == 21) {
            if ("layout/view_simple_borrow_switch_view_0".equals(tag)) {
                return new C49610urm(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for view_simple_borrow_switch_view is invalid. Received: " + tag);
        }
        if (i2 == 24) {
            if ("layout/view_trade_input_basic_0".equals(tag)) {
                return new C49618uru(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for view_trade_input_basic is invalid. Received: " + tag);
        }
        if (i2 != 26) {
            return null;
        }
        if ("layout/view_trade_with_switch_view_0".equals(tag)) {
            return new C49573urB(dataBindingComponent, viewArr);
        }
        throw new IllegalArgumentException("The tag for view_trade_with_switch_view is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = Application.KWHzl.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return ActionBar.copydefault.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3Uilib.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class ActionBar {
        public static final SparseArray<String> copydefault;

        private ActionBar() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(11);
            copydefault = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "itemData");
            sparseArray.put(4, "leftButton");
            sparseArray.put(5, "model");
            sparseArray.put(6, "rightButton");
            sparseArray.put(7, "showCloseButton");
            sparseArray.put(8, "singelButton");
            sparseArray.put(9, "title");
            sparseArray.put(10, "viewModel");
        }
    }

    public static class Application {
        public static final HashMap<String, Integer> KWHzl;

        private Application() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(26);
            KWHzl = map;
            map.put("layout/available_setting_layout_0", Integer.valueOf(C49511upt.StateListAnimator.copydefault));
            map.put("layout/dfragment_adjust_leverage_0", Integer.valueOf(C49511upt.StateListAnimator.EZpvd));
            map.put("layout/dfragment_adjust_leverage_contract_exp_0", Integer.valueOf(C49511upt.StateListAnimator.KWHzl));
            map.put("layout/dfragment_trade_bottom_sheet_header_0", Integer.valueOf(C49511upt.StateListAnimator.OLrzqt));
            map.put("layout/dialog_simple_borrow_agreement_0", Integer.valueOf(C49511upt.StateListAnimator.AEQbTJ));
            map.put("layout/dialog_trade_with_select_crypto_0", Integer.valueOf(C49511upt.StateListAnimator.djBIcL));
            map.put("layout/fragment_half_kline_setting_0", Integer.valueOf(C49511upt.StateListAnimator.valueOf));
            map.put("layout/item_adjust_leverage_0", Integer.valueOf(C49511upt.StateListAnimator.AYXKKw));
            map.put("layout/layout_ok_menu_chip_view_0", Integer.valueOf(C49511upt.StateListAnimator.isConnected));
            map.put("layout/layout_open_auto_loan_sheet_0", Integer.valueOf(C49511upt.StateListAnimator.AkhnZx));
            map.put("layout/layout_panel_limit_coins_0", Integer.valueOf(C49511upt.StateListAnimator.DbNXlk));
            map.put("layout/lr_view_bottom_select_0", Integer.valueOf(C49511upt.StateListAnimator.values));
            map.put("layout/okt_dex_header_view_refactored_0", Integer.valueOf(C49511upt.StateListAnimator.fetchVPNInfo));
            map.put("layout/sheet_contract_double_adjust_leverage_0", Integer.valueOf(C49511upt.StateListAnimator.AuCTel));
            map.put("layout/trade_impl_switch_margin_mode_layout_0", Integer.valueOf(C49511upt.StateListAnimator.getNewProxyInstance));
            map.put("layout/trade_item_trade_switch_biz_setting_0", Integer.valueOf(C49511upt.StateListAnimator.zsXlph));
            map.put("layout/view_contract_lever_single_item_0", Integer.valueOf(C49511upt.StateListAnimator.zLjUOn));
            map.put("layout/view_input_layout_add_minus_0", Integer.valueOf(C49511upt.StateListAnimator.AwvSrB));
            map.put("layout/view_margin_model_and_leverage_v2_0", Integer.valueOf(C49511upt.StateListAnimator.sSMYrx));
            map.put("layout/view_market_close_confirm_0", Integer.valueOf(C49511upt.StateListAnimator.AxsJAY));
            map.put("layout/view_simple_borrow_switch_view_0", Integer.valueOf(C49511upt.StateListAnimator.DTwDnp));
            map.put("layout/view_spot_loan_switch_0", Integer.valueOf(C49511upt.StateListAnimator.OcIXYQ));
            map.put("layout/view_spot_margin_switch_view_0", Integer.valueOf(C49511upt.StateListAnimator.ORxRYg));
            map.put("layout/view_trade_input_basic_0", Integer.valueOf(C49511upt.StateListAnimator.QfsBiF));
            map.put("layout/view_trade_with_select_coin_item_0", Integer.valueOf(C49511upt.StateListAnimator.QUSxYX));
            map.put("layout/view_trade_with_switch_view_0", Integer.valueOf(C49511upt.StateListAnimator.QVAiDq));
        }
    }
}
