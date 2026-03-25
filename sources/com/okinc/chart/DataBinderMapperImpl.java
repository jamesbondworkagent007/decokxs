package com.okinc.chart;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C32391mcH;
import o.C32392mcI;
import o.C32396mcM;
import o.C32398mcO;

/* JADX INFO: loaded from: classes7.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray KWHzl;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        KWHzl = sparseIntArray;
        sparseIntArray.put(C32392mcI.StateListAnimator.EZpvd, 1);
        sparseIntArray.put(C32392mcI.StateListAnimator.KWHzl, 2);
        sparseIntArray.put(C32392mcI.StateListAnimator.copydefault, 3);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = KWHzl.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/layout_kline_tips_open_order_0".equals(tag)) {
                return new C32391mcH(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for layout_kline_tips_open_order is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/layout_kline_tips_spot_cost_0".equals(tag)) {
                return new C32396mcM(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for layout_kline_tips_spot_cost is invalid. Received: " + tag);
        }
        if (i2 != 3) {
            return null;
        }
        if ("layout/layout_kline_tips_trade_pos_0".equals(tag)) {
            return new C32398mcO(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for layout_kline_tips_trade_pos is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || KWHzl.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = ActionBar.KWHzl.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return Activity.KWHzl.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class Activity {
        public static final SparseArray<String> KWHzl;

        private Activity() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(8);
            KWHzl = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "dataHolder");
            sparseArray.put(2, "itemData");
            sparseArray.put(3, "leftButton");
            sparseArray.put(4, "rightButton");
            sparseArray.put(5, "showCloseButton");
            sparseArray.put(6, "singelButton");
            sparseArray.put(7, "title");
        }
    }

    public static class ActionBar {
        public static final HashMap<String, Integer> KWHzl;

        private ActionBar() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(3);
            KWHzl = map;
            map.put("layout/layout_kline_tips_open_order_0", Integer.valueOf(C32392mcI.StateListAnimator.EZpvd));
            map.put("layout/layout_kline_tips_spot_cost_0", Integer.valueOf(C32392mcI.StateListAnimator.KWHzl));
            map.put("layout/layout_kline_tips_trade_pos_0", Integer.valueOf(C32392mcI.StateListAnimator.copydefault));
        }
    }
}
