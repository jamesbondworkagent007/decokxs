package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.oKA;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nmg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34980nmg extends AbstractC59533zio<RankingHotCryptoVo, Activity> {

    /* JADX INFO: renamed from: o.nmg$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final C42672rao OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C42672rao copydefault() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C42672rao c42672rao) {
            super(c42672rao.getRoot());
            Intrinsics.checkNotNullParameter(c42672rao, "");
            this.OLrzqt = c42672rao;
        }
    }

    /* JADX INFO: renamed from: o.nmg$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ RankingHotCryptoVo AEQbTJ;
        public final /* synthetic */ Activity EZpvd;
        public final /* synthetic */ C42672rao KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42672rao c42672rao, RankingHotCryptoVo rankingHotCryptoVo, Activity activity) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c42672rao;
            this.AEQbTJ = rankingHotCryptoVo;
            this.EZpvd = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context context = this.KWHzl.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, context, new MarketCoinInfo(this.AEQbTJ.getInstId(), this.AEQbTJ.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null), null, null, "page_info", java.lang.Integer.valueOf(this.EZpvd.getBindingAdapterPosition()), null, null, "Home_Rank_Hot", null, null, 1740, null);
                }
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42672rao c42672raoKWHzl = C42672rao.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42672raoKWHzl, "");
        return new Activity(c42672raoKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final Activity activity, @NotNull final RankingHotCryptoVo rankingHotCryptoVo) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(rankingHotCryptoVo, "");
        final C42672rao c42672raoCopydefault = activity.copydefault();
        c42672raoCopydefault.KWHzl.setContentDescription("homeHotToken" + getPosition(activity));
        AppCompatImageView appCompatImageView = c42672raoCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C46742tcs.AEQbTJ(appCompatImageView, rankingHotCryptoVo.getIcon());
        java.lang.String strAEQbTJ2 = TaskDescription.AEQbTJ(C44585sZg.AEQbTJ(rankingHotCryptoVo.getInstId()));
        C42989rgn c42989rgn = c42672raoCopydefault.EZpvd;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(strAEQbTJ2, "");
        java.util.List listEZpvd = C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        c42989rgn.setData(pairOLrzqt, listEZpvd, (interfaceC54581xNrOLrzqt == null || (strAEQbTJ = C41786qxQ.AEQbTJ(rankingHotCryptoVo.getIndicate(), rankingHotCryptoVo.getQuoteCupTickerPrice(), rankingHotCryptoVo.getCupTickerPrice(), interfaceC54581xNrOLrzqt)) == null) ? "" : strAEQbTJ, rankingHotCryptoVo.getLastPrice().length() == 0 ? "--" : pTB.formatLocalized$default(rankingHotCryptoVo.getLastPrice(), null, 1, null), xTM.formatTickerPrice$default(xTM.AEQbTJ, rankingHotCryptoVo.getLastPrice(), rankingHotCryptoVo.getQuoteCupTickerPrice(), rankingHotCryptoVo.getCupTickerPrice(), pWO.KWHzl().OLrzqt(), false, 16, null), (1920 & 32) != 0 ? null : java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), (1920 & 64) != 0 ? null : java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ), (1920 & 128) != 0 ? false : false, (1920 & 256) != 0 ? java.lang.Boolean.FALSE : null, (1920 & 512) != 0 ? "" : null, (1920 & 1024) != 0 ? null : null);
        C55071xcy c55071xcy = c42672raoCopydefault.AEQbTJ;
        c55071xcy.setStyleWithTheme(rankingHotCryptoVo.getChangePercentColor());
        c55071xcy.setText(rankingHotCryptoVo.getChangePercent());
        c42672raoCopydefault.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nmh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C34980nmg.KWHzl(c42672raoCopydefault, rankingHotCryptoVo, activity, view);
            }
        });
        android.widget.LinearLayout root = c42672raoCopydefault.getRoot();
        root.setOnClickListener(new Application(root, 1000L, c42672raoCopydefault, rankingHotCryptoVo, activity));
    }

    public static final boolean KWHzl(C42672rao c42672rao, RankingHotCryptoVo rankingHotCryptoVo, Activity activity, android.view.View view) {
        android.widget.LinearLayout root = c42672rao.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC41695qvf interfaceC41695qvfOLrzqt = C41693qvd.OLrzqt(root);
        if (interfaceC41695qvfOLrzqt == null) {
            return true;
        }
        android.widget.LinearLayout root2 = c42672rao.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        interfaceC41695qvfOLrzqt.EZpvd(root2, rankingHotCryptoVo, activity.getBindingAdapterPosition());
        return true;
    }
}
