package o;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.C27869kGi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kIF extends AbstractC33000moG {
    public java.util.List<C27869kGi.ActionBar> KWHzl;
    public final android.util.ArrayMap<java.lang.String, WeakReference<androidx.fragment.app.Fragment>> OLrzqt;

    @Override // o.AbstractC33000moG
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C27869kGi.ActionBar> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.util.List<C27869kGi.ActionBar> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kIF(@NotNull java.util.List<C27869kGi.ActionBar> list, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.KWHzl = list;
        this.OLrzqt = new android.util.ArrayMap<>();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.KWHzl.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        return this.KWHzl.get(i).KWHzl();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        android.util.ArrayMap<java.lang.String, WeakReference<androidx.fragment.app.Fragment>> arrayMap = this.OLrzqt;
        java.lang.String strEZpvd = this.KWHzl.get(i).EZpvd();
        WeakReference<androidx.fragment.app.Fragment> weakReference = arrayMap.get(strEZpvd);
        if (weakReference == null) {
            weakReference = new WeakReference<>(kIH.Companion.AEQbTJ(this.KWHzl.get(i).EZpvd()));
            arrayMap.put(strEZpvd, weakReference);
        }
        androidx.fragment.app.Fragment fragment = weakReference.get();
        return fragment == null ? kIH.Companion.AEQbTJ(this.KWHzl.get(i).EZpvd()) : fragment;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public long getItemId(int i) {
        return this.KWHzl.get(i).EZpvd().hashCode();
    }

    @Override // o.AbstractC33000moG, androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return super.getItemPosition(obj);
    }
}
