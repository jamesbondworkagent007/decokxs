package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jTQ extends AbstractC40510qYn<C26178jUv, C42871reb> {
    public final Function1<java.lang.Boolean, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jTQ(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42871reb AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42871reb c42871rebCopydefault = C42871reb.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42871rebCopydefault, "");
        return c42871rebCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42871reb c42871reb, int i, @NotNull C26178jUv c26178jUv) {
        Intrinsics.checkNotNullParameter(c42871reb, "");
        Intrinsics.checkNotNullParameter(c26178jUv, "");
        c42871reb.KWHzl.setImageResource(c26178jUv.OLrzqt() ? C52761wXj.TaskDescription.fVjYLc : C52761wXj.TaskDescription.dbwnZN);
        android.widget.LinearLayout root = c42871reb.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, c26178jUv));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C26178jUv OLrzqt;
        public final /* synthetic */ jTQ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, jTQ jtq, C26178jUv c26178jUv) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = jtq;
            this.OLrzqt = c26178jUv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.KWHzl.invoke(java.lang.Boolean.valueOf(!this.OLrzqt.OLrzqt()));
            }
        }
    }
}
