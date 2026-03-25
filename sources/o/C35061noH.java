package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC27808kEb;
import o.oKA;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35061noH extends AbstractC40510qYn<C35069noP, C42834rdr> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42834rdr AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42834rdr c42834rdrOLrzqt = C42834rdr.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42834rdrOLrzqt, "");
        return c42834rdrOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42834rdr c42834rdr, final int i, @NotNull final C35069noP c35069noP) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(c42834rdr, "");
        Intrinsics.checkNotNullParameter(c35069noP, "");
        java.lang.String strValueOf = c35069noP.valueOf();
        if (strValueOf != null) {
            AppCompatImageView appCompatImageView = c42834rdr.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C46742tcs.AEQbTJ(appCompatImageView, strValueOf);
        }
        java.lang.String strEZpvd = c35069noP.EZpvd();
        if (!(true ^ (strEZpvd == null || strEZpvd.length() == 0))) {
            strEZpvd = null;
        }
        if (strEZpvd == null) {
            strEZpvd = c35069noP.AhwBna();
        }
        java.lang.String strAYXKKw = c35069noP.AYXKKw();
        java.lang.String str = strAYXKKw == null ? "" : strAYXKKw;
        kotlin.Pair pairOLrzqt = Intrinsics.EZpvd((java.lang.Object) c35069noP.djBIcL(), (java.lang.Object) "SWAP") ? C56390yDp.OLrzqt(TaskDescription.AEQbTJ(C44585sZg.AEQbTJ(strEZpvd)), "") : C56390yDp.OLrzqt(c35069noP.copydefault(), c35069noP.gEmmrt());
        java.util.List listEZpvd = Intrinsics.EZpvd((java.lang.Object) c35069noP.djBIcL(), (java.lang.Object) "SWAP") ? C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ)) : yDY.AhwBna();
        C42989rgn c42989rgn = c42834rdr.AEQbTJ;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        c42989rgn.setData(pairOLrzqt, listEZpvd, (interfaceC54581xNrOLrzqt == null || (strAEQbTJ = C41786qxQ.AEQbTJ(c35069noP.DbNXlk(), c35069noP.fetchVPNInfo(), c35069noP.OLrzqt(), interfaceC54581xNrOLrzqt)) == null) ? "" : strAEQbTJ, str, xTM.formatTickerPrice$default(xTM.AEQbTJ, c35069noP.AYXKKw(), c35069noP.fetchVPNInfo(), c35069noP.OLrzqt(), pWO.KWHzl().OLrzqt(), false, 16, null), (1920 & 32) != 0 ? null : java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), (1920 & 64) != 0 ? null : java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ), (1920 & 128) != 0 ? false : false, (1920 & 256) != 0 ? java.lang.Boolean.FALSE : null, (1920 & 512) != 0 ? "" : null, (1920 & 1024) != 0 ? null : null);
        C55071xcy c55071xcy = c42834rdr.copydefault;
        java.lang.Integer numAEQbTJ = c35069noP.AEQbTJ();
        if (numAEQbTJ != null) {
            c55071xcy.setStyleWithTheme(numAEQbTJ.intValue());
        }
        c55071xcy.setText(c35069noP.KWHzl());
        c42834rdr.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.noI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C35061noH.AEQbTJ(c42834rdr, c35069noP, i, view);
            }
        });
        ConstraintLayout root = c42834rdr.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, c42834rdr, i, c35069noP));
    }

    public static final boolean AEQbTJ(C42834rdr c42834rdr, C35069noP c35069noP, int i, android.view.View view) {
        ConstraintLayout root = c42834rdr.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        InterfaceC41695qvf interfaceC41695qvfOLrzqt = C41693qvd.OLrzqt(root);
        if (interfaceC41695qvfOLrzqt == null) {
            return true;
        }
        ConstraintLayout root2 = c42834rdr.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        interfaceC41695qvfOLrzqt.copydefault(root2, c35069noP, i);
        return true;
    }

    /* JADX INFO: renamed from: o.noH$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ C35069noP KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C42834rdr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42834rdr c42834rdr, int i, C35069noP c35069noP) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c42834rdr;
            this.EZpvd = i;
            this.KWHzl = c35069noP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ConstraintLayout root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                InterfaceC27808kEb interfaceC27808kEbKWHzl = C27807kEa.KWHzl(root);
                if (interfaceC27808kEbKWHzl != null) {
                    InterfaceC27808kEb.StateListAnimator.trackRankingTradingPairClick$default(interfaceC27808kEbKWHzl, "stocks", null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.EZpvd + 1)), this.KWHzl.AhwBna(), this.KWHzl.djBIcL(), null, null, 98, null);
                }
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context context = this.copydefault.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, context, new MarketCoinInfo(this.KWHzl.AhwBna(), this.KWHzl.djBIcL(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null), null, null, "page_info", null, null, null, "Home_Rank_Hot", null, null, 1772, null);
                }
            }
        }
    }
}
