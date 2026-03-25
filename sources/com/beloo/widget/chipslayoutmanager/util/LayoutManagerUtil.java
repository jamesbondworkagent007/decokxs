package com.beloo.widget.chipslayoutmanager.util;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes21.dex */
public class LayoutManagerUtil {
    public static void requestLayoutWithAnimations(final RecyclerView.LayoutManager layoutManager) {
        layoutManager.postOnAnimation(new Runnable() { // from class: com.beloo.widget.chipslayoutmanager.util.LayoutManagerUtil.1
            @Override // java.lang.Runnable
            public void run() {
                layoutManager.requestLayout();
                layoutManager.requestSimpleAnimationsInNextLayout();
            }
        });
    }
}
