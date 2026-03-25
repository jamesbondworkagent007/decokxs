package com.okinc.okex.eop.liveness;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C45507srN;
import o.C45508srO;
import o.C45511srR;
import o.C45513srT;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray AEQbTJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C45508srO.Activity.AEQbTJ, 1);
        sparseIntArray.put(C45508srO.Activity.KWHzl, 2);
        sparseIntArray.put(C45508srO.Activity.EZpvd, 3);
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
            if ("layout/dialog_eop_face_guide_secure_tip_0".equals(tag)) {
                return new C45507srN(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for dialog_eop_face_guide_secure_tip is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/dialog_eop_selfie_learn_more_0".equals(tag)) {
                return new C45513srT(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for dialog_eop_selfie_learn_more is invalid. Received: " + tag);
        }
        if (i2 != 3) {
            return null;
        }
        if ("layout/fg_eop_face_guide_0".equals(tag)) {
            return new C45511srR(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for fg_eop_face_guide is invalid. Received: " + tag);
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
        if (str == null || (num = Application.KWHzl.get(str)) == null) {
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
        ArrayList arrayList = new ArrayList(9);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.amplifyframework.ui.liveness.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class Activity {
        public static final SparseArray<String> OLrzqt;

        private Activity() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(15);
            OLrzqt = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "imageTypes");
            sparseArray.put(4, "isCard");
            sparseArray.put(5, "isLast");
            sparseArray.put(6, "itemData");
            sparseArray.put(7, "label");
            sparseArray.put(8, "leftButton");
            sparseArray.put(9, "model");
            sparseArray.put(10, "rightButton");
            sparseArray.put(11, "showCloseButton");
            sparseArray.put(12, "singelButton");
            sparseArray.put(13, "title");
            sparseArray.put(14, "viewModel");
        }
    }

    public static class Application {
        public static final HashMap<String, Integer> KWHzl;

        private Application() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(3);
            KWHzl = map;
            map.put("layout/dialog_eop_face_guide_secure_tip_0", Integer.valueOf(C45508srO.Activity.AEQbTJ));
            map.put("layout/dialog_eop_selfie_learn_more_0", Integer.valueOf(C45508srO.Activity.KWHzl));
            map.put("layout/fg_eop_face_guide_0", Integer.valueOf(C45508srO.Activity.EZpvd));
        }
    }
}
