package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.okinc.business.defi.biz.model.wallet.EsCapeData;
import com.okinc.business.defi.wallet.mpc.binders.MpcWalletAccountEscapeBinder$1;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fJe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17542fJe extends AbstractC14584doH<EsCapeData, C16799eqj> {
    public final Function1<EsCapeData, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<EsCapeData, Unit> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.model.wallet.EsCapeData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17542fJe(Function1<? super EsCapeData, Unit> function1) {
        super(MpcWalletAccountEscapeBinder$1.INSTANCE);
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    public void OLrzqt(@NotNull C16799eqj c16799eqj, @NotNull EsCapeData esCapeData) {
        Intrinsics.checkNotNullParameter(c16799eqj, "");
        Intrinsics.checkNotNullParameter(esCapeData, "");
        OKRegularCell oKRegularCell = c16799eqj.EZpvd;
        oKRegularCell.setTitle(esCapeData.getAccountName());
        oKRegularCell.setDescription(esCapeData.getAddress());
        oKRegularCell.setIconTint(null);
        C14725dqq.copydefault(oKRegularCell.OLrzqt(), esCapeData.getAddress(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17542fJe.AEQbTJ((C5335Nt) obj);
            }
        }, 32.0f);
        oKRegularCell.setOnClickListener(new StateListAnimator(oKRegularCell, 1000L, this, esCapeData));
        android.widget.TextView textView = c16799eqj.OLrzqt;
        if (esCapeData.isCopied()) {
            textView.setText(textView.getContext().getString(C13754dXa.FragmentManager.BackHandlerKtBackHandler2invokeinlinedonDispose1));
            textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            textView.setCompoundDrawablesRelative(null, null, null, null);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.unregister));
            return;
        }
        textView.setText(textView.getContext().getString(C13754dXa.FragmentManager.ComponentActivityKt));
        textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C55298xhM.dp2pxFloat$default(6.0f, null, 1, null));
        gradientDrawable.setColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DQzvGN));
        gradientDrawable.setBounds(0, 0, C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        textView.setCompoundDrawablesRelative(gradientDrawable, null, null, null);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DQzvGN));
    }

    public static final Unit AEQbTJ(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fJe$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C17542fJe AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ EsCapeData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C17542fJe c17542fJe, EsCapeData esCapeData) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c17542fJe;
            this.copydefault = esCapeData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1<EsCapeData, Unit> function1EZpvd = this.AEQbTJ.EZpvd();
                if (function1EZpvd != null) {
                    function1EZpvd.invoke(this.copydefault);
                }
            }
        }
    }
}
