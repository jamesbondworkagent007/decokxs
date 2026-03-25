package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wyl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54142wyl extends AbstractC59533zio<C54138wyh, C54139wyi> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C54139wyi onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C48320uNc c48320uNcCopydefault = C48320uNc.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c48320uNcCopydefault, "");
        return new C54139wyi(c48320uNcCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C54139wyi c54139wyi, @NotNull C54138wyh c54138wyh) {
        Intrinsics.checkNotNullParameter(c54139wyi, "");
        Intrinsics.checkNotNullParameter(c54138wyh, "");
        C48320uNc c48320uNcCopydefault = c54139wyi.copydefault();
        kotlin.Pair<java.lang.String, java.lang.Integer> pairAEQbTJ = C56068xvo.copydefault.AEQbTJ(c54138wyh.OLrzqt(), true);
        java.lang.String strComponent1 = pairAEQbTJ.component1();
        int iIntValue = pairAEQbTJ.component2().intValue();
        c48320uNcCopydefault.AhwBna.setText(strComponent1);
        c48320uNcCopydefault.AhwBna.setTextColor(iIntValue);
        if (Intrinsics.EZpvd((java.lang.Object) "autoStaking", (java.lang.Object) c54138wyh.KWHzl())) {
            android.widget.TextView textView = c48320uNcCopydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.TextView textView2 = c48320uNcCopydefault.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            C54120wyP c54120wyP = c48320uNcCopydefault.AYXKKw.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c54120wyP, "");
            c54120wyP.setVisibility(8);
            c48320uNcCopydefault.EZpvd.setText(c54138wyh.EZpvd());
            return;
        }
        c48320uNcCopydefault.EZpvd.setText(c54138wyh.AEQbTJ());
        c48320uNcCopydefault.AEQbTJ.setText(c54138wyh.copydefault());
        c48320uNcCopydefault.KWHzl.setText(c54138wyh.EZpvd());
    }
}
