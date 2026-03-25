package com.okinc.share;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C48931uew;
import o.C48959ufX;
import o.C49021ugg;
import o.C49026ugl;
import o.C49027ugm;
import o.C49028ugn;
import o.C49031ugq;

/* JADX INFO: loaded from: classes11.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(6);
        copydefault = sparseIntArray;
        sparseIntArray.put(C48931uew.Application.copydefault, 1);
        sparseIntArray.put(C48931uew.Application.isConnected, 2);
        sparseIntArray.put(C48931uew.Application.fARcdN, 3);
        sparseIntArray.put(C48931uew.Application.fIwbmz, 4);
        sparseIntArray.put(C48931uew.Application.fJNWhG, 5);
        sparseIntArray.put(C48931uew.Application.AuCTel, 6);
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
        switch (i2) {
            case 1:
                if ("layout/ac_share_api_test_0".equals(tag)) {
                    return new C48959ufX(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for ac_share_api_test is invalid. Received: " + tag);
            case 2:
                if ("layout/fg_new_share_api_test_0".equals(tag)) {
                    return new C49021ugg(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fg_new_share_api_test is invalid. Received: " + tag);
            case 3:
                if ("layout/item_image_edit_menu_0".equals(tag)) {
                    return new C49028ugn(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_image_edit_menu is invalid. Received: " + tag);
            case 4:
                if ("layout/item_multi_shared_thumbnail_0".equals(tag)) {
                    return new C49027ugm(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_multi_shared_thumbnail is invalid. Received: " + tag);
            case 5:
                if ("layout/item_share_edit_entry_0".equals(tag)) {
                    return new C49026ugl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_share_edit_entry is invalid. Received: " + tag);
            case 6:
                if ("layout/item_share_social_platform_v2_0".equals(tag)) {
                    return new C49031ugq(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_share_social_platform_v2 is invalid. Received: " + tag);
            default:
                return null;
        }
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
        if (str == null || (num = ActionBar.KWHzl.get(str)) == null) {
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
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.immomo.mls.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.mln_ui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class Application {
        public static final SparseArray<String> OLrzqt;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(11);
            OLrzqt = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "item");
            sparseArray.put(4, "itemData");
            sparseArray.put(5, "leftButton");
            sparseArray.put(6, "model");
            sparseArray.put(7, "rightButton");
            sparseArray.put(8, "showCloseButton");
            sparseArray.put(9, "singelButton");
            sparseArray.put(10, "title");
        }
    }

    public static class ActionBar {
        public static final HashMap<String, Integer> KWHzl;

        private ActionBar() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(6);
            KWHzl = map;
            map.put("layout/ac_share_api_test_0", Integer.valueOf(C48931uew.Application.copydefault));
            map.put("layout/fg_new_share_api_test_0", Integer.valueOf(C48931uew.Application.isConnected));
            map.put("layout/item_image_edit_menu_0", Integer.valueOf(C48931uew.Application.fARcdN));
            map.put("layout/item_multi_shared_thumbnail_0", Integer.valueOf(C48931uew.Application.fIwbmz));
            map.put("layout/item_share_edit_entry_0", Integer.valueOf(C48931uew.Application.fJNWhG));
            map.put("layout/item_share_social_platform_v2_0", Integer.valueOf(C48931uew.Application.AuCTel));
        }
    }
}
