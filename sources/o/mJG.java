package o;

import androidx.viewpager.widget.PagerAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mJG extends PagerAdapter {
    public java.util.ArrayList<android.view.View> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        return i == 0 ? "https" : "ws";
    }

    public mJG(@NotNull java.util.ArrayList<android.view.View> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.EZpvd = arrayList;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NotNull android.view.View view, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return Intrinsics.EZpvd(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.EZpvd.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        viewGroup.addView(this.EZpvd.get(i));
        android.view.View view = this.EZpvd.get(i);
        Intrinsics.checkNotNullExpressionValue(view, "");
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull android.view.ViewGroup viewGroup, int i, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(obj, "");
        viewGroup.removeView(this.EZpvd.get(i));
    }
}
