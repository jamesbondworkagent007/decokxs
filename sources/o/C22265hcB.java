package o;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22265hcB extends android.widget.FrameLayout {
    public hGR OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22265hcB(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22265hcB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22265hcB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    public final void KWHzl(android.content.Context context) {
        this.OLrzqt = hGR.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        hGR hgr = this.OLrzqt;
        if (hgr != null) {
            AppCompatImageView appCompatImageView = hgr.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? 0 : 8);
            AppCompatImageView appCompatImageView2 = hgr.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str2) ? 0 : 8);
            AppCompatImageView appCompatImageView3 = hgr.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            appCompatImageView3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str3) ? 0 : 8);
            if (str != null) {
                AppCompatImageView appCompatImageView4 = hgr.copydefault;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
                C25386ivj.loadImageWithBorder$default(appCompatImageView4, str, null, 2, null);
            }
            if (str2 != null) {
                AppCompatImageView appCompatImageView5 = hgr.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView5, "");
                C25386ivj.loadImageWithBorder$default(appCompatImageView5, str2, null, 2, null);
                hgr.EZpvd.setBackground(C25386ivj.generateSolidBackground$default(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.EZpvd)), 0.0f, null, 12, null));
            }
            if (str3 != null) {
                AppCompatImageView appCompatImageView6 = hgr.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView6, "");
                C25386ivj.loadImageWithBorder$default(appCompatImageView6, str3, null, 2, null);
            }
        }
    }
}
