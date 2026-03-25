package o;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.koV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29164koV {
    public static final kotlin.Pair<java.lang.Integer, java.lang.Integer> OLrzqt(java.lang.String str, @NotNull android.content.Context context) {
        java.lang.Integer numValueOf;
        Intrinsics.checkNotNullParameter(context, "");
        int iCopydefault = C25382ivf.copydefault(C52761wXj.Activity.fdOvFl, context);
        try {
            numValueOf = java.lang.Integer.valueOf(Color.parseColor(str));
        } catch (java.lang.Throwable unused) {
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() == iCopydefault) {
            return new kotlin.Pair<>(java.lang.Integer.valueOf(iCopydefault), java.lang.Integer.valueOf(C25382ivf.copydefault(C52761wXj.Activity.invokespecialDPHOMC, context)));
        }
        return new kotlin.Pair<>(numValueOf, java.lang.Integer.valueOf(ColorUtils.setAlphaComponent(numValueOf.intValue(), 40)));
    }
}
