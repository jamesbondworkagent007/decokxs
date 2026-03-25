package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.detail.binders.walletDetail.DefiWalletEditNameBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.eBX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eBZ extends AbstractC14584doH<eBX.Activity, AbstractC16717epG> {
    public final Function0<Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AEQbTJ() {
        return this.OLrzqt;
    }

    public eBZ(Function0<Unit> function0) {
        super(DefiWalletEditNameBinder$1.INSTANCE);
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull AbstractC16717epG abstractC16717epG, @NotNull eBX.Activity activity) {
        Intrinsics.checkNotNullParameter(abstractC16717epG, "");
        Intrinsics.checkNotNullParameter(activity, "");
        abstractC16717epG.copydefault.setText(activity.EZpvd());
        ConstraintLayout constraintLayout = abstractC16717epG.KWHzl;
        constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 1000L, this, abstractC16717epG));
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ eBZ KWHzl;
        public final /* synthetic */ AbstractC16717epG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, eBZ ebz, AbstractC16717epG abstractC16717epG) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = ebz;
            this.copydefault = abstractC16717epG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.EZpvd;
                Function0<Unit> function0AEQbTJ = this.KWHzl.AEQbTJ();
                if (function0AEQbTJ != null) {
                    function0AEQbTJ.invoke();
                }
                C13825dZr c13825dZr = C13825dZr.AEQbTJ;
                android.content.Context context = constraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ConstraintLayout constraintLayout2 = this.copydefault.KWHzl;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                c13825dZr.KWHzl(context, constraintLayout2);
            }
        }
    }
}
