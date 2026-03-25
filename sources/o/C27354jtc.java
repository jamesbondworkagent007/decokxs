package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.ProtocolListRewardItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC27286jsN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27354jtc extends AbstractC27119jpF<C27373jtv, C23765iIm> {
    public final InterfaceC27287jsO copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27354jtc(@NotNull InterfaceC27287jsO interfaceC27287jsO) {
        super(ProtocolListRewardItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(interfaceC27287jsO, "");
        this.copydefault = interfaceC27287jsO;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23765iIm c23765iIm, @NotNull C27373jtv c27373jtv) {
        Intrinsics.checkNotNullParameter(c23765iIm, "");
        Intrinsics.checkNotNullParameter(c27373jtv, "");
        c23765iIm.KWHzl.setText(C27488jwD.copydefault.KWHzl(c27373jtv.KWHzl()));
        ConstraintLayout root = c23765iIm.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, c27373jtv));
    }

    /* JADX INFO: renamed from: o.jtc$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C27354jtc AEQbTJ;
        public final /* synthetic */ C27373jtv EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C27354jtc c27354jtc, C27373jtv c27373jtv) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c27354jtc;
            this.EZpvd = c27373jtv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                InterfaceC9738bbJ interfaceC9738bbJOLrzqt = C23580iBq.AEQbTJ.OLrzqt();
                if ((interfaceC9738bbJOLrzqt != null && interfaceC9738bbJOLrzqt.QfsBiF()) || C24193iYi.OLrzqt.AEQbTJ()) {
                    this.AEQbTJ.copydefault.OLrzqt(InterfaceC27286jsN.Application.KWHzl);
                } else {
                    this.AEQbTJ.copydefault.OLrzqt(new InterfaceC27286jsN.Dialog(this.EZpvd.OLrzqt(), this.EZpvd.copydefault()));
                }
            }
        }
    }
}
