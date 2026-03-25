package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10164bjL extends AbstractC59533zio<AbstractC10168bjP.LoaderManager, C10161bjI> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C10161bjI onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC17001euZ abstractC17001euZOLrzqt = AbstractC17001euZ.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC17001euZOLrzqt, "");
        return new C10161bjI(abstractC17001euZOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10161bjI c10161bjI, @NotNull AbstractC10168bjP.LoaderManager loaderManager) {
        Intrinsics.checkNotNullParameter(c10161bjI, "");
        Intrinsics.checkNotNullParameter(loaderManager, "");
        c10161bjI.AEQbTJ(loaderManager);
    }
}
