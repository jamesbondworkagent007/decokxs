package o;

import com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19172fwK extends AbstractC59533zio<C18982fsg, C19192fwe> {
    public final Function1<java.lang.String, Unit> AEQbTJ;
    public final Function1<C18982fsg, Unit> EZpvd;
    public final Function1<TagEventProperty, Unit> OLrzqt;
    public final Function1<C18982fsg, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsg, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsg, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19172fwK(@NotNull Function1<? super C18982fsg, Unit> function1, @NotNull Function1<? super C18982fsg, Unit> function12, @NotNull Function1<? super java.lang.String, Unit> function13, @NotNull Function1<? super TagEventProperty, Unit> function14) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        this.EZpvd = function1;
        this.copydefault = function12;
        this.AEQbTJ = function13;
        this.OLrzqt = function14;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C19192fwe onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17178exr c17178exrEZpvd = C17178exr.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17178exrEZpvd, "");
        return new C19192fwe(c17178exrEZpvd, this.EZpvd, this.copydefault, this.AEQbTJ, this.OLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19192fwe c19192fwe, @NotNull C18982fsg c18982fsg) {
        Intrinsics.checkNotNullParameter(c19192fwe, "");
        Intrinsics.checkNotNullParameter(c18982fsg, "");
        c19192fwe.EZpvd(c18982fsg);
    }
}
