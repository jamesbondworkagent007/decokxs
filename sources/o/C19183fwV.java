package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19183fwV extends AbstractC59533zio<C18989fsn, C19184fwW> {
    public final Function1<C18989fsn, Unit> AEQbTJ;
    public final Function1<C18989fsn, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsn, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsn, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19183fwV(@NotNull Function1<? super C18989fsn, Unit> function1, @NotNull Function1<? super C18989fsn, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ = function1;
        this.copydefault = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C19184fwW onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16873esD c16873esDKWHzl = C16873esD.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16873esDKWHzl, "");
        return new C19184fwW(c16873esDKWHzl, this.AEQbTJ, this.copydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19184fwW c19184fwW, @NotNull C18989fsn c18989fsn) {
        Intrinsics.checkNotNullParameter(c19184fwW, "");
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        c19184fwW.copydefault(c18989fsn);
    }
}
