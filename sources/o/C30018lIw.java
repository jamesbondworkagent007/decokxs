package o;

import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lIw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30018lIw {
    public static final void AEQbTJ(@NotNull android.content.Context context, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.view.View currentFocus = C33569myt.OLrzqt(context).getCurrentFocus();
        if (currentFocus != null) {
            java.lang.Object systemService = context.getSystemService("input_method");
            Intrinsics.copydefault(systemService, "");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        function0.invoke();
    }

    public static final void AEQbTJ(@NotNull C52794wYp c52794wYp, boolean z) {
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        c52794wYp.setOKDSType(z ? 80 : 257);
    }

    public static /* synthetic */ void addForegroundSpanCursor$default(C55033xcM c55033xcM, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        OLrzqt(c55033xcM, str, str2, z, z2);
    }

    public static final void OLrzqt(@NotNull C55033xcM c55033xcM, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = str + "\u200b" + str2;
        android.text.SpannableString spannableString = new android.text.SpannableString(str3);
        int length = str.length();
        int color = ContextCompat.getColor(c55033xcM.getContext(), C52761wXj.Activity.dvKsVJ);
        android.content.Context context = c55033xcM.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iKWHzl = KWHzl(2, context);
        android.content.Context context2 = c55033xcM.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C30014lIs c30014lIs = new C30014lIs(color, 0, iKWHzl, KWHzl(1, context2), z);
        int i = length + 1;
        spannableString.setSpan(c30014lIs, length, i, 33);
        if (z2) {
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(c55033xcM.getContext(), C52761wXj.Activity.DQzvGN)), 0, length, 33);
        } else {
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(c55033xcM.getContext(), C52761wXj.Activity.fdOvFl)), 0, length, 33);
        }
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(c55033xcM.getContext(), C52761wXj.Activity.DCUTEIddSDPG)), i, str3.length(), 33);
        c55033xcM.setText(spannableString);
        c55033xcM.setTextByAnimation(spannableString);
    }

    public static final int KWHzl(int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }

    public static final int OLrzqt(android.content.Context context) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        return (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null || ((float) displayMetrics.heightPixels) / displayMetrics.density > 700.0f) ? -4 : -5;
    }
}
