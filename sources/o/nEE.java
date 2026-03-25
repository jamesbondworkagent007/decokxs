package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nEE extends androidx.recyclerview.widget.ListAdapter<java.lang.Object, C35895oHr> {
    public C35899oHv<java.lang.Object> KWHzl;
    public final nEI OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nEE(@NotNull nEI nei) {
        super(nei);
        Intrinsics.checkNotNullParameter(nei, "");
        this.OLrzqt = nei;
        this.KWHzl = new C35899oHv<>();
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        submitList(list);
    }

    public final void copydefault(@NotNull InterfaceC35897oHt<java.lang.Object> interfaceC35897oHt) {
        Intrinsics.checkNotNullParameter(interfaceC35897oHt, "");
        this.KWHzl.OLrzqt(interfaceC35897oHt);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.KWHzl.AEQbTJ(getCurrentList().get(i), i);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C35895oHr onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        InterfaceC35897oHt<java.lang.Object> interfaceC35897oHtKWHzl = this.KWHzl.KWHzl(i);
        Intrinsics.checkNotNullExpressionValue(interfaceC35897oHtKWHzl, "");
        return interfaceC35897oHtKWHzl.AEQbTJ(viewGroup, i);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull C35895oHr c35895oHr) {
        InterfaceC35897oHt<java.lang.Object> interfaceC35897oHtAEQbTJ;
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        super.onViewRecycled(c35895oHr);
        java.util.List<java.lang.Object> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(currentList, c35895oHr.getBindingAdapterPosition());
        if (objAkhnZx == null || (interfaceC35897oHtAEQbTJ = this.KWHzl.AEQbTJ(objAkhnZx)) == null) {
            return;
        }
        interfaceC35897oHtAEQbTJ.copydefault(c35895oHr, objAkhnZx);
    }

    @Override // androidx.recyclerview.widget.ListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getCurrentList().size();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C35895oHr c35895oHr, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        java.lang.Object obj = getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        InterfaceC35897oHt<java.lang.Object> interfaceC35897oHtAEQbTJ = this.KWHzl.AEQbTJ(getCurrentList().get(i));
        Intrinsics.checkNotNullExpressionValue(interfaceC35897oHtAEQbTJ, "");
        interfaceC35897oHtAEQbTJ.AEQbTJ(c35895oHr, obj, i);
    }
}
