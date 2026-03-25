package com.okinc.online_service.wallet;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    public static final SparseIntArray OLrzqt = new SparseIntArray(0);

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (OLrzqt.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || OLrzqt.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = Activity.AEQbTJ.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return Application.EZpvd.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.okinc.core.DataBinderMapperImpl());
        arrayList.add(new com.okinc.debugbox.DataBinderMapperImpl());
        arrayList.add(new com.okinc.deprecatedui.DataBinderMapperImpl());
        arrayList.add(new com.okinc.okuser.DataBinderMapperImpl());
        arrayList.add(new com.okinc.online_service.DataBinderMapperImpl());
        arrayList.add(new com.okinc.uilab.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class Application {
        public static final SparseArray<String> EZpvd;

        private Application() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(33);
            EZpvd = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionBarOverlay");
            sparseArray.put(2, "appBarTitle");
            sparseArray.put(3, "bannerDescription");
            sparseArray.put(4, "dataHolder");
            sparseArray.put(5, "description");
            sparseArray.put(6, "descriptionLabel");
            sparseArray.put(7, "feedbackSlogan");
            sparseArray.put(8, "fileCountSlogan");
            sparseArray.put(9, "fileExtension");
            sparseArray.put(10, "fileName");
            sparseArray.put(11, "fileSize");
            sparseArray.put(12, TtmlNode.TAG_IMAGE);
            sparseArray.put(13, "isAcceptAgreement");
            sparseArray.put(14, "isBannerVisible");
            sparseArray.put(15, "isFeedbackSectionVisible");
            sparseArray.put(16, "isFileCountVisible");
            sparseArray.put(17, "isSubmitButtonEnabled");
            sparseArray.put(18, "item");
            sparseArray.put(19, "itemData");
            sparseArray.put(20, "learnMoreSlogan");
            sparseArray.put(21, "leftButton");
            sparseArray.put(22, "reportSlogan");
            sparseArray.put(23, "rightButton");
            sparseArray.put(24, "showCloseButton");
            sparseArray.put(25, "singelButton");
            sparseArray.put(26, "subject");
            sparseArray.put(27, "subjectLabel");
            sparseArray.put(28, "text");
            sparseArray.put(29, "title");
            sparseArray.put(30, "translation");
            sparseArray.put(31, "uploadFileImage");
            sparseArray.put(32, "uploadFileSlogan");
        }
    }

    public static class Activity {
        public static final HashMap<String, Integer> AEQbTJ = new HashMap<>(0);

        private Activity() {
        }
    }
}
