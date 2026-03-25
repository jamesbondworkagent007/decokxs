package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.tx.history.segwit.AddressSwitchItemViewBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19431gCc extends AbstractC19608gIr<C19437gCi, C16495ekx> {
    public final Function1<C19437gCi, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.gCi, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19431gCc(@NotNull Function1<? super C19437gCi, Unit> function1) {
        super(AddressSwitchItemViewBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    public void EZpvd(@NotNull C16495ekx c16495ekx, @NotNull C19437gCi c19437gCi) {
        Intrinsics.checkNotNullParameter(c16495ekx, "");
        Intrinsics.checkNotNullParameter(c19437gCi, "");
        c16495ekx.AEQbTJ.setEnabled(c19437gCi.fetchVPNInfo());
        c16495ekx.AEQbTJ.setSelected(c19437gCi.AYXKKw());
        C55251xgS c55251xgS = c16495ekx.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(c19437gCi.AYXKKw() ? 0 : 8);
        c16495ekx.EZpvd.setText(c19437gCi.OLrzqt());
        AppCompatImageView appCompatImageView = c16495ekx.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strDjBIcL = c19437gCi.djBIcL();
        int i = C52761wXj.TaskDescription.aHXSQp;
        C33054mpH.KWHzl(appCompatImageView, strDjBIcL, i, i);
        if (c19437gCi.AhwBna()) {
            android.widget.TextView textView = c16495ekx.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            C52794wYp c52794wYp = c16495ekx.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(0);
            C52794wYp c52794wYp2 = c16495ekx.OLrzqt;
            c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this, c19437gCi));
            return;
        }
        android.widget.TextView textView2 = c16495ekx.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        C52794wYp c52794wYp3 = c16495ekx.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
        c52794wYp3.setVisibility(8);
        if (c19437gCi.fetchVPNInfo()) {
            c16495ekx.KWHzl.setText(c19437gCi.copydefault());
            ConstraintLayout root = c16495ekx.getRoot();
            root.setOnClickListener(new Application(root, 1000L, c19437gCi, this));
            return;
        }
        c16495ekx.KWHzl.setText(c19437gCi.AEQbTJ());
    }

    /* JADX INFO: renamed from: o.gCc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C19431gCc AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C19437gCi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C19437gCi c19437gCi, C19431gCc c19431gCc) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c19437gCi;
            this.AEQbTJ = c19431gCc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.copydefault.AYXKKw()) {
                    return;
                }
                this.AEQbTJ.KWHzl.invoke(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.gCc$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C19431gCc EZpvd;
        public final /* synthetic */ C19437gCi KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C19431gCc c19431gCc, C19437gCi c19437gCi) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c19431gCc;
            this.KWHzl = c19437gCi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityC21325gxd.Companion.OLrzqt(true);
                this.EZpvd.KWHzl.invoke(this.KWHzl);
            }
        }
    }
}
