package com.okinc.web3Uilib;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C57368yhB;
import o.C57378yhL;
import o.C57380yhN;
import o.C57406yhn;
import o.C57413yhu;

/* JADX INFO: loaded from: classes12.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray OLrzqt;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C57406yhn.TaskDescription.copydefault, 1);
        sparseIntArray.put(C57406yhn.TaskDescription.valueOf, 2);
        sparseIntArray.put(C57406yhn.TaskDescription.hDKMBd, 3);
        sparseIntArray.put(C57406yhn.TaskDescription.wlaJM, 4);
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
        if (i2 == 1) {
            if ("layout/fragment_safe_related_risk_tip_0".equals(tag)) {
                return new C57413yhu(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for fragment_safe_related_risk_tip is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/item_multi_transaction_detail_0".equals(tag)) {
                return new C57368yhB(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for item_multi_transaction_detail is invalid. Received: " + tag);
        }
        if (i2 == 3) {
            if ("layout/layout_web3_transaction_detail_data_0".equals(tag)) {
                return new C57378yhL(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for layout_web3_transaction_detail_data is invalid. Received: " + tag);
        }
        if (i2 != 4) {
            return null;
        }
        if ("layout/layout_web3_transaction_network_fee_view_0".equals(tag)) {
            return new C57380yhN(dataBindingComponent, new View[]{view});
        }
        throw new IllegalArgumentException("The tag for layout_web3_transaction_network_fee_view is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr == null || viewArr.length == 0 || (i2 = OLrzqt.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 4) {
            return null;
        }
        if ("layout/layout_web3_transaction_network_fee_view_0".equals(tag)) {
            return new C57380yhN(dataBindingComponent, viewArr);
        }
        throw new IllegalArgumentException("The tag for layout_web3_transaction_network_fee_view is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = TaskDescription.copydefault.get(str)) == null) {
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
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class Application {
        public static final SparseArray<String> OLrzqt;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(8);
            OLrzqt = sparseArray;
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

    public static class TaskDescription {
        public static final HashMap<String, Integer> copydefault;

        private TaskDescription() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(4);
            copydefault = map;
            map.put("layout/fragment_safe_related_risk_tip_0", Integer.valueOf(C57406yhn.TaskDescription.copydefault));
            map.put("layout/item_multi_transaction_detail_0", Integer.valueOf(C57406yhn.TaskDescription.valueOf));
            map.put("layout/layout_web3_transaction_detail_data_0", Integer.valueOf(C57406yhn.TaskDescription.hDKMBd));
            map.put("layout/layout_web3_transaction_network_fee_view_0", Integer.valueOf(C57406yhn.TaskDescription.wlaJM));
        }
    }
}
