package com.okinc.core.ok_app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C33160mrH;
import o.C33298mtn;
import o.C33300mtp;
import o.C33306mtv;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        copydefault = sparseIntArray;
        sparseIntArray.put(C33160mrH.Application.copydefault, 1);
        sparseIntArray.put(C33160mrH.Application.valueOf, 2);
        sparseIntArray.put(C33160mrH.Application.values, 3);
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
            if ("layout/activity_mode_switch_0".equals(tag)) {
                return new C33298mtn(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for activity_mode_switch is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/mode_change_common_toolbar_0".equals(tag)) {
                return new C33300mtp(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for mode_change_common_toolbar is invalid. Received: " + tag);
        }
        if (i2 != 3) {
            return null;
        }
        if ("layout/view_switch_mode_anim_0".equals(tag)) {
            return new C33306mtv(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for view_switch_mode_anim is invalid. Received: " + tag);
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
        return Application.copydefault.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class Application {
        public static final SparseArray<String> copydefault;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(9);
            copydefault = sparseArray;
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

    public static class ActionBar {
        public static final HashMap<String, Integer> OLrzqt;

        private ActionBar() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(3);
            OLrzqt = map;
            map.put("layout/activity_mode_switch_0", Integer.valueOf(C33160mrH.Application.copydefault));
            map.put("layout/mode_change_common_toolbar_0", Integer.valueOf(C33160mrH.Application.valueOf));
            map.put("layout/view_switch_mode_anim_0", Integer.valueOf(C33160mrH.Application.values));
        }
    }
}
