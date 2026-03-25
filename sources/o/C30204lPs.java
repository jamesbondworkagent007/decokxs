package o;

import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lPs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30204lPs extends AbstractC33000moG {
    public final java.lang.String[] EZpvd;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30204lPs(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractC32998moE abstractC32998moE) {
        super(fragmentManager, abstractC32998moE);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC32998moE, "");
        this.EZpvd = new java.lang.String[]{"buy_sell"};
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        return lOR.Companion.OLrzqt(this.EZpvd[i]);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        return i == 0 ? C33070mpX.AYXKKw(C31351lsQ.Activity.gdmIOq) : "";
    }
}
