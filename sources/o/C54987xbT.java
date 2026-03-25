package o;

import com.google.android.material.tabs.TabLayout;
import com.okinc.uilab.filter.FilterChip;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C54987xbT implements FilterChip {
    public int EZpvd;
    public android.content.Context KWHzl;
    public TabLayout.Tab OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.uilab.filter.FilterChip
    public TabLayout.Tab getTab() {
        return this.OLrzqt;
    }

    public C54987xbT(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xbU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54987xbT.KWHzl(this.EZpvd);
            }
        });
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public void setChipDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        FilterChip.TaskDescription.EZpvd(this, drawable, drawable2, drawable3, drawable4);
    }

    private final C54984xbQ OLrzqt() {
        return (C54984xbQ) this.copydefault.getValue();
    }

    public static final C54984xbQ KWHzl(C54987xbT c54987xbT) {
        return new C54984xbQ(c54987xbT.KWHzl, null, 0, 6, null);
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public void setSelected(boolean z) {
        OLrzqt().setSelected(z);
        TabLayout.Tab tab = this.OLrzqt;
        if (tab != null) {
            tab.view.setSelected(z);
        }
        OLrzqt().setSelectedStyle(z, this.EZpvd);
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public void setEnabled(boolean z) {
        OLrzqt().setEnabled(z);
        TabLayout.Tab tab = this.OLrzqt;
        if (tab != null) {
            tab.view.setEnabled(z);
        }
        OLrzqt().setEnabledStyle(z, this.EZpvd);
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        OLrzqt().setTitle(charSequence);
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public boolean isEnabled() {
        return OLrzqt().isEnabled();
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public boolean isSelected() {
        return OLrzqt().isSelected();
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public android.view.View getRootView() {
        return OLrzqt();
    }

    /* JADX DEBUG: Method merged with bridge method: getTitleView()Landroid/widget/TextView; */
    @Override // com.okinc.uilab.filter.FilterChip
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C54984xbQ getTitleView() {
        return OLrzqt().AEQbTJ();
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public android.widget.ImageView getIcon() {
        return OLrzqt().EZpvd();
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public android.widget.ImageView getMenuIcon() {
        return new android.widget.ImageView(this.KWHzl);
    }

    @Override // com.okinc.uilab.filter.FilterChip
    public TabLayout.Tab getNewTab(@NotNull TabLayout tabLayout, int i) {
        Intrinsics.checkNotNullParameter(tabLayout, "");
        TabLayout.Tab tabEZpvd = FilterChip.TaskDescription.EZpvd(this, tabLayout, i);
        this.OLrzqt = tabEZpvd;
        return tabEZpvd;
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        OLrzqt().setOKDSSize(i);
    }
}
