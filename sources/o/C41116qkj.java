package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41116qkj extends AbstractC40510qYn<C41122qkp, C42698rbN> {
    public final Function2<C41122qkp, java.lang.Integer, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super o.qkp, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41116qkj(@NotNull Function2<? super C41122qkp, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42698rbN AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42698rbN c42698rbNCopydefault = C42698rbN.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42698rbNCopydefault, "");
        return c42698rbNCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42698rbN c42698rbN, int i, @NotNull C41122qkp c41122qkp) {
        Intrinsics.checkNotNullParameter(c42698rbN, "");
        Intrinsics.checkNotNullParameter(c41122qkp, "");
        ConstraintLayout root = c42698rbN.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, c41122qkp, i));
        c42698rbN.gEmmrt.setText(c41122qkp.gEmmrt());
        c42698rbN.KWHzl.setText(c41122qkp.OLrzqt());
        android.widget.TextView textView = c42698rbN.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C41426qqb.setText$default(textView, c41122qkp.valueOf(), (java.lang.CharSequence) c41122qkp.OLrzqt(), 0, 0, 0, false, 60, (java.lang.Object) null);
        AEQbTJ(c42698rbN, c41122qkp);
        OLrzqt(c42698rbN, c41122qkp);
    }

    public final void AEQbTJ(C42698rbN c42698rbN, C41122qkp c41122qkp) {
        int i = 0;
        for (java.lang.Object obj : yDY.copydefault(c42698rbN.EZpvd, c42698rbN.AhwBna, c42698rbN.djBIcL)) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            android.widget.ImageView imageView = (android.widget.ImageView) obj;
            java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(c41122qkp.AYXKKw(), i);
            if (str == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                C40992qiR.Companion.OLrzqt(imageView, str);
            }
            i++;
        }
        java.lang.String strDjBIcL = c41122qkp.djBIcL();
        if (strDjBIcL == null || strDjBIcL.length() == 0) {
            android.widget.TextView textView = c42698rbN.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        } else {
            android.widget.TextView textView2 = c42698rbN.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            c42698rbN.copydefault.setText(c41122qkp.djBIcL());
        }
    }

    public final void OLrzqt(C42698rbN c42698rbN, C41122qkp c41122qkp) {
        java.lang.Boolean boolAhwBna = c41122qkp.AhwBna();
        if (boolAhwBna == null) {
            c42698rbN.OLrzqt.setVisibility(4);
            return;
        }
        c42698rbN.OLrzqt.setVisibility(0);
        C41084qkD c41084qkD = c42698rbN.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c41084qkD, "");
        C41088qkH.OLrzqt(c41084qkD, C33129mqd.djBIcL(java.lang.Integer.valueOf(C55298xhM.dp2px$default(11.0f, null, 1, null))));
        c42698rbN.OLrzqt.setData(c41122qkp.EZpvd(), boolAhwBna.booleanValue(), C52761wXj.Activity.aBDePw);
    }

    /* JADX INFO: renamed from: o.qkj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C41122qkp KWHzl;
        public final /* synthetic */ C41116qkj OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C41116qkj c41116qkj, C41122qkp c41122qkp, int i) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c41116qkj;
            this.KWHzl = c41122qkp;
            this.AEQbTJ = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.KWHzl.invoke(this.KWHzl, java.lang.Integer.valueOf(this.AEQbTJ));
            }
        }
    }
}
