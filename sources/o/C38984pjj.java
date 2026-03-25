package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pjj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38984pjj extends AbstractC33000moG {
    public java.util.ArrayList<androidx.fragment.app.Fragment> OLrzqt;
    public java.util.ArrayList<java.lang.String> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38984pjj(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.ArrayList<androidx.fragment.app.Fragment> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.OLrzqt = arrayList;
        this.copydefault = arrayList2;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        androidx.fragment.app.Fragment fragment = this.OLrzqt.get(i);
        Intrinsics.checkNotNullExpressionValue(fragment, "");
        return fragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        java.util.ArrayList<java.lang.String> arrayList = this.copydefault;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        return null;
    }

    public final void KWHzl(@NotNull java.util.ArrayList<java.lang.String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.ArrayList<java.lang.String> arrayList2 = this.copydefault;
        if (arrayList2 != null) {
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            java.util.ArrayList<java.lang.String> arrayList3 = this.copydefault;
            if (arrayList3 != null) {
                arrayList3.addAll(arrayList);
            }
            notifyDataSetChanged();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        java.util.ArrayList<java.lang.String> arrayList = this.copydefault;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 3;
    }
}
