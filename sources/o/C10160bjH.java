package o;

import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC10168bjP;
import o.C52761wXj;
import o.kNQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10160bjH extends RecyclerView.ViewHolder {
    public final AbstractC17065evk AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10160bjH(@NotNull AbstractC17065evk abstractC17065evk) {
        super(abstractC17065evk.getRoot());
        Intrinsics.checkNotNullParameter(abstractC17065evk, "");
        this.AEQbTJ = abstractC17065evk;
    }

    public final void AEQbTJ(@NotNull AbstractC10168bjP.ActionBar actionBar) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(actionBar, "");
        C5448Sc c5448ScKWHzl = KWHzl(actionBar.OLrzqt());
        java.lang.String strOLrzqt2 = actionBar.OLrzqt();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strOLrzqt2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
            strOLrzqt = "SVG:" + actionBar.OLrzqt();
        } else {
            strOLrzqt = actionBar.OLrzqt();
        }
        Glide.AEQbTJ(this.AEQbTJ.getRoot().getContext()).EZpvd(strOLrzqt).OLrzqt((RX<?>) c5448ScKWHzl).OLrzqt(AppCompatResources.getDrawable(this.AEQbTJ.getRoot().getContext(), kNQ.StateListAnimator.KWHzl)).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(this.AEQbTJ.getRoot().getContext(), 0.5f, C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC), false, 8, null)).EZpvd(this.AEQbTJ.OLrzqt);
        this.AEQbTJ.KWHzl.setText(C10186bjh.jointColorCharSequence$default(C10186bjh.KWHzl, actionBar.AEQbTJ(), 0, null, 0, 14, null));
    }

    private final C5448Sc KWHzl(java.lang.String str) {
        C5448Sc c5448Sc;
        C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
        Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
        C5448Sc c5448Sc2 = c5448ScCopydefault;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
            if (C59449zhJ.startsWith$default("SVG:" + str, "SVG:", false, 2, null)) {
                C5448Sc c5448ScAEQbTJ = c5448Sc2.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
                Intrinsics.copydefault(c5448ScAEQbTJ);
                c5448Sc = c5448ScAEQbTJ;
            } else {
                C5448Sc c5448ScCopydefault2 = c5448Sc2.copydefault(AbstractC5360Os.EZpvd);
                Intrinsics.copydefault(c5448ScCopydefault2);
                c5448Sc = c5448ScCopydefault2;
            }
            return c5448Sc;
        }
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = str.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) ".gif", false, 2, (java.lang.Object) null) ? c5448Sc2.copydefault(AbstractC5360Os.OLrzqt) : c5448Sc2;
    }
}
