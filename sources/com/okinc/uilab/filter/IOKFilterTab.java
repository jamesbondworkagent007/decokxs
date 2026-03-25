package com.okinc.uilab.filter;

import android.content.Context;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public interface IOKFilterTab {
    OKFilterTabBean getBean();

    Context getContext();

    TabLayout.Tab getNewTab(@NotNull TabLayout tabLayout, int i);

    View getRootView();

    void setBean(@NotNull OKFilterTabBean oKFilterTabBean);

    void setTitle(@NotNull String str);

    void tabClickable(boolean z, TabLayout.Tab tab);

    void tabClicked(boolean z);

    public static final class Application {
        public static TabLayout.Tab KWHzl(@NotNull IOKFilterTab iOKFilterTab, @NotNull TabLayout tabLayout, int i) {
            Intrinsics.checkNotNullParameter(tabLayout, "");
            TabLayout.Tab customView = tabLayout.newTab().setCustomView(iOKFilterTab.getRootView());
            Intrinsics.checkNotNullExpressionValue(customView, "");
            customView.setTag(new Pair(iOKFilterTab, Integer.valueOf(i)));
            try {
                iOKFilterTab.tabClickable(iOKFilterTab.getBean().isClickable(), customView);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return customView;
        }
    }
}
