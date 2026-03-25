package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.market.ext.UpDownColor;
import com.okinc.trade.arch.util.Quartet;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40693qck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qeq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40805qeq extends AbstractC40515qYs<InterfaceC41642quf, C42799rdI> {
    public static final int EZpvd = C41545qso.OLrzqt;
    public final C41545qso copydefault;

    public C40805qeq(@NotNull C41545qso c41545qso) {
        Intrinsics.checkNotNullParameter(c41545qso, "");
        this.copydefault = c41545qso;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42799rdI AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42799rdI c42799rdIOLrzqt = C42799rdI.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42799rdIOLrzqt, "");
        return c42799rdIOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull final C42799rdI c42799rdI, final int i, @NotNull final InterfaceC41642quf interfaceC41642quf) {
        Intrinsics.checkNotNullParameter(c42799rdI, "");
        Intrinsics.checkNotNullParameter(interfaceC41642quf, "");
        Quartet quartet = (Quartet) this.copydefault.EZpvd(interfaceC41642quf);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) quartet.component1();
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) quartet.component2();
        java.lang.CharSequence charSequence3 = (java.lang.CharSequence) quartet.component3();
        UpDownColor upDownColor = (UpDownColor) quartet.component4();
        c42799rdI.AYXKKw.setText(charSequence);
        c42799rdI.copydefault.setText(c42799rdI.getRoot().getContext().getText(interfaceC41642quf.EZpvd().getStringResId()));
        AppCompatTextView appCompatTextView = c42799rdI.AEQbTJ;
        if (charSequence2 == null) {
            charSequence2 = "--";
        }
        appCompatTextView.setText(charSequence2);
        c42799rdI.OLrzqt.setChangeRatioAndColor(charSequence3, upDownColor);
        ConstraintLayout root = c42799rdI.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c42799rdI, interfaceC41642quf, i));
        c42799rdI.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qes
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C40805qeq.AEQbTJ(c42799rdI, interfaceC41642quf, i, view);
            }
        });
    }

    public static final boolean AEQbTJ(C42799rdI c42799rdI, InterfaceC41642quf interfaceC41642quf, int i, android.view.View view) {
        ConstraintLayout root = c42799rdI.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC40693qck interfaceC40693qckKWHzl = C40695qcm.KWHzl(root);
        if (interfaceC40693qckKWHzl == null) {
            return true;
        }
        Intrinsics.copydefault(view);
        InterfaceC40693qck.Application.onLongClickInstrument$default(interfaceC40693qckKWHzl, view, interfaceC41642quf.OLrzqt(), i, false, 8, null);
        return true;
    }

    /* JADX INFO: renamed from: o.qeq$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ C42799rdI KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ InterfaceC41642quf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42799rdI c42799rdI, InterfaceC41642quf interfaceC41642quf, int i) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c42799rdI;
            this.copydefault = interfaceC41642quf;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ConstraintLayout root = this.KWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC38465pZu interfaceC38465pZuOLrzqt = C38462pZr.OLrzqt(root);
                if (interfaceC38465pZuOLrzqt != null) {
                    interfaceC38465pZuOLrzqt.OLrzqt("options", "contracts_list", this.copydefault.OLrzqt(), this.EZpvd, "Market_Options");
                }
                C46688tbr.KWHzl.KWHzl("Market_Options_Quote", C56423yEv.EZpvd(C56390yDp.OLrzqt("contracts_list", this.copydefault.OLrzqt().getInstId())));
            }
        }
    }
}
