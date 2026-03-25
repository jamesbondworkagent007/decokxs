package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.bean.CoinQuote;
import kotlin.jvm.internal.Intrinsics;
import o.C43035rhg;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qQf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40286qQf extends AbstractC40510qYn<InterfaceC41643qug, C42850reG> {
    public final int AEQbTJ;
    public final C41465qrN OLrzqt;

    public C40286qQf(C41465qrN c41465qrN, @androidx.annotation.DrawableRes int i) {
        this.OLrzqt = c41465qrN;
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42850reG AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42850reG c42850reGCopydefault = C42850reG.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42850reGCopydefault, "");
        int i = this.AEQbTJ;
        if (i == 0) {
            c42850reGCopydefault.OLrzqt.setButtonDrawable((android.graphics.drawable.Drawable) null);
            C33545myV c33545myV = c42850reGCopydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c33545myV, "");
            c33545myV.setVisibility(8);
        } else {
            c42850reGCopydefault.OLrzqt.setButtonDrawable(i);
            C33545myV c33545myV2 = c42850reGCopydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c33545myV2, "");
            c33545myV2.setVisibility(0);
        }
        return c42850reGCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull C42850reG c42850reG, int i, @NotNull InterfaceC41643qug interfaceC41643qug) {
        Intrinsics.checkNotNullParameter(c42850reG, "");
        Intrinsics.checkNotNullParameter(interfaceC41643qug, "");
        if (interfaceC41643qug instanceof qRT) {
            copydefault(c42850reG, (qRT) interfaceC41643qug, i);
        } else if (interfaceC41643qug instanceof qLB) {
            copydefault(c42850reG, (qLB) interfaceC41643qug, i);
        } else if (interfaceC41643qug instanceof qWC) {
            OLrzqt(c42850reG, (qWC) interfaceC41643qug, i);
        }
        c42850reG.copydefault.setPriceLayoutVisible(false);
    }

    public final void copydefault(C42850reG c42850reG, qRT qrt, int i) {
        android.widget.ImageView imageView = c42850reG.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        java.lang.String strCopydefault = qrt.copydefault();
        C46742tcs.AEQbTJ(imageView, strCopydefault != null ? strCopydefault : "");
        c42850reG.copydefault.setData(C56390yDp.OLrzqt(qrt.AYXKKw(), qrt.OLrzqt()), (qrt.fetchVPNInfo() && C55608xnE.EZpvd()) ? C56402yEa.EZpvd(qrt.AEQbTJ()) : null, "", "--", "--", null, true, false, false, false, (195584 & 1024) != 0 ? null : null, (195584 & 2048) != 0 ? null : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : null, (195584 & 131072) != 0 ? null : null);
        c42850reG.OLrzqt.setEnabled(qrt.isConnected());
        c42850reG.OLrzqt.setSelected(qrt.fARcdN());
        ConstraintLayout root = c42850reG.getRoot();
        root.setOnClickListener(new ActionBar(root, 200L, qrt, c42850reG, i));
    }

    public final void copydefault(C42850reG c42850reG, qLB qlb, int i) {
        java.util.List list;
        java.lang.String strGEmmrt;
        android.widget.ImageView imageView = c42850reG.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        java.lang.String strOLrzqt = qlb.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        C46742tcs.AEQbTJ(imageView, strOLrzqt);
        if (this.OLrzqt != null) {
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) qlb.values().getInstType(), (java.lang.Object) "SWAP");
            if (zEZpvd) {
                java.util.List listAhwBna = yDY.AhwBna(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ));
                if (qlb.values().isPreMarketPair()) {
                    listAhwBna.add(C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz));
                }
                list = listAhwBna;
            } else {
                list = null;
            }
            java.lang.CharSequence charSequenceCopydefault = ((C41461qrJ) this.OLrzqt.OLrzqt((java.lang.Object) qlb)).copydefault();
            C40358qSx c40358qSx = c42850reG.copydefault;
            if (qlb.values().isPreMarketPair() && !Intrinsics.EZpvd((java.lang.Object) qlb.values().getInstType(), (java.lang.Object) "SWAP")) {
                strGEmmrt = C33069mpW.copydefault(C43035rhg.Application.EZpvd, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", C33129mqd.gEmmrt(charSequenceCopydefault))));
            } else {
                strGEmmrt = C33129mqd.gEmmrt(charSequenceCopydefault);
            }
            c40358qSx.setData(C56390yDp.OLrzqt(strGEmmrt, ""), list, "", "--", "--", null, true, false, false, false, (195584 & 1024) != 0 ? null : zEZpvd ? java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD) : null, (195584 & 2048) != 0 ? null : zEZpvd ? java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ) : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : null, (195584 & 131072) != 0 ? null : null);
        }
        c42850reG.OLrzqt.setEnabled(qlb.EZpvd());
        c42850reG.OLrzqt.setSelected(qlb.fJNWhG());
        ConstraintLayout root = c42850reG.getRoot();
        root.setOnClickListener(new Activity(root, 200L, qlb, c42850reG, i));
    }

    /* JADX INFO: renamed from: o.qQf$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ C42850reG KWHzl;
        public final /* synthetic */ qRT OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, qRT qrt, C42850reG c42850reG, int i) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = qrt;
            this.KWHzl = c42850reG;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.OLrzqt.isConnected()) {
                    ConstraintLayout root = this.KWHzl.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    InterfaceC40288qQh interfaceC40288qQhOLrzqt = C40295qQo.OLrzqt(root);
                    if (interfaceC40288qQhOLrzqt != null) {
                        ConstraintLayout root2 = this.KWHzl.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root2, "");
                        interfaceC40288qQhOLrzqt.copydefault(root2, this.OLrzqt, this.EZpvd);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.qQf$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ qLB AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ C42850reG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, qLB qlb, C42850reG c42850reG, int i) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = qlb;
            this.copydefault = c42850reG;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.AEQbTJ.EZpvd()) {
                    ConstraintLayout root = this.copydefault.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    InterfaceC40288qQh interfaceC40288qQhOLrzqt = C40295qQo.OLrzqt(root);
                    if (interfaceC40288qQhOLrzqt != null) {
                        ConstraintLayout root2 = this.copydefault.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root2, "");
                        interfaceC40288qQhOLrzqt.copydefault(root2, this.AEQbTJ, this.OLrzqt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.qQf$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C42850reG AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ qWC OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, qWC qwc, C42850reG c42850reG, int i) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = qwc;
            this.AEQbTJ = c42850reG;
            this.copydefault = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.OLrzqt.isConnected()) {
                    ConstraintLayout root = this.AEQbTJ.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    InterfaceC40288qQh interfaceC40288qQhOLrzqt = C40295qQo.OLrzqt(root);
                    if (interfaceC40288qQhOLrzqt != null) {
                        ConstraintLayout root2 = this.AEQbTJ.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root2, "");
                        interfaceC40288qQhOLrzqt.copydefault(root2, this.OLrzqt, this.copydefault);
                    }
                }
            }
        }
    }

    public final void OLrzqt(C42850reG c42850reG, qWC qwc, int i) {
        java.lang.String str;
        java.util.List listEZpvd;
        CoinQuote coinQuoteKWHzl = qwc.KWHzl();
        android.widget.ImageView imageView = c42850reG.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        java.lang.String icon = coinQuoteKWHzl.getIcon();
        if (icon == null) {
            icon = "";
        }
        C46742tcs.AEQbTJ(imageView, icon);
        java.lang.String instType = coinQuoteKWHzl.getInstType();
        int iHashCode = instType.hashCode();
        if (iHashCode != 2552066) {
            if (iHashCode != 2558355) {
                if (iHashCode == 214415088 && instType.equals("FUTURES")) {
                    c42850reG.copydefault.setData(C56390yDp.OLrzqt(C40381qTt.copydefault.copydefault(coinQuoteKWHzl.getInstId(), coinQuoteKWHzl.getInstType(), true, true, coinQuoteKWHzl.isPreMarket()), ""), null, "", "--", "--", null, true, false, false, false, (195584 & 1024) != 0 ? null : null, (195584 & 2048) != 0 ? null : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : null, (195584 & 131072) != 0 ? null : null);
                }
            } else if (instType.equals("SWAP")) {
                C40358qSx c40358qSx = c42850reG.copydefault;
                kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, coinQuoteKWHzl.getInstId(), coinQuoteKWHzl.getInstType(), false, false, false, 12, null), "");
                if (coinQuoteKWHzl.isPreMarket()) {
                    listEZpvd = yDY.gEmmrt(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ), C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz));
                } else {
                    listEZpvd = C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ));
                }
                c40358qSx.setData(pairOLrzqt, listEZpvd, "", "--", "--", null, true, false, false, false, (195584 & 1024) != 0 ? null : java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), (195584 & 2048) != 0 ? null : java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ), (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : null, (195584 & 131072) != 0 ? null : null);
            }
        } else if (instType.equals("SPOT")) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) coinQuoteKWHzl.getLeverageRatio()) && C55608xnE.EZpvd()) {
                str = coinQuoteKWHzl.getLeverageRatio() + "x";
            } else {
                str = null;
            }
            c42850reG.copydefault.setData(C56390yDp.OLrzqt(coinQuoteKWHzl.getBaseCurrency(), coinQuoteKWHzl.getQuoteCurrency()), str != null ? C56402yEa.EZpvd(str) : null, "", "--", "--", null, true, false, false, false, (195584 & 1024) != 0 ? null : null, (195584 & 2048) != 0 ? null : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : null, (195584 & 131072) != 0 ? null : null);
        }
        c42850reG.OLrzqt.setEnabled(qwc.isConnected());
        c42850reG.OLrzqt.setSelected(qwc.values());
        ConstraintLayout root = c42850reG.getRoot();
        root.setOnClickListener(new TaskDescription(root, 200L, qwc, c42850reG, i));
    }
}
