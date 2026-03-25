package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.ViewKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qzd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41905qzd extends AbstractC39964qEh<C40005qFv, C42808rdR> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42808rdR AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42808rdR c42808rdRAEQbTJ = C42808rdR.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42808rdRAEQbTJ, "");
        return c42808rdRAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull final C42808rdR c42808rdR, final int i, @NotNull final C40005qFv c40005qFv) {
        Intrinsics.checkNotNullParameter(c42808rdR, "");
        Intrinsics.checkNotNullParameter(c40005qFv, "");
        c42808rdR.AEQbTJ.setText(c40005qFv.valueOf());
        c42808rdR.gEmmrt.setText(c40005qFv.AEQbTJ());
        c42808rdR.EZpvd.setText(c40005qFv.copydefault());
        android.widget.TextView textView = c42808rdR.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C41426qqb.setText$default(textView, c40005qFv.OLrzqt(), (java.lang.CharSequence) c40005qFv.gEmmrt(), 0, 0, 0, false, 60, (java.lang.Object) null);
        C41431qqg.AEQbTJ(c42808rdR.copydefault, true, (Function1<? super AppCompatImageView, Unit>) new Function1() { // from class: o.qze
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41905qzd.AEQbTJ(c40005qFv, (AppCompatImageView) obj);
            }
        });
        c42808rdR.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.qzi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C41905qzd.EZpvd(c40005qFv, c42808rdR, i, view);
            }
        });
    }

    public static final Unit AEQbTJ(C40005qFv c40005qFv, AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        appCompatImageView.setEnabled(!c40005qFv.AkhnZx());
        appCompatImageView.setSelected(c40005qFv.AhwBna());
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C40005qFv c40005qFv, C42808rdR c42808rdR, int i, android.view.View view) {
        java.lang.Object objM7377constructorimpl;
        if (c40005qFv.AkhnZx()) {
            return;
        }
        c42808rdR.copydefault.setSelected(!r5.isSelected());
        C40499qYc root = c42808rdR.getRoot();
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
            boolean z = fragment instanceof InterfaceC41923qzv;
            java.lang.Object obj = fragment;
            if (!z) {
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof InterfaceC41923qzv)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                obj = (InterfaceC41923qzv) (parentFragment instanceof InterfaceC41923qzv ? parentFragment : null);
            }
            InterfaceC41923qzv interfaceC41923qzv = (InterfaceC41923qzv) obj;
            if (interfaceC41923qzv != null) {
                interfaceC41923qzv.KWHzl(i, c40005qFv.KWHzl(), c42808rdR.copydefault.isSelected());
            }
        }
        c40005qFv.AEQbTJ(c42808rdR.copydefault.isSelected());
    }
}
