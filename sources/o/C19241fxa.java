package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19241fxa extends AbstractC59533zio<C19001fsz, C19242fxb> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C19242fxb onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.aappFQ, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C19242fxb(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C19242fxb c19242fxb, @NotNull C19001fsz c19001fsz) {
        Intrinsics.checkNotNullParameter(c19242fxb, "");
        Intrinsics.checkNotNullParameter(c19001fsz, "");
        c19242fxb.AEQbTJ().setText(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C13754dXa.FragmentManager.dispatchMenuVisibilityChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c19001fsz.EZpvd()))), new java.lang.String[]{c19001fsz.EZpvd()}, 0, null, false, new Function1() { // from class: o.fxd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19241fxa.KWHzl(c19242fxb, (java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit KWHzl(C19242fxb c19242fxb, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        int i = C52761wXj.ActionBar.DCUTEI;
        android.content.Context context = c19242fxb.AEQbTJ().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C55366xib.KWHzl(i, context)));
        return Unit.INSTANCE;
    }
}
