package com.okinc.productmatrix.impl;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C48688uaR;
import o.C48689uaS;
import o.C48692uaV;
import o.C48693uaW;
import o.C48750uba;

/* JADX INFO: loaded from: classes11.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray AEQbTJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C48688uaR.TaskDescription.KWHzl, 1);
        sparseIntArray.put(C48688uaR.TaskDescription.AEQbTJ, 2);
        sparseIntArray.put(C48688uaR.TaskDescription.EZpvd, 3);
        sparseIntArray.put(C48688uaR.TaskDescription.OLrzqt, 4);
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
            if ("layout/fg_home_user_center_fun_0".equals(tag)) {
                return new C48689uaS(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for fg_home_user_center_fun is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/item_home_user_center_product_0".equals(tag)) {
                return new C48692uaV(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for item_home_user_center_product is invalid. Received: " + tag);
        }
        if (i2 == 3) {
            if ("layout/item_home_user_center_product_divide_0".equals(tag)) {
                return new C48750uba(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for item_home_user_center_product_divide is invalid. Received: " + tag);
        }
        if (i2 != 4) {
            return null;
        }
        if ("layout/item_home_user_center_product_title_0".equals(tag)) {
            return new C48693uaW(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for item_home_user_center_product_title is invalid. Received: " + tag);
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
        if (str == null || (num = Application.copydefault.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return Activity.OLrzqt.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class Activity {
        public static final SparseArray<String> OLrzqt;

        private Activity() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(12);
            OLrzqt = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "editable");
            sparseArray.put(4, "itemData");
            sparseArray.put(5, "leftButton");
            sparseArray.put(6, "rightButton");
            sparseArray.put(7, "selected");
            sparseArray.put(8, "showCloseButton");
            sparseArray.put(9, "simulator");
            sparseArray.put(10, "singelButton");
            sparseArray.put(11, "title");
        }
    }

    public static class Application {
        public static final HashMap<String, Integer> copydefault;

        private Application() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(4);
            copydefault = map;
            map.put("layout/fg_home_user_center_fun_0", Integer.valueOf(C48688uaR.TaskDescription.KWHzl));
            map.put("layout/item_home_user_center_product_0", Integer.valueOf(C48688uaR.TaskDescription.AEQbTJ));
            map.put("layout/item_home_user_center_product_divide_0", Integer.valueOf(C48688uaR.TaskDescription.EZpvd));
            map.put("layout/item_home_user_center_product_title_0", Integer.valueOf(C48688uaR.TaskDescription.OLrzqt));
        }
    }
}
