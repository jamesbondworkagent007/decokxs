package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C37763ozv extends androidx.recyclerview.widget.ListAdapter<java.lang.Object, C35895oHr> {
    public C35899oHv<java.lang.Object> AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37763ozv(@NotNull DiffUtil.ItemCallback<java.lang.Object> itemCallback) {
        super(itemCallback);
        Intrinsics.checkNotNullParameter(itemCallback, "");
        this.AEQbTJ = new C35899oHv<>();
    }

    public static /* synthetic */ void updateList$default(C37763ozv c37763ozv, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateList");
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        c37763ozv.copydefault(list, runnable);
    }

    public final void copydefault(@NotNull java.util.List<? extends java.lang.Object> list, final java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(list, "");
        submitList(list, new java.lang.Runnable() { // from class: o.ozu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37763ozv.KWHzl(runnable);
            }
        });
    }

    public static final void KWHzl(java.lang.Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void EZpvd(@NotNull InterfaceC35897oHt<java.lang.Object> interfaceC35897oHt) {
        Intrinsics.checkNotNullParameter(interfaceC35897oHt, "");
        this.AEQbTJ.OLrzqt(interfaceC35897oHt);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.AEQbTJ.AEQbTJ(getCurrentList().get(i), i);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C35895oHr onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        InterfaceC35897oHt<java.lang.Object> interfaceC35897oHtKWHzl = this.AEQbTJ.KWHzl(i);
        Intrinsics.checkNotNullExpressionValue(interfaceC35897oHtKWHzl, "");
        return interfaceC35897oHtKWHzl.AEQbTJ(viewGroup, i);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull C35895oHr c35895oHr) {
        InterfaceC35897oHt<java.lang.Object> interfaceC35897oHtAEQbTJ;
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        super.onViewRecycled(c35895oHr);
        java.util.List<java.lang.Object> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(currentList, c35895oHr.getBindingAdapterPosition());
        if (objAkhnZx == null || (interfaceC35897oHtAEQbTJ = this.AEQbTJ.AEQbTJ(objAkhnZx)) == null) {
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
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C35895oHr c35895oHr, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        java.lang.Object obj = getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        InterfaceC35897oHt<java.lang.Object> interfaceC35897oHtAEQbTJ = this.AEQbTJ.AEQbTJ(getCurrentList().get(i));
        Intrinsics.checkNotNullExpressionValue(interfaceC35897oHtAEQbTJ, "");
        interfaceC35897oHtAEQbTJ.AEQbTJ(c35895oHr, obj, i);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C35895oHr c35895oHr, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(c35895oHr, i, list);
            return;
        }
        java.lang.Object obj = getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        InterfaceC35897oHt<java.lang.Object> interfaceC35897oHtAEQbTJ = this.AEQbTJ.AEQbTJ(getCurrentList().get(i));
        Intrinsics.checkNotNullExpressionValue(interfaceC35897oHtAEQbTJ, "");
        interfaceC35897oHtAEQbTJ.AEQbTJ(c35895oHr, obj, (java.util.List<? extends java.lang.Object>) list);
    }
}
