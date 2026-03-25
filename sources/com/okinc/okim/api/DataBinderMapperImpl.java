package com.okinc.okim.api;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C44105sDn;
import o.C44110sDs;
import o.C44114sDw;
import o.C44116sDy;
import o.sDB;
import o.sDC;
import o.sDF;
import o.sDH;
import o.sDJ;
import o.sDL;
import o.sDQ;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        copydefault = sparseIntArray;
        sparseIntArray.put(C44105sDn.StateListAnimator.EZpvd, 1);
        sparseIntArray.put(C44105sDn.StateListAnimator.KWHzl, 2);
        sparseIntArray.put(C44105sDn.StateListAnimator.copydefault, 3);
        sparseIntArray.put(C44105sDn.StateListAnimator.OLrzqt, 4);
        sparseIntArray.put(C44105sDn.StateListAnimator.valueOf, 5);
        sparseIntArray.put(C44105sDn.StateListAnimator.AYXKKw, 6);
        sparseIntArray.put(C44105sDn.StateListAnimator.AhwBna, 7);
        sparseIntArray.put(C44105sDn.StateListAnimator.gEmmrt, 8);
        sparseIntArray.put(C44105sDn.StateListAnimator.djBIcL, 9);
        sparseIntArray.put(C44105sDn.StateListAnimator.DbNXlk, 10);
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
                if ("layout/item_im_base_receive_message_0".equals(tag)) {
                    return new C44114sDw(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_base_receive_message is invalid. Received: " + tag);
            case 2:
                if ("layout/item_im_base_send_message_0".equals(tag)) {
                    return new C44110sDs(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_base_send_message is invalid. Received: " + tag);
            case 3:
                if ("layout/item_im_text_og_web_url_0".equals(tag)) {
                    return new C44116sDy(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_text_og_web_url is invalid. Received: " + tag);
            case 4:
                if ("layout/item_im_text_receive_message_0".equals(tag)) {
                    return new sDB(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_text_receive_message is invalid. Received: " + tag);
            case 5:
                if ("layout/item_im_text_send_message_0".equals(tag)) {
                    return new sDC(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_im_text_send_message is invalid. Received: " + tag);
            case 6:
                if ("layout/item_receive_reference_container_0".equals(tag)) {
                    return new sDF(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_receive_reference_container is invalid. Received: " + tag);
            case 7:
                if ("layout/item_send_reference_container_0".equals(tag)) {
                    return new sDJ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_send_reference_container is invalid. Received: " + tag);
            case 8:
                if ("layout/layout_reaction_container_0".equals(tag)) {
                    return new sDH(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_reaction_container is invalid. Received: " + tag);
            case 9:
                if ("layout/okim_common_reference_view_0".equals(tag)) {
                    return new sDL(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for okim_common_reference_view is invalid. Received: " + tag);
            case 10:
                if ("layout/rc_fr_photo_0".equals(tag)) {
                    return new sDQ(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for rc_fr_photo is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr == null || viewArr.length == 0 || (i2 = copydefault.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 9) {
            return null;
        }
        if ("layout/okim_common_reference_view_0".equals(tag)) {
            return new sDL(dataBindingComponent, viewArr);
        }
        throw new IllegalArgumentException("The tag for okim_common_reference_view is invalid. Received: " + tag);
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
        return ActionBar.EZpvd.get(i);
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
    public static class ActionBar {
        public static final SparseArray<String> EZpvd;

        private ActionBar() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(10);
            EZpvd = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "dataHolder");
            sparseArray.put(3, "item");
            sparseArray.put(4, "itemData");
            sparseArray.put(5, "leftButton");
            sparseArray.put(6, "rightButton");
            sparseArray.put(7, "showCloseButton");
            sparseArray.put(8, "singelButton");
            sparseArray.put(9, "title");
        }
    }

    public static class Application {
        public static final HashMap<String, Integer> AEQbTJ;

        private Application() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(10);
            AEQbTJ = map;
            map.put("layout/item_im_base_receive_message_0", Integer.valueOf(C44105sDn.StateListAnimator.EZpvd));
            map.put("layout/item_im_base_send_message_0", Integer.valueOf(C44105sDn.StateListAnimator.KWHzl));
            map.put("layout/item_im_text_og_web_url_0", Integer.valueOf(C44105sDn.StateListAnimator.copydefault));
            map.put("layout/item_im_text_receive_message_0", Integer.valueOf(C44105sDn.StateListAnimator.OLrzqt));
            map.put("layout/item_im_text_send_message_0", Integer.valueOf(C44105sDn.StateListAnimator.valueOf));
            map.put("layout/item_receive_reference_container_0", Integer.valueOf(C44105sDn.StateListAnimator.AYXKKw));
            map.put("layout/item_send_reference_container_0", Integer.valueOf(C44105sDn.StateListAnimator.AhwBna));
            map.put("layout/layout_reaction_container_0", Integer.valueOf(C44105sDn.StateListAnimator.gEmmrt));
            map.put("layout/okim_common_reference_view_0", Integer.valueOf(C44105sDn.StateListAnimator.djBIcL));
            map.put("layout/rc_fr_photo_0", Integer.valueOf(C44105sDn.StateListAnimator.DbNXlk));
        }
    }
}
