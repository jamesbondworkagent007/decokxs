package o;

import com.okinc.business.defi.assets.detail.biz.BaseItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eZn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15902eZn extends AbstractC59533zio<BaseItem.Application, C15909eZu> {
    public final Function1<BaseItem.Application, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.assets.detail.biz.BaseItem$Application, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C15902eZn(@NotNull Function1<? super BaseItem.Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C15909eZu onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16988euM abstractC16988euMAEQbTJ = AbstractC16988euM.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16988euMAEQbTJ, "");
        return new C15909eZu(abstractC16988euMAEQbTJ, this.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C15909eZu c15909eZu, @NotNull BaseItem.Application application) {
        Intrinsics.checkNotNullParameter(c15909eZu, "");
        Intrinsics.checkNotNullParameter(application, "");
        c15909eZu.copydefault(application);
    }
}
