package o;

import android.view.View;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40693qck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qnR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41257qnR extends AbstractC40510qYn<C41334qop, C42806rdP> {
    public final CategoryGroupVo AEQbTJ;
    public final C41216qmd OLrzqt;
    public final C41524qsT copydefault;

    public C41257qnR(@NotNull CategoryGroupVo categoryGroupVo, @NotNull C41524qsT c41524qsT, @NotNull C41216qmd c41216qmd) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(c41524qsT, "");
        Intrinsics.checkNotNullParameter(c41216qmd, "");
        this.AEQbTJ = categoryGroupVo;
        this.copydefault = c41524qsT;
        this.OLrzqt = c41216qmd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42806rdP AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42806rdP c42806rdPKWHzl = C42806rdP.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42806rdPKWHzl, "");
        return c42806rdPKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42806rdP c42806rdP, final int i, @NotNull final C41334qop c41334qop) {
        Intrinsics.checkNotNullParameter(c42806rdP, "");
        Intrinsics.checkNotNullParameter(c41334qop, "");
        C41518qsN c41518qsN = (C41518qsN) this.copydefault.KWHzl(c41334qop);
        java.lang.CharSequence charSequenceOLrzqt = c41518qsN.OLrzqt();
        UpDownColor upDownColorAEQbTJ = c41518qsN.AEQbTJ();
        java.lang.CharSequence charSequenceCopydefault = c41518qsN.copydefault();
        java.lang.CharSequence charSequenceKWHzl = c41518qsN.KWHzl();
        c42806rdP.copydefault.setData(C56390yDp.OLrzqt(c41334qop.AYXKKw(), c41334qop.isConnected()), c41334qop.fetchVPNInfo() ? C56402yEa.EZpvd(c41334qop.AEQbTJ()) : null, KWHzl(c41518qsN.EZpvd(), c41334qop), charSequenceCopydefault == null ? "--" : charSequenceCopydefault, charSequenceKWHzl == null ? "--" : charSequenceKWHzl, c41334qop.copydefault(), charSequenceOLrzqt, upDownColorAEQbTJ, (3072 & 256) != 0 ? null : null, (3072 & 512) != 0 ? null : null, (3072 & 1024) != 0 ? java.lang.Boolean.FALSE : null, (3072 & 2048) != 0 ? "" : null);
        Intrinsics.checkNotNullExpressionValue(c42806rdP.AEQbTJ, "");
        c42806rdP.copydefault.setPriceViewsVisible(!C41310qoR.AEQbTJ(r1, c41334qop.values().getCountDownInfo(), c41334qop.values().getInstId(), c41334qop.values().getInstType()));
        android.widget.FrameLayout root = c42806rdP.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, c42806rdP, this, c41334qop, i));
        c42806rdP.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qnT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C41257qnR.OLrzqt(c42806rdP, c41334qop, i, view);
            }
        });
    }

    public static final boolean OLrzqt(C42806rdP c42806rdP, C41334qop c41334qop, int i, android.view.View view) {
        android.widget.FrameLayout root = c42806rdP.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC40693qck interfaceC40693qckKWHzl = C40695qcm.KWHzl(root);
        if (interfaceC40693qckKWHzl == null) {
            return true;
        }
        Intrinsics.copydefault(view);
        InterfaceC40693qck.Application.onLongClickInstrument$default(interfaceC40693qckKWHzl, view, c41334qop.values(), i, false, 8, null);
        return true;
    }

    public final java.lang.CharSequence KWHzl(java.lang.CharSequence charSequence, C41334qop c41334qop) {
        java.lang.String str;
        CategoryGroupVo categoryGroupVo = this.AEQbTJ;
        CategoryGroupVo.TaskDescription taskDescription = CategoryGroupVo.Companion;
        if (Intrinsics.EZpvd(categoryGroupVo, taskDescription.gEmmrt())) {
            return pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(c41334qop.values().getListTime())), null, 1, null);
        }
        if (Intrinsics.EZpvd(categoryGroupVo, taskDescription.copydefault())) {
            java.lang.String strOLrzqt = c41334qop.OLrzqt();
            if (strOLrzqt != null && (str = (java.lang.String) this.OLrzqt.KWHzl((java.lang.Object) strOLrzqt)) != null) {
                return str;
            }
        } else if (charSequence != null) {
            return charSequence;
        }
        return "--";
    }

    /* JADX INFO: renamed from: o.qnR$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C42806rdP EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ C41334qop copydefault;
        public final /* synthetic */ C41257qnR gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42806rdP c42806rdP, C41257qnR c41257qnR, C41334qop c41334qop, int i) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c42806rdP;
            this.gEmmrt = c41257qnR;
            this.copydefault = c41334qop;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.widget.FrameLayout root = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC38465pZu interfaceC38465pZuOLrzqt = C38462pZr.OLrzqt(root);
                if (interfaceC38465pZuOLrzqt != null) {
                    interfaceC38465pZuOLrzqt.OLrzqt("spot", C41301qoI.KWHzl.OLrzqt(this.gEmmrt.AEQbTJ), this.copydefault.values(), this.OLrzqt, "Market_Spot");
                }
            }
        }
    }
}
