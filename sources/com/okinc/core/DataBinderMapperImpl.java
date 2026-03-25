package com.okinc.core;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C32982mnp;
import o.C33091mps;

/* JADX INFO: loaded from: classes7.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray EZpvd;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        EZpvd = sparseIntArray;
        sparseIntArray.put(C32982mnp.Activity.copydefault, 1);
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
        if (i2 != 1) {
            return null;
        }
        if ("layout/fragment_container_0".equals(tag)) {
            return new C33091mps(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for fragment_container is invalid. Received: " + tag);
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
        if (str == null || (num = StateListAnimator.AEQbTJ.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return Application.EZpvd.get(i);
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
    public static class Application {
        public static final SparseArray<String> EZpvd;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(9);
            EZpvd = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "itemData");
            sparseArray.put(4, "leftButton");
            sparseArray.put(5, "rightButton");
            sparseArray.put(6, "showCloseButton");
            sparseArray.put(7, "singelButton");
            sparseArray.put(8, "title");
        }
    }

    public static class StateListAnimator {
        public static final HashMap<String, Integer> AEQbTJ;

        private StateListAnimator() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            AEQbTJ = map;
            map.put("layout/fragment_container_0", Integer.valueOf(C32982mnp.Activity.copydefault));
        }
    }
}
