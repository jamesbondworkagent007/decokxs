package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.okinc.business.defi.wallet.detail.binders.walletDetail.DefiWalletBackupTypeBinder$1;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.eBX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eBV extends AbstractC14584doH<eBX.ActionBar, C16712epB> {
    public final Function1<java.lang.Integer, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.Integer, Unit> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public eBV(Function1<? super java.lang.Integer, Unit> function1) {
        super(DefiWalletBackupTypeBinder$1.INSTANCE);
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16712epB c16712epB, @NotNull eBX.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(c16712epB, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        OKRegularCell oKRegularCell = c16712epB.EZpvd;
        oKRegularCell.setTitle(actionBar.KWHzl());
        oKRegularCell.setIcon(actionBar.OLrzqt());
        if (actionBar.copydefault() != 2 || !actionBar.AEQbTJ()) {
            oKRegularCell.setOnClickListener(new TaskDescription(oKRegularCell, 1000L, this, actionBar));
        }
        android.widget.TextView textView = c16712epB.KWHzl;
        int i = 0;
        if (actionBar.AEQbTJ()) {
            textView.setText((actionBar.copydefault() == 0 || actionBar.copydefault() == 2) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSessionDestroyed) : "");
            textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            textView.setCompoundDrawablesRelative(null, null, null, null);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.dvKsVJ));
        } else {
            textView.setText(textView.getContext().getString(C13754dXa.FragmentManager.getMetadata));
            textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C55298xhM.dp2pxFloat$default(6.0f, null, 1, null));
            gradientDrawable.setColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DQzvGN));
            gradientDrawable.setBounds(0, 0, C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            textView.setCompoundDrawablesRelative(gradientDrawable, null, null, null);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DQzvGN));
        }
        android.widget.ImageView imageView = c16712epB.AEQbTJ;
        if (actionBar.AEQbTJ() && actionBar.copydefault() == 2) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ eBX.ActionBar AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ eBV OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, eBV ebv, eBX.ActionBar actionBar) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = ebv;
            this.AEQbTJ = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1<java.lang.Integer, Unit> function1OLrzqt = this.OLrzqt.OLrzqt();
                if (function1OLrzqt != null) {
                    function1OLrzqt.invoke(java.lang.Integer.valueOf(this.AEQbTJ.copydefault()));
                }
            }
        }
    }
}
