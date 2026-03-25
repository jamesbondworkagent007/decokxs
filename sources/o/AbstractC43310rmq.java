package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.rmq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC43310rmq<T, B extends ViewDataBinding> extends AbstractC59533zio<T, C43312rms<B>> {
    public boolean fillItemLayout(int i) {
        return true;
    }

    public abstract int getItemLayoutId();

    public abstract int getVariableId();

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    public C43312rms<B> onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        int itemLayoutId = getItemLayoutId();
        if (!fillItemLayout(itemLayoutId)) {
            viewGroup = null;
        }
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, itemLayoutId, viewGroup, false);
        return new C43312rms<>(viewDataBindingInflate.getRoot(), viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    public void onBindViewHolder(C43312rms<B> c43312rms, T t) {
        ViewDataBinding viewDataBindingOLrzqt = c43312rms.OLrzqt();
        viewDataBindingOLrzqt.setVariable(getVariableId(), t);
        viewDataBindingOLrzqt.executePendingBindings();
    }
}
