package o;

import android.view.View;
import com.bumptech.glide.Glide;
import com.okinc.kline.api.bean.MarketCoinInfo;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wGs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52311wGs extends AbstractC59533zio<C52312wGt, C52309wGq> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C52309wGq onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C48453uRz c48453uRzEZpvd = C48453uRz.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c48453uRzEZpvd, "");
        return new C52309wGq(c48453uRzEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52309wGq c52309wGq, @NotNull C52312wGt c52312wGt) {
        Intrinsics.checkNotNullParameter(c52309wGq, "");
        Intrinsics.checkNotNullParameter(c52312wGt, "");
        android.view.View view = c52309wGq.OLrzqt().ejfBZ;
        Intrinsics.checkNotNullExpressionValue(view, "");
        int layoutPosition = c52309wGq.getLayoutPosition();
        java.util.List<?> items = getAdapter().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        view.setVisibility(layoutPosition != yDY.AuCTel(items) ? 0 : 8);
        wYD wyd = c52309wGq.OLrzqt().EZpvd;
        Intrinsics.checkNotNullExpressionValue(wyd, "");
        wyd.setVisibility(c52312wGt.djBIcL() ? 0 : 8);
        wYD wyd2 = c52309wGq.OLrzqt().EZpvd;
        wyd2.setOnClickListener(new TaskDescription(wyd2, 1000L, c52312wGt, c52309wGq));
        java.lang.String strDbNXlk = c52312wGt.DbNXlk();
        if (strDbNXlk != null) {
            Glide.KWHzl(c52309wGq.OLrzqt().djBIcL).EZpvd(strDbNXlk).EZpvd(c52309wGq.OLrzqt().djBIcL);
        }
        C55320xhi c55320xhi = c52309wGq.OLrzqt().copydefault;
        Intrinsics.checkNotNullExpressionValue(c55320xhi, "");
        c55320xhi.setVisibility(c52312wGt.djBIcL() ? 0 : 8);
        c52309wGq.OLrzqt().copydefault.setText(c52312wGt.AEQbTJ());
        c52309wGq.OLrzqt().KWHzl.setText(c52312wGt.isConnected());
        c52309wGq.OLrzqt().fIwbmz.setText(c52312wGt.valueOf());
        c52309wGq.OLrzqt().DbNXlk.setText(c52312wGt.copydefault());
        c52309wGq.OLrzqt().AuCTel.setText(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncherresultContract2) + " (" + c52312wGt.gEmmrt() + ")");
        c52309wGq.OLrzqt().AkhnZx.setText(C33070mpX.AYXKKw(C55688xof.Application.setBufferedPosition) + " (" + c52312wGt.AYXKKw() + ")");
        c52309wGq.OLrzqt().fJNWhG.setText(c52312wGt.values());
        c52309wGq.OLrzqt().fJNWhG.setTextColor(c52312wGt.EZpvd());
        c52309wGq.OLrzqt().values.setText(c52312wGt.OLrzqt());
        c52309wGq.OLrzqt().AYXKKw.setText(pTB.KWHzl(xMR.copydefault.OLrzqt((java.lang.Object) c52312wGt.AhwBna()), 0, RoundingMode.DOWN));
    }

    /* JADX INFO: renamed from: o.wGs$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52312wGt OLrzqt;
        public final /* synthetic */ C52309wGq copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52312wGt c52312wGt, C52309wGq c52309wGq) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c52312wGt;
            this.copydefault = c52309wGq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                MarketCoinInfo marketCoinInfo = new MarketCoinInfo(this.OLrzqt.KWHzl(), "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context context = this.copydefault.OLrzqt().getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, null, null, java.lang.Boolean.FALSE, null, null, null, null, 1980, null);
                }
            }
        }
    }
}
