package o;

import com.google.android.material.tabs.TabLayout;
import com.okinc.uilab.filter.FilterChip;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C54993xbZ implements FilterChip {
    public final InterfaceC56387yDm EZpvd;
    public TabLayout.Tab KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.uilab.filter.FilterChip
    public TabLayout.Tab getTab() {
        return this.KWHzl;
    }

    public C54993xbZ(@NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xcb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54993xbZ.copydefault(context);
            }
        });
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public void setChipDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        FilterChip.TaskDescription.EZpvd(this, drawable, drawable2, drawable3, drawable4);
    }

    public final C55052xcf KWHzl() {
        return (C55052xcf) this.EZpvd.getValue();
    }

    public static final C55052xcf copydefault(android.content.Context context) {
        return new C55052xcf(context, null, 2, null);
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public void setSelected(boolean z) {
        KWHzl().setSelected(z, false);
        TabLayout.Tab tab = this.KWHzl;
        if (tab != null) {
            tab.view.setSelected(z);
        }
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public void setEnabled(boolean z) {
        KWHzl().setEnabled(z);
        TabLayout.Tab tab = this.KWHzl;
        if (tab != null) {
            tab.view.setEnabled(z);
        }
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        KWHzl().setTitle(charSequence);
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public boolean isEnabled() {
        return KWHzl().isEnabled();
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public boolean isSelected() {
        return KWHzl().isSelected();
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public android.view.View getRootView() {
        return KWHzl();
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public android.widget.TextView getTitleView() {
        return KWHzl().copydefault();
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public android.widget.ImageView getIcon() {
        return KWHzl().EZpvd();
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public android.widget.ImageView getMenuIcon() {
        return KWHzl().AEQbTJ();
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public TabLayout.Tab getNewTab(@NotNull TabLayout tabLayout, int i) {
        Intrinsics.checkNotNullParameter(tabLayout, "");
        TabLayout.Tab tabEZpvd = FilterChip.TaskDescription.EZpvd(this, tabLayout, i);
        this.KWHzl = tabEZpvd;
        return tabEZpvd;
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        KWHzl().setOKDSSize(i);
    }
}
