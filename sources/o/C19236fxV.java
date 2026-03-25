package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19236fxV extends AbstractC59533zio<C18951fsB, C19234fxT> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C19234fxT onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.RhjxDW, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C19234fxT(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19234fxT c19234fxT, @NotNull C18951fsB c18951fsB) {
        Intrinsics.checkNotNullParameter(c19234fxT, "");
        Intrinsics.checkNotNullParameter(c18951fsB, "");
        ViewGroup.LayoutParams layoutParams = c19234fxT.AEQbTJ().getLayoutParams();
        float fKWHzl = c18951fsB.KWHzl();
        android.content.Context context = c19234fxT.AEQbTJ().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        layoutParams.height = (int) C55298xhM.OLrzqt(fKWHzl, context);
        float fAEQbTJ = c18951fsB.AEQbTJ();
        android.content.Context context2 = c19234fxT.AEQbTJ().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        layoutParams.width = (int) C55298xhM.OLrzqt(fAEQbTJ, context2);
        c19234fxT.AEQbTJ().setLayoutParams(layoutParams);
    }
}
