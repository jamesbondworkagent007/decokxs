package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qNK extends AbstractC40510qYn<C40236qOj, C42897rfA> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42897rfA AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42897rfA c42897rfACopydefault = C42897rfA.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42897rfACopydefault, "");
        return c42897rfACopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull C42897rfA c42897rfA, int i, @NotNull C40236qOj c40236qOj) {
        Intrinsics.checkNotNullParameter(c42897rfA, "");
        Intrinsics.checkNotNullParameter(c40236qOj, "");
        android.widget.LinearLayout root = c42897rfA.getRoot();
        root.setOnClickListener(new Application(root, 1000L, c42897rfA));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C42897rfA KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42897rfA c42897rfA) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c42897rfA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.widget.LinearLayout root = this.KWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    qplAEQbTJ.AEQbTJ();
                }
            }
        }
    }
}
