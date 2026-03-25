package com.okinc.okex.lite.navigation;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C45716svX;
import o.C45755swa;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray AEQbTJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C45716svX.StateListAnimator.OLrzqt, 1);
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
        if (i2 != 1) {
            return null;
        }
        if ("layout/activity_uk_warning_ack_0".equals(tag)) {
            return new C45755swa(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for activity_uk_warning_ack is invalid. Received: " + tag);
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
        return Activity.KWHzl.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okim.api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class Activity {
        public static final SparseArray<String> KWHzl;

        private Activity() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(13);
            KWHzl = sparseArray;
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

    public static class Application {
        public static final HashMap<String, Integer> copydefault;

        private Application() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            copydefault = map;
            map.put("layout/activity_uk_warning_ack_0", Integer.valueOf(C45716svX.StateListAnimator.OLrzqt));
        }
    }
}
