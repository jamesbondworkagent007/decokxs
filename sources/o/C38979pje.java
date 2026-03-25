package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pje, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38979pje extends AbstractC59533zio<java.lang.String, C38976pjb> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C38976pjb onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.ODWQjV, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C38976pjb(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C38976pjb c38976pjb, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c38976pjb, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (c38976pjb.copydefault() instanceof C55024xcD) {
            android.view.View viewCopydefault = c38976pjb.copydefault();
            C55024xcD c55024xcD = viewCopydefault instanceof C55024xcD ? (C55024xcD) viewCopydefault : null;
            if (c55024xcD != null) {
                c55024xcD.setTitleText(str);
            }
        } else {
            android.view.View viewCopydefault2 = c38976pjb.copydefault();
            android.widget.TextView textView = viewCopydefault2 instanceof android.widget.TextView ? (android.widget.TextView) viewCopydefault2 : null;
            if (textView != null) {
                textView.setText(str);
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.QSBOWP))) {
            ViewGroup.LayoutParams layoutParams = c38976pjb.copydefault().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C55298xhM.dp2px$default(20.0f, null, 1, null);
            }
            c38976pjb.copydefault().setLayoutParams(c38976pjb.copydefault().getLayoutParams());
        }
    }
}
