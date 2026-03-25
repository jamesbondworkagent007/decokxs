package o;

import android.view.View;
import com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean;
import com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailLinkTypeBinder$1;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eBQ extends AbstractC14584doH<DefiWalletAccountDetailBean.TaskDescription, C16757epu> {
    public final Function1<DefiWalletAccountDetailBean.AccountDetailType, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<DefiWalletAccountDetailBean.AccountDetailType, Unit> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean$AccountDetailType, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eBQ(@NotNull Function1<? super DefiWalletAccountDetailBean.AccountDetailType, Unit> function1) {
        super(DefiWalletAccountDetailLinkTypeBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16757epu c16757epu, @NotNull DefiWalletAccountDetailBean.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(c16757epu, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        OKRegularCell oKRegularCell = c16757epu.KWHzl;
        oKRegularCell.setTitle(taskDescription.OLrzqt());
        oKRegularCell.setOnClickListener(new ActionBar(oKRegularCell, 1000L, this, taskDescription));
        C55390xiz c55390xiz = c16757epu.OLrzqt;
        c55390xiz.setText(taskDescription.KWHzl());
        c55390xiz.setOnClickListener(new StateListAnimator(c55390xiz, 1000L, this, taskDescription));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ DefiWalletAccountDetailBean.TaskDescription KWHzl;
        public final /* synthetic */ eBQ OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, eBQ ebq, DefiWalletAccountDetailBean.TaskDescription taskDescription) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = ebq;
            this.KWHzl = taskDescription;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.EZpvd().invoke(this.KWHzl.AEQbTJ());
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ eBQ AEQbTJ;
        public final /* synthetic */ DefiWalletAccountDetailBean.TaskDescription KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, eBQ ebq, DefiWalletAccountDetailBean.TaskDescription taskDescription) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = ebq;
            this.KWHzl = taskDescription;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd().invoke(this.KWHzl.AEQbTJ());
            }
        }
    }
}
