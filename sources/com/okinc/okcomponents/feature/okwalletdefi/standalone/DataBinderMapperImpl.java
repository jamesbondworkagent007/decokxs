package com.okinc.okcomponents.feature.okwalletdefi.standalone;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray KWHzl = new SparseIntArray(0);

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (KWHzl.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
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
        if (str == null || (num = TaskDescription.OLrzqt.get(str)) == null) {
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
        ArrayList arrayList = new ArrayList(14);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.business.defi.wallet.DataBinderMapperImpl());
        arrayList.add(new com.okinc.business.defi.wallet.flavor.DataBinderMapperImpl());
        arrayList.add(new com.okinc.chart.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.featurerestriction.DataBinderMapperImpl());
        arrayList.add(new com.okinc.ok_kyc_core_api.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.preference.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilib.gallery.DataBinderMapperImpl());
        arrayList.add(new com.okinc.web3Uilib.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class Application {
        public static final SparseArray<String> OLrzqt;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(29);
            OLrzqt = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "addressFormatCheck");
            sparseArray.put(3, "addressStrRes");
            sparseArray.put(4, "addressUtils");
            sparseArray.put(5, "baseData");
            sparseArray.put(6, "coinBean");
            sparseArray.put(7, "dataHolder");
            sparseArray.put(8, "divider");
            sparseArray.put(9, EopTrackEvent.KEY_ENTRANCE);
            sparseArray.put(10, "faqItem");
            sparseArray.put(11, "hiddenBean");
            sparseArray.put(12, "imageTypes");
            sparseArray.put(13, "isChecked");
            sparseArray.put(14, "item");
            sparseArray.put(15, "itemData");
            sparseArray.put(16, "keystoneAccountInfo");
            sparseArray.put(17, "label");
            sparseArray.put(18, "leftButton");
            sparseArray.put(19, "model");
            sparseArray.put(20, "privateKeyInfo");
            sparseArray.put(21, "rightButton");
            sparseArray.put(22, "selectCoinTitle");
            sparseArray.put(23, "showCloseButton");
            sparseArray.put(24, "singelButton");
            sparseArray.put(25, "title");
            sparseArray.put(26, "totalValueStrRes");
            sparseArray.put(27, "txPendingData");
            sparseArray.put(28, "viewModel");
        }
    }

    public static class TaskDescription {
        public static final HashMap<String, Integer> OLrzqt = new HashMap<>(0);

        private TaskDescription() {
        }
    }
}
