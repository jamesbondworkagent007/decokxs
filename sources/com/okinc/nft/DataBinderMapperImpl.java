package com.okinc.nft;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C43433rpG;
import o.C43437rpK;
import o.C43439rpM;
import o.C43471rps;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray EZpvd;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        EZpvd = sparseIntArray;
        sparseIntArray.put(C43471rps.TaskDescription.copydefault, 1);
        sparseIntArray.put(C43471rps.TaskDescription.AYXKKw, 2);
        sparseIntArray.put(C43471rps.TaskDescription.gEmmrt, 3);
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
        if (i2 == 1) {
            if ("layout/layout_item_nft_add_media_0".equals(tag)) {
                return new C43433rpG(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for layout_item_nft_add_media is invalid. Received: " + tag);
        }
        if (i2 == 2) {
            if ("layout/layout_item_nft_audio_picker_0".equals(tag)) {
                return new C43437rpK(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for layout_item_nft_audio_picker is invalid. Received: " + tag);
        }
        if (i2 != 3) {
            return null;
        }
        if ("layout/layout_item_nft_imagevideo_picker_0".equals(tag)) {
            return new C43439rpM(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for layout_item_nft_imagevideo_picker is invalid. Received: " + tag);
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
        if (str == null || (num = Activity.KWHzl.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return Application.KWHzl.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.chart.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3Uilib.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class Application {
        public static final SparseArray<String> KWHzl;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(12);
            KWHzl = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "item");
            sparseArray.put(4, "itemData");
            sparseArray.put(5, "leftButton");
            sparseArray.put(6, "model");
            sparseArray.put(7, "privateKeyInfo");
            sparseArray.put(8, "rightButton");
            sparseArray.put(9, "showCloseButton");
            sparseArray.put(10, "singelButton");
            sparseArray.put(11, "title");
        }
    }

    public static class Activity {
        public static final HashMap<String, Integer> KWHzl;

        private Activity() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(3);
            KWHzl = map;
            map.put("layout/layout_item_nft_add_media_0", Integer.valueOf(C43471rps.TaskDescription.copydefault));
            map.put("layout/layout_item_nft_audio_picker_0", Integer.valueOf(C43471rps.TaskDescription.AYXKKw));
            map.put("layout/layout_item_nft_imagevideo_picker_0", Integer.valueOf(C43471rps.TaskDescription.gEmmrt));
        }
    }
}
