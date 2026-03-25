package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46099tHu extends androidx.recyclerview.widget.ListAdapter<InterfaceC46104tHz, C46101tHw> {
    public C46099tHu() {
        super(new DiffUtil.ItemCallback<InterfaceC46104tHz>() { // from class: o.tHu.4
            /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(InterfaceC46104tHz interfaceC46104tHz, InterfaceC46104tHz interfaceC46104tHz2) {
                Intrinsics.checkNotNullParameter(interfaceC46104tHz, "");
                Intrinsics.checkNotNullParameter(interfaceC46104tHz2, "");
                return Intrinsics.EZpvd(interfaceC46104tHz, interfaceC46104tHz2);
            }

            /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(InterfaceC46104tHz interfaceC46104tHz, InterfaceC46104tHz interfaceC46104tHz2) {
                Intrinsics.checkNotNullParameter(interfaceC46104tHz, "");
                Intrinsics.checkNotNullParameter(interfaceC46104tHz2, "");
                return Intrinsics.EZpvd(interfaceC46104tHz, interfaceC46104tHz2);
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C46101tHw onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C46471tVo c46471tVo = new C46471tVo(context, null, 0, null, 0, 30, null);
        c46471tVo.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C46101tHw(c46471tVo);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C46101tHw c46101tHw, int i) {
        Intrinsics.checkNotNullParameter(c46101tHw, "");
        InterfaceC46104tHz item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        c46101tHw.KWHzl(item);
    }
}
