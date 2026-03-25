package o;

import android.view.View;
import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qEK extends AbstractC40510qYn<C40009qFz, C42943rfu> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42943rfu AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42943rfu c42943rfuEZpvd = C42943rfu.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42943rfuEZpvd, "");
        return c42943rfuEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42943rfu c42943rfu, final int i, @NotNull final C40009qFz c40009qFz) {
        Intrinsics.checkNotNullParameter(c42943rfu, "");
        Intrinsics.checkNotNullParameter(c40009qFz, "");
        android.widget.TextView textView = c42943rfu.OLrzqt;
        int i2 = qZH.PendingIntent.DLWbHP;
        java.lang.String ccy = c40009qFz.copydefault().getCcy();
        if (ccy == null) {
            ccy = "--";
        }
        textView.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy))));
        android.widget.TextView textView2 = c42943rfu.AEQbTJ;
        int i3 = qZH.PendingIntent.ODXsMY;
        java.lang.String ccy2 = c40009qFz.copydefault().getCcy();
        textView2.setText(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy2 != null ? ccy2 : "--"))));
        if (c40009qFz.EZpvd()) {
            c42943rfu.KWHzl.setVisibility(0);
            c42943rfu.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.qEI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    qEK.EZpvd(c42943rfu, c40009qFz, i, view);
                }
            });
        } else {
            c42943rfu.KWHzl.setVisibility(8);
        }
        if (c40009qFz.OLrzqt()) {
            c42943rfu.copydefault.setVisibility(0);
            c42943rfu.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.qEL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    qEK.copydefault(c42943rfu, c40009qFz, i, view);
                }
            });
        } else {
            c42943rfu.copydefault.setVisibility(8);
        }
        if (c42943rfu.copydefault.getVisibility() == 0 && c42943rfu.KWHzl.getVisibility() == 0) {
            c42943rfu.getRoot().post(new java.lang.Runnable() { // from class: o.qEM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    qEK.KWHzl(c42943rfu);
                }
            });
        }
    }

    public static final void EZpvd(C42943rfu c42943rfu, C40009qFz c40009qFz, int i, android.view.View view) {
        java.lang.Object objM7377constructorimpl;
        C40499qYc root = c42943rfu.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(root));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
        if (fragment != null) {
            boolean z = fragment instanceof qHM;
            java.lang.Object obj = fragment;
            if (!z) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof qHM)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                obj = (qHM) (parentFragment instanceof qHM ? parentFragment : null);
            }
            qHM qhm = (qHM) obj;
            if (qhm != null) {
                qhm.OLrzqt(c40009qFz.copydefault(), i);
            }
        }
    }

    public static final void copydefault(C42943rfu c42943rfu, C40009qFz c40009qFz, int i, android.view.View view) {
        java.lang.Object objM7377constructorimpl;
        C40499qYc root = c42943rfu.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(root));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
        if (fragment != null) {
            boolean z = fragment instanceof qHM;
            java.lang.Object obj = fragment;
            if (!z) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof qHM)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                obj = (qHM) (parentFragment instanceof qHM ? parentFragment : null);
            }
            qHM qhm = (qHM) obj;
            if (qhm != null) {
                qhm.AEQbTJ(c40009qFz.copydefault(), i);
            }
        }
    }

    public static final void KWHzl(C42943rfu c42943rfu) {
        int iMax = java.lang.Math.max(c42943rfu.copydefault.getHeight(), c42943rfu.KWHzl.getHeight());
        c42943rfu.copydefault.getLayoutParams().height = iMax;
        c42943rfu.KWHzl.getLayoutParams().height = iMax;
        c42943rfu.copydefault.requestLayout();
        c42943rfu.KWHzl.requestLayout();
    }
}
