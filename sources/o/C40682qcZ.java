package o;

import android.view.View;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C35966oKh;
import o.C52761wXj;
import o.InterfaceC40693qck;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qcZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40682qcZ extends AbstractC40510qYn<C40752qdq, C42801rdK> {
    public final C41216qmd AEQbTJ;
    public final C41465qrN KWHzl;
    public final CategoryGroupVo OLrzqt;

    public C40682qcZ(@NotNull CategoryGroupVo categoryGroupVo, @NotNull C41465qrN c41465qrN, @NotNull C41216qmd c41216qmd) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(c41465qrN, "");
        Intrinsics.checkNotNullParameter(c41216qmd, "");
        this.OLrzqt = categoryGroupVo;
        this.KWHzl = c41465qrN;
        this.AEQbTJ = c41216qmd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42801rdK AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42801rdK c42801rdKKWHzl = C42801rdK.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42801rdKKWHzl, "");
        return c42801rdKKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42801rdK c42801rdK, final int i, @NotNull final C40752qdq c40752qdq) {
        java.lang.String strValueOf;
        java.util.List list;
        java.util.List listEZpvd;
        Intrinsics.checkNotNullParameter(c42801rdK, "");
        Intrinsics.checkNotNullParameter(c40752qdq, "");
        C41461qrJ c41461qrJ = (C41461qrJ) this.KWHzl.OLrzqt((java.lang.Object) c40752qdq);
        java.lang.CharSequence charSequenceCopydefault = c41461qrJ.copydefault();
        java.lang.CharSequence charSequenceEZpvd = c41461qrJ.EZpvd();
        UpDownColor upDownColorOLrzqt = c41461qrJ.OLrzqt();
        java.lang.CharSequence charSequenceKWHzl = c41461qrJ.KWHzl();
        kotlin.Pair<java.lang.CharSequence, java.lang.Boolean> pairAEQbTJ = c41461qrJ.AEQbTJ();
        java.lang.CharSequence charSequenceAYXKKw = c41461qrJ.AYXKKw();
        if (c40752qdq.values().isPreMarketPair() && Intrinsics.EZpvd((java.lang.Object) c40752qdq.values().getInstType(), (java.lang.Object) "FUTURES")) {
            strValueOf = C33069mpW.copydefault(C35966oKh.TaskDescription.gEmmrt, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", java.lang.String.valueOf(charSequenceCopydefault))));
        } else {
            strValueOf = java.lang.String.valueOf(charSequenceCopydefault);
        }
        if (c40752qdq.values() instanceof SwapInstrument) {
            if (((SwapInstrument) c40752qdq.values()).isPreMarketPair()) {
                listEZpvd = yDY.gEmmrt(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ), C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz));
            } else {
                listEZpvd = C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ));
            }
            list = listEZpvd;
        } else {
            list = null;
        }
        java.lang.CharSequence charSequenceComponent1 = pairAEQbTJ.component1();
        c42801rdK.KWHzl.setData(C56390yDp.OLrzqt(strValueOf, ""), list, EZpvd(charSequenceAYXKKw, c40752qdq), charSequenceKWHzl == null ? "--" : charSequenceKWHzl, pairAEQbTJ.component2().booleanValue() ? charSequenceComponent1 == null ? "--" : charSequenceComponent1 : null, c40752qdq.OLrzqt(), charSequenceEZpvd, upDownColorOLrzqt, (3072 & 256) != 0 ? null : java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), (3072 & 512) != 0 ? null : java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ), (3072 & 1024) != 0 ? java.lang.Boolean.FALSE : null, (3072 & 2048) != 0 ? "" : null);
        Intrinsics.checkNotNullExpressionValue(c42801rdK.copydefault, "");
        c42801rdK.KWHzl.setPriceViewsVisible(!C41310qoR.AEQbTJ(r1, c40752qdq.values().getCountDownInfo(), c40752qdq.values().getInstId(), c40752qdq.values().getInstType()));
        android.widget.FrameLayout root = c42801rdK.getRoot();
        root.setOnClickListener(new Application(root, 1000L, c42801rdK, this, c40752qdq, i));
        c42801rdK.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qda
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C40682qcZ.copydefault(c42801rdK, c40752qdq, i, view);
            }
        });
    }

    public static final boolean copydefault(C42801rdK c42801rdK, C40752qdq c40752qdq, int i, android.view.View view) {
        android.widget.FrameLayout root = c42801rdK.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC40693qck interfaceC40693qckKWHzl = C40695qcm.KWHzl(root);
        if (interfaceC40693qckKWHzl == null) {
            return true;
        }
        Intrinsics.copydefault(view);
        InterfaceC40693qck.Application.onLongClickInstrument$default(interfaceC40693qckKWHzl, view, c40752qdq.values(), i, false, 8, null);
        return true;
    }

    public final java.lang.CharSequence EZpvd(java.lang.CharSequence charSequence, C40752qdq c40752qdq) {
        CategoryGroupVo categoryGroupVo = this.OLrzqt;
        CategoryGroupVo.TaskDescription taskDescription = CategoryGroupVo.Companion;
        if (Intrinsics.EZpvd(categoryGroupVo, taskDescription.gEmmrt())) {
            BizInstrument bizInstrumentValues = c40752qdq.values();
            SwapInstrument swapInstrument = bizInstrumentValues instanceof SwapInstrument ? (SwapInstrument) bizInstrumentValues : null;
            return pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(swapInstrument != null ? swapInstrument.getListTime() : null)), null, 1, null);
        }
        if (Intrinsics.EZpvd(categoryGroupVo, taskDescription.copydefault())) {
            java.lang.String strEZpvd = c40752qdq.EZpvd();
            java.lang.String str = strEZpvd != null ? (java.lang.String) this.AEQbTJ.KWHzl((java.lang.Object) strEZpvd) : null;
            if (str != null) {
                return str;
            }
        } else if (charSequence != null) {
            return charSequence;
        }
        return "--";
    }

    /* JADX INFO: renamed from: o.qcZ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C40682qcZ AhwBna;
        public final /* synthetic */ C40752qdq EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ C42801rdK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42801rdK c42801rdK, C40682qcZ c40682qcZ, C40752qdq c40752qdq, int i) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c42801rdK;
            this.AhwBna = c40682qcZ;
            this.EZpvd = c40752qdq;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.widget.FrameLayout root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC38465pZu interfaceC38465pZuOLrzqt = C38462pZr.OLrzqt(root);
                if (interfaceC38465pZuOLrzqt != null) {
                    interfaceC38465pZuOLrzqt.OLrzqt("futures", C41301qoI.KWHzl.OLrzqt(this.AhwBna.OLrzqt), this.EZpvd.values(), this.OLrzqt, "Market_Futures");
                }
            }
        }
    }
}
