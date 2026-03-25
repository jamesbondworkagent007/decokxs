package com.okinc.lifecycle.impl;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C38078pLk;
import o.C38079pLl;
import o.pKK;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray AEQbTJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(pKK.ActionBar.OLrzqt, 1);
        sparseIntArray.put(pKK.ActionBar.valueOf, 2);
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
            if ("layout/fg_lifecycle_recommend_0".equals(tag)) {
                return new C38079pLl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for fg_lifecycle_recommend is invalid. Received: " + tag);
        }
        if (i2 != 2) {
            return null;
        }
        if ("layout/item_lifecycle_recommend_0".equals(tag)) {
            return new C38078pLk(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for item_lifecycle_recommend is invalid. Received: " + tag);
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
        if (str == null || (num = StateListAnimator.EZpvd.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return ActionBar.KWHzl.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.cruilib.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class ActionBar {
        public static final SparseArray<String> KWHzl;

        private ActionBar() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(12);
            KWHzl = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "itemData");
            sparseArray.put(4, "leftButton");
            sparseArray.put(5, "message");
            sparseArray.put(6, "model");
            sparseArray.put(7, "rightButton");
            sparseArray.put(8, "showCloseButton");
            sparseArray.put(9, "singelButton");
            sparseArray.put(10, "title");
            sparseArray.put(11, "viewModel");
        }
    }

    public static class StateListAnimator {
        public static final HashMap<String, Integer> EZpvd;

        private StateListAnimator() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(2);
            EZpvd = map;
            map.put("layout/fg_lifecycle_recommend_0", Integer.valueOf(pKK.ActionBar.OLrzqt));
            map.put("layout/item_lifecycle_recommend_0", Integer.valueOf(pKK.ActionBar.valueOf));
        }
    }
}
