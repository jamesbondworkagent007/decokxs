package com.okinc.business.defi.discover;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C13461dMe;
import o.C13463dMg;
import o.C13465dMi;
import o.C13466dMj;
import o.C13467dMk;
import o.C13470dMn;
import o.C13471dMo;
import o.C13475dMs;
import o.C13476dMt;
import o.C13477dMu;
import o.C13479dMw;
import o.C13480dMx;
import o.dLX;
import o.dMD;
import o.dME;
import o.dMF;
import o.dMG;
import o.dMI;
import o.dML;
import o.dMM;
import o.dMN;

/* JADX INFO: loaded from: classes4.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray AEQbTJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(20);
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(dLX.Fragment.copydefault, 1);
        sparseIntArray.put(dLX.Fragment.KWHzl, 2);
        sparseIntArray.put(dLX.Fragment.gEmmrt, 3);
        sparseIntArray.put(dLX.Fragment.AhwBna, 4);
        sparseIntArray.put(dLX.Fragment.valueOf, 5);
        sparseIntArray.put(dLX.Fragment.djBIcL, 6);
        sparseIntArray.put(dLX.Fragment.values, 7);
        sparseIntArray.put(dLX.Fragment.DbNXlk, 8);
        sparseIntArray.put(dLX.Fragment.fetchVPNInfo, 9);
        sparseIntArray.put(dLX.Fragment.fIwbmz, 10);
        sparseIntArray.put(dLX.Fragment.AuCTel, 11);
        sparseIntArray.put(dLX.Fragment.fJNWhG, 12);
        sparseIntArray.put(dLX.Fragment.fARcdN, 13);
        sparseIntArray.put(dLX.Fragment.iwGUEr, 14);
        sparseIntArray.put(dLX.Fragment.getFieldNames, 15);
        sparseIntArray.put(dLX.Fragment.hDKMBd, 16);
        sparseIntArray.put(dLX.Fragment.getNewProxyInstance, 17);
        sparseIntArray.put(dLX.Fragment.uzCIH, 18);
        sparseIntArray.put(dLX.Fragment.wlaJM, 19);
        sparseIntArray.put(dLX.Fragment.AubY, 20);
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
        switch (i2) {
            case 1:
                if ("layout/activity_dapp_webview_0".equals(tag)) {
                    return new C13463dMg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_dapp_webview is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_webview_input_0".equals(tag)) {
                    return new C13461dMe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_webview_input is invalid. Received: " + tag);
            case 3:
                if ("layout/fragment_dapp_container_0".equals(tag)) {
                    return new C13466dMj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dapp_container is invalid. Received: " + tag);
            case 4:
                if ("layout/fragment_dapp_new_web_0".equals(tag)) {
                    return new C13465dMi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_dapp_new_web is invalid. Received: " + tag);
            case 5:
                if ("layout/fragment_lua_discover_0".equals(tag)) {
                    return new C13467dMk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_lua_discover is invalid. Received: " + tag);
            case 6:
                if ("layout/fragment_vibe_posts_0".equals(tag)) {
                    return new C13471dMo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_vibe_posts is invalid. Received: " + tag);
            case 7:
                if ("layout/item_dapp_tab_0".equals(tag)) {
                    return new C13470dMn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_dapp_tab is invalid. Received: " + tag);
            case 8:
                if ("layout/layout_collect_confirm_0".equals(tag)) {
                    return new C13476dMt(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_collect_confirm is invalid. Received: " + tag);
            case 9:
                if ("layout/layout_dapp_detail_0".equals(tag)) {
                    return new C13475dMs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_detail is invalid. Received: " + tag);
            case 10:
                if ("layout/layout_dapp_web_options_0".equals(tag)) {
                    return new C13479dMw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_web_options is invalid. Received: " + tag);
            case 11:
                if ("layout/layout_dapp_web_options_bar_0".equals(tag)) {
                    return new C13477dMu(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dapp_web_options_bar is invalid. Received: " + tag);
            case 12:
                if ("layout/layout_dual_mode_toolbar_0".equals(tag)) {
                    return new C13480dMx(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_dual_mode_toolbar is invalid. Received: " + tag);
            case 13:
                if ("layout/layout_item_dapp_history_0".equals(tag)) {
                    return new dME(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_item_dapp_history is invalid. Received: " + tag);
            case 14:
                if ("layout/layout_pay_wallet_coin_0".equals(tag)) {
                    return new dMD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_pay_wallet_coin is invalid. Received: " + tag);
            case 15:
                if ("layout/layout_select_network_list_0".equals(tag)) {
                    return new dMF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_select_network_list is invalid. Received: " + tag);
            case 16:
                if ("layout/layout_select_wallet_0".equals(tag)) {
                    return new dMI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_select_wallet is invalid. Received: " + tag);
            case 17:
                if ("layout/layout_select_wallet_account_item_0".equals(tag)) {
                    return new dMG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_select_wallet_account_item is invalid. Received: " + tag);
            case 18:
                if ("layout/layout_select_wallet_item_0".equals(tag)) {
                    return new dMN(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_select_wallet_item is invalid. Received: " + tag);
            case 19:
                if ("layout/layout_select_wallet_notice_0".equals(tag)) {
                    return new dML(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_select_wallet_notice is invalid. Received: " + tag);
            case 20:
                if ("layout/layout_wallet_coin_asset_item_0".equals(tag)) {
                    return new dMM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_wallet_coin_asset_item is invalid. Received: " + tag);
            default:
                return null;
        }
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
        return Activity.EZpvd.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3Uilib.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class Activity {
        public static final SparseArray<String> EZpvd;

        private Activity() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(13);
            EZpvd = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "detail");
            sparseArray.put(4, "item");
            sparseArray.put(5, "itemData");
            sparseArray.put(6, "leftButton");
            sparseArray.put(7, "model");
            sparseArray.put(8, "privateKeyInfo");
            sparseArray.put(9, "rightButton");
            sparseArray.put(10, "showCloseButton");
            sparseArray.put(11, "singelButton");
            sparseArray.put(12, "title");
        }
    }

    public static class ActionBar {
        public static final HashMap<String, Integer> EZpvd;

        private ActionBar() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(20);
            EZpvd = map;
            map.put("layout/activity_dapp_webview_0", Integer.valueOf(dLX.Fragment.copydefault));
            map.put("layout/activity_webview_input_0", Integer.valueOf(dLX.Fragment.KWHzl));
            map.put("layout/fragment_dapp_container_0", Integer.valueOf(dLX.Fragment.gEmmrt));
            map.put("layout/fragment_dapp_new_web_0", Integer.valueOf(dLX.Fragment.AhwBna));
            map.put("layout/fragment_lua_discover_0", Integer.valueOf(dLX.Fragment.valueOf));
            map.put("layout/fragment_vibe_posts_0", Integer.valueOf(dLX.Fragment.djBIcL));
            map.put("layout/item_dapp_tab_0", Integer.valueOf(dLX.Fragment.values));
            map.put("layout/layout_collect_confirm_0", Integer.valueOf(dLX.Fragment.DbNXlk));
            map.put("layout/layout_dapp_detail_0", Integer.valueOf(dLX.Fragment.fetchVPNInfo));
            map.put("layout/layout_dapp_web_options_0", Integer.valueOf(dLX.Fragment.fIwbmz));
            map.put("layout/layout_dapp_web_options_bar_0", Integer.valueOf(dLX.Fragment.AuCTel));
            map.put("layout/layout_dual_mode_toolbar_0", Integer.valueOf(dLX.Fragment.fJNWhG));
            map.put("layout/layout_item_dapp_history_0", Integer.valueOf(dLX.Fragment.fARcdN));
            map.put("layout/layout_pay_wallet_coin_0", Integer.valueOf(dLX.Fragment.iwGUEr));
            map.put("layout/layout_select_network_list_0", Integer.valueOf(dLX.Fragment.getFieldNames));
            map.put("layout/layout_select_wallet_0", Integer.valueOf(dLX.Fragment.hDKMBd));
            map.put("layout/layout_select_wallet_account_item_0", Integer.valueOf(dLX.Fragment.getNewProxyInstance));
            map.put("layout/layout_select_wallet_item_0", Integer.valueOf(dLX.Fragment.uzCIH));
            map.put("layout/layout_select_wallet_notice_0", Integer.valueOf(dLX.Fragment.wlaJM));
            map.put("layout/layout_wallet_coin_asset_item_0", Integer.valueOf(dLX.Fragment.AubY));
        }
    }
}
