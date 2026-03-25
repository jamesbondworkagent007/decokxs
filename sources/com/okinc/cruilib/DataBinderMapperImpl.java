package com.okinc.cruilib;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C31845mGa;
import o.C31846mGb;
import o.C31848mGd;
import o.C31849mGe;
import o.C31854mGj;
import o.C31857mGm;
import o.C31859mGo;
import o.C31860mGp;
import o.C31861mGq;
import o.C31863mGs;
import o.C31867mGw;
import o.C31869mGy;
import o.C31873mHb;
import o.C31876mHe;
import o.C31877mHf;
import o.C31878mHg;
import o.C31879mHh;
import o.C31884mHm;
import o.C31887mHp;
import o.C31888mHq;
import o.C31891mHt;
import o.mDC;
import o.mFE;
import o.mFG;
import o.mFH;
import o.mFK;
import o.mFN;
import o.mFR;
import o.mFS;
import o.mFU;
import o.mFX;
import o.mFY;
import o.mGA;
import o.mGB;
import o.mGC;
import o.mGG;
import o.mGI;
import o.mGK;
import o.mGL;
import o.mGN;
import o.mGQ;
import o.mGT;
import o.mGU;
import o.mGV;
import o.mGY;
import o.mGZ;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray OLrzqt;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(45);
        OLrzqt = sparseIntArray;
        sparseIntArray.put(mDC.TaskDescription.copydefault, 1);
        sparseIntArray.put(mDC.TaskDescription.OLrzqt, 2);
        sparseIntArray.put(mDC.TaskDescription.EZpvd, 3);
        sparseIntArray.put(mDC.TaskDescription.KWHzl, 4);
        sparseIntArray.put(mDC.TaskDescription.AEQbTJ, 5);
        sparseIntArray.put(mDC.TaskDescription.AYXKKw, 6);
        sparseIntArray.put(mDC.TaskDescription.valueOf, 7);
        sparseIntArray.put(mDC.TaskDescription.gEmmrt, 8);
        sparseIntArray.put(mDC.TaskDescription.djBIcL, 9);
        sparseIntArray.put(mDC.TaskDescription.AkhnZx, 10);
        sparseIntArray.put(mDC.TaskDescription.isConnected, 11);
        sparseIntArray.put(mDC.TaskDescription.fetchVPNInfo, 12);
        sparseIntArray.put(mDC.TaskDescription.values, 13);
        sparseIntArray.put(mDC.TaskDescription.ejfBZ, 14);
        sparseIntArray.put(mDC.TaskDescription.fARcdN, 15);
        sparseIntArray.put(mDC.TaskDescription.fJNWhG, 16);
        sparseIntArray.put(mDC.TaskDescription.AuCTel, 17);
        sparseIntArray.put(mDC.TaskDescription.fIwbmz, 18);
        sparseIntArray.put(mDC.TaskDescription.hDKMBd, 19);
        sparseIntArray.put(mDC.TaskDescription.iwGUEr, 20);
        sparseIntArray.put(mDC.TaskDescription.uzCIH, 21);
        sparseIntArray.put(mDC.TaskDescription.getFieldNames, 22);
        sparseIntArray.put(mDC.TaskDescription.getNewProxyInstance, 23);
        sparseIntArray.put(mDC.TaskDescription.zLjUOn, 24);
        sparseIntArray.put(mDC.TaskDescription.AuCTelauCTel, 25);
        sparseIntArray.put(mDC.TaskDescription.zsXlph, 26);
        sparseIntArray.put(mDC.TaskDescription.wlaJM, 27);
        sparseIntArray.put(mDC.TaskDescription.AwvSrB, 28);
        sparseIntArray.put(mDC.TaskDescription.sSMYrx, 29);
        sparseIntArray.put(mDC.TaskDescription.gHZMYf, 30);
        sparseIntArray.put(mDC.TaskDescription.zuBGHE, 31);
        sparseIntArray.put(mDC.TaskDescription.AxsJAY, 32);
        sparseIntArray.put(mDC.TaskDescription.DTwDnp, 33);
        sparseIntArray.put(mDC.TaskDescription.ORxRYg, 34);
        sparseIntArray.put(mDC.TaskDescription.QKVWgx, 35);
        sparseIntArray.put(mDC.TaskDescription.OcIXYQ, 36);
        sparseIntArray.put(mDC.TaskDescription.QOLQEE, 37);
        sparseIntArray.put(mDC.TaskDescription.RJOkX, 38);
        sparseIntArray.put(mDC.TaskDescription.QUSxYX, 39);
        sparseIntArray.put(mDC.TaskDescription.QVAiDq, 40);
        sparseIntArray.put(mDC.TaskDescription.QfsBiF, 41);
        sparseIntArray.put(mDC.TaskDescription.UeEOUB, 42);
        sparseIntArray.put(mDC.TaskDescription.aKErDB, 43);
        sparseIntArray.put(mDC.TaskDescription.dNCPSb, 44);
        sparseIntArray.put(mDC.TaskDescription.djSkpj, 45);
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
        switch (i2) {
            case 1:
                if ("layout/bottomsheet_feature_intro_0".equals(tag)) {
                    return new mFE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottomsheet_feature_intro is invalid. Received: " + tag);
            case 2:
                if ("layout/bottomsheet_okcr_disclaimer_0".equals(tag)) {
                    return new mFH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for bottomsheet_okcr_disclaimer is invalid. Received: " + tag);
            case 3:
                if ("layout/category_multi_line_chart_popup_0".equals(tag)) {
                    return new mFG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for category_multi_line_chart_popup is invalid. Received: " + tag);
            case 4:
                if ("layout/component_item_trade_mode_0".equals(tag)) {
                    return new mFK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_item_trade_mode is invalid. Received: " + tag);
            case 5:
                if ("layout/component_item_trade_mode_unavailable_0".equals(tag)) {
                    return new mFN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_item_trade_mode_unavailable is invalid. Received: " + tag);
            case 6:
                if ("layout/component_okcr_bar_chart_0".equals(tag)) {
                    return new mFS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_bar_chart is invalid. Received: " + tag);
            case 7:
                if ("layout/component_okcr_card_category_0".equals(tag)) {
                    return new mFR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_card_category is invalid. Received: " + tag);
            case 8:
                if ("layout/component_okcr_card_horizontal_0".equals(tag)) {
                    return new mFU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_card_horizontal is invalid. Received: " + tag);
            case 9:
                if ("layout/component_okcr_card_vertical_0".equals(tag)) {
                    return new mFX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_card_vertical is invalid. Received: " + tag);
            case 10:
                if ("layout/component_okcr_category_section_header_0".equals(tag)) {
                    return new C31846mGb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_category_section_header is invalid. Received: " + tag);
            case 11:
                if ("layout/component_okcr_category_trend_card_0".equals(tag)) {
                    return new mFY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_category_trend_card is invalid. Received: " + tag);
            case 12:
                if ("layout/component_okcr_chart_time_frame_0".equals(tag)) {
                    return new C31845mGa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_chart_time_frame is invalid. Received: " + tag);
            case 13:
                if ("layout/component_okcr_dex_card_vertical_0".equals(tag)) {
                    return new C31848mGd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_dex_card_vertical is invalid. Received: " + tag);
            case 14:
                if ("layout/component_okcr_dex_marketing_token_image_0".equals(tag)) {
                    return new C31849mGe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_dex_marketing_token_image is invalid. Received: " + tag);
            case 15:
                if ("layout/component_okcr_dex_price_alert_item_0".equals(tag)) {
                    return new C31854mGj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_dex_price_alert_item is invalid. Received: " + tag);
            case 16:
                if ("layout/component_okcr_earn_card_horizontal_0".equals(tag)) {
                    return new C31857mGm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_earn_card_horizontal is invalid. Received: " + tag);
            case 17:
                if ("layout/component_okcr_earn_reward_card_0".equals(tag)) {
                    return new C31861mGq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_earn_reward_card is invalid. Received: " + tag);
            case 18:
                if ("layout/component_okcr_earn_reward_module_0".equals(tag)) {
                    return new C31860mGp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_earn_reward_module is invalid. Received: " + tag);
            case 19:
                if ("layout/component_okcr_feature_card_0".equals(tag)) {
                    return new C31859mGo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_feature_card is invalid. Received: " + tag);
            case 20:
                if ("layout/component_okcr_feature_card_token_image_0".equals(tag)) {
                    return new C31863mGs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_feature_card_token_image is invalid. Received: " + tag);
            case 21:
                if ("layout/component_okcr_feed_coin_chip_0".equals(tag)) {
                    return new C31867mGw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_feed_coin_chip is invalid. Received: " + tag);
            case 22:
                if ("layout/component_okcr_header_0".equals(tag)) {
                    return new mGB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_header is invalid. Received: " + tag);
            case 23:
                if ("layout/component_okcr_large_card_0".equals(tag)) {
                    return new C31869mGy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_large_card is invalid. Received: " + tag);
            case 24:
                if ("layout/component_okcr_large_menu_chip_0".equals(tag)) {
                    return new mGA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_large_menu_chip is invalid. Received: " + tag);
            case 25:
                if ("layout/component_okcr_menu_chip_0".equals(tag)) {
                    return new mGC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_menu_chip is invalid. Received: " + tag);
            case 26:
                if ("layout/component_okcr_news_large_card_0".equals(tag)) {
                    return new mGG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_news_large_card is invalid. Received: " + tag);
            case 27:
                if ("layout/component_okcr_pill_0".equals(tag)) {
                    return new mGK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_pill is invalid. Received: " + tag);
            case 28:
                if ("layout/component_okcr_pill_category_0".equals(tag)) {
                    return new mGI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_pill_category is invalid. Received: " + tag);
            case 29:
                if ("layout/component_okcr_pill_simple_0".equals(tag)) {
                    return new mGL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_pill_simple is invalid. Received: " + tag);
            case 30:
                if ("layout/component_okcr_pill_simple_search_explore_0".equals(tag)) {
                    return new mGN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_pill_simple_search_explore is invalid. Received: " + tag);
            case 31:
                if ("layout/component_okcr_post_card_0".equals(tag)) {
                    return new mGQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_post_card is invalid. Received: " + tag);
            case 32:
                if ("layout/component_okcr_price_alert_item_0".equals(tag)) {
                    return new mGT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_price_alert_item is invalid. Received: " + tag);
            case 33:
                if ("layout/component_okcr_resource_pill_0".equals(tag)) {
                    return new mGV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_resource_pill is invalid. Received: " + tag);
            case 34:
                if ("layout/component_okcr_round_0".equals(tag)) {
                    return new mGU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_round is invalid. Received: " + tag);
            case 35:
                if ("layout/component_okcr_section_header_0".equals(tag)) {
                    return new mGZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_section_header is invalid. Received: " + tag);
            case 36:
                if ("layout/component_okcr_simple_category_vertical_card_0".equals(tag)) {
                    return new mGY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_simple_category_vertical_card is invalid. Received: " + tag);
            case 37:
                if ("layout/component_okcr_swipeable_dex_token_item_0".equals(tag)) {
                    return new C31877mHf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_swipeable_dex_token_item is invalid. Received: " + tag);
            case 38:
                if ("layout/component_okcr_swipeable_token_item_0".equals(tag)) {
                    return new C31876mHe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_swipeable_token_item is invalid. Received: " + tag);
            case 39:
                if ("layout/component_okcr_token_list_item_0".equals(tag)) {
                    return new C31873mHb(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_token_list_item is invalid. Received: " + tag);
            case 40:
                if ("layout/component_okcr_trade_mode_0".equals(tag)) {
                    return new C31879mHh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_trade_mode is invalid. Received: " + tag);
            case 41:
                if ("layout/component_okcr_trade_pop_bottom_container_0".equals(tag)) {
                    return new C31878mHg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_okcr_trade_pop_bottom_container is invalid. Received: " + tag);
            case 42:
                if ("layout/component_token_pair_list_item_0".equals(tag)) {
                    return new C31887mHp(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_token_pair_list_item is invalid. Received: " + tag);
            case 43:
                if ("layout/component_transactions_trades_detail_0".equals(tag)) {
                    return new C31884mHm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_transactions_trades_detail is invalid. Received: " + tag);
            case 44:
                if ("layout/fragment_okcr_infinite_scroll_0".equals(tag)) {
                    return new C31891mHt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_okcr_infinite_scroll is invalid. Received: " + tag);
            case 45:
                if ("layout/item_recurring_buy_plan_order_list_0".equals(tag)) {
                    return new C31888mHq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_recurring_buy_plan_order_list is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || OLrzqt.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = StateListAnimator.EZpvd.get(str)) == null) {
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
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilib.gallery.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class Activity {
        public static final SparseArray<String> AEQbTJ;

        private Activity() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(12);
            AEQbTJ = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "itemData");
            sparseArray.put(4, "leftButton");
            sparseArray.put(5, "message");
            sparseArray.put(6, "model");
            sparseArray.put(7, "rightButton");
            sparseArray.put(8, "showCloseButton");
            sparseArray.put(9, "singelButton");
            sparseArray.put(10, "title");
            sparseArray.put(11, "viewModel");
        }
    }

    public static class StateListAnimator {
        public static final HashMap<String, Integer> EZpvd;

        private StateListAnimator() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(45);
            EZpvd = map;
            map.put("layout/bottomsheet_feature_intro_0", Integer.valueOf(mDC.TaskDescription.copydefault));
            map.put("layout/bottomsheet_okcr_disclaimer_0", Integer.valueOf(mDC.TaskDescription.OLrzqt));
            map.put("layout/category_multi_line_chart_popup_0", Integer.valueOf(mDC.TaskDescription.EZpvd));
            map.put("layout/component_item_trade_mode_0", Integer.valueOf(mDC.TaskDescription.KWHzl));
            map.put("layout/component_item_trade_mode_unavailable_0", Integer.valueOf(mDC.TaskDescription.AEQbTJ));
            map.put("layout/component_okcr_bar_chart_0", Integer.valueOf(mDC.TaskDescription.AYXKKw));
            map.put("layout/component_okcr_card_category_0", Integer.valueOf(mDC.TaskDescription.valueOf));
            map.put("layout/component_okcr_card_horizontal_0", Integer.valueOf(mDC.TaskDescription.gEmmrt));
            map.put("layout/component_okcr_card_vertical_0", Integer.valueOf(mDC.TaskDescription.djBIcL));
            map.put("layout/component_okcr_category_section_header_0", Integer.valueOf(mDC.TaskDescription.AkhnZx));
            map.put("layout/component_okcr_category_trend_card_0", Integer.valueOf(mDC.TaskDescription.isConnected));
            map.put("layout/component_okcr_chart_time_frame_0", Integer.valueOf(mDC.TaskDescription.fetchVPNInfo));
            map.put("layout/component_okcr_dex_card_vertical_0", Integer.valueOf(mDC.TaskDescription.values));
            map.put("layout/component_okcr_dex_marketing_token_image_0", Integer.valueOf(mDC.TaskDescription.ejfBZ));
            map.put("layout/component_okcr_dex_price_alert_item_0", Integer.valueOf(mDC.TaskDescription.fARcdN));
            map.put("layout/component_okcr_earn_card_horizontal_0", Integer.valueOf(mDC.TaskDescription.fJNWhG));
            map.put("layout/component_okcr_earn_reward_card_0", Integer.valueOf(mDC.TaskDescription.AuCTel));
            map.put("layout/component_okcr_earn_reward_module_0", Integer.valueOf(mDC.TaskDescription.fIwbmz));
            map.put("layout/component_okcr_feature_card_0", Integer.valueOf(mDC.TaskDescription.hDKMBd));
            map.put("layout/component_okcr_feature_card_token_image_0", Integer.valueOf(mDC.TaskDescription.iwGUEr));
            map.put("layout/component_okcr_feed_coin_chip_0", Integer.valueOf(mDC.TaskDescription.uzCIH));
            map.put("layout/component_okcr_header_0", Integer.valueOf(mDC.TaskDescription.getFieldNames));
            map.put("layout/component_okcr_large_card_0", Integer.valueOf(mDC.TaskDescription.getNewProxyInstance));
            map.put("layout/component_okcr_large_menu_chip_0", Integer.valueOf(mDC.TaskDescription.zLjUOn));
            map.put("layout/component_okcr_menu_chip_0", Integer.valueOf(mDC.TaskDescription.AuCTelauCTel));
            map.put("layout/component_okcr_news_large_card_0", Integer.valueOf(mDC.TaskDescription.zsXlph));
            map.put("layout/component_okcr_pill_0", Integer.valueOf(mDC.TaskDescription.wlaJM));
            map.put("layout/component_okcr_pill_category_0", Integer.valueOf(mDC.TaskDescription.AwvSrB));
            map.put("layout/component_okcr_pill_simple_0", Integer.valueOf(mDC.TaskDescription.sSMYrx));
            map.put("layout/component_okcr_pill_simple_search_explore_0", Integer.valueOf(mDC.TaskDescription.gHZMYf));
            map.put("layout/component_okcr_post_card_0", Integer.valueOf(mDC.TaskDescription.zuBGHE));
            map.put("layout/component_okcr_price_alert_item_0", Integer.valueOf(mDC.TaskDescription.AxsJAY));
            map.put("layout/component_okcr_resource_pill_0", Integer.valueOf(mDC.TaskDescription.DTwDnp));
            map.put("layout/component_okcr_round_0", Integer.valueOf(mDC.TaskDescription.ORxRYg));
            map.put("layout/component_okcr_section_header_0", Integer.valueOf(mDC.TaskDescription.QKVWgx));
            map.put("layout/component_okcr_simple_category_vertical_card_0", Integer.valueOf(mDC.TaskDescription.OcIXYQ));
            map.put("layout/component_okcr_swipeable_dex_token_item_0", Integer.valueOf(mDC.TaskDescription.QOLQEE));
            map.put("layout/component_okcr_swipeable_token_item_0", Integer.valueOf(mDC.TaskDescription.RJOkX));
            map.put("layout/component_okcr_token_list_item_0", Integer.valueOf(mDC.TaskDescription.QUSxYX));
            map.put("layout/component_okcr_trade_mode_0", Integer.valueOf(mDC.TaskDescription.QVAiDq));
            map.put("layout/component_okcr_trade_pop_bottom_container_0", Integer.valueOf(mDC.TaskDescription.QfsBiF));
            map.put("layout/component_token_pair_list_item_0", Integer.valueOf(mDC.TaskDescription.UeEOUB));
            map.put("layout/component_transactions_trades_detail_0", Integer.valueOf(mDC.TaskDescription.aKErDB));
            map.put("layout/fragment_okcr_infinite_scroll_0", Integer.valueOf(mDC.TaskDescription.dNCPSb));
            map.put("layout/item_recurring_buy_plan_order_list_0", Integer.valueOf(mDC.TaskDescription.djSkpj));
        }
    }
}
