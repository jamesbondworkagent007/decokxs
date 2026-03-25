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

/* JADX INFO: renamed from: o.qdb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40737qdb extends AbstractC40515qYs<InterfaceC41638qub, C42801rdK> {
    public final C41216qmd AEQbTJ;
    public final C41465qrN OLrzqt;
    public final CategoryGroupVo copydefault;

    public C40737qdb(@NotNull CategoryGroupVo categoryGroupVo, @NotNull C41465qrN c41465qrN, @NotNull C41216qmd c41216qmd) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(c41465qrN, "");
        Intrinsics.checkNotNullParameter(c41216qmd, "");
        this.copydefault = categoryGroupVo;
        this.OLrzqt = c41465qrN;
        this.AEQbTJ = c41216qmd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42801rdK AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42801rdK c42801rdKKWHzl = C42801rdK.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42801rdKKWHzl, "");
        return c42801rdKKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull final C42801rdK c42801rdK, final int i, @NotNull final InterfaceC41638qub interfaceC41638qub) {
        java.lang.String strValueOf;
        java.util.List list;
        java.util.List listEZpvd;
        Intrinsics.checkNotNullParameter(c42801rdK, "");
        Intrinsics.checkNotNullParameter(interfaceC41638qub, "");
        C41461qrJ c41461qrJ = (C41461qrJ) this.OLrzqt.OLrzqt((java.lang.Object) interfaceC41638qub);
        java.lang.CharSequence charSequenceCopydefault = c41461qrJ.copydefault();
        java.lang.CharSequence charSequenceEZpvd = c41461qrJ.EZpvd();
        UpDownColor upDownColorOLrzqt = c41461qrJ.OLrzqt();
        java.lang.CharSequence charSequenceKWHzl = c41461qrJ.KWHzl();
        kotlin.Pair<java.lang.CharSequence, java.lang.Boolean> pairAEQbTJ = c41461qrJ.AEQbTJ();
        java.lang.CharSequence charSequenceAYXKKw = c41461qrJ.AYXKKw();
        if (interfaceC41638qub.values().isPreMarketPair() && Intrinsics.EZpvd((java.lang.Object) interfaceC41638qub.values().getInstType(), (java.lang.Object) "FUTURES")) {
            strValueOf = C33069mpW.copydefault(C35966oKh.TaskDescription.gEmmrt, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", java.lang.String.valueOf(charSequenceCopydefault))));
        } else {
            strValueOf = java.lang.String.valueOf(charSequenceCopydefault);
        }
        if (interfaceC41638qub.values() instanceof SwapInstrument) {
            if (interfaceC41638qub.values().isPreMarketPair()) {
                listEZpvd = yDY.gEmmrt(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ), C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz));
            } else if (interfaceC41638qub.values().isRebasePair()) {
                listEZpvd = yDY.gEmmrt(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ), C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCDKRTZD));
            } else {
                listEZpvd = C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ));
            }
            list = listEZpvd;
        } else {
            list = null;
        }
        java.lang.CharSequence charSequenceComponent1 = pairAEQbTJ.component1();
        java.lang.String str = pairAEQbTJ.component2().booleanValue() ? charSequenceComponent1 == null ? "--" : charSequenceComponent1 : null;
        Intrinsics.checkNotNullExpressionValue(c42801rdK.copydefault, "");
        c42801rdK.KWHzl.setPriceViewsVisible(!C41310qoR.AEQbTJ(r4, interfaceC41638qub.values().getCountDownInfo(), interfaceC41638qub.values().getInstId(), interfaceC41638qub.values().getInstType()));
        c42801rdK.KWHzl.setData(C56390yDp.OLrzqt(strValueOf, ""), list, copydefault(charSequenceAYXKKw, interfaceC41638qub), charSequenceKWHzl == null ? "--" : charSequenceKWHzl, str, interfaceC41638qub.OLrzqt(), charSequenceEZpvd, upDownColorOLrzqt, (3072 & 256) != 0 ? null : java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), (3072 & 512) != 0 ? null : java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ), (3072 & 1024) != 0 ? java.lang.Boolean.FALSE : null, (3072 & 2048) != 0 ? "" : null);
        android.widget.FrameLayout root = c42801rdK.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c42801rdK, this, interfaceC41638qub, i));
        c42801rdK.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.qdc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C40737qdb.KWHzl(c42801rdK, interfaceC41638qub, i, view);
            }
        });
    }

    public static final boolean KWHzl(C42801rdK c42801rdK, InterfaceC41638qub interfaceC41638qub, int i, android.view.View view) {
        android.widget.FrameLayout root = c42801rdK.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC40693qck interfaceC40693qckKWHzl = C40695qcm.KWHzl(root);
        if (interfaceC40693qckKWHzl == null) {
            return true;
        }
        Intrinsics.copydefault(view);
        InterfaceC40693qck.Application.onLongClickInstrument$default(interfaceC40693qckKWHzl, view, interfaceC41638qub.values(), i, false, 8, null);
        return true;
    }

    public final java.lang.CharSequence copydefault(java.lang.CharSequence charSequence, InterfaceC41638qub interfaceC41638qub) {
        java.lang.String strEZpvd;
        CategoryGroupVo categoryGroupVo = this.copydefault;
        CategoryGroupVo.TaskDescription taskDescription = CategoryGroupVo.Companion;
        if (Intrinsics.EZpvd(categoryGroupVo, taskDescription.gEmmrt())) {
            BizInstrument bizInstrumentValues = interfaceC41638qub.values();
            SwapInstrument swapInstrument = bizInstrumentValues instanceof SwapInstrument ? (SwapInstrument) bizInstrumentValues : null;
            return pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(swapInstrument != null ? swapInstrument.getListTime() : null)), null, 1, null);
        }
        if (Intrinsics.EZpvd(categoryGroupVo, taskDescription.copydefault())) {
            C40752qdq c40752qdq = interfaceC41638qub instanceof C40752qdq ? (C40752qdq) interfaceC41638qub : null;
            java.lang.String str = (c40752qdq == null || (strEZpvd = c40752qdq.EZpvd()) == null) ? null : (java.lang.String) this.AEQbTJ.KWHzl((java.lang.Object) strEZpvd);
            if (str != null) {
                return str;
            }
        } else if (charSequence != null) {
            return charSequence;
        }
        return "--";
    }

    /* JADX INFO: renamed from: o.qdb$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C40737qdb AhwBna;
        public final /* synthetic */ InterfaceC41638qub EZpvd;
        public final /* synthetic */ C42801rdK KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42801rdK c42801rdK, C40737qdb c40737qdb, InterfaceC41638qub interfaceC41638qub, int i) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c42801rdK;
            this.AhwBna = c40737qdb;
            this.EZpvd = interfaceC41638qub;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.widget.FrameLayout root = this.KWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC38465pZu interfaceC38465pZuOLrzqt = C38462pZr.OLrzqt(root);
                if (interfaceC38465pZuOLrzqt != null) {
                    interfaceC38465pZuOLrzqt.OLrzqt("futures", C41301qoI.KWHzl.OLrzqt(this.AhwBna.copydefault), this.EZpvd.values(), this.OLrzqt, "Market_Futures");
                }
            }
        }
    }
}
