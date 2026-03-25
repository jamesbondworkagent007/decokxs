package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41082qkB extends AbstractC33000moG {
    public java.util.ArrayList<java.lang.String> EZpvd;
    public java.util.List<? extends androidx.fragment.app.Fragment> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41082qkB(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.util.List<? extends androidx.fragment.app.Fragment> list) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = arrayList;
        this.OLrzqt = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.EZpvd.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        return this.EZpvd.get(i);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        return this.OLrzqt.get(i);
    }
}
