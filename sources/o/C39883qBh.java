package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qBh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39883qBh extends qNU {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.qNU, o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault */
    public C42848reE AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42848reE c42848reEAEQbTJ = super.AEQbTJ(layoutInflater, viewGroup);
        TextViewCompat.setTextAppearance(c42848reEAEQbTJ.getRoot(), C52761wXj.LoaderManager.zuBGHE);
        AppCompatTextView root = c42848reEAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            root.setLayoutParams(layoutParams);
            AppCompatTextView root2 = c42848reEAEQbTJ.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            root2.setPadding(root2.getPaddingLeft(), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), root2.getPaddingRight(), root2.getPaddingBottom());
            return c42848reEAEQbTJ;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.qNU, o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl */
    public void AEQbTJ(@NotNull C42848reE c42848reE, int i, @NotNull C40246qOt c40246qOt) {
        Intrinsics.checkNotNullParameter(c42848reE, "");
        Intrinsics.checkNotNullParameter(c40246qOt, "");
        c42848reE.getRoot().setText(qZH.PendingIntent.OrsvgJ);
    }
}
