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
import o.AbstractC55524xla;
import o.InterfaceC27808kEb;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34920nlZ extends AbstractC59533zio<AbstractC55524xla.Application, TaskDescription> {
    public final InterfaceC55467xkW copydefault;

    public C34920nlZ(@NotNull InterfaceC55467xkW interfaceC55467xkW) {
        Intrinsics.checkNotNullParameter(interfaceC55467xkW, "");
        this.copydefault = interfaceC55467xkW;
    }

    /* JADX INFO: renamed from: o.nlZ$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C42672rao copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C42672rao copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C42672rao c42672rao) {
            super(c42672rao.getRoot());
            Intrinsics.checkNotNullParameter(c42672rao, "");
            this.copydefault = c42672rao;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42672rao c42672raoKWHzl = C42672rao.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42672raoKWHzl, "");
        return new TaskDescription(c42672raoKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final TaskDescription taskDescription, @NotNull final AbstractC55524xla.Application application) {
        int i;
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(application, "");
        final C42672rao c42672raoCopydefault = taskDescription.copydefault();
        c42672raoCopydefault.KWHzl.setContentDescription("homeHotToken" + getPosition(taskDescription));
        AppCompatImageView appCompatImageView = c42672raoCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C46742tcs.AEQbTJ(appCompatImageView, application.valueOf());
        TickersData tickersDataCopydefault = this.copydefault.copydefault(application.OLrzqt());
        java.lang.String last = tickersDataCopydefault != null ? tickersDataCopydefault.getLast() : null;
        TickersData tickersDataCopydefault2 = this.copydefault.copydefault(application.KWHzl());
        java.lang.String last2 = tickersDataCopydefault2 != null ? tickersDataCopydefault2.getLast() : null;
        java.lang.String strAhwBna = application.AhwBna();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        C42989rgn c42989rgn = c42672raoCopydefault.EZpvd;
        java.lang.String strDjBIcL = application.djBIcL();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDjBIcL)) {
            strDjBIcL = application.OLrzqt();
        }
        c42989rgn.setData(C56390yDp.OLrzqt(strDjBIcL, application.EZpvd()), null, (interfaceC54581xNrOLrzqt == null || (strAEQbTJ = C41786qxQ.AEQbTJ(application.values(), last2, last, interfaceC54581xNrOLrzqt)) == null) ? "" : strAEQbTJ, pTB.formatLocalized$default(application.AhwBna(), null, 1, null), xTM.formatTickerPrice$default(xTM.AEQbTJ, strAhwBna, last2, last, interfaceC54581xNrOLrzqt, false, 16, null), (1920 & 32) != 0 ? null : null, (1920 & 64) != 0 ? null : null, (1920 & 128) != 0 ? false : false, (1920 & 256) != 0 ? java.lang.Boolean.FALSE : null, (1920 & 512) != 0 ? "" : null, (1920 & 1024) != 0 ? null : null);
        C55071xcy c55071xcy = c42672raoCopydefault.AEQbTJ;
        double dMulD$default = C33129mqd.mulD$default(application.DbNXlk(), 100, null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(dMulD$default), 0)) {
            i = 3;
        } else {
            i = C33129mqd.gEmmrt(java.lang.Double.valueOf(dMulD$default), 0) ? 4 : 5;
        }
        c55071xcy.setStyleWithTheme(i);
        c55071xcy.setText(pTF.KWHzl.AEQbTJ(C34984nmk.EZpvd(application.DbNXlk())));
        c42672raoCopydefault.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nmb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C34920nlZ.copydefault(c42672raoCopydefault, application, taskDescription, view);
            }
        });
        android.widget.LinearLayout root = c42672raoCopydefault.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, c42672raoCopydefault, taskDescription, application));
    }

    public static final boolean copydefault(C42672rao c42672rao, AbstractC55524xla.Application application, TaskDescription taskDescription, android.view.View view) {
        android.widget.LinearLayout root = c42672rao.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC41695qvf interfaceC41695qvfOLrzqt = C41693qvd.OLrzqt(root);
        if (interfaceC41695qvfOLrzqt == null) {
            return true;
        }
        android.widget.LinearLayout root2 = c42672rao.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        interfaceC41695qvfOLrzqt.OLrzqt(root2, new WatchListData((java.lang.String) null, (java.lang.String) null, application.copydefault(), "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 243, (DefaultConstructorMarker) null), taskDescription.getBindingAdapterPosition());
        return true;
    }

    /* JADX INFO: renamed from: o.nlZ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ AbstractC55524xla.Application EZpvd;
        public final /* synthetic */ TaskDescription KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C42672rao copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42672rao c42672rao, TaskDescription taskDescription, AbstractC55524xla.Application application) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c42672rao;
            this.KWHzl = taskDescription;
            this.EZpvd = application;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.widget.LinearLayout root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC27808kEb interfaceC27808kEbKWHzl = C27807kEa.KWHzl(root);
                if (interfaceC27808kEbKWHzl != null) {
                    InterfaceC27808kEb.StateListAnimator.trackRankingTradingPairClick$default(interfaceC27808kEbKWHzl, "hot", null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.KWHzl.getBindingAdapterPosition() + 1)), this.EZpvd.copydefault(), "spot", null, null, 98, null);
                }
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context context = this.copydefault.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, context, new MarketCoinInfo(this.EZpvd.copydefault(), "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null), null, null, "page_info", java.lang.Integer.valueOf(this.KWHzl.getBindingAdapterPosition()), null, null, "Home_Rank_Hot", null, null, 1740, null);
                }
            }
        }
    }
}
