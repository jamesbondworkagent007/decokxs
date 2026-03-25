package com.okinc.uilab.filter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.tabs.TabLayout;
import com.okinc.uilab.filter.IOKFilterTab;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.wZW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class OKFilterDefaultTab implements IOKFilterTab {
    public static final int $stable = 8;
    private OKFilterTabBean bean;
    private final wZW binding;
    private final Context context;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.uilab.filter.IOKFilterTab
    public OKFilterTabBean getBean() {
        return this.bean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.uilab.filter.IOKFilterTab
    public Context getContext() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.uilab.filter.IOKFilterTab
    public void setBean(@NotNull OKFilterTabBean oKFilterTabBean) {
        Intrinsics.checkNotNullParameter(oKFilterTabBean, "");
        this.bean = oKFilterTabBean;
    }

    @Override // com.okinc.uilab.filter.IOKFilterTab
    public TabLayout.Tab getNewTab(@NotNull TabLayout tabLayout, int i) {
        return IOKFilterTab.Application.KWHzl(this, tabLayout, i);
    }

    public OKFilterDefaultTab(@NotNull Context context, @NotNull OKFilterTabBean oKFilterTabBean) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKFilterTabBean, "");
        this.context = context;
        this.bean = oKFilterTabBean;
        wZW wzwOLrzqt = wZW.OLrzqt(LayoutInflater.from(getContext()), null, false);
        Intrinsics.checkNotNullExpressionValue(wzwOLrzqt, "");
        this.binding = wzwOLrzqt;
    }

    @Override // com.okinc.uilab.filter.IOKFilterTab
    public void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.binding.copydefault.setText(str);
    }

    @Override // com.okinc.uilab.filter.IOKFilterTab
    public void tabClicked(boolean z) {
        if (getBean().isClickable()) {
            getBean().setClicked(z);
            ImageView imageView = this.binding.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            rotateArrow(imageView, z);
        }
    }

    @Override // com.okinc.uilab.filter.IOKFilterTab
    public void tabClickable(boolean z, TabLayout.Tab tab) {
        TabLayout.TabView tabView;
        if (tab != null && (tabView = tab.view) != null) {
            tabView.setClickable(z);
        }
        this.binding.OLrzqt.setEnabled(z);
        if (!getBean().isClickable()) {
            this.binding.copydefault.setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.Dff));
        } else {
            this.binding.copydefault.setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.DeEinT));
        }
        if (getBean().isClicked()) {
            ImageView imageView = this.binding.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            rotateArrow(imageView, false);
        }
    }

    @Override // com.okinc.uilab.filter.IOKFilterTab
    public View getRootView() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    private final void rotateArrow(ImageView imageView, boolean z) {
        float f;
        float width = imageView.getWidth() / 2.0f;
        float height = imageView.getHeight() / 2.0f;
        float f2 = 180.0f;
        if (z) {
            f2 = 0.0f;
            f = 180.0f;
        } else {
            f = 360.0f;
        }
        RotateAnimation rotateAnimation = new RotateAnimation(f2, f, width, height);
        rotateAnimation.setDuration(1L);
        rotateAnimation.setFillAfter(true);
        imageView.startAnimation(rotateAnimation);
    }
}
