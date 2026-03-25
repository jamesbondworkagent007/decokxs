package o;

import android.view.View;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49952uyJ {
    public static final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull android.view.ViewGroup viewGroup, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @androidx.annotation.DrawableRes int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt(fragment, viewGroup);
        android.content.Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        viewGroup.addView(AEQbTJ(contextRequireContext, str, str2, str3, i, function0));
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
        EZpvd(activity, viewGroup);
        viewGroup.addView(AEQbTJ(activity, str, str2, str3, i, function0));
    }

    public static final void EZpvd(@NotNull android.app.Activity activity, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        viewGroup.removeAllViews();
    }

    public static /* synthetic */ C55173xeu buildEmpty$default(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, Function0 function0, int i2, java.lang.Object obj) {
        java.lang.String str4 = (i2 & 8) != 0 ? null : str3;
        if ((i2 & 16) != 0) {
            i = C52761wXj.TaskDescription.gCNefq;
        }
        return AEQbTJ(context, str, str2, str4, i, (i2 & 32) != 0 ? null : function0);
    }

    public static final C55173xeu AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, @androidx.annotation.DrawableRes int i, final Function0<Unit> function0) {
        C55173xeu c55173xeu = new C55173xeu(context, null, 0, 6, null);
        c55173xeu.setTitle(str);
        c55173xeu.setSubTitle((java.lang.CharSequence) str2);
        if (str3 != null) {
            c55173xeu.setRetry(str3);
        }
        c55173xeu.setImage(i);
        if (function0 != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.uyN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C49952uyJ.copydefault(function0, view);
                }
            });
        }
        return c55173xeu;
    }

    public static final void copydefault(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static /* synthetic */ void updateDataOrEmpty$default(C43316rmw c43316rmw, java.util.List list, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 96;
        }
        int i3 = i;
        java.lang.String str4 = (i2 & 8) != 0 ? "" : str2;
        java.lang.String str5 = (i2 & 16) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            z = false;
        }
        copydefault(c43316rmw, list, str, i3, str4, str5, z);
    }

    public static final void copydefault(@NotNull C43316rmw c43316rmw, @NotNull java.util.List<? extends java.lang.Object> list, @NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(c43316rmw, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        c43316rmw.setItems(list.isEmpty() ? CommonEmptyData.ActionBar.buildEmptyData$default(CommonEmptyData.Companion, str, i, str2, str3, z, false, 32, null) : list);
        c43316rmw.notifyDataSetChanged();
    }

    public static /* synthetic */ void updateDataOrNoResult$default(C43316rmw c43316rmw, java.util.List list, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 96;
        }
        KWHzl(c43316rmw, list, str, i);
    }

    public static final void KWHzl(@NotNull C43316rmw c43316rmw, @NotNull java.util.List<? extends java.lang.Object> list, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(c43316rmw, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (list.isEmpty()) {
            list = CommonEmptyData.Companion.AEQbTJ(str, i);
        }
        c43316rmw.setItems(list);
        c43316rmw.notifyDataSetChanged();
    }
}
