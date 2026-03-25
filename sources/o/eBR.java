package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean;
import com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailTypeBinder$1;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eBR extends AbstractC14584doH<DefiWalletAccountDetailBean.ActionBar, C16711epA> {
    public final Function1<DefiWalletAccountDetailBean.AccountDetailType, Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<DefiWalletAccountDetailBean.AccountDetailType, Unit> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean$AccountDetailType, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eBR(@NotNull Function1<? super DefiWalletAccountDetailBean.AccountDetailType, Unit> function1) {
        super(DefiWalletAccountDetailTypeBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16711epA c16711epA, @NotNull DefiWalletAccountDetailBean.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(c16711epA, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        OKRegularCell oKRegularCell = c16711epA.OLrzqt;
        oKRegularCell.setTitle(actionBar.copydefault());
        oKRegularCell.EZpvd().setTextColor(ContextCompat.getColor(oKRegularCell.getContext(), actionBar.AEQbTJ()));
        oKRegularCell.setOnClickListener(new Application(oKRegularCell, 1000L, this, actionBar));
        C55068xcv c55068xcv = c16711epA.AEQbTJ;
        c55068xcv.setText(actionBar.OLrzqt());
        c55068xcv.setTextColor(ContextCompat.getColor(c55068xcv.getContext(), actionBar.EZpvd()));
        c55068xcv.setTypeface(ResourcesCompat.getFont(c55068xcv.getContext(), C52761wXj.Dialog.KWHzl));
        c16711epA.OLrzqt.setEnabled(true);
        c55068xcv.setCompoundDrawablePadding((int) C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c55068xcv.getContext(), C52761wXj.TaskDescription.QFTsTN);
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) C55298xhM.dp$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null), (int) C55298xhM.dp$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        }
        c55068xcv.setIcon(drawable);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ eBR EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ DefiWalletAccountDetailBean.ActionBar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, eBR ebr, DefiWalletAccountDetailBean.ActionBar actionBar) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = ebr;
            this.copydefault = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.OLrzqt().invoke(this.copydefault.KWHzl());
            }
        }
    }
}
