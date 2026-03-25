package com.okinc.market_resource;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C42836rdt;
import o.C42837rdu;
import o.C42841rdy;
import o.qZH;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray AEQbTJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(qZH.ActionBar.invokespecialgBtXYZ, 1);
        sparseIntArray.put(qZH.ActionBar.invokespecialhlXVux, 2);
        sparseIntArray.put(qZH.ActionBar.invokespecialhOMIpD, 3);
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
        if (i2 == 1) {
            if ("layout/market_impl_fragment_spot_analysis_layout_0".equals(tag)) {
                return new C42837rdu(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for market_impl_fragment_spot_analysis_layout is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/market_impl_fragment_spot_analysis_list_item_layout_0".equals(tag)) {
                return new C42836rdt(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for market_impl_fragment_spot_analysis_list_item_layout is invalid. Received: " + tag);
        }
        if (i2 != 3) {
            return null;
        }
        if ("layout/market_impl_fragment_spot_analysis_load_all_item_layout_0".equals(tag)) {
            return new C42841rdy(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for market_impl_fragment_spot_analysis_load_all_item_layout is invalid. Received: " + tag);
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
        if (str == null || (num = Activity.OLrzqt.get(str)) == null) {
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
        ArrayList arrayList = new ArrayList(19);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.donkingliang.groupedadapter.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.chart.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.cruilib.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.market.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okim.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.oksearch.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilib.gallery.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3Uilib.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class ActionBar {
        public static final SparseArray<String> copydefault;

        private ActionBar() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(15);
            copydefault = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "imageTypes");
            sparseArray.put(4, "item");
            sparseArray.put(5, "itemData");
            sparseArray.put(6, "label");
            sparseArray.put(7, "leftButton");
            sparseArray.put(8, "message");
            sparseArray.put(9, "model");
            sparseArray.put(10, "rightButton");
            sparseArray.put(11, "showCloseButton");
            sparseArray.put(12, "singelButton");
            sparseArray.put(13, "title");
            sparseArray.put(14, "viewModel");
        }
    }

    public static class Activity {
        public static final HashMap<String, Integer> OLrzqt;

        private Activity() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(3);
            OLrzqt = map;
            map.put("layout/market_impl_fragment_spot_analysis_layout_0", Integer.valueOf(qZH.ActionBar.invokespecialgBtXYZ));
            map.put("layout/market_impl_fragment_spot_analysis_list_item_layout_0", Integer.valueOf(qZH.ActionBar.invokespecialhlXVux));
            map.put("layout/market_impl_fragment_spot_analysis_load_all_item_layout_0", Integer.valueOf(qZH.ActionBar.invokespecialhOMIpD));
        }
    }
}
