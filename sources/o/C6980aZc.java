package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6980aZc {
    public static final void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, @NotNull android.view.ViewGroup viewGroup, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @androidx.annotation.DrawableRes int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt(fragment, viewGroup);
        android.content.Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        viewGroup.addView(copydefault(contextRequireContext, str, str2, str3, i, function0));
    }

    public static final void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        viewGroup.removeAllViews();
    }

    public static final void KWHzl(@NotNull android.app.Activity activity, @NotNull android.view.ViewGroup viewGroup, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @androidx.annotation.DrawableRes int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt(activity, viewGroup);
        viewGroup.addView(copydefault(activity, str, str2, str3, i, function0));
    }

    public static final void OLrzqt(@NotNull android.app.Activity activity, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        viewGroup.removeAllViews();
    }

    public static /* synthetic */ C55173xeu buildError$default(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, Function0 function0, int i2, java.lang.Object obj) {
        java.lang.String str4 = (i2 & 8) != 0 ? null : str3;
        if ((i2 & 16) != 0) {
            i = C52761wXj.TaskDescription.getSerial;
        }
        return copydefault(context, str, str2, str4, i, (i2 & 32) != 0 ? null : function0);
    }

    public static final C55173xeu copydefault(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, @androidx.annotation.DrawableRes int i, final Function0<Unit> function0) {
        java.lang.String string$default;
        C55173xeu c55173xeu = new C55173xeu(context, null, 0, 6, null);
        c55173xeu.setTitle(str);
        c55173xeu.setSubTitle((java.lang.CharSequence) str2);
        if (str3 == null) {
            C33087mpo c33087mpo = C33087mpo.KWHzl;
            string$default = C33087mpo.getString$default(c33087mpo, context, c33087mpo.copydefault(), null, 4, null);
        } else {
            string$default = str3;
        }
        c55173xeu.setRetry(string$default);
        c55173xeu.setImage(i);
        if (function0 != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.aZf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C6980aZc.AEQbTJ(function0, view);
                }
            });
        }
        return c55173xeu;
    }

    public static final void AEQbTJ(Function0 function0, android.view.View view) {
        function0.invoke();
    }
}
