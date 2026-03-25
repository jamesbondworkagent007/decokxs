package com.okinc.business.dexui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C23274hvD;
import o.C23433hyD;
import o.C23434hyE;
import o.C23436hyG;
import o.C23440hyK;
import o.C23441hyL;
import o.C23445hyP;
import o.C23446hyQ;
import o.C23447hyR;
import o.C23449hyT;
import o.C23452hyW;
import o.C23453hyX;
import o.C23455hyZ;
import o.C23463hyh;
import o.C23509hza;
import o.C23511hzc;
import o.C23513hze;
import o.C23516hzh;
import o.C23518hzj;
import o.C23519hzk;
import o.C23522hzn;
import o.hAW;
import o.hCS;

/* JADX INFO: loaded from: classes6.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray OLrzqt;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(22);
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C23274hvD.Activity.fvQaOB, 1);
        sparseIntArray.put(C23274hvD.Activity.DCUTEI, 2);
        sparseIntArray.put(C23274hvD.Activity.zuWLRA, 3);
        sparseIntArray.put(C23274hvD.Activity.QHmsKR, 4);
        sparseIntArray.put(C23274hvD.Activity.QkdxfA, 5);
        sparseIntArray.put(C23274hvD.Activity.OBJEWx, 6);
        sparseIntArray.put(C23274hvD.Activity.QSBOWP, 7);
        sparseIntArray.put(C23274hvD.Activity.RKDWNf, 8);
        sparseIntArray.put(C23274hvD.Activity.gwTjWJ, 9);
        sparseIntArray.put(C23274hvD.Activity.dmfpNf, 10);
        sparseIntArray.put(C23274hvD.Activity.RdAHlO, 11);
        sparseIntArray.put(C23274hvD.Activity.dHguZz, 12);
        sparseIntArray.put(C23274hvD.Activity.hBpjJd, 13);
        sparseIntArray.put(C23274hvD.Activity.OHqIaq, 14);
        sparseIntArray.put(C23274hvD.Activity.OFhtUX, 15);
        sparseIntArray.put(C23274hvD.Activity.ODXsMY, 16);
        sparseIntArray.put(C23274hvD.Activity.hrNTAI, 17);
        sparseIntArray.put(C23274hvD.Activity.DLWbHP, 18);
        sparseIntArray.put(C23274hvD.Activity.OxVOHk, 19);
        sparseIntArray.put(C23274hvD.Activity.QSLkRj, 20);
        sparseIntArray.put(C23274hvD.Activity.gtCCJH, 21);
        sparseIntArray.put(C23274hvD.Activity.stopBehavioSecDataCollection, 22);
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
                if ("layout/dex_bs_disclaimer_meme_0".equals(tag)) {
                    return new C23463hyh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_bs_disclaimer_meme is invalid. Received: " + tag);
            case 2:
                if ("layout/dex_contract_transaction_boost_info_0".equals(tag)) {
                    return new C23436hyG(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_boost_info is invalid. Received: " + tag);
            case 3:
                if ("layout/dex_contract_transaction_recyclerview_divider_0".equals(tag)) {
                    return new C23433hyD(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_recyclerview_divider is invalid. Received: " + tag);
            case 4:
                if ("layout/dex_contract_transaction_recyclerview_interval_0".equals(tag)) {
                    return new C23434hyE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_recyclerview_interval is invalid. Received: " + tag);
            case 5:
                if ("layout/dex_contract_transaction_recyclerview_rate_divider_0".equals(tag)) {
                    return new C23441hyL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_recyclerview_rate_divider is invalid. Received: " + tag);
            case 6:
                if ("layout/dex_contract_transaction_recyclerview_wallet_interval_0".equals(tag)) {
                    return new C23440hyK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_recyclerview_wallet_interval is invalid. Received: " + tag);
            case 7:
                if ("layout/dex_contract_transaction_swap_advance_network_fee_0".equals(tag)) {
                    return new C23446hyQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_advance_network_fee is invalid. Received: " + tag);
            case 8:
                if ("layout/dex_contract_transaction_swap_advance_service_fee_0".equals(tag)) {
                    return new C23447hyR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_advance_service_fee is invalid. Received: " + tag);
            case 9:
                if ("layout/dex_contract_transaction_swap_coin_info_0".equals(tag)) {
                    return new C23445hyP(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_coin_info is invalid. Received: " + tag);
            case 10:
                if ("layout/dex_contract_transaction_swap_coin_price_0".equals(tag)) {
                    return new C23452hyW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_coin_price is invalid. Received: " + tag);
            case 11:
                if ("layout/dex_contract_transaction_swap_de_fi_platform_info_0".equals(tag)) {
                    return new C23449hyT(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_de_fi_platform_info is invalid. Received: " + tag);
            case 12:
                if ("layout/dex_contract_transaction_swap_detail_info_0".equals(tag)) {
                    return new C23453hyX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_detail_info is invalid. Received: " + tag);
            case 13:
                if ("layout/dex_contract_transaction_swap_est_time_0".equals(tag)) {
                    return new C23509hza(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_est_time is invalid. Received: " + tag);
            case 14:
                if ("layout/dex_contract_transaction_swap_minimum_received_info_0".equals(tag)) {
                    return new C23455hyZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_minimum_received_info is invalid. Received: " + tag);
            case 15:
                if ("layout/dex_contract_transaction_swap_network_fee_0".equals(tag)) {
                    return new C23513hze(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_network_fee is invalid. Received: " + tag);
            case 16:
                if ("layout/dex_contract_transaction_swap_rate_info_0".equals(tag)) {
                    return new C23511hzc(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_rate_info is invalid. Received: " + tag);
            case 17:
                if ("layout/dex_contract_transaction_swap_service_fee_0".equals(tag)) {
                    return new C23518hzj(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_service_fee is invalid. Received: " + tag);
            case 18:
                if ("layout/dex_contract_transaction_swap_slip_page_0".equals(tag)) {
                    return new C23519hzk(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_slip_page is invalid. Received: " + tag);
            case 19:
                if ("layout/dex_contract_transaction_swap_to_wallet_info_0".equals(tag)) {
                    return new C23516hzh(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_to_wallet_info is invalid. Received: " + tag);
            case 20:
                if ("layout/dex_contract_transaction_swap_wallet_info_0".equals(tag)) {
                    return new C23522hzn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_contract_transaction_swap_wallet_info is invalid. Received: " + tag);
            case 21:
                if ("layout/dex_fg_market_widget_item_recycler_interval_empty_24_0".equals(tag)) {
                    return new hAW(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_fg_market_widget_item_recycler_interval_empty_24 is invalid. Received: " + tag);
            case 22:
                if ("layout/dex_item_order_detail_boost_0".equals(tag)) {
                    return new hCS(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dex_item_order_detail_boost is invalid. Received: " + tag);
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
        if (str == null || (num = TaskDescription.EZpvd.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return Application.OLrzqt.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(12);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.chart.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilib.gallery.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3Uilib.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class Application {
        public static final SparseArray<String> OLrzqt;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(10);
            OLrzqt = sparseArray;
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
        }
    }

    public static class TaskDescription {
        public static final HashMap<String, Integer> EZpvd;

        private TaskDescription() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(22);
            EZpvd = map;
            map.put("layout/dex_bs_disclaimer_meme_0", Integer.valueOf(C23274hvD.Activity.fvQaOB));
            map.put("layout/dex_contract_transaction_boost_info_0", Integer.valueOf(C23274hvD.Activity.DCUTEI));
            map.put("layout/dex_contract_transaction_recyclerview_divider_0", Integer.valueOf(C23274hvD.Activity.zuWLRA));
            map.put("layout/dex_contract_transaction_recyclerview_interval_0", Integer.valueOf(C23274hvD.Activity.QHmsKR));
            map.put("layout/dex_contract_transaction_recyclerview_rate_divider_0", Integer.valueOf(C23274hvD.Activity.QkdxfA));
            map.put("layout/dex_contract_transaction_recyclerview_wallet_interval_0", Integer.valueOf(C23274hvD.Activity.OBJEWx));
            map.put("layout/dex_contract_transaction_swap_advance_network_fee_0", Integer.valueOf(C23274hvD.Activity.QSBOWP));
            map.put("layout/dex_contract_transaction_swap_advance_service_fee_0", Integer.valueOf(C23274hvD.Activity.RKDWNf));
            map.put("layout/dex_contract_transaction_swap_coin_info_0", Integer.valueOf(C23274hvD.Activity.gwTjWJ));
            map.put("layout/dex_contract_transaction_swap_coin_price_0", Integer.valueOf(C23274hvD.Activity.dmfpNf));
            map.put("layout/dex_contract_transaction_swap_de_fi_platform_info_0", Integer.valueOf(C23274hvD.Activity.RdAHlO));
            map.put("layout/dex_contract_transaction_swap_detail_info_0", Integer.valueOf(C23274hvD.Activity.dHguZz));
            map.put("layout/dex_contract_transaction_swap_est_time_0", Integer.valueOf(C23274hvD.Activity.hBpjJd));
            map.put("layout/dex_contract_transaction_swap_minimum_received_info_0", Integer.valueOf(C23274hvD.Activity.OHqIaq));
            map.put("layout/dex_contract_transaction_swap_network_fee_0", Integer.valueOf(C23274hvD.Activity.OFhtUX));
            map.put("layout/dex_contract_transaction_swap_rate_info_0", Integer.valueOf(C23274hvD.Activity.ODXsMY));
            map.put("layout/dex_contract_transaction_swap_service_fee_0", Integer.valueOf(C23274hvD.Activity.hrNTAI));
            map.put("layout/dex_contract_transaction_swap_slip_page_0", Integer.valueOf(C23274hvD.Activity.DLWbHP));
            map.put("layout/dex_contract_transaction_swap_to_wallet_info_0", Integer.valueOf(C23274hvD.Activity.OxVOHk));
            map.put("layout/dex_contract_transaction_swap_wallet_info_0", Integer.valueOf(C23274hvD.Activity.QSLkRj));
            map.put("layout/dex_fg_market_widget_item_recycler_interval_empty_24_0", Integer.valueOf(C23274hvD.Activity.gtCCJH));
            map.put("layout/dex_item_order_detail_boost_0", Integer.valueOf(C23274hvD.Activity.stopBehavioSecDataCollection));
        }
    }
}
