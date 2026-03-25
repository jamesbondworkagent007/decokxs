package com.okinc.tradeuilib.impl;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C49678utA;
import o.C49680utC;
import o.C49682utE;
import o.C49683utF;
import o.C49685utH;
import o.C49688utK;
import o.C49720utq;
import o.C49726utw;

/* JADX INFO: loaded from: classes11.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray OLrzqt;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C49720utq.ActionBar.AEQbTJ, 1);
        sparseIntArray.put(C49720utq.ActionBar.OLrzqt, 2);
        sparseIntArray.put(C49720utq.ActionBar.EZpvd, 3);
        sparseIntArray.put(C49720utq.ActionBar.copydefault, 4);
        sparseIntArray.put(C49720utq.ActionBar.KWHzl, 5);
        sparseIntArray.put(C49720utq.ActionBar.djBIcL, 6);
        sparseIntArray.put(C49720utq.ActionBar.AYXKKw, 7);
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
                if ("layout/trade_ui_dialog_futures_ticker_info_explain_0".equals(tag)) {
                    return new C49726utw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for trade_ui_dialog_futures_ticker_info_explain is invalid. Received: " + tag);
            case 2:
                if ("layout/view_depth_ticker_info_0".equals(tag)) {
                    return new C49678utA(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_depth_ticker_info is invalid. Received: " + tag);
            case 3:
                if ("layout/view_depth_ticker_info_future_new_item_0".equals(tag)) {
                    return new C49680utC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_depth_ticker_info_future_new_item is invalid. Received: " + tag);
            case 4:
                if ("layout/view_depth_ticker_info_item_0".equals(tag)) {
                    return new C49682utE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_depth_ticker_info_item is invalid. Received: " + tag);
            case 5:
                if ("layout/view_depth_ticker_info_swap_new_item_0".equals(tag)) {
                    return new C49683utF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_depth_ticker_info_swap_new_item is invalid. Received: " + tag);
            case 6:
                if ("layout/view_futures_depth_ticker_info_0".equals(tag)) {
                    return new C49685utH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_futures_depth_ticker_info is invalid. Received: " + tag);
            case 7:
                if ("layout/view_swap_depth_ticker_info_0".equals(tag)) {
                    return new C49688utK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_swap_depth_ticker_info is invalid. Received: " + tag);
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
        if (str == null || (num = Activity.AEQbTJ.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return StateListAnimator.KWHzl.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.tradeuilib.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class StateListAnimator {
        public static final SparseArray<String> KWHzl;

        private StateListAnimator() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(15);
            KWHzl = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "content");
            sparseArray.put(3, "dataHolder");
            sparseArray.put(4, "isGone");
            sparseArray.put(5, "itemData");
            sparseArray.put(6, "leftButton");
            sparseArray.put(7, "model");
            sparseArray.put(8, "rightButton");
            sparseArray.put(9, "showCloseButton");
            sparseArray.put(10, "show_underline");
            sparseArray.put(11, "singelButton");
            sparseArray.put(12, "title");
            sparseArray.put(13, "titleleftContent");
            sparseArray.put(14, "viewModel");
        }
    }

    public static class Activity {
        public static final HashMap<String, Integer> AEQbTJ;

        private Activity() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(7);
            AEQbTJ = map;
            map.put("layout/trade_ui_dialog_futures_ticker_info_explain_0", Integer.valueOf(C49720utq.ActionBar.AEQbTJ));
            map.put("layout/view_depth_ticker_info_0", Integer.valueOf(C49720utq.ActionBar.OLrzqt));
            map.put("layout/view_depth_ticker_info_future_new_item_0", Integer.valueOf(C49720utq.ActionBar.EZpvd));
            map.put("layout/view_depth_ticker_info_item_0", Integer.valueOf(C49720utq.ActionBar.copydefault));
            map.put("layout/view_depth_ticker_info_swap_new_item_0", Integer.valueOf(C49720utq.ActionBar.KWHzl));
            map.put("layout/view_futures_depth_ticker_info_0", Integer.valueOf(C49720utq.ActionBar.djBIcL));
            map.put("layout/view_swap_depth_ticker_info_0", Integer.valueOf(C49720utq.ActionBar.AYXKKw));
        }
    }
}
