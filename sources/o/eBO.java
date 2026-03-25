package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean;
import com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailContentBinder$1;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eBO extends AbstractC14584doH<DefiWalletAccountDetailBean.Activity, C16759epw> {
    public final Function1<DefiWalletAccountDetailBean.AccountContentType, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<DefiWalletAccountDetailBean.AccountContentType, Unit> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean$AccountContentType, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eBO(@NotNull Function1<? super DefiWalletAccountDetailBean.AccountContentType, Unit> function1) {
        super(DefiWalletAccountDetailContentBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    public void OLrzqt(@NotNull C16759epw c16759epw, @NotNull DefiWalletAccountDetailBean.Activity activity) {
        Intrinsics.checkNotNullParameter(c16759epw, "");
        Intrinsics.checkNotNullParameter(activity, "");
        OKRegularCell oKRegularCell = c16759epw.AEQbTJ;
        oKRegularCell.setTitle(activity.copydefault());
        oKRegularCell.setDescription(activity.KWHzl());
        oKRegularCell.setOnClickListener(new ActionBar(oKRegularCell, 1000L, this, activity));
        android.widget.ImageView imageView = c16759epw.OLrzqt;
        if (activity.AEQbTJ() == DefiWalletAccountDetailBean.AccountContentType.AccountAddress) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(imageView.getContext(), C52761wXj.TaskDescription.tIwhY);
            if (drawable != null) {
                drawable.setBounds(0, 0, imageView.getWidth(), imageView.getWidth());
            }
            if (drawable != null) {
                DrawableCompat.setTint(drawable, ContextCompat.getColor(imageView.getContext(), C52761wXj.Activity.fdOvFl));
            }
            imageView.setImageDrawable(drawable);
            return;
        }
        android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(imageView.getContext(), C52761wXj.TaskDescription.DGUQLI);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, imageView.getWidth(), imageView.getWidth());
        }
        if (drawable2 != null) {
            DrawableCompat.setTint(drawable2, ContextCompat.getColor(imageView.getContext(), C52761wXj.Activity.QwvEab));
        }
        imageView.setImageDrawable(drawable2);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ eBO AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ DefiWalletAccountDetailBean.Activity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, eBO ebo, DefiWalletAccountDetailBean.Activity activity) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = ebo;
            this.copydefault = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.copydefault().invoke(this.copydefault.AEQbTJ());
            }
        }
    }
}
