package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C40870qgB extends AbstractC40510qYn<C40871qgC, C42731rbu> {
    public final Function2<java.lang.Integer, C40871qgC, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super o.qgC, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40870qgB(@NotNull Function2<? super java.lang.Integer, ? super C40871qgC, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42731rbu AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42731rbu c42731rbuAEQbTJ = C42731rbu.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42731rbuAEQbTJ, "");
        return c42731rbuAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42731rbu c42731rbu, int i, @NotNull C40871qgC c40871qgC) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(c42731rbu, "");
        Intrinsics.checkNotNullParameter(c40871qgC, "");
        ConstraintLayout root = c42731rbu.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, i, c40871qgC));
        java.lang.String strKWHzl = c40871qgC.KWHzl();
        if (strKWHzl == null || strKWHzl.length() == 0) {
            android.widget.ImageView imageView = c42731rbu.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
        } else {
            android.widget.ImageView imageView2 = c42731rbu.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(0);
            android.widget.ImageView imageView3 = c42731rbu.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            C33054mpH.loadUrl$default(imageView3, c40871qgC.KWHzl(), null, 0, 0, 14, null);
        }
        c42731rbu.copydefault.setText(c40871qgC.copydefault());
        c42731rbu.KWHzl.setText(c40871qgC.djBIcL());
        android.widget.TextView textView = c42731rbu.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C41426qqb.setText$default(textView, c40871qgC.AYXKKw(), (java.lang.CharSequence) c40871qgC.djBIcL(), 0, 0, 0, false, 60, (java.lang.Object) null);
        c42731rbu.AEQbTJ.setText(c40871qgC.AEQbTJ());
        java.lang.Integer numAhwBna = c40871qgC.AhwBna();
        if (numAhwBna != null && (strAYXKKw = C33070mpX.AYXKKw(numAhwBna.intValue())) != null) {
            c42731rbu.djBIcL.setText(strAYXKKw);
        }
        c42731rbu.valueOf.setText(c40871qgC.fetchVPNInfo());
    }

    /* JADX INFO: renamed from: o.qgB$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C40871qgC AEQbTJ;
        public final /* synthetic */ C40870qgB EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C40870qgB c40870qgB, int i, C40871qgC c40871qgC) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c40870qgB;
            this.copydefault = i;
            this.AEQbTJ = c40871qgC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ.invoke(java.lang.Integer.valueOf(this.copydefault), this.AEQbTJ);
            }
        }
    }
}
