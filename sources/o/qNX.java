package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qNX extends AbstractC40510qYn<C40249qOw, C42845reB> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42845reB AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42845reB c42845reBCopydefault = C42845reB.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42845reBCopydefault, "");
        return c42845reBCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42845reB c42845reB, int i, @NotNull C40249qOw c40249qOw) {
        Intrinsics.checkNotNullParameter(c42845reB, "");
        Intrinsics.checkNotNullParameter(c40249qOw, "");
        c42845reB.AEQbTJ.setText(qZH.PendingIntent.RJOkX);
        c42845reB.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.qNV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                qNX.copydefault(c42845reB, view);
            }
        });
    }

    public static final void copydefault(C42845reB c42845reB, android.view.View view) {
        android.widget.LinearLayout root = c42845reB.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC40230qOd interfaceC40230qOdCopydefault = C40227qOa.copydefault(root);
        if (interfaceC40230qOdCopydefault != null) {
            interfaceC40230qOdCopydefault.AYXKKw();
        }
        android.widget.LinearLayout root2 = c42845reB.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        qPT qptKWHzl = qPU.KWHzl(root2);
        if (qptKWHzl != null) {
            qptKWHzl.fJNWhG();
        }
    }
}
