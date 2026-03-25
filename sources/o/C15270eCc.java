package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.okinc.business.defi.wallet.detail.binders.walletDetail.DefiWalletEscapeBinder$1;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.eBX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15270eCc extends AbstractC14584doH<eBX.TaskDescription, C16799eqj> {
    public final Function1<AbstractC12784ctX, Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AbstractC12784ctX, Unit> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctX, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C15270eCc(Function1<? super AbstractC12784ctX, Unit> function1) {
        super(DefiWalletEscapeBinder$1.INSTANCE);
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16799eqj c16799eqj, @NotNull eBX.TaskDescription taskDescription) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(c16799eqj, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        OKRegularCell oKRegularCell = c16799eqj.EZpvd;
        oKRegularCell.setTitle(taskDescription.EZpvd());
        oKRegularCell.setIcon(taskDescription.OLrzqt());
        oKRegularCell.setOnClickListener(new StateListAnimator(oKRegularCell, 1000L, this, taskDescription));
        android.widget.TextView textView = c16799eqj.OLrzqt;
        if (!taskDescription.KWHzl().getNewProxyInstance()) {
            textView.setText("");
            return;
        }
        int i = 0;
        int i2 = 0;
        for (AbstractC12782ctV abstractC12782ctV : taskDescription.KWHzl().KWHzl()) {
            if (abstractC12782ctV.fERRXa()) {
                i2++;
            }
            if (!abstractC12782ctV.wlaJM()) {
                i++;
            }
        }
        if (i == i2) {
            textView.setText(textView.getContext().getString(C13754dXa.FragmentManager.BackHandlerKtBackHandler2invokeinlinedonDispose1));
            textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            textView.setCompoundDrawablesRelative(null, null, null, null);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DcMfJK));
            return;
        }
        if (i2 == 0) {
            strKWHzl = textView.getContext().getString(C13754dXa.FragmentManager.ComponentActivityKt);
        } else {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            strKWHzl = C33069mpW.KWHzl(context, C13754dXa.FragmentManager.BackHandlerKtBackHandlerbackCallback11, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i - i2))));
        }
        textView.setText(strKWHzl);
        textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C55298xhM.dp2pxFloat$default(6.0f, null, 1, null));
        gradientDrawable.setColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DQzvGN));
        gradientDrawable.setBounds(0, 0, C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        textView.setCompoundDrawablesRelative(gradientDrawable, null, null, null);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DQzvGN));
    }

    /* JADX INFO: renamed from: o.eCc$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C15270eCc EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ eBX.TaskDescription OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C15270eCc c15270eCc, eBX.TaskDescription taskDescription) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c15270eCc;
            this.OLrzqt = taskDescription;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1<AbstractC12784ctX, Unit> function1EZpvd = this.EZpvd.EZpvd();
                if (function1EZpvd != null) {
                    function1EZpvd.invoke(this.OLrzqt.KWHzl());
                }
            }
        }
    }
}
