package com.okinc.planet;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C46224tMk;
import o.C46227tMn;
import o.C46228tMo;
import o.C46239tMz;
import o.C46244tNd;
import o.C46255tNo;
import o.C46284tOq;
import o.C46286tOs;
import o.C46289tOv;
import o.C46295tPa;
import o.C46298tPd;
import o.C46300tPf;
import o.C46301tPg;
import o.C46303tPi;
import o.C46307tPm;
import o.C46308tPn;
import o.C46313tPs;
import o.C46314tPt;
import o.C47501trL;
import o.tMF;
import o.tMH;
import o.tML;
import o.tMM;
import o.tMN;
import o.tMT;
import o.tMU;
import o.tMV;
import o.tMY;
import o.tNA;
import o.tNB;
import o.tNF;
import o.tNG;
import o.tOA;
import o.tOH;
import o.tOO;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray OLrzqt;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(34);
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C47501trL.Application.KWHzl, 1);
        sparseIntArray.put(C47501trL.Application.copydefault, 2);
        sparseIntArray.put(C47501trL.Application.valueOf, 3);
        sparseIntArray.put(C47501trL.Application.AkhnZx, 4);
        sparseIntArray.put(C47501trL.Application.hDKMBd, 5);
        sparseIntArray.put(C47501trL.Application.iwGUEr, 6);
        sparseIntArray.put(C47501trL.Application.getNewProxyInstance, 7);
        sparseIntArray.put(C47501trL.Application.getFieldNames, 8);
        sparseIntArray.put(C47501trL.Application.wlaJM, 9);
        sparseIntArray.put(C47501trL.Application.AubY, 10);
        sparseIntArray.put(C47501trL.Application.zsXlph, 11);
        sparseIntArray.put(C47501trL.Application.gHZMYf, 12);
        sparseIntArray.put(C47501trL.Application.AxsJAY, 13);
        sparseIntArray.put(C47501trL.Application.AwvSrB, 14);
        sparseIntArray.put(C47501trL.Application.RcXXUw, 15);
        sparseIntArray.put(C47501trL.Application.giSNqX, 16);
        sparseIntArray.put(C47501trL.Application.fvQaOB, 17);
        sparseIntArray.put(C47501trL.Application.iRxXKY, 18);
        sparseIntArray.put(C47501trL.Application.AxsJAYaxsJAY, 19);
        sparseIntArray.put(C47501trL.Application.dUDNAs, 20);
        sparseIntArray.put(C47501trL.Application.igXuih, 21);
        sparseIntArray.put(C47501trL.Application.Dmq, 22);
        sparseIntArray.put(C47501trL.Application.DCUTEIdCUTEI, 23);
        sparseIntArray.put(C47501trL.Application.DBxZfM, 24);
        sparseIntArray.put(C47501trL.Application.DaRZkR, 25);
        sparseIntArray.put(C47501trL.Application.akftKQ, 26);
        sparseIntArray.put(C47501trL.Application.aHXSQp, 27);
        sparseIntArray.put(C47501trL.Application.alsFma, 28);
        sparseIntArray.put(C47501trL.Application.UscePu, 29);
        sparseIntArray.put(C47501trL.Application.aJFbMH, 30);
        sparseIntArray.put(C47501trL.Application.fXHmeK, 31);
        sparseIntArray.put(C47501trL.Application.dLBcXg, 32);
        sparseIntArray.put(C47501trL.Application.apNbdB, 33);
        sparseIntArray.put(C47501trL.Application.dvImUD, 34);
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
                if ("layout/activity_planet_async_x_0".equals(tag)) {
                    return new C46224tMk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_planet_async_x is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_planet_data_reset_binding_0".equals(tag)) {
                    return new C46228tMo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_planet_data_reset_binding is invalid. Received: " + tag);
            case 3:
                if ("layout/activity_planet_link_x_success_0".equals(tag)) {
                    return new C46227tMn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_planet_link_x_success is invalid. Received: " + tag);
            case 4:
                if ("layout/activity_planet_x_manage_0".equals(tag)) {
                    return new C46239tMz(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_planet_x_manage is invalid. Received: " + tag);
            case 5:
                if ("layout/item_creator_centre_earnings_0".equals(tag)) {
                    return new tMH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_creator_centre_earnings is invalid. Received: " + tag);
            case 6:
                if ("layout/item_creator_centre_earnings_empty_0".equals(tag)) {
                    return new tMF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_creator_centre_earnings_empty is invalid. Received: " + tag);
            case 7:
                if ("layout/item_creator_centre_earnings_history_header_0".equals(tag)) {
                    return new tML(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_creator_centre_earnings_history_header is invalid. Received: " + tag);
            case 8:
                if ("layout/item_creator_centre_earnings_month_header_0".equals(tag)) {
                    return new tMN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_creator_centre_earnings_month_header is invalid. Received: " + tag);
            case 9:
                if ("layout/item_creator_centre_earnings_total_paid_out_0".equals(tag)) {
                    return new tMM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_creator_centre_earnings_total_paid_out is invalid. Received: " + tag);
            case 10:
                if ("layout/item_planet_common_message_content_0".equals(tag)) {
                    return new tMT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_planet_common_message_content is invalid. Received: " + tag);
            case 11:
                if ("layout/item_planet_message_time_0".equals(tag)) {
                    return new tMY(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_planet_message_time is invalid. Received: " + tag);
            case 12:
                if ("layout/item_planet_mine_comments_content_0".equals(tag)) {
                    return new tMV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_planet_mine_comments_content is invalid. Received: " + tag);
            case 13:
                if ("layout/item_planet_mine_likes_content_0".equals(tag)) {
                    return new tMU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_planet_mine_likes_content is invalid. Received: " + tag);
            case 14:
                if ("layout/item_planet_profile_badge_0".equals(tag)) {
                    return new C46244tNd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_planet_profile_badge is invalid. Received: " + tag);
            case 15:
                if ("layout/planet_activity_publisher_0".equals(tag)) {
                    return new C46255tNo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for planet_activity_publisher is invalid. Received: " + tag);
            case 16:
                if ("layout/planet_bottomsheet_x_data_0".equals(tag)) {
                    return new tNA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for planet_bottomsheet_x_data is invalid. Received: " + tag);
            case 17:
                if ("layout/planet_dialog_link_x_fail_0".equals(tag)) {
                    return new tNB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for planet_dialog_link_x_fail is invalid. Received: " + tag);
            case 18:
                if ("layout/planet_dialog_profile_setting_0".equals(tag)) {
                    return new tNF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for planet_dialog_profile_setting is invalid. Received: " + tag);
            case 19:
                if ("layout/planet_follow_arbitrage_item_0".equals(tag)) {
                    return new tNG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for planet_follow_arbitrage_item is invalid. Received: " + tag);
            case 20:
                if ("layout/planet_item_overview_copy_trading_0".equals(tag)) {
                    return new C46284tOq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for planet_item_overview_copy_trading is invalid. Received: " + tag);
            case 21:
                if ("layout/planet_item_selected_image_0".equals(tag)) {
                    return new C46289tOv(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for planet_item_selected_image is invalid. Received: " + tag);
            case 22:
                if ("layout/planet_item_token_0".equals(tag)) {
                    return new C46286tOs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for planet_item_token is invalid. Received: " + tag);
            case 23:
                if ("layout/planet_item_topic_0".equals(tag)) {
                    return new tOA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for planet_item_topic is invalid. Received: " + tag);
            case 24:
                if ("layout/planet_view_group_chat_card_0".equals(tag)) {
                    return new tOH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for planet_view_group_chat_card is invalid. Received: " + tag);
            case 25:
                if ("layout/planet_view_lead_trade_pnl_card_0".equals(tag)) {
                    return new tOO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for planet_view_lead_trade_pnl_card is invalid. Received: " + tag);
            case 26:
                if ("layout/plugin_future_card_0".equals(tag)) {
                    return new C46298tPd(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for plugin_future_card is invalid. Received: " + tag);
            case 27:
                if ("layout/plugin_future_history_item_0".equals(tag)) {
                    return new C46295tPa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for plugin_future_history_item is invalid. Received: " + tag);
            case 28:
                if ("layout/plugin_future_position_item_0".equals(tag)) {
                    return new C46303tPi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for plugin_future_position_item is invalid. Received: " + tag);
            case 29:
                if ("layout/plugin_future_quickly_item_0".equals(tag)) {
                    return new C46300tPf(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for plugin_future_quickly_item is invalid. Received: " + tag);
            case 30:
                if ("layout/plugin_future_tags_0".equals(tag)) {
                    return new C46301tPg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for plugin_future_tags is invalid. Received: " + tag);
            case 31:
                if ("layout/plugin_search_item_0".equals(tag)) {
                    return new C46307tPm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for plugin_search_item is invalid. Received: " + tag);
            case 32:
                if ("layout/plugin_spot_card_0".equals(tag)) {
                    return new C46308tPn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for plugin_spot_card is invalid. Received: " + tag);
            case 33:
                if ("layout/plugin_spot_item_0".equals(tag)) {
                    return new C46314tPt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for plugin_spot_item is invalid. Received: " + tag);
            case 34:
                if ("layout/publisher_draft_item_0".equals(tag)) {
                    return new C46313tPs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for publisher_draft_item is invalid. Received: " + tag);
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
        if (str == null || (num = Activity.copydefault.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return Application.copydefault.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(15);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.chart.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okim.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.oklive.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilib.gallery.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class Application {
        public static final SparseArray<String> copydefault;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(15);
            copydefault = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "followerCount");
            sparseArray.put(4, "followingCount");
            sparseArray.put(5, "imageTypes");
            sparseArray.put(6, "item");
            sparseArray.put(7, "itemData");
            sparseArray.put(8, "label");
            sparseArray.put(9, "leftButton");
            sparseArray.put(10, "model");
            sparseArray.put(11, "rightButton");
            sparseArray.put(12, "showCloseButton");
            sparseArray.put(13, "singelButton");
            sparseArray.put(14, "title");
        }
    }

    public static class Activity {
        public static final HashMap<String, Integer> copydefault;

        private Activity() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(34);
            copydefault = map;
            map.put("layout/activity_planet_async_x_0", Integer.valueOf(C47501trL.Application.KWHzl));
            map.put("layout/activity_planet_data_reset_binding_0", Integer.valueOf(C47501trL.Application.copydefault));
            map.put("layout/activity_planet_link_x_success_0", Integer.valueOf(C47501trL.Application.valueOf));
            map.put("layout/activity_planet_x_manage_0", Integer.valueOf(C47501trL.Application.AkhnZx));
            map.put("layout/item_creator_centre_earnings_0", Integer.valueOf(C47501trL.Application.hDKMBd));
            map.put("layout/item_creator_centre_earnings_empty_0", Integer.valueOf(C47501trL.Application.iwGUEr));
            map.put("layout/item_creator_centre_earnings_history_header_0", Integer.valueOf(C47501trL.Application.getNewProxyInstance));
            map.put("layout/item_creator_centre_earnings_month_header_0", Integer.valueOf(C47501trL.Application.getFieldNames));
            map.put("layout/item_creator_centre_earnings_total_paid_out_0", Integer.valueOf(C47501trL.Application.wlaJM));
            map.put("layout/item_planet_common_message_content_0", Integer.valueOf(C47501trL.Application.AubY));
            map.put("layout/item_planet_message_time_0", Integer.valueOf(C47501trL.Application.zsXlph));
            map.put("layout/item_planet_mine_comments_content_0", Integer.valueOf(C47501trL.Application.gHZMYf));
            map.put("layout/item_planet_mine_likes_content_0", Integer.valueOf(C47501trL.Application.AxsJAY));
            map.put("layout/item_planet_profile_badge_0", Integer.valueOf(C47501trL.Application.AwvSrB));
            map.put("layout/planet_activity_publisher_0", Integer.valueOf(C47501trL.Application.RcXXUw));
            map.put("layout/planet_bottomsheet_x_data_0", Integer.valueOf(C47501trL.Application.giSNqX));
            map.put("layout/planet_dialog_link_x_fail_0", Integer.valueOf(C47501trL.Application.fvQaOB));
            map.put("layout/planet_dialog_profile_setting_0", Integer.valueOf(C47501trL.Application.iRxXKY));
            map.put("layout/planet_follow_arbitrage_item_0", Integer.valueOf(C47501trL.Application.AxsJAYaxsJAY));
            map.put("layout/planet_item_overview_copy_trading_0", Integer.valueOf(C47501trL.Application.dUDNAs));
            map.put("layout/planet_item_selected_image_0", Integer.valueOf(C47501trL.Application.igXuih));
            map.put("layout/planet_item_token_0", Integer.valueOf(C47501trL.Application.Dmq));
            map.put("layout/planet_item_topic_0", Integer.valueOf(C47501trL.Application.DCUTEIdCUTEI));
            map.put("layout/planet_view_group_chat_card_0", Integer.valueOf(C47501trL.Application.DBxZfM));
            map.put("layout/planet_view_lead_trade_pnl_card_0", Integer.valueOf(C47501trL.Application.DaRZkR));
            map.put("layout/plugin_future_card_0", Integer.valueOf(C47501trL.Application.akftKQ));
            map.put("layout/plugin_future_history_item_0", Integer.valueOf(C47501trL.Application.aHXSQp));
            map.put("layout/plugin_future_position_item_0", Integer.valueOf(C47501trL.Application.alsFma));
            map.put("layout/plugin_future_quickly_item_0", Integer.valueOf(C47501trL.Application.UscePu));
            map.put("layout/plugin_future_tags_0", Integer.valueOf(C47501trL.Application.aJFbMH));
            map.put("layout/plugin_search_item_0", Integer.valueOf(C47501trL.Application.fXHmeK));
            map.put("layout/plugin_spot_card_0", Integer.valueOf(C47501trL.Application.dLBcXg));
            map.put("layout/plugin_spot_item_0", Integer.valueOf(C47501trL.Application.apNbdB));
            map.put("layout/publisher_draft_item_0", Integer.valueOf(C47501trL.Application.dvImUD));
        }
    }
}
