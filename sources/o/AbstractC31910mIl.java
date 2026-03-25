package o;

import androidx.databinding.ViewDataBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mIl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC31910mIl<T, B extends ViewDataBinding> extends AbstractC43310rmq<T, B> {
    public abstract mHV KWHzl(@NotNull B b);

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    public C43312rms<B> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingOLrzqt = super.onCreateViewHolder(layoutInflater, viewGroup).OLrzqt();
        Intrinsics.copydefault(viewDataBindingOLrzqt);
        return new C31901mIc(viewDataBindingOLrzqt, KWHzl(viewDataBindingOLrzqt));
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull C43312rms<B> c43312rms) {
        mHV mhvEZpvd;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        super.onViewRecycled(c43312rms);
        C31901mIc c31901mIc = c43312rms instanceof C31901mIc ? (C31901mIc) c43312rms : null;
        if (c31901mIc == null || (mhvEZpvd = c31901mIc.EZpvd()) == null) {
            return;
        }
        mhvEZpvd.AEQbTJ();
    }
}
