package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qBc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39878qBc extends qNT {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.qNT, o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt */
    public C42847reD AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42847reD c42847reDAEQbTJ = super.AEQbTJ(layoutInflater, viewGroup);
        TextViewCompat.setTextAppearance(c42847reDAEQbTJ.AEQbTJ, C52761wXj.LoaderManager.zuBGHE);
        AppCompatTextView appCompatTextView = c42847reDAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            appCompatTextView.setLayoutParams(layoutParams);
            AppCompatTextView appCompatTextView2 = c42847reDAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setPadding(appCompatTextView2.getPaddingLeft(), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), appCompatTextView2.getPaddingRight(), appCompatTextView2.getPaddingBottom());
            return c42847reDAEQbTJ;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
