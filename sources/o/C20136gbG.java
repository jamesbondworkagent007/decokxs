package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.transaction.ui.binders.MultipleRpcUrlChooseBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gbG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20136gbG extends AbstractC14584doH<java.lang.String, C16789eqZ> {
    public final Function1<java.lang.String, Unit> AEQbTJ;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20136gbG(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
        super(MultipleRpcUrlChooseBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = str;
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16789eqZ c16789eqZ, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c16789eqZ, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConstraintLayout root = c16789eqZ.getRoot();
        if (Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) str)) {
            c16789eqZ.KWHzl.setImageResource(C52761wXj.TaskDescription.gqESXP);
        } else {
            c16789eqZ.KWHzl.setImageResource(C52761wXj.TaskDescription.QqiRNA);
        }
        c16789eqZ.AEQbTJ.setText(str.length() == 0 ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.UiThread) : str);
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, str));
    }

    /* JADX INFO: renamed from: o.gbG$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C20136gbG OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C20136gbG c20136gbG, java.lang.String str) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c20136gbG;
            this.copydefault = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.copydefault = this.copydefault;
                this.OLrzqt.OLrzqt().invoke(this.copydefault);
            }
        }
    }
}
