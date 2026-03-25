package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41016qip extends AbstractC40515qYs<C41054qja, C42687rbC> {
    public final Function1<C41054qja, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.qja, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41016qip(@NotNull Function1<? super C41054qja, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42687rbC AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42687rbC c42687rbCCopydefault = C42687rbC.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42687rbCCopydefault, "");
        return c42687rbCCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C42687rbC c42687rbC, int i, @NotNull C41054qja c41054qja) {
        Intrinsics.checkNotNullParameter(c42687rbC, "");
        Intrinsics.checkNotNullParameter(c41054qja, "");
        c42687rbC.KWHzl.setText(c41054qja.KWHzl());
        c42687rbC.copydefault.setText(c41054qja.OLrzqt());
        c42687rbC.getRoot().setSelected(c41054qja.EZpvd());
        if (c41054qja.copydefault()) {
            android.widget.LinearLayout root = c42687rbC.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, this, c41054qja));
            c42687rbC.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            c42687rbC.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            return;
        }
        android.widget.LinearLayout root2 = c42687rbC.getRoot();
        root2.setOnClickListener(new StateListAnimator(root2, 1000L));
        c42687rbC.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        c42687rbC.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
    }

    /* JADX INFO: renamed from: o.qip$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C41054qja AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C41016qip copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C41016qip c41016qip, C41054qja c41054qja) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c41016qip;
            this.AEQbTJ = c41054qja;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.copydefault.invoke(this.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.qip$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j) {
            this.copydefault = view;
            this.KWHzl = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
            }
        }
    }
}
