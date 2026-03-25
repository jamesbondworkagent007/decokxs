package com.okinc.mln_ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C43084ric;
import o.C43097rip;
import o.C43100ris;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        copydefault = sparseIntArray;
        sparseIntArray.put(C43084ric.Application.copydefault, 1);
        sparseIntArray.put(C43084ric.Application.EZpvd, 2);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = copydefault.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/activity_mln_debug_box_0".equals(tag)) {
                return new C43097rip(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for activity_mln_debug_box is invalid. Received: " + tag);
        }
        if (i2 != 2) {
            return null;
        }
        if ("layout/item_test_packet_0".equals(tag)) {
            return new C43100ris(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for item_test_packet is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || copydefault.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = ActionBar.OLrzqt.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return StateListAnimator.EZpvd.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class StateListAnimator {
        public static final SparseArray<String> EZpvd;

        private StateListAnimator() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(10);
            EZpvd = sparseArray;
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

    public static class ActionBar {
        public static final HashMap<String, Integer> OLrzqt;

        private ActionBar() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(2);
            OLrzqt = map;
            map.put("layout/activity_mln_debug_box_0", Integer.valueOf(C43084ric.Application.copydefault));
            map.put("layout/item_test_packet_0", Integer.valueOf(C43084ric.Application.EZpvd));
        }
    }
}
