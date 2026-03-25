package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19210fww extends AbstractC59533zio<C18983fsh, C19212fwy> {
    public final Function1<C18983fsh, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsh, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19210fww(@NotNull Function1<? super C18983fsh, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C19212fwy onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16917esv c16917esvOLrzqt = C16917esv.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16917esvOLrzqt, "");
        return new C19212fwy(c16917esvOLrzqt, this.AEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19212fwy c19212fwy, @NotNull C18983fsh c18983fsh) {
        Intrinsics.checkNotNullParameter(c19212fwy, "");
        Intrinsics.checkNotNullParameter(c18983fsh, "");
        c19212fwy.EZpvd(c18983fsh);
    }
}
