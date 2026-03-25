package o;

import com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19245fxe extends AbstractC59533zio<C18988fsm, C19163fwB> {
    public final Function1<java.lang.String, Unit> AEQbTJ;
    public final Function1<C18988fsm, Unit> KWHzl;
    public final Function1<TagEventProperty, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsm, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19245fxe(@NotNull Function1<? super C18988fsm, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12, @NotNull Function1<? super TagEventProperty, Unit> function13) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.KWHzl = function1;
        this.AEQbTJ = function12;
        this.OLrzqt = function13;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C19163fwB onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17174exn c17174exnCopydefault = C17174exn.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17174exnCopydefault, "");
        return new C19163fwB(c17174exnCopydefault, this.KWHzl, this.AEQbTJ, this.OLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19163fwB c19163fwB, @NotNull C18988fsm c18988fsm) {
        Intrinsics.checkNotNullParameter(c19163fwB, "");
        Intrinsics.checkNotNullParameter(c18988fsm, "");
        c19163fwB.AEQbTJ(c18988fsm);
    }
}
