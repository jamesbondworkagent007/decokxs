package o;

import android.view.View;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oUi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36237oUi {
    public static final void copydefault(@NotNull C55237xgE c55237xgE) {
        Intrinsics.checkNotNullParameter(c55237xgE, "");
        c55237xgE.setStatus(StatefulView.Status.Loading);
    }

    public static final void AEQbTJ(@NotNull C55237xgE c55237xgE) {
        Intrinsics.checkNotNullParameter(c55237xgE, "");
        c55237xgE.setStatus(StatefulView.Status.Content);
    }

    public static /* synthetic */ void showEmpty$default(C55237xgE c55237xgE, java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = "";
        }
        if ((i3 & 2) != 0) {
            str2 = C33070mpX.AYXKKw(C35964oKf.Fragment.RJOkX);
        }
        if ((i3 & 4) != 0) {
            i = 6;
        }
        if ((i3 & 8) != 0) {
            i2 = C55298xhM.dpInt$default(70, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        OLrzqt(c55237xgE, str, str2, i, i2);
    }

    public static final void OLrzqt(@NotNull C55237xgE c55237xgE, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(c55237xgE, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c55237xgE.OLrzqt(C35964oKf.Application.invokespecialDaTmkG);
        StatefulView.Status status = StatefulView.Status.Empty;
        c55237xgE.setStatus(status);
        android.view.View viewAEQbTJ = c55237xgE.AEQbTJ(status);
        C55173xeu c55173xeu = viewAEQbTJ instanceof C55173xeu ? (C55173xeu) viewAEQbTJ : null;
        if (c55173xeu != null) {
            c55173xeu.setPadding(0, i2, 0, 0);
            c55173xeu.setEmptyTypeImage(i);
            c55173xeu.setTitle(str);
            c55173xeu.setSubTitle((java.lang.CharSequence) str2);
        }
    }

    public static /* synthetic */ void showError$default(C55237xgE c55237xgE, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, View.OnClickListener onClickListener, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = C33070mpX.AYXKKw(C35964oKf.Fragment.HrFqwD);
        }
        java.lang.String str4 = str;
        if ((i3 & 2) != 0) {
            str2 = C33070mpX.AYXKKw(C35964oKf.Fragment.avCqka);
        }
        java.lang.String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = C33070mpX.AYXKKw(C35964oKf.Fragment.OGitdB);
        }
        java.lang.String str6 = str3;
        if ((i3 & 8) != 0) {
            i = 8;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = C55298xhM.dpInt$default(70, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        KWHzl(c55237xgE, str4, str5, str6, i4, i2, onClickListener);
    }

    public static final void KWHzl(@NotNull C55237xgE c55237xgE, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, int i2, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(c55237xgE, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        c55237xgE.copydefault(C35964oKf.Application.invokespecialDaTmkG);
        StatefulView.Status status = StatefulView.Status.Error;
        c55237xgE.setStatus(status);
        android.view.View viewAEQbTJ = c55237xgE.AEQbTJ(status);
        C55173xeu c55173xeu = viewAEQbTJ instanceof C55173xeu ? (C55173xeu) viewAEQbTJ : null;
        if (c55173xeu != null) {
            c55173xeu.setPadding(0, i2, 0, 0);
            c55173xeu.setEmptyTypeImage(i);
            c55173xeu.setTitle(str);
            c55173xeu.setSubTitle((java.lang.CharSequence) str2);
            c55173xeu.setRetry(str3);
            c55173xeu.setRetryClickListener(onClickListener);
        }
    }
}
