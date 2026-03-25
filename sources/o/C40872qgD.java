package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C40992qiR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40872qgD extends AbstractC40510qYn<C40871qgC, C42736rbz> {
    public final Function2<java.lang.Integer, C40871qgC, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super o.qgC, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40872qgD(@NotNull Function2<? super java.lang.Integer, ? super C40871qgC, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42736rbz AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42736rbz c42736rbzOLrzqt = C42736rbz.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42736rbzOLrzqt, "");
        return c42736rbzOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42736rbz c42736rbz, int i, @NotNull C40871qgC c40871qgC) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(c42736rbz, "");
        Intrinsics.checkNotNullParameter(c40871qgC, "");
        ConstraintLayout root = c42736rbz.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, i, c40871qgC));
        C40992qiR.Application application = C40992qiR.Companion;
        android.widget.ImageView imageView = c42736rbz.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        application.OLrzqt(imageView, c40871qgC.KWHzl());
        c42736rbz.AEQbTJ.setText(c40871qgC.copydefault());
        c42736rbz.EZpvd.setText(c40871qgC.djBIcL());
        android.widget.TextView textView = c42736rbz.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C41426qqb.setText$default(textView, c40871qgC.AYXKKw(), (java.lang.CharSequence) c40871qgC.djBIcL(), 0, 0, 0, false, 60, (java.lang.Object) null);
        c42736rbz.OLrzqt.setText(c40871qgC.AEQbTJ());
        java.lang.Integer numAhwBna = c40871qgC.AhwBna();
        if (numAhwBna != null && (strAYXKKw = C33070mpX.AYXKKw(numAhwBna.intValue())) != null) {
            c42736rbz.djBIcL.setText(strAYXKKw);
        }
        c42736rbz.gEmmrt.setText(c40871qgC.fetchVPNInfo());
    }

    /* JADX INFO: renamed from: o.qgD$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C40872qgD AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C40871qgC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C40872qgD c40872qgD, int i, C40871qgC c40871qgC) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c40872qgD;
            this.KWHzl = i;
            this.copydefault = c40871qgC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ.invoke(java.lang.Integer.valueOf(this.KWHzl), this.copydefault);
            }
        }
    }
}
