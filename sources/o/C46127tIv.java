package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tIv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46127tIv extends AbstractC59533zio<InterfaceC46104tHz, C46101tHw> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C46101tHw onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C46471tVo c46471tVo = new C46471tVo(context, null, 0, null, 0, 30, null);
        c46471tVo.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new C46101tHw(c46471tVo);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C46101tHw c46101tHw, @NotNull InterfaceC46104tHz interfaceC46104tHz) {
        Intrinsics.checkNotNullParameter(c46101tHw, "");
        Intrinsics.checkNotNullParameter(interfaceC46104tHz, "");
        c46101tHw.KWHzl(interfaceC46104tHz);
    }
}
