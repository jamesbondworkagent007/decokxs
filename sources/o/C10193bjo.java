package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10193bjo extends AbstractC59533zio<AbstractC10168bjP.Application, C10194bjp> {
    public final long EZpvd;

    public C10193bjo(long j) {
        this.EZpvd = j;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C10194bjp onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC17059eve abstractC17059eveKWHzl = AbstractC17059eve.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC17059eveKWHzl, "");
        return new C10194bjp(abstractC17059eveKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10194bjp c10194bjp, @NotNull AbstractC10168bjP.Application application) {
        Intrinsics.checkNotNullParameter(c10194bjp, "");
        Intrinsics.checkNotNullParameter(application, "");
        c10194bjp.EZpvd(application, this.EZpvd);
    }
}
