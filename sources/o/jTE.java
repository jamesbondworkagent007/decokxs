package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jTE extends AbstractC40515qYs<C26169jUm, C42809rdS> {
    public final yHO<java.lang.Integer, java.lang.Boolean, C26169jUm, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super o.jUm, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jTE(@NotNull yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super C26169jUm, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.EZpvd = yho;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42809rdS AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42809rdS c42809rdSCopydefault = C42809rdS.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42809rdSCopydefault, "");
        return c42809rdSCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull final C42809rdS c42809rdS, final int i, @NotNull final C26169jUm c26169jUm) {
        Intrinsics.checkNotNullParameter(c42809rdS, "");
        Intrinsics.checkNotNullParameter(c26169jUm, "");
        c42809rdS.EZpvd.setText(c26169jUm.copydefault());
        android.widget.ImageView imageView = c42809rdS.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        AEQbTJ(imageView, c26169jUm);
        c42809rdS.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.jTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jTE.OLrzqt(c26169jUm, this, c42809rdS, i, view);
            }
        });
    }

    public static final void OLrzqt(C26169jUm c26169jUm, jTE jte, C42809rdS c42809rdS, int i, android.view.View view) {
        c26169jUm.KWHzl(!c26169jUm.OLrzqt());
        android.widget.ImageView imageView = c42809rdS.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        jte.AEQbTJ(imageView, c26169jUm);
        jte.EZpvd.invoke(java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(c26169jUm.OLrzqt()), c26169jUm);
    }

    public final void AEQbTJ(android.widget.ImageView imageView, C26169jUm c26169jUm) {
        imageView.setImageResource(c26169jUm.OLrzqt() ? C52761wXj.TaskDescription.fVjYLc : C52761wXj.TaskDescription.dbwnZN);
    }
}
