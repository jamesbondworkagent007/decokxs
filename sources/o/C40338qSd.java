package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.market.ext.UpDownColor;
import kotlin.jvm.internal.Intrinsics;
import o.C43035rhg;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qSd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40338qSd extends AbstractC40510qYn<InterfaceC41643qug, C42850reG> {
    public final C41465qrN AEQbTJ;

    public C40338qSd(C41465qrN c41465qrN) {
        this.AEQbTJ = c41465qrN;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42850reG AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42850reG c42850reGCopydefault = C42850reG.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42850reGCopydefault, "");
        return c42850reGCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42850reG c42850reG, int i, @NotNull InterfaceC41643qug interfaceC41643qug) {
        Intrinsics.checkNotNullParameter(c42850reG, "");
        Intrinsics.checkNotNullParameter(interfaceC41643qug, "");
        if (interfaceC41643qug instanceof qLB) {
            OLrzqt(c42850reG, (qLB) interfaceC41643qug, i);
        }
        c42850reG.copydefault.setPriceLayoutVisible(true);
        C33545myV c33545myV = c42850reG.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c33545myV, "");
        c33545myV.setVisibility(8);
    }

    private final void OLrzqt(C42850reG c42850reG, qLB qlb, int i) {
        java.util.List list;
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        android.widget.ImageView imageView = c42850reG.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        if (this.AEQbTJ != null) {
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
            C41461qrJ c41461qrJ = (C41461qrJ) this.AEQbTJ.OLrzqt((java.lang.Object) qlb);
            java.lang.CharSequence charSequenceCopydefault = c41461qrJ.copydefault();
            java.lang.CharSequence charSequenceEZpvd = c41461qrJ.EZpvd();
            UpDownColor upDownColorOLrzqt = c41461qrJ.OLrzqt();
            java.lang.CharSequence charSequenceKWHzl = c41461qrJ.KWHzl();
            C40358qSx c40358qSx = c42850reG.copydefault;
            if (qlb.values().isPreMarketPair() && !Intrinsics.EZpvd((java.lang.Object) qlb.values().getInstType(), (java.lang.Object) "SWAP")) {
                strGEmmrt = C33069mpW.copydefault(C43035rhg.Application.EZpvd, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", C33129mqd.gEmmrt(charSequenceCopydefault))));
            } else {
                strGEmmrt = C33129mqd.gEmmrt(charSequenceCopydefault);
            }
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(strGEmmrt, "");
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.fXYAwm);
            if (charSequenceKWHzl == null || (strGEmmrt2 = C33129mqd.gEmmrt(charSequenceKWHzl)) == null) {
                strGEmmrt2 = "--";
            }
            java.lang.String str = strGEmmrt2;
            pTF ptf = pTF.KWHzl;
            if (charSequenceEZpvd == null) {
                charSequenceEZpvd = "0";
            }
            c40358qSx.setData(pairOLrzqt, list, strAYXKKw, str, C33129mqd.gEmmrt(ptf.KWHzl(charSequenceEZpvd)), upDownColorOLrzqt, false, false, false, false, (195584 & 1024) != 0 ? null : zEZpvd ? java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD) : null, (195584 & 2048) != 0 ? null : zEZpvd ? java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ) : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : null, (195584 & 131072) != 0 ? null : null);
        }
        c42850reG.OLrzqt.setEnabled(qlb.EZpvd());
        c42850reG.OLrzqt.setSelected(qlb.fJNWhG());
        ConstraintLayout root = c42850reG.getRoot();
        root.setOnClickListener(new Application(root, 200L, qlb, c42850reG, i));
    }

    /* JADX INFO: renamed from: o.qSd$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ qLB EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ C42850reG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, qLB qlb, C42850reG c42850reG, int i) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = qlb;
            this.copydefault = c42850reG;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.EZpvd.EZpvd()) {
                    ConstraintLayout root = this.copydefault.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    InterfaceC40288qQh interfaceC40288qQhOLrzqt = C40295qQo.OLrzqt(root);
                    if (interfaceC40288qQhOLrzqt != null) {
                        ConstraintLayout root2 = this.copydefault.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root2, "");
                        interfaceC40288qQhOLrzqt.copydefault(root2, this.EZpvd, this.OLrzqt);
                    }
                }
            }
        }
    }
}
