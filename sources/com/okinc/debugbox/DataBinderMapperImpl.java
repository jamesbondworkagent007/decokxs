package com.okinc.debugbox;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C31976mKx;
import o.C32034mNa;
import o.C32038mNe;
import o.C32040mNg;
import o.C32042mNi;
import o.C32045mNl;
import o.C32046mNm;
import o.C32048mNo;
import o.C32050mNq;
import o.mMU;
import o.mMX;
import o.mMZ;

/* JADX INFO: loaded from: classes8.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray KWHzl;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(11);
        KWHzl = sparseIntArray;
        sparseIntArray.put(C31976mKx.Application.AEQbTJ, 1);
        sparseIntArray.put(C31976mKx.Application.AYXKKw, 2);
        sparseIntArray.put(C31976mKx.Application.AhwBna, 3);
        sparseIntArray.put(C31976mKx.Application.AkhnZx, 4);
        sparseIntArray.put(C31976mKx.Application.AxsJAY, 5);
        sparseIntArray.put(C31976mKx.Application.zuBGHE, 6);
        sparseIntArray.put(C31976mKx.Application.DTwDnp, 7);
        sparseIntArray.put(C31976mKx.Application.QKVWgx, 8);
        sparseIntArray.put(C31976mKx.Application.OcIXYQ, 9);
        sparseIntArray.put(C31976mKx.Application.QOLQEE, 10);
        sparseIntArray.put(C31976mKx.Application.ORxRYg, 11);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = KWHzl.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i2) {
            case 1:
                if ("layout/activity_debug_event_detail_0".equals(tag)) {
                    return new mMU(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_debug_event_detail is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_debug_import_doh_0".equals(tag)) {
                    return new mMX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_debug_import_doh is invalid. Received: " + tag);
            case 3:
                if ("layout/activity_debug_language_0".equals(tag)) {
                    return new C32034mNa(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_debug_language is invalid. Received: " + tag);
            case 4:
                if ("layout/activity_report_detail_0".equals(tag)) {
                    return new mMZ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_report_detail is invalid. Received: " + tag);
            case 5:
                if ("layout/view_doh_debug_info_0".equals(tag)) {
                    return new C32038mNe(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_doh_debug_info is invalid. Received: " + tag);
            case 6:
                if ("layout/view_doh_info_0".equals(tag)) {
                    return new C32040mNg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_doh_info is invalid. Received: " + tag);
            case 7:
                if ("layout/view_doh_info_item_0".equals(tag)) {
                    return new C32042mNi(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_doh_info_item is invalid. Received: " + tag);
            case 8:
                if ("layout/view_doh_input_0".equals(tag)) {
                    return new C32045mNl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_doh_input is invalid. Received: " + tag);
            case 9:
                if ("layout/view_net_diagnosis_dialog_0".equals(tag)) {
                    return new C32046mNm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_net_diagnosis_dialog is invalid. Received: " + tag);
            case 10:
                if ("layout/view_track_monitor_0".equals(tag)) {
                    return new C32050mNq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_track_monitor is invalid. Received: " + tag);
            case 11:
                if ("layout/view_track_report_0".equals(tag)) {
                    return new C32048mNo(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for view_track_report is invalid. Received: " + tag);
            default:
                return null;
        }
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
        if (str == null || (num = Activity.EZpvd.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return TaskDescription.KWHzl.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class TaskDescription {
        public static final SparseArray<String> KWHzl;

        private TaskDescription() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(9);
            KWHzl = sparseArray;
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

    public static class Activity {
        public static final HashMap<String, Integer> EZpvd;

        private Activity() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(11);
            EZpvd = map;
            map.put("layout/activity_debug_event_detail_0", Integer.valueOf(C31976mKx.Application.AEQbTJ));
            map.put("layout/activity_debug_import_doh_0", Integer.valueOf(C31976mKx.Application.AYXKKw));
            map.put("layout/activity_debug_language_0", Integer.valueOf(C31976mKx.Application.AhwBna));
            map.put("layout/activity_report_detail_0", Integer.valueOf(C31976mKx.Application.AkhnZx));
            map.put("layout/view_doh_debug_info_0", Integer.valueOf(C31976mKx.Application.AxsJAY));
            map.put("layout/view_doh_info_0", Integer.valueOf(C31976mKx.Application.zuBGHE));
            map.put("layout/view_doh_info_item_0", Integer.valueOf(C31976mKx.Application.DTwDnp));
            map.put("layout/view_doh_input_0", Integer.valueOf(C31976mKx.Application.QKVWgx));
            map.put("layout/view_net_diagnosis_dialog_0", Integer.valueOf(C31976mKx.Application.OcIXYQ));
            map.put("layout/view_track_monitor_0", Integer.valueOf(C31976mKx.Application.QOLQEE));
            map.put("layout/view_track_report_0", Integer.valueOf(C31976mKx.Application.ORxRYg));
        }
    }
}
