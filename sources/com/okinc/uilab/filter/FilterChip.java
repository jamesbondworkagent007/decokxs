package com.okinc.uilab.filter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.tabs.TabLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55298xhM;
import o.InterfaceC55066xct;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public interface FilterChip extends InterfaceC55066xct {
    ImageView getIcon();

    ImageView getMenuIcon();

    TabLayout.Tab getNewTab(@NotNull TabLayout tabLayout, int i);

    View getRootView();

    TabLayout.Tab getTab();

    TextView getTitleView();

    boolean isEnabled();

    boolean isSelected();

    void setChipDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4);

    void setEnabled(boolean z);

    void setSelected(boolean z);

    void setTitle(@NotNull CharSequence charSequence);

    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription {
        public static TabLayout.Tab EZpvd(@NotNull FilterChip filterChip, @NotNull TabLayout tabLayout, int i) {
            Intrinsics.checkNotNullParameter(tabLayout, "");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            TabLayout.Tab tabNewTab = tabLayout.newTab();
            Intrinsics.checkNotNullExpressionValue(tabNewTab, "");
            TabLayout.Tab customView = tabNewTab.setCustomView(filterChip.getRootView());
            Intrinsics.checkNotNullExpressionValue(customView, "");
            TabLayout.TabView tabView = tabNewTab.view;
            Drawable rippleDrawable = gradientDrawable;
            if (tabLayout.getTabRippleColor() != null) {
                ColorStateList colorStateListConvertToRippleDrawableColor = RippleUtils.convertToRippleDrawableColor(tabLayout.getTabRippleColor());
                GradientDrawable gradientDrawable2 = null;
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (tabLayout.hasUnboundedRipple()) {
                    gradientDrawable3 = null;
                }
                if (!tabLayout.hasUnboundedRipple()) {
                    gradientDrawable2 = new GradientDrawable();
                    Context context = tabLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    gradientDrawable2.setCornerRadius(C55298xhM.EZpvd(8.0f, context));
                    gradientDrawable2.setColor(ContextCompat.getColor(tabLayout.getContext(), C52761wXj.Activity.invokespecialDPHOMC));
                    Unit unit = Unit.INSTANCE;
                }
                rippleDrawable = new RippleDrawable(colorStateListConvertToRippleDrawableColor, gradientDrawable3, gradientDrawable2);
            }
            ViewCompat.setBackground(tabView, rippleDrawable);
            customView.setTag(new Pair(filterChip, Integer.valueOf(i)));
            return customView;
        }

        public static void EZpvd(@NotNull FilterChip filterChip, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            EZpvd(filterChip, drawable);
            EZpvd(filterChip, drawable2);
            EZpvd(filterChip, drawable3);
            EZpvd(filterChip, drawable4);
            filterChip.getTitleView().setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            filterChip.getTitleView().setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (Context) null, 1, (Object) null));
        }

        public static void EZpvd(FilterChip filterChip, Drawable drawable) {
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
        }
    }
}
