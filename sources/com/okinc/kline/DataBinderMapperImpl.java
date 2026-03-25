package com.okinc.kline;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C35964oKf;
import o.C36016oMd;
import o.C36019oMg;
import o.C36021oMi;
import o.C36024oMl;
import o.C36025oMm;
import o.C36027oMo;
import o.C36033oMu;
import o.C36034oMv;
import o.C36040oNa;
import o.C36099oPf;
import o.C36104oPk;
import o.C36115oPv;
import o.C36118oPy;
import o.oMA;
import o.oMB;
import o.oMC;
import o.oMH;
import o.oMR;
import o.oMS;
import o.oMX;
import o.oOE;
import o.oPB;
import o.oPD;
import o.oPE;
import o.oPG;
import o.oPJ;
import o.oPM;
import o.oPN;
import o.oPQ;
import o.oPT;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(30);
        copydefault = sparseIntArray;
        sparseIntArray.put(C35964oKf.Application.KWHzl, 1);
        sparseIntArray.put(C35964oKf.Application.gEmmrt, 2);
        sparseIntArray.put(C35964oKf.Application.fetchVPNInfo, 3);
        sparseIntArray.put(C35964oKf.Application.fJNWhG, 4);
        sparseIntArray.put(C35964oKf.Application.fIwbmz, 5);
        sparseIntArray.put(C35964oKf.Application.getFieldNames, 6);
        sparseIntArray.put(C35964oKf.Application.uzCIH, 7);
        sparseIntArray.put(C35964oKf.Application.AuCTelauCTel, 8);
        sparseIntArray.put(C35964oKf.Application.ORxRYg, 9);
        sparseIntArray.put(C35964oKf.Application.QOLQEE, 10);
        sparseIntArray.put(C35964oKf.Application.QfsBiF, 11);
        sparseIntArray.put(C35964oKf.Application.aKErDB, 12);
        sparseIntArray.put(C35964oKf.Application.gasjUx, 13);
        sparseIntArray.put(C35964oKf.Application.gGvvIC, 14);
        sparseIntArray.put(C35964oKf.Application.DarRvM, 15);
        sparseIntArray.put(C35964oKf.Application.gwTjWJ, 16);
        sparseIntArray.put(C35964oKf.Application.zSsVtY, 17);
        sparseIntArray.put(C35964oKf.Application.DPHsZd, 18);
        sparseIntArray.put(C35964oKf.Application.DrNnAm, 19);
        sparseIntArray.put(C35964oKf.Application.Th, 20);
        sparseIntArray.put(C35964oKf.Application.gdmIOq, 21);
        sparseIntArray.put(C35964oKf.Application.isReflectionWorking, 22);
        sparseIntArray.put(C35964oKf.Application.DQzvGNdrmXxu, 23);
        sparseIntArray.put(C35964oKf.Application.DQzvGNdrmXxudrmXxu, 24);
        sparseIntArray.put(C35964oKf.Application.RSDDiY, 25);
        sparseIntArray.put(C35964oKf.Application.DTeKQX, 26);
        sparseIntArray.put(C35964oKf.Application.DcMfJK, 27);
        sparseIntArray.put(C35964oKf.Application.RqmePg, 28);
        sparseIntArray.put(C35964oKf.Application.invokespecialROgMPW, 29);
        sparseIntArray.put(C35964oKf.Application.invokespecialhlXVux, 30);
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
                if ("layout/activity_coin_tab_info_0".equals(tag)) {
                    return new C36016oMd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_coin_tab_info is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_new_coin_time_count_0".equals(tag)) {
                    return new C36019oMg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_new_coin_time_count is invalid. Received: " + tag);
            case 3:
                if ("layout/component_kline_chart_0".equals(tag)) {
                    return new C36021oMi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for component_kline_chart is invalid. Received: " + tag);
            case 4:
                if ("layout/fg_coin_info_chart_0".equals(tag)) {
                    return new C36024oMl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fg_coin_info_chart is invalid. Received: " + tag);
            case 5:
                if ("layout/fg_coin_info_info_0".equals(tag)) {
                    return new C36027oMo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fg_coin_info_info is invalid. Received: " + tag);
            case 6:
                if ("layout/fragment_bot_kline_full_screen_layout_0".equals(tag)) {
                    return new C36025oMm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bot_kline_full_screen_layout is invalid. Received: " + tag);
            case 7:
                if ("layout/fragment_chart_kline_teach_0".equals(tag)) {
                    return new C36033oMu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_chart_kline_teach is invalid. Received: " + tag);
            case 8:
                if ("layout/fragment_coin_introduction_layout_0".equals(tag)) {
                    return new C36034oMv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_coin_introduction_layout is invalid. Received: " + tag);
            case 9:
                if ("layout/fragment_kline_compare_full_screen_layout_0".equals(tag)) {
                    return new oMA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_kline_compare_full_screen_layout is invalid. Received: " + tag);
            case 10:
                if ("layout/fragment_kline_drawing_tool_0".equals(tag)) {
                    return new oMC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_kline_drawing_tool is invalid. Received: " + tag);
            case 11:
                if ("layout/fragment_kline_full_screen_fibo_0".equals(tag)) {
                    return new oMB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_kline_full_screen_fibo is invalid. Received: " + tag);
            case 12:
                if ("layout/fragment_kline_market_deal_filter_0".equals(tag)) {
                    return new oMH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_kline_market_deal_filter is invalid. Received: " + tag);
            case 13:
                if ("layout/fragment_kline_right_fibo_0".equals(tag)) {
                    return new oMS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_kline_right_fibo is invalid. Received: " + tag);
            case 14:
                if ("layout/fragment_kline_right_time_0".equals(tag)) {
                    return new oMR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_kline_right_time is invalid. Received: " + tag);
            case 15:
                if ("layout/item_coin_info_resource_0".equals(tag)) {
                    return new oMX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_coin_info_resource is invalid. Received: " + tag);
            case 16:
                if ("layout/item_info_simple_option_0".equals(tag)) {
                    return new C36040oNa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_info_simple_option is invalid. Received: " + tag);
            case 17:
                if ("layout/kline_diagram_footer_view_0".equals(tag)) {
                    return new oOE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for kline_diagram_footer_view is invalid. Received: " + tag);
            case 18:
                if ("layout/kline_fragment_unlock_tokens_schedule_view_0".equals(tag)) {
                    return new C36099oPf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for kline_fragment_unlock_tokens_schedule_view is invalid. Received: " + tag);
            case 19:
                if ("layout/kline_intro_claimer_fragment_0".equals(tag)) {
                    return new C36104oPk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for kline_intro_claimer_fragment is invalid. Received: " + tag);
            case 20:
                if ("layout/layout_kline_item_1_0".equals(tag)) {
                    return new C36115oPv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_kline_item_1 is invalid. Received: " + tag);
            case 21:
                if ("layout/layout_kline_item_2_0".equals(tag)) {
                    return new C36118oPy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_kline_item_2 is invalid. Received: " + tag);
            case 22:
                if ("layout/layout_kline_item_3_0".equals(tag)) {
                    return new oPD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_kline_item_3 is invalid. Received: " + tag);
            case 23:
                if ("layout/layout_kline_new_coin_0".equals(tag)) {
                    return new oPB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_kline_new_coin is invalid. Received: " + tag);
            case 24:
                if ("layout/layout_kline_referral_view_0".equals(tag)) {
                    return new oPE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_kline_referral_view is invalid. Received: " + tag);
            case 25:
                if ("layout/layout_kline_tech_0".equals(tag)) {
                    return new oPG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_kline_tech is invalid. Received: " + tag);
            case 26:
                if ("layout/layout_kline_trading_tech_item_0".equals(tag)) {
                    return new oPJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_kline_trading_tech_item is invalid. Received: " + tag);
            case 27:
                if ("layout/layout_tech_kline_item_0".equals(tag)) {
                    return new oPM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_tech_kline_item is invalid. Received: " + tag);
            case 28:
                if ("layout/view_draw_line_tool_box_0".equals(tag)) {
                    return new oPN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_draw_line_tool_box is invalid. Received: " + tag);
            case 29:
                if ("layout/view_kline_full_screen_time_title_0".equals(tag)) {
                    return new oPQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_kline_full_screen_time_title is invalid. Received: " + tag);
            case 30:
                if ("layout/view_wait_new_coin_time_0".equals(tag)) {
                    return new oPT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_wait_new_coin_time is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || copydefault.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = StateListAnimator.OLrzqt.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return ActionBar.OLrzqt.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(14);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.chart.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okim.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.oksearch.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3Uilib.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class ActionBar {
        public static final SparseArray<String> OLrzqt;

        private ActionBar() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(14);
            OLrzqt = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "isGifPage");
            sparseArray.put(4, "isKlineStructure");
            sparseArray.put(5, "isThemPage");
            sparseArray.put(6, "item");
            sparseArray.put(7, "itemData");
            sparseArray.put(8, "leftButton");
            sparseArray.put(9, "model");
            sparseArray.put(10, "rightButton");
            sparseArray.put(11, "showCloseButton");
            sparseArray.put(12, "singelButton");
            sparseArray.put(13, "title");
        }
    }

    public static class StateListAnimator {
        public static final HashMap<String, Integer> OLrzqt;

        private StateListAnimator() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(30);
            OLrzqt = map;
            map.put("layout/activity_coin_tab_info_0", Integer.valueOf(C35964oKf.Application.KWHzl));
            map.put("layout/activity_new_coin_time_count_0", Integer.valueOf(C35964oKf.Application.gEmmrt));
            map.put("layout/component_kline_chart_0", Integer.valueOf(C35964oKf.Application.fetchVPNInfo));
            map.put("layout/fg_coin_info_chart_0", Integer.valueOf(C35964oKf.Application.fJNWhG));
            map.put("layout/fg_coin_info_info_0", Integer.valueOf(C35964oKf.Application.fIwbmz));
            map.put("layout/fragment_bot_kline_full_screen_layout_0", Integer.valueOf(C35964oKf.Application.getFieldNames));
            map.put("layout/fragment_chart_kline_teach_0", Integer.valueOf(C35964oKf.Application.uzCIH));
            map.put("layout/fragment_coin_introduction_layout_0", Integer.valueOf(C35964oKf.Application.AuCTelauCTel));
            map.put("layout/fragment_kline_compare_full_screen_layout_0", Integer.valueOf(C35964oKf.Application.ORxRYg));
            map.put("layout/fragment_kline_drawing_tool_0", Integer.valueOf(C35964oKf.Application.QOLQEE));
            map.put("layout/fragment_kline_full_screen_fibo_0", Integer.valueOf(C35964oKf.Application.QfsBiF));
            map.put("layout/fragment_kline_market_deal_filter_0", Integer.valueOf(C35964oKf.Application.aKErDB));
            map.put("layout/fragment_kline_right_fibo_0", Integer.valueOf(C35964oKf.Application.gasjUx));
            map.put("layout/fragment_kline_right_time_0", Integer.valueOf(C35964oKf.Application.gGvvIC));
            map.put("layout/item_coin_info_resource_0", Integer.valueOf(C35964oKf.Application.DarRvM));
            map.put("layout/item_info_simple_option_0", Integer.valueOf(C35964oKf.Application.gwTjWJ));
            map.put("layout/kline_diagram_footer_view_0", Integer.valueOf(C35964oKf.Application.zSsVtY));
            map.put("layout/kline_fragment_unlock_tokens_schedule_view_0", Integer.valueOf(C35964oKf.Application.DPHsZd));
            map.put("layout/kline_intro_claimer_fragment_0", Integer.valueOf(C35964oKf.Application.DrNnAm));
            map.put("layout/layout_kline_item_1_0", Integer.valueOf(C35964oKf.Application.Th));
            map.put("layout/layout_kline_item_2_0", Integer.valueOf(C35964oKf.Application.gdmIOq));
            map.put("layout/layout_kline_item_3_0", Integer.valueOf(C35964oKf.Application.isReflectionWorking));
            map.put("layout/layout_kline_new_coin_0", Integer.valueOf(C35964oKf.Application.DQzvGNdrmXxu));
            map.put("layout/layout_kline_referral_view_0", Integer.valueOf(C35964oKf.Application.DQzvGNdrmXxudrmXxu));
            map.put("layout/layout_kline_tech_0", Integer.valueOf(C35964oKf.Application.RSDDiY));
            map.put("layout/layout_kline_trading_tech_item_0", Integer.valueOf(C35964oKf.Application.DTeKQX));
            map.put("layout/layout_tech_kline_item_0", Integer.valueOf(C35964oKf.Application.DcMfJK));
            map.put("layout/view_draw_line_tool_box_0", Integer.valueOf(C35964oKf.Application.RqmePg));
            map.put("layout/view_kline_full_screen_time_title_0", Integer.valueOf(C35964oKf.Application.invokespecialROgMPW));
            map.put("layout/view_wait_new_coin_time_0", Integer.valueOf(C35964oKf.Application.invokespecialhlXVux));
        }
    }
}
