package com.okinc.deprecatedui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C32113mPz;
import o.mPC;
import o.mPE;
import o.mPI;
import o.mPK;
import o.mPL;
import o.mPM;
import o.mPO;
import o.mPQ;
import o.mPU;
import o.mPV;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray AEQbTJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C32113mPz.Fragment.OLrzqt, 1);
        sparseIntArray.put(C32113mPz.Fragment.EZpvd, 2);
        sparseIntArray.put(C32113mPz.Fragment.AEQbTJ, 3);
        sparseIntArray.put(C32113mPz.Fragment.valueOf, 4);
        sparseIntArray.put(C32113mPz.Fragment.gEmmrt, 5);
        sparseIntArray.put(C32113mPz.Fragment.hDKMBd, 6);
        sparseIntArray.put(C32113mPz.Fragment.zLjUOn, 7);
        sparseIntArray.put(C32113mPz.Fragment.zsXlph, 8);
        sparseIntArray.put(C32113mPz.Fragment.zuBGHE, 9);
        sparseIntArray.put(C32113mPz.Fragment.QOLQEE, 10);
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
        switch (i2) {
            case 1:
                if ("layout/dfragment_ok_bottom_sheet_0".equals(tag)) {
                    return new mPI(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_ok_bottom_sheet is invalid. Received: " + tag);
            case 2:
                if ("layout/dfragment_ok_bottom_sheet2_0".equals(tag)) {
                    return new mPC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_ok_bottom_sheet2 is invalid. Received: " + tag);
            case 3:
                if ("layout/dfragment_okt_bottom_sheet_header_white_0".equals(tag)) {
                    return new mPE(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dfragment_okt_bottom_sheet_header_white is invalid. Received: " + tag);
            case 4:
                if ("layout/dialog_state_notification_0".equals(tag)) {
                    return new mPK(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for dialog_state_notification is invalid. Received: " + tag);
            case 5:
                if ("layout/fragment_bottom_sheet_header_0".equals(tag)) {
                    return new mPM(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_bottom_sheet_header is invalid. Received: " + tag);
            case 6:
                if ("layout/ok_dialog_0".equals(tag)) {
                    return new mPL(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ok_dialog is invalid. Received: " + tag);
            case 7:
                if ("layout/view_dynamic_selectview_0".equals(tag)) {
                    return new mPO(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_dynamic_selectview is invalid. Received: " + tag);
            case 8:
                if ("layout/view_dynamic_selectview_search_0".equals(tag)) {
                    return new mPQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_dynamic_selectview_search is invalid. Received: " + tag);
            case 9:
                if ("layout/widget_common_error_0".equals(tag)) {
                    return new mPV(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_common_error is invalid. Received: " + tag);
            case 10:
                if ("layout/widget_single_select_item_view_0".equals(tag)) {
                    return new mPU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_single_select_item_view is invalid. Received: " + tag);
            default:
                return null;
        }
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
        if (str == null || (num = Application.AEQbTJ.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return StateListAnimator.OLrzqt.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class StateListAnimator {
        public static final SparseArray<String> OLrzqt;

        private StateListAnimator() {
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

    public static class Application {
        public static final HashMap<String, Integer> AEQbTJ;

        private Application() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(10);
            AEQbTJ = map;
            map.put("layout/dfragment_ok_bottom_sheet_0", Integer.valueOf(C32113mPz.Fragment.OLrzqt));
            map.put("layout/dfragment_ok_bottom_sheet2_0", Integer.valueOf(C32113mPz.Fragment.EZpvd));
            map.put("layout/dfragment_okt_bottom_sheet_header_white_0", Integer.valueOf(C32113mPz.Fragment.AEQbTJ));
            map.put("layout/dialog_state_notification_0", Integer.valueOf(C32113mPz.Fragment.valueOf));
            map.put("layout/fragment_bottom_sheet_header_0", Integer.valueOf(C32113mPz.Fragment.gEmmrt));
            map.put("layout/ok_dialog_0", Integer.valueOf(C32113mPz.Fragment.hDKMBd));
            map.put("layout/view_dynamic_selectview_0", Integer.valueOf(C32113mPz.Fragment.zLjUOn));
            map.put("layout/view_dynamic_selectview_search_0", Integer.valueOf(C32113mPz.Fragment.zsXlph));
            map.put("layout/widget_common_error_0", Integer.valueOf(C32113mPz.Fragment.zuBGHE));
            map.put("layout/widget_single_select_item_view_0", Integer.valueOf(C32113mPz.Fragment.QOLQEE));
        }
    }
}
