package o;

import androidx.viewpager.widget.PagerAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class qLZ extends PagerAdapter {
    public java.util.ArrayList<android.view.View> AEQbTJ;
    public final android.content.Context EZpvd;

    public qLZ(@NotNull android.content.Context context, @NotNull java.util.ArrayList<android.view.View> arrayList) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.EZpvd = context;
        this.AEQbTJ = arrayList;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.AEQbTJ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NotNull android.view.View view, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return Intrinsics.EZpvd(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        viewGroup.addView(this.AEQbTJ.get(i));
        android.view.View view = this.AEQbTJ.get(i);
        Intrinsics.checkNotNullExpressionValue(view, "");
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull android.view.ViewGroup viewGroup, int i, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(obj, "");
        viewGroup.removeView(this.AEQbTJ.get(i));
    }
}
