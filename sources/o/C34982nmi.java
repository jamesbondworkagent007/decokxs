package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC55526xlc;
import o.InterfaceC27808kEb;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nmi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34982nmi extends AbstractC59533zio<AbstractC55526xlc.ActionBar, ActionBar> {
    public final InterfaceC55467xkW EZpvd;

    /* JADX INFO: renamed from: o.nmi$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ AbstractC55526xlc.ActionBar AEQbTJ;
        public final /* synthetic */ C42672rao EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActionBar copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42672rao c42672rao, ActionBar actionBar, AbstractC55526xlc.ActionBar actionBar2) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c42672rao;
            this.copydefault = actionBar;
            this.AEQbTJ = actionBar2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.widget.LinearLayout root = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC27808kEb interfaceC27808kEbKWHzl = C27807kEa.KWHzl(root);
                if (interfaceC27808kEbKWHzl != null) {
                    InterfaceC27808kEb.StateListAnimator.trackRankingTradingPairClick$default(interfaceC27808kEbKWHzl, "gainers", null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.copydefault.getBindingAdapterPosition() + 1)), this.AEQbTJ.copydefault(), "spot", null, null, 98, null);
                }
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context context = this.EZpvd.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, context, new MarketCoinInfo(this.AEQbTJ.copydefault(), "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null), null, null, "page_info", java.lang.Integer.valueOf(this.copydefault.getBindingAdapterPosition()), null, null, "Home_Rank_Rise", null, null, 1740, null);
                }
            }
        }
    }

    public C34982nmi(@NotNull InterfaceC55467xkW interfaceC55467xkW) {
        Intrinsics.checkNotNullParameter(interfaceC55467xkW, "");
        this.EZpvd = interfaceC55467xkW;
    }

    /* JADX INFO: renamed from: o.nmi$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C42672rao copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C42672rao KWHzl() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C42672rao c42672rao) {
            super(c42672rao.getRoot());
            Intrinsics.checkNotNullParameter(c42672rao, "");
            this.copydefault = c42672rao;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42672rao c42672raoKWHzl = C42672rao.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42672raoKWHzl, "");
        return new ActionBar(c42672raoKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final ActionBar actionBar, @NotNull final AbstractC55526xlc.ActionBar actionBar2) {
        int i;
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(actionBar2, "");
        final C42672rao c42672raoKWHzl = actionBar.KWHzl();
        c42672raoKWHzl.KWHzl.setContentDescription("homeUpToken" + getPosition(actionBar));
        AppCompatImageView appCompatImageView = c42672raoKWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C46742tcs.AEQbTJ(appCompatImageView, actionBar2.djBIcL());
        TickersData tickersDataCopydefault = this.EZpvd.copydefault(actionBar2.OLrzqt());
        java.lang.String last = tickersDataCopydefault != null ? tickersDataCopydefault.getLast() : null;
        TickersData tickersDataCopydefault2 = this.EZpvd.copydefault(actionBar2.KWHzl());
        java.lang.String last2 = tickersDataCopydefault2 != null ? tickersDataCopydefault2.getLast() : null;
        java.lang.String strAhwBna = actionBar2.AhwBna();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        C42989rgn c42989rgn = c42672raoKWHzl.EZpvd;
        java.lang.String strValueOf = actionBar2.valueOf();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValueOf)) {
            strValueOf = actionBar2.OLrzqt();
        }
        c42989rgn.setData(C56390yDp.OLrzqt(strValueOf, actionBar2.EZpvd()), null, (interfaceC54581xNrOLrzqt == null || (strAEQbTJ = C41786qxQ.AEQbTJ(actionBar2.fetchVPNInfo(), last2, last, interfaceC54581xNrOLrzqt)) == null) ? "" : strAEQbTJ, pTB.formatLocalized$default(actionBar2.AhwBna(), null, 1, null), xTM.formatTickerPrice$default(xTM.AEQbTJ, strAhwBna, last2, last, interfaceC54581xNrOLrzqt, false, 16, null), (1920 & 32) != 0 ? null : null, (1920 & 64) != 0 ? null : null, (1920 & 128) != 0 ? false : false, (1920 & 256) != 0 ? java.lang.Boolean.FALSE : null, (1920 & 512) != 0 ? "" : null, (1920 & 1024) != 0 ? null : null);
        C55071xcy c55071xcy = c42672raoKWHzl.AEQbTJ;
        double dMulD$default = C33129mqd.mulD$default(actionBar2.AYXKKw(), 100, null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(dMulD$default), 0)) {
            i = 3;
        } else {
            i = C33129mqd.gEmmrt(java.lang.Double.valueOf(dMulD$default), 0) ? 4 : 5;
        }
        c55071xcy.setStyleWithTheme(i);
        c55071xcy.setText(pTF.KWHzl.AEQbTJ(C34984nmk.EZpvd(actionBar2.AYXKKw())));
        c42672raoKWHzl.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nme
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C34982nmi.KWHzl(c42672raoKWHzl, actionBar2, actionBar, view);
            }
        });
        android.widget.LinearLayout root = c42672raoKWHzl.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c42672raoKWHzl, actionBar, actionBar2));
    }

    public static final boolean KWHzl(C42672rao c42672rao, AbstractC55526xlc.ActionBar actionBar, ActionBar actionBar2, android.view.View view) {
        android.widget.LinearLayout root = c42672rao.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC41695qvf interfaceC41695qvfOLrzqt = C41693qvd.OLrzqt(root);
        if (interfaceC41695qvfOLrzqt == null) {
            return true;
        }
        android.widget.LinearLayout root2 = c42672rao.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        interfaceC41695qvfOLrzqt.OLrzqt(root2, new WatchListData((java.lang.String) null, (java.lang.String) null, actionBar.copydefault(), "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 243, (DefaultConstructorMarker) null), actionBar2.getBindingAdapterPosition());
        return true;
    }
}
