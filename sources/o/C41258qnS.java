package o;

import android.view.View;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qnS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41258qnS extends AbstractC40510qYn<C41325qog, C42795rdE> {
    public static final int AEQbTJ = CategoryGroupVo.KWHzl | C41407qqI.EZpvd;
    public final CategoryGroupVo EZpvd;
    public final C41407qqI KWHzl;

    public C41258qnS(@NotNull C41407qqI c41407qqI, @NotNull CategoryGroupVo categoryGroupVo) {
        Intrinsics.checkNotNullParameter(c41407qqI, "");
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        this.KWHzl = c41407qqI;
        this.EZpvd = categoryGroupVo;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42795rdE AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42795rdE c42795rdEKWHzl = C42795rdE.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42795rdEKWHzl, "");
        return c42795rdEKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42795rdE c42795rdE, final int i, @NotNull final C41325qog c41325qog) {
        Intrinsics.checkNotNullParameter(c42795rdE, "");
        Intrinsics.checkNotNullParameter(c41325qog, "");
        Triple triple = (Triple) this.KWHzl.copydefault(c41325qog);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) triple.component1();
        UpDownColor upDownColor = (UpDownColor) triple.component2();
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) triple.component3();
        c42795rdE.getRoot().setData(C56390yDp.OLrzqt(c41325qog.EZpvd(), ""), C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.gkJEwt)), c41325qog.OLrzqt(), charSequence2 == null ? "--" : charSequence2, null, c41325qog.AEQbTJ(), charSequence, upDownColor, (3072 & 256) != 0 ? null : null, (3072 & 512) != 0 ? null : null, (3072 & 1024) != 0 ? java.lang.Boolean.FALSE : null, (3072 & 2048) != 0 ? "" : null);
        C41375qpd root = c42795rdE.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, c42795rdE, c41325qog, i, this));
        c42795rdE.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qnV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C41258qnS.KWHzl(c42795rdE, c41325qog, i, view);
            }
        });
    }

    public static final boolean KWHzl(C42795rdE c42795rdE, C41325qog c41325qog, int i, android.view.View view) {
        C41375qpd root = c42795rdE.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC40693qck interfaceC40693qckKWHzl = C40695qcm.KWHzl(root);
        if (interfaceC40693qckKWHzl == null) {
            return true;
        }
        Intrinsics.copydefault(view);
        interfaceC40693qckKWHzl.EZpvd(view, c41325qog.djBIcL(), i);
        return true;
    }

    /* JADX INFO: renamed from: o.qnS$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C41258qnS AhwBna;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C41325qog KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ C42795rdE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42795rdE c42795rdE, C41325qog c41325qog, int i, C41258qnS c41258qnS) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c42795rdE;
            this.KWHzl = c41325qog;
            this.OLrzqt = i;
            this.AhwBna = c41258qnS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C41375qpd root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC38465pZu interfaceC38465pZuOLrzqt = C38462pZr.OLrzqt(root);
                if (interfaceC38465pZuOLrzqt != null) {
                    interfaceC38465pZuOLrzqt.AEQbTJ(this.KWHzl.djBIcL(), this.OLrzqt, C41301qoI.KWHzl.OLrzqt(this.AhwBna.EZpvd));
                }
            }
        }
    }
}
