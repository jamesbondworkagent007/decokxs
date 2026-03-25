package com.okinc.business.rewards;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C28102kOz;
import o.kOP;
import o.kOQ;

/* JADX INFO: loaded from: classes7.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray EZpvd;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        EZpvd = sparseIntArray;
        sparseIntArray.put(C28102kOz.Activity.AEQbTJ, 1);
        sparseIntArray.put(C28102kOz.Activity.EZpvd, 2);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = EZpvd.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/growth_tools_rich_section_layout_0".equals(tag)) {
                return new kOQ(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for growth_tools_rich_section_layout is invalid. Received: " + tag);
        }
        if (i2 != 2) {
            return null;
        }
        if ("layout/lexical_table_item_layout_0".equals(tag)) {
            return new kOP(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for lexical_table_item_layout is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || EZpvd.get(i) <= 0 || viewArr[0].getTag() != null) {
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
        return Application.OLrzqt.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(11);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okim.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class Application {
        public static final SparseArray<String> OLrzqt;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(13);
            OLrzqt = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "imageTypes");
            sparseArray.put(4, "item");
            sparseArray.put(5, "itemData");
            sparseArray.put(6, "label");
            sparseArray.put(7, "leftButton");
            sparseArray.put(8, "model");
            sparseArray.put(9, "rightButton");
            sparseArray.put(10, "showCloseButton");
            sparseArray.put(11, "singelButton");
            sparseArray.put(12, "title");
        }
    }

    public static class StateListAnimator {
        public static final HashMap<String, Integer> OLrzqt;

        private StateListAnimator() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(2);
            OLrzqt = map;
            map.put("layout/growth_tools_rich_section_layout_0", Integer.valueOf(C28102kOz.Activity.AEQbTJ));
            map.put("layout/lexical_table_item_layout_0", Integer.valueOf(C28102kOz.Activity.EZpvd));
        }
    }
}
