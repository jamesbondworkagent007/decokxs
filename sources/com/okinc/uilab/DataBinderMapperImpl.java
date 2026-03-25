package com.okinc.uilab;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C52761wXj;
import o.C54931xaQ;
import o.C54941xaa;
import o.wZK;
import o.wZO;
import o.wZR;
import o.wZU;
import o.wZV;

/* JADX INFO: loaded from: classes11.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray EZpvd;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        EZpvd = sparseIntArray;
        sparseIntArray.put(C52761wXj.Fragment.KWHzl, 1);
        sparseIntArray.put(C52761wXj.Fragment.valueOf, 2);
        sparseIntArray.put(C52761wXj.Fragment.AhwBna, 3);
        sparseIntArray.put(C52761wXj.Fragment.values, 4);
        sparseIntArray.put(C52761wXj.Fragment.isConnected, 5);
        sparseIntArray.put(C52761wXj.Fragment.AuCTel, 6);
        sparseIntArray.put(C52761wXj.Fragment.QSBOWP, 7);
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
        switch (i2) {
            case 1:
                if ("layout/item_multiple_toast_state_0".equals(tag)) {
                    return new wZK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_multiple_toast_state is invalid. Received: " + tag);
            case 2:
                if ("layout/layout_disclaimer_sheet_0".equals(tag)) {
                    return new wZO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_disclaimer_sheet is invalid. Received: " + tag);
            case 3:
                if ("layout/ok_uilib_filter_drop_down_default_search_item_layout_0".equals(tag)) {
                    return new wZR(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ok_uilib_filter_drop_down_default_search_item_layout is invalid. Received: " + tag);
            case 4:
                if ("layout/ok_uilib_filter_drop_down_search_empty_layout_0".equals(tag)) {
                    return new wZU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ok_uilib_filter_drop_down_search_empty_layout is invalid. Received: " + tag);
            case 5:
                if ("layout/ok_uilib_filter_dropdown_rcy_item_0".equals(tag)) {
                    return new wZV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ok_uilib_filter_dropdown_rcy_item is invalid. Received: " + tag);
            case 6:
                if ("layout/uilib_bottom_sheet_image_picker_0".equals(tag)) {
                    return new C54941xaa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for uilib_bottom_sheet_image_picker is invalid. Received: " + tag);
            case 7:
                if ("layout/view_thumb_tab_layout_0".equals(tag)) {
                    return new C54931xaQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_thumb_tab_layout is invalid. Received: " + tag);
            default:
                return null;
        }
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
        if (str == null || (num = ActionBar.AEQbTJ.get(str)) == null) {
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
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class Application {
        public static final SparseArray<String> OLrzqt;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            OLrzqt = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class ActionBar {
        public static final HashMap<String, Integer> AEQbTJ;

        private ActionBar() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(7);
            AEQbTJ = map;
            map.put("layout/item_multiple_toast_state_0", Integer.valueOf(C52761wXj.Fragment.KWHzl));
            map.put("layout/layout_disclaimer_sheet_0", Integer.valueOf(C52761wXj.Fragment.valueOf));
            map.put("layout/ok_uilib_filter_drop_down_default_search_item_layout_0", Integer.valueOf(C52761wXj.Fragment.AhwBna));
            map.put("layout/ok_uilib_filter_drop_down_search_empty_layout_0", Integer.valueOf(C52761wXj.Fragment.values));
            map.put("layout/ok_uilib_filter_dropdown_rcy_item_0", Integer.valueOf(C52761wXj.Fragment.isConnected));
            map.put("layout/uilib_bottom_sheet_image_picker_0", Integer.valueOf(C52761wXj.Fragment.AuCTel));
            map.put("layout/view_thumb_tab_layout_0", Integer.valueOf(C52761wXj.Fragment.QSBOWP));
        }
    }
}
