package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.detail.binders.walletDetail.DefiWalletDetailAddWalletBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.eBX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eBT extends AbstractC14584doH<eBX.StateListAnimator, C16699eop> {
    public final Function0<Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AEQbTJ() {
        return this.EZpvd;
    }

    public eBT(Function0<Unit> function0) {
        super(DefiWalletDetailAddWalletBinder$1.INSTANCE);
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16699eop c16699eop, @NotNull eBX.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(c16699eop, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        c16699eop.OLrzqt.setText(stateListAnimator.KWHzl());
        ConstraintLayout constraintLayout = c16699eop.AEQbTJ;
        constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 1000L, this, c16699eop));
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C16699eop AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ eBT copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, eBT ebt, C16699eop c16699eop) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = ebt;
            this.AEQbTJ = c16699eop;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.OLrzqt;
                Function0<Unit> function0AEQbTJ = this.copydefault.AEQbTJ();
                if (function0AEQbTJ != null) {
                    function0AEQbTJ.invoke();
                }
                C13825dZr c13825dZr = C13825dZr.AEQbTJ;
                android.content.Context context = constraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ConstraintLayout constraintLayout2 = this.AEQbTJ.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                c13825dZr.KWHzl(context, constraintLayout2);
            }
        }
    }
}
