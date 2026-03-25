package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.os.BundleKt;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49953uyK {
    public static final int OLrzqt(@NotNull C55237xgE c55237xgE) {
        Intrinsics.checkNotNullParameter(c55237xgE, "");
        int height = c55237xgE.getHeight();
        android.content.Context context = c55237xgE.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return C33129mqd.AhwBna(java.lang.Double.valueOf(((double) (height - C33052mpF.AEQbTJ(98, context))) / 2.8d));
    }

    public static final int KWHzl(@NotNull C55237xgE c55237xgE) {
        Intrinsics.checkNotNullParameter(c55237xgE, "");
        int height = c55237xgE.getHeight();
        android.content.Context context = c55237xgE.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return C33129mqd.AhwBna(java.lang.Double.valueOf(((double) (height - C33052mpF.AEQbTJ(200, context))) / 2.8d));
    }

    public static /* synthetic */ void showNormalEmpty$default(C55237xgE c55237xgE, java.lang.String str, boolean z, java.lang.String str2, boolean z2, int i, boolean z3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = C33070mpX.AYXKKw(C55688xof.Application.WorkerThread);
        }
        boolean z4 = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        OLrzqt(c55237xgE, str, z4, str2, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? z3 : false);
    }

    public static final void OLrzqt(@NotNull C55237xgE c55237xgE, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, boolean z2, int i, boolean z3) {
        C55173xeu c55173xeu;
        int iAEQbTJ;
        Intrinsics.checkNotNullParameter(c55237xgE, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        StatefulView.Status status = StatefulView.Status.Empty;
        c55237xgE.setStatus(status);
        android.view.View viewAEQbTJ = c55237xgE.AEQbTJ(status);
        if (viewAEQbTJ == null || (c55173xeu = (C55173xeu) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.gasjUx)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (z || z2) {
            if (z) {
                c55173xeu.OLrzqt().setTextSize(2, 14.0f);
                android.content.Context context = c55173xeu.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iAEQbTJ = C33052mpF.AEQbTJ(24, context);
            } else {
                android.content.Context context2 = c55173xeu.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iAEQbTJ = C33052mpF.AEQbTJ(48, context2);
            }
            layoutParams2.topMargin = iAEQbTJ;
            c55173xeu.setLayoutParams(layoutParams2);
        } else if (i > 0) {
            layoutParams2.topMargin = i;
            c55173xeu.setLayoutParams(layoutParams2);
        } else {
            layoutParams2.gravity = 17;
            c55173xeu.setLayoutParams(layoutParams2);
        }
        c55173xeu.setEmptyTypeImage(6);
        if (z3) {
            c55173xeu.copydefault().setVisibility(0);
        }
        c55173xeu.setTitle(str);
        c55173xeu.setSubTitle((java.lang.CharSequence) str2);
        c55173xeu.setRetry("");
    }

    public static final void KWHzl(@NotNull final C55237xgE c55237xgE, boolean z, @NotNull java.lang.String str, boolean z2, int i, boolean z3, final Function0<Unit> function0) {
        C55173xeu c55173xeu;
        int iAEQbTJ;
        Intrinsics.checkNotNullParameter(c55237xgE, "");
        Intrinsics.checkNotNullParameter(str, "");
        StatefulView.Status status = StatefulView.Status.Error;
        c55237xgE.setStatus(status);
        android.view.View viewAEQbTJ = c55237xgE.AEQbTJ(status);
        if (viewAEQbTJ == null || (c55173xeu = (C55173xeu) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.gasjUx)) == null) {
            c55173xeu = null;
        } else {
            ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (z || z2) {
                if (z) {
                    c55173xeu.OLrzqt().setTextSize(2, 14.0f);
                    android.content.Context context = c55173xeu.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iAEQbTJ = C33052mpF.AEQbTJ(24, context);
                } else {
                    android.content.Context context2 = c55173xeu.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    iAEQbTJ = C33052mpF.AEQbTJ(48, context2);
                }
                layoutParams2.topMargin = iAEQbTJ;
                c55173xeu.setLayoutParams(layoutParams2);
            } else if (i > 0) {
                layoutParams2.topMargin = i;
                c55173xeu.setLayoutParams(layoutParams2);
            } else {
                layoutParams2.gravity = 17;
                c55173xeu.setLayoutParams(layoutParams2);
            }
            c55173xeu.setEmptyTypeImage(8);
            if (z3) {
                c55173xeu.copydefault().setVisibility(8);
            }
            java.lang.String string = c55237xgE.getContext().getString(C55688xof.Application.AuCTel);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setRetry(string);
            java.lang.String string2 = c55237xgE.getContext().getString(C55688xof.Application.ComponentActivityApi33Impl);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeu.setTitle(string2);
            c55173xeu.setSubTitle((java.lang.CharSequence) str);
        }
        if (c55173xeu != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.uyS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C49953uyK.AEQbTJ(c55237xgE, function0, view);
                }
            });
        }
    }

    public static final void AEQbTJ(C55237xgE c55237xgE, Function0 function0, android.view.View view) {
        c55237xgE.setStatus(StatefulView.Status.Loading);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ void showNetError$default(C55173xeu c55173xeu, java.lang.Exception exc, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            exc = null;
        }
        OLrzqt(c55173xeu, exc, function0);
    }

    public static final void OLrzqt(@NotNull C55173xeu c55173xeu, java.lang.Exception exc, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(c55173xeu, "");
        java.lang.String string = exc == null ? c55173xeu.getContext().getString(C55688xof.Application.putInt) : exc.getMessage();
        if (string != null) {
            C33134mqi.AEQbTJ(string);
        }
        c55173xeu.setEmptyTypeImage(8);
        java.lang.String string2 = c55173xeu.getContext().getString(C55688xof.Application.AuCTel);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setRetry(string2);
        java.lang.String string3 = c55173xeu.getContext().getString(C55688xof.Application.ComponentActivityApi33Impl);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setTitle(string3);
        c55173xeu.setSubTitle((java.lang.CharSequence) (string != null ? string : ""));
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.uyP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49953uyK.AEQbTJ(function0, view);
            }
        });
    }

    public static final void AEQbTJ(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ void showCommonEmpty$default(C55237xgE c55237xgE, java.lang.String str, java.lang.String str2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = C33070mpX.AYXKKw(C55688xof.Application.WorkerThread);
        }
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        EZpvd(c55237xgE, str, str2, i, z);
    }

    public static final void EZpvd(@NotNull C55237xgE c55237xgE, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, boolean z) {
        C55173xeu c55173xeu;
        Intrinsics.checkNotNullParameter(c55237xgE, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        StatefulView.Status status = StatefulView.Status.Empty;
        c55237xgE.setStatus(status);
        android.view.View viewAEQbTJ = c55237xgE.AEQbTJ(status);
        if (viewAEQbTJ == null || (c55173xeu = (C55173xeu) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.gasjUx)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (i > 0) {
            layoutParams2.topMargin = i;
            c55173xeu.setLayoutParams(layoutParams2);
        } else {
            layoutParams2.topMargin = 0;
            layoutParams2.gravity = 17;
            c55173xeu.setLayoutParams(layoutParams2);
        }
        c55173xeu.setEmptyTypeImage(6);
        if (z) {
            c55173xeu.copydefault().setVisibility(0);
        }
        c55173xeu.setTitle(str);
        c55173xeu.setSubTitle((java.lang.CharSequence) str2);
        c55173xeu.setRetry("");
    }

    public static final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C49511upt.Activity.aKErDB))), null, 4, null);
    }
}
